package myanimals;
import java.util.*;
public class Animal {
   private String name;
   private int age;

   protected static int numberOfAnimals = 0;

   static Scanner userInput = new Scanner(System.in);

   public Animal() {
       numberOfAnimals++;
       int sumOfNumbers = 0;
       System.out.println(sumOfNumbers);

       System.out.print("Enter the name: \n");
       if(userInput.hasNextLine()){
           this.setName(userInput.nextLine());

       }
   }

    private void setName(java.lang.String string) {
    }
    public String getName(){
       return name;
   }

   public int getAge(){
       return age;
    }
public static void main(String[] args) {

       Animal theAnimal = new Animal();
    }
}

