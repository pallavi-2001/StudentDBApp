package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tutionBalance=0;
    private static int costOfCourse=600;
    private static int id=1000;

    //constructor: prompt to use students name and year
    public Student()
    {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the first name:");
        this.firstName=in.nextLine();

        System.out.print("Enter the last name:");
        this.lastName=in.nextLine();

        System.out.print("1 - freshman\n2 - sophmore\n3 - junier\n4 - senier\nEnter the class year: ");
        this.gradeYear=in.nextInt();
        studentID();
      
    }
    //Generate an ID
    private void studentID()
    {
        id++;
        //Grade level+id
        this.studentID= gradeYear +""+id ;
    }

    //Enroll the courses
    public void enroll()
    {
        do{
            System.out.print("Enter the course to enroll(enter Q to exit) : ");
            Scanner in= new Scanner(System.in);
            String course=in.nextLine();
            if(course.equals("Q"))
               break;
            else {
                courses= courses+"\n    "+course;
                tutionBalance=tutionBalance+costOfCourse;
            }
           
        }while(1!=0);
    }

    //View Balance
    public void viewBalance()
    {
        System.out.println("Your balance is : "+tutionBalance+"Rs");
    }

    //pay tution
    public void payTuition()
    {
        viewBalance();
        System.out.print("enter your payment in Rs");
        Scanner in=new Scanner(System.in);
        int payment=in.nextInt();
        tutionBalance=tutionBalance-payment;
        System.out.println("Thank You for your Payment of "+payment+"Rs");
        viewBalance();
    }

    //show status
    public String showStatus()
    {
        return "\nName: "+firstName+" "+lastName+
        "\nStudent ID: "+studentID+
        "\nClass Level: "+gradeYear+
        "\nCourses Enrolled: "+courses+
        "\nBalance: "+tutionBalance+"Rs"+
        "\n------------------------------";
    }

}
