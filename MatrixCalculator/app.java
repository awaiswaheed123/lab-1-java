package MatrixCalculator;
import MatrixCalculator.Matrix;
import java.util.Scanner;
import java.util.StringTokenizer;

public class app {
	 public static Matrix matrix;
	Scanner scanner;
	
	public app() {
		this.matrix = new Matrix();
		this.scanner = new Scanner(System.in);
	}
	
	public static  void main(String[] args) {
		app app1 = new app();
			String data = app1.matrix.menu();
			StringTokenizer st = new StringTokenizer(data, ",");
			String[] data1 = new String[5];
			int i = 0;
			while(st.hasMoreTokens()) {
				data1[i] = st.nextToken();
				i++;
			}
			
			//Checking The equation
			if (data1[0].equals("^")) {
				double[][] matrixA = app.matrix.populate();
				System.out.println("");
				System.out.println("First Matrix is");
				app.matrix.display(matrixA);
				System.out.println("");
				System.out.println("First matrix Transpose is");
				double[][] matrixAT = app.matrix.transpose(matrixA);
				app.matrix.display(matrixAT);
				
				if(i>2) {
					if (data1[2].equals("+") || data1[2].equals("-") || data1[2].equals("*") || data1[2].equals("/")) {
						double[][] matrixB = app.matrix.populate();
						System.out.println("");
						System.out.println("second Matrix is");
						app.matrix.display(matrixB);
						
						if (data1[3].equals("^")) {
							double[][] matrixBT = app.matrix.transpose(matrixB);
							System.out.println("");
							System.out.println("Second Matrix Transpose is");
							app.matrix.display(matrixBT);
							switch(data1[2]) {
							case("+"):
								double [][] result = app.matrix.addition(matrixAT, matrixBT);
								System.out.println("\nResult of Addition:");
								app.matrix.display(result);
								break;
							
							case("-"):
								double [][] result1 = app.matrix.subtraction(matrixAT, matrixBT);
								System.out.println("\nResult of Subtraction:");
								app.matrix.display(result1);
								break;
								
							case("*"):
								double [][] result2 = app.matrix.MatrixMultiplication(matrixAT, matrixBT);
								System.out.println("\nResult of Matrix Multiplication:");
								app.matrix.display(result2);
								break;
								
							case("/"):
								double [][] result3 = app.matrix.ScalarMultiplication(matrixAT);
								System.out.println("\nResult of Scalar Multiplication:");
								app.matrix.display(result3);
								break;
								
							default:
								System.out.println("\n*****Wrong Input*****\n");
								break;
							}
						}
					}
				}
			}
			else {
				double[][] matrixA = app.matrix.populate();
				app.matrix.display(matrixA);
				double matrixB[][] = app.matrix.populate();
				app.matrix.display(matrixB);
				if(data1[2].equals("^")) {
					 matrixB = app.matrix.transpose(matrixB); 
					 System.out.println("");
						System.out.println("Second Matrix Transpose is");
						app.matrix.display(matrixB);
				}
				switch(data1[1]) {
				case("+"):
					double [][] result = app.matrix.addition(matrixA, matrixB);
					System.out.println("\nResult of Addition:");
					app.matrix.display(result);
					break;
				
				case("-"):
					double [][] result1 = app.matrix.subtraction(matrixA, matrixB);
					System.out.println("\nResult of Subtraction:");
					app.matrix.display(result1);
					break;
					
				case("*"):
					double [][] result2 = app.matrix.MatrixMultiplication(matrixA, matrixB);
					System.out.println("\nResult of Matrix Multiplication:");
					app.matrix.display(result2);
					break;
					
				case("/"):
					double [][] result3 = app.matrix.ScalarMultiplication(matrixA);
					System.out.println("\nResult of Scalar Multiplication:");
					app.matrix.display(result3);
					break;
					
				default:
					System.out.println("\n*****Wrong Input*****\n");
					break;
			}
		}
	}
}
