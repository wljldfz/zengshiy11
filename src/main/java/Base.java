public class Base {
    int w, x, y, z;

    public void Base1(int a, int b) {
        x = a;
        y = b;
    }

    public void Base2(int a, int b, int c, int d) {
        Base1(a, b);
        w = d;
        z = c;
    }
}