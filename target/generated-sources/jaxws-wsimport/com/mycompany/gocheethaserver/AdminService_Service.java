
package com.mycompany.gocheethaserver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AdminService", targetNamespace = "http://gocheethaserver.mycompany.com/", wsdlLocation = "http://localhost:25977/GoCheethaServer/AdminService?wsdl")
public class AdminService_Service
    extends Service
{

    private final static URL ADMINSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADMINSERVICE_EXCEPTION;
    private final static QName ADMINSERVICE_QNAME = new QName("http://gocheethaserver.mycompany.com/", "AdminService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:25977/GoCheethaServer/AdminService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINSERVICE_WSDL_LOCATION = url;
        ADMINSERVICE_EXCEPTION = e;
    }

    public AdminService_Service() {
        super(__getWsdlLocation(), ADMINSERVICE_QNAME);
    }

    public AdminService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINSERVICE_QNAME, features);
    }

    public AdminService_Service(URL wsdlLocation) {
        super(wsdlLocation, ADMINSERVICE_QNAME);
    }

    public AdminService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINSERVICE_QNAME, features);
    }

    public AdminService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdminService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AdminService
     */
    @WebEndpoint(name = "AdminServicePort")
    public AdminService getAdminServicePort() {
        return super.getPort(new QName("http://gocheethaserver.mycompany.com/", "AdminServicePort"), AdminService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdminService
     */
    @WebEndpoint(name = "AdminServicePort")
    public AdminService getAdminServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://gocheethaserver.mycompany.com/", "AdminServicePort"), AdminService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINSERVICE_EXCEPTION!= null) {
            throw ADMINSERVICE_EXCEPTION;
        }
        return ADMINSERVICE_WSDL_LOCATION;
    }

}
