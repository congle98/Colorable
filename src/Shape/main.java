package Shape;

public class main {
    static void show(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor();
            }
            else if(shapes[i] instanceof Rectangle){
                System.out.println(((Rectangle) shapes[i]).getArea());
            }

            else {
                System.out.println(((Circle) shapes[i]).getArea());
            }
        }
    }
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]= new Circle(5);
        shapes[1]= new Rectangle(5,7);
        shapes[2]=new Square(5);
        show(shapes);
    }
}
