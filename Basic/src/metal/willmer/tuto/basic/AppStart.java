    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metal.willmer.tuto.basic;
import javax.swing.JOptionPane;//Import swing lib
/**
 *
 * @author wbarahona
 */
public class AppStart {
    public static void main(String[] args){
        
        System.out.println("Hola Mundo resultado: ");
        
        Demo myDemoObj = new Demo(5);
        Demo myDemoObjTwo = new Demo(5, "Hola", 4);
        
        System.out.println("Viendo el metodo de la clase Demo: " + myDemoObjTwo.cuadrado(4.5, 5.4));
        JOptionPane.showMessageDialog(null, "Hello Bitch...");
    }
}