package domain;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private int id;
	private String title;
	private ArrayList<Actor> actors;
	private ArrayList<Comment> comments;
	private ArrayList<Integer> grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public void addActor(Actor actor) {
		this.actors.add(actor);
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;

	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}





}
