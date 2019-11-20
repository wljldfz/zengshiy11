public class teststatis {

    static  int i=0;
    public void a(){
        i=9;

    }

    public static void main(String[] args) {
        new teststatis().a();
        System.out.println(i);
    }
}
