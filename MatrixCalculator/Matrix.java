package MatrixCalculator;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
	Scanner scanner;
	
	Matrix(){
		this.scanner = new Scanner(System.in);
	}
	
	public String menu() {
		System.out.println("*****Welcome****");
		System.out.println("Enter Equation using following operators.");
		System.out.println("Kindly separate the operands and operators using comma.");
		System.out.println("Max Numbers of Matrices allowed: 02");
		System.out.println("+ for Addition.");
		System.out.println("- for subtraction.");
		System.out.println("* for Matrix Multiplication");
		System.out.println("/ for Scalar multiplication.");
		System.out.println("^ for transpose.");
		String data = this.scanner.nextLine().toString();
		return data;
	}
	
	public void display(double[][] matrix ) {
		int m = matrix.length;
		int n = matrix[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((int) matrix[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
	
public double[][] populate() {
	Random rand = new Random();
	System.out.println("Enter Row Size");
	int m = this.scanner.nextInt();
	System.out.println("Enter column size");
	int n = this.scanner.nextInt();
	 double[][] array = new double[m][n];
     for (int i = 0; i < array.length; i++) {
    	 for (int j = 0; j < array[i].length; j++) {
             array[i][j] = rand.nextInt(9) + 1;
    	 }
     }
     return array;
	}


public double[][] addition(double[][] m1, double[][] m2) {
    int m = m1.length;
    int n = m1[0].length;
    double[][] c = new double[m][n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            c[i][j] = m1[i][j] + m2[i][j];
    return c;
}

public double[][] subtraction(double[][] m1, double[][] m2) {
    int m = m1.length;
    int n = m1[0].length;
    double[][] c = new double[m][n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            c[i][j] = m1[i][j] - m2[i][j];
    return c;
}

public  double[][] MatrixMultiplication(double[][] matrix1, double[][] matrix2) {
    int m1 = matrix1.length;
    int n1 = matrix1[0].length;
    int m2 = matrix2.length;
    int n2 = matrix2[0].length;
    if (n1 != m2) throw new RuntimeException("Illegal matrix dimensions.");
    double[][] c = new double[m1][n2];
    for (int i = 0; i < m1; i++)
        for (int j = 0; j < n2; j++)
            for (int k = 0; k < n1; k++)
                c[i][j] += matrix1[i][k] * matrix2[k][j];
    return c;
}

public double[][] ScalarMultiplication(double[][] matrix){
	System.out.println("Enter Multiplier");
	double multiplier = this.scanner.nextDouble();
	int m = matrix.length;
    int n = matrix[0].length;
    double[][] c = new double[m][n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            c[i][j] = matrix[i][j]*multiplier;
    return c;
}

public static double[][] transpose(double[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    double[][] b = new double[n][m];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            b[j][i] = matrix[i][j];
    return b;
}

}

