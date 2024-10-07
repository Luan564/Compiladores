//Codificado por: sAfOrAs
public class SyGPiramideNumerica
{
 
    public static void main(String[] arg)
    {
        int limite=0;
        limite=Integer.parseInt(arg[0]);
        for(int i=1; i<=limite;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
     
    }
}
