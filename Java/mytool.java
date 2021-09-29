//Program 1 on Applet

import java.applet.*;		//'applet' is a Package
import java.awt.*;			//awt=Abstract Window Toolkit,	includes property lik:- Label,TextField,Button & etc

public class mytool extends Applet //'Applet' is a class
{

    Label l1, l2;
    TextField t1, t2;
    Button b1;
    
    public void init() //variables are initialize here, it is a predefine method
    {
        setLayout(new FlowLayout());		//This is default layout of Applet	//Here we tell what layout is using
        l1 = new Label("Enter Your Name: ");
        l2 = new Label("Enter Your Age: ");
        t1 = new TextField(20);				//size is 20 Characters
        t2 = new TextField(20);
        b1 = new Button("Click");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
    }
}
/*
<applet code=mytool width=500 height=400></applet>
*/
