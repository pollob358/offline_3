public abstract class DiscountDecorator extends Cart {
    protected Cart cart;  

    public DiscountDecorator(Cart cart) {
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
}
