package pl.waw.sgh.email;

public class Arrays2D {
    public static void main(String[] args) {

        int[][] arr2D = new int [3][4];

        int[] wiersze = new int [3];

        int[] kolumny = new int [4];

        int suma=0;


        arr2D[0][3]=56;
        arr2D[0][0]=676;
        arr2D[1][1]=569;
        arr2D[2][3]=245;
        arr2D[2][3]=867;
        arr2D[2][0]=10;

        System.out.println("Length of arr2D: " +arr2D.length);
        System.out.println(" cols of arr2D: " +arr2D[0].length);

        for (int i=0;i<arr2D.length;i++){


            for (int j=0;j<arr2D[i].length;j++) {
                System.out.print(arr2D[i][j] + "\t");
                suma=suma+arr2D[i][j];
                wiersze[i]=arr2D[i][j]+wiersze[i];
                kolumny[j]=arr2D[i][j]+kolumny[j];
            }

            System.out.println("| "+ wiersze[i]);
        }

        System.out.println("___________________");
        for (int i=0;i<kolumny.length;i++)
        {
            System.out.print(kolumny[i]+ " ");
        }

        System.out.print("  | "+ suma);

    }
}
