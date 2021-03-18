import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
public class GenerateBill extends JFrame implements ActionListener{
	JLabel lblBill;
	JTextArea txtAr;
	JButton btnBill;
	Choice choiceMtr, choiceMonth;
	JPanel panel;
	GenerateBill() {
		super("Bill Details");
		setSize(500,750);
        setLayout(new BorderLayout());
        panel = new JPanel();
        lblBill = new JLabel("Generate Bill");        
        choiceMtr = new Choice();
        choiceMonth = new Choice();        
        choiceMtr = new Choice();
        choiceMtr.add("98000");
        choiceMtr.add("98001");
        choiceMtr.add("98002");
        choiceMtr.add("98003");
        choiceMtr.add("98004");
        choiceMtr.add("98005");
        choiceMtr.add("98006");
        choiceMtr.add("98007");
        choiceMtr.add("98008");
        choiceMtr.add("98009");
        choiceMtr.add("98010");         
        choiceMonth = new Choice();
        choiceMonth.add("January");
        choiceMonth.add("February");
        choiceMonth.add("March");
        choiceMonth.add("April");
        choiceMonth.add("May");
        choiceMonth.add("June");
        choiceMonth.add("July");
        choiceMonth.add("August");
        choiceMonth.add("September");
        choiceMonth.add("October");
        choiceMonth.add("November");
        choiceMonth.add("December");
        txtAr = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(txtAr);
        txtAr.setFont(new Font("Times New Roman",Font.ITALIC,18));
        btnBill = new JButton("Generate Bill");        
        panel.add(lblBill);
        panel.add(choiceMtr);
        panel.add(choiceMonth);
        add(panel,"North");        
        add(jsp,"Center");
        add(btnBill,"South");        
        btnBill.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
        	        try{
        	            Conn c = new Conn();        	   
        	            String month = choiceMtr.getSelectedItem();
        	            txtAr.setText("\tReliance Power Limited\nELECTRICITY BILL"
        	            + " FOR THE MONTH OF "+choiceMonth.getSelectedItem()+" ,2020\n");        	          
        	            ResultSet rs = c.stmt.executeQuery("select * from Customer "
        	            		+ "where Meter_Number="+choiceMtr.getSelectedItem());
        	            if(rs.next()){
        	            	txtAr.append("\n    Customer Id: "
        	            			+ "       "+rs.getString("Customer_Id"));
        	                txtAr.append("\n    Customer Name:  "+rs.getString("Customer_Name"));
        	                txtAr.append("\n    Meter Number:    "+rs.getString("Meter_Number"));
        	                txtAr.append("\n    Address:              "+rs.getString("Address_"));
        	                txtAr.append("\n    State:                  "+rs.getString("State_"));
        	                txtAr.append("\n    City:                   "+rs.getString("City"));
        	                txtAr.append("\n    Email:                "+rs.getString("Email_id"));
        	                txtAr.append("\n    Phone Number:  "+rs.getString("Phone_No"));
        	                txtAr.append("--------------------------------------------------");
        	            }        	            
        	            rs = c.stmt.executeQuery("select * from tax");        	            
        	            if(rs.next()){
        	                txtAr.append("\n    Meter Location:"+rs.getString("meter_location"));
        	                txtAr.append("\n    Meter Type:      "+rs.getString("meter_type"));
        	                txtAr.append("\n    Phase Code:    "+rs.getString("phase_code"));
        	                txtAr.append("\n    Bill Type:         "+rs.getString("bill_type"));
        	                txtAr.append("\n    Days:               "+rs.getString("Days_"));
        	                txtAr.append("\n");
        	                txtAr.append("----------------------------------------------------");
        	               
        	                txtAr.append("\n    Meter Rent:\t\t₹"+rs.getString("Meter_Rent"));
        	                txtAr.append("\n    MCB Rent:  \t₹"+rs.getString("MCB_Rent"));
        	                txtAr.append("\n    Service Tax:\t₹"+rs.getString("Service_Rent"));
        	                txtAr.append("\n    GST@9%:\t\t₹"+rs.getString("Gst"));
        	                txtAr.append("\n");        	                
        	            }        	            
        	            rs = c.stmt.executeQuery("select * from Bill where Meter_Number="
        	            +choiceMtr.getSelectedItem());        	            
        	            if(rs.next()){
        	                txtAr.append("\n    Current Month :\t"+rs.getString("Month_"));
        	                txtAr.append("\n    Units Consumed:\t"+rs.getString("Units"));
        	                txtAr.append("\n    Total Charges :\t₹"+rs.getString("Amount"));
        	                txtAr.append("\n--------------------------------------------------");
        	                txtAr.append("\n    TOTAL PAYABLE AMOUNT:\t₹"+rs.getString("Amount"));
        	            }        	  
					        	        }catch(Exception e){
					        	            e.printStackTrace();
					        	        }        	    }
					        });        
					        setLocation(350,40);}
						public static void main(String[] args) {
							new GenerateBill().setVisible(true);}
						@Override
						public void actionPerformed(ActionEvent e) {		
						}}
