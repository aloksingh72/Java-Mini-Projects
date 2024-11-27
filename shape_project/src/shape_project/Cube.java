package shape_project;

public class Cube implements ThreeDShape {
	
	double side;
	public Cube() {
		
	}
	
	Cube(double side){
		this.side = side;
		
	}
	public void getVolume() {
	System.out.println("volume of cube"+side*side*side+" Cu.Unit");	
	}
	public void getCurvedSurfaceArea() {
		System.out.println("Curved surface Area"+4*side*side+"Sq. Unit");
		
	}
	public void geTotalSurfaceArea() {
		System.out.println("Total surface Area is:" +6*side*side+"Sq.Unit");
		
	}

}
