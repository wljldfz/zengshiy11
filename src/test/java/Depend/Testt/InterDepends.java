package Depend.Testt;

/**
 * 接口传递
 */
public class InterDepends {
    public static void main(String[] args) {
     new imp1().eatMeat(new Dog());
    }
}

//接口传递
interface Aninmal {
    public void eat();
}

interface meat {
    public void eatMeat(Aninmal aninmal);
}

class Cat implements Aninmal {

    @Override
    public void eat() {
        System.out.println("貓會吃東西");
    }
}

class Dog implements Aninmal {

    @Override
    public void eat() {
        System.out.println("狗會吃東西");
    }
}

class imp1 implements meat {

    @Override
    public void eatMeat(Aninmal aninmal) {
        aninmal.eat();
    }
}