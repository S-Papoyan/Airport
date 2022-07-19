package newProject.service;

import newProject.model.Student;
import newProject.util.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class StudentService {

    public static List<Student> convert(List<String> data) {
        ArrayList<Student> studentsList = new ArrayList<>();
        for (String s : data) {
            Student student = new Student(s);
            studentsList.add(student);

        }
        return studentsList;
    }

    public static Student maxMark(List<Student> students) {
//        Student max = students.get(0);
//        for (int i = 1; i < students.size(); i++) {
//            if (students.get(i).getMark() > max.getMark()) {
//                max = students.get(i);
//            }
//        }
        return Collections.max(students);

    }

    public static String sortByName(List<Student> students) {
        Collections.sort(students, new NameComparator());
        StringJoiner sj = new StringJoiner(" ");
        for (Student x : students) {
            sj.add(x.toString());
        }
        return sj.toString();
    }
}
