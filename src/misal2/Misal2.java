/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misal2;

/**
 *
 * @author Asus
 */
public class Misal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jmin = 0, jmax = 0, c = 0;
        int[][] a = new int[3][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ilk massiv:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            int dmax = a[i][0], dmin = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > dmax) {
                    dmax = a[i][j];
                    jmax = j;
                } else if (a[i][j] < dmin) {
                    dmin = a[i][j];
                    jmin = j;
                }
            }
            System.out.println((i + 1) + " - inci setrin lokal maximumu = " + a[i][jmax] + "  ;  " + (i + 1) + " - inci setrin lokal minmumu = " + a[i][jmin]);
            c = a[i][jmax];
            a[i][jmax] = a[i][jmin];
            a[i][jmin] = c;
            //System.out.println(dmin + " " + dmax);
        }
        System.out.println();
        System.out.println("Setrelin max ve min - lerinin yerlerinin deyishilmish formasi: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int imax = 0, imin = 0;
        jmax = 0;
        jmin = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > a[imax][jmax]) {
                    imax = i;
                    jmax = j;
                } else if (a[i][j] < a[imin][jmin]) {
                    imin = i;
                    jmin = j;
                }
            }
        }
        System.out.println();
        System.out.println("Qlobal maximum = " + a[imax][jmax] + "  ;  " + "Qlobal minimum = " + a[imin][jmin]);

        c = a[imax][jmax];
        a[imax][jmax] = a[imin][jmin];
        a[imin][jmin] = c;

        System.out.println();
        System.out.println("Massivim max ve min - lerinin yerlerinin deyishmish formasi: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
