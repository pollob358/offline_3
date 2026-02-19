import java.util.List;

public abstract class CartDecorator extends Cart {
    protected Cart cart;  

    public CartDecorator(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void addContents(Content content) {
        cart.addContents(content);
    }

    @Override
    public double getDuration() {
        return cart.getDuration();
    }

    @Override
    public int getCount() {
        return cart.getCount();
    }

    @Override
    public boolean isdeveloping() {
        return cart.isdeveloping();
    }

    @Override
    public double calculatePrice() {
        return cart.calculatePrice();
    }
    @Override
    public void setDeveloping(boolean flag) {
        cart.setDeveloping(flag);  
    }
    @Override
    public String getName() {
        return cart.getName();
    }
    public List<Content> getContents() {
        return cart.getContents();
    }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + getName()
            + " | Modules: " + getCount()
            + " | Duration: " + getDuration() + "h"
            + " | Price: " + calculatePrice() +" taka "
            + " | Developing: " + isdeveloping());
            for (Content content : cart.getContents()) { 
                content.showDetails(indent + "   ");       
            }
    }
    


}
