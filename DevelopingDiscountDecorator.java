public class DevelopingDiscountDecorator extends DiscountDecorator{
    public DevelopingDiscountDecorator(Cart cart){
         super(cart);
    }
    public double calculatePrice() {
       if(cart.isdeveloping()==true){
        System.out.println("yo5");
           return cart.calculatePrice()-10;
       }
       return cart.calculatePrice();
    }
}
