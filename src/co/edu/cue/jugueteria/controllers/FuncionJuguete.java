package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.JugueteService;
import co.edu.cue.jugueteria.services.ProveedorService;

import javax.swing.*;
import java.lang.*;

public class FuncionJuguete extends JugueteService{


    public void prepararcompraJuguete(Proveedor proveedores[]) {
        boolean confirm=false;
        do {
            String codeProveedor=JOptionPane.showInputDialog("Digite el codigo del proveedor");
            for (int x=0;x<proveedores.length;x++){
                System.out.println(proveedores[x].getCodeProveedor());
                if (codeProveedor.equalsIgnoreCase(proveedores[x].getCodeProveedor())){
                    comprarJuguete(codeProveedor,x,proveedores);
                    confirm=true;
                    break;
                }
            }
        }while (!confirm);
    }

    public void generarDatosPrueba(Proveedor proveedores[]){
        comprarJugueteArreglo(proveedores);
    }

    public void prepararInformarJuguetesPorTipo(String material,Proveedor proveedores[]){
        informarJuguetesPorTipo(material,proveedores);
    }

    public void prepararAumentoExistencias(){
        String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete al que desea aumentarle las existencias");
        aumentarExistencias(nameJuguete);
    }

    public void prepararDisminuirExistencias(){
       String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete al que desea disminuirle las existencias");
       disminuirExistencias(nameJuguete);
    }

    public void prepararCantidadJuguetes(){
        cantidadJuguetes();
    }

    public void prepararTotalValor(){
        TotalValor();

    }

    public void prepararMaxminTipo(Proveedor proveedores[]){
        maxminTipo(proveedores);
    }

    public void prepararMayorPrecio(){
        mayorPrecio();

    }

    public void prepararCuidadoToy(Proveedor proveedores[]){
        cuidadoToy(proveedores);
    }
    //juguete hecho
}