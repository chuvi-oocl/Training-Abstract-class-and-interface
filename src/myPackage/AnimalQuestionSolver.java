package myPackage;

import java.util.HashMap;

public class AnimalQuestionSolver {
    protected static int totalMoney, totalAmount;
    public AnimalQuestionSolver(int totalMoney, int totalAmount){
        this.totalMoney = totalMoney;
        this.totalAmount = totalAmount;
    }

    public static void solve(){
        final int COCK_MONEY = 5;
        final int COCK_AMOUNT = 1;
        final int HEN_MONEY = 3;
        final int HEN_AMOUNT = 1;
        final int CHICKEN_MONEY = 1;
        final int CHICKEN_AMOUNT = 3;

        final int COCK_AMOUNT_MAX = totalAmount/COCK_AMOUNT;
        final int HEN_AMOUNT_MAX = totalAmount/HEN_AMOUNT;
        final int CHICKEN_AMOUNT_MAX = totalAmount/CHICKEN_AMOUNT;

        int[] result = {0, 0, 0};

        for (int i = 0; i <= COCK_AMOUNT_MAX; i++){
            for (int j = 0; j <= HEN_AMOUNT_MAX; j++){
                for (int k = 0; k <= CHICKEN_AMOUNT_MAX; k++){
                    if((i+j+k) > totalAmount){
                        continue;
                    }
                    else if((i*COCK_AMOUNT+j*HEN_AMOUNT+k*CHICKEN_AMOUNT) == totalAmount && (i*COCK_MONEY+j*HEN_MONEY+k*CHICKEN_MONEY)==totalMoney){
                        result[0] = i;
                        result[1] = j;
                        result[2] = k;
                        break;
                    }
                }
            }
        }
        System.out.println("Cock : "+ (result[0]*COCK_AMOUNT)+ ", Hen : "+(result[1]*HEN_AMOUNT)+", Chicken : "+(result[2]*CHICKEN_AMOUNT));

        return;
    }
}
