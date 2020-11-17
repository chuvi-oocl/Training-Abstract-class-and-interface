import myPackage.*;
import java.util.HashMap;
import java.util.zip.CheckedInputStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Q1: ");
        AnimalQuestionSolver aqSolver = new AnimalQuestionSolver(100, 100);
        aqSolver.solve();

        System.out.println("Q2: ");
        VehicleProblemSolver vpSolver = new VehicleProblemSolver(500);
        vpSolver.solve();

    }
}
