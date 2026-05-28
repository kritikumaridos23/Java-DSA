 class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }
            if(candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(nums));
    }
}