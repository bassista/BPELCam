package org.example.internal;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.9
 * 2012-03-22T23:47:27.726+01:00
 * Generated source version: 2.3.9
 * 
 */
@WebServiceClient(name = "Process", 
                  wsdlLocation = "file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/internal.wsdl",
                  targetNamespace = "http://www.example.org/internal/") 
public class Process_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/internal/", "Process");
    public final static QName ProcessSOAP = new QName("http://www.example.org/internal/", "processSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/internal.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Process_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/martinh/DEV/CAMELSTUFF/workspaces/camelws2/bpelcam/src/main/resources/wsdl/internal.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Process_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Process_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Process_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Process
     */
    @WebEndpoint(name = "processSOAP")
    public Process getProcessSOAP() {
        return super.getPort(ProcessSOAP, Process.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Process
     */
    @WebEndpoint(name = "processSOAP")
    public Process getProcessSOAP(WebServiceFeature... features) {
        return super.getPort(ProcessSOAP, Process.class, features);
    }

}
