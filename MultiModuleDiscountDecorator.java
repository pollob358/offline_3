public class MultiModuleDiscountDecorator extends CartDecorator {

    public MultiModuleDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double calculatePrice() {
        double price = cart.calculatePrice();
        if(cart.getCount() >= 2){
            price -= 15;
        }
        return price;
    }
}
