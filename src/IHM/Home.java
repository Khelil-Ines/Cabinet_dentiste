
package IHM;

import Data.Cabinet_medical;
import Data.patient;
import dbase.bdd;
import Data.rdv;
import static dbase.bdd.Setconnection;
import static dbase.bdd.con;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import datechooser.beans.DateChooserCombo;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;


public class Home extends javax.swing.JFrame {
     Data.patient cl=new patient();
     Data.rdv rdv = new rdv();
     bdd b=new bdd();
     Cabinet_medical F = new Cabinet_medical();

           DefaultTableModel client;
           
      
    
    public Home() {
    	
        initComponents();
          this.client=(DefaultTableModel) client_tab.getModel();
          this.client.setRowCount(0);
  
          
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {
      System.out.println(F.readFromFile());
    

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_tab = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        adresse_client = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nclient = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        prenomClient = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        taill_patient = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        poids_patient = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        age_client = new javax.swing.JTextField();
        nomClient = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        rech_client = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        tel_client2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        nclient2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        prenomClient2 = new javax.swing.JTextField();
        nomClient2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        rech_client1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        client_tab1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        CustomDateChooser customDateChooser = new CustomDateChooser();
 

        JLabel jLabelcal = new javax.swing.JLabel();
        customDateChooser.add(jLabelcal, BorderLayout.NORTH);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cabinet dentiste");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
 public void windowOpened(java.awt.event.WindowEvent evt) {
     formWindowOpened(evt);
 }
        });
        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        client_tab.setModel(new javax.swing.table.DefaultTableModel(
 new Object [][] {
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null}
 },
 new String [] {
     "ID", "Nom", "Prénom", "Adresse", "age", "Tél", "Taille", "Poids"
 }
        ));
        client_tab.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
     client_tabMouseClicked(evt);
 }
        });
        
        jScrollPane1.setViewportView(client_tab);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        jButton2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user_male_edit_1.png"))); // NOI18N
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton2ActionPerformed(evt);
 }
        });

        jButton3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supprimer.png"))); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton3ActionPerformed(evt);
 }
        });

        jButton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ok.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton1ActionPerformed(evt);
 }
        });

        
        customDateChooser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED,
     (java.awt.Color)null,
     (java.awt.Color)null));
        
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
 jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel5Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
 jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel5Layout.createSequentialGroup()
     .addContainerGap()
     .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
         .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)), "Information Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Garamond", 1, 18), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel13.setFont(new java.awt.Font("Garamond", 1, 18)); 

        jLabel24.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel24.setText("Prénom");

        adresse_client.setFont(new java.awt.Font("Garamond", 3, 18)); 
        adresse_client.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        jLabel26.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel26.setText("Adresse");

        jLabel27.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel27.setText("N° Tél");

        nclient.setEditable(false);
        nclient.setFont(new java.awt.Font("Garamond", 3, 18)); 
        nclient.setText("Auto Généré");
        nclient.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        nclient.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     nclientActionPerformed(evt);
 }
        });

        jLabel28.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel28.setText("N° de Client");

        

        jLabel29.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel29.setText("Nom ");

        prenomClient.setFont(new java.awt.Font("Garamond", 3, 18));
        prenomClient.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        prenomClient.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     prenomClientActionPerformed(evt);
 }
        });
       

        jLabel30.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel30.setText("Taille");

        taill_patient.setFont(new java.awt.Font("Garamond", 3, 18)); 
        taill_patient.setText("0.0");
        taill_patient.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        jLabel31.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel31.setText("Poids");

        poids_patient.setFont(new java.awt.Font("Garamond", 3, 18)); 
        poids_patient.setText("0.0");
        poids_patient.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        jLabel25.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel25.setText("Age");

        age_client.setFont(new java.awt.Font("Garamond", 3, 18)); 
        age_client.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        age_client.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     age_clientActionPerformed(evt);
 }
        });

        nomClient.setFont(new java.awt.Font("Garamond", 3, 18)); 
        nomClient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        
        
        tel.setFont(new java.awt.Font("Garamond", 3, 18));
        tel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        tel.setColumns(10);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13Layout.setHorizontalGroup(
   jPanel13Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel13Layout.createSequentialGroup()
   		.addContainerGap()
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
   				.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
   				.addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel25, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
   				.addGroup(jPanel13Layout.createSequentialGroup()
   					.addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
   					.addPreferredGap(ComponentPlacement.RELATED)
   					.addComponent(jLabel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
   			.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
   				.addComponent(prenomClient)
   				.addComponent(nclient, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
   				.addGroup(jPanel13Layout.createSequentialGroup()
   					.addComponent(taill_patient, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
   					.addGap(18)
   					.addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
   					.addPreferredGap(ComponentPlacement.UNRELATED)
   					.addComponent(poids_patient, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
   				.addComponent(adresse_client)
   				.addComponent(age_client)
   				.addComponent(nomClient))
   			.addComponent(tel, 187, 187, 187))
   		.addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
   jPanel13Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel13Layout.createSequentialGroup()
   		.addGap(29)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(nclient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(nomClient, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(prenomClient, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
   			.addComponent(adresse_client, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(age_client, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
   		.addGap(18)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(tel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
   			.addGroup(jPanel13Layout.createParallelGroup(Alignment.TRAILING)
   				.addComponent(jLabel27, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel60, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
   			.addComponent(taill_patient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   			.addComponent(jLabel31, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   			.addComponent(poids_patient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   		.addGap(80))
        );
        jPanel13.setLayout(jPanel13Layout);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
     jPanel4MouseClicked(evt);
 }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_xmag_8826.png"))); // NOI18N

        rech_client.setEditable(true);
        rech_client.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
 public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
 }
 public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
     rech_clientPopupMenuWillBecomeInvisible(evt);
 }
 public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
 }
        });

        jButton4.setFont(new java.awt.Font("Garamond", 3, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); // NOI18N
        jButton4.setText("Actualiser");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton4ActionPerformed(evt);
 }
        });
        jPanel1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        
     jPanel1.setBackground(new java.awt.Color(255, 255, 255));
     
  jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));
  
          jButton23.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
          jButton23.setForeground(new java.awt.Color(0, 0, 255));
          jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/technology.png"))); // NOI18N
          jButton23.setText("0668 26 75 28 ");
          
       jButton24.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
       jButton24.setForeground(new java.awt.Color(0, 0, 255));
       jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/technology (1).png"))); // NOI18N
       jButton24.setText("0668 26 75 28 ");
       
    jButton25.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); // NOI18N
    jButton25.setForeground(new java.awt.Color(0, 0, 255));
    jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/social-media (1).png"))); // NOI18N
    jButton25.setText("     FaceBook");
    jButton25.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton25ActionPerformed(evt);
        }
    });
    
            javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
            jPanel20.setLayout(jPanel20Layout);
            jPanel20Layout.setHorizontalGroup(
     jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel20Layout.createSequentialGroup()
         .addContainerGap()
         .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
         .addContainerGap())
            );
            jPanel20Layout.setVerticalGroup(
     jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel20Layout.createSequentialGroup()
         .addContainerGap()
         .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
         .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addContainerGap())
            );
            
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(26, 26, 26)
      .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap(1186, Short.MAX_VALUE))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(91, 91, 91)
      .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addContainerGap(210, Short.MAX_VALUE))
         );
         
      jTabbedPane1.addTab("Accueil", new javax.swing.ImageIcon(getClass().getResource("/Img/if_8_330406_1.png")), jPanel1); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
 jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel4Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(rech_client, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jLabel23)
     .addGap(18, 18, 18)
     .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
 jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel4Layout.createSequentialGroup()
     .addContainerGap()
     .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(rech_client, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jLabel23))
     .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
   jPanel3Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel3Layout.createSequentialGroup()
   		.addGap(6)
   		.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   		.addPreferredGap(ComponentPlacement.UNRELATED)
   		.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel3Layout.createSequentialGroup()
   				.addGap(685)
   				.addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE))
   			.addGroup(jPanel3Layout.createSequentialGroup()
   				.addGap(18)
   				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
   				.addComponent(jScrollPane1, Alignment.LEADING)
   				.addComponent(jPanel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)))
   		.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
   jPanel3Layout.createParallelGroup(Alignment.TRAILING)
   	.addGroup(jPanel3Layout.createSequentialGroup()
   		.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel3Layout.createSequentialGroup()
   				.addGap(48)
   				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   				.addGap(25)
   				.addComponent(jLabel20)
   				.addPreferredGap(ComponentPlacement.RELATED)
   				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
   				.addGap(46)
   				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   			.addGroup(jPanel3Layout.createSequentialGroup()
   				.addGap(27)
   				.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)))
   		.addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jTabbedPane1.addTab("Gestion des Patients", new javax.swing.ImageIcon(getClass().getResource("/Img/male_user_1.png")), jPanel3); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)), "Information Médicament", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Garamond", 1, 18), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel15.setFont(new java.awt.Font("Garamond", 1, 18)); 

        jLabel40.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel40.setText("Prénom Patient");

        tel_client2.setFont(new java.awt.Font("Garamond", 3, 18)); 
        tel_client2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        jLabel41.setFont(new java.awt.Font("Garamond", 1, 18));
        jLabel41.setText("N°Tél");

        nclient2.setEditable(false);
        nclient2.setFont(new java.awt.Font("Garamond", 3, 18)); 
        nclient2.setText("Auto Généré");
        nclient2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        nclient2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     nclient2ActionPerformed(evt);
 }
        });

        jLabel43.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel43.setText("ID");

        jLabel62.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel62.setText("Date");

        jLabel44.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel44.setText("Nom Patient");

        prenomClient2.setFont(new java.awt.Font("Garamond", 3, 18)); 
        prenomClient2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        prenomClient2.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     prenomClient2ActionPerformed(evt);
 }
        });

        nomClient2.setFont(new java.awt.Font("Garamond", 3, 18)); 
        nomClient2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        
        jLabel62_1 = new JLabel();
        jLabel62_1.setText("Heure");
        jLabel62_1.setFont(new Font("Dialog", Font.BOLD, 18));
        
        heure_rdv = new JTextField();
        heure_rdv.setFont(new java.awt.Font("Garamond", 3, 18)); 
        heure_rdv.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        
        
        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15Layout.setHorizontalGroup(
   jPanel15Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel15Layout.createSequentialGroup()
   		.addContainerGap()
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING, false)
   				.addComponent(jLabel62, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel43, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
   				.addComponent(jLabel44, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel41, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   				.addComponent(jLabel40, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
   			.addComponent(jLabel62_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
   		.addGap(80)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING, false)
   			.addComponent(customDateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   			.addComponent(heure_rdv, Alignment.LEADING)
   			.addComponent(prenomClient2, Alignment.LEADING)
   			.addComponent(nclient2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
   			.addComponent(tel_client2, Alignment.LEADING)
   			.addComponent(nomClient2, Alignment.LEADING))
   		.addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
   jPanel15Layout.createParallelGroup(Alignment.TRAILING)
   	.addGroup(jPanel15Layout.createSequentialGroup()
   		.addGap(29)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel43, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(nclient2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING, false)
   			.addComponent(jLabel44, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   			.addComponent(nomClient2, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
   		.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.BASELINE)
   			.addComponent(jLabel40, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
   			.addComponent(prenomClient2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
   			.addComponent(tel_client2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
   		.addPreferredGap(ComponentPlacement.UNRELATED)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.TRAILING)
   			.addComponent(jLabel62, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
   			.addComponent(customDateChooser, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
   		.addGap(18)
   		.addGroup(jPanel15Layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(heure_rdv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   			.addComponent(jLabel62_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
   		.addGap(52))
        );
        jPanel15.setLayout(jPanel15Layout);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
     jPanel7MouseClicked(evt);
 }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_xmag_8826.png"))); // NOI18N

        rech_client1.setEditable(true);
        rech_client1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
 public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
 }
 public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
     rech_client1PopupMenuWillBecomeInvisible(evt);
 }
 public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
 }
        });

        jButton5.setFont(new java.awt.Font("Garamond", 3, 24)); 
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); 
        jButton5.setText("Actualiser");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton5ActionPerformed(evt);
 }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
 jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel7Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(rech_client1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jLabel48)
     .addGap(18, 18, 18)
     .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
 jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel7Layout.createSequentialGroup()
     .addContainerGap()
     .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(rech_client1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jLabel48))
     .addContainerGap())
        );

        client_tab1.setModel(new javax.swing.table.DefaultTableModel(
 new Object [][] {
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null},
     {null, null, null, null, null, null, null, null, null}
 },
 new String [] {
     "ID", "Nom_Patient", "Prénom_Patient", "N° Tél", "Date", "Heure"
 }
        ));
        client_tab1.addMouseListener(new java.awt.event.MouseAdapter() {
 public void mouseClicked(java.awt.event.MouseEvent evt) {
     client_tab1MouseClicked1(evt);
 }
        });
        jScrollPane2.setViewportView(client_tab1);

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        jButton6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user_male_edit_1.png"))); // NOI18N
        jButton6.setText("Modifier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton6ActionPerformed(evt);
 }
        });

        jButton7.setFont(new java.awt.Font("Georgia", 0, 18)); 
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/supprimer.png")));
        jButton7.setText("Supprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton7ActionPerformed(evt);
 }
        });

        jButton8.setFont(new java.awt.Font("Georgia", 0, 18)); 
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ok.png"))); 
        jButton8.setText("Ajouter");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton8ActionPerformed(evt);
 }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
 jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel8Layout.createSequentialGroup()
     .addContainerGap()
     .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addGap(18, 18, 18)
     .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
     .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
 jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanel8Layout.createSequentialGroup()
     .addContainerGap()
     .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
         .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
     .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
   jPanel2Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel2Layout.createSequentialGroup()
   		.addContainerGap()
   		.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
   			.addGroup(jPanel2Layout.createSequentialGroup()
   				.addGap(46)
   				.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   			.addGroup(jPanel2Layout.createSequentialGroup()
   				.addGap(29)
   				.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
   			.addGroup(jPanel2Layout.createSequentialGroup()
   				.addGap(18)
   				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)))
   		.addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
   jPanel2Layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(jPanel2Layout.createSequentialGroup()
   		.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
   			.addGroup(jPanel2Layout.createSequentialGroup()
   				.addGap(37)
   				.addComponent(jPanel15, 0, 0, Short.MAX_VALUE))
   			.addGroup(jPanel2Layout.createSequentialGroup()
   				.addGap(45)
   				.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
   				.addGap(29)
   				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
   				.addGap(28)
   				.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
   		.addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Gestion des Rendez-vous", new javax.swing.ImageIcon(getClass().getResource("/Img/logoo.png")), jPanel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dent.jpg"))); 

        jButton13.setFont(new java.awt.Font("Garamond", 3, 24)); 
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_logout_63128.png"))); 
        jButton13.setText("Déconnecter");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), null));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
 public void actionPerformed(java.awt.event.ActionEvent evt) {
     jButton13ActionPerformed(evt);
 }
        });

        jLabel18.setFont(new java.awt.Font("Garamond", 1, 24)); 
        jLabel18.setForeground(new java.awt.Color(51, 0, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_status_46254.png")));
        jLabel18.setText("ADMIN");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
   layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(layout.createSequentialGroup()
   		.addContainerGap()
   		.addGroup(layout.createParallelGroup(Alignment.LEADING)
   			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1153, Short.MAX_VALUE)
   			.addGroup(layout.createSequentialGroup()
   				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 927, GroupLayout.PREFERRED_SIZE)
   				.addPreferredGap(ComponentPlacement.RELATED)
   				.addGroup(layout.createParallelGroup(Alignment.LEADING)
   					.addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
   					.addComponent(jButton13, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
   				.addContainerGap())))
        );
        layout.setVerticalGroup(
   layout.createParallelGroup(Alignment.LEADING)
   	.addGroup(layout.createSequentialGroup()
   		.addGroup(layout.createParallelGroup(Alignment.TRAILING)
   			.addGroup(layout.createSequentialGroup()
   				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE)
   				.addPreferredGap(ComponentPlacement.RELATED))
   			.addGroup(layout.createSequentialGroup()
   				.addGap(27)
   				.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
   				.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
   				.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
   				.addGap(32)))
   		.addPreferredGap(ComponentPlacement.RELATED)
   		.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void nclientActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void prenomClientActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
         try {
  b.fillToJtable("select `id`, `nom`, `prenom`, `adresse`, `age`, `tel`, `taill`, `poids` from patient", client_tab);
         } catch (ClassNotFoundException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    private void age_clientActionPerformed(java.awt.event.ActionEvent evt) {
    }
 
    public void setPatient()
    {
        String nom=nomClient.getText();
        String prenom=prenomClient.getText();
        String adresse=adresse_client.getText();
        int age=new Double(age_client.getText()).intValue();
        String tel= this.tel.getText();
        int poids= new Double(poids_patient.getText()).intValue();
        int taill=new Double(taill_patient.getText()).intValue();
        //envoi des donnes 
        cl.setNom(nom);
        cl.setPrenom(prenom);
        cl.setAdresse(adresse); 
        cl.setDate_Ne(age);
        cl.setPoids(poids);
        cl.setTaill(taill);
        cl.setTel(tel);



    }
    
    public void setRdv()
    {
        String nom=nomClient2.getText();
        String prenom=prenomClient2.getText();
        int tel=new Double(tel_client2.getText()).intValue();
        String heure = heure_rdv.getText();
        //String dateStr = jLabelcal.getText();
        //envoi des donnes 
        rdv.setNom_patient(nom);;
        rdv.setPrenom_patient(prenom);;
        rdv.setTel(tel);; 
        rdv.setHeure(heure);;
        rdv.setDate("23 mai 2023");;
      
       

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
     setPatient();
         
     try {
    	
         if(cl.Ajouter()==true)
         {
    JOptionPane.showMessageDialog(null, "L'ajout est bien fait !");
   b.fillToJtable("SELECT `id`, `nom`, `prenom`, `age`, `adresse`, `tel`, `poids`, `taill` FROM `patient`", client_tab);
 
          System.out.println("Ajout fait!");
    filter_client(rech_client);
  
         }
         else
         {
        JOptionPane.showMessageDialog(null, "Erreur d'ajout");

         }
     
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
     }
 
       
    }
    
public void deplece_info(int i)
{
    nclient.setText(client_tab.getValueAt(i, 0).toString());
        nomClient.setText(client_tab.getValueAt(i, 1).toString());
    prenomClient.setText(client_tab.getValueAt(i, 2).toString());
    adresse_client.setText(client_tab.getValueAt(i, 3).toString());
    age_client.setText(client_tab.getValueAt(i, 4).toString());
    tel.setText(client_tab.getValueAt(i, 5).toString());
        taill_patient.setText(client_tab.getValueAt(i, 6).toString());
    poids_patient.setText(client_tab.getValueAt(i, 7).toString());

        


}

public void deplece_info2(int i)
{
    nclient2.setText(client_tab1.getValueAt(i, 0).toString());
    nomClient2.setText(client_tab1.getValueAt(i, 1).toString());
    prenomClient2.setText(client_tab1.getValueAt(i, 2).toString());
    tel_client2.setText(client_tab1.getValueAt(i, 3).toString());
    heure_rdv.setText(client_tab1.getValueAt(i, 5).toString());

}
    private void client_tabMouseClicked(java.awt.event.MouseEvent evt) {
    	
       int i= client_tab.getSelectedRow();
       
       deplece_info(i);

       
    }

    private void client_tab1MouseClicked1(java.awt.event.MouseEvent evt) {
    	
        int j= client_tab1.getSelectedRow();
        
        deplece_info2(j);

       
     }
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
cl.setId(new Double(nclient.getText()).intValue());
         try {
  if(cl.Supprimer()==true)
  {
      JOptionPane.showMessageDialog(null, "Suppression faite !");
      b.fillToJtable("select `id`, `nom`, `prenom`, `adresse`, `age`, `tel`, `taill`, `poids` from patient", client_tab);
      System.out.println("supp fait!");
  }else {
 	 JOptionPane.showMessageDialog(null, "Erreur de suppression !");
  }
           
  
         } catch (ClassNotFoundException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
 public void filter_client(JComboBox c) 
    {
        
        
        
         try {
  Setconnection();
  c.removeAllItems();
  AutoCompleteDecorator.decorate(c);
  
  //Setconnection();
  Statement stmt=con.createStatement();
  String select="select * from patient";
  ResultSet rs=stmt.executeQuery(select);
  while(rs.next())
  {
      c.addItem(""+rs.getString(1));
      c.addItem(""+rs.getString(2));
  }
  c.setSelectedItem("");
  con.close(); 
         } catch (SQLException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
 }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           filter_client(rech_client);
           
     
    }

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

        filter_client(rech_client);
    }

    private void rech_clientPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_rech_clientPopupMenuWillBecomeInvisible
  try {
 client.setRowCount(0);
 String nom=(String) rech_client.getSelectedItem();
 Setconnection();

 //Setconnection();
 Statement stmt=con.createStatement();
 String select="select * from patient where nom='"+nom+"' or id='"+nom+"' ";
 ResultSet rs=stmt.executeQuery(select);
 while(rs.next())
 {
     Object[] model={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
     client.addRow(model);

 }
 con.close();
      
         } catch (SQLException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }       
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
           
         try {
  setPatient();
  cl.setId(new Double(nclient.getText()).intValue());
  if(cl.Modifier()){
     
      b.fillToJtable("select `id`, `nom`, `prenom`, `adresse`, `age`, `tel`, `taill`, `poids` from patient", client_tab);
      JOptionPane.showMessageDialog(null, "Le patient est a jour !");

      System.out.println("modif fait!");
  } else
  {
      JOptionPane.showMessageDialog(null, "Erreur de modification !");
  }
         } catch (ClassNotFoundException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        new LogIn().setVisible(true);
        this.dispose();
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void nclient2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void prenomClient2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void rech_client1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		
 b.fillToJtable("select * from rdv", client_tab1);
    		
        } catch (ClassNotFoundException ex) {
 Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void client_tab1MouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    	 try {
  setRdv();
  rdv.setId(new Double(nclient2.getText()).intValue());
  if(rdv.Modifier()== true){
      JOptionPane.showMessageDialog(null, "Le rendez-vous est a jour !");
      b.fillToJtable("select * from rdv", client_tab1);
  }

  else
  {
            JOptionPane.showMessageDialog(null, "Erreur de modification !");

  }
  
         } catch (ClassNotFoundException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
    	rdv.setId(new Double(nclient2.getText()).intValue());
        try {
 if(rdv.Supprimer()==true)
 {
     b.fillToJtable("select * from rdv", client_tab1);
     JOptionPane.showMessageDialog(null, "Suppression faite !");

     
 }
 else
 {
          JOptionPane.showMessageDialog(null, "Erreur de suppression !");

 }
 
        } catch (ClassNotFoundException ex) {
 Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
    	 setRdv();
         try {
  if(rdv.Ajouter()==true)
  {
        b.fillToJtable("select * from rdv", client_tab1);
      JOptionPane.showMessageDialog(null, "L'ajout est bien fait !");
   
          filter_client(rech_client);
      
  }
  else
  {
            JOptionPane.showMessageDialog(null, "Erreur d'ajout");

  }
         
         } catch (ClassNotFoundException ex) {
  Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public static void main(String args[]) {
        
      try {
 UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
 

        }  catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

         java.awt.EventQueue.invokeLater(() -> {
 
   Home home=new Home();
    
    
        
        Toolkit tk = Toolkit.getDefaultToolkit();

home.setExtendedState(home.MAXIMIZED_BOTH); 
home.show();
            home.setVisible(true);
        });
    }

   
    private javax.swing.JTextField adresse_client;
    private javax.swing.JTextField tel_client2;
    private javax.swing.JTextField age_client;
    private javax.swing.JTextField heure;
    private javax.swing.JTable client_tab;
    private javax.swing.JTable client_tab1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nclient;
    private javax.swing.JTextField nclient2;
    private javax.swing.JTextField nomClient;
    private javax.swing.JTextField nomClient2;
    private javax.swing.JTextField poids_patient;
    private javax.swing.JTextField prenomClient;
    private javax.swing.JTextField prenomClient2;
    private javax.swing.JComboBox<String> rech_client;
    private javax.swing.JComboBox<String> rech_client1;
    private javax.swing.JTextField taill_patient;
    private JLabel jLabel62_1;
    private JTextField heure_rdv;
    private CustomDateChooser customDateChooser;
    private JLabel jLabelcal;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JComboBox<String> jComboBox1;
    private JTextField tel;
}
