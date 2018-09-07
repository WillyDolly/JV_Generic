/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
interface QueueTasks<T> {
    void put(T oB) throws QueueFulException;
    T get()throws QueueEmptyException;
}
