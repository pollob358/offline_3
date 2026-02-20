public interface Content{
    double getDuration();
    double calculatePrice();
    String getName();         
    void addComponents(Content content);  
    void showDetails(String indent);
}