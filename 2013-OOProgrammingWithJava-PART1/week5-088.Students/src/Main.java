
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        ArrayList<Student> students = new ArrayList<Student>();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentnumber = input.nextLine();

            Student student = new Student(name, studentnumber);
            students.add(student);
        }

        for (Student stdt : students) {
            System.out.println(stdt);
        }

        System.out.print("Give search term: ");
        String search = input.nextLine();
        System.out.println("Result:");
        for (Student stdt : students) {
            if (stdt.getName().contains(search)) {
                System.out.println(stdt);
            }
        }

    }
}
