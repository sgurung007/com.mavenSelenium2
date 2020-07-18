package org.example;

import java.util.Hashtable;

public class HashTableTrial {


    private static Hashtable<String, String> hashData;
    private static Object[][] object1;
    private static Hashtable<String, String> hashData1;

    public static void main(String[] args) {

        hashData = new Hashtable<String, String>();
        hashData.put("firstName", "suraj");
        hashData.put("lastName", "gurung");
        hashData.put("email", "surajgrg@hotmail.com");
        hashData.put("isEnable", "Y");

        object1 = new Object[1][1];

        System.out.println("hash data is: " + hashData);
        object1[0][0] = hashData;
        System.out.println("object is printing: " + object1[0][0]);
        hashData1=new Hashtable<String, String>();


    }
}
