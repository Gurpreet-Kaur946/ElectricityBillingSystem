import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class LastBill extends JFrame implements ActionListener{
	 	JLabel lblBill;
	    JTextArea txtAr;
	    JButton btnBill;
	    Choice choiceMtr;
	    JPanel panel;
	public LastBill() {
		super("Last Bill");
		setSize(500,750);
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		lblBill = new JLabel("Generate Bill");
		
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
        
        txtAr = new JTextArea();
        JScrollPane jsp = new JScrollPane(txtAr);
        txtAr.setFont(new Font("Times New Roman",Font.ITALIC,18));
        
        btnBill = new JButton("Generate Bill");
        
        panel.add(lblBill);
        panel.add(choiceMtr);
        add(panel,"North");
        
        add(jsp,"Center");
        add(btnBill,"South");
        
        btnBill.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent ae){
        		txtAr.append("\n\tDetails of the Last Bill\n\n");
        		txtAr.append("\n-------------------------------------------------------------------");
                try{
                    Conn c = new Conn();

                    ResultSet rs = c.stmt.executeQuery("select * from Customer where Meter_Number="+choiceMtr.getSelectedItem());
                    
                    if(rs.next()){
                    	txtAr.append("\n    Customer Id:       "+rs.getString("Customer_Id"));
                        txtAr.append("\n    Customer Name: "+rs.getString("Customer_Name"));
                        txtAr.append("\n    Meter Number:   "+rs.getString("Meter_Number"));
                        txtAr.append("\n    Address:             "+rs.getString("Address_"));
                        txtAr.append("\n    State:                 "+rs.getString("State_"));
                        txtAr.append("\n    City:                   "+rs.getString("City"));
                        txtAr.append("\n    Email:                "+rs.getString("Email_id"));
                        txtAr.append("\n    Phone Number: "+rs.getString("Phone_No"));
                        txtAr.append("\n-------------------------------------------------------------------");
                        txtAr.append("\n");
                    }

                    
                    
                    rs = c.stmt.executeQuery("select * from Bill where Meter_Number="+choiceMtr.getSelectedItem());
                    
                    while(rs.next()){
                        txtAr.append("   "+ rs.getString("Month_") + "              ₹" +rs.getString("Amount") + "\n");
                    }
                    
                    
                    
                    
                    
                    
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        });
        
        setLocation(350,40);
        
	}

	public static void main(String[] args) {
			new LastBill().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
