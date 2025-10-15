/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jonathan Adrian
 */
public class Guardian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salarioBase = 2000000; // monedas de oro
        double descuentoSalud = salarioBase * 0.04;
        double descuentoPension = 2000000 * 0.05; // = 100000
        double totalDescuentos = descuentoSalud + descuentoPension;
        double salarioNeto = salarioBase - totalDescuentos;
        
        System.out.println("El salario base es:" + salarioBase + "monedas de oro");
        System.out.println("Descuento por salud magica:" + descuentoSalud);
        System.out.println("Descuento por protección de Pensión:" + descuentoPension);
        System.out.println("Total descuentos:" + totalDescuentos);
        System.out.println("Tu saldo final es de " + salarioNeto + "monedas de oro. ¡Preparate para tu proxima aventura!");
        
    
    
    
    
    
    
    
    }
    
}
