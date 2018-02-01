import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Welcome extends JPanel {
	
	public Welcome(JFrame mother, JPanel pane, CardLayout cards) {
		setBounds(100, 100, 1000, 620);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Imaginea de fundal:
		JLabel label = new JLabel();
		label.setBounds(0, 0, 1000, 620);
		Image img = new ImageIcon(this.getClass().getResource("welcome_app.jpg")).getImage();
		
		JButton btnNewButton = new JButton("Incepe Chestionarul");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cards.show(pane, "Q1");
			}
		});
		btnNewButton.setBounds(325, 518, 313, 50);
		add(btnNewButton);
		
		label.setIcon(new ImageIcon(img));
		add(label);
		setLayout(null);
	}
}
