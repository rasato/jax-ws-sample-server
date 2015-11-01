package net.ch72.samples.wssample;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by rasato on 2015/10/21.
 */
@WebService
public class Sample {

    private String message;

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
