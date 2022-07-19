package newProject;
import newProject.model.Student;
import newProject.service.FileService;
import newProject.service.StudentService;

import java.io.IOException;
import java.util.List;
public class Main {

    public static final String PATH = "Text.txt";
    public static void main(String[] args) throws IOException {

//        Student student = StudentService.maxMark(StudentService.convert(FileService.read(PATH)));
//        FileService.write(PATH, "\nmax = " + student.toString());

        List<String> read = FileService.read(PATH);
        List<Student> convert = StudentService.convert(read);
        Student student = StudentService.maxMark(convert);
        String s = StudentService.sortByName(convert);
        FileService.write(PATH, "\nmax = " + student.toString());
        FileService.write(PATH, "\n" + s);

    }
}
