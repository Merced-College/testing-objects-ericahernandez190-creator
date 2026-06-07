//Name: Erica Hernandez
//Date: 6/6/2026
//Dog class for dog object

public class ObjectTester
{
    public static void main(String[] args)
    {
    Dog d1 = new Dog();
    System.out.println("\nDefaults for d1 fields(before any assignment0:");
    System.out.println("name = " + d1.getName());
    System.out.println("age = " + d1.getAge());
    System.out.println("breed = "+ d1.getBreed());

    Dog d2 = new Dog(); 
    System.out.println("\nd2 after default constructor:");
    System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

    Dog d3 = new Dog("Rex", 4, "Collie");
    System.out.println("\nd3 after parameterized constructor:");
    System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());
    
    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("d2 = " + d2);
    System.out.println("d3 = " + d3);

    System.out.println("\nMutating public fields directly:");
    d3.setAge(5); //d3.age = 5;      //direct write
    d3.setName("Max");//d3.name = "Max"; //direct write
    System.out.println("After mutation, d3 = " + d3); //uses to toString()

    System.out.println("\nMutating via setters after making fields private:");
    d3.setAge(6);
    d3.setName("Maxwell");
    d3.setBreed("Boarder Collie");
    System.out.println("d3 age via getter = " + d3.getAge());
    System.out.println("d3 now = " + d3);

    //making a deafault Cat object
    Cat cat1 = new Cat();
    //making a cat object with given data
    Cat cat2 = new Cat("Spots", "black", false);
    System.out.println("Cat Object 1 " + cat1);
    System.out.println("Cat Object 2 " + cat2);
    
    Cat cat3 = new Cat("Sprinkles", "Orange", true);
    System.out.println("Cat Object 3 " + cat3);
    cat3.setName("koi");
    cat3.setPlayful(true);
    System.out.println("\nCat 3 Mutating with name getter: " + cat3.getName());
    System.out.println("cat 3 now = " + cat3);

    
}//end of main
    
}//end of class