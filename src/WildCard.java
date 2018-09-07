/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
class Gen<T> {
    T oB;
    
    Gen(T oB){
        this.oB = oB;
    }
}

class A{}
class B extends A{}
class C extends A{}
class D{}

public class WildCard{
    static void extend(Gen<? extends A> wd){//Object must be A or A's subclass
        System.out.println(wd.getClass().getName());
    }
    
    static void SUPER(Gen<? super B> wd){//Object must be B or B's superclass
        System.out.println(wd.getClass().getName());
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        Gen<A> wcA = new Gen<A>(a);
        Gen<B> wcB = new Gen<B>(b);
        Gen<C> wcC = new Gen<C>(c);
        Gen<D> wcD = new Gen<D>(d);
        
        extend(wcA);
        extend(wcB);
        extend(wcC);
        //extend(wcD);
        
        SUPER(wcA);
        SUPER(wcB);
//        SUPER(wcC);
//        SUPER(wcD);
    }
}