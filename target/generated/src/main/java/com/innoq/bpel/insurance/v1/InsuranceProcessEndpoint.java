package com.innoq.bpel.insurance.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.9
 * 2012-02-24T23:59:46.963+01:00
 * Generated source version: 2.3.9
 * 
 */
@WebService(targetNamespace = "http://bpel.innoq.com/insurance/v1", name = "InsuranceProcessEndpoint")
@XmlSeeAlso({com.innoq.bpel.insurance.v1.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InsuranceProcessEndpoint {

    @WebResult(name = "processConfirmation", targetNamespace = "http://bpel.innoq.com/insurance/v1/types", partName = "resultCode")
    @WebMethod(action = "http://bpel.innoq.com/CarInsurance")
    public com.innoq.bpel.insurance.v1.types.ProcessConfirmation order(
        @WebParam(partName = "parameters", name = "CarInsuranceFindProcess", targetNamespace = "http://bpel.innoq.com/insurance/v1/types")
        com.innoq.bpel.insurance.v1.types.CarInsuranceFindProcess parameters
    );
}
