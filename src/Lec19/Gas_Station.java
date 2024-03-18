package Lec19;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel=0;
        int ans=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i];
            fuel-=cost[i];
            total+=gas[i];
            total-=cost[i];
            if(fuel<0){
                fuel=0;
                ans=i+1;
            }
        }
        return (total<0) ? -1: ans;
    }

}
