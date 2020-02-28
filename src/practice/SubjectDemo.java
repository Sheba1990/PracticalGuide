package practice;

//#6
public class SubjectDemo {
    public static void main(String[] args) {
        Subject ob = new Subject("Balaganoff");
        // with the help of constructor 2, we create the object of the class Subject
        // and set name for it to "Balaganoff"
        ob.name = "Shura Balaganoff";
        // with the help of the same constructor we change attributes of variable name

        ob.setAge(19);
        // with the help of setter we can set age to 19

        ob.show();
        // we execute method of the class Subject
    }
}
