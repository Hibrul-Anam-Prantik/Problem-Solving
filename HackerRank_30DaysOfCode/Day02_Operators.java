// package HackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day02_Operators 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        sc.close();
        TotalMealCost cost = new TotalMealCost();
        cost.solve(meal_cost, tip_percent, tax_percent);
    }
}

class TotalMealCost 
{
    public void solve(double meal_cost, int tip_percent, int tax_percent) 
    {
        double tip = meal_cost * (tip_percent*1.0)/100;
        double tax = meal_cost * (tax_percent*1.0)/100;
        double total = meal_cost + tip + tax;
        int totalCost = (int) Math.round(total);   
        System.out.println(totalCost);     
    }
}
