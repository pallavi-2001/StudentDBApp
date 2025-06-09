package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args){

        //ask how many new users we want to add
        System.out.print("Enter the number of students: ");
        try (Scanner in = new Scanner(System.in)) {
            int numOfStudents=in.nextInt();
            Student[] s=new  Student[numOfStudents];


            //Create n number of new students
            for(int i=0;i<numOfStudents;i++)
            {
                s[i]=new Student();
                s[i].enroll();
                s[i].payTuition();
                System.out.println("Student "+(i+1)+" Details\n"+s[i].showStatus());
            }
        }
    }
}
