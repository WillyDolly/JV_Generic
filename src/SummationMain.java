/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
class Summation{
    
    int sum =0;
    <T extends Number> Summation(T oB){
        for(int i=0;i<=oB.intValue();i++)
            sum +=i;
        System.out.println("Tong tich luy = "+sum);
    }
}
public class SummationMain {
    public static void main(String[] args) {
        Summation summation = new Summation(7.3);
    }
}
