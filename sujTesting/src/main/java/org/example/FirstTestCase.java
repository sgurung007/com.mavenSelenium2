package org.example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestCase {
    @Test
    public void FirstSetup(){
        System.out.println("printing from the FirstSetup");
    }
    @Test
    public void Login(){
        System.out.println("printing from the Login");
        Reporter.log("printing from the login");
    }

    @Test
    public void TearDown(){
        System.out.println("printing from TearDown");
    }

}
