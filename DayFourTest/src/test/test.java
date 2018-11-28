package test;

public class test {
    public static void main(String[] args){
        Circle circle = new Circle();
        Line line = new Line();

       doSomething(circle);
       doSomething(line);
    }
    public static void doSomething(Shape shape){
        shape.draw();
    }
}
