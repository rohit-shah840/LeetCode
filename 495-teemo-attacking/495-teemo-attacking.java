class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration==0) return 0;
        int sum=0;
        for(int i=0;i<timeSeries.length-1;i++){
            sum+=Math.min(timeSeries[i+1] - timeSeries[i],duration);
        }
        return sum+duration;
    }
}