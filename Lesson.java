public class Lesson implements Content {
    private double duration;
    private String name;
    private double price;
    public Lesson(String name,double duration,double price){
        this.name=name;
        this.duration=duration;
        this.price=price;
    }
    @Override
    public double getduration() {
       return duration;
    }

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Lesson: " + name + " | Duration: " + duration + "h");
    }
    @Override
    public void setprice(double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setprice'");
    }
    
}
