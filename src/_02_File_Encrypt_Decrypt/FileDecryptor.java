package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		
	try {
		BufferedReader fr = new BufferedReader (new FileReader("src/_02_File_Encrypt_Decrypt/EncryptMessage.txt"));
		String line = fr.readLine();
		String decryptedMessage = "";
		while(line!=null) {
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == ('a')) {
					decryptedMessage+='z';
				}else if(line.charAt(i) == ('b')) {
					decryptedMessage+='y';
				}else if(line.charAt(i) == ('c')) {
					decryptedMessage+='x';
				}else if(line.charAt(i) == ('d')) {
					decryptedMessage+='w';
				}else if(line.charAt(i) == ('e')) {
					decryptedMessage+='v';
				}else if(line.charAt(i) == ('f')) {
					decryptedMessage+='u';
				}else if(line.charAt(i) == ('g')) {
					decryptedMessage+='t';
				}else if(line.charAt(i) == ('h')) {
					decryptedMessage+='s';
				}else if(line.charAt(i) == ('i')) {
					decryptedMessage+='r';
				}else if(line.charAt(i) == ('j')) {
					decryptedMessage+='q';
				}else if(line.charAt(i) == ('k')) {
					decryptedMessage+='p';
				}else if(line.charAt(i) == ('l')) {
					decryptedMessage+='o';
				}else if(line.charAt(i) == ('m')) {
					decryptedMessage+='n';
				}else if(line.charAt(i) == ('n')) {
					decryptedMessage+='m';
				}else if(line.charAt(i) == ('o')) {
					decryptedMessage+='l';
				}else if(line.charAt(i) == ('p')) {
					decryptedMessage+='k';
				}else if(line.charAt(i) == ('q')) {
					decryptedMessage+='j';
				}else if(line.charAt(i) == ('r')) {
					decryptedMessage+='i';
				}else if(line.charAt(i) == ('s')) {
					decryptedMessage+='h';
				}else if(line.charAt(i) == ('t')) {
					decryptedMessage+='g';
				}else if(line.charAt(i) == ('u')) {
					decryptedMessage+='f';
				}else if(line.charAt(i) == ('v')) {
					decryptedMessage+='e';
				}else if(line.charAt(i) == ('w')) {
					decryptedMessage+='d';
				}else if(line.charAt(i) == ('x')) {
					decryptedMessage+='c';
				}else if(line.charAt(i) == ('y')) {
					decryptedMessage+='b';
				}else if(line.charAt(i) == ('z')) {
					decryptedMessage+='a';
				}else {
					decryptedMessage+=' ';
				}
		}
			line = fr.readLine();
		}
		System.out.println(decryptedMessage);
	}catch (Exception e){
		System.out.println("Exception caught...");
	}
	
}
}
