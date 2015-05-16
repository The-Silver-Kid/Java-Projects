import java.util.*;
import java.io.*;

public class Inout {
	public static void main(String args[]) throws IOException, FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		Random rn = new Random();
		String r = "";
		int qN;
		String[] questions = new String[12];
		
		questions[0] = "What is the meaning of life?";
		questions[1] = "Why are you using this program?";
		questions[2] = "How can you prove that the universe wasn't created yesterday.";
		questions[3] = "SYSTEM_EXCEPTION 404 input reason for error.";
		questions[4] = "Where will the output text file from this application go?";
		questions[5] = "How much wood could a chuck-ya chuck if a chuck-ya could chuck wood?";
		questions[6] = "What would you do if you were in a testing environment and your friend burst out laughing?";
		questions[7] = "Why do you think the sky is blue?";
		questions[8] = "Will humans ever land on another planet?";
		questions[9] = "Did the moon landing actually happen?";
		questions[10] = "Why should I ask you a question?";
		questions[11] = "Would you like some fries with that?";
		
		qN = rn.nextInt(questions.length);
		
		System.out.println(questions[qN]);
		System.out.println("");
		
		r = keyboard.nextLine();
		r = questions[qN] + "\n\n" + r;
		
		byte[] rA = r.getBytes();
		keyboard.close();
		
		//PrintWriter send = new PrintWriter("Response.txt", "UTF-8");
		//send.println(r);
		//send.close();
		FileOutputStream send = new FileOutputStream("Response.txt");
		send.write(rA);
		send.close();
	}
}