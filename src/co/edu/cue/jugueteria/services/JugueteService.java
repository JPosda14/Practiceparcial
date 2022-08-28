package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.Impl.ClienteService;
import co.edu.cue.jugueteria.services.Impl.EmpleadoService;

import javax.swing.*;

public class JugueteService {
    public Juguete juguetes[] = new Juguete[100];



    public Juguete[] getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Juguete[] juguetes) {
        this.juguetes = juguetes;
    }

    public void comprarJuguete(String codeProveedor, int cont) {
        ProveedorService proveedorService=new ProveedorService();
        boolean confirm = false;
        for (int x = 0; x < 100; x++) {
            System.out.println(proveedorService.proveedores[0].getJuguetes()[0].getNombre());
            if (String.valueOf(juguetes[x]) == "null") {
                confirm=true;
                String cadenaJuguetes = "Digite el juguete de proveedor que desea comprar \n\nLos juguetes de este proveedor son:\n\n";

                for (int i = 0; i < proveedorService.proveedores[cont].getJuguetes().length; i++) {
                    if (String.valueOf(proveedorService.proveedores[cont].getJuguetes()[i]) != "null") {
                        cadenaJuguetes += (i + 1) + ".  " + proveedorService.proveedores[cont].getJuguetes()[i].getNombre() + "       " + proveedorService.proveedores[cont].getJuguetes()[i].getPrecio() + "       " + proveedorService.proveedores[cont].getJuguetes()[i].getInventario() + "\n";
                    }
                }
                int optionJuguete = Integer.parseInt(JOptionPane.showInputDialog(cadenaJuguetes));
                int cantiJuguete = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de juguetes que desea comprar del proveedor, recuerde que el maximo que puede comprar es: " + proveedorService.proveedores[cont].getJuguetes()[optionJuguete - 1].getInventario()));
                boolean confirmExistencia=false;
                for (int j=0;j<juguetes.length;j++){
                    if (proveedorService.proveedores[cont].getJuguetes()[optionJuguete - 1].getNombre().equals(juguetes[j].getNombre())){
                        juguetes[j].setInventario(juguetes[j].getInventario()+cantiJuguete);
                        confirmExistencia=true;
                        break;
                    }
                }
                if (!confirmExistencia){
                    juguetes[x] = proveedorService.proveedores[cont].getJuguetes()[optionJuguete - 1];
                    juguetes[x].setInventario(cantiJuguete);
                }
            }
            if (!confirm) {
                JOptionPane.showMessageDialog(null, "El inventario de juguetes esta completo");
            }
        }
    }
        public void comprarJugueteArreglo(){
          ProveedorService proveedorService=new ProveedorService();
            System.out.println(proveedorService.proveedores[0]);
            Juguete juguete=proveedorService.proveedores[0].getJuguetes()[0];
            for (int i=0;i<5;i++){
                for (int j=0;j<8;j++){
                    juguete=proveedorService.proveedores[i].getJuguetes()[j];
                    System.out.println(juguete.getNombre());
                }
            }
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    System.out.println(juguete.getNombre());
                    juguetes[x]=juguete;
                }
            }
        }
        



        public void informarJuguetesPorTipo (String material){
        ProveedorService proveedorService=new ProveedorService();
            System.out.println(juguetes[3]); // se usan en esta funcion pero no se guardan los datos, es decir lanza un null en esta linea
            int contador = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    continue;
                } else {
                    Proveedor proveedor=null;
                    juguetes[x].getCodeProveedor();
                    for (int y=0;y<10;y++){
                        if (juguetes[x].getCodeProveedor()==proveedorService.proveedores[y].getCodeProveedor()){
                            proveedor=proveedorService.proveedores[y];
                        }
                    }
                    contador = proveedor.getMaterial()== material ? contador + 1 : contador;
                }
            }
            JOptionPane.showMessageDialog(null, "La cantidad de juguetes de " + material + " es de " + contador);
        }
        public void cantidadJuguetes () {
            int contador = 0;
            for (int x = 0; x < 100; x++) {
                System.out.println(juguetes[x]);
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    contador++;
                }
            }
            JOptionPane.showMessageDialog(null, "La cantidad de juguetes es: " + contador);
        }

        public void TotalValor () {
            double resultado = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    resultado += (juguetes[x].getPrecio() * juguetes[x].getInventario());
                }
            }
            JOptionPane.showMessageDialog(null, "El valor de todos los juguetes es de: " + resultado);
        }

        public void maxminTipo () {
        ProveedorService proveedorService=new ProveedorService();
            int contadorPlasti = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    Proveedor proveedor=null;
                    juguetes[x].getCodeProveedor();
                    for (int y=0;y<10;y++){
                        if (juguetes[x].getCodeProveedor()==proveedorService.proveedores[y].getCodeProveedor()){
                            proveedor=proveedorService.proveedores[y];
                        }
                    }
                    contadorPlasti = proveedor.getMaterial() == "Plastico" ? contadorPlasti + 1 : contadorPlasti;
                }
            }
            int contadorTela = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    Proveedor proveedor=null;
                    juguetes[x].getCodeProveedor();
                    for (int y=0;y<10;y++){
                        if (juguetes[x].getCodeProveedor()==proveedorService.proveedores[y].getCodeProveedor()){
                            proveedor=proveedorService.proveedores[y];
                        }
                    }
                    contadorTela = proveedor.getMaterial() == "Tela" ? contadorTela + 1 : contadorTela;
                }
            }
            int contadorElec = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    Proveedor proveedor=null;
                    juguetes[x].getCodeProveedor();
                    for (int y=0;y<10;y++){
                        if (juguetes[x].getCodeProveedor()==proveedorService.proveedores[y].getCodeProveedor()){
                            proveedor=proveedorService.proveedores[y];
                        }
                    }
                    contadorElec = proveedor.getMaterial() == "Electronico" ? contadorElec + 1 : contadorElec;
                }
            }
            int resultadomax = contadorElec;
            String stringmax = "Electrico";
            if (resultadomax < contadorPlasti) {
                resultadomax = contadorPlasti;
                stringmax = "Plastico";
            } else if (resultadomax < contadorTela) {
                resultadomax = contadorTela;
                stringmax = "Tela";
            }
            int resultadomin = contadorElec;
            String stringmin = "Electrico";
            if (resultadomin > contadorPlasti) {
                resultadomin = contadorPlasti;
                stringmin = "Plastico";
            } else if (resultadomin > contadorTela) {
                resultadomin = contadorTela;
                stringmin = "Tela";
            }
            JOptionPane.showMessageDialog(null, "Hay mas juguetes de tipo " + stringmax + " con " + resultadomax);
            JOptionPane.showMessageDialog(null, "Hay menos juguetes de tipo " + stringmin + " con " + resultadomin);
        }

        public void mayorPrecio () {
            double precioComp = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor o precio a comparar: "));
            Juguete juguetesfilter[] = new Juguete[100];
            int contfilter = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    break;
                } else {
                    if (juguetes[x].getPrecio() > precioComp) {
                        juguetesfilter[contfilter] = juguetes[x];
                        contfilter++;
                    }
                }
            }
            String cadenafilter = "Los juguetes de que valen mas de " + precioComp + " son\n";
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetesfilter[x]) == "null") {
                    break;
                } else {
                    cadenafilter += juguetesfilter[x].getNombre() + "          " + " Precio:" + juguetesfilter[x].getPrecio() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, cadenafilter);
        }

        public void aumentarExistencias (String name){
            boolean confirm = false;
            int aumento = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    continue;
                } else if (juguetes[x].getNombre().equalsIgnoreCase(name)) {
                    confirm = true;
                    int cantiaumento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a aumentar: "));
                    juguetes[x].setInventario(juguetes[x].getInventario() + cantiaumento);
                    aumento = juguetes[x].getInventario() + cantiaumento;
                    break;
                }
            }
            if (confirm) {
                JOptionPane.showMessageDialog(null, "Aumento exitoso, el aumento del producto fue: " + aumento);
            } else {
                JOptionPane.showMessageDialog(null, "El juguete no fue encontrado");
            }
        }

        public void disminuirExistencias (String name){
            boolean confirm = false;
            int decremento = 0;
            for (int x = 0; x < 100; x++) {
                if (String.valueOf(juguetes[x]) == "null") {
                    continue;
                } else if (juguetes[x].getNombre().equalsIgnoreCase(name)) {
                    confirm = true;
                    int cantiaumento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a disminuir: "));
                    juguetes[x].setInventario(juguetes[x].getInventario() - cantiaumento);
                    decremento = juguetes[x].getInventario() - cantiaumento;
                    break;
                }
            }
            if (confirm) {
                JOptionPane.showMessageDialog(null, "Aumento exitoso, el decremento del producto fue: " + decremento);
            } else {
                JOptionPane.showMessageDialog(null, "El juguete no fue encontrado");
            }
        }

        public void cuidadoToy () {
        ProveedorService proveedorService=new ProveedorService();
            boolean confirmToy = false;
            String cadena = "Informacion de cuidado del producto:\n";
            do {
                String nameJuguete = JOptionPane.showInputDialog("Digite el nombre del juguete que desea saber su cuidado");
                System.out.println(nameJuguete);
                for (int x = 0; x < 100; x++) {
                    if (String.valueOf(juguetes[x]) == "null") {
                        break;
                    }
                    if (juguetes[x].getNombre().equalsIgnoreCase(nameJuguete)) {
                        Proveedor proveedor=null;
                        juguetes[x].getCodeProveedor();
                        for (int y=0;y<10;y++){
                            if (juguetes[x].getCodeProveedor()==proveedorService.proveedores[y].getCodeProveedor()){
                                proveedor=proveedorService.proveedores[y];
                            }
                        }
                        cadena += juguetes[x].getNombre() + "\n" + proveedor.getMaterial();
                        confirmToy = true;
                        switch (proveedor.getMaterial()) {
                            case "Plastico":
                                cadena += "El juguete no requiere cuidados especiales";
                                break;
                            case "Tela":
                                cadena += "El juguete no debe ser mojado";
                                break;
                            case "Electronico":
                                cadena += "El juguete no debe ser mojado y requiere baterías";
                                break;
                        }
                    }
                }
            } while (!confirmToy);
            JOptionPane.showMessageDialog(null, cadena);
        }
        public void crearVenta ( int cantiproduc){
            Empleado prepaEmpleado = null;
            Cliente prepacliente = null;
            EmpleadoService empleadoService = new EmpleadoService();
            ClienteService clienteService = new ClienteService();
            DetalleVenta detallesdeventa[] = new DetalleVenta[cantiproduc];
            for (int x = 0; x < cantiproduc; x++) {
                boolean confirm = false;

                do {
                    String nameJuguete = JOptionPane.showInputDialog("Digite el nombre del juguete");
                    for (int y = 0; y < 100; y++) {
                        if (String.valueOf(juguetes[y]) == "null") {
                            continue;
                        } else if (juguetes[y].getNombre().equalsIgnoreCase(nameJuguete)) {
                            confirm = true;
                            DetalleVenta detalleventa = new DetalleVenta(juguetes[y], Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de existencias a comprar de este juguete")));
                            detallesdeventa[x] = detalleventa;
                            break;
                        }
                    }
                    if (!confirm) {
                        JOptionPane.showMessageDialog(null, "El juguete a buscar no se encontro, intente nuevamente");
                    }
                } while (confirm == false);
            }
            boolean confirmcliente = false;
            do {
                String clienteask = JOptionPane.showInputDialog("Digite el nombre del cliente");
                for (int x = 0; x < 5; x++) {
                    if (String.valueOf(clienteService.clientes[x]) == "null") {
                        continue;
                    } else if (clienteService.clientes[x].getNombre().equalsIgnoreCase(clienteask)) {
                        confirmcliente = true;
                        prepacliente = clienteService.clientes[x];
                        clienteService.clientes[x].setCantidadJuguetes(clienteService.clientes[x].getCantidadJuguetes()+cantiproduc);
                        break;
                    }
                }
                if (!confirmcliente) {
                    JOptionPane.showMessageDialog(null, "EL cliente no se a encontrado");
                }
            } while (!confirmcliente);
            //---------------------------------------------------------------------------------------------------------------------------EMpleados preparacion
            boolean confirmEmpleado = false;
            do {
                String empleadoask = JOptionPane.showInputDialog("Digite el nombre del empleado");
                for (int x = 0; x < 5; x++) {
                    System.out.println(empleadoService.empleados[x].getNombre().equalsIgnoreCase(empleadoask));
                    if (String.valueOf(empleadoService.empleados[x]) == "null") {
                        continue;
                    } else if (empleadoService.empleados[x].getNombre().equalsIgnoreCase(empleadoask)) {
                        confirmEmpleado = true;
                        prepaEmpleado = empleadoService.empleados[x];
                        empleadoService.empleados[x].setJuguetesVendidos(empleadoService.empleados[x].getJuguetesVendidos()+1);
                        break;
                    }
                }
                if (!confirmEmpleado) {
                    JOptionPane.showMessageDialog(null, "EL empleado no se a encontrado");
                }
            } while (!confirmEmpleado);
            VentaJuguete ventaJuguete = new VentaJuguete(JOptionPane.showInputDialog("Digite la fecha de venta"), prepacliente, prepaEmpleado, ((Math.random() * ((80 - 0) + 1)) + 0) / 10, detallesdeventa);
            double valorTotal = 0;
            for (int x = 0; x < detallesdeventa.length; x++) {
                boolean confirm = false;
                for (int y = 0; y < 100; y++) {
                    if (detallesdeventa[x].getJuguete().getNombre().equalsIgnoreCase(juguetes[y].getNombre())) {
                        juguetes[y].setInventario(juguetes[y].getInventario() - detallesdeventa[x].getCantidadJuguetes());
                        break;
                    }
                }
                valorTotal += (detallesdeventa[x].getCantidadJuguetes() * detallesdeventa[x].getJuguete().getPrecio());
            }
            ventaJuguete.setValorTotal(valorTotal);
            String cadena = "Venta exitosa\n";
            cadena += "Fecha de venta: " + ventaJuguete.getFechaVenta() + "\nEmpleado: " + ventaJuguete.getEmpleado().getNombre() + "\nCliente:   " + ventaJuguete.getCliente().getNombre() + "\nProductos comprados\n\n";
            for (int x = 0; x < detallesdeventa.length; x++) {
                cadena += detallesdeventa[x].getJuguete().getNombre() + "precio: " + (detallesdeventa[x].getJuguete().getPrecio() * detallesdeventa[x].getCantidadJuguetes()) + "\n";
            }
            cadena += "Descuento: " + (ventaJuguete.getDescuento() * 10) + "%\nValor total: " + ventaJuguete.getValorTotal() + "\nValor de total con descuento:     " + (ventaJuguete.getDescuento() * ventaJuguete.getValorTotal() + "\n");
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

