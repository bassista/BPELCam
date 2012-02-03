package wb.bpelcam;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;


import wb.bpelcam.processors.OrderContentsProcessor;
import wb.bpelcam.processors.PrintHeaderProcessor;

import com.innoq.bpel.OrderInformation1;
import com.innoq.bpel.OrderInformation2;



public class WsRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		DataFormat jaxb = new JaxbDataFormat("com.innoq.bpel");
		
			from("cxf:bean:orderEndpoint")
				.process(new PrintHeaderProcessor())
				.choice()
					.when(header("operationname").isEqualTo("order1"))
						.to("seda:handleV1Orders")
						.transform(constant("OK"))
					.when(header("operationname").isEqualTo("order2"))
						.to("seda:handleV2Orders")
						.transform(constant("OK"))
					.otherwise()
						.setBody(constant("Wrong Version!"));
			
			from("seda:handleV1Orders")
				.convertBodyTo(OrderInformation1.class)
				.process(new OrderContentsProcessor())
				.marshal(jaxb)
				.setHeader("CamelFileName", constant("Order1"))
				.to("file://target/output1");
		
			from("seda:handleV2Orders")
				.convertBodyTo(OrderInformation2.class)
				.process(new OrderContentsProcessor())
				.marshal(jaxb)
				.setHeader("CamelFileName", constant("Order2"))
				.to("file://target/output1");

		
	}

}
