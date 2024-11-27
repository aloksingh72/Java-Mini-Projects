package shape_project;

public class Circle implements TwoDShape {
	double r ;
	Circle(){
		
	}
	Circle(double r ){
		if(r>0) {
			System.out.println("valid radius");
			this.r = r ;
		}
		else {
			System.out.println("Please enter valid radius");
		}
			
		
		
	}
	public void getArea() {
		System.out.println("Area of Circle is "+Math.PI*r*r+"sq Unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Circle is "+2*Math.PI*r+"Unit");
	}

}
