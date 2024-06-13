package student.service;

import student.model.Student;
import student.model.Subject;

//public class StudentService {


   // public String validateStudent(StudentService inputStudent) {
      //  StudentService service=new StudentService();


    public class StudentService {



        public Student result(Student student) {

            for (Subject subject : student.subjects) {
                if (subject.marks >= 35) {
                    System.out.println(student.name+student.standard+student.rollNumber+"pass");

                } else {
                    System.out.println("fail");
                }
            }
            return student;
        }
    }




