import javax.swing.JFrame;


public class counterGUI {

	public static void main(String[] args) {
		//Create J Frame
		JFrame counterFrame = new JFrame("Counter GUI");
		
		//Create Counting Functionality CounterPanel and add to Display
		counterFrame.getContentPane().add(new CounterPanel());
		
		//Set close operation response to normal window close
		counterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Size CounterFrame and contents according to set preferred sizes
		counterFrame.pack();
		
		//Render the display visible
		counterFrame.setVisible(true);
		
		
	}
	
}
