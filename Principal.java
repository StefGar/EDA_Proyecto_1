package OrdenamientoExterno;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.BufferedReader;
import java.util.Scanner;
//import java.io.FileReader;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException{
            //int metodo;
        Utilidades.menu1();
        Scanner sc1 = new Scanner(System.in);           
        int op1 = sc1.nextInt();
        do {
            switch (op1){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                default:
                    break;
            }
        }while(op1!=4);
        
        Utilidades.menu2();
        Scanner sc2 = new Scanner(System.in);  
        int op2 = sc2.nextInt();
        do{
            switch (op2){
                case 1:
                    break;

                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;

            }
        }while(op2 != 4);    
    }
    
	
        
    public static void lectura(){
        String path = "src/test/archivo.txt";
        File file = new File (path);
        //File fichero = new File(arch);
        //FileReader readArch = new FileReader(fichero);
        //BufferedReader in = new BufferedReader(readArch);
        Scanner sc = null;
        int op=0;

        try {
                String[] lines = null;
                sc = new Scanner(file);
                int i = 1;


                while(sc.hasNextLine()) {
                        String linea = sc.nextLine();
                        lines = linea.split(", ");
                        /*StringBuffer sb = new StringBuffer(linea);
                        for(String x:lines) {
                                sb.append(x);
                        }
                        System.out.println(sb.toString());*/

                        System.out.println("Alumno: " + i);
                        System.out.println("Apellidos: " + lines[0]);
                        System.out.println("Nombre: " + lines[1]);
                        System.out.println("Numero de cuenta como texto: " + lines[2]);
                        int numCuenta = Integer.parseInt(lines[2]);
                        System.out.println("Numero de cuenta como entero: " + numCuenta);
                        i++;
                }

        }
        catch(Exception e){
                System.out.println("Mensaje: " + e.getMessage());
        }
        finally {
                try {
                        if (sc!=null) sc.close();
                }
                catch (Exception e2) {
                        System.out.println("Mensaje: " + e2.getMessage());
                }
        }
    }
}
