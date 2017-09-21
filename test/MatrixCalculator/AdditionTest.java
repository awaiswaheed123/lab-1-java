package test.MatrixCalculator;
import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

import MatrixCalculator.app;

public class AdditionTest {

	@Test
	public void test() {
		app app1 = new app();
		double[][] matrixA = new double[2][2];
		double[][] matrixB = new double[2][2];
		double[][] matrixC = new double[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrixA[i][j]=1.0;
				matrixB[i][j]=1.0;
				matrixC[i][j]=2.0;
			}
		}
		double[][] matrixD = app1.matrix.addition(matrixA, matrixB);

		Assert.assertArrayEquals(matrixC, matrixD);
	}

}
