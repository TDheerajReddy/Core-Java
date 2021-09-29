//Project in Java Frame 31-05-21
import java.awt.*;
class MyFrame extends Frame
{
	public static void main(String ar[])
	{
		//Frame
		MyFrame frm = new MyFrame();
		
		Label lbl1 = new Label("No 1");
		Label lbl2 = new Label("No 2");
		Label lbl3 = new Label("Sum");
		
		TextField txt1 = new TextField(20);
		TextField txt2 = new TextField(20);
		TextField txt3 = new TextField(20);
		
		Button btn = new Button("Result");
		
		frm.setLayout(new FlowLayout());
		
		frm.add(lbl1);
		frm.add(txt1);
		
		frm.add(lbl2);
		frm.add(txt2);
		
		frm.add(lbl3);
		frm.add(txt3);
		
		frm.add(btn);
		
		frm.setTitle("First AWT Pragram");
		txt3.setEditable(false);
		frm.setVisible(true);
		frm.setSize(275,250);
		
		
	}
}
