package stage1.Home_work_1.Faculty.logic;

import stage1.Home_work_1.Faculty.model.Course;
import stage1.Home_work_1.Faculty.model.Mark;
import stage1.Home_work_1.Faculty.model.Student;

public class MarksLogic {
    public void assignMark(Course course, Student student, double markValue){
        Mark mark = new Mark(student, course, markValue);
//        System.out.println("Teacher : " + course.getTeacher().getName() + "\nСтудент : " + markValue + "\nStudent : " + student.getName());
    }
}
