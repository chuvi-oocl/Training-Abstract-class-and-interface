package myPackage;

public class VehicleProblemSolver {
    protected static int budget;
    public VehicleProblemSolver(int budget){
        this.budget = budget;
    }
    public static void solve() {
        final int DrivingCost = 500;
        final int BusCost = 300;
        final int TrainCost = 400;
        final int PlaneCost = 1000;

        String result = "Xiaoming can choose: ";
        if(budget >= DrivingCost){
            result+= "Driving ";
        }
        if(budget >= BusCost){
            result+= "Bus ";
        }
        if(budget >= TrainCost){
            result+= "Train ";
        }
        if(budget >= PlaneCost){
            result+= "Plane ";
        }

        System.out.println(result);

    }
}
