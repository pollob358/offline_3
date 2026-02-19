import java.util.ArrayList;
import java.util.List;

public class Module implements Content{
    private List<Course>courses=new ArrayList<>();
    private double duration;
    private double price;
    private String name;
    public boolean haspracticeSheet;
    public boolean hasLiveMentor;
    public Module(String name){
        this.name=name;
        haspracticeSheet=false;
        hasLiveMentor=false;
    }
    public void addCourse(Course course){
        courses.add(course);
        this.duration+=course.getduration();
        this.price+=course.calculatePrice();
    }
    public void removeCourse(Course course){
        courses.remove(course);
        this.duration-=course.getduration();
        this.price-=course.calculatePrice();
    }
    @Override
    public double getduration() {
        return duration;
    }
    public void setprice(double price){
        this.price=price;
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
        System.out.println(indent + "Module: " + name + " | Price: $" + price + " | Duration: " + duration + "h");
        for (Course c : courses) {
        c.showDetails(indent + "   ");
       }
    }

    public void setPrice(double price){
        this.price=price;
    }
    
}
