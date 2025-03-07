/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I just did my first GitHub activity!!");
        
        newClass nc = new newClass(); // creating object of newClass
        
        nc.hello(); // have to use variable name nc to communicate with the class
        
        System.out.println(nc.strSecondClassVar); // output variable from 2nd class
    }
}
