class Solution {
    public boolean hasDuplicate(int[] nums) {

        ArrayList<Integer> vus = new ArrayList<>();

        for (int i : nums) {
            if (vus.contains(i)){
                    return true;
                }
                else{
                    vus.add(i);
                }
        }
        return false;
        
    }
}