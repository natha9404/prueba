/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * jasjflsavnasdfosdyfhefa
 */

/**
 *
 * @author Nathalia
 * aqui cambie p
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

public class interfaz {

    // JFrame
    JFrame miframe;
    //JTabedPane pestañas
    private JTabbedPane pestañas;
    //Container
    private Container contenedor;
    // JPanel
    private JPanel crear_tarjeta;
    private JPanel consultar_tarjeta;
    private JPanel listar_tarjeta;
    private JPanel recargar_tarjeta;
    private JPanel cobrar_pasaje;
    private JPanel crear_ruta;
    private JPanel consultar_ruta;
    private JPanel listar_ruta;
    private JPanel crear_bus;
    private JPanel consultar_bus;
    private JPanel listar_bus;
    private JPanel administrador;
    
    //JLabel
    private JLabel num_tarjeta;
    private JLabel num_tarjeta1;
    private JLabel identificacion;
    private JLabel nombre_usuario;
    private JLabel direccion_usuario;
    
    
    //JLabel Creación Tarjta
    
    private JLabel identificacion1;
    private JLabel nombre_usuario1;
    private JLabel direccion_usuario1;
    private JLabel creación_tarjeta;
    private JLabel saldo;
    private JLabel contraseña_admin;
    private JLabel recarga;
    
    //JLabel Crear Buses
    private JLabel placa;
    private JLabel modelo;
    private JLabel tipo;
    private JLabel marca;
    private JLabel capacidad;
    private JLabel tipo1;
    private JLabel seleccion_bus;
    private JLabel tipo2;
    
    
    //JLabel Rutas
    private JLabel codigo;
    private JLabel nombre;
    private JLabel descripcion;
    private JLabel tipo_ruta;
    
    
    
            
    //JTexField
    private JTextField campo_num_tarjeta;
    private JTextField campo_num_tarjeta1;
    private JTextField campo_identificacion;
    private JTextField campo_nombre_usuario;
    private JTextField campo_direccion_usuario;
    private JTextField campo_identificacion1;
    private JTextField campo_nombre_usuario1;
    private JTextField campo_direccion_usuario1;
    private JTextField campo_creacion_tarjeta;
    private JTextField campo_saldo;
    private JTextField campo_recarga;
    
    //Buses
    private JTextField campo_placa;
    private JTextField campo_modelo;
    private JTextField campo_marca;
    private JTextField campo_capacidad;
    
    //Rutas
    private JTextField campo_codigo;
    private JTextField campo_nombre;
    private JTextField campo_descripcion;
    
    
    //JComboBox
    
    //Buses
    private JComboBox tipo_bus;
    private JComboBox tipo_bus_1;
    private JComboBox buses;
    private JComboBox tipo_bus_2;
    private JComboBox tipo_ruta_1;
    
    
    //JButton
    private JButton boton_crear_tarjeta;
    private JButton boton_consultar_tarjeta;
    private JButton boton_recargar;
    private JButton boton_crear_bus;
    private JButton boton_consultar_bus;
    private JButton boton_listar_bus;
    private JButton boton_crear_ruta;
    
    
    
    
    //JPasswordField
    private JPasswordField contraseña_administrador;

    public void iniciar() {

        pestañas = new JTabbedPane();
        pestañas.setSize(200, 200);

//Frame
        miframe = new JFrame();

        miframe.setSize(600, 400);

        miframe.setMinimumSize(new Dimension(600, 400));

        miframe.setVisible(true);


        //Container

        contenedor = miframe.getContentPane();



        // JPanel
        crear_tarjeta = new JPanel();
        consultar_tarjeta = new JPanel();
        listar_tarjeta = new JPanel();
        recargar_tarjeta = new JPanel();
        cobrar_pasaje = new JPanel();
        crear_ruta = new JPanel();
        consultar_ruta = new JPanel();
        listar_ruta = new JPanel();
        crear_bus = new JPanel();
        consultar_bus = new JPanel();
        listar_bus = new JPanel();
        administrador = new JPanel();

        //JLabel
        num_tarjeta = new JLabel("No. de Tarjeta:");
        num_tarjeta1 = new JLabel("No. de Tarjeta:");
        identificacion = new JLabel("No. de Identificacion:");
        nombre_usuario = new JLabel("Nombre:");
        direccion_usuario = new JLabel("Direccion:");
        identificacion1 = new JLabel("No. de Identificacion:");
        nombre_usuario1 = new JLabel("Nombre:");
        direccion_usuario1 = new JLabel("Direccion:");
        creación_tarjeta = new JLabel("Fecha de Creación");
        saldo = new JLabel("Saldo Disponible en su Tarjeta:");
        contraseña_admin = new JLabel("Contraseña para Administrador:");
        recarga = new JLabel("Valor a recarga:");
        tipo = new JLabel("Tipo:");
        capacidad = new JLabel("Capacidad:");
        modelo = new JLabel("Modelo de Bus:");
        placa = new JLabel("Placa:");
        marca = new JLabel("Marca:");
        tipo1 = new JLabel ("Tipo:");
        seleccion_bus =  new JLabel ("Seleccionar Bus");
        tipo2 = new JLabel ("Tipo:");
        codigo = new JLabel("Codigo de Ruta");
        nombre = new JLabel ("Nombre de Ruta");
        descripcion = new JLabel ("Descripcion");



        //JTexField
        campo_num_tarjeta = new JTextField();
        campo_num_tarjeta1 = new JTextField();
        campo_identificacion = new JTextField(10);
        campo_nombre_usuario = new JTextField(10);
        campo_direccion_usuario = new JTextField(10);
        campo_identificacion1 = new JTextField(10);
        campo_nombre_usuario1 = new JTextField(10);
        campo_direccion_usuario1 = new JTextField(10);
        campo_creacion_tarjeta = new JTextField();
        campo_saldo = new JTextField(5);
        campo_recarga = new JTextField();
        campo_capacidad = new JTextField();
        campo_modelo = new JTextField();
        campo_placa = new JTextField();
        campo_marca = new JTextField();
        campo_codigo = new JTextField();
        campo_nombre = new JTextField();
        campo_descripcion = new JTextField();


        //JComboBox
        tipo_bus = new JComboBox();
        tipo_bus_1 = new JComboBox();
        tipo_ruta_1 = new JComboBox();
        buses = new JComboBox();
        tipo_bus.addItem("Padron");
        tipo_bus.addItem("Pretroncal");
        tipo_bus.addItem("Alimentador");
        tipo_bus_1.addItem("Padron");
        tipo_bus_1.addItem("Pretroncal");
        tipo_bus_1.addItem("Alimentador");
        tipo_bus_2 = new JComboBox();
        tipo_bus_2.addItem("Padron");
        tipo_bus_2.addItem("Pretroncal");
        tipo_bus_2.addItem("Alimentador");
        tipo_ruta_1.addItem("Padron");
        tipo_ruta_1.addItem("Pretroncal");
        tipo_ruta_1.addItem("Alimentador");


        //JButton
        boton_crear_tarjeta = new JButton("Crear Tarjeta");
        boton_consultar_tarjeta = new JButton("Consultar Tarjeta");
        boton_recargar = new JButton("Recargar");
        boton_crear_bus = new JButton("Crear Bus");
        boton_consultar_bus = new JButton("Consultar Bus");
        boton_listar_bus = new JButton("Listar Buses");
        boton_crear_ruta =  new JButton("Crear Ruta");


        //JPasswordField
        contraseña_administrador = new JPasswordField();

        //Pestaña Crear Tarjeta

        crear_tarjeta.add(identificacion);
        crear_tarjeta.add(campo_identificacion);
        crear_tarjeta.add(nombre_usuario);
        crear_tarjeta.add(campo_nombre_usuario);
        crear_tarjeta.add(direccion_usuario);
        crear_tarjeta.add(campo_direccion_usuario);
        crear_tarjeta.add(boton_crear_tarjeta);
        crear_tarjeta.setBackground(Color.WHITE);
        identificacion.setBounds(100, 60, 180, 25);
        campo_identificacion.setBounds(250, 60, 180, 25);
        nombre_usuario.setBounds(100, 100, 180, 25);
        campo_nombre_usuario.setBounds(250, 100, 180, 25);
        direccion_usuario.setBounds(100, 140, 180, 25);
        campo_direccion_usuario.setBounds(250, 140, 180, 25);
        boton_crear_tarjeta.setBounds(350, 180, 180, 25);
        crear_tarjeta.setLayout(null);

        //Pestaña Consultar Tarjeta

        consultar_tarjeta.add(num_tarjeta);
        consultar_tarjeta.add(campo_num_tarjeta);
        consultar_tarjeta.add(identificacion1);
        consultar_tarjeta.add(campo_identificacion1);
        consultar_tarjeta.add(nombre_usuario1);
        consultar_tarjeta.add(campo_nombre_usuario1);
        consultar_tarjeta.add(direccion_usuario1);
        consultar_tarjeta.add(campo_direccion_usuario1);
        consultar_tarjeta.add(saldo);
        consultar_tarjeta.add(campo_saldo);
        consultar_tarjeta.add(boton_consultar_tarjeta);
        num_tarjeta.setBounds(100, 60, 180, 25);
        campo_num_tarjeta.setBounds(250, 60, 180, 25);
        identificacion1.setBounds(100, 100, 180, 25);
        campo_identificacion1.setBounds(250, 100, 180, 25);
        nombre_usuario1.setBounds(100, 140, 180, 25);
        campo_nombre_usuario1.setBounds(250, 140, 180, 25);
        direccion_usuario1.setBounds(100, 180, 180, 25);
        campo_direccion_usuario1.setBounds(250, 180, 180, 25);
        boton_consultar_tarjeta.setBounds(350, 220, 210, 25);
        consultar_tarjeta.setBackground(Color.WHITE);

        consultar_tarjeta.setLayout(null);


        //Creación Recargar Tarjetas

        recargar_tarjeta.add(num_tarjeta1);
        recargar_tarjeta.add(campo_num_tarjeta1);
        recargar_tarjeta.add(recarga);
        recargar_tarjeta.add(campo_recarga);
        recargar_tarjeta.add(boton_recargar);
        num_tarjeta1.setBounds(100, 100, 180, 25);
        campo_num_tarjeta1.setBounds(250, 100, 180, 25);
        recarga.setBounds(100, 140, 180, 25);
        campo_recarga.setBounds(250, 140, 180, 25);
        boton_recargar.setBounds(350, 180, 210, 25);
        recargar_tarjeta.setBackground(Color.WHITE);
        recargar_tarjeta.setLayout(null);

        //Pestaña crear bus
        crear_bus.add(placa);
        crear_bus.add(campo_placa);
        crear_bus.add(modelo);
        crear_bus.add(campo_modelo);
        crear_bus.add(marca);
        crear_bus.add(campo_marca);
        crear_bus.add(tipo);
        crear_bus.add(tipo_bus);
        crear_bus.add(capacidad);
        crear_bus.add(campo_capacidad);

        placa.setBounds(100, 60, 180, 25);
        campo_placa.setBounds(250, 60, 180, 25);
        modelo.setBounds(100, 100, 180, 25);
        campo_modelo.setBounds(250, 100, 180, 25);
        marca.setBounds(100, 140, 180, 25);
        campo_marca.setBounds(250, 140, 180, 25);
        tipo.setBounds(100, 180, 180, 25);
        tipo_bus.setBounds(250, 180, 180, 25);
        capacidad.setBounds(100, 220, 180, 25);
        campo_capacidad.setBounds(250, 220, 180, 25);


        boton_crear_bus.setBounds(350, 260, 210, 25);
        crear_bus.setBackground(Color.WHITE);
        crear_bus.setLayout(null);
        
        
        //Pestaña Consultar Buses
        
        consultar_bus.add(tipo1);
        consultar_bus.add(tipo_bus_1);
        consultar_bus.add(seleccion_bus);
        consultar_bus.add(buses);
        consultar_bus.add(boton_consultar_bus);
        tipo1.setBounds(100, 100, 180, 25);
        tipo_bus_1.setBounds(250, 100, 180, 25);
        seleccion_bus.setBounds(100, 140, 180, 25);
        buses.setBounds(250, 140, 180, 25);
        boton_consultar_bus.setBounds(350, 180, 210, 25);
        consultar_bus.setBackground(Color.WHITE);
        consultar_bus.setLayout(null);
        

        //Pestaña Listar Buses}
        listar_bus.add(tipo2);
        listar_bus.add(tipo_bus_2);
        listar_bus.add(boton_listar_bus);
        tipo2.setBounds(100, 140, 180, 25);
        tipo_bus_2.setBounds(250, 140, 180, 25);
        boton_listar_bus.setBounds(350, 180, 210, 25);
        listar_bus.setBackground(Color.WHITE);
        listar_bus.setLayout(null);
        
        
        //Pestaña crear ruTA
        
        crear_ruta.add(codigo);
        crear_ruta.add(nombre);
        crear_ruta.add(descripcion);
        crear_ruta.add(campo_codigo);
        crear_ruta.add(campo_nombre);
        crear_ruta.add(campo_descripcion);        
        

        //Creación Pestañas
        pestañas.addTab("Crear Tarjeta", crear_tarjeta);
        pestañas.addTab("Consultar Tarjeta", consultar_tarjeta);
        pestañas.addTab("Recargar Tarjeta", recargar_tarjeta);
        pestañas.addTab("Crear Bus", crear_bus);
        pestañas.addTab("Listar Buses", listar_bus);
        pestañas.add("Consultar Buses", consultar_bus);
        pestañas.add("Administrador", administrador);
        pestañas.add("Consultar Ruta de Buses", consultar_ruta);

        miframe.add(pestañas);



        miframe.pack();
        miframe.setVisible(true);

        miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
