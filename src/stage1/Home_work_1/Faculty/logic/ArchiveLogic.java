package stage1.Home_work_1.Faculty.logic;

import stage1.Home_work_1.Faculty.model.Archive;
import stage1.Home_work_1.Faculty.model.Mark;

public class ArchiveLogic {
    private Archive archive;

    public ArchiveLogic(Archive archive){
        this.archive = archive;
    }

    public void archiveMark(Mark mark){
        archive.addMark(mark);
        System.out.println("Mark : " + mark.getValue() + "\nStudent : " + mark.getStudent().getName() + "\nCourse: " + mark.getCourse().getCourseName());
    }
}
