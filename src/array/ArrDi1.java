package array;

public class ArrDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int count = 0;
        for (int row = 0; row < 2; row++) {
            for(int col = 0; col < 3; col++){
                arr[row][col] = count++;
            }
        }

        for (int row = 0; row < 2; row++) {
            for(int col = 0; col < 3; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}

