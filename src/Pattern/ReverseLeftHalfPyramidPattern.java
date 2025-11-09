package Pattern;

public class ReverseLeftHalfPyramidPattern {
    public static void main(String[] args) {

        int n = 5;
        int i,j;
        for(i=n-1;i>=0;i--){
            for(j=0;j<=n-1;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

