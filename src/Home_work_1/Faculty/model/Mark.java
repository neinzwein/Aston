package Home_work_1.Faculty.model;

public class Mark {
    private Student student;
    private Course course;
    private double value;

    public Mark(Student student, Course course, double value){
        this.student = student;
        this.course = course;
        this.value = value;
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

    public double getValue(){
        return value;
    }
}
