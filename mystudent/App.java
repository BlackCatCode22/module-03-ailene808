package mystudent;

public class App {
    public static void main(String [] args){

        Student myStudent = new Student();
        myStudent.firstName = "Ailene";
        myStudent.lastName = "Alexander";
        myStudent.gpa = 4.0;

        System.out.println(myStudent.firstName);
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.gpa);

    }
}
