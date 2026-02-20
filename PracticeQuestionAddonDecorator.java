public class PracticeQuestionAddonDecorator extends ModuleDecorator {
    public PracticeQuestionAddonDecorator(Module module){
         super(module);
    }
    @Override
    public double getDuration() {
       return module.getDuration();
    }
    @Override
    public double calculatePrice() {
       return module.calculatePrice()+10;
    }
    @Override
    public String getName() {
       return module.getName();
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Module: " + this.getName() + " | Price: " + this.calculatePrice() + " taka" + "| Duration: " + this.getDuration() + "h");
        for (Content c : this.getCourses()) {
        c.showDetails(indent + "   ");
       }
    }
}
