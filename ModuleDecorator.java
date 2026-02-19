import java.util.List;

public abstract class ModuleDecorator extends Module {

    protected Module module;

    public ModuleDecorator(Module module) {
        super(module.getName());  
        this.module = module;
    }

    @Override
    public double getDuration() {
        return module.getDuration();
    }

    @Override
    public double calculatePrice() {
        return module.calculatePrice();
    }

    public List<Course>getCourses(){
        return module.getCourses();
    }

    @Override
    public String getName() {
        return module.getName();
    }
}
