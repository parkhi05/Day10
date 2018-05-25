
package interface1;
interface A{
     void show();
}
interface B 
{
    void show2();
    
}
class C implements A,B
{
    public void show()
    {
        System.out.println("hi,this is show..");
    }
    public void show1()
    {
        System.out.println("hi,this is show1..");
    }
    public void show2()
    {
        System.out.println("hi,this is show2..");
    }
    
}
public class Interface1 {


    public static void main(String[] args) {
     C ob = new C();
     ob.show();
     ob.show1();
     ob.show2();
    }
    
}
