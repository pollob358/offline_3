public abstract class ModuleDecorator extends Module {

    protected Module module;

    public ModuleDecorator(Module module) {
        super(module.getName());  
        this.module = module;
    }

    @Override
    public double getduration() {
        return module.getduration();
    }

    @Override
    public double calculatePrice() {
        return module.calculatePrice();
    }

    @Override
    public String getName() {
        return module.getName();
    }

    @Override
    public void showDetails(String indent) {
        module.showDetails(indent);
    }

    @Override
    public void setprice(double price) {
        module.setprice(price);
    }
}
