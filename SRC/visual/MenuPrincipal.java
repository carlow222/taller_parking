package visual;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BorderFactory;

public class MenuPrincipal extends JFrame {
    
    public MenuPrincipal() {
        setTitle("Menú Principal");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        // Usar un panel con borde vacio para que los botones no se estiren tanto
        JPanel mainPanel = new JPanel(new BorderLayout(10, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
        
        JLabel titulo = new JLabel("Menú Principal", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(titulo, BorderLayout.NORTH);
        
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new java.awt.GridLayout(4, 1, 10, 15));
        
        JButton btnChofer = new JButton("Registrar Chofer");
        JButton btnCarro = new JButton("Registrar Carro");
        JButton btnMotor = new JButton("Registrar Motor");
        JButton btnPasajero = new JButton("Registrar Pasajero");
        
        btnChofer.addActionListener(e -> new registroChofer().setVisible(true));
        btnCarro.addActionListener(e -> new registroCarro().setVisible(true));
        btnMotor.addActionListener(e -> new registro_motor().setVisible(true));
        btnPasajero.addActionListener(e -> new registroUsuario().setVisible(true)); 
        
        btnPanel.add(btnChofer);
        btnPanel.add(btnCarro);
        btnPanel.add(btnMotor);
        btnPanel.add(btnPasajero);
        
        mainPanel.add(btnPanel, BorderLayout.CENTER);
        
        setContentPane(mainPanel);
    }
}
