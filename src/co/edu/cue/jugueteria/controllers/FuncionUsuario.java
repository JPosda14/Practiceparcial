package co.edu.cue.jugueteria.controllers;



import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.Impl.ClienteService;
import co.edu.cue.jugueteria.services.Impl.EmpleadoService;

import javax.swing.*;

public class FuncionUsuario {
    public void prepararCliente(Cliente clientes[]){
        ClienteService clienteService=new ClienteService();
        clienteService.crearClienteArreglo(clientes);
    }

    public void prepararEmpleado(Empleado empleados[]){
        EmpleadoService empleadoService=new EmpleadoService();
        empleadoService.crearEmpleadoArreglo(empleados);
    }

    public void generarCliente(Cliente clientes[]){
        for (int x=0;x<10;x++){
            Cliente cliente=new Cliente("Cliente "+x,"123"+x,"456"+x,"Manzana "+x,"23/08/2003","Cliente@hotmail.com");
            clientes[x]=cliente;
        }
    }

    public void generarEmpleado(Empleado empleados[]){
        for (int x=0;x<3;x++){
            Empleado empleado=new Empleado("Empleado "+x,"321"+x,"951"+x,"Carrera "+x,10000*x,"03/03/20"+x);
            empleados[x]=empleado;
        }
    }





}
