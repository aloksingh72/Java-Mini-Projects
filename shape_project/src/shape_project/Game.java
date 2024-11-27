package shape_project;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("====Game Has Started====");
	}
	
	public int selectShape() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for  2D Shape");
		System.out.println("Enter 2 for 3D Shape");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			return 1;
			
		}
		else if(choice ==2){
			return 2;
			
		}
		else {
			/*
			System.out.println("Invalid Choice");
			System.out.println("Press y to select valid Shape");
			System.out.println("Press other character for exit");
			char ch = sc.();
			if(ch ==1) {
				return selectShape();
			}
			else {
				
			}
			*/
			System.out.println("Invalid Choice");
			return selectShape();
		}
	}

	public TwoDShape selectTwoDShape() {
		// TODO Auto-generated method stub
		return null;
	}

}
