/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoExterno;

/**
 *
 * @author faang
 */
public class Radix {
    int separar(int value, int iteracion) {
		int x=0;
		switch(iteracion) {
		case 0:
			x = value%10; //Esto serviría para obtener las unidades de la primera iteracion
			break;
		case 1:
			x = ((((value%100000)%10000)%1000)%100)/10; //Esto para las decenas
			break;
		case 2:
			x = (((value%100000)%10000)%1000)/100;  //centenas
			break;
		case 3:
			x = ((value%100000)%10000)/1000;    //millares
			break;
		case 4:
			x = (value%100000)/10000;
			break;
		case 5:
			x = value/100000;
			break;
		}
		return x;
	}
    void Sort (int value) {
		for(int i=0; i<6; i++) {
			int digito = separar(value,i);
			escribir(digito);
		}
	}
}
