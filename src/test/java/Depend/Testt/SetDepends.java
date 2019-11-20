package Depend.Testt;

/**
 * set传递
 */
public class SetDepends {
    public static void main(String[] args) {
        imp12 imp12 = new imp12();
        imp12.SetAnimal2(new Cat2());
        imp12.eatMeat();
    }
}

interface Aninmal2 {
    public void eat();
}

interface meat2 {
    public void eatMeat();

    public void SetAnimal2(Aninmal2 aninmal2);
}

class imp12 implements meat2 {
    private Aninmal2 aninmal2;

    @Override
    public void eatMeat() {
        this.aninmal2.eat();
    }

    @Override
    public void SetAnimal2(Aninmal2 aninmal2) {
        this.aninmal2 = aninmal2;
    }
}

class Cat2 implements Aninmal2 {

    @Override
    public void eat() {
        System.out.println("貓會吃東西");
    }
}

class Dog2 implements Aninmal2 {

    @Override
    public void eat() {
        System.out.println("狗會吃東西");
    }
}

