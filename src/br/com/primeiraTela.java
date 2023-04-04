package br.com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primeiraTela extends JFrame {
    private JPanel mainPanel;
    private JTextField tfNumero1;
    private JRadioButton rdnSoma;
    private JRadioButton rdnSubt;
    private JRadioButton rdnDiv;
    private JRadioButton rdnMulti;
    private JRadioButton rdnPow;
    private JLabel lblOperacao;
    private JLabel lblResult;
    private JLabel lblNum1;
    private JButton sairButton;
    private JLabel lblNum2;
    private JTextField tfNumero2;
    int num1;
    int num2;
    public primeiraTela(){
        setContentPane(mainPanel);
        setTitle("Calculadora");
        setSize(386,134);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        rdnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rdnSoma.isSelected()){
                    num1 = Integer.parseInt(tfNumero1.getText());
                    num2 = Integer.parseInt(tfNumero2.getText());
                    lblResult.setText("Resultado: "+(num1+num2));
                }
                else if (rdnSubt.isSelected()){
                    num1 = Integer.parseInt(tfNumero1.getText());
                    num2 = Integer.parseInt(tfNumero2.getText());
                    lblResult.setText("Resultado: "+(num1-num2));
                }
                else if (rdnDiv.isSelected()){
                    num1 = Integer.parseInt(tfNumero1.getText());
                    num2 = Integer.parseInt(tfNumero2.getText());
                    lblResult.setText("Resultado: "+(num1/num2));
                }
                else if (rdnMulti.isSelected()){
                    num1 = Integer.parseInt(tfNumero1.getText());
                    num2 = Integer.parseInt(tfNumero2.getText());
                    lblResult.setText("Resultado: "+(num1*num2));

                }
                else if (rdnPow.isSelected()){
                    num1 = Integer.parseInt(tfNumero1.getText());
                    num2 = Integer.parseInt(tfNumero2.getText());
                    lblResult.setText("Resultado: "+(Math.pow(num1,num2)));
                }
            }
        });
    }

    public static void main(String[] args) {
        primeiraTela frame = new primeiraTela();
    }
}
