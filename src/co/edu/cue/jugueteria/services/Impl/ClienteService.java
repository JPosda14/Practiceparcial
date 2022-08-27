package co.edu.cue.jugueteria.services.Impl;

import co.edu.cue.jugueteria.controllers.FuncionUsuario;
import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Usuario;
import co.edu.cue.jugueteria.services.UsuarioService;

import javax.swing.*;

public class ClienteService implements UsuarioService{
    public Cliente clientes[]=new Cliente[20];

    public Cliente[] getClientes() {
        return clientes;
    }

    public void crearClienteArreglo(String name, String id, String telefono, String direction, String correo, String diaCumple){
        boolean confirm=false;
        for (int x=0;x<20;x++){
            if (String.valueOf(clientes[x])=="null") {
                Cliente cliente=new Cliente(name,id,telefono,direction,correo,diaCumple);
                clientes[x]=cliente;
                confirm=true;
                if (confirm){
                    JOptionPane.showMessageDialog(null,"Se han guardado los cambios: \n"+cliente.getNombre()+"\n"+cliente.getTelefono()+"\n"+cliente.getCedula());
                }
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El inventario de Clientes esta completo");
        }
    }

    public void crearCliente(String name,String id,String telephone,String direction,String birthday,String email,int cont){
        Cliente cliente=new Cliente(name,id,telephone,direction,birthday,email);
        clientes[cont]=cliente;
    }

    public void informarMejorCLiente(){
        Cliente clienteMayor=clientes[0];
        for (int x=0;x<clientes.length;x++){
            if (String.valueOf(clientes[x])=="null"){
                break;
            }
            if (clienteMayor.getCantidadJuguetes()<clientes[x].getCantidadJuguetes()){
                clienteMayor=clientes[x];
            }
        }
        JOptionPane.showMessageDialog(null,"El mejor cliente es: "+clienteMayor.getNombre()+" con "+clienteMayor.getCantidadJuguetes()+" ventas");
    }
    @Override
    public void crearUsuario() {
        Cliente cliente=new Cliente(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),JOptionPane.showInputDialog("Digite el dia de cumpleaños del Cliente"),JOptionPane.showInputDialog("Digite el correo"));
    }
}//hecho informe
