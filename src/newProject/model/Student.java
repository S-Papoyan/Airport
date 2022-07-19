package newProject.model;

public class Student implements Comparable<Student> {

    private String name;
    private int mark;

    public Student(String data) {
        String[] split = data.split("-");
        name = split[0];
        mark = Integer.parseInt(split[1]);
    }

    @Override
    public String toString() {
        return name + "," + mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public int compareTo(Student o) {
        return mark - o.mark;
//        if (mark > o.mark) {
//            return 4545;
//        }
//        if (mark < o.mark) {
//            return -454;
//        }
//        return 0;
    }
}
