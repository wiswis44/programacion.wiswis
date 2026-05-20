

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraUI extends JFrame implements ActionListener {

    private JTextField pantalla;        //  para mostrar los numeros o resoltados
    private JLabel pantallaOperacion;   // para mostrar la operación en curso (ej: "5 +")
    private JTextArea historial;          // para mostrar el historial de operaciones realizadas

    private double numero1;
    private double numero2;
    private String operador;
    private boolean nuevoNumero;
    private boolean igualPulsado;

    private final Color COLOR_FONDO = new Color(32, 32, 32);
    private final Color COLOR_PANTALLA = new Color(32, 32, 32);
    private final Color COLOR_TEXTO = new Color(255, 255, 255);
    private final Color COLOR_NUMEROS = new Color(64, 64, 64);
    private final Color COLOR_OPERADORES = new Color(255, 159, 10);
    private final Color COLOR_FUNCIONES = new Color(165, 165, 165);

    private final String[] botones = {
            "AC", "C", "<-", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="
    };

    public CalculadoraUI() {
        iniciarVariables();
        configurarVentana();
        crearPantalla();
        crearBotones();
        
        historial = new JTextArea();
        historial.setEditable(false);
        historial.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        
        crearBotonHistorial();
        setVisible(true);
    }

    public double getNumero1() { return numero1; }
    public void setNumero1(double numero1) { this.numero1 = numero1; }

    public double getNumero2() { return numero2; }
    public void setNumero2(double numero2) { this.numero2 = numero2; }

    public String getOperador() { return operador; }
    public void setOperador(String operador) { this.operador = operador; }

    public boolean isNuevoNumero() { return nuevoNumero; }
    public void setNuevoNumero(boolean nuevoNumero) { this.nuevoNumero = nuevoNumero; }

    public boolean isIgualPulsado() { return igualPulsado; }
    public void setIgualPulsado(boolean igualPulsado) { this.igualPulsado = igualPulsado; }

    public JTextField getPantalla() { return pantalla; }
    public void setPantalla(JTextField pantalla) { this.pantalla = pantalla; }

    public JLabel getPantallaOperacion() { return pantallaOperacion; }
    public void setPantallaOperacion(JLabel pantallaOperacion) { this.pantallaOperacion = pantallaOperacion; }

    public JTextArea getHistorial() { return historial; }
    public void setHistorial(JTextArea historial) { this.historial = historial; }

    private void configurarVentana() {
        setTitle("Calculadora");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(2, 2));
        getContentPane().setBackground(COLOR_FONDO);
    }

    private void iniciarVariables() {
        numero1 = 0;
        numero2 = 0;
        operador = "";
        nuevoNumero = true;
        igualPulsado = false;
    }

    private void crearPantalla() {
        JPanel panelPantallas = new JPanel(new BorderLayout());
        panelPantallas.setBackground(COLOR_PANTALLA);
        panelPantallas.setBorder(new EmptyBorder(15, 20, 15, 20));

        pantallaOperacion = new JLabel(" ");
        pantallaOperacion.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        pantallaOperacion.setForeground(Color.LIGHT_GRAY);
        pantallaOperacion.setHorizontalAlignment(SwingConstants.RIGHT);

        pantalla = new JTextField("0");
        pantalla.setFont(new Font("Segoe UI", Font.BOLD, 48));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(COLOR_PANTALLA);
        pantalla.setForeground(COLOR_TEXTO);
        pantalla.setCaretColor(COLOR_TEXTO);
        pantalla.setBorder(null);

        panelPantallas.add(pantallaOperacion, BorderLayout.NORTH);
        panelPantallas.add(pantalla, BorderLayout.CENTER);
        add(panelPantallas, BorderLayout.NORTH);
    }

    private void crearBotones() {
        JPanel panelBotones = new JPanel(new GridLayout(5, 4, 2, 2));
        panelBotones.setBackground(COLOR_FONDO);
        panelBotones.setBorder(new EmptyBorder(10, 10, 10, 10));

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Segoe UI", Font.BOLD, 24));
            boton.addActionListener(this);
            boton.setFocusPainted(false);
            boton.setBorderPainted(false);
            boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            
            if (texto.matches("[0-9]") || texto.equals(".")) {
                boton.setBackground(COLOR_NUMEROS);
                boton.setForeground(COLOR_TEXTO);
            } else if (texto.matches("[+\\-*/=]")) {
                boton.setBackground(COLOR_OPERADORES);
                boton.setForeground(Color.WHITE);
                if (texto.equals("=")) {
                    boton.setFont(new Font("Segoe UI", Font.BOLD, 28));
                }
            } else {
                boton.setBackground(COLOR_FUNCIONES);
                boton.setForeground(Color.BLACK);
            }

            panelBotones.add(boton);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    private void crearBotonHistorial() {
        JButton btnHistorial = new JButton("Ver Historial");
        btnHistorial.setBackground(COLOR_NUMEROS);
        btnHistorial.setForeground(COLOR_TEXTO);
        btnHistorial.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnHistorial.setFocusPainted(false);
        btnHistorial.setBorderPainted(false);
        btnHistorial.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnHistorial.addActionListener(e -> mostrarHistorial());
        add(btnHistorial, BorderLayout.SOUTH);
    }

    private void mostrarHistorial() {
        JScrollPane scroll = new JScrollPane(historial);
        scroll.setPreferredSize(new Dimension(250, 300));
        
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.add(scroll, BorderLayout.CENTER);
        
        JButton btnLimpiar = new JButton("Borrar Historial");
        btnLimpiar.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLimpiar.addActionListener(e -> historial.setText(""));
        panel.add(btnLimpiar, BorderLayout.SOUTH);
        
        JOptionPane.showMessageDialog(this, panel, "Historial de Operaciones", JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        try {
            if (comando.matches("[0-9]")) {
                agregarNumero(comando);
            } else if (comando.equals(".")) {
                agregarDecimal();
            } else if (comando.equals("AC")) {
                limpiarTodo();
            } else if (comando.equals("C")) {
                limpiarPantalla();
            } else if (comando.equals("<-")) {
                borrarUltimo();
            } else if (comando.equals("+/-")) {
                cambiarSigno();
            } else if (comando.matches("[+\\-*/]")) {
                guardarOperacion(comando);
            } else if (comando.equals("=")) {
                calcularResultado();
            }
        } catch (Exception ex) {
            pantalla.setText("Error");
            nuevoNumero = true;
        }
    }

    private void agregarNumero(String numero) {
        if (nuevoNumero || pantalla.getText().equals("0")) {
            pantalla.setText(numero);
        } else {
            pantalla.setText(pantalla.getText() + numero);
        }
        nuevoNumero = false;
        igualPulsado = false;
    }

    private void agregarDecimal() {
        if (!pantalla.getText().contains(".")) {
            pantalla.setText(pantalla.getText() + ".");
            nuevoNumero = false;
        }
    }

    private void limpiarTodo() {
        pantalla.setText("0");
        pantallaOperacion.setText(" ");
        iniciarVariables();
    }

    private void limpiarPantalla() {
        pantalla.setText("0");
        nuevoNumero = true;
    }

    private void borrarUltimo() {
        String texto = pantalla.getText();
        if (texto.length() > 1) {
            pantalla.setText(texto.substring(0, texto.length() - 1));
        } else {
            pantalla.setText("0");
            nuevoNumero = true;
        }
    }

    private void cambiarSigno() {
        double valor = Double.parseDouble(pantalla.getText());
        valor *= -1;
        pantalla.setText(formatear(valor));
    }

    private void guardarOperacion(String op) {
        // Si ya hay un operador pendiente y el usuario escribió un número nuevo,
        // calculamos el resultado parcial antes de preparar la siguiente operación.
        if (!operador.isEmpty() && !nuevoNumero) {
            try {
                numero2 = Double.parseDouble(pantalla.getText());
                double resultado = Logica.calcular(numero1, numero2, operador);
                
                // Opcional: Registramos la operación intermedia en el historial
                historial.append(formatear(numero1) + " " + operador + " " + formatear(numero2) + " = " + formatear(resultado) + "\n");
                
                pantalla.setText(formatear(resultado));
                numero1 = resultado;
            } catch (Exception ex) {
                pantalla.setText("Error");
                limpiarTodo();
                return;
            }
        } else {
            // Si no hay operación pendiente (o si el usuario solo está cambiando de operador),
            // guardamos el número actual de la pantalla.
            numero1 = Double.parseDouble(pantalla.getText());
        }

        operador = op;
        pantallaOperacion.setText(formatear(numero1) + " " + operador);
        nuevoNumero = true;
        igualPulsado = false;
    }

    private void calcularResultado() throws Exception {
        if (operador.isEmpty()) {
            return;
        }

        if (!igualPulsado) {
            numero2 = Double.parseDouble(pantalla.getText());
        } else {
            numero1 = Double.parseDouble(pantalla.getText());
        }

        double resultado = Logica.calcular(numero1, numero2, operador);

        pantallaOperacion.setText(formatear(numero1) + " " + operador + " " + formatear(numero2) + " =");
        pantalla.setText(formatear(resultado));

        historial.append(
                formatear(numero1) + " " + operador + " " + formatear(numero2) + " = " + formatear(resultado) + "\n"
        );

        numero1 = resultado;
        nuevoNumero = true;
        igualPulsado = true;
    }

    private String formatear(double numero) {
        if (numero == (long) numero) {
            return String.valueOf((long) numero);
        }
        return String.valueOf(numero);
    }
}