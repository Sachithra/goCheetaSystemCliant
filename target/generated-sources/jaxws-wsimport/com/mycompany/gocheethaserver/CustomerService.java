
package com.mycompany.gocheethaserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerService", targetNamespace = "http://gocheethaserver.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns com.mycompany.gocheethaserver.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginCustomer", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.LoginCustomer")
    @ResponseWrapper(localName = "loginCustomerResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.LoginCustomerResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/CustomerService/loginCustomerRequest", output = "http://gocheethaserver.mycompany.com/CustomerService/loginCustomerResponse")
    public Customer loginCustomer(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param type
     * @return
     *     returns com.mycompany.gocheethaserver.BookingDetailss
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVehicle", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.GetVehicle")
    @ResponseWrapper(localName = "getVehicleResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.GetVehicleResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/CustomerService/getVehicleRequest", output = "http://gocheethaserver.mycompany.com/CustomerService/getVehicleResponse")
    public BookingDetailss getVehicle(
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param customer
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerCustomer", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.RegisterCustomer")
    @ResponseWrapper(localName = "registerCustomerResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.RegisterCustomerResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/CustomerService/registerCustomerRequest", output = "http://gocheethaserver.mycompany.com/CustomerService/registerCustomerResponse")
    public boolean registerCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        Customer customer);

    /**
     * 
     * @param place
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cuBookings", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.CuBookings")
    @ResponseWrapper(localName = "cuBookingsResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.CuBookingsResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/CustomerService/cuBookingsRequest", output = "http://gocheethaserver.mycompany.com/CustomerService/cuBookingsResponse")
    public boolean cuBookings(
        @WebParam(name = "place", targetNamespace = "")
        Placebookings place);

    /**
     * 
     * @param driver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "feedBackes", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.FeedBackes")
    @ResponseWrapper(localName = "feedBackesResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.FeedBackesResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/CustomerService/feedBackesRequest", output = "http://gocheethaserver.mycompany.com/CustomerService/feedBackesResponse")
    public boolean feedBackes(
        @WebParam(name = "driver", targetNamespace = "")
        Drivers driver);

}
