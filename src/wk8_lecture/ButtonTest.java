package wk8_lecture;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ButtonTest {
	public static void main(String[] args) {
		ButtonFrame bFrame = new ButtonFrame();
		bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bFrame.setSize(200, 275);
		bFrame.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		bFrame.setLocation(dim.width / 2, dim.height / 2);
	}
}
