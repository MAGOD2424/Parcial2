package parcial;

import javax.swing.*;

public class VentanaPotencia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Potencia Entera");
        JTextField baseField = new JTextField(10); 
        JTextField expField = new JTextField(10);  
        JButton calcularBtn = new JButton("Calcular"); 
        JTextArea resultadoArea = new JTextArea(2, 5); 

        
        JPanel panel = new JPanel();
        panel.add(new JLabel("base:")); 
        panel.add(baseField); 
        panel.add(new JLabel("exponente:")); 
        panel.add(expField); 
        panel.add(calcularBtn); 
        panel.add(new JLabel("resultado:")); 
        panel.add(resultadoArea); 

       
        calcularBtn.addActionListener(e -> {
            try {
                int base = Integer.parseInt(baseField.getText());
                int exp = Integer.parseInt(expField.getText());
                Parcial p = new Parcial();
                int resultado = p.potenciaEntera(base, exp);
                resultadoArea.setText(String.valueOf(resultado)); // aqui ya con esto podremos mostrar el resultado
            } catch (NumberFormatException ex) {
                resultadoArea.setText("Valores no válidos."); // Mensaje de error
            } catch (Exception ex) {
                resultadoArea.setText("Error: " + ex.getMessage()); // Mensaje de error
            }
        });

        // Configuración de la ventana
        frame.setContentPane(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
