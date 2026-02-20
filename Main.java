public class Main {
    public static void main(String[] args) {
        Lesson lesson1= new Lesson("Newtonian Mechanics", 2.35, 1250);
        Lesson lesson2= new Lesson("ElectroStatics", 1.78, 985);
        Lesson lesson3=new Lesson("Physical Optics", 1.89, 988);

        Course physics=new Course("Physics");
        physics.addComponents(lesson1);
        physics.addComponents(lesson2);
        physics.addComponents(lesson3);


        Lesson lesson4= new Lesson("Matrix and Determinants", 2.56, 1210);
        Lesson lesson5= new Lesson("Integral Calculus", 3.7, 2290);
        Lesson lesson6=new Lesson("Probability and Statistics", 2.5, 1800);

        Course math=new Course("Mathematics");
        math.addComponents(lesson4);
        math.addComponents(lesson5);
        math.addComponents(lesson6);

        Module science1=new Module("Science");
        science1.addComponents(physics);
        science1.addComponents(math);
        science1.haspracticeSheet=true;
        science1.hasLiveMentor=true;
        Module science2=new Module("Science");
        science2.addComponents(physics);
        science2.addComponents(math);
        science2.haspracticeSheet=true;
        science2.hasLiveMentor=true;
        Cart cart=new Cart("first cart");
        science1=new PracticeQuestionAddonDecorator(science1);
        science1=new LiveMentorAddonDecorator(science1);
        science2=new PracticeQuestionAddonDecorator(science2);
        cart.addComponents(lesson5);
        cart.addComponents(science1);
        cart.addComponents(science2);
        cart=new MultiModuleDiscountDecorator(cart);
        cart=new SpecialDiscountDecorator(cart);
        cart=new DevelopingDiscountDecorator(cart);
        boolean flag=true;
        cart.setDeveloping(flag);
        cart.showDetails(" ");
    }
}
