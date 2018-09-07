/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class GenericTwoParametersMain {
    public static void main(String[] args) {
        GenericTwoParameters<Integer,String> gtp = new GenericTwoParameters<Integer,String>(12,"beyond ordinary");
        gtp.getInteger();
        gtp.getString();
        gtp.showTypes();
    }
}
