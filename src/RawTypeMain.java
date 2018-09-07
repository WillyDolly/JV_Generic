/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class RawTypeMain {
    public static void main(String[] args) {
        GenDemo<Integer> iGen = new GenDemo<Integer>(56);
        GenDemo<Double> dGen = new GenDemo<Double>(5.7);
        GenDemo<String> strGen = new GenDemo<String>("fight.learn.work.think");
        
        GenDemo raw = new GenDemo(3.5);
        double dou = (double) raw.getValue();
        System.out.println("dou: "+dou);
//        int i = (int) raw.getValue();
//        System.out.println("i :"+i);
        
//         iGen = raw;
//         //int ii = iGen.getValue();
//        double d1 = iGen.getValue();
//         System.out.println("ii :"+d1);
        
        //raw = generic is safer than the opposite
        raw = iGen;
        int in =  (int) raw.getValue();
//        double ble = (double) raw.getValue();
        System.out.println("in : "+in);
//        System.out.println("ble : "+ble);
        raw = dGen;
        double dd = (double) raw.getValue();
        System.out.println("dd :"+dd);
        
        raw = strGen;
        String str = (String) raw.getValue();
        System.out.println("str :"+str);
    }
}
