/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
interface Containment<T extends Number>{
    boolean contain(T oB);
}

class Gene implements Containment<Integer>{//Gene not generic class because Containment has specific parameter type
Integer I1[];
    Gene(Integer[] arrOB){
        I1 = arrOB;
    }
    
    @Override
    public boolean contain(Integer oB) {
       for(Integer i:I1)
           if(i.equals(oB)) return true;
        return false;
    }
    
}
public class GenericInterface {
    public static void main(String[] args) {
        Integer I1[] = {3,6,789,34};
        Gene gene = new Gene(I1);
        if(gene.contain(10))
            System.out.println("I1 contains "+10);
        else
            System.out.println("I1 not contains "+10);
    }
}
