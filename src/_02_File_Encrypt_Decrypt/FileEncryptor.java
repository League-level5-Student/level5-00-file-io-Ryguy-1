package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) {
		String inputMessage = JOptionPane.showInputDialog("Enter the Message you wish to encrypt: ");
		String encryptedMessage ="";
		for (int i = 0; i < inputMessage.length(); i++) {
			if(inputMessage.charAt(i) == ('a')) {
				encryptedMessage+='z';
			}else if(inputMessage.charAt(i) == ('b')) {
				encryptedMessage+='y';
			}else if(inputMessage.charAt(i) == ('c')) {
				encryptedMessage+='x';
			}else if(inputMessage.charAt(i) == ('d')) {
				encryptedMessage+='w';
			}else if(inputMessage.charAt(i) == ('e')) {
				encryptedMessage+='v';
			}else if(inputMessage.charAt(i) == ('f')) {
				encryptedMessage+='u';
			}else if(inputMessage.charAt(i) == ('g')) {
				encryptedMessage+='t';
			}else if(inputMessage.charAt(i) == ('h')) {
				encryptedMessage+='s';
			}else if(inputMessage.charAt(i) == ('i')) {
				encryptedMessage+='r';
			}else if(inputMessage.charAt(i) == ('j')) {
				encryptedMessage+='q';
			}else if(inputMessage.charAt(i) == ('k')) {
				encryptedMessage+='p';
			}else if(inputMessage.charAt(i) == ('l')) {
				encryptedMessage+='o';
			}else if(inputMessage.charAt(i) == ('m')) {
				encryptedMessage+='n';
			}else if(inputMessage.charAt(i) == ('n')) {
				encryptedMessage+='m';
			}else if(inputMessage.charAt(i) == ('o')) {
				encryptedMessage+='l';
			}else if(inputMessage.charAt(i) == ('p')) {
				encryptedMessage+='k';
			}else if(inputMessage.charAt(i) == ('q')) {
				encryptedMessage+='j';
			}else if(inputMessage.charAt(i) == ('r')) {
				encryptedMessage+='i';
			}else if(inputMessage.charAt(i) == ('s')) {
				encryptedMessage+='h';
			}else if(inputMessage.charAt(i) == ('t')) {
				encryptedMessage+='g';
			}else if(inputMessage.charAt(i) == ('u')) {
				encryptedMessage+='f';
			}else if(inputMessage.charAt(i) == ('v')) {
				encryptedMessage+='e';
			}else if(inputMessage.charAt(i) == ('w')) {
				encryptedMessage+='d';
			}else if(inputMessage.charAt(i) == ('x')) {
				encryptedMessage+='c';
			}else if(inputMessage.charAt(i) == ('y')) {
				encryptedMessage+='b';
			}else if(inputMessage.charAt(i) == ('z')) {
				encryptedMessage+='a';
			}else {
				encryptedMessage+=' ';
			}
			
	}
		try {
			FileWriter fr = new FileWriter ("src/_02_File_Encrypt_Decrypt/EncryptMessage.txt");
			fr.write(encryptedMessage);
			System.out.println(encryptedMessage);
			fr.close();
		}catch (Exception e) {
			System.out.println("Exception error...");
		}
	
}
}
