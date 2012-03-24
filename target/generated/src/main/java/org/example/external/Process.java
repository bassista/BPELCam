package org.example.external;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.9
 * 2012-03-22T23:47:26.741+01:00
 * Generated source version: 2.3.9
 * 
 */
@WebService(targetNamespace = "http://www.example.org/external/", name = "Process")
@XmlSeeAlso({ObjectFactory.class})
public interface Process {

    @RequestWrapper(localName = "sendSignedDocument", targetNamespace = "http://www.example.org/external/", className = "org.example.external.SendSignedDocument")
    @WebMethod(action = "http://www.example.org/external/sendSignedDocument")
    @ResponseWrapper(localName = "sendSignedDocumentResponse", targetNamespace = "http://www.example.org/external/", className = "org.example.external.SendSignedDocumentResponse")
    public void sendSignedDocument(
        @WebParam(name = "processId", targetNamespace = "")
        java.lang.String processId,
        @WebParam(name = "pdf", targetNamespace = "")
        byte[] pdf
    );
}
