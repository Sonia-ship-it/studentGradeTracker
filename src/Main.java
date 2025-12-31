import java.util.*;
public class Main{
    public static void main(String[] args) {
        List<Student> student=new ArrayList<>();
        System.out.println("====================================");
        System.out.println("\t   STUDENT GRADE TRACKER");
        System.out.println("====================================");
        System.out.print("Enter number of students: ");
        int numberOfStudents;
        Scanner sc=new Scanner(System.in);
        numberOfStudents=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=numberOfStudents;i++) {
            System.out.println("Enter details for student "+i);
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Score: ");
            float score=sc.nextFloat();
            sc.nextLine();
            student.add(new Student(name,score));
            System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("\t\t  SUMMARY REPORT");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Student Name\t\tScore");
        System.out.println("--------------------------");
        float sum=0;
        for(Student s: student) {
            System.out.println(s.getName()+"\t\t"+s.getScore());
            sum+=s.getScore();
        }
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Class Average:\t\t"+sum/student.size());
        Collections.sort(student);
        System.out.println("Highest Score:\t\t"+student.getLast().getScore());
        System.out.println("Lowest Score:\t\t"+student.getFirst().getScore());
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Thank you for using Student Grades Tracker!");
    }
}