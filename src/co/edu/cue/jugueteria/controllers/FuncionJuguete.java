package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.JugueteService;
import co.edu.cue.jugueteria.services.ProveedorService;

import javax.swing.*;
import java.lang.*;

public class FuncionJuguete extends ProveedorService{



    private JugueteService jugueteService=new JugueteService();


    public void prepararcompraJuguete() {
        boolean confirm=false;
        do {
            String codeProveedor=JOptionPane.showInputDialog("Digite el codigo del proveedor");
            for (int x=0;x<getProveedores().length;x++){
                System.out.println(getProveedores()[x].getCodeProveedor());
                if (codeProveedor==getProveedores()[x].getCodeProveedor()){
                    jugueteService.comprarJuguete(codeProveedor,x);
                    confirm=true;
                    break;
                }
            }
        }while (!confirm);
    }

    public void generarDatosPrueba(){
        jugueteService.comprarJugueteArreglo();
    }

    public void prepararInformarJuguetesPorTipo(String material){
        jugueteService.informarJuguetesPorTipo(material);
    }

    public void prepararAumentoExistencias(){
        String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete al que desea aumentarle las existencias");
        jugueteService.aumentarExistencias(nameJuguete);
    }

    public void prepararDisminuirExistencias(){
       String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete al que desea disminuirle las existencias");
       jugueteService.disminuirExistencias(nameJuguete);
    }

    public void prepararCantidadJuguetes(){
        jugueteService.cantidadJuguetes();
    }

    public void prepararTotalValor(){
        jugueteService.TotalValor();

    }

    public void prepararMaxminTipo(){
        jugueteService.maxminTipo();
    }

    public void prepararMayorPrecio(){
        jugueteService.mayorPrecio();

    }

    public void prepararCuidadoToy(){
        jugueteService.cuidadoToy();
    }
}