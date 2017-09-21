package test.MatrixCalculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import MatrixCalculator.app;

public class TransposeTest {

	@Test
	public void test() {
		app app1 = new app();
		double[][] matrixA = new double[2][2];
		double[][] matrixC = new double[2][2];
		matrixA[0][0] = matrixA[0][1] = 2.0;
		matrixA[1][0] = matrixA[1][1] = 9.0;
		matrixC[0][0] = matrixC[1][0] = 2.0;
		matrixC[0][1] = matrixC[1][1] = 9.0;
		double[][] matrixD = app1.matrix.transpose(matrixA);

		Assert.assertArrayEquals(matrixC, matrixD);
	}

}
