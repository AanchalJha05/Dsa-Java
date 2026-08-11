
/* 
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        sequences(0,nums,res,current);
        return new ArrayList<>(res); // as return type hashset nhi hai arraylist hai isiliye hamne change kiya hai 
        
    }
    public void sequences(int index,int nums[],Set<List<Integer>> res,List<Integer> current){
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        //pick
        sequences(index+1,nums,res,current);
        
        current.remove(current.size()-1);
        //not pick
        sequences(index+1,nums,res,current);
        
    }
}
*/

/* 
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsequences(0,nums,res,current);
        return res;
        
    }
    public void subsequences(int index,int nums[],List<List<Integer>> res,List<Integer> current){
        if(index==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subsequences(index+1,nums,res,current);
        current.remove(current.size()-1);
        subsequences(index+1,nums,res,current);

    }

}

*/
/* 
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        int sum=0;
        sequences(candidates, target,sum,0, res, current);
        return res;
        
    }
    public void sequences(int[] candidates,int target,int remaining,int sum,int index,List<List<Integer>> res,List<Integer> current){
        
        if(sum==target){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length || target<sum) return;
        
        
        current.add(candidates[index]);
        sum += candidates[index];
        sequences(candidates, target,sum,index, res, current);
        
        current.remove(current.size()-1);
        sum-=candidates[index];
        
        sequences(candidates, target,sum,index+1, res, current);
        
    }
} */
/* 
    // isme tum hashset use kr skte hai but tle aayega islye list check krne ki wajahaye ham element skip krr rhe h 
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        int sum=0;
        sequences(candidates,target,sum,0,res,current);
        return res;
    }
    public void sequences(int[] candidates,int target,int sum,int index,List<List<Integer>> res,List<Integer> current){
        
        if(sum==target){
            res.add(new ArrayList<>(current));
            return;
        } 
        if(index==candidates.length || sum>target) return;
        
        current.add(candidates[index]);
        sum = sum+candidates[index];
        sequences(candidates,target,sum,index+1,res,current);
        current.remove(current.size()-1);

        sum = sum-candidates[index];
        while(index+1<candidates.length && candidates[index]== candidates[index+1]){
            index++;
        }
        sequences(candidates,target,sum,index+1,res,current);


    }
}*/























