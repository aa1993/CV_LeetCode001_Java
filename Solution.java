class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean found = false;
        int i = 0;
        int j = 0;
        for(i= 0 ; i<nums.length && !found ;i++)
            for(j=i+1 ; j<nums.length && !found ;j++)
                if(nums[i]+nums[j]==target)
                {
                    found = true;
                    break;
                }
        int erg[] = new int[2];
        if(found){
            i--;
            erg[0] = i;
            erg[1] = j;
            return erg;
        }
        erg[0]=0;
        erg[1]=0;
        return erg;
    }
}