import java.util.Scanner;

public class J
{
    static Scanner rd = new Scanner(System.in);
    public static void joaoJoao()
    {
        boolean dif1 = false;
        boolean dif2 = false;
        boolean dif3 = false;
        boolean dif4 = false;

        int[] dificuldades = {1, 2, 2, 3, 1, 2, 2, 3, 2, 1};

        for(int i = 1; i < dificuldades.length; i++)
        {
            System.out.println(i);

            if(dificuldades[i] == 1)
            {
                dif1 = true;
            }
            if(dificuldades[i] == 2)
            {
                dif2 = true;
            }
            if(dificuldades[i] == 3)
            {
                dif3 = true;
            }
            if(dificuldades[i] == 4)
            {
                dif4 = true;
            }
        }

        int faltam = 0;
        if(!dif1)
        {
            faltam++;
        }
        if(!dif2)
        {
            faltam++;
        }
        if(!dif3)
        {
            faltam++;
        }
        if(!dif4)
        {
            faltam++;
        }

        System.out.println("    ");
        System.out.println(faltam);
    }
}