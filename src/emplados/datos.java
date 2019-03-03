/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplados;

import AplicacionEmplados.Empleados;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class datos {
    
    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("Manuel Maldonadp",25,"calle 7 # 15- 07" , 8945280);
        Empleados empleado2 = new Empleados("Samuel Morenro",35,"Carrera 3 # 18- 45", 8702302);
        Empleados empleado3 = new Empleados("Diego Rodriges",40,"Carrera 7 # 84- 72", 7293048);
        Empleados empleado4 = new Empleados("Juam Mendes",21,"calle 5 # 70- 10", 9657482);
        Empleados empleado5 = new Empleados("Marcos Perez,",32, "carerra 5 # 20-02",8705020);
       
       int menu; 
        menu= Integer.parseInt(JOptionPane.showInputDialog("                          menu \n 1.enpleado1 \n 2.enpleado2 \n 3.enpleado3 \n 4.enpleado4 \n 5.enpleado5 "));
        
        switch (menu){
            case 1:  JOptionPane.showMessageDialog(null, "el nombre del enpleado es: "+ empleado1.getNombre()  + "\n su edad es de: " + empleado1.getEdad() + "\n la direccion de su vivienda es " + empleado1.getDireccion()+ "\n y el telefono es: " + empleado1.getTelefono());
            break;
            case 2: JOptionPane.showMessageDialog(null, "el nombre del enpleado es: "+ empleado2.getNombre()  + "\n su edad es de: " + empleado2.getEdad() + "\n la direccion de su vivienda es " + empleado2.getDireccion()+ "\n y el telefono es: " + empleado2.getTelefono());
            break;
            case 3: JOptionPane.showMessageDialog(null, "el nombre del enpleado es: "+ empleado3.getNombre()  + "\n su edad es de: " + empleado3.getEdad() + "\n la direccion de su vivienda es " + empleado3.getDireccion()+ "\n y el telefono es: " + empleado3.getTelefono());
            break;
            case 4: JOptionPane.showMessageDialog(null, "el nombre del enpleado es: "+ empleado4.getNombre()  + "\n su edad es de: " + empleado4.getEdad() + "\n la direccion de su vivienda es " + empleado4.getDireccion()+ "\n y el telefono es: " + empleado4.getTelefono());
            break;
            case 5: JOptionPane.showMessageDialog(null, "el nombre del enpleado es: "+ empleado5.getNombre()  + "\n su edad es de: " + empleado5.getEdad() + "\n la direccion de su vivienda es " + empleado5.getDireccion()+ "\n y el telefono es: " + empleado5.getTelefono());
            break;
        }
        
        
     
    }
}
 