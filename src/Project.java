import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class Project extends JFrame implements ActionListener {

	Project() {
		super("Electricity Billing System");
		setSize(1920,1030);
		
		/*Adding Background*/
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("background2.jpg"));
		Image i1 = img.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
		ImageIcon img1 = new ImageIcon(i1);
		JLabel l1 = new JLabel(img1);
		add(l1);
	
		
		/*First Column*/
		JMenuBar mb = new JMenuBar();
		JMenu master = new JMenu("Menu");
		JMenuItem m1 = new JMenuItem("New Customer");
		JMenuItem m2 = new JMenuItem("Customer Details");
		JMenuItem m3 = new JMenuItem("Deposit Details");
		master.setForeground(Color.BLUE);
		
		/*Customer Details*/
		m1.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("addCustomer.png"));
		Image image1 = ic1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m1.setIcon(new ImageIcon(image1));
		m1.setMnemonic('D');
		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		m1.setBackground(Color.WHITE);
		
		/*Meter Details*/
		m2.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("CustomerDet.png"));
		Image image2 = ic2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m2.setIcon(new ImageIcon(image2));
		m2.setMnemonic('M');
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
		m2.setBackground(Color.WHITE);
		
		/*Deposit Details
		m3.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("depositDet.png"));
		Image image3 = ic3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m3.setIcon(new ImageIcon(image3));
		m3.setMnemonic('N');
		m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		m3.setBackground(Color.WHITE);*/
		
		
		m1.addActionListener(this);
		m2.addActionListener(this);
		//m3.addActionListener(this);
		
		
		/*----------------------------------------------------------------------*/
		
		
		/*Second Column*/
		
		JMenu user = new JMenu("User");
		JMenuItem user1 = new JMenuItem("Pay Bill");
		JMenuItem user2 = new JMenuItem("Calculate Bill");
		JMenuItem user3 = new JMenuItem("Last Bill");
		user.setForeground(Color.BLUE);
		
		
		/*Pay Bill*/
		user1.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("PayBill.png"));
		Image image4 = ic4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		user1.setIcon(new ImageIcon(image4));
		user1.setMnemonic('P');
		user1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		user1.setBackground(Color.WHITE);
		
		
		/*Bill Details*/
		user2.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic5 = new ImageIcon(ClassLoader.getSystemResource("BillDet.png"));
		Image image5 = ic5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		user2.setIcon(new ImageIcon(image5));
		user2.setMnemonic('B');
		user2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
		user2.setBackground(Color.WHITE);
		
		
		/*Last Bill*/
		user3.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic6 = new ImageIcon(ClassLoader.getSystemResource("lastBill.png"));
		Image image6 = ic6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		user3.setIcon(new ImageIcon(image6));
		user3.setMnemonic('L');
		user3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
		user3.setBackground(Color.WHITE);
		
		user1.addActionListener(this);
		user2.addActionListener(this);
		user3.addActionListener(this);
		
		
		//-------------------------------------------------------------------------------//
		
		/*Third Column*/
		JMenu report = new JMenu("Report");
		
		report.setForeground(Color.BLUE);
		
		
		/*Report*/
		JMenuItem rp = new JMenuItem("Generate Bill");
		rp.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic7 = new ImageIcon(ClassLoader.getSystemResource("Report.png"));
		Image image7 = ic7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		rp.setIcon(new ImageIcon(image7));
		rp.setMnemonic('R');
		rp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		rp.setBackground(Color.WHITE);
		
		
		rp.addActionListener(this);
		
		
		//--------------------------------------------------------------------------------//
		
		/*Fourth Column*/
		JMenu utility = new JMenu("Utility");
		JMenuItem ut1 = new JMenuItem("Notepad");
		JMenuItem ut2 = new JMenuItem("Calculator");
		JMenuItem ut3 = new JMenuItem("Web Browser");
		utility.setForeground(Color.BLUE);
		
		/*Calendar*/
		ut1.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic8 = new ImageIcon(ClassLoader.getSystemResource("Calendar.jpg"));
		Image image8 = ic8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ut1.setIcon(new ImageIcon(image8));
		ut1.setMnemonic('C');
		ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		ut1.setBackground(Color.WHITE);
		
		
		/*Calculator*/
		ut2.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic9 = new ImageIcon(ClassLoader.getSystemResource("calculator.png"));
		Image image9 = ic9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ut2.setIcon(new ImageIcon(image9));
		ut2.setMnemonic('X');
		ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		ut2.setBackground(Color.WHITE);
		
		
		/*Web Browser*/
		ut3.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic10 = new ImageIcon(ClassLoader.getSystemResource("chrome.jpg"));
		Image image10 = ic10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ut3.setIcon(new ImageIcon(image10));
		ut3.setMnemonic('W');
		ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
		ut3.setBackground(Color.WHITE);
		
		
		ut1.addActionListener(this);
		ut2.addActionListener(this);
		ut3.addActionListener(this);
		
		
		//-------------------------------------------------------------------------//
		
		/*Fifth Column*/
		
		JMenu exit = new JMenu("Exit");
		JMenuItem ex = new JMenuItem("Exit");
		exit.setForeground(Color.BLUE);
		
		/*Exit*/
		ex.setFont(new Font("Arial",Font.PLAIN,12));
		ImageIcon ic11 = new ImageIcon(ClassLoader.getSystemResource("exit.png"));
		Image image11 = ic11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ex.setIcon(new ImageIcon(image11));
		ex.setMnemonic('Z');
		ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		ex.setBackground(Color.WHITE);
		
		
		ex.addActionListener(this);
		
		
		//------------------------------------------------------------------------//
		
		
		master.add(m1);
		master.add(m2);
		//master.add(m3);
		
		
		user.add(user1);
		user.add(user2);
		user.add(user3);
		
		report.add(rp);
		
		utility.add(ut1);
		utility.add(ut2);
		utility.add(ut3);
		
		exit.add(ex);
		
		mb.add(master);
		mb.add(user);
		mb.add(report);
		mb.add(utility);
		mb.add(exit);
		
		setJMenuBar(mb);
		
		setFont(new Font("Arial",Font.BOLD,16));
		setLayout(new FlowLayout());
		setVisible(false);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String msg = ae.getActionCommand();
		if(msg.equals("Customer Details")) {
			new CustomerDetails().setVisible(true);
		}else if(msg.equals("New Customer")) {
			new NewCustomer().setVisible(true);
		}else if(msg.equals("Calculate Bill")){
			new CalculateBill().setVisible(true);
		}else if(msg.equals("Pay Bill")) {
			new PayBill().setVisible(true);
		}else if(msg.equals("Notepad")) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e){}
		}else if(msg.equals("Calculator")) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e){}
		}else if(msg.equals("Web Browser")) {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			}catch(Exception e) {}
		}else if(msg.equals("Exit")) {
			System.exit(0);
		}else if(msg.equals("Generate Bill")) {
			new GenerateBill().setVisible(true);
		}else if(msg.equals("Last Bill")) {
			new LastBill().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Project().setVisible(true);

	}

}
