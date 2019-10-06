package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	final public static int window_Width = 1600;
	final public static int window_Height = 800;
	JButton addTask = new JButton("Add Task");
	JButton viewTasks = new JButton("View Tasks");
	JButton removeTask = new JButton("Remove Task");
	JButton saveList = new JButton("Save List");
	JButton loadList = new JButton("Load List");
	JLabel label = new JLabel("test");
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
//	JTextField field = new JTextField();
	ArrayList<String> tasks = new ArrayList<String>();
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.setup();
	}
	
	public void setup() {
		frame.add(panel1);
		frame.setVisible(true);
		panel1.setVisible(true);
//		panel1.setSize(window_Width/2,window_Height/2);
//		frame.setSize(window_Width,window_Height);
		panel1.add(loadList);
		panel1.add(saveList);
		panel1.add(removeTask);
		panel1.add(viewTasks);
		panel1.add(addTask);
		panel1.add(label);
		addTask.addActionListener(this);
		viewTasks.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		frame.pack();
		//set origional file location and set jlabel to proper text from that file
		String fileLocation = "src/_03_To_Do_List/ListStorage";
		readFormattedFile(fileLocation);
		String output = "";
		for (int i = 0; i < tasks.size(); i++) {
			if(i==0) {
				output+=tasks.get(i);
			}else {
				output+= ", "+tasks.get(i);
			}
		}
		label.setText(output);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void readFormattedFile(String fileLocation) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			String line = br.readLine();
			while(line!=null) {
				String currentString = "";
				for (int i = 0; i < line.length(); i++) {
					if(line.charAt(i)!=',') {
						currentString+=line.charAt(i);
					}else {
						tasks.add(currentString);
						currentString ="";
					}
				}
				line=br.readLine();
			}
			}catch(Exception E) {
				System.out.println("File Read Error.");
				E.printStackTrace();
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==addTask) {
				tasks.add(JOptionPane.showInputDialog("Write the Task You Wish to Add to Your List: "));
			}else if(e.getSource()==viewTasks) {
				String output = "";
				for (int i = 0; i < tasks.size(); i++) {
					if(i==0) {
						output+=tasks.get(i);
					}else {
						output+= ", "+tasks.get(i);
					}
				}
				label.setText(output);
				frame.pack();
			}else if(e.getSource()==removeTask) {
				boolean removed = false;
				String remove = JOptionPane.showInputDialog("Which item would you like to remove: ");
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println(remove + " : "+ tasks.get(i));
						if(tasks.get(i).equals(remove)) {
							System.out.println("removing...");
							tasks.remove(i);
							removed = true;
						}
				}
					if(removed == false) {
						JOptionPane.showMessageDialog(null, "This item is not in your list!");
					}
			}else if(e.getSource() == saveList) {
				try {
					FileWriter fw = new FileWriter ("src/_03_To_Do_List/ListStorage");
					for (int i = 0; i < tasks.size(); i++) {
						fw.write(tasks.get(i)+",");
					}fw.close();
				}catch(Exception E) {
					System.out.println("File Write Error.");
				}
			}else if(e.getSource()==loadList) {
				JFileChooser jfc = new JFileChooser();
				int returnVal = jfc.showOpenDialog(null);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					String fileLocation = jfc.getSelectedFile().getAbsolutePath();
				readFormattedFile(fileLocation);
			}
			}
		
	}
}
