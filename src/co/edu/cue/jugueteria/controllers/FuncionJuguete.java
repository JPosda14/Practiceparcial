package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;
import java.lang.*;

public class FuncionJuguete {
    Juguete juguetes[]=new Juguete[100];

    public Juguete[] getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Juguete[] juguetes) {
        this.juguetes = juguetes;
    }

    public void prepararJuguete(Juguete juguetes[]) {
        JugueteService jugueteService = new JugueteService();
        jugueteService.crearJugueteArreglo(juguetes);
    }

    public void generarPrueba(Juguete juguetes[]){
        for (int x=0;x<50;x++){
            Juguete juguete=new Juguete("Producto "+x,x*1000,x+1,(Math.random()*((2-0)+1))+0);
            juguetes[x]=juguete;
        }
    }

    public void informarJuguetesPorTipo(Juguete juguetes[],String material){
        int contador=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                contador=juguetes[x].getMaterial()==material?contador+1:contador;
            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad de juguetes de "+ material +" es de "+contador);
    }
    public void cantidadJuguetes(Juguete juguetes[]){
        int contador=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad de juguetes es: "+contador);
    }

    public void TotalValor(Juguete juguetes[]){
        double resultado=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                resultado+=(juguetes[x].getPrecio()*juguetes[x].getInventario());
            }
        }
        JOptionPane.showMessageDialog(null,"El valor de todos los juguetes es de: "+resultado);
    }

    public void maxminTipo(Juguete juguetes[]){
        int contadorPlasti=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                contadorPlasti=juguetes[x].getMaterial()=="Plastico"?contadorPlasti+1:contadorPlasti;
            }
        }
        int contadorTela=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                contadorTela=juguetes[x].getMaterial()=="Tela"?contadorTela+1:contadorTela;
            }
        }
        int contadorElec=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                contadorElec=juguetes[x].getMaterial()=="Electronico"?contadorElec+1:contadorElec;
            }
        }
        int resultadomax=contadorElec;
        String stringmax="Electrico";
        if (resultadomax<contadorPlasti){
            resultadomax=contadorPlasti;
            stringmax="Plastico";
        } else if (resultadomax<contadorTela) {
            resultadomax=contadorTela;
            stringmax="Tela";
        }
        int resultadomin=contadorElec;
        String stringmin="Electrico";
        if (resultadomin>contadorPlasti){
            resultadomin=contadorPlasti;
            stringmin="Plastico";
        } else if (resultadomin>contadorTela) {
            resultadomin=contadorTela;
            stringmin="Tela";
        }
        JOptionPane.showMessageDialog(null,"Hay mas juguetes de tipo "+stringmax+" con "+resultadomax);
        JOptionPane.showMessageDialog(null,"Hay menos juguetes de tipo "+stringmin+" con "+resultadomin);
    }

    public void mayorPrecio(Juguete juguetes[]){
        double precioComp=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor o precio a comparar: "));
        Juguete juguetesfilter[]=new Juguete[100];
        int contfilter=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else{
                if (juguetes[x].getPrecio()>precioComp){
                    juguetesfilter[contfilter]=juguetes[x];
                    contfilter++;
                }
            }
        }
        String cadenafilter="Los juguetes de que valen mas de "+precioComp+" son\n";
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetesfilter[x])=="null"){
                break;
            } else{
               cadenafilter+=juguetesfilter[x].getNombre()+"          "+" Precio:"+juguetesfilter[x].getPrecio()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cadenafilter);
    }

    public void aumentarExistencias(Juguete juguetes[]){
        boolean confirm=false;
        String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete que desea aumentar las existencias");
        int aumento=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else if (juguetes[x].getNombre()==nameJuguete){
                confirm=true;
                int cantiaumento=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a aumentar: "));
                juguetes[x].setInventario(juguetes[x].getInventario()+cantiaumento);
                aumento=juguetes[x].getInventario()+cantiaumento;
                break;
            }
        }
        if (confirm){
            JOptionPane.showMessageDialog(null,"Aumento exitoso, el aumento del producto fue: "+aumento);
        } else {
            JOptionPane.showMessageDialog(null,"El juguete no fue encontrado");
        }
    }

    public void disminuirExistencias(Juguete juguetes[]){
        boolean confirm=false;
        String nameJuguete=JOptionPane.showInputDialog("Digite el nombre del juguete que desea aumentar las existencias");
        int decremento=0;
        for (int x=0;x<100;x++){
            if (String.valueOf(juguetes[x])=="null"){
                break;
            } else if (juguetes[x].getNombre()==nameJuguete){
                confirm=true;
                int cantiaumento=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a disminuir: "));
                juguetes[x].setInventario(juguetes[x].getInventario()-cantiaumento);
                decremento=juguetes[x].getInventario()-cantiaumento;
                break;
            }
        }
        if (confirm){
            JOptionPane.showMessageDialog(null,"Aumento exitoso, el decremento del producto fue: "+decremento);
        } else {
            JOptionPane.showMessageDialog(null,"El juguete no fue encontrado");
        }
    }
}