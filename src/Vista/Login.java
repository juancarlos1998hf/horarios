
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JFrame implements ActionListener{
    
    
    
    public Login(){
        IniciarComponentes();
    }
    
    Image imagen;
    URL ruta1,ruta2,ruta3;
    JLabel contenedor;
    JButton Ingresar,Ingresar2;
    JLabel Titulo,Titulo2, campou, campoc, recordar_pass, unisangil, registrar;
    JTextField usuario;
    JPasswordField contraseña;
    ImageIcon ingre,cargando;
    
    private void IniciarComponentes(){
        
        this.setSize(600, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(this);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFont(new Font("Bodoni MT", Font.BOLD, 30));
        //no deja que se maximice la ventana
        this.setResizable(false);
        //dispose cierra el proceso de JFrame
        this.dispose();
        //icono al JFrame
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage());
        //}
        this.setUndecorated(true);
      

        //asigna imagen a un JLabel
        ruta1 = this.getClass().getResource("/Imagenes/Logo.png");
        imagen = new ImageIcon(ruta1).getImage();
        contenedor = new JLabel();
        contenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contenedor.setBounds(50, 50, 120, 120);
        contenedor.setIcon(new ImageIcon(imagen));
        this.add(contenedor);
       
        unisangil = new JLabel("Sede Chiquinquirá");
        unisangil.setBounds(50, 175, 130, 20);
        unisangil.setForeground(Color.BLACK);
        unisangil.setFont(new Font("Bodoni MT", Font.BOLD, 16));
        this.add(unisangil);
        
        
        //Titulo del software
        Titulo = new JLabel("Herramienta para Asignación");
        Titulo.setBounds(200, 50, 500, 100);
        Titulo.setForeground(Color.BLACK);
        Titulo.setFont(new Font("Bodoni MT", Font.BOLD, 30));
        this.add(Titulo);
        Titulo2 = new JLabel("de Horarios");
        Titulo2.setForeground(Color.BLACK);
        Titulo2.setBounds(300, 100, 500, 100);
        Titulo2.setFont(new Font("Bodoni MT", Font.BOLD, 30));
        this.add(Titulo2);
        
       
        //Label para usuario
        campou = new JLabel("Usuario");
        campou.setBounds(200, 250, 70, 40);
        campou.setAlignmentX(RIGHT_ALIGNMENT);
        campou.setAlignmentY(RIGHT_ALIGNMENT);
        campou.setFont(new Font("Bodoni MT", Font.BOLD, 18));
        this.add(campou);
        
        //Label para contraseña
        campoc = new JLabel("Contraseña");
        campoc.setBounds(200, 300, 100, 40);
        campoc.setFont(new Font("Bodoni MT", Font.BOLD, 18));
        this.add(campoc);
        
        //caja de texto para usuario
        usuario = new JTextField();
        usuario.setBounds(310, 260, 100, 20);
        usuario.setLayout(null);
        usuario.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
        this.add(usuario);
        
        //caja de texto para contraseña
        contraseña = new JPasswordField();
        contraseña.setLayout(null);
        contraseña.setBounds(310, 310, 100, 20);
        contraseña.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
        this.add(contraseña);
        
        Ingresar = new JButton();
        Ingresar.setBounds(310, 360, 80, 80);
        Ingresar.setForeground(new Color(39,22,250));
        Ingresar.setFont(new Font("Bodoni MT", Font.BOLD, 15));
        ruta2 = this.getClass().getResource("/Imagenes/IniciarSesion.png");
        ingre = new ImageIcon(ruta2);
        Ingresar.setIcon(new ImageIcon(ingre.getImage().getScaledInstance(Ingresar.getWidth(), Ingresar.getHeight(), Image.SCALE_SMOOTH)));
        Ingresar.setCursor(new Cursor(HAND_CURSOR));
        Ingresar.addActionListener(this);
        Ingresar.setToolTipText("Ingresar");
        this.add(Ingresar);
        
        registrar = new JLabel("Crear Usuario");
        registrar.setBounds(410, 410, 150, 20);
        registrar.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
        registrar.setForeground(new Color(39, 22, 250));
        registrar.setCursor(new Cursor(HAND_CURSOR));
        registrar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
                Login lo = new Login();
                lo.setVisible(false);
                
                Registrar_Usuario r = new Registrar_Usuario();
                r.setVisible(true);
                
                }

            @Override
            public void mousePressed(MouseEvent me) {
            
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                Ingresar.setText("Ingresar");
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                 Ingresar.setText("");
            }
        });

            
        this.add(registrar);
        
        recordar_pass = new JLabel("¿Recordar contraseña?");
        recordar_pass.setBounds(310, 330, 150, 20);
        contraseña.setFont(new Font("Bodoni MT", Font.PLAIN, 15));
        recordar_pass.setForeground(new Color(39, 22, 250));
        recordar_pass.setCursor(new Cursor(HAND_CURSOR));
        this.add(recordar_pass);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
            if (ae.getSource()==Ingresar) {
                cargando = new ImageIcon(getClass().getResource("/Imagenes/cargando.gif"));
                JOptionPane.showMessageDialog(rootPane, "Verificando", "Verificando...", JOptionPane.DEFAULT_OPTION, cargando);
                this.setVisible(false);
                
                    Tabla ho = new Tabla();
                    ho.setVisible(true);
                
            }
            
    }
    
  
    
  
    
    
           
    
    
}
