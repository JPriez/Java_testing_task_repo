public class Shape {
    public void draw() {
       //nothing doing here
    }
}


public class Square extends Shape {
    public void draw() {
        System.out.println("Square");
    }
}

public class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle");
    }
}
