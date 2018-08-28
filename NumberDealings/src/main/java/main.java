import java.util.ArrayList;

public class main {

    private static ArrayList<Integer> nums = new ArrayList<Integer>();

    public static void main(String[] args){

        GetNumbers n = new GetNumbers(nums);
        n.getMin(nums);
        n.getMax(nums);
        n.getAveAndSum(nums);
    }





}
