/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import BoardElement.Character.CharacterFactory;
import BoardElement.Character.CharacterListingFactory;
import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Character.ICharacter;
import BoardElement.Character.ICharacterListing;
import BoardElement.Tools.ToolFactory;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaElementFactory;
import Media.MediaListingFactory;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin Armando
 */
public class CreateCharacter extends javax.swing.JFrame {
    
    public CharacterListingFactory characterListingFactory = new CharacterListingFactory();
    public CharacterFactory characterFactory = CharacterFactory.getInstance();
    
    public ToolListingFactory toolListingFactory = new ToolListingFactory();
    public ToolFactory toolFactory = new ToolFactory();
    
    public MediaListingFactory mediaListingFactory  = new MediaListingFactory();
    public MediaElementFactory mediaElementFactory = new MediaElementFactory();
   
    public ICharacterListing characterListing;
    CharacterBasic.CharacterBasicBuilder characterBasicBuilder = new CharacterBasic.CharacterBasicBuilder();
    /**
     * Creates new form CreateCharacter
     */
    public CreateCharacter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addImage = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textDefaultLife = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textDecrementable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textLevel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textMinPlayer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textHitsPerUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textFields = new javax.swing.JTextField();
        createCharacter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addImage.setText("AddImage");
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("DefaultLife");

        jLabel3.setText("Decrementable");

        jLabel4.setText("Level");

        jLabel5.setText("MinPlayerLevel");

        jLabel6.setText("HitsPerUnit");

        jLabel7.setText("Field");

        createCharacter.setText("Create");
        createCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCharacterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDefaultLife)
                    .addComponent(textName)
                    .addComponent(textDecrementable)
                    .addComponent(textLevel)
                    .addComponent(textMinPlayer)
                    .addComponent(textHitsPerUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(textFields))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addComponent(createCharacter)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDefaultLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDecrementable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textMinPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textHitsPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addImage)
                    .addComponent(createCharacter))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // TODO add your handling code here:
        IMediaListing imagesCharacter = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterLvl0= mediaElementFactory.getTool(0);
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        if(archivo != null){
            String origen = archivo.getPath();
            imageCharacterLvl0.setPath(origen);
            imagesCharacter.loadMedia(imageCharacterLvl0);
            characterBasicBuilder.addImage(imageCharacterLvl0);
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
        }
    }//GEN-LAST:event_addImageActionPerformed

    private void createCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCharacterActionPerformed
        // TODO add your handling code here:
        characterListing = characterListingFactory.getCharacterListing(0);
        characterBasicBuilder.setDecrementableLife(10).setDefaultLife(10).setFields(10).setHitsPerUnit(10)
                .setLevel(10).setMinPlayerLevelReq(10).setName("Barbaro");
        ICharacter character = characterBasicBuilder.build();
        characterListing.addCharacter(character);
        characterFactory.addPrototype(character);
        System.out.println(character.getToString());
    }//GEN-LAST:event_createCharacterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCharacter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCharacter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImage;
    private javax.swing.JButton createCharacter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textDecrementable;
    private javax.swing.JTextField textDefaultLife;
    private javax.swing.JTextField textFields;
    private javax.swing.JTextField textHitsPerUnit;
    private javax.swing.JTextField textLevel;
    private javax.swing.JTextField textMinPlayer;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
