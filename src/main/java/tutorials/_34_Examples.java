package tutorials;

public class _34_Examples {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j){
                    matrix[i][j]=0;
                    continue;
                }
                matrix[i][j]=2;
                matrix[j][i]=1;

            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
