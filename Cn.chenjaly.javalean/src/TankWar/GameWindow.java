/**
 * 
 */
package TankWar;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import cn.chenjaly.classobject.ThisTest;

public class GameWindow extends JFrame{

//	得到窗体对象的内容面板
	Container gContainer = this.getContentPane();
	
	public GameWindow() {
		// TODO Auto-generated constructor stub
//		设置窗体大小于位置
		this.setBounds(300, 300, 600, 600);
		
		Image image = Toolkit.getDefaultToolkit().getImage("scr/image/tankU_red.gif");
		ImageIcon icon = new ImageIcon(image);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
