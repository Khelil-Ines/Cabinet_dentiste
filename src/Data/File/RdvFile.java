package Data.File;

import java.io.Serializable;

public class RdvFile  implements Serializable {
	public int id;
	public String nom_patient;
	public String prenom_patient;
	public int tel;
	public String date;
	public String heure;
	private static final long serialVersionUID = 1L;
	
	public RdvFile() {
    }
	
	public RdvFile(int id, String nom_patient, String prenom_patient, int tel, String date, String heure) {
		this.id = id;
		this.nom_patient = nom_patient;
		this.prenom_patient = prenom_patient;
		this.tel = tel;
		this.date = date;
		this.heure = heure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_patient() {
		return nom_patient;
	}
	public void setNom_patient(String nom_patient) {
		this.nom_patient = nom_patient;
	}
	public String getPrenom_patient() {
		return prenom_patient;
	}
	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	@Override
	public String toString() {
		return "rdv [id=" + id + ", nom_patient=" + nom_patient + ", prenom_patient=" + prenom_patient + ", tel=" + tel
				+ ", date=" + date + ", heure=" + heure + "]";
	}
	
}
