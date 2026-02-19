public class DevelopingDiscountDecorator extends CartDecorator{
    public DevelopingDiscountDecorator(Cart cart){
         super(cart);
    }
    public double calculatePrice() {
       if(cart.isdeveloping()==true){
           return cart.calculatePrice()-10;
       }
       return cart.calculatePrice();
    }
}
