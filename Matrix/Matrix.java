import java.util.Random;

public class Matrix {
	
	private int size; 
	
	public Matrix( int size ){
		this.size = size; 
	}
	
	public int getSize(){
		return size; 
	}
	
	public void setSize( int size ){
		this.size = size;
	}
	
	public int[][] createBalanced( int numRange ){
		
		Random randInt = new Random();
		
		// create the matrix 
		int matrix[][] = new int[size][size]; 
		
		for( int i = 0; i < size; i++ ){
			for( int j = 0; j < size; j++ ){
			
				matrix[i][j] = randInt.nextInt(numRange + 1 + numRange) - numRange;
			}
		}
		
		return matrix;
		
	}
	
	public static int absDiagonalDiff( int[][] matrix ){
		
		// fails on 5 and 9 when there are negative numbers
		int sumLeft  = 0;
		int sumRight = 0; 
		
		if ( matrix.length > 1 ){
			//add the constants 
			sumLeft += matrix[ 0 ][ 0 ]; 
			sumLeft += matrix[ matrix.length - 1 ][ matrix.length - 1 ];
			
			sumRight += matrix[ matrix.length - 1 ][ 0 ]; 
			sumRight += matrix[ 0 ][ matrix.length - 1 ];
			
			// add diagonals determine number of diagnal elements by n - 2 
			// precondition if n is greater than 1
			 
			int diagonals = (matrix.length) - 2; 
			// start loop at 1 because we have already dealt with the others 
			for( int i = 1; i <= diagonals; i++ ){
				sumLeft  += matrix[ i ][ i ]; 
				sumRight += matrix[ i ][ ( ( matrix.length ) - 1 ) - i ];

			}
		}else if ( matrix.length == 1 ){ // we have a one element array
			return matrix[0][0];
		}else{
			return 0;
		}
		
		return  Math.abs( sumRight - sumLeft ); 
	}
	
	
	public static void print( int[][] matrix ){
		
		for( int i = 0; i < matrix.length ; i++ ){
			for( int j = 0; j < matrix.length; j++ ){
				
				System.out.print(matrix[i][j]); 
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
	

}
