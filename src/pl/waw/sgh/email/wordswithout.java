package pl.waw.sgh.email;

public class wordswithout {

    public static void main(String[] args) {

        String[] slowo={"a","b","c","d"};
        String[] bez={"a"};
        int powtorzenia=0;

        System.out.println("slowo dlugosc: " +slowo.length + " ,bez dlugosc: " + bez.length);

        for (int i=0; i<slowo.length;i++)
        {
            if (bez[0] == slowo[i])
            {
                for (int j=0;j<bez.length;j++)
                {
                    if(slowo[i+j]!=bez[j]) break;

                    if(j==(bez.length-1) & slowo[i+j]==bez[j]) powtorzenia++;
                }
            }


        }

        System.out.println("Powtorzenia" +powtorzenia);


    }
}
