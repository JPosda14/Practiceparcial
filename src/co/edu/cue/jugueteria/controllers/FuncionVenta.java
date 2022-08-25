package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.DetalleVenta;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class FuncionVenta {
    private JugueteService jugueteService= new JugueteService();
    public void prepararVenta(){
        int cantiproductos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a comprar"));
        jugueteService.crearVenta(cantiproductos);

    }

}
