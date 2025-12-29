package Array;

public class CalculateAverage {
    public static void main(String[] args) {

        int a []={10,20,30,40,50};
        int avg=0;
        for(int i=0;i<a.length;i++){
            avg=avg+a[i];
        }
        avg=avg/a.length;
        System.out.println(avg);
    }
}
