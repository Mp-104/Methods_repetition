package demo.Maksim.com;

public class Main {
    public static void main(String[] args) {

        // Classes + object in main
        //  (Create class,
        //      to object,
        //      to within main)

        // Object creation AKA Instantiation , skapande av object
        Student student1 = new Student(15,"benny", true);
        Student student2 = new Student(22, "frida",false);

        //student1.name;
        //student2.name;

        // Set object values
        student1.name = "benny";
        //student2.name = "frida";

        System.out.println(student1.name = "benny");
        System.out.println(student2.name);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student2.age);
        System.out.println(student1.isTired);
        System.out.println(student2.showIfSleepy());

        String test = "test";
        double test1 = 1.3;
        var test2 = true;

        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);

    }

}
