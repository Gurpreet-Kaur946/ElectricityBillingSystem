import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
public class PayBill extends JFrame{
	
	PayBill() {
		JEditorPane editPane = new JEditorPane();
		editPane.setEditable(false);
		
		try {
			editPane.setPage("https://paytm.com/electricity-bill-payment");
		}catch(Exception e) {
			editPane.setContentType("text/html");
			editPane.setText("<html>Could not load</html>");
		}
		
		JScrollPane scrollPane = new JScrollPane(editPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(scrollPane);
		setPreferredSize(new Dimension(800,600));
		setSize(800,800);
		setLocation(250,120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PayBill().setVisible(true);

	}
}