package software.ulpgc;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("pepe", 20);

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.isAdult());
    }
}
