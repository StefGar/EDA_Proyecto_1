
package OrdenamientoExterno;

/**
 *
 * @author faang
 */
public class Menus {
    public void menu1(int op1){
        
        do {
        System.out.println("1 - Polifase");
        System.out.println("2 - Mezcla equilibrada");
        System.out.println("3 - Radix");
        System.out.println("0 - Salir");

        //op1=Integer.parseInt(teclado.next());
        //op2 = 0; //Reinicia el valor de op2!.
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
        }while(op1 != 0);
    }
    
    public void menu2(int op2){
        
        do {
        System.out.println("Ordenar por:");
        System.out.println("1 - Apellido");
        System.out.println("2 - Nombre");
        System.out.println("3 - No. de cuenta");
        System.out.println("0 - Salir");

        //op1=Integer.parseInt(teclado.next());
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
        }while(op2 != 0);
    }
}
