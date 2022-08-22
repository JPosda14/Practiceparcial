package co.edu.cue.jugueteria.services.Impl;

import co.edu.cue.jugueteria.controllers.FuncionUsuario;
import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Usuario;
import co.edu.cue.jugueteria.services.UsuarioService;

import javax.swing.*;

public class ClienteService implements UsuarioService{

    public void crearClienteArreglo(Cliente clientes[]){
        boolean confirm=false;
        for (int x=0;x<20;x++){
            if (String.valueOf(clientes[x])=="null") {
                Cliente cliente=new Cliente(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),JOptionPane.showInputDialog("Digite el dia de cumpleaños del Cliente"),JOptionPane.showInputDialog("Digite el correo"));
                clientes[x]=cliente;
                confirm=true;
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El inventario de Clientes esta completo");
        }
    }
    @Override
    public void crearUsuario() {
        Cliente cliente=new Cliente(JOptionPane.showInputDialog("Digite el nombre del cliente"),JOptionPane.showInputDialog("Digite el numero de cedula: "),JOptionPane.showInputDialog("Digite el numero de telefono: "),JOptionPane.showInputDialog("Digite la direccion del usuario: "),JOptionPane.showInputDialog("Digite el dia de cumpleaños del Cliente"),JOptionPane.showInputDialog("Digite el correo"));
    }
}
