class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashMap<Integer, Integer> mp = new HashMap<>();
     int c =0;
     for (int i=0;i<nums.length;i++){
        if(!mp.containsKey(nums[i])){
        mp.put(nums[i],1) ; 
        }
        else{
            c=1;
        }
     } 
     if (c==1)   {
        return true;
     }
     else{
        return false;
     }
    }
}