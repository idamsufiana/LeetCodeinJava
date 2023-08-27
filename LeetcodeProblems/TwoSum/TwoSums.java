import java.util.HashMap;

public class TwoSums {

    static int[] twoSum(int[] nums, int target) {


        int output[] = new int[2];
        HashMap<Integer, Integer> dataIndexMap = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            int number2 = target - nums[i]; 
            if(dataIndexMap.containsKey(number2)){
                output[0] = dataIndexMap.get(number2);
                output[1] = i;
            }else{
                dataIndexMap.put(nums[i], i);
            }
        }

        return output;

    }


    public static void main(String[] args) throws Exception {
        int[] height = {2,7,11,15};
        int[] res = twoSum(height,9);
        for (int res2 : res) {
            System.out.println(res2);
        }

    }
    
}
