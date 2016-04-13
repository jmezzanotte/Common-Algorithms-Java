/**
 * Author : John Mezzanotte
 * Date-created: 4-13-2016 
 * Description: Recursive solution to the printed staircase problem
 */

public class Staircase {
	
	
	public static void main(String[] args){
		stairCase(6);
	}
	
	
	public static void stairCase(int size){
		stairCaseHelper(size,size);
	}
	
	private static void stairCaseHelper(int size, int original){
		if(size > 0){
			
			stairCaseHelper(size - 1, original); 
			
			for(int i = 1; i <= original - size; i++){
				System.out.print(" "); 
			}
			
			for(int i = 1; i <= size; i++){
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}

}

