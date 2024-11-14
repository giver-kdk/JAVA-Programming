package rmi.app;

/**
 *  Implement the 'Adder' interface
 */
public class AdderRemote implements Adder {
//    Create a constructor
    AdderRemote(){
        super();
    }
//    Implement the interface method
    public int add(int a, int b)
    {
        return a + b;
    }
}
