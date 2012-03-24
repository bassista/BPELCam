package com.innoq.bpel.insurance.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.9
 * 2012-03-22T23:47:26.998+01:00
 * Generated source version: 2.3.9
 * 
 */
@WebServiceClient(name = "InsuranceEndpointService", 
                  wsdlLocation = "file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/insuranceV1.wsdl",
                  targetNamespace = "http://bpel.innoq.com/insurance/v1") 
public class InsuranceEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://bpel.innoq.com/insurance/v1", "InsuranceEndpointService");
    public final static QName InsuranceService = new QName("http://bpel.innoq.com/insurance/v1", "InsuranceService");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/insuranceV1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InsuranceEndpointService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/insuranceV1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InsuranceEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InsuranceEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsuranceEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns InsuranceProcessEndpoint
     */
    @WebEndpoint(name = "InsuranceService")
    public InsuranceProcessEndpoint getInsuranceService() {
        return super.getPort(InsuranceService, InsuranceProcessEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsuranceProcessEndpoint
     */
    @WebEndpoint(name = "InsuranceService")
    public InsuranceProcessEndpoint getInsuranceService(WebServiceFeature... features) {
        return super.getPort(InsuranceService, InsuranceProcessEndpoint.class, features);
    }

}
