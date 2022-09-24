package Java11EssentialsCourse.JavaBasicsOOPConstructs;

/*
Problem Statement
ProblemStatement:

The Point class represents a point with x and y coordinates. Create a class Point according to the class diagram given below:
Method Description:

distance(): This method returns the distance of this point from origin.

distance(Point point): This method returns the distance of this point from the specified point.

Use the formula given below to implement the methods:

Hint: Use Math.sqrt(double d) method to calculate the square root, and Math.round(double d) method to round off the values.

To do: Make a Tester class and test the following functionalities:

Create an object p1 of Point class

Set the values of x and y

display the distance of the point from origin

Create another object p2 of Point class

Set the values of x and y

Display the distance between p1 and p2

Note: You can use the Math class for calculations.

Sample:

Input(for p1): 2, 3
Input(for p2): 5, 6

Output:
The distance of p1 from p2 is 4.242640687119285
The distance of p1 from the origin is 3.605551275463989
 */

class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Method to obtain distance of a point w.r.t origin
    public double distance(){
        //code here
        double a = Math.pow(this.x - 0, 2);
        double b = Math.pow(this.y - 0, 2);
        double distance = Math.sqrt(a+b);
        return distance;
    }

    //Method to obtain distance of a point w.r.t another point
    public double distance(Point point){
        //code here
        double a = Math.pow(this.x - point.getX(), 2);
        double b = Math.pow(this.y - point.getY(), 2);
        double distance = Math.sqrt(a+b);
        return distance;
    }

}
class Tester {
    public static void main(String[] args) {
        //code here
        Point p2 = new Point(5,6);
        Point p1 = new Point(2, 3);
        System.out.println("The distance of p1 from p2 is " + p2.distance(p1));
        System.out.print("The distance of p1 from the origin is " + p1.distance());

    }
}
