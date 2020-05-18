import processing.core.PApplet;

public class Rectangle extends Shape  {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height, PApplet p) {
        super(upperLeft, p);
        this.length = length;
        this.height = height;
    }

    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public void draw(){
        p.rect((float)getPosition().getX(), (float)getPosition().getY(), (float)getLength(), (float)getHeight());
    }



}


