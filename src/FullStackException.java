/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class FullStackException extends Exception{
    int size;
    FullStackException(int s){
        size = s;
    }
    public String toString(){
        return "Stack's max size: "+size;
    }
}
