import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    // returns the student's id
    public long getId(){
        return this.id;
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum=0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return (sum/grades.size());
    }
}