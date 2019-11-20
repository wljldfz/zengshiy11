package Depend.Testt;

/**
 * 构造传递
 */
public class GZaoDepends {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        imp11 imp11 = new imp11(cat1);
//        imp11.eatMeat();
    }
}

interface Aninmal1 {
    public void eat();
}

interface meat1 {
    public void eatMeat();
}

class imp11 implements meat1 {
    Aninmal1 aninmal;

    public imp11(Aninmal1 aninmal) {
        this.aninmal = aninmal;
        this.aninmal.eat();
    }

    @Override
    public void eatMeat() {
//        this.aninmal.eat();
    }
}

class Cat1 implements Aninmal1 {

    @Override
    public void eat() {
        System.out.println("貓會吃東西");
    }
}

class Dog1 implements Aninmal1 {

    @Override
    public void eat() {
        System.out.println("狗會吃東西");
    }
}

