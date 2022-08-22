package co.edu.cue.jugueteria.services.Impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

import javax.swing.*;

public class EmpleadoService implements UsuarioService{
    public void crearEmpleadoArreglo(Empleado empleados[]){
        boolean confirm=false;
        for (int x=0;x<5;x++){
            if (String.valueOf(empleados[x])=="null") {
                Empleado empleado=new Empleado(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado: ")),JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado: "));
                empleados[x]=empleado;
                confirm=true;
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El inventario de empleados esta completo");
        }
    }
    @Override
    public void crearUsuario(){
        Empleado empleado=new Empleado(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado: ")),JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado: "));

    }
}
