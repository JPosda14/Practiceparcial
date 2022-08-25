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
        FuncionJuguete funcionJuguete=new FuncionJuguete();
        funcionJuguete.generarPrueba();
        FuncionUsuario funcionUsuario=new FuncionUsuario();
        funcionUsuario.generarCliente();
        funcionUsuario.generarEmpleado();
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
                            funcionJuguete.prepararJuguete();
                            break;
                        case 1:
                            funcionJuguete.prepararAumentoExistencias();
                            break;
                        case 2:
                            funcionJuguete.prepararDisminuirExistencias();
                            break;
                        case 3:
                            funcionUsuario.prepararCliente();
                            break;
                        case 4:
                            funcionUsuario.prepararEmpleado();
                            break;
                    }
                    break;
                case 1:
                    int option1 = JOptionPane.showOptionDialog(
                            null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Cantidad de juguetes por tipo", "Cantidad total de juguetes", "Valor total de juguetes", "Moda de tipo de juguetes", "Comparacion por precio","Cuidados juguete", "Salir"}, null);
                    switch (option1) {
                        case 0:
                            int opmaterial = JOptionPane.showOptionDialog(null, "Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                    new Object[]{"Plastico", "Tela", "Electrico"}, null);
                            switch (opmaterial) {
                                case 0:
                                    funcionJuguete.prepararInformarJuguetesPorTipo("Plastico");
                                    break;
                                case 1:
                                    funcionJuguete.prepararInformarJuguetesPorTipo( "Tela");
                                    break;
                                case 2:
                                    funcionJuguete.prepararInformarJuguetesPorTipo("Electrico");
                                    break;
                            }
                            break;
                        case 1:
                            funcionJuguete.prepararCantidadJuguetes();
                            break;
                        case 2:
                            funcionJuguete.prepararTotalValor();
                            break;
                        case 3:
                            funcionJuguete.prepararMaxminTipo();
                            break;
                        case 4:
                            funcionJuguete.prepararMayorPrecio();
                            break;
                        case 5:
                            funcionJuguete.prepararCuidadoToy();
                            break;
                    }
                    break;
                case 2:
                    funcionVenta.prepararVenta();
                    break;
            }
        }while (option!=3);
    }

}
