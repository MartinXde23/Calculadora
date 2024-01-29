import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JPanel panel1;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton potenciaButton;
    private JButton porcentajeButton;
    private JButton multiplicarButton;
    private JButton senoButton;
    private JButton dividirButton;
    private JButton raizButton;
    private JButton cosenoButton;
    private JButton tangenteButton;
    private JButton cosecanteButton;
    private JButton cotangenteButton;
    private JButton secanteButton;
    private JButton cerrarButton;
    private JButton limpiarButton;
    private JTextField ValX;
    private JTextField ValY;
    private JTextField Resultado;

    public Calculadora() {
        super("Calculadora");
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double suma=numero1+numero2;
                Resultado.setText(String.valueOf(suma));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double restar=numero1-numero2;
                Resultado.setText(String.valueOf(restar));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double multiplicacion=numero1*numero2;
                Resultado.setText(String.valueOf(multiplicacion));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double dividir=numero1/numero2;
                Resultado.setText(String.valueOf(dividir));
            }
        });
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double raiz=Math.sqrt(numero1);
                Resultado.setText(String.valueOf(raiz));
            }
        });
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double potencia=Math.pow(numero1,numero2);
                Resultado.setText(String.valueOf(potencia));
            }
        });
        porcentajeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                ValY.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double numero2=Integer.parseInt(ValY.getText());
                double porcentaje = (numero1 / numero2) * 100;
                Resultado.setText(String.valueOf(porcentaje));
            }
        });
        senoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double seno=Math.toDegrees(Math.sin(numero1));
                Resultado.setText(String.valueOf(seno));
            }
        });
        cosenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double coseno=Math.toDegrees(Math.cos(numero1));
                Resultado.setText(String.valueOf(coseno));
            }
        });
        tangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double tangente=Math.toDegrees(Math.tan(numero1));
                Resultado.setText(String.valueOf(tangente));
            }
        });
        cotangenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double arcotangente=Math.toDegrees(Math.atan(numero1));
                Resultado.setText(String.valueOf(arcotangente));
            }
        });
        secanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double secante=Math.toDegrees(Math.asin(numero1));
                Resultado.setText(String.valueOf(secante));
            }
        });
        cosecanteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.getText();
                double numero1=Integer.parseInt(ValX.getText());
                double cosecante=Math.toDegrees(Math.acos(numero1));
                Resultado.setText(String.valueOf(cosecante));
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValX.setText("");
                ValY.setText("");
                Resultado.setText("");
            }
        });
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel1);
    }
}
