import java.util.ArrayList;
import java.util.List;

public class Module implements Content{
    private List<Course>courses=new ArrayList<>();
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
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    @Override
    public double getDuration() {
        double total=0;
        for(var c:courses){
            total+=c.getDuration();
        }
        return total;
    }
    @Override
    public double calculatePrice() {
        double total=0;
        for(var c:courses){
            total+=c.calculatePrice();
        }
        return total;
    }

    @Override
    public String getName() {
        return name;
    }
    public List<Course>getCourses(){
        return courses;
    }
    
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Module: " + name + " | Price: " + this.calculatePrice() + " taka" + "| Duration: " + this.getDuration() + "h");
        for (Course c : courses) {
        c.showDetails(indent + "   ");
       }
    }
}
