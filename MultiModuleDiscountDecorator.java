public class MultiModuleDiscountDecorator extends DiscountDecorator {

    public MultiModuleDiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double calculatePrice() {
        System.out.println("yo3");
        double price = cart.calculatePrice();
        System.out.println("discount chhara price"+ price);
        if(cart.getCount() >= 2){
            price -= 15;
        }
        return price;
    }
}
