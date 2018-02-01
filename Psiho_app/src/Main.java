import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	CardLayout layout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		super("Chestionar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 620);
		//Din motive de design am preferat sa blochez dimensiunea aplicatiei:
		setResizable(false);
		//Panoul principal al frame-ului:
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		//Iconita aplicatiei
		Image img = new ImageIcon(this.getClass().getResource("psiho_icon.png")).getImage();
		setIconImage(img);
		
		//Construim toate Panel-urile
		//Utilizatorul va alege care este la suprafata (apasand pe butoane)
		layout = new CardLayout();
		contentPane.setLayout(layout);
		//Login e prima adaugata, deci aceasta va fi implicit la suprafata
		contentPane.add(new Welcome(this, contentPane, layout), "Welcome");
		contentPane.add(new Q1(this), "Q1");
	}
}
