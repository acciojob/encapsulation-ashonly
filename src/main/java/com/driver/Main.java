package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();


//java: member has private access in com.driver.RWOnly
        obj.setName("abc");
        String s=obj.getName();
    }
  
}