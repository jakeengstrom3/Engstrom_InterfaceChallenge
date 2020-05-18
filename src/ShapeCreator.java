import processing.core.PApplet;
public class ShapeCreator extends PApplet {

    //you'll need a structure to hold many shapes

    Shape houseBody;
    Shape houseDoor;
    Shape houseWindow1;
    Shape houseWindow2;
    Shape houseWindow3;
    public void settings() {
        size(500,500);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        houseBody = new Rectangle(new Point(125, 125), 250, 250, this);
        houseDoor = new Rectangle(new Point(212, 270), 75, 105, this);
        houseWindow1 = new Rectangle(new Point(155, 200),50 ,50 ,this);
        houseWindow2 = new Rectangle(new Point(300, 200),50 ,50 ,this);
        houseWindow3 = new Circle(new Point(250, 175), 50, this);
    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        houseBody.draw();
        houseDoor.draw();
        houseWindow1.draw();
        houseWindow2.draw();
        houseWindow3.draw();
    }

}