package com.majesco.digitalio.imageright.service;

import com.imageright.imageright_irweb.IRWebServiceSoap;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

/**
 * @author Biplab Nayak [Created On 3/5/2016].
 */

@Service
public class ImageRightService {

    private static int count;

    @Autowired
    IRWebServiceSoap irWebServiceSoap;

    @HystrixCommand/*(commandProperties = {

    },
    threadPoolProperties = {

    })*/
    public String getVersion() throws RemoteException {
        return irWebServiceSoap.version();
    }

    @HystrixCommand
    public void forTesting() throws Exception{
        System.out.println("=====================" + count ++);
        throw new Exception();
    }
}
