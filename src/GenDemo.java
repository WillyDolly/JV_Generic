/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenDemo<T> {
    T ob;
    
    GenDemo(T o){
        ob = o;
    }
    
    public T getValue(){
        return ob;
    }
    
    public void showType(){
        System.out.println(ob.getClass().getName());
    }
}
