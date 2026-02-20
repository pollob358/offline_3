import java.util.ArrayList;
import java.util.List;

public class Course implements Content{
    private List<Content>lessons=new ArrayList<>();
    private String name;
    public Course(String name){
        this.name=name;
    }
    @Override
    public void addComponents(Content lesson) {
        if(lesson instanceof Lesson)lessons.add(lesson);
        else System.out.println("Course can only add Lesson");
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
        for (Content l : lessons) {
            l.showDetails(indent + "   ");
        }
    }
}
