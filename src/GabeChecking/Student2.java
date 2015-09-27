package GabeChecking;

import java.util.Scanner;

public class Student2 {

	/*Implement a class Student. For the purpose of this exercise, a student has a name
	and a total quiz score. Supply an appropriate constructor and methods getName(),
	addQuiz(float score), getTotalScore(), and getAverageScore(). To compute the average,
	you also need to store the number of quizzes that the student took.
	Supply a StudentTester class that tests all methods.*/
		
		private String name;
		private float avgScore;
		private float totalScore;
		Scanner eat = new Scanner(System.in);
		//private float numm;
		private float score1;
		private float score2;
		private float score3;
		private float score4;
		private float score5;
		private float score6;
		private int count;
		
		
		public void getName(String name){
			this.name=name;
		}
		
		public void addQuiz1(float score) {
			score1=score;
			count++;
		}
		
		public void addQuiz2(float score) {
			score2=score;
			count++;
		}
		
		public void addQuiz3(float score) {
			score3=score;
			count++;
		}
		
		public void addQuiz4(float score) {
			score4=score;
			count++;
		}
		
		public void addQuiz5(float score) {
			score5=score;
			count++;
		}
		
		public void addQuiz6(float score) {
			score6=score;
			count++;
		}
		
		
		public void getTotalScore() { 
			totalScore=score1+score2+score3+score4+score5+score6;
			System.out.println(name+"'s total score is: " + totalScore);
		}
		
		
		public void getAvgScore() {
			avgScore = totalScore/count;
			System.out.println(name+"'s average score is: "+avgScore);
		}
		

		public static void main(String[] args) {
			Student2 joey = new Student2();
			joey.getName("Joey");
			joey.addQuiz1(12);
			joey.getTotalScore();
			joey.getAvgScore();
		

	}

}
