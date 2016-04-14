
public class MatrixDriver {
	
	public static void main( String[] args ){
		
		Matrix matrix = new Matrix(4); 
		
		int[][] arr = matrix.createBalanced( 100 );
		
		Matrix.print(arr);
		
		System.out.println(Matrix.absDiagonalDiff(arr));
		
		
	}

}
