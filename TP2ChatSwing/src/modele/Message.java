package modele;

import java.util.Date;

public class Message {

	private String auteur;
	private Date date;
	private String contenu;
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Message(String auteur, Date date, String contenu) {
		this.auteur = auteur;
		this.date = date;
		this.contenu = contenu;
	}
	
	
}
