package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;

public class CadastroQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroQuarto frame = new CadastroQuarto();
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
	public CadastroQuarto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroQuarto.class.getResource("/images/Group 23.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 217, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[45.00][][][32.00][][47.00][][][][][][][][][][][][1098.00][]", "[][][][][58.00][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(CadastroQuarto.class.getResource("/images/Titulo.png")));
		contentPane.add(lblNewLabel, "cell 3 2 15 1");
		
		JLabel lblNewLabel_1 = new JLabel("Número do quarto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1, "flowx,cell 3 5");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 7,growx");
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("New label");
		contentPane.add(lblNewLabel_2, "cell 3 9");
	}

}
