public class SpecialDiscountDecorator extends CartDecorator{
    public SpecialDiscountDecorator(Cart cart){
         super(cart);
    }
    public double calculatePrice() {
       if(cart.getDuration()>=5){
           return cart.calculatePrice()-12;
       }
       return cart.calculatePrice();
    }
}
