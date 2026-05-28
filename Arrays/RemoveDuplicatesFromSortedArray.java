class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj =
            new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2};
        int k = obj.removeDuplicates(nums);
        System.out.println("k = " + k);
        for(int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
