class B extends Exception{
     B(String str){
        super(str);
    }
}
class A extends Exception{
     A(String str){
        super(str);
    }
}
class Voting{
    int age;
    String country;
}
public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
       Voting c=new  Voting();
       c.age=18;
       c.country="India";

       if(c.age<18){
           throw new A("Not eligible for vote becouse age<18");
       }
       else if(!c.country.equals("India")) {
           throw new B("Not eligible for vote becouse country is other");
       } else{
            System.out.println("This candidate is eligible for vote");
        }
    }
}
