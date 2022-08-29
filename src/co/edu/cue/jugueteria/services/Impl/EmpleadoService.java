package co.edu.cue.jugueteria.services.Impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.UsuarioService;

import javax.swing.*;

public class EmpleadoService implements UsuarioService{
    public Empleado empleados[]=new Empleado[5];

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void crearEmpleadoArreglo(String name, String id, String telefono, String direction, double salario, String datein){
        boolean confirm=false;
        for (int x=0;x<5;x++){
            if (String.valueOf(empleados[x])=="null") {
                Empleado empleado=new Empleado(name,id,telefono,direction,salario,datein);
                empleados[x]=empleado;
                confirm=true;
                JOptionPane.showMessageDialog(null,"Se han guardado los cambios :)");
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El inventario de empleados esta completo");
        }
    }
    public void crearEmpleado(String name,String id,String telephone,String direction,double salary, String dateinscription, int cont){
        Empleado empleado=new Empleado(name,id,telephone,direction,salary,dateinscription);
        empleados[cont]=empleado;
    }

    public void informarMejorEmpleado(){
        Empleado empleadoMayor=empleados[0];
        for (int x=0;x< empleados.length;x++){
            if (String.valueOf(empleados[x])=="null"){
                break;
            }
            if (empleadoMayor.getJuguetesVendidos()<empleados[x].getJuguetesVendidos()){
                empleadoMayor=empleados[x];
            }
        }
        JOptionPane.showMessageDialog(null,"El empleado con mayores ventas es: "+empleadoMayor.getNombre()+" con "+empleadoMayor.getJuguetesVendidos()+" ventas");
    }



    @Override
    public void crearUsuario(){
        Empleado empleado=new Empleado(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado: ")),JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado: "));

    }
}
