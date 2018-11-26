package com.example.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface TestService {

    @WebMethod
    String hiWebService(@WebParam(name = "hi") String s);
}
