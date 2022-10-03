public class Main {
    public static void main(String[] args) {
        // Пункт 1
        short d[] = new short [7];
        short k = 15;
        for(int i = 0; i<7; i++) {
            d[i] = k;
            k -= 2;
            //System.out.print(d[i] + " ");
        }

        // Пункт 2
        double x[] = new double[11];
        for(int i = 0; i<11; i++) {
            x[i] = -12+Math.random()*14;
            //System.out.print(x[i] + " ");
        }

        // Пункт 3
        double D[][] = new double[6][11];
        for(int i = 0; i<6; i++) {
            for(int j = 0; j<11; j++) {
                double X = x[j];
                if(d[i] == 5) {
                    D[i][j] = Math.atan(Math.pow(((X-5)/14), 2) * (2/Math.tan(X) - 1));
                } else if(d[i] == 9 || d[i] == 11 || d[i] == 15) {
                    D[i][j] = Math.tan(Math.tan(Math.pow(X, X)));
                } else {
                    D[i][j] = Math.cos(Math.pow((2 * Math.pow(((1/3)/Math.pow(Math.exp(1), X)), 2)), 2));
                }
            }
        }

        for(int i = 0; i<6; i++) {
            for(int j = 0; j<11; j++) {
                String number = String.format("%.2f", D[i][j]);
                System.out.print(number + "  ");
            }
            System.out.println();
        }
    }
}