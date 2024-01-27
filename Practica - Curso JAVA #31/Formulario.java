import javax.swing.*;
import java.awt.event.*; 

public class Formulario extends JFrame implements ActionListener{
 
 private JTextField textfield1;
 private JScrollPane scrollpane1; 
 private JTextArea textarea1;
 private JButton boton1, boton2;

String texto =""; //

 public Formulario(){
  setLayout(null);

  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);

  boton2 = new JButton("AGREGAR");
  boton2.setBounds(250,10,100,30);
  add(boton2);
  boton2.addActionListener(this);

  textarea1 = new JTextArea();
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(10,50,400,300);
  add(scrollpane1);  

  boton1 = new JButton("CERRAR");
  boton1.setBounds(370,10,100,30);
  add(boton1);
  boton1.addActionListener(this); 
 }


public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){ 
	System.exit(0);
    } if(e.getSource() == boton2){
	texto += textfield1.getText() + "\n" ;
	textarea1.setText(texto);
	textfield1.setText(""); 
	}
 }


 public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,540,400);
  formulario1.setVisible(true);
  formulario1.setResizable(true);
  formulario1.setLocationRelativeTo(null);
 }
}

