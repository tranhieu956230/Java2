import java.util.Vector;
import java.util.Arrays;
@SuppressWarnings("unchecked")
public class StudentManagement {

    static Student[] students = new Student[100];

    public static void main(String[] args) {
        // instantiate students
        Student st1 = new Student("Trần Đức Hiếu 1", "17021248", "K59CLC", "tranhieu956230@gmail.com");
        Student st2 = new Student("Trần Đức Hiếu 2", "17021248", "K59CLC", "tranhieu956230@gmail.com");
        Student st3 = new Student("Trần Đức Hiếu 3", "17021248", "K59CB", "tranhieu956230@gmail.com");

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

        // 100 students

        for (int i = 0; i < 50; i++) {
            students[i] = new Student();
        }

        for(int i = 50; i< students.length; i++) {
            students[i] = new Student("Hieu", "1", "abc");
        }
        // prints student by group
        studentsByGroup();

    }

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup() == s2.getGroup());
    }

    public static void studentsByGroup() {
        Vector v = new Vector();

        for (int i = 0; i < students.length; i++) {
            if(v.indexOf(students[i].getGroup()) == -1) v.addElement(students[i].getGroup());
            else continue;
            for(int j = 0; j< students.length; j++) {
                if(sameGroup(students[i], students[j])) {
                    System.out.println(students[j].getName());
                }
            }
        }
    }

    public static void removeStudent(String id) {
        for(int i = 0;i < students.length; i++) {
            if(students[i] )
        }
        students = ArrayUtils.remove(students, )
    }
}