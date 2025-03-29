package kmit;

public class Person 
    {void m1() throws Exception
    {
        System.out.println("before m1 called");
        m2();
        System.out.println("after m1 called");
        System.out.println("I am stll in m1");
    }
    void m2() throws Exception
    {
        try{
        System.out.println("before m2 called");
        m3();
        System.out.println("after m2 called");
    }
    finally
    {}
        
    }
    void m3() 
    {
        System.out.println("before m3 called");
        throw new RuntimeException();
        //System.out.println("after m3 called");
    }
}