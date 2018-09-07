
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Queue with Integer: ");
        Integer I[] = new Integer[3];
        Queue<Integer> iQ = new Queue<Integer>(I);
        
        try{
        for(int i=0;i<5;i++){
                iQ.put(i);
                System.out.println("xep "+i+" vao iQ");
        }
        } catch (QueueFulException ex) {
                System.out.println(ex);
        }
        System.out.println();
        
        int iGet;
        try{
        for(int i=0;i<5;i++){          
                iGet = iQ.get();
                System.out.println("iGet "+i+" : "+iGet);
        }
        } catch (QueueEmptyException ex) {
              System.out.println(ex);
        }
        
        System.out.println("Queue with Double");
        Double D[] = new Double[8];
        Queue<Double> dQ = new Queue<Double>(D);
        try{
            for(int i=0;i<8;i++){
                dQ.put((double)i/2);
                System.out.println("xep "+(double)i/2+" vao dQ");
            }
        }catch(QueueFulException ex){
            System.out.println(ex);
        }
        double dGet;
        for(int i=0;i<8;i++){
            try {
                dGet = dQ.get();
                System.out.println("dGet "+i+" : "+dGet);
            }catch (QueueEmptyException ex) {
                System.out.println(ex);
            }
        }
    }
}
