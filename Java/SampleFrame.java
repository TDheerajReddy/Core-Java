//Program 2 on Frame
import java.awt.*;			//for components
import java.awt.event.*;	//using event package for Event
public class SampleFrame extends Frame implements ActionListener
{
	MenuBar mb;							//'MenuBar' is a Class
	Menu mFile , mEdit;
	MenuItem mNew,mOpen,mSave,mExit;	//for 'File'
	MenuItem mCut,mCopy,mPaste;			//for 'Edit'
	
	SampleFrame(String title)			//constructor
	{
		super(title);					//'Frame' clas as title name we give in the arguments
		
		setSize(getToolkit().getScreenSize());
		mb=new MenuBar();
		
		mFile=new Menu("File");			// put on menu bar
		mNew=new MenuItem("New");		// for put into the menu, under 'File' MenuBar		//and named as "New"
		mOpen=new MenuItem("Open");
		mSave=new MenuItem("Save");
		mExit=new MenuItem("Exit");
		
		mFile.add(mNew);				// put into the menu, under 'File' MenuBar
		mFile.add(mOpen);
		mFile.add(mSave);
		mFile.addSeparator();			// to separate/add line between Two items
		mFile.add(mExit);
		
		mb.add(mFile);					//'File' put on to the Menu Bar
		
		mEdit=new Menu("Edit");
		mCut=new MenuItem("Cut");
		mCopy=new MenuItem("Copy");
		mPaste=new MenuItem("Paste");
		
		mEdit.add(mCut);				// put into the menu, under 'Edit' MenuBar
		mEdit.add(mCopy);
		mEdit.add(mPaste);
		
		mb.add(mEdit);					//'Edit' put on to the Menu Bar
		setMenuBar(mb);
		mExit.addActionListener(this);	//To click on the 'Exit' Button
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
		System.exit(0);
	}

	public static void main(String ar[])
	{
		SampleFrame sf=new SampleFrame("MenuDemo");
		sf.setVisible(true);
		sf.setSize(400,400);
		sf.setLocation(100,100);
	}
}
