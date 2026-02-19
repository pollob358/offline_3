public class Main {
    public static void main(String[] args) {
        Lesson lesson1= new Lesson("Newtonian Mechanics", 2.35, 1250);
        Lesson lesson2= new Lesson("ElectroStatics", 1.78, 985);
        Lesson lesson3=new Lesson("Physical Optics", 1.89, 988);

        Course physics=new Course("Physics");
        physics.addlesson(lesson1);
        physics.addlesson(lesson2);
        physics.addlesson(lesson3);


        Lesson lesson4= new Lesson("Matrix and Determinants", 2.56, 1210);
        Lesson lesson5= new Lesson("Integral Calculus", 3.7, 2290);
        Lesson lesson6=new Lesson("Probability and Statistics", 2.5, 1800);

        Course math=new Course("Mathematics");
        math.addlesson(lesson4);
        math.addlesson(lesson5);
        math.addlesson(lesson6);

        Module science1=new Module("Science");
        science1.addCourse(physics);
        science1.addCourse(math);
        science1.haspracticeSheet=true;
        science1.hasLiveMentor=true;
        Module science2=new Module("Science");
        science2.addCourse(physics);
        science2.addCourse(math);
        science2.haspracticeSheet=true;
        science2.hasLiveMentor=true;
        Cart cart=new Cart();
        science1=new PracticeQuestionAddonDecorator(science1);
        science1=new LiveMentorAddonDecorator(science1);
        cart.addContents(lesson5);
        cart.addContents(science1);
        cart.addContents(science2);
        cart=new MultiModuleDiscountDecorator(cart);
        cart=new SpecialDiscountDecorator(cart);
        cart=new DevelopingDiscountDecorator(cart);
        boolean flag=true;
        cart.setDeveloping(flag);
        System.out.println(cart.calculatePrice());
    }
}
