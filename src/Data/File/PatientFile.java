package Data.File;

import java.io.Serializable;

public class PatientFile implements Serializable  {
    private static final long serialVersionUID = 1L;
    public int id;
    public String Nom;
    public String prenom;
    public String Adresse;
    public int age;
    public String tel;
    public int poids;
    public int taill;
    public PatientFile( String Nom, String prenom,String adresse, int age, String tel, int poids, int taill) {
        this.Nom = Nom;
        this.prenom = prenom;
        this.age = age;
        this.tel = tel;
        this.Adresse=adresse;
        this.poids = poids;
        this.taill = taill;
    }

    public PatientFile() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public int getDate_Ne() {
        return age;
    }

    public void setDate_Ne(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaill() {
        return taill;
    }

    public void setTaill(int taill) {
        this.taill = taill;
    }

	@Override
	public String toString() {
		return "PatientFile [id=" + id + ", Nom=" + Nom + ", prenom=" + prenom + ", Adresse=" + Adresse + ", age=" + age
				+ ", tel=" + tel + ", poids=" + poids + ", taill=" + taill + "]";
	}

}
