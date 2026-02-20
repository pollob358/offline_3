import java.util.ArrayList;
import java.util.List;

public class Cart implements Content{
    List<Content>contents;
    private int moduleCount;
    private boolean isdeveloping;
    private String name;
    public Cart(){
        contents=new ArrayList<>();
        moduleCount=0;
    }
    public Cart(String name){
        contents=new ArrayList<>();
        moduleCount=0;
        this.name=name;
    }
    public void addComponents(Content content){
        contents.add(content);
        if(content instanceof Module){
            moduleCount+=1;
        }
    }
    public double getDuration(){
        double total=0;
        for(var content:contents){
            total+=content.getDuration();
        }
        return total;
    }
    public double calculatePrice(){
        double total=0;
        for(var content:contents){
            total+=content.calculatePrice();
        }  
        return total;
    }
    public int getCount(){
        return moduleCount;
    }
    public void setDeveloping(boolean flag){
        isdeveloping=flag;
    }
    public boolean isdeveloping(){
        return this.isdeveloping;
    }
    @Override
    public String getName() {
        return name;
    }
    public List<Content>getContents(){
        return contents;
    }
    @Override
    public void showDetails(String indent) {    
        for (Content content : contents) {
            content.showDetails(indent + "   ");
        }
    }


    
}
