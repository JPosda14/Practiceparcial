package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.DetalleVenta;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.Impl.EmpleadoService;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class FuncionVenta extends JugueteService{
    public void prepararVenta(Cliente clientes[], Empleado empleados[],Juguete juguetes[]){
        int cantiproductos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a comprar"));
        crearVenta(cantiproductos,clientes,empleados,juguetes);

    }

}
