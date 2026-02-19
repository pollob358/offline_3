public class SpecialDiscountDecorator extends DiscountDecorator{
    public SpecialDiscountDecorator(Cart cart){
         super(cart);
    }
    public double calculatePrice() {
       if(cart.getDuration()>=5){
        System.out.println("yo4");
           return cart.calculatePrice()-12;
       }
       return cart.calculatePrice();
    }
}
