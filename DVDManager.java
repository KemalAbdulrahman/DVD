import java.util.*;

import javax.swing.JOptionPane;

/**
 * 	Program to display and modify a simple DVD collection
 */

public class DVDManager {

	public static void main(String[] args) {
		
		DVDUserInterface dlInterface;
		DVDCollection dl = new DVDCollection();

		System.out.println("Enter name of data file to load:");
		String filename = JOptionPane.showInputDialog("Please Enter The File Name: ");		
		dl.loadData(filename);

		dlInterface = new DVDGUI(dl);
		dlInterface.processCommands();
		
	}

}
