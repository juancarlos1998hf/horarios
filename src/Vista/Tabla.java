
package Vista;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;




public class Tabla extends JFrame implements ActionListener{
    
    
        public Tabla(){
            
            componentes();
            
        
        }
        
        JPanel mostrar[] = new JPanel[10], semestre;
        JTable horarios[] = new JTable[10];
        
        
        JButton se1,se2,se3,se4,se5,se6,se7,se8,se9,se10;
        
        
        
        private void componentes(){
            
            this.setTitle("Horarios");
            this.setBounds(300, 300, 800, 800);
            this.setLocationRelativeTo(this);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setVisible(true);
            
            String [] nombresColumnas={"Hora","Lunes","Martes","Miercoles","Jueves", "Viernes"};
            Object [][] lista = {
                {"6:00 AM 6:50 AM","","","","", ""},
                {"6:50 AM 7:40 AM","","",""," ", ""},
                {"7:40 AM 7:50 AM","","","","", "  "},
                {"7:50 AM 8;40 AM","",""," "," ", "  "},
                {"8:40 AM 9:30 AM","",""," "," ", "  "},
                {"9:30 AM 10:20 AM","",""," "," ", "  "},
                {"10:20 AM 10:30 AM ","",""," "," ", " "},
                {"10:30 AM 11:20 AM","",""," "," ", "  "},
                {"11:20 AM 12:10 PM","",""," "," ", "  "},
                {"12:10 AM 1:00 PM","",""," "," ", "  "},
                {"1:00 PM 1:50 PM","",""," "," ", "  "},
                {"1:50 PM 2:40 PM","",""," "," ", "  "},
                {"2:40 PM 3:30 PM","",""," "," ", "  "},
                {"3:30 PM 4:20 PM","",""," "," ", "  "},
                {"4:20 PM 5:10 PM","",""," "," ", " "},
                {"5:10 PM 6:00 PM","",""," "," ", "  "},
                {"6:00 PM 6:15 PM","",""," "," ", " "},
                {"6:15 PM 7:05 PM","",""," "," ", "  "},
                {"7:05 PM 7:55 PM","",""," "," ", "  "},
                {"7:55 PM 8:45 PM","",""," "," ", "  "},
                {"8:45 PM 8:55 PM","",""," "," ", "  "},
                {"8:55 PM 9:45 PM","",""," "," ", "  "},
                {"9:45 PM 10:35 PM","","",""," ", "  "},
                
            };
            
            for (int i = 0; i < 10; i++) {
                horarios[i] = new JTable(lista,nombresColumnas);
            }
            
            
            for (int i = 0; i < 10; i++) {
                mostrar[i] = new JPanel();
                mostrar[i].setBounds(200, 0, 500, 600);
                mostrar[i].setBorder(BorderFactory.createRaisedBevelBorder());
                mostrar[i].add(new JScrollPane(horarios[i]),BorderLayout.CENTER);
                mostrar[i].setVisible(false);
                this.add(mostrar[i]);
            }
           
            
            semestre = new JPanel();
            semestre.setLayout(null);
            semestre.setBounds(0, 0, 150, 800);
            semestre.setBackground(new Color(20, 77, 138));
            this.add(semestre);
            
            
            se1 = new JButton("Semestre 1");
            se1.setBounds(10, 10, 100, 50);
            se1.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se1.addActionListener(this);
            se1.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se1);
            
            se2 = new JButton("Semestre 2");
            se2.setBounds(10, 70, 100, 50);
            se2.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se2.addActionListener(this);
            se2.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se2);
            
            se3 = new JButton("Semestre 3");
            se3.setBounds(10, 130, 100, 50);
            se3.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se3.addActionListener(this);
            se3.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se3);
            
            se4 = new JButton("Semestre 4");
            se4.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se4.addActionListener(this);
            se4.setBounds(10, 190, 100, 50);
            se4.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se4);
             
            se5 = new JButton("Semestre 5");
            se5.setBounds(10, 250, 100, 50);
            se5.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se5.addActionListener(this);
            se5.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se5);
            
            se6 = new JButton("Semestre 6");
            se6.setBounds(10, 310, 100, 50);
            se6.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se6.addActionListener(this);
            se6.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se6);
            
            se7 = new JButton("Semestre 7");
            se7.setBounds(10, 370, 100, 50);
            se7.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se7.addActionListener(this);
            se7.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se7);
            
            se8 = new JButton("Semestre 8");
            se8.setBounds(10, 430, 100, 50);
            se8.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se8.addActionListener(this);
            se8.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se8);
            
            se9 = new JButton("Semestre 9");
            se9.setBounds(10, 490, 100, 50);
            se9.setCursor(new Cursor(HAND_CURSOR));
            se9.setFont(new Font("Bodoni MT", Font.BOLD, 15));
            se9.addActionListener(this);
            semestre.add(se9);
            
            se10 = new JButton("Semestre 10");
            se10.setBounds(10, 550, 100, 50);
            se10.setFont(new Font("Bodoni MT", Font.BOLD, 13));
            se10.addActionListener(this);
            se10.setCursor(new Cursor(HAND_CURSOR));
            semestre.add(se10);
            
            
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
                
                if (ae.getSource()==se1) {
                    JOptionPane.showMessageDialog(null, "Boton 1");
                    
                    mostrar[0].setVisible(true);
                    mostrar[1].setVisible(false);
                    mostrar[2].setVisible(false);
                    mostrar[3].setVisible(false);
                    mostrar[4].setVisible(false);
                    mostrar[5].setVisible(false);
                    mostrar[6].setVisible(false);
                    mostrar[7].setVisible(false);
                    mostrar[8].setVisible(false);
                    mostrar[9].setVisible(false);
                
                }
                
                if (ae.getSource()==se2) {
                    JOptionPane.showMessageDialog(null, "Boton 2");
                    
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    mostrar[1].setVisible(true);
                    
                }
                
                if (ae.getSource()==se3) {
                    JOptionPane.showMessageDialog(null, "Boton 3");
                    
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    
                    
                    mostrar[2].setVisible(true);
                    
                }
                
                if (ae.getSource()==se4) {
                    JOptionPane.showMessageDialog(null, "Boton 4");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                   
                    
                    mostrar[3].setVisible(true);
                    
                }
                
                if (ae.getSource()==se5) {
                    JOptionPane.showMessageDialog(null, "Boton 5");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                  
                    mostrar[4].setVisible(true);
                    
                }
                
                if (ae.getSource()==se6) {
                    JOptionPane.showMessageDialog(null, "Boton 6");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    
                    
                    mostrar[5].setVisible(true);
                    
                }
                
                if (ae.getSource()==se7) {
                    JOptionPane.showMessageDialog(null, "Boton 7");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    
                    
                    mostrar[6].setVisible(true);
                    
                }
                
                if (ae.getSource()==se8) {
                    JOptionPane.showMessageDialog(null, "Boton 8");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    
                    mostrar[7].setVisible(true);
                    
                }
                
                if (ae.getSource()==se9) {
                    JOptionPane.showMessageDialog(null, "Boton 9");
                    for (int i = 0; i < 10; i++) {
                        mostrar[i].setVisible(false);
                    }
                    
                    mostrar[8].setVisible(true);
                    
                }
            
                if (ae.getSource()==se10) {
                    JOptionPane.showMessageDialog(null, "Boton 10");
                    for (int i = 0; i < 10; i++) {
                         mostrar[i].setVisible(false);
                    }
                    
                    mostrar[9].setVisible(true);
                    
                }
            
        
                for (int i = 0; i < 10; i++) {
                        mostrar[i].updateUI();
                }
        
    }
        
        
        
        
         
        
}