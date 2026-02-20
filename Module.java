import java.util.ArrayList;
import java.util.List;

public class Module implements Content{
    private List<Content>courses=new ArrayList<>();
    private String name;
    public boolean haspracticeSheet;
    public boolean hasLiveMentor;
    public Module(String name){
        this.name=name;
        haspracticeSheet=false;
        hasLiveMentor=false;
    }
    @Override
    public void addComponents(Content course) {
        if(course instanceof Course) courses.add(course);
       else System.out.println("Module can only add Course");
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
    public List<Content>getCourses(){
        return courses;
    }
    
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Module: " + name + " | Price: " + this.calculatePrice() + " taka" + "| Duration: " + this.getDuration() + "h");
        for (Content c : courses) {
        c.showDetails(indent + "   ");
       }
    }
}
