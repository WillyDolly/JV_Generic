/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Queue<T> implements QueueTasks<T> {
private int putM, getM;
private T[] arrT;

Queue(T[] arrT){
    this.arrT = arrT;
    putM = getM = 0;
}

    @Override
    public void put(T oB) throws QueueFulException {
        if(putM == (arrT.length-1))
            throw new QueueFulException(arrT.length-1);
        putM++;
        arrT[putM] = oB;
    }

    @Override
    public T get() throws QueueEmptyException{
        if(getM==putM)
            throw new QueueEmptyException();
        getM++;
        return arrT[getM];
    }
   
}
