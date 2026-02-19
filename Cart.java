import java.util.ArrayList;
import java.util.List;

public class Cart{
    List<Content>contents;
    private int moduleCount;
    private boolean isdeveloping;
    public Cart(){
        contents=new ArrayList<>();
        moduleCount=0;
    }
    public void addContents(Content content,boolean module){
        contents.add(content);
        if(module){
            moduleCount+=1;
        }
    }
    public double getDuration(){
        double duration=0;
        for(var content:contents){
            duration+=content.getduration();
        }
        return duration;
    }
    public double calculatePrice(){
        double price=0;
        for(var content:contents){
            price+=content.calculatePrice();
        }  
        return price;
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

    
}
