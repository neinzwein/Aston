package Home_work_1.Faculty;

import Home_work_1.Faculty.model.*;
import Home_work_1.Faculty.logic.*;

public class App {
    public static void main(String[] args) {

        // объявляем имя учителя
        Teacher teacher = new Teacher(9001, "Teacher 1");
        // Объявляем студента
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");
        // Объясвляем курс
        Course course1 = new Course("Course 1", teacher);
        Course course2 = new Course("Course 2", teacher);

        // Добавление студента на курс
        StudentLogic studentLogic = new StudentLogic();
        studentLogic.StudentRegistry(course1, student1);
        studentLogic.StudentRegistry(course2, student2);

        // Поставить оценку
        MarksLogic marksLogic = new MarksLogic();
        marksLogic.assignMark(course1, student1, 100);
        marksLogic.assignMark(course2, student2, 60);

        // создаём архив
        Archive archive = new Archive();
        ArchiveLogic archiveLogic = new ArchiveLogic(archive);
        // Ставим оценки в архив
        Mark mark1 = new Mark(student1, course1, 100);
        Mark mark2 = new Mark(student2, course2, 60);
        archiveLogic.archiveMark(mark1);
        archiveLogic.archiveMark(mark2);
    }
}
