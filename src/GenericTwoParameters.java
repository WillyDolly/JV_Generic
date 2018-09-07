/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenericTwoParameters<T,V> {
    T iOB;
    V strOB;
    
    GenericTwoParameters(T iOB,V strOB){
        this.iOB = iOB;
        this.strOB = strOB;
    }
    
    T getInteger(){
        System.out.println("iOB = "+iOB);
        return iOB;
    }
    
    V getString(){
        System.out.println("strOB = "+strOB);
        return strOB;
    }
    
    void showTypes(){
        System.out.println("iOB's type: "+iOB.getClass().getName());
        System.out.println("strOB's type: "+strOB.getClass().getName());
    }
}
