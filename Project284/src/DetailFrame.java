import javax.swing.JFrame;

public class DetailFrame extends JFrame {
	
	public DetailFrame() {
		DetailPanel p = new DetailPanel();
		this.add(p);
		this.setTitle("Course Detail");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
			
	}
	public static void main(String [] args) {
		DetailFrame d = new DetailFrame();
	}

}
