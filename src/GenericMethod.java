/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
class NotGenericClass{
    static <T,V extends T> boolean arrayEquals(T[] t,V[] v){
        if(t.length != v.length) return false;
        for(int i=0;i<t.length;i++)
            if(!t[i].equals(v[i])) return false;
        return true;
    }
}
public class GenericMethod {
     static <T,V extends T> boolean arrayEquals(T[] t,V[] v){
        if(t.length != v.length) return false;
        for(int i=0;i<t.length;i++)
            if(!t[i].equals(v[i])) return false;
        return true;
     }
     
    public static void main(String[] args) {
        Integer I1[] = {1,2,3,4};
        Integer I2[] = {1,2,3,4};
        Integer I3[] = {4,2,3,1};
        Double D1[] = {1.1,2.2,3.3};
        Float F1[] = {2.4F,5.7f};
        NotGenericClass notGen = new NotGenericClass();
        if(notGen.arrayEquals(I1, I2))
            System.out.println("I1 = I2");
        else
            System.out.println("I1 != I2");
        
        if(notGen.arrayEquals(I2,I3))
            System.out.println("I2 = I3");
        else
            System.out.println("I2 != I3");
        //D1, I1 not compatible but still works
        if(arrayEquals(D1,I1))
            System.out.println("D1 = I1");
        else
            System.out.println("D1 != I1");
    }
}
