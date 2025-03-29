public class Person1 {
    String name, gender, consti; int age;
    static int counter;
    Person1()
    {
        name = "Kiran";
        counter++;
        consti = "Barkatpura";
    }
    public Person1(String n,int a)
    {
        name = n;
        counter++;
        age = a;
        consti = "Barkatpura";
    }
    public Person1(int a)
    {
        age = a;
        counter++;
        name = "Preetam";
        consti = "Barkatpura";
    }
    public Person1(int a,String n,String g)
    {
        name = n;
        gender = g;
        counter++;
        age = a;
        consti = "Barkatpura";
    }
    void canVote()
    {
        if(age >= 18)
        System.out.println(name + " in " + consti +" has voted.\n" + "Age: "+ age + ".");
        else
        System.out.println(name + " in " + consti + " cannot vote.");
    }
    static void m1()
    {
        System.out.println("M1 Called");
    }
}
