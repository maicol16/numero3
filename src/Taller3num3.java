import java.util.Scanner;
public class Taller3num3
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca los elementos que desea en la matriz:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Introduzca todos los elementos que puso en la matriz:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.print("Números impares posisitvos o negativos:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("numeros impares positivos o negativos:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
