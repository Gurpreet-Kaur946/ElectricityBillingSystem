import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculateBill extends JFrame implements ActionListener {
	
	JLabel LblTitle,LblMtr,LblMonth,LblUnits,LblImg;
    JTextField txtUnits;
    Choice choiceMtr,choiceMonth;
    JButton btnCal,btnCncl;
    JPanel panel;
	CalculateBill() {
		panel = new JPanel();
        panel.setLayout(new GridLayout(5,2,20,20));
        panel.setBackground(Color.WHITE);
      
        LblTitle = new JLabel("Calculate Electricity Bill");
        LblMtr = new JLabel("Meter No");
        LblUnits = new JLabel("Units Cosumed");
        LblMonth = new JLabel("Month");
        
        txtUnits = new JTextField();
        
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
        
        btnCal = new JButton("Calculate");
        btnCncl = new JButton("Cancel");
        
        btnCal.setBackground(Color.BLACK);
        btnCal.setForeground(Color.WHITE);

        btnCncl.setBackground(Color.BLACK);
        btnCncl.setForeground(Color.WHITE);
        
        btnCal.setPreferredSize(new Dimension(20,50));
        btnCncl.setPreferredSize(new Dimension(20,50));
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("calculateBill.png"));
        Image i2 = i1.getImage().getScaledInstance(180, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        LblImg = new JLabel(i3);
        
        
        
        LblTitle.setFont(new Font("Times New Roman",Font.BOLD,26));
        //Move the label to center
        LblTitle.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        panel.add(LblMtr);
        panel.add(choiceMtr);
        panel.add(LblMonth);
        panel.add(choiceMonth);
        panel.add(LblUnits);
        panel.add(txtUnits);
        panel.add(btnCal);
        panel.add(btnCncl);
        
        setLayout(new BorderLayout(30,30));
        
        add(LblTitle,"North");
        add(panel,"Center");
        add(LblImg,"West");
        
        
        btnCal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String a = choiceMtr.getSelectedItem();
        		String b = choiceMonth.getSelectedItem();
        		String c = txtUnits.getText();
                 
                int p1 = Integer.parseInt(c);
                
                int p2 = p1*7;
                int amt = p2+50+12+102+20+50;
                
                String q = "INSERT INTO Bill VALUES('"+a+"','"+b+"','"+c+"','"+amt+"')";
                
                try{
                    Conn c1 = new Conn();
                    c1.stmt.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Total Amount is ₹"+amt);
                }catch(Exception ex){
                    ex.printStackTrace();
                }
                
                
        		
        	}
        });
        btnCncl.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(JOptionPane.showConfirmDialog(panel, "Do you want to exit?","Login",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
        		System.exit(0);	
        		}
        	}
        });
        
        getContentPane().setBackground(Color.WHITE);        
        setSize(650,500);
        setLocation(350,220);
	}

	public static void main(String[] args) {
		new CalculateBill().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
