public class JFo_6_VLoopShape {
    public void criarRetangulo(int largura , int altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }                               
            }
            System.out.println();
        }

    }

    public void criarTriangulo(int altura){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == altura - 1 || j == 0 || j == i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
