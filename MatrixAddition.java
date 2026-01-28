package ridha;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		System.out.print("enter number of rows: ");
		rows=sc.nextInt();
		System.out.print("enter number of columns: ");
		cols= sc.nextInt();
		int[][]A= new int[rows][cols];
		int[][]B= new int[rows][cols];
		int[][]C= new int[rows][cols];
		System.out.println("enter elements of Matrix A:");
		for (int i =0; i < rows; i++ ) {
			for (int j=0; j < cols; j++) {
				A[i][j]= sc.nextInt();
			}
		}
		System.out.println("enter elements of Matrix B:");
		for (int i =0; i < rows; i++ ) {
			for (int j=0; j < cols; j++) {
				B[i][j]= sc.nextInt();
			}
		}
		for (int i =0; i < rows; i++ ) {
			for (int j=0; j < cols; j++) {
				C[i][j]= A[i][j]+B[i][j];
			}
		}
		System.out.println("Resultant Matrix (A+B):");
		for (int i =0; i < rows; i++ ) {
			for (int j=0; j < cols; j++) {
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		// TODO Auto-generated method stub

	}
		sc.close();
	}
}
