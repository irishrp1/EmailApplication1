package studentdatabaseapp;


import java.util.Scanner;

public class Student {
    private String firstname;
    private String secondname;
    private String gradeyear;
    private String studentID;
    private String courses;
    private String tutionbalance;
    private int coursecost=600;
    private static int id=1000;
    //create a constructor prompt user to insert student name and year//
    public Student(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name::");
        this.firstname=in.nextLine();
        System.out.println("Enter student second name::");
        this.secondname=in.nextLine();
        System.out.println("1-Freshman\n2-Sophomore\n3-Junior\n4-senior Enter student Class level::");
        this.gradeyear=in.nextLine();
        System.out.println(firstname+""+secondname+""+gradeyear);
        setStudentID();
        System.out.println(firstname+" "+secondname+" "+gradeyear+" "+ studentID);





    }

    private void setStudentID() {
        id++;
        this.studentID=gradeyear+" "+id;

    }
    public void enroll(){
        System.out.println("enter any course you want to enroll ");
    }
    //Generate an unique Id
    //Enroll in courses
    //view courses
    //pay tution
    //show status
    //genarate unique student id
}
