import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    //constructor
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    //getters


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double)sum / grades.size();
    }


}
