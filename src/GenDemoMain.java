/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenDemoMain {
    public static void main(String[] args) {
        GenDemo<Integer> genInteger = new GenDemo<Integer>(10);
        int i = genInteger.getValue();
        System.out.println("i = "+i);
        genInteger.showType();
        
        GenDemo<String> genString = new GenDemo<String>("String argument");
        String str = genString.getValue();
        System.out.println("str = "+str);
        genString.showType();
        //GenDemo<double> genDouble = new GenDemo<double>(7.1);      double not an object
        
    }
}
