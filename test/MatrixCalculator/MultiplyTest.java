package test.MatrixCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import MatrixCalculator.app;

public class MultiplyTest {

	@Test
	public void test() {
		app app1 = new app();
		double[][] matrixA = new double[2][2];
		double[][] matrixB = new double[2][2];
		double[][] matrixC = new double[2][2];
		matrixA[0][0] = 4.0;
		matrixA[0][1] = 2.0;
		matrixA[1][0] = 5.0;
		matrixA[1][1] = 7.0;
		matrixB[0][0] = 3.0;
		matrixB[0][1] = 9.0;
		matrixB[1][0] = 6.0;
		matrixB[1][1] = 8.0;
		matrixC[0][0] = 24.0;
		matrixC[0][1] = 52.0;
		matrixC[1][0] = 57.0;
		matrixC[1][1] = 101.0;
		double[][] matrixD = app1.matrix.MatrixMultiplication(matrixA, matrixB);

		Assert.assertArrayEquals(matrixC, matrixD);
	}

}
