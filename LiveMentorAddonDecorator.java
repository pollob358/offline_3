public class LiveMentorAddonDecorator implements Content{
    Content module;
    public LiveMentorAddonDecorator(Content module){
         this.module=module;
    }
    @Override
    public double getduration() {
       return module.getduration();
    }
    @Override
    public double calculatePrice() {
        System.out.println("yo2");
       return module.calculatePrice()+20;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setprice'");
    }
    
}
