class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int num : nums) {
            if(k < 2 || num > nums[k - 2]) {
                nums[k++] = num;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII obj =
            new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1,1,1,2,2,3};
        int k = obj.removeDuplicates(nums);
        System.out.println("k = " + k);
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}