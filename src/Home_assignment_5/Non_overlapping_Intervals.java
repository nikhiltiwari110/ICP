class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)-> Integer.compare(a[1],b[1]));
        int count = 1;
        int pe = intervals[0][1];
        for(int i = 1; i < intervals.length; i++ ){
            if(pe<=intervals[i][0]){
                count++;
                pe = intervals[i][1];
            }
            
        }
        return intervals.length-count;

    }
}
