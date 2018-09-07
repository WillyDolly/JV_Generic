/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class TypeLimitMain {
    public static void main(String[] args) {
        TypeLimit<Double> tlDouble = new TypeLimit<Double>(2.7888856);
        tlDouble.reciprocal();
        tlDouble.fraction();
        
        TypeLimit<Integer> tlInteger = new TypeLimit<Integer>(-9);
        tlInteger.reciprocal();
        tlInteger.fraction();
        
        TypeLimit<Long> tlLong = new TypeLimit<Long>(9L);
        //TypeLimit<String> tlString = new TypeLimit<String>("String not accepted");
        //tlDouble = tlInteger;
        if(tlInteger.absEqual(tlLong))
            System.out.println("tlLong's abs = tlInteger's one");
        else
            System.out.println("tlLong's abs != tlInteger's one");
    }
}
