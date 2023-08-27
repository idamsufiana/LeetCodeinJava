import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    static List<List<Integer>> subsets(int[] nums) {
        
         Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans);
        return ans;
        
    }

    static void solve(int ind,int[]nums,ArrayList<Integer>temp, List<List<Integer>>ans){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;//for duplicate checking
            temp.add(nums[i]);
            solve(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args)
    {
        int[] num = {1,2,3};
     
        System.out.print( subsets(num) );
    }
    
}
