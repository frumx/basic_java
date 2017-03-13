package AnnotationsSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.reflect.*;

public class MainFrame extends JFrame {

	JComponent cp = (JComponent) getContentPane();

	@Loc(to = "cp")
	JPanel p1 = new JPanel();
	@Loc(to = "cp")
	JPanel p2 = new JPanel();

	@Loc(to = "p1")
	JButton b1 = new JButton("Przycisk 1");
	@Loc(to = "p1")
	JButton b2 = new JButton("Przycisk 2");
	@Loc(to = "p2")
	JButton b3 = new JButton("Przycisk 3");
	@Loc(to = "p2")
	JButton b4 = new JButton("Przycisk 4");
	@Loc(to = "p2")
	JButton b5 = new JButton("Przycisk 5");

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
		try {
			locate(); // metoda ta zajmie siê wk³adaniem do kontenerow
			locateComponents();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		pack();
		show();
	}

	private void locate() {
		Class c = getClass();
		for (Field f : c.getDeclaredFields()) {
			Loc anno = f.getAnnotation(Loc.class);

		}

	}

	private void locateComponents() throws Exception {
		Class klasa = getClass();
		for (Field f : klasa.getDeclaredFields()) { // po polach klasy
			Loc annot = f.getAnnotation(Loc.class); // dla f uzyskaæ anotacjê
													// Loc
			if (annot == null)
				continue; // nie ma - nastêpne pole
			System.out.println(annot); // zobaczmy jak wygl¹da
			String contName = annot.to(); // od adnotacji: nazwa kontenera
			Field contField = klasa.getDeclaredField(contName); // pole, ktore
																// go deklaruje
			Object container = contField.get(this); // sam obiekt-kontener
			Method m = container.getClass().getMethod("add", Component.class); // metoda
																				// add
			m.invoke(container, f.get(this)); // i jej wywo³anie - dodajemy
												// komponent

		}
	}

	public static void main(String args[]) {
		new MainFrame();

	}

}
