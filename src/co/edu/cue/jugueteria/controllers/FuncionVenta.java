package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.DetalleVenta;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class FuncionVenta {
    public void prepararVenta(Juguete juguetes[], Cliente clientes[], Empleado empleados[]){
        Empleado prepaEmpleado = null;
        Cliente prepacliente=null;
        int cantiproduc=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a comprar"));
        DetalleVenta detallesdeventa[]=new DetalleVenta[cantiproduc];
        for (int x=0;x<cantiproduc;x++){
            boolean confirm=false;

            do {
                String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete");
                for (int y = 0; y < 100; y++) {
                    if (String.valueOf(juguetes[y]) == "null") {
                        break;
                    } else if (juguetes[y].getNombre().equalsIgnoreCase(nameJuguete)) {
                        confirm = true;
                        DetalleVenta detalleventa = new DetalleVenta(juguetes[x], Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de existencias a comprar de este juguete")));
                        detallesdeventa[x] = detalleventa;
                        break;
                    }
                }
                if (!confirm){
                    JOptionPane.showMessageDialog(null,"El juguete a buscar no se encontro, intente nuevamente");
                }
            }while (confirm==false);
        }
        boolean confirmcliente=false;
        for (int x=0;x<5;x++){
            if(String.valueOf(clientes[x])=="null"){
                break;
            }else if (clientes[x].getNombre().equalsIgnoreCase(JOptionPane.showInputDialog("Digite el nombre del cliente"))){
                confirmcliente=true;
                prepacliente=clientes[x];
                break;
            }
        }
        if (!confirmcliente){
            JOptionPane.showMessageDialog(null,"EL cliente no se a encontrado");
        }
        //---------------------------------------------------------------------------------------------------------------------------EMpleados preparacion
        boolean confirmEmpleado=false;
        for (int x=0;x<5;x++){
            if(String.valueOf(empleados[x])=="null"){
                break;
            }else if (empleados[x].getNombre().equalsIgnoreCase(JOptionPane.showInputDialog("Digite el nombre del empleado"))){
                confirmEmpleado=true;
                prepaEmpleado=empleados[x];
                break;
            }
        }
        if (!confirmEmpleado){
            JOptionPane.showMessageDialog(null,"EL empleado no se a encontrado");
        }
        JugueteService jugueteService=new JugueteService();
        jugueteService.crearVenta(detallesdeventa,prepacliente,prepaEmpleado,juguetes);
    }

}
