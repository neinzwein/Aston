package stage1.Home_work_1.Faculty.model;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<Mark> marks = new ArrayList<>();

    public void addMark(Mark mark){
        marks.add(mark);
    }

    public List<Mark> getMarks(){
        return marks;
    }
}
