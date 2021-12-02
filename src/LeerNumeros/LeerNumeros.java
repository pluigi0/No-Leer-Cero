
package LeerNumeros;

import javax.swing.JOptionPane;

/*
Leer numeros hasta que se introduzca un 0. 
Para cada uno indicar si es par o impar.
*/
public class LeerNumeros {
    public static void main(String[] args) {
        int numero;
        float resultado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        while (numero != 0){
            resultado = numero % 2;
            
            if (resultado == 1.0){
            JOptionPane.showMessageDialog(null, "el numero "+numero+ " es impar ");
            }
            else if(resultado == 0.0){
            JOptionPane.showMessageDialog(null, "el numero "+numero+ " es PAR ");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        }
            JOptionPane.showMessageDialog(null, "CAGADA! presionaste el numero 0");
        
        
    }
}
