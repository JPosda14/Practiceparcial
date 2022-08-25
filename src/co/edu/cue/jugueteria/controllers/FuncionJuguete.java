package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;
import java.lang.*;

public class FuncionJuguete {
    private JugueteService jugueteService=new JugueteService();

    public void prepararJuguete() {

        String name=JOptionPane.showInputDialog("Digite el nombre del juguete");
        double price=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del juguete"));
        int unids=Integer.parseInt(JOptionPane.showInputDialog("Digite las unidades de existencia del producto"));
        jugueteService.crearJuguete(name,price,unids);
    }

    public void generarPrueba(){
        for (int x=0;x<50;x++){
            String name="Producto "+(x+1);
            double price=(x+1)*1000;
            int unids=(x+1);
            jugueteService.crearJugueteArreglo(name,price,unids,x);
        }
    }

    public void prepararInformarJuguetesPorTipo(String material){
        String type=material;
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