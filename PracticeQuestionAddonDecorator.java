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
        module.showDetails(indent);
    }

}
