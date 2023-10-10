package TestPackage;
import teacher.*;
import course.*;
import student.*;
import Score.*;

public class StudentGrade {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("05876","王岳");
        Student stu=new Student("202202120","李善");
        Course cour=new Course("120034","高等数学",6);
        Score sc=new Score(teacher,stu,cour,90);
        System.out.println(sc);
    }
}

