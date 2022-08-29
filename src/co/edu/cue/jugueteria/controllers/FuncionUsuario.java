package co.edu.cue.jugueteria.controllers;



import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.Impl.ClienteService;
import co.edu.cue.jugueteria.services.Impl.EmpleadoService;

import javax.swing.*;

public class FuncionUsuario {
    public ClienteService clienteService=new ClienteService();
    public EmpleadoService empleadoService=new EmpleadoService();
    public void prepararCliente(){
        String name=JOptionPane.showInputDialog("Digite el nombre del cliente");
        String id=JOptionPane.showInputDialog("Digite la cedula del cliente");
        String telephone=JOptionPane.showInputDialog("Digite el numero de telefono del cliente");
        String direction=JOptionPane.showInputDialog("Digite la direccion del cliente");
        String birthday=JOptionPane.showInputDialog("Digite la fecha de cumpleaños del cliente");
        String email=JOptionPane.showInputDialog("Digite el correo del cliente");
        clienteService.crearClienteArreglo(name,id,telephone,direction,birthday,email);
    }

    public void prepararEmpleado(){
        String name=JOptionPane.showInputDialog("Digite el nombre del empleado");
        String id=JOptionPane.showInputDialog("Digite la cedula del empleado");
        String telephone="Digite el telefono del empleado";
        String direction="Digite la direccion del empleado";
        double salary=Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del empleado"));
        String dateinscription=JOptionPane.showInputDialog("Digite la fecha de ingreso del empleado");
        empleadoService.crearEmpleadoArreglo(name,id,telephone,direction,salary,dateinscription);
    }

    public void generarCliente(){
        for (int x=0;x<10;x++){
            String name="Cliente "+(x+1);
            String id="95146"+x;
            String telephone="31697852"+x;
            String direction="calle "+x+"barrio xd";
            String birthday="23 de julio de 2003";
            String email="default@gmail.com";
            clienteService.crearCliente(name,id,telephone,direction,birthday,email,x);
        }
    }

    public void generarEmpleado(){
        for (int x=0;x<3;x++){
            String name="Empleado "+(x+1);
            String id="65516"+x;
            String telephone="31945815"+x;
            String direction="Avenida "+x+"barrio cd";
            double salary=(x+1)*1235;
            String dateinscription="Dia x de la vida";
            empleadoService.crearEmpleado(name,id,telephone,direction,salary,dateinscription,x);
        }
    }

    public void preparaInformeCliente(){
        clienteService.informarMejorCLiente();
    }

    public void prepararInformeEmpleado(){
        empleadoService.informarMejorEmpleado();
    }






}
