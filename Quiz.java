package quiz_application_with_number;

		import java.util.*;

		public class Quiz {
		    private static class Question {
		        String question, answer;
		        String[] options;

		        Question(String question, String[] options, String answer) {
		            this.question = question;
		            this.options = options;
		            this.answer = answer;
		        }
		    }

		    public static void main(String[] args) {
		        // Quiz Questions and Options
		        List<Question> questions = Arrays.asList(
		            new Question("Question 1", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, "Option 1"),
		            new Question("Question 2", new String[]{"Option 1", "Option 2", "Option 3", "Option 4"}, "Option 2")
		            // Add more questions as needed
		        );

		        int score = 0;
		        Scanner scanner = new Scanner(System.in);

		        for (Question question : questions) {
		            System.out.println(question.question);
		            for (int i = 0; i < question.options.length; i++) {
		                System.out.println((i + 1) + ". " + question.options[i]);
		            }

		            Timer timer = new Timer();
		            timer.schedule(new TimerTask() {
		                public void run() {
		                    System.out.println("\nTime's up!");
		                    System.exit(0);
		                }
		            }, 30000);  // 30 seconds for each question

		            System.out.print("\nEnter your answer: ");
		            String answer = scanner.nextLine();
		            timer.cancel();

		            if (answer.equals(question.answer)) {
		                score++;
		            }
		        }

		        scanner.close();

		        // Result Screen
		        System.out.println("\nFinal Score: " + score);
		        System.out.println("Correct Answers: " + score);
		        System.out.println("Incorrect Answers: " + (questions.size() - score));
		    }
		


	}


