
public class Triangle {

    public static String checkTriangle(int a, int b, int c) {
        if (a < 1 || a > 200){
            return ("Value is not in range.");
        } else if (b < 1 || b > 200) {
            return ("Value is not in range.");
        } else if (c < 1 || c > 200) {
            return ("Value is not in range.");
        } else if (a >= b + c || b >= a + c || c >= a + b) {
            return ("Not a triangle.");
        } else if (a == b && b == c){
            return ("Equilateral triangle.");
        } else if (a == b || b == c || c == a) {
            return ("Isosceles triangle.");
        } else {
            return ("Scalene triangle.");

        }
    }
    public boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b <= c || b + c <= a || a + c <= b) {
            return false;
        }
        return true;
    }
    /**
    public static void main(String[] args) {
        System.out.println(checkTriangle(1, 2, 2));
    }
    */

}

