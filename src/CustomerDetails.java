import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

import javax.swing.JFrame;

public class CustomerDetails extends JFrame implements ActionListener {
	
	JTable TblDet;
	JButton BtnPrint;
	String x[] = {"Customer Id","Customer Name","Meter No","Address","State","City","Email","Phone No."};
	String y[][] = new String[20][8];
	int i=0,j=0;
	
	public CustomerDetails() {
		super("Customer Details.");
		setSize(1200,650);
		setLocation(200,150);
		try {
			Conn c1 = new Conn();
			String str = "SELECT * FROM Customer";
			ResultSet rs = c1.stmt.executeQuery(str);
			while(rs.next()) {
				y[i][j++] = rs.getString("Customer_Id");
				y[i][j++] = rs.getString("Customer_Name");
				y[i][j++] = rs.getString("Meter_Number");
				y[i][j++] = rs.getString("Address_");
				y[i][j++] = rs.getString("State_");
				y[i][j++] = rs.getString("City");
				y[i][j++] = rs.getString("Email_id");
				y[i][j++] = rs.getString("Phone_No");
				i++;
				j=0;
			}
			TblDet = new JTable(y,x);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		BtnPrint = new JButton("Print");
		add(BtnPrint,"South");
		JScrollPane scroll = new JScrollPane(TblDet);
		add(scroll);
		BtnPrint.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new CustomerDetails().setVisible(true);

	}

	/*public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			TblDet.print();
		}catch(Exception ex) {};
		
	}

}
