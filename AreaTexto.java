import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaTexto {

	public static void main(String[] args) {

		Ventana ventana = new Ventana();

	}

}

class Ventana extends JFrame {

	Ventana() {

		Toolkit PantallaPrimaria = Toolkit.getDefaultToolkit();

		Dimension PropiedadesPantalla = PantallaPrimaria.getScreenSize();

		int AltoP = PropiedadesPantalla.height, AnchoP = PropiedadesPantalla.width;

		setBounds(AnchoP / 4, AltoP / 4, AnchoP / 2, AltoP / 2);

		setTitle("repaso");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Lamina lamina = new Lamina();

		lamina.setBackground(SystemColor.window);

		add(lamina);

		setResizable(false);

		setVisible(true);

	}

}

class Lamina extends JPanel {

	JTextArea Comentario;
	
	public Dimension maximSize;
	
	Lamina() {

		Comentario = new JTextArea(2, 20);
		
		maximSize = Comentario.getMaximumSize();
		
		System.out.println(maximSize.height + " " + maximSize.width);

		JScrollPane BarraScroll = new JScrollPane(Comentario);

		Comentario.setLineWrap(true);

		add(BarraScroll);

	}

}
