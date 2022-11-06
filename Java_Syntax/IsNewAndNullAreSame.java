

class Animal{
    int teeth;
    String name;
    boolean isLeg;
    char symbol;
}

public class IsNewAndNullAreSame {



    public static void main(String[] args) {

        Animal animal1 = null; //null values
        Animal animal2 = new Animal(); //some garbage value
        System.out.println(animal1 == animal2); // both are not equal
        
        // At last i concluded that both are not same [[[null != new Object()]]];
    }
    
}
