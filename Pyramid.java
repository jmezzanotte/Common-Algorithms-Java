
public class Pyramid {
	
	public static void main(String[] args){
		pyramid(6);
	}
	
	
	public static void pyramid(int size){
		pyramidHelper(size,size);
	}
	
	private static void pyramidHelper(int size, int originalParam){
		if(size > 0){
			
			pyramidHelper(size - 1, originalParam); 
			
			for(int i = 1; i <= originalParam - size; i++){
				System.out.print(" "); 
			}
			
			for(int i = 1; i <= size; i++){
				System.out.print("#");
			}
			
			System.out.println();
		}
		
		
		
	}
	
	

}
