public class Entorns {
    public static void main(String[] args){
        int[][] matriu = new int[4][4];
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length;j++){
                matriu[i][j] = i+j;
                System.out.println(matriu[i][j]);
            }
        }

    }
}
