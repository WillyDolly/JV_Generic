


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenStackMain {
    public static void main(String[] args) {
        Integer I[] = new Integer[5];
        GenStack<Integer> stackI = new GenStack<>(I);
        try{
            for(int i=0;i<10;i++){
                stackI.push(i);
                System.out.println("push "+I[i]);
            }
        } catch (FullStackException ex) {}
        System.out.println();
        try{
            for(int i=0;i<10;i++){      
                System.out.println("pop "+stackI.pop());
            }
        } catch (EmptyStackException ex) {}
        
        System.out.println();
        String S[] = {"zero","one","two","three"};
        GenStack<String> stackS = new GenStack<>(S);
        try{
            for(int i=0;i<S.length;i++){
                stackS.push(S[i]);
                System.out.println("push "+S[i]);
            }
        }catch(FullStackException ex){
            
        }
        try{
            for(int i=0;i<S.length;i++){
                System.out.println("pop "+stackS.pop());
            }
        }catch(EmptyStackException ex){
            
        }
    }
}
