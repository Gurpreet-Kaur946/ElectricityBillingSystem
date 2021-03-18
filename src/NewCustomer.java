/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;


public class NewCustomer extends JFrame implements ActionListener{

	JLabel LblId,LblName,LblMeter,LblAddress,LblEmail,LblPhn,LblState,LblCity,LblImg;
	JTextField txtId,txtName,txtMeter,txtAddress,txtEmail,txtPhn;
	String[] states ={"Delhi","Haryana","Punjab","Uttar Pradesh","Uttarakhand"};
	JComboBox CmbState = new JComboBox(states);
	String[] cities ={"Delhi","Gurugram","Rohtak","Ludhiana","Chandigarh","Lucknow","Kanpur","Dehradun","Kashipur"};
	JComboBox CmbCity = new JComboBox(cities);
	JButton BtnSubmit,BtnCancel;
	
	NewCustomer(){
		setLocation(350,100);
		setSize(790,700);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(14,3,12,12));
		
		p.setBackground(Color.WHITE);
		
		LblId = new JLabel("Customer Id");
		txtId = new JTextField();
		p.add(LblId);
		p.add(txtId);
		
		LblName = new JLabel("Customer Name");
		txtName = new JTextField();
		p.add(LblName);
		p.add(txtName);
		
		LblMeter = new JLabel("Meter No.");
		txtMeter = new JTextField();
		p.add(LblMeter);
		p.add(txtMeter);
		
		LblAddress = new JLabel("Address");
		txtAddress = new JTextField();
		p.add(LblAddress);
		p.add(txtAddress);
		
		LblEmail = new JLabel("Email Id");
		txtEmail = new JTextField();
		p.add(LblEmail);
		p.add(txtEmail);
		
		LblPhn = new JLabel("Phone Number");
		txtPhn = new JTextField();
		p.add(LblPhn);
		p.add(txtPhn);
		
		LblState = new JLabel("State");
		p.add(LblState);
		p.add(CmbState);
		CmbState.setSelectedIndex(0);
		CmbState.addActionListener(this);
		
		
		LblCity = new JLabel("City");
		CmbCity.setSelectedIndex(0);
		CmbCity.addActionListener(this);
		p.add(LblState);
		p.add(CmbCity);
		//CmbCity = new JComboBox();
		//txtCity = new JTextField();
		
		
		BtnSubmit = new JButton("Submit");
		BtnCancel = new JButton("Cancel");
		
		BtnSubmit.setBackground(Color.BLACK);
		BtnSubmit.setForeground(Color.WHITE);
		BtnCancel.setForeground(Color.WHITE);
		BtnCancel.setBackground(Color.BLACK);
		
		p.add(BtnSubmit);
		p.add(BtnCancel);
		setLayout(new BorderLayout());
		
		add(p,"Center");
		
		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("addCustomer.png"));
		Image i1 = img1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		LblImg = new JLabel(i2);
		//p.add(LblImg);
		
		add(LblImg,"West"); 
		getContentPane().setBackground(Color.WHITE);
		
		BtnSubmit.addActionListener(this);
		BtnCancel.addActionListener(this);
		
		
	}
	



	public static void main(String[] args) {
		new NewCustomer().setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		String a = txtId.getText();
		String b = txtName.getText();
		String c = txtMeter.getText();
		String d = txtAddress.getText();
		String e = txtEmail.getText();
		String f = txtPhn.getText();
		JComboBox cb = (JComboBox)ae.getSource();
		String g = (String)cb.getSelectedItem();
		//String h = (String)CmbState.getSelectedItem();
		
		
		
		String str = "insert into Customer values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
		
		try {
			Conn cn = new Conn();
			cn.stat.executeUpdate(str);
			JOptionPane.showMessageDialog(null, "New Customer Added");
			this.setVisible(false);
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
*/




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class NewCustomer extends JFrame implements ActionListener{
    JLabel LblId,LblName,LblMeter,LblAddress,LblEmail,LblPhone,LblState,LblCity,LblImg;
    JTextField txtId,txtName,txtMtr,txtAdd,txtEmail,txtPhone, txtState,txtCity;
    JButton btnSubmit,btnCncl;
    NewCustomer(){
    	super("Registeration");
        setLocation(350,100);
        setSize(750,700);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(10,2,12,12)); 
        
        p.setBackground(Color.WHITE);
        
        //Setting font
        Font f = new Font("Times New Roman",Font.PLAIN,16);
        Font f1 = new Font("Times New Roman",Font.BOLD,16);
        
        
        LblId=new JLabel("Customer Id");
        LblId.setFont(f1);
        txtId=new JTextField();
        txtId.setFont(f);
        p.add(LblId);
        p.add(txtId);
        
        LblName = new JLabel("Name");
        LblName.setFont(f1);
        txtName = new JTextField();
        txtName.setFont(f);
        p.add(LblName);
        p.add(txtName);
        
        LblMeter = new JLabel("Meter No");
        LblMeter.setFont(f1);
        txtMtr = new JTextField();
        txtMtr.setFont(f);
        p.add(LblMeter);
        p.add(txtMtr);
        
        LblAddress = new JLabel("Address");
        LblAddress.setFont(f1);
        txtAdd = new JTextField();
        txtAdd.setFont(f);
        p.add(LblAddress);
        p.add(txtAdd);
        
        
        LblState = new JLabel("State");
        LblState.setFont(f1);
        txtState = new JTextField();
        txtState.setFont(f);
        p.add(LblState);
        p.add(txtState);
        
        LblCity = new JLabel("City");
        LblCity.setFont(f1);
        txtCity = new JTextField();
        txtCity.setFont(f);
        p.add(LblCity);
        p.add(txtCity);
        
        LblEmail = new JLabel("Email");
        LblEmail.setFont(f1);
        txtEmail = new JTextField();
        txtEmail.setFont(f);
        p.add(LblEmail);
        p.add(txtEmail);
        
        LblPhone = new JLabel("Phone Number");
        LblPhone.setFont(f1);
        txtPhone = new JTextField();
        txtPhone.setFont(f);
        p.add(LblPhone);
        p.add(txtPhone);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(f1);
        btnCncl = new JButton("Cancel");
        btnCncl.setFont(f1);
        
        btnSubmit.setBackground(Color.BLACK);
        btnSubmit.setForeground(Color.WHITE);
        
        btnCncl.setBackground(Color.BLACK);
        btnCncl.setForeground(Color.WHITE);
        
        p.add(btnSubmit);
        p.add(btnCncl);
        setLayout(new BorderLayout());
        
        add(p,"Center");
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("NewCust.png"));
        Image i3 = ic1.getImage().getScaledInstance(150, 300,Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
        LblImg = new JLabel(ic2);
        
        
        add(LblImg,"West");
        //for changing the color of the whole 
        getContentPane().setBackground(Color.WHITE);
        
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent ae){
                if(txtId.getText().equals("")) {
                	JOptionPane.showMessageDialog(null, "Please enter Customer Id!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                else {
                	String a = txtId.getText();
                	int i1 = Integer.parseInt(a);
                    String b = txtName.getText();
                    String c = txtMtr.getText();
                    int i2 = Integer.parseInt(c);
                    String d = txtAdd.getText();
                    String e = txtState.getText();
                	String f = txtCity.getText();
                	String g = txtEmail.getText();
                	String h = txtPhone.getText();

                	int i3 = Integer.parseInt(h);

                	
                    try{
                        Conn c1 = new Conn();
                        String str = "INSERT INTO Customer(Customer_Id,Customer_Name,Meter_Number,Address_,State_,City,Email_id,Phone_No)" + "VALUES("+i1+",'"+b+"',"+i2+",'"+d+"','"+e+"','"+f+"','"+g+"',"+i3+")";
                        int rows = c1.stmt.executeUpdate(str);
                        if(rows>0) {
                        	JOptionPane.showMessageDialog(null, "New Customer Added Successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }catch(Exception ex){ex.printStackTrace();}
                   }
                }
        });
        
        btnCncl.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(JOptionPane.showConfirmDialog(p, "Do you want to exit?","Login",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_OPTION) {
        		System.exit(0);	
        		}
        	}
        });  
    }
       
    public static void main(String[] args){
        new NewCustomer().setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}