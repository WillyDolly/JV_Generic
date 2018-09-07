/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class TypeLimit<T extends Number> {
    T num;
    
    TypeLimit(T n){
        num = n;
    }
    
    double reciprocal(){
        System.out.println("reciprocal: "+1/num.doubleValue());
        return 1/num.doubleValue();
    }
    
    double fraction(){
        System.out.println("fraction: "+(num.doubleValue() - num.intValue()));
        return num.doubleValue() - num.intValue();
    }
    
    boolean absEqual(TypeLimit<?> t){
        if(Math.abs(num.intValue()) == Math.abs(t.num.intValue()))
            return true;
        else 
            return false;
    }
}
