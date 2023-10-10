package Score;

import course.*;
import student.*;
import teacher.*;

public class Score {
    Teacher teacher;
    Student stu;
    Course cour;

    float grade;
    public Score(Teacher teacher,Student stu,Course cour,float x){
        this.teacher=teacher;
        this.stu=stu;
        this.cour=cour;
        grade=x;
    }
    public String toString(){
        return teacher.tname+" "+stu.sname+" "+cour.cname+" "+grade;
    }
}
