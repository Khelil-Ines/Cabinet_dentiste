package Data;

import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

import Data.File.PatientFile;
import Data.File.RdvFile;
import dbase.Tools;

import java.io.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Cabinet_medical implements Serializable  {
    private List<PatientFile> fichierPatients;
    private List<RdvFile> ListRDV;
    private static final long serialVersionUID = 1L;
    public Cabinet_medical() {
    }
    
    public Cabinet_medical(List<PatientFile> fichierPatients, List<RdvFile> listRDV) {
		super();
		this.fichierPatients = fichierPatients;
		ListRDV = listRDV;
	}

	public void writeToFile(){
        try {
            
            FileOutputStream fileOut = new FileOutputStream("cabine.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();

            System.out.println("Succés.");
        } catch (IOException e) {
            System.out.println("Une erreur.");
            e.printStackTrace();
        }

    }
    
    public Cabinet_medical readFromFile(){
        try {
            File myObj = new File("cabine.txt");
               if (myObj.createNewFile()) {
                   System.out.println("File created: " + myObj.getName());
                   
                   PatientFile f1=new PatientFile("a","a","A",13,"2222222",120,45);                  
                   PatientFile f2=new PatientFile();
                   PatientFile f3=new PatientFile();
                    List<PatientFile> listPatient = new ArrayList<PatientFile>(); 
                    listPatient.add(f1);
                    listPatient.add(f2);
                    listPatient.add(f3);
                    List<RdvFile> listrdv = new ArrayList<RdvFile>(); 
                    RdvFile r1 = new RdvFile(1,"B","B",222222,"14 mai 2023","14h");
                    listrdv.add(r1);
                    this.fichierPatients =listPatient;
                    this.ListRDV=listrdv;
                    Cabinet_medical c =new Cabinet_medical(listPatient,listrdv);
                    FileOutputStream fileOut = new FileOutputStream("cabine.txt");
                    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                    objectOut.writeObject(c);
               }   

            FileInputStream fileIn = new FileInputStream("cabine.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Cabinet_medical obj = (Cabinet_medical) objectIn.readObject();

            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        
        
    }

	@Override
	public String toString() {
		return "Cabinet_medical [fichierPatients=" + fichierPatients + ", ListRDV=" + ListRDV + "]";
	}
	
	public void  getFileInfo () {
        File myObj = new File("filename.txt");

        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    
}