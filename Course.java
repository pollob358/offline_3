import java.util.ArrayList;
import java.util.List;

public class Course implements Content{
    private List<Lesson>lessons=new ArrayList<>();
    private double duration;
    private double price;
    private String name;
    public Course(String name){
        this.name=name;
    }
    public void addlesson(Lesson lesson){
        lessons.add(lesson);
        this.duration+=lesson.getduration();
        this.price+=lesson.calculatePrice();
    }
    public void removelesson(Lesson lesson){
        lessons.remove(lesson);
        duration-=lesson.getduration();
        this.price-=lesson.calculatePrice();
    }
    @Override
    public double getduration() {
        return duration;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Course: " + name + " | Price: $" + price + " | Duration: " + duration + "h");
        for (Lesson l : lessons) {
            l.showDetails(indent + "   ");
        }
    }
    @Override
    public void setprice(double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setprice'");
    }
    
}
