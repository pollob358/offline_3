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
    public double getDuration() {
       return duration;
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
        System.out.println(indent + "Lesson: " + name + " price: "+price+ " taka" +" | Duration: " + duration + "h");
    }
    public void setprice(double price) {
        this.price=price;
    }
    @Override
    public void addComponents(Content content) {
        System.out.println("Lesson can't add any components");
    }
    
}
