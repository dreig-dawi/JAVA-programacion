package ejercicio_clase;

import java.util.Scanner;

public class login
{
    static Scanner sc = new Scanner(System.in);
    static String usuario_correcto = "1";
    static String contrasena_correcta = "asdfg";
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Introduce el nombre de usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            String contrasena = sc.nextLine();
            if (check(usuario, contrasena))
            {
                System.out.println("Tu usuario y contraseña son correctas");
                System.out.println("Has hecho " + i + " intentos");
                System.exit(0);
            }
            i = contador(i);
            System.out.println("El usuario y contraseña son incorrectas, te quedan " + (3 - i) + " intentos");
        }
    }

    public static boolean check(String nombre, String contra)
    {
        if (nombre.equals(usuario_correcto) && contra.equals(contrasena_correcta))
        {
            return true;
        }
        return false;
    }

    public static int contador(int intentos)
    {
        if (intentos == 3)
        {
            System.out.println("Te has quedado sin intentos");
            System.exit(0);
        }
        return intentos;
    }
}