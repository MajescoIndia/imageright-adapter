package com.majesco.digitalio.imageright;

import com.imageright.imageright_irweb.IRWebService;
import com.imageright.imageright_irweb.IRWebServiceLocator;
import com.imageright.imageright_irweb.IRWebServiceSoap;
import org.junit.Test;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * @author Biplab Nayak [Created On 3/4/2016].
 */
public class IRService {

    @Test
    public void testIRServiiceVersion() throws ServiceException, RemoteException {
        IRWebService irWebService = new IRWebServiceLocator();
        IRWebServiceSoap irWebServiceSoap = irWebService.getIRWebServiceSoap();
        System.out.println(irWebServiceSoap.version());
    }
}
