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
                        DetalleVenta detalleventa = new DetalleVenta(juguetes[y], Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de existencias a comprar de este juguete")));
                        detallesdeventa[x] = detalleventa;
                        System.out.println(detalleventa.getJuguete().getNombre());
                        System.out.println(detalleventa.getCantidadJuguetes());
                        System.out.println(detalleventa.getJuguete().getPrecio());
                        break;
                    }
                }
                if (!confirm){
                    JOptionPane.showMessageDialog(null,"El juguete a buscar no se encontro, intente nuevamente");
                }
            }while (confirm==false);
        }
        boolean confirmcliente=false;
        do {
            String clienteask = JOptionPane.showInputDialog("Digite el nombre del cliente");
            for (int x = 0; x < 5; x++) {
                if (String.valueOf(clientes[x]) == "null") {
                    break;
                } else if (clientes[x].getNombre().equalsIgnoreCase(clienteask)) {
                    confirmcliente = true;
                    prepacliente = clientes[x];
                    break;
                }
            }
            if (!confirmcliente) {
                JOptionPane.showMessageDialog(null, "EL cliente no se a encontrado");
            }
        }while (!confirmcliente);
        //---------------------------------------------------------------------------------------------------------------------------EMpleados preparacion
            boolean confirmEmpleado = false;
        do {
            String empleadoask = JOptionPane.showInputDialog("Digite el nombre del empleado");
            for (int x = 0; x < 5; x++) {
                if (String.valueOf(empleados[x]) == "null") {
                    break;
                } else if (empleados[x].getNombre().equalsIgnoreCase(empleadoask)) {
                    confirmEmpleado = true;
                    prepaEmpleado = empleados[x];
                    break;
                }
            }
            if (!confirmEmpleado) {
                JOptionPane.showMessageDialog(null, "EL empleado no se a encontrado");
            }
        }while (!confirmEmpleado);
        System.out.println("sds");
        JugueteService jugueteService=new JugueteService();
        jugueteService.crearVenta(detallesdeventa,prepacliente,prepaEmpleado,juguetes);
    }

}
