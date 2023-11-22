/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Data.patient;
import Data.soin;
import dbase.bdd;
import static dbase.bdd.Setconnection;
import static dbase.bdd.con;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import java.awt.Window.Type;


public class Home_dentiste extends javax.swing.JFrame {
     Data.patient cl=new patient();
     Data.soin soin = new soin();
     bdd b=new bdd();

           DefaultTableModel client;
           
      
  
    public Home_dentiste() {
    	
        initComponents();
          this.client=(DefaultTableModel) client_tab.getModel();
          this.client.setRowCount(0);
             
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

    	dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        client_tab = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        soin_client = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        nclient = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        prenomClient = new javax.swing.JTextField();
        nomClient = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        rech_client = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        rech_client1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        client_tab1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

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
        jTabbedPane1.setFont(new java.awt.Font("Sitka Text", 0, 18));  

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 3, true));

        jButton23.setFont(new java.awt.Font("Gill Sans MT", 3, 24));  
        jButton23.setForeground(new java.awt.Color(0, 0, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/technology.png")));  
        jButton23.setText("+216 33 44 55 88");

        jButton24.setFont(new java.awt.Font("Gill Sans MT", 3, 24));  
        jButton24.setForeground(new java.awt.Color(0, 0, 255));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/technology (1).png")));  
        jButton24.setText("0668 26 75 28      ");

        jButton25.setFont(new java.awt.Font("Gill Sans MT", 3, 24)); 
        jButton25.setForeground(new java.awt.Color(0, 0, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/social-media (1).png")));  
        jButton25.setText("     FaceBook       ");
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

        jTabbedPane1.addTab("Accueil", new javax.swing.ImageIcon(getClass().getResource("/Img/if_8_330406_1.png")), jPanel1);  

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        client_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Adresse", "age", "Tél", "Taille", "Poids", "Soin"
            }
        ));
        client_tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(client_tab);

        dateChooserCombo1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED,
                (java.awt.Color)null,
                (java.awt.Color)null));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)), "Information Clients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Garamond", 1, 18), new java.awt.Color(51, 102, 255)));  
        jPanel13.setFont(new java.awt.Font("Garamond", 1, 18)); 

        jLabel24.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel24.setText("Prénom");

        soin_client.setFont(new java.awt.Font("Garamond", 3, 18)); 
        soin_client.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));

        jLabel26.setFont(new java.awt.Font("Garamond", 1, 18)); 
        jLabel26.setText("Soin");

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
        nomClient.setFont(new java.awt.Font("Garamond", 3, 18)); 
        nomClient.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13Layout.setHorizontalGroup(
        	jPanel13Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel13Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel29, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel13Layout.createSequentialGroup()
        					.addGap(90)
        					.addComponent(jLabel60, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(soin_client)
        				.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(prenomClient)
        					.addComponent(nclient, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        					.addComponent(nomClient)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
        	jPanel13Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel13Layout.createSequentialGroup()
        			.addGap(29)
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(nclient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(nomClient, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(prenomClient, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel13Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel13Layout.createSequentialGroup()
        					.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        					.addGap(63)
        					.addComponent(jLabel60, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        				.addComponent(soin_client, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
        			.addGap(114))
        );
        jPanel13.setLayout(jPanel13Layout);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_xmag_8826.png"))); 

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

        jButton4.setFont(new java.awt.Font("Garamond", 3, 24));  
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh.png"))); 
        jButton4.setText("Actualiser");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 153, 204)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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
        jButton1 = new javax.swing.JButton();
        
                jButton1.setFont(new java.awt.Font("Georgia", 0, 18)); 
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ok.png"))); 
                jButton1.setText("Ajouter soin");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 849, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(67)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(48)
        					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(31)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)))
        			.addGap(18)
        			.addComponent(jButton1)
        			.addGap(175))
        );
        jPanel3.setLayout(jPanel3Layout);

        jTabbedPane1.addTab("Gestion des Patients", new javax.swing.ImageIcon(getClass().getResource("/Img/male_user_1.png")), jPanel3); 

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_xmag_8826.png"))); 

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
                client_tab1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(client_tab1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(146)
        					.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(31)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 1069, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(32)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Gestion des Rendez-vous", new javax.swing.ImageIcon(getClass().getResource("/Img/logoo.png")), jPanel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dentt.jpg")));

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
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jLabel3)
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jButton13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 1276, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 510, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
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
             b.fillToJtable("select * from patient", client_tab);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
 
    public void setPatient()
    {
        String nom=nomClient.getText();
        String prenom=prenomClient.getText();
        String adresse=soin_client.getText();
       
        //envoi des donnes 
        cl.setNom(nom);
        cl.setPrenom(prenom);
        cl.setAdresse(adresse); 
       



    }
    
 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
     
         try {
        	 cl.setId(new Double(nclient.getText()).intValue());
             if(cl.ModifierSoin(soin_client.getText())==true)
             {
                 JOptionPane.showMessageDialog(null, "Le soin a été ajouté ! ");
            	 b.fillToJtable("select * from patient", client_tab);
                     filter_client(rech_client);
                 
             }
             else
             {
                                  JOptionPane.showMessageDialog(null, "Erreur d'ajout");

             }
         
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
     
       
    }//GEN-LAST:event_jButton1ActionPerformed
public void deplece_info(int i)
{
    nclient.setText(client_tab.getValueAt(i, 0).toString());
        nomClient.setText(client_tab.getValueAt(i, 1).toString());
    prenomClient.setText(client_tab.getValueAt(i, 2).toString());
    soin_client.setText(client_tab.getValueAt(i, 8).toString());
    
    
 
        


}
    private void client_tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_tabMouseClicked

       int i= client_tab.getSelectedRow();
       
       deplece_info(i);

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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
           filter_client(rech_client);
           
     
    }

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {

        filter_client(rech_client);
       
    }

    private void rech_clientPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
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

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        new LogIn().setVisible(true);
        this.dispose();
      
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void rech_client1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
       
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
            b.fillToJtable("select * from rdv  ", client_tab1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {
       
    }

    private void client_tab1MouseClicked(java.awt.event.MouseEvent evt) {
       
    }

    /**
     * @param args the command line arguments
     */
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
        //</editor-fold>

         java.awt.EventQueue.invokeLater(() -> {
            
              Home home=new Home();
                                                
                          
        
        Toolkit tk = Toolkit.getDefaultToolkit();

home.setExtendedState(home.MAXIMIZED_BOTH); 
home.show();
                       home.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField soin_client;
    private javax.swing.JTable client_tab;
    private javax.swing.JTable client_tab1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nclient;
    private javax.swing.JTextField nomClient;
    private javax.swing.JTextField prenomClient;
    private javax.swing.JComboBox<String> rech_client;
    private javax.swing.JComboBox<String> rech_client1;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JComboBox<String> jComboBox1;
}
