package desafio6.pkg7;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio67 {
    public static void main(String[] args) {
        int numero, negativo;
        
        numero = 1;
        negativo = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("O número 0 encerra o processo\nDigite um número:"));
            
            if (numero < 0) {
                negativo += numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros negativos é: "+negativo);
    }   
}
