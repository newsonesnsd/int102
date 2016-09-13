import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Homework11 extends JFrame {
	public static void main(String[] args) {
		Homework11 frameTabel = new Homework11();
		frameTabel.setVisible(true);
	}
	public Homework11() {
		// JFrame
		super("INT102"); // Title
		setSize(300, 200);
		setLocation(500, 280);
		// JLabel
		JLabel welcome = new JLabel("Jirapong Rungsawang!!!"); // text output
		welcome.setBounds(70, 50, 150, 60);
		// Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(welcome);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
