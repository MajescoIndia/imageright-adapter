package com.majesco.digitalio.imageright.controller;

import com.majesco.digitalio.imageright.service.ImageRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.RemoteException;

/**
 * @author Biplab Nayak [Created On 3/5/2016].
 */

@RestController
@RequestMapping("/imageright")
public class ImageRightController {

    @Autowired
    ImageRightService imageRightService;

    @RequestMapping(method = RequestMethod.GET, value = "/version")
    public ResponseEntity<String> getImageRightVersion() {
        try {
            String version = imageRightService.getVersion();
            return ResponseEntity
                    .ok()
                    .body(version);
        } catch (RemoteException e) {
            return ResponseEntity
                    .status(HttpStatus.SERVICE_UNAVAILABLE)
                    .body("Something went wrong calling Image right service.");
        }
    }
}
