package co.edu.cue.jugueteria.application;

import co.edu.cue.jugueteria.controllers.FuncionJuguete;
import co.edu.cue.jugueteria.controllers.FuncionUsuario;
import co.edu.cue.jugueteria.controllers.FuncionVenta;
import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.model.Juguete;

import javax.swing.*;

public class jugueteria {
    public static void main(String[] args) {
        Cliente clientes[]=new Cliente[20];
        Empleado empleados[]=new Empleado[5];
        Juguete juguetes[]=new Juguete[100];
        FuncionJuguete funcionJuguete=new FuncionJuguete();
        funcionJuguete.generarPrueba(juguetes);
        FuncionUsuario funcionUsuario=new FuncionUsuario();
        funcionUsuario.generarCliente(clientes);
        funcionUsuario.generarEmpleado(empleados);
        FuncionVenta funcionVenta=new FuncionVenta();
        int option;
    do{
        option=JOptionPane.showOptionDialog(
                null,"Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] { "Editar", "Informe", "Vender","Salir" },null);


            switch (option) {
                case 0:
                    int option0=JOptionPane.showOptionDialog(
                            null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Agregar Juguete","Aumentar exitencias de juguete","Disminuir existencias de juguete", "Agregar Cliente", "Agregar Empleado", "Salir"}, null);
                    switch (option0){
                        case 0:
                            funcionJuguete.prepararJuguete(juguetes);
                            break;
                        case 1:
                            funcionJuguete.aumentarExistencias(juguetes);
                            break;
                        case 2:
                            funcionJuguete.disminuirExistencias(juguetes);
                            break;
                        case 3:
                            funcionUsuario.prepararCliente(clientes);
                            break;
                        case 4:
                            funcionUsuario.prepararEmpleado(empleados);
                            break;
                    }
                    break;
                case 1:
                    int option1 = JOptionPane.showOptionDialog(
                            null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Cantidad de juguetes por tipo", "Cantidad total de juguetes", "Valor total de juguetes", "Moda de tipo de juguetes", "Comparacion por precio", "Salir"}, null);
                    switch (option1) {
                        case 0:
                            int opmaterial = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                    new Object[]{"Plastico", "Tela", "Electrico"}, null);
                            switch (opmaterial) {
                                case 0:
                                    funcionJuguete.informarJuguetesPorTipo(juguetes, "Plastico");
                                    break;
                                case 1:
                                    funcionJuguete.informarJuguetesPorTipo(juguetes, "Tela");
                                    break;
                                case 2:
                                    funcionJuguete.informarJuguetesPorTipo(juguetes, "Electrico");
                                    break;
                            }
                            break;
                        case 1:
                            funcionJuguete.cantidadJuguetes(juguetes);
                            break;
                        case 2:
                            funcionJuguete.TotalValor(juguetes);
                            break;
                        case 3:
                            funcionJuguete.maxminTipo(juguetes);
                            break;
                        case 4:
                            funcionJuguete.mayorPrecio(juguetes);
                            break;
                    }
                    break;
                case 2:
                    funcionVenta.prepararVenta(juguetes,clientes,empleados);
                    break;
            }
        }while (option!=3);


    }

}
