package Home_work_1.Faculty.logic;

import Home_work_1.Faculty.model.Course;
import Home_work_1.Faculty.model.Student;

public class StudentLogic {
    public void StudentRegistry(Course course, Student student){
        course.addStudent(student);
//        System.out.println("Student : " + student.getName() + "\nCourse : " + course.getCourseName());
    }
}
