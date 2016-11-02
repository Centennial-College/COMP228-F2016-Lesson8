package wk8_lecture;

//common to all GUI we used so far
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//unique to current example
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ButtonFrame extends JFrame {
	private final JButton plainJButton;
	private final JButton fancyJButton;

	public ButtonFrame() {
		super("Test JButtons");
		setLayout(new FlowLayout());

		plainJButton = new JButton("Plain button");
		add(plainJButton);

		Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
		Icon bug2 = new ImageIcon(this.getClass().getResource("bug2.gif"));

		fancyJButton = new JButton("Fancy Button", bug1);
		fancyJButton.setRolloverIcon(bug2);
		add(fancyJButton);

		plainJButton.addActionListener(new ButtonHandler());
		fancyJButton.addActionListener(new ButtonHandler());
	}

	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", e.getActionCommand()));
		}

	}
}
