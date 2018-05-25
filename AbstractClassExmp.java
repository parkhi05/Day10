
//In a class if we define an abstract method  then we have 
//to make the class as abstract as well.
  //We cannot make an object of Abstract class .
//If we wish to implement the abstract methods of abstract class then we can create a child class
//and can work on all the abstract methods of abstract class.
//If the inherit class if implemtnting only few methods af an abstract class not all abs methods
//then the rest abs methods we will defined in another sub sub class. and sub class
//will also become abstract.
  package abstractclassexmp;
 abstract class A                 
{
   abstract void show();
   public void disp()
   {
      System.out.println("Parkhi");
   }
         
}
class B extends A {
    void show()
    {
        System.out.println("Hello");
    }
}


public class AbstractClassExmp {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.disp();
      
    }
    
}
