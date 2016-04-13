/**
 * Author : John Mezzanotte
 * Date-created: 4-13-2016 
 * Description: Recursive solution to the printed staircase problem
 */
 
public class Pyramid {
	
	public static void main(String[] args){
		pyramid(6);
	}

	public static void pyramid(int size){
		// Call helper function. This step is used to make the way we call the function cleaner and more intuitive.
		pyramidHelper(size,size);
	}
	
	private static void pyramidHelper(int size, int originalParam){
		
		if(size > 0){
			
			pyramidHelper(size - 1, originalParam); 
			
			// Handle the white space
			for(int i = 1; i <= originalParam - size; i++){
				System.out.print(" "); 
			}
			
			// print out the actual character
			for(int i = 1; i <= size; i++){
				System.out.print("#");
			}
			
			// Line break
			System.out.println();
		}
	
	}
	
}
