package newProject.model;

public class Student {

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

}
