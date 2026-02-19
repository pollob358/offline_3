import java.util.ArrayList;
import java.util.List;

public class Course implements Content{
    private List<Lesson>lessons=new ArrayList<>();
    private String name;
    public Course(String name){
        this.name=name;
    }
    public void addlesson(Lesson lesson){
        lessons.add(lesson);
    }
    public void removelesson(Lesson lesson){
        lessons.remove(lesson);
    }
    @Override
    public double getDuration() {
        double total=0;
        for(var l:lessons){
            total+=l.getDuration();
        }
        return total;
    }

    @Override
    public double calculatePrice() {
        double total=0;
        for(var l:lessons){
            total+=l.calculatePrice();
        }
        return total;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Course: " + name + " | Price: " + this.calculatePrice() +" taka"+ " | Duration: " + this.getDuration() + "h");
        for (Lesson l : lessons) {
            l.showDetails(indent + "   ");
        }
    }
}
