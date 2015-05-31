
public class Circle {

	private String m_color;
	 private double m_radius; 
	public static void main(String[] args){}
		 
		 public Circle(String color, double radius)
		 {
			 m_color= color;
			 m_radius= radius;
			 }
		 public Circle(double radius)
		 {
			 m_radius= radius;
		 }
		 double CalculateArea(){
				double area= 3.14* m_radius* m_radius;
				return area;
			}
			public void printColor(){
				System.out.println("my color is: "+ m_color);
			}

	

	public static void main1(String[] args) {
		Circle smallCircle = new Circle("blue" , 6);
		Circle bigCircle = new Circle(10); 
		
	
		System.out.println("The area of bigCircle is: " + bigCircle.CalculateArea());
		
		System.out.println("The area of smallCircle is: " + smallCircle.CalculateArea());
		
		bigCircle.printColor();
		smallCircle.printColor();
	}
	
	
}

	
