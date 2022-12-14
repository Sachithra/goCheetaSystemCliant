
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
@WebService(name = "AdminService", targetNamespace = "http://gocheethaserver.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdminService {


    /**
     * 
     * @param driver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerDriver", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.RegisterDriver")
    @ResponseWrapper(localName = "registerDriverResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.RegisterDriverResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/registerDriverRequest", output = "http://gocheethaserver.mycompany.com/AdminService/registerDriverResponse")
    public boolean registerDriver(
        @WebParam(name = "driver", targetNamespace = "")
        Drivers driver);

    /**
     * 
     * @param driver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVehicle", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.UpdateVehicle")
    @ResponseWrapper(localName = "updateVehicleResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.UpdateVehicleResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/updateVehicleRequest", output = "http://gocheethaserver.mycompany.com/AdminService/updateVehicleResponse")
    public boolean updateVehicle(
        @WebParam(name = "driver", targetNamespace = "")
        Vehicle driver);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteVehicle", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.DeleteVehicle")
    @ResponseWrapper(localName = "deleteVehicleResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.DeleteVehicleResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/deleteVehicleRequest", output = "http://gocheethaserver.mycompany.com/AdminService/deleteVehicleResponse")
    public boolean deleteVehicle(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns com.mycompany.gocheethaserver.Admin
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginAdmin", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.LoginAdmin")
    @ResponseWrapper(localName = "loginAdminResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.LoginAdminResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/loginAdminRequest", output = "http://gocheethaserver.mycompany.com/AdminService/loginAdminResponse")
    public Admin loginAdmin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param driver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addVehicle", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.AddVehicle")
    @ResponseWrapper(localName = "addVehicleResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.AddVehicleResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/addVehicleRequest", output = "http://gocheethaserver.mycompany.com/AdminService/addVehicleResponse")
    public boolean addVehicle(
        @WebParam(name = "driver", targetNamespace = "")
        Vehicle driver);

    /**
     * 
     * @param driver
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDriver", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.UpdateDriver")
    @ResponseWrapper(localName = "updateDriverResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.UpdateDriverResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/updateDriverRequest", output = "http://gocheethaserver.mycompany.com/AdminService/updateDriverResponse")
    public boolean updateDriver(
        @WebParam(name = "driver", targetNamespace = "")
        Drivers driver);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDriver", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.DeleteDriver")
    @ResponseWrapper(localName = "deleteDriverResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.DeleteDriverResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/deleteDriverRequest", output = "http://gocheethaserver.mycompany.com/AdminService/deleteDriverResponse")
    public boolean deleteDriver(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param branch
     * @return
     *     returns com.mycompany.gocheethaserver.SalesDetails
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSales", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.GetSales")
    @ResponseWrapper(localName = "getSalesResponse", targetNamespace = "http://gocheethaserver.mycompany.com/", className = "com.mycompany.gocheethaserver.GetSalesResponse")
    @Action(input = "http://gocheethaserver.mycompany.com/AdminService/getSalesRequest", output = "http://gocheethaserver.mycompany.com/AdminService/getSalesResponse")
    public SalesDetails getSales(
        @WebParam(name = "branch", targetNamespace = "")
        String branch);

}
