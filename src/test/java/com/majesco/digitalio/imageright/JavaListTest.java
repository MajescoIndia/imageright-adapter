package com.majesco.digitalio.imageright;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Biplab Nayak [Created On 3/5/2016].
 */
public class JavaListTest {

    @Test
    public void sublistTest() {
        List<String> list = Arrays.asList("0","1","2","3","4","5","6","7","8","9","10");

        List<String> splitted = list.subList(3,7);
        System.out.println(splitted);
    }
}
