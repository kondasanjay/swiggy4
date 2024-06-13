package student.service;

import student.model.Student;
import student.model.Subject;

public class StudentTest {

    public static void main(String[] args) {



        Student student=new Student();


        student.name="sanjay";
        student.rollNumber=123;
        student.standard="10th";




        Subject subject1=new Subject();
        subject1.marks=35;
        subject1.name="telugu";

        Subject subject2=new Subject();
        subject2.marks=70;
        subject2.name="english";

        Subject subject3=new Subject();
        subject3.marks=79;
        subject3.name="hindi";

        Subject subject4=new Subject();
        subject4.marks=22;
        subject4.name="maths";

        Subject subject5=new Subject();
        subject5.marks=90;
        subject5.name="science";

        Subject subject6=new Subject();
        subject6.marks=50;
        subject6.name="social";
        Subject[] subject=new Subject[6];
        subject[0]=subject1;
        subject[1]=subject2;
        subject[2]=subject3;
        subject[3]=subject4;
        subject[4]=subject5;
        subject[5]=subject6;





        //System.out.println(student.name);

        student.subjects=subject;


        StudentService studentService=new StudentService();
        studentService.result(student);









    }
}
