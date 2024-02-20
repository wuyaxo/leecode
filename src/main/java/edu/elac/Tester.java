package edu.elac;

import java.io.IOException;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-01-29 20:41
 */

class AirPlan {

    public AirPlan(String str) throws IOException {
        System.out.println(str);
        throw new IOException();
    }
}

class AirJet extends AirPlan {
    public AirJet() throws IOException {
        super("1");
        System.out.println("");
    }

}

public class Tester {

}