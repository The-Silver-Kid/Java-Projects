package DevTSK.Questions;

public class Question {

	private final String question;

	private final String answer;

	private final String[] wrongAnswers;

	public Question(String question, String correctAnswer, String[] wrongAnswers) {
		this.question = question;
		this.answer = correctAnswer;
		this.wrongAnswers = wrongAnswers;
	}

	public Question(String[] strings) {
		this.question = strings[0];
		this.answer = strings[1];
		String[] s = new String[strings.length - 2];
		for (int i = 2; i < strings.length; i++) {
			s[i - 2] = strings[i];
		}
		this.wrongAnswers = s;
	}

	public String[] getAnswers() {
		String[] ret = new String[wrongAnswers.length + 1];
		for (int i = 1; i < wrongAnswers.length + 1; i++) {
			ret[i] = wrongAnswers[i - 1];
		}
		ret[0] = answer;
		return ret;
	}

	public String getQuestion() {
		return question;
	}

}
