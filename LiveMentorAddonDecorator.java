import java.util.List;

public class LiveMentorAddonDecorator extends ModuleDecorator{
    public LiveMentorAddonDecorator(Module module){
         super(module);
    }
    @Override
    public double getDuration() {
       return module.getDuration();
    }
    @Override
    public double calculatePrice() {
       return module.calculatePrice()+20;
    }
    @Override
    public String getName() {
       return module.getName();
    }
    public List<Content>getCourses(){
      return module.getCourses();
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Module: " + this.getName() + " | Price: " + this.calculatePrice() + " taka" + "| Duration: " + this.getDuration() + "h");
        for (Content c : this.getCourses()) {
        c.showDetails(indent + "   ");
       }
    }
    
}
