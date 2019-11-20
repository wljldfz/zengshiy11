package zsy;

public class classTest {


    public static void main(String[] args) {
//        new cat().setName("小黄");
        Class pclass1 = cat.class;
//        System.out.print(new cat().getName());
//        System.out.print("猫的名字" + pclass1.toString());

        System.out.print(new cat().getClass() == pclass1);
    }

}
