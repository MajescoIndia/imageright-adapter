package com.majesco.digitalio.imageright.config;

import com.imageright.imageright_irweb.IRWebService;
import com.imageright.imageright_irweb.IRWebServiceLocator;
import com.imageright.imageright_irweb.IRWebServiceSoap;
import com.imageright.imageright_irweb.IRWebServiceSoapImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Biplab Nayak [Created On 3/5/2016].
 */
@Configuration
public class BaseConfig {

    @Value("${imageright.service.location}")
    private String irServceLocation;

    @Bean
    public IRWebServiceSoap ImageRightSoapEndpoint() throws ServiceException, MalformedURLException {
        //QName irQName = new QName("http://imageright.com/imageright.irweb", "IRWebServiceSoap12");
        IRWebServiceLocator irWebService = new IRWebServiceLocator();
        //irWebService.setEndpointAddress(irQName, irServceLocation);
        //IRWebServiceSoapImpl irWebServiceSoap = irWebService.getIRWebServiceSoap();
        IRWebServiceSoap irWebServiceSoap = irWebService.getIRWebServiceSoap(new URL(irServceLocation));
        return irWebServiceSoap;
    }
}
