package com.majesco.digitalio.imageright;

import com.majesco.digitalio.imageright.service.ImageRightService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Biplab Nayak [Created On 3/6/2016].
 */
public class HystrixCBTest extends ImagerightAdapterApplicationTests {

    @Autowired
    ImageRightService imageRightService;

    @Test
    public void testImagerightCB() throws InterruptedException {

        // Warm up period
        try {
            imageRightService.forTesting();
        } catch (Exception e) {
            //e.printStackTrace();
        }

        // First Attempt
        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        imageRightService.forTesting();
                    } catch (Exception e) {
                        //e.printStackTrace();
                    }
                }
            }).start();
        }

        Thread.sleep(10000); // Wait time for reattempt

        System.out.println("====================After Circuit is Closed Again==================");

        for (int i = 0; i < 100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        imageRightService.forTesting();
                    } catch (Exception e) {
                        //e.printStackTrace();
                    }
                }
            }).start();
        }

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {

        }
    }
}
