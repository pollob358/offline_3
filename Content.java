public interface Content{
    double getduration();
    double calculatePrice();
    String getName();     
    void setprice(double price);            
    void showDetails(String indent);
}