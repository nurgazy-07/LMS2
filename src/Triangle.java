public class Triangle {
    double a;
    double b;
    double c;
    public Triangle(double a , double b , double c ){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public void area() {
        System.out.println("Уч бурчтуктун аянты: S = " + a * b / 2);
    }
}
