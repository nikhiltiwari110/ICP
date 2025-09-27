package Home_assignment_1;

import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int [][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(arrows(points));
    }
    public static int arrows(int [] [] points){
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int pe = points[0][1];
        for(int i = 1; i < points.length; i++){
            int [] ca = points[i];
            int cs = ca[0];
            int ce = ca[1];
            //check if current start is less than previous end or not
            if(pe<cs){
                pe = ce;
                count++;
            }
        }
        return count;
    }

}
