package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import controller.CustController;
import controller.FarmController;

public class CustomerDashboard  extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private FarmController fc;
	private CustController cc;
	private JButton cartbutton = new JButton();
	private JMenuBar menuBar = new JMenuBar();
	//private JMenu ViewProfile = new JMenu("View Profile");
	private JMenu addFunds = new JMenu("Add Funds");
	private JPanel profilePanel = new JPanel();
	private JPanel contentPanel = new JPanel();
	private JLabel prPic = new JLabel("");
	private JTextField fullname = new JTextField();
	private JLabel fullnameL = new JLabel("Full Name");
	private  JTextField addr = new JTextField();
	private  JLabel emailL = new JLabel("Email");
	private  JTextField email = new JTextField();
	private  JPanel allCropsPanel = new JPanel();
	private  JLabel totalL = new JLabel("Total Earnings");
	private  JTextField total = new JTextField();
	private JMenu ManageCrops = new JMenu("Manage Crops");
	private JMenuItem ViewAll = new JMenuItem("View All Crops");
	private JMenuItem ViewSome = new JMenuItem("View Crops By Farmer");
	private JMenu mnExit = new JMenu("Exit");
	private JMenuItem mntmLogout = new JMenuItem("Logout");
 
	public CustomerDashboard() {
		configureView();
		ConfigureListeners ();
	}
	

	public void configureView()
	{	
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		setBounds(100, 100, 490, 348);
		/*contentPanel.add(profilePanel);
		profilePanel.setLayout(null);
		prPic.setBounds(255, 63, 209, 170);
		profilePanel.add(prPic);
		fullname.setEditable(false);
		fullname.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		fullname.setColumns(10);
		fullname.setBounds(101, 63, 111, 20);
		profilePanel.add(fullname);
		fullnameL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fullnameL.setBounds(10, 66, 71, 14);
		profilePanel.add(fullnameL);
		addrL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addrL.setBounds(10, 197, 71, 14);
		profilePanel.add(addrL);
		profilePanel.add(addr);
		emailL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		emailL.setBounds(10, 112, 46, 14);
		profilePanel.add(emailL);
		email.setEditable(false);
		profilePanel.add(email);
		totalL.setFont(new Font("Tahoma", Font.PLAIN, 12));
		totalL.setBounds(10, 156, 81, 14);
		profilePanel.add(totalL);
		profilePanel.add(total);
		profilePanel.setVisible(false);*/
		contentPanel.add(menuBar);
		//setTitle("Welcome to the Customer Dashboard");
			contentPanel.setSize(1200,600);
		cartbutton.setIcon(new ImageIcon("C:\\Users\\odane\\Downloads\\APProject2018-master\\FarmersMarket\\download.png"));
		menuBar.setBounds(0, 0, 488, 21);
		menuBar.add(ManageCrops);
		ManageCrops.add(ViewSome);
		ManageCrops.add(ViewAll);
		menuBar.add(cartbutton);
		menuBar.add(mnExit);
		menuBar.add(addFunds);
		mnExit.add(mntmLogout);
		menuBar.setVisible(true);
		contentPanel.setVisible(true);
		
	}

	public void ConfigureListeners () {
		mntmLogout.addActionListener(this);
		addFunds.addActionListener(this);
		ViewAll.addActionListener(this);
		ViewSome.addActionListener(this);
		cartbutton.addActionListener(this);
	}
	
	@Override

public void actionPerformed(ActionEvent e) {

		//EXITS ACCOUNT
		if (e.getSource().equals(mntmLogout)) {

			if (JOptionPane.showConfirmDialog(new JFrame("Exit"), "Are you sure you want logout ?", " Logout",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				super.dispose();
				new Login(cc, fc);
			}
		}

		
		//BRINGS UP PROFILE PAGE
		if (e.getSource().equals(addFunds)) {

		}
	
	if(e.getSource().equals(ViewAll)) {
		//open file and get user profile and display it
	}
	
	
	
	if(e.getSource().equals(ViewSome)) {
		//open file and display all the crops in the database
	}
	
	
	
	if(e.getSource().equals(ViewSome)) {
		//run specific search
	}
	
	
	
	if(e.getSource().equals(cartbutton)) {
		//Display all items in the cart
	}
}
	// TODO Auto-generated method stub
	
}
