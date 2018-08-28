import java.util.ArrayList;
import java.util.Scanner;

public class GetNumbers {


    public GetNumbers(ArrayList<Integer> nums){

        Scanner numScan = new Scanner(System.in);

for(int i = 1; i < 6; i++) {
    System.out.print("Enter number " + i + ":");
    nums.add(numScan.nextInt());
}
    }

    public void getMin(ArrayList<Integer> nums){
       int checker = nums.get(0);
        for(int i = 0; i < nums.size(); i++)
            if (checker > nums.get(i)) {
                checker = nums.get(i);
            }
        System.out.println("the smallest number is: " + checker);
    }

    public void getMax(ArrayList<Integer> nums) {
        int checker = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (checker < nums.get(i)) {
                checker = nums.get(i);
            }
        }
        System.out.println("the largest number is: " + checker);

    }

    public void getAveAndSum(ArrayList<Integer> nums){
        int total = 0;
        for (int i = 0; i < nums.size(); i++){
             total = total + nums.get(i);
        }
        System.out.println("The total of these numbers is: " + total);
        System.out.println("The average of these numbers is: " + total / nums.size());
    }

}












