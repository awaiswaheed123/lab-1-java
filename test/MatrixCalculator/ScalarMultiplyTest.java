package test.MatrixCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import MatrixCalculator.app;

public class ScalarMultiplyTest {

	@Test
	public void test() {
		app app1 = new app();
		double[][] matrixA = new double[2][2];
		int multiplier = 2;
		double[][] matrixC = new double[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrixA[i][j]=1.0;
				matrixC[i][j]=2.0;
			}
		}
		double[][] matrixD = app1.matrix.ScalarMultiplication(matrixA);

		Assert.assertArrayEquals(matrixC, matrixD);
	}

}
