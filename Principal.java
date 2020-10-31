package OrdenamientoExterno;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.BufferedReader;
import java.util.Scanner;
//import java.io.FileReader;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
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
		catch(Exception ex){
			System.out.println("Mensaje: " + ex.getMessage());
		}
		finally {
			try {
				if (sc!=null) sc.close();
			}
			catch (Exception ex2) {
				System.out.println("Mensaje: " + ex2.getMessage());
			}
		}
	}
        
        public void lectura(){
            
        }

}