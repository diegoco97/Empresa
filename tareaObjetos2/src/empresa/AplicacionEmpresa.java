/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import datos.Empleados;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class AplicacionEmpresa {
    
    public static void main(String[] args) {
        
        Empleados trabajador1 = new Empleados();
        Empleados trabajador2 = new Empleados();
        Empleados trabajador3 = new Empleados();
        Empleados trabajador4 = new Empleados();
        Empleados trabajador5 = new Empleados();
        
        trabajador1.setNombre(JOptionPane.showInputDialog("ingrese el nombre del primer empleado"));
        trabajador1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del primer empleado")));
        trabajador1.setDireccion(JOptionPane.showInputDialog("ingrese la direcion del primer empleado"));
        trabajador1.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de telefono del primmer empleado")));
        
        trabajador2.setNombre(JOptionPane.showInputDialog("igrse el nombre del segundo empleado"));
        trabajador2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese la eda del segundo empleado")));
        trabajador2.setDireccion(JOptionPane.showInputDialog("ingrese la direcion dl segundo empleado"));
        trabajador2.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese el telefono del segundo empleado")));
        
        trabajador3.setNombre(JOptionPane.showInputDialog("ingrese el nombre del trecer empleado"));
        trabajador3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese la eda del trecer empleado00")));
        trabajador3.setDireccion(JOptionPane.showInputDialog("ingrese la direcion del trecer empleado"));
        trabajador3.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese el telefono del trecer empleado")));
        
        trabajador4.setNombre(JOptionPane.showInputDialog("ingrese el nombre del cuarto empleado"));
        trabajador4.setEdad(Integer.parseInt("ingese la edad del cuarto empleado"));
        trabajador4.setDireccion(JOptionPane.showInputDialog("ingrese la direcion del cuarto empleado"));
        trabajador4.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese el telefono del cuarto empleado")));
        
        trabajador5.setNombre(JOptionPane.showInputDialog("ingrese el nombre del quinto empleado"));
        trabajador5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del quinto empleado")));
        trabajador5.setDireccion(JOptionPane.showInputDialog("ingrese la direcion del quinto empleado"));
        trabajador5.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese el telefono el quinto empleado")));
    
    }
    
}
