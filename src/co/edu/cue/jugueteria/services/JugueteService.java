package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.*;

import javax.swing.*;

public class JugueteService {
    public void crearJugueteArreglo(Juguete juguetes[]){
        boolean confirm=false;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null") {
                Juguete juguete=new Juguete(JOptionPane.showInputDialog("Digite el nombre del juguete"),Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del juguete")),Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de inventario del juguete")));
                juguetes[x]=juguete;
                confirm=true;
                break;
            }
        }
        if (!confirm){
            JOptionPane.showMessageDialog(null,"El inventario de juguetes esta completo");
        }
    }
    public void crearJuguete(){
        Juguete juguete=new Juguete(JOptionPane.showInputDialog("Digite el nombre del juguete"),Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del juguete")),Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de inventario del juguete")));
    }

    public void crearVenta(DetalleVenta detalleVenta[],Cliente cliente,Empleado empleado,Juguete juguetes[]){
        VentaJuguete ventaJuguete=new VentaJuguete(JOptionPane.showInputDialog("Digite la fecha de venta"),cliente,empleado,((Math.random()*((80-0)+1))+0),detalleVenta);

    }
}
