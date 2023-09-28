package demo.Maksim.com;

public class Student {

    // Variables
    public int age;
    public String name;
    public boolean isTired;

    // Methods, TODO Create methods

    public Student(int age, String name, boolean isTired) {
        this.age = age;
        this.name = name;
        this.isTired = isTired;
    }

    // methods
    public String showIfSleepy () {

        if (isTired == true) {
            return name + " is very tired";

        } else {
            return name + " is NOT tired";

        }

    }

}
