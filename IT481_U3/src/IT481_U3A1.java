import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



@SuppressWarnings("serial")
public class IT481_U3A1 extends JFrame {

	private JPanel contentPane;
	private controller controller;
	private String user;
	private String password;
	private String server;
	private String database;
	private Boolean isValid = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IT481_U3A1 frame = new IT481_U3A1();
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
	public IT481_U3A1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblConnect = new JLabel("Connect");
		lblConnect.setBounds(14, 25, 120, 20);
		
		
		contentPane.add(lblConnect);
		
		
		JButton btnConnect = new JButton("Connect to DB");
		btnConnect.setBounds(150, 22, 387, 26);
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 try{
				 
				 if(isValid) {
					 String dbURL = 
							 "jdbc:sqlserver://" + server + "\\SQLEXPRESS;"
							 + "database=" + database + ";"
							 + "user=" + user + ";"
							 + "password=" + password + ";"
							 + "encrypt=false;"
							 + "trustServerCertificate=false;"
							 + "loginTimeout=30;";
					 
					 controller = new controller(dbURL);
					 
					 JOptionPane.showMessageDialog(null, "Connected");
				 }
				 else {
					 JOptionPane.showMessageDialog(null,  "Unable to connect");
				 }
			 }catch(Exception e) {
				 JOptionPane.showMessageDialog(null, e.getMessage());
			 }
			 
			}
		});
		
		
		contentPane.add(btnConnect);
		
		
		
		JLabel lblCustomerCount = new JLabel(" Customer Count");
		lblCustomerCount.setBounds(14, 50, 120, 20);
		
		
		contentPane.add(lblCustomerCount);
		
		
		JButton btnCustomerCount = new JButton("Customer Count");
		btnCustomerCount.setBounds(150, 47, 387, 26);
		btnCustomerCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getCustomerCount();
					
					JOptionPane.showMessageDialog(null,  "The customer count is: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			
		});
		
		
		contentPane.add(btnCustomerCount);
		
		
		JLabel lblCustomerNames = new JLabel("Customer Names");
		lblCustomerNames.setBounds(14, 75, 120, 20);
		
		
		contentPane.add(lblCustomerNames);
		
		
		JButton btnCustomerNames = new JButton("Get Company Names");
		btnCustomerNames.setBounds(150, 72, 387, 26);
		btnCustomerNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getCompanyNames();
					
					JOptionPane.showMessageDialog(null,  "Customer names: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			
		});
				
		
		contentPane.add(btnCustomerNames);
		
		
		JLabel lblOrderCount = new JLabel("Order Count");
		lblOrderCount.setBounds(14, 100, 120, 20);
		
		
		contentPane.add(lblOrderCount);
		
		
		JButton btnOrderCount = new JButton("Order Count");
		btnOrderCount.setBounds(150, 97, 387, 26);
		btnOrderCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getOrderCount();
					
					JOptionPane.showMessageDialog(null,  "The order count is: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			
		});
				
		
		contentPane.add(btnOrderCount);
		
		
		JLabel lblOrderNames = new JLabel("Order Ship Names");
		lblOrderNames.setBounds(14, 125, 120, 20);
		
		
		contentPane.add(lblOrderNames);
		
		
		JButton btnOrderNames = new JButton("Get Order Ship Names");
		btnOrderNames.setBounds(150, 122, 387, 26);
		btnOrderNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getShipNames();
					
					JOptionPane.showMessageDialog(null,  "Order ship names: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			
		});
				
		
		contentPane.add(btnOrderNames);
		
		
		JLabel lblEmployeeCount = new JLabel("Employee Count");
		lblEmployeeCount.setBounds(14, 150, 120, 20);
		
		
		contentPane.add(lblEmployeeCount);
		
		
		JButton btnEmployeeCount = new JButton("Employee Count");
		btnEmployeeCount.setBounds(150, 147, 387, 26);
		btnEmployeeCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getEmployeeCount();
					
					JOptionPane.showMessageDialog(null,  "The employee count is: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			
		});
		
		
		contentPane.add(btnEmployeeCount);
		
		
		JLabel lblEmployeeNames = new JLabel("Employee Names");
		lblEmployeeNames.setBounds(14, 175, 120, 20);
		
		
		contentPane.add(lblEmployeeNames);
		
		
		JButton btnEmployeeNames = new JButton("Get Employee Names");
		btnEmployeeNames.setBounds(150, 172, 387, 26);
		btnEmployeeNames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					String returnedValue = controller.getEmployeeNames();
					
					JOptionPane.showMessageDialog(null,  "Employee nmaes: " + returnedValue);
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				 }
				 }
			});
		
		
		
		contentPane.add(btnEmployeeNames);
		
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(14, 200, 120, 20);
		contentPane.add(lblUser);
		
		JTextField tfUser = new JTextField(20);
		tfUser.setBounds(150, 197, 387, 26);
		contentPane.add(tfUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(14, 225, 120, 20);
		contentPane.add(lblPassword);
		
		final JPasswordField pfPassword = new JPasswordField(20);
		pfPassword.setBounds(150, 222, 387, 26);
		contentPane.add(pfPassword);
		
		
		JLabel lblServer = new JLabel("Server");
		lblServer.setBounds(14, 250, 120, 20);
		contentPane.add(lblServer);
		
		JTextField tfServer = new JTextField("DESKTOP-V59KGGG");
		tfServer.setBounds(150, 247, 387, 26);
		contentPane.add(tfServer);
		
		
		JLabel lblDatabase = new JLabel("Database");
		lblDatabase.setBounds(14, 275, 120, 20);
		contentPane.add(lblDatabase);
		
		JTextField tfDatabase = new JTextField("Northwind");
		tfDatabase.setBounds(150, 272, 387, 26);
		contentPane.add(tfDatabase);
		
		JButton btnGet = new JButton("Login");
		btnGet.setBounds(14, 300, 120, 20);
		btnGet.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						server = new String(tfServer.getText());
						database = new String(tfDatabase.getText());
						user = new String(tfUser.getText());
						password = new String(pfPassword.getPassword());
						
						
						if(user.isEmpty()|| password.isEmpty() || database.isEmpty() ||
								server.isEmpty()) {
							
							
							
							isValid = false;
							
							JOptionPane.showMessageDialog(null, 
								"You must enter a user name, password, server, and database");
						}
						else {
							isValid = true;
							JOptionPane.showMessageDialog(null, "Values accepted");
						}
					}
				});
		
		contentPane.add(btnGet);
		}

}

