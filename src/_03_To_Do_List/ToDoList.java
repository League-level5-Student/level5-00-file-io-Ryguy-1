package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
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
//	JTextField field = new JTextField();
	ArrayList<String> tasks = new ArrayList<String>();
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.setup();
	}
	
	public void setup() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.setSize(window_Width,window_Height);
		frame.setSize(window_Width,window_Height);
		panel.add(loadList);
		panel.add(saveList);
		panel.add(removeTask);
		panel.add(viewTasks);
		panel.add(addTask);
		addTask.addActionListener(this);
		viewTasks.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==addTask) {
				tasks.add(JOptionPane.showInputDialog("Write the Task You Wish to Add to Your List: "));
			}else if(e.getSource()==viewTasks) {
				
			}
		
	}
}
