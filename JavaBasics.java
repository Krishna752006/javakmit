import java.util.*;
class Student implements Comparable
{
  String name;int id;float marks;
  Student(String a,int b,float c)
  {
    super();
    name = a;
    id = b;
    marks = c;
  }
  public String toString()
  {
    return Integer.toString(id);
  }
  public int compareTo(Object o)
  {
    Student s = (Student)o; //downcasting
    return this.id - s.id;
  }
}
public class JavaBasics {
  public static void main(String[] args) {
    List  l = new ArrayList();
    l.add(new Student("Priya",101,9.0f));
    l.add(new Student("Piya",122,9.0f));
    l.add(new Student("Pya",12,9.0f));
    l.add(new Student("Pa",1431,9.0f));
    l.add(new Student("Pya",11,9.0f));
    l.add(new Student("Riya",501,9.0f));
    System.out.println(l);
    Collections.sort(l);
    System.out.println(l);
  }
}