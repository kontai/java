package GUI.I_awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Frame f = new Frame("my frame");
//		f.setSize(500, 400);		
//		f.setLocation(400, 200);
		f.setBounds(400, 200, 500, 400);		
		f.setLayout(new FlowLayout());//設置流式佈局
		
		Button but  = new Button("一個按鈕");
		
		f.add(but);//將按鈕添加到窗體中。 
		
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				
//				System.out.println("closing......."+e);
				System.exit(0);
			}
			
		});
		
		
		//在按鈕上加上一個監聽。
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println("button run .....");
				System.exit(0);
			}
		});
		
		f.setVisible(true);
		System.out.println("over");
	}

}
