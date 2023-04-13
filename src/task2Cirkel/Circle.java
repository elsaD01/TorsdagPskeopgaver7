package task2Cirkel;

//Skriv en klasse, der repræsenterer en cirkel med en radius som attribut og en set metode.
//Hvis metoden modtager en negativ radius som parameter, skal der kastes en Exception.
//Der skal være en metode til at udregne cirklens areal.
public class Circle {
    private double radius; // radius attribute

    // default constructor
    public Circle() {
        radius = 0.0;
    }

    // constructor with radius parameter
    public Circle(double r) {
        radius = r;
    }

    // get method for radius attribute
    public double getRadius() {
        return radius;
    }

    // set method for radius attribute
    public void setRadius(double r) {
        radius = r;
    }

    // method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate and return the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}


