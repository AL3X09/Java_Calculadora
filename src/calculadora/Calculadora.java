/*
ejercicio calculadora exadecimal con todas las operaciones
 */

package calculadora;

import javax.swing.JOptionPane;

/**
 * @author david castiblanco
 * @author Alex cifuentes
 */

public class Calculadora {

    float peso;
    double estatura;
    float MC,MC1;
    
public Calculadora(){
    
}     
        
public void solicitud(){
    peso=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese su peso en kilogramos "));
    estatura=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese su estatura en centimetros"));
    }
public void proceso(){
    MC1=(float) (estatura/(100));
    MC1=MC1*MC1;
    MC=peso/MC1;
}
public void clasificar(){
    
}
public void mostrar(){
    if(MC<=18.5){
        JOptionPane.showMessageDialog(null," Como su peso es "+MC+" le puedo decir que !! ");
        JOptionPane.showMessageDialog(null," Usted se encuentra bajo de peso ");
    }
    else if(MC>18.5 && MC<24.9){
        JOptionPane.showMessageDialog(null," Como su peso es "+MC+" le puedo decir que !! ");
        JOptionPane.showMessageDialog(null," Usted se encuentra normal de peso ");
    }
    else if(MC>25.0 && MC<29.9){
        JOptionPane.showMessageDialog(null," Como su peso es "+MC+" le puedo decir que !! ");
        JOptionPane.showMessageDialog(null," Usted se encuentra en sobre peso ");
    }
    else if(MC>30.0){
    JOptionPane.showMessageDialog(null," Como su peso es "+MC+" le puedo decir que !! ");
        JOptionPane.showMessageDialog(null," Usted es un gordo desgraciado ");
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Calculadora imc=new Calculadora();
    imc.solicitud();
    imc.proceso();
    imc.mostrar();
    }
    
    
}
