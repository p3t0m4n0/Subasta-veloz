package ontologia;

import jade.content.AgentAction;

@SuppressWarnings("serial")
public class Proposal implements AgentAction {

	private Boolean answer;
	private Book book;

	public Proposal() {

	}

	public Proposal(boolean answer, Book book) {
		this.answer = answer;
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public Boolean getAnswer() {
		return answer;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setAnswer(Boolean answer) {
		this.answer = answer;
	}

}
