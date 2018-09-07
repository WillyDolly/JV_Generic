/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenStack<T> implements IGenStack<T> {
private T[] oT;
private int disk;

GenStack(T[] oB){
    oT = oB;
    disk = 0;
}

    @Override
    public void push(T oB) throws FullStackException {
        if(disk == oT.length)
           throw new FullStackException(oT.length);
        oT[disk] = oB;
        disk++;       
    }

    @Override
    public T pop() throws EmptyStackException {
        if(disk==0)
            throw new EmptyStackException();
        disk--;
        return oT[disk];
    }
   
    
}
