class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currTank = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            currTank += diff;
            totalTank += diff;
            if(currTank < 0) {
                start = i + 1;
                currTank = 0;
            }
        }
        return totalTank >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        GasStation obj = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(obj.canCompleteCircuit(gas, cost));
    }
}