class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
         int n = growTime.length;
         int arr[][]= new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=plantTime[i];
            arr[i][1]=growTime[i];
        }
        
        Arrays.sort(arr,(a,b)-> b[1] - a[1]);
        int bloomDay=0,seedPlantingDay=0;
        for(int i=0;i<n;i++){
            int ptime=arr[i][0];
            int gtime=arr[i][1];
            bloomDay = Math.max(bloomDay,seedPlantingDay+ptime+gtime);
            seedPlantingDay = seedPlantingDay+ptime;
        }
        return bloomDay;
    }
}