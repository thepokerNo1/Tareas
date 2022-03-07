import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos
import java.awt.*;

public class Calculadora extends JFrame {

    JLabel Letrero, lblTotal;//Reserva el espacio en memoria
    JButton btnBorrarTodo, btnPorcentaje, btnDividir, btnMulti, btnRestar, btnSuma, btnIgual, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPunto;
    JTextField txtTotal;
    JPanel panel;
    private Object objTextField;
    public String guardados[] = new String[2];
    public int cont = 0, funcion = 0, continuidad = 0, hayPunto = 0;

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtTotal = new JTextField(10);
        txtTotal.setEditable(false);

        btnBorrarTodo = new JButton("AC");
        btnPorcentaje = new JButton("%");
        btnDividir = new JButton("/");
        btnMulti = new JButton("X");
        btnRestar = new JButton("-");
        btnSuma = new JButton("+");
        btnIgual = new JButton("=");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnPunto = new JButton(".");

        panel = new JPanel();
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setBounds(132, 28, 144, 20);
        txtTotal.setText("0");
        panel.add(txtTotal);
        panel.add(btnBorrarTodo);
        panel.add(btnDividir);
        panel.add(btnPorcentaje);
        panel.add(btnMulti);
        panel.add(btnRestar);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnSuma);
        panel.add(btn4);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnPunto);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn0);
        panel.add(btnIgual);
        guardados[0] = "";
        guardados[1] = "";

        btnBorrarTodo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        btnPorcentaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        setTitle("CalculadoraGrafica");

        setContentPane(panel);
        setVisible(true);
    }

    private void btnBorrarTodoActionPerformed(ActionEvent evt) {
        String c = txtTotal.getText();
        float display = Float.parseFloat(c.trim());
        txtTotal.setText("0");
        guardados[0] = "";
        guardados[1] = "";
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnDividirActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 1;
        continuidad = 1;
        hayPunto = 0;
    }

    private void btnPorcentajeActionPerformed(ActionEvent evt) {
        if (cont == 0) {
            if (guardados[0] != "") {
                float num1 = Float.parseFloat(guardados[0].trim());
                txtTotal.setText(Porcentaje(num1) + "");
                guardados[0] = Porcentaje(num1) + "";
            } else {
                txtTotal.setText("" + Porcentaje(Float.parseFloat(txtTotal.getText().trim())));
            }
        } else {
            if (cont == 1) {
                float num1 = Float.parseFloat(guardados[1].trim());
                txtTotal.setText(Porcentaje(num1) + "");
                guardados[1] = Porcentaje(num1) + "";
            }
        }
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnMultiActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 3;
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnRestarActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 4;
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnIgualActionPerformed(ActionEvent evt) {
        float num1 = Float.parseFloat(guardados[0].trim());
        float num2 = Float.parseFloat(guardados[1].trim());
        if (funcion == 1) {
            txtTotal.setText(Divicion(num1, num2) + "");
        } else {
            if (funcion == 3) {
                txtTotal.setText(Multiplicacion(num1, num2) + "");
            } else {
                if (funcion == 4) {
                    txtTotal.setText(Resta(num1, num2) + "");
                } else {
                    if (funcion == 5) {
                        txtTotal.setText(Suma(num1, num2) + "");
                    }
                }

            }
        }
        cont--;
        guardados[0] = "";
        guardados[1] = "";
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnSumaActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 5;
        continuidad = 0;
        hayPunto = 0;
    }

    private void btn1ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "1";
            txtTotal.setText(txtTotal.getText() + "1");
        } else {
            guardados[cont] = guardados[cont] + "1";
            txtTotal.setText("1");
            continuidad = 1;
        }

    }

    private void btn2ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "2";
            txtTotal.setText(txtTotal.getText() + "2");
        } else {
            guardados[cont] = guardados[cont] + "2";
            txtTotal.setText("2");
            continuidad = 1;
        }
    }

    private void btn3ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "3";
            txtTotal.setText(txtTotal.getText() + "3");
        } else {
            guardados[cont] = guardados[cont] + "3";
            txtTotal.setText("3");
            continuidad = 1;
        }
    }

    private void btn4ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "4";
            txtTotal.setText(txtTotal.getText() + "4");
        } else {
            guardados[cont] = guardados[cont] + "4";
            txtTotal.setText("4");
            continuidad = 1;
        }
    }

    private void btn5ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "5";
            txtTotal.setText(txtTotal.getText() + "5");
        } else {
            guardados[cont] = guardados[cont] + "5";
            txtTotal.setText("5");
            continuidad = 1;
        }
    }

    private void btn6ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "6";
            txtTotal.setText(txtTotal.getText() + "6");
        } else {
            guardados[cont] = guardados[cont] + "6";
            txtTotal.setText("6");
            continuidad = 1;
        }
    }

    private void btn7ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "7";
            txtTotal.setText(txtTotal.getText() + "7");
        } else {
            guardados[cont] = guardados[cont] + "7";
            txtTotal.setText("7");
            continuidad = 1;
        }
    }

    private void btn8ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "8";
            txtTotal.setText(txtTotal.getText() + "8");
        } else {
            guardados[cont] = guardados[cont] + "8";
            txtTotal.setText("8");
            continuidad = 1;
        }
    }

    private void btn9ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "9";
            txtTotal.setText(txtTotal.getText() + "9");
        } else {
            guardados[cont] = guardados[cont] + "9";
            txtTotal.setText("9");
            continuidad = 1;
        }
    }

    private void btn0ActionPerformed(ActionEvent evt) {
        guardados[cont] = guardados[cont] + "0";
        txtTotal.setText(txtTotal.getText() + "0");
    }

    private void btnPuntoActionPerformed(ActionEvent evt) {
        if (hayPunto == 0) {
            hayPunto = 1;
            if (continuidad == 1) {
                guardados[cont] = guardados[cont] + ".";
                txtTotal.setText(txtTotal.getText() + ".");
                
            } else {
                guardados[cont] = guardados[cont] + ".";
                txtTotal.setText("0.");
                continuidad = 1;
            }
        }
    }

    public static float Suma(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float Resta(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float Multiplicacion(float num1, float num2) {
        float multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static float Divicion(float num1, float num2) {
        float divicion = num1 * num2;
        return divicion;
    }

    public static float Porcentaje(float num1) {
        float porcentaje = num1 / 100;
        return porcentaje;
    }

    private class MyListener extends MouseAdapter {

        public void mouseClicked(MouseEvent event) {
            System.exit(0);
        }
    }
}
