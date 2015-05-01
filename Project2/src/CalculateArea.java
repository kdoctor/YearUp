
public class CalculateArea { 
	static double CalculateCircleArea(int radius) {
	double area = 3.14*radius*radius;
	return area;
}
static double CalculateRectangleArea(int length, int breadth) {
	double area = length* breadth;
	return area; }
public static void main(String[] args) {
	int radius = 4; int length = 5; int breadth = 10;
	double circlearea = CalculateCircleArea(radius);
	double rectanglearea = CalculateRectangleArea(length,breadth);
	System.out.println("The circle area is "+ circlearea);
	System.out.println("The rectangle area is "+ rectanglearea);
}
}