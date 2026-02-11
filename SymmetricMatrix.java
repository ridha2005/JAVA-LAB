package ridha;
import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n;
boolean symmetric= true;
System.out.print("enter order of matrix:");
n=sc.nextInt();
int[][]A=new int[n][n];
System.out.println("enter matrix element:");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		A[i][j]=sc.nextInt();
	}
}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(A[i][j]!=A[j][i]) {
			symmetric=false;
            break;
		}
	}
}
if (symmetric) {
	System.out.println("the matrix is symmetric.");
}else {
	System.out.println("the matrix is NOT symmetric.");
}
sc.close();
	}

}
