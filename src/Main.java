import complex.Complex;
import matrix.Matrix;

import static io.InOut.Out;

public class Main {
    public static void testComplex() {
        Out("~~~~~~ Testing complex numbers ~~~~~~");
        Complex x = new Complex(), y = new Complex();
        Out("Input complex x");
        x.InputC();
        Out("Input complex y");
        y.InputC();

        Out("\nx:");
        x.OutputC();
        Out("Trigonometric form of x:");
        x.OutputTrigonometric();
        Out("\ny:");
        y.OutputC();
        Out("Trigonometric form of y:");
        y.OutputTrigonometric();

        Complex z = y.AddC(x);
        Out("\nx + y = ");
        z.OutputC();

        z = y.MulC(x);
        Out("\nx * y = ");
        z.OutputC();
    }

    public static void testMatrix() {
        Out("~~~~~~ Testing matrices ~~~~~~");
        Matrix A = new Matrix(3, 3);
        Out("Input matrix A");
        A.InputMatrix();

        double[][] bmatr = new double[A.getRows()][A.getCols()];
        for (int i = 0; i < bmatr.length; ++i)
            for (int j = 0; j < bmatr[0].length; ++j)
                bmatr[i][j] = bmatr.length * i + j;
        Matrix B = new Matrix(bmatr);
        Out("\nMatrix B:");
        B.OutputMatrix();

        Matrix C = A.AddM(B);
        if (C != null) {
            Out("\nA + B:");
            C.OutputMatrix();
        }

        C = A.MulM(B);
        if (C != null) {
            Out("\nA * B:");
            C.OutputMatrix();
        }

        C = A.Transpose();
        Out("\nTransposed A:");
        C.OutputMatrix();

        Complex det = A.det();
        if (det != null) {
            Out("\nDeterminant of A:");
            det.OutputC();
        }

        det = B.det();
        if (det != null) {
            Out("\nDeterminant of B:");
            det.OutputC();
        }
    }

    public static void main(String[] args) {
        testComplex();
        testMatrix();
    }
}