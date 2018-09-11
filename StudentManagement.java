import java.util.ArrayList;
import java.util.Vector;

@SuppressWarnings("unchecked")
public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<Student>();


    public static void main(String[] args) {
        // instantiate students
        Student st1 = new Student("Trần Đức Hiếu", "17021248", "K59CLC", "tranhieu956230@gmail.com");
        Student st2 = new Student("Trần Đức Hiếu", "17021248", "K59CLC", "tranhieu956230@gmail.com");
        Student st3 = new Student("Trần Đức Hiếu", "17021248", "K59CB", "tranhieu956230@gmail.com");

        // print Student info
        System.out.println("Student's name is: " + st1.getName());
        System.out.println("The info of " + st1.getName() + " is");
        st1.getInfo();
        System.out.println("----------------------------");

        System.out.println("Student's name is: " + st2.getName());
        System.out.println("The info of " + st2.getName() + " is");
        st2.getInfo();
        System.out.println("----------------------------");

        System.out.println("Student's name is: " + st3.getName());
        System.out.println("The info of " + st3.getName() + " is");
        st3.getInfo();
        System.out.println("----------------------------");


        // check for sameGroup
        System.out.println(sameGroup(st1, st2));
        System.out.println(sameGroup(st2, st3));
        System.out.println(sameGroup(st1, st3));

        for (int i = 0; i < 10; i++) {
            students.add(new Student("123", "123", "123", "123"));
        }
        for (int i = 10; i < 11; i++) {
            students.add(new Student("1234", "1234", "1234", "1234"));
        }
        for (int i = 11; i < 30; i++) {
            students.add(new Student("123", "123", "123", "123"));
        }
        for (int i = 30; i < 40; i++) {
            students.add(new Student("1234", "1234", "1234", "1234"));
        }
        for (int i = 40; i < 50; i++) {
            students.add(new Student("123", "123", "123", "123"));
        }
        for (int i = 50; i < 60; i++) {
            students.add(new Student("1234", "1234", "1234", "1234"));
        }


        // prints student by group
        studentsByGroup();

        //remove Student
        System.out.println("-------------------------------");
        removeStudent("1234");
        System.out.println("-------------------------------");

        studentsByGroup();


    }


    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup() == s2.getGroup());
    }


    public static void studentsByGroup() {
        Vector v = new Vector();

        for (int i = 0; i < students.size(); i++) {
            if (v.indexOf(students.get(i).getGroup()) == -1) v.addElement(students.get(i).getGroup());
            else continue;
            for (int j = 0; j < students.size(); j++) {
                if (sameGroup(students.get(i), students.get(j))) {
                    System.out.println(students.get(j).getName());
                }
            }
        }
    }


    public static void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                i--;
            }
        }
    }

}



