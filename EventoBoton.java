import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoBoton {

	public static void main(String[] args) {

		Marco ventana = new Marco();

	}

}

class Marco extends JFrame {

	Marco() {

		Toolkit MainScreen = Toolkit.getDefaultToolkit();

		Dimension PropScreen = MainScreen.getScreenSize();

		final int HEIGHT = PropScreen.height, WIDTH = PropScreen.width;

		setBounds(WIDTH / 4, HEIGHT / 4, WIDTH / 2, HEIGHT / 2);

		setTitle("repaso");

		setResizable(false);

		Lamina lamina = new Lamina();

		add(lamina);

		lamina.setBackground(SystemColor.window);

		setVisible(true);

	}

}

class Lamina extends JPanel implements ActionListener {

	JButton Bazul = new JButton("azul");

	JButton Bamarillo = new JButton("amarillo");

	JButton Brojo = new JButton("rojo");

	Lamina() {

		add(Bazul);

		add(Bamarillo);

		add(Brojo);

		Bazul.addActionListener(this);

		Bamarillo.addActionListener(this);

		Brojo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == Bazul) {

			setBackground(Color.BLUE);

		}

		else if (e.getSource() == Bamarillo) {

			setBackground(Color.YELLOW);

		}

		else if (e.getSource() == Brojo) {

			setBackground(Color.RED);

		}

	}
}