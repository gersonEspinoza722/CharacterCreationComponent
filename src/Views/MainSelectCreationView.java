/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import BoardElement.Character.Concrete.Warrior;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import BoardElement.Tools.ToolArray;
import Media.Concrete.ImageArray;
import Media.IMediaListing;
import java.io.File;

/**
 *
 * @author Marvin Armando
 */
public  class MainSelectCreationView extends javax.swing.JFrame {
    
    public ToolArray prueba = new ToolArray();
    public Warrior character;
    public IMediaListing imagesCharacter = new ImageArray();

    /**
     * Creates new form MainCharacterView
     */
    public MainSelectCreationView() {
        initComponents();
        loadTemplates();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        templatesButton = new javax.swing.JButton();
        newCharacterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        templatesButton.setText("Templates");
        templatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templatesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(templatesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 240, 60));

        newCharacterButton.setText("NewCharacter");
        newCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCharacterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newCharacterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 240, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void templatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_templatesButtonActionPerformed
        // TODO add your handling code here:
        
        TemplatesCharacterView templatesCharacterView = new  TemplatesCharacterView(this.character);
        templatesCharacterView.setVisible(true);
        
    }//GEN-LAST:event_templatesButtonActionPerformed

    private void newCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCharacterButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_newCharacterButtonActionPerformed

    public void loadTemplates(){
        File fileCharacter = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\magicLvl1.png");
        File fileCharacter2 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\magicLvl2.png");
        File fileCharacter3 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\magicLvl3.png");
        File fileCharacter4 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\magicLvl4.png");

        IMediaListing images = new ImageArray();
        File fileSkill = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Skill\\ball\\ballPREVIEW.png");
        File fileSkill2 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Skill\\ball\\ballLevel1.png");
        File fileSkill3 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Skill\\ball\\ballLevel2.png");
        images.loadMedia("SkillPreview", fileSkill);
        images.loadMedia("SkillLevel1", fileSkill2);
        images.loadMedia("SkillLevel2", fileSkill3);

        Skill tool = new Skill(5, "RompeAnos", 100, 50, 10, 1, 2, 2, 0);
        tool.setMedia(images);
        //System.out.println(tool.getToString());
        //System.out.println(images.getImages().get(0).getPath());
        prueba.addTool(tool);

        IMediaListing images2 = new ImageArray();
        File fileWeapon = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Weapon\\Stick\\stickPREVIEW.png");
        File fileWeapon2 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Weapon\\Stick\\stickLevel1.png");
        File fileWeapon3 = new File("C:\\Users\\Marvin Armando\\Documents\\NetBeansProjects\\Diseño\\Proyecto\\CharacterCreationComponent\\src\\Images\\Character\\Weapon\\Stick\\stickLevel2.png");
        images2.loadMedia("WeaponPreview", fileWeapon);
        images2.loadMedia("WeaponLevel1", fileWeapon2);
        images2.loadMedia("WeaponLevel2", fileWeapon3);
        Weapon tool2 = new Weapon(5, "RompeCulos", 100, 50, 10, 1, 2, 2, 1);
        tool2.setMedia(images2);
        //System.out.println(tool2.getToString());
        //System.out.println(images2.getImages().get(0).getPath());
        prueba.addTool(tool2);

        imagesCharacter.loadMedia("CharacterWarrior", fileCharacter);
        imagesCharacter.loadMedia("CharacterWarrior", fileCharacter2);
        imagesCharacter.loadMedia("CharacterWarrior", fileCharacter3);
        imagesCharacter.loadMedia("CharacterWarrior", fileCharacter4);
        character = new Warrior("Prueba", 100, 50, prueba, 10, 10, 10, 10, 10, 10, imagesCharacter);
    }
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
            java.util.logging.Logger.getLogger(MainSelectCreationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSelectCreationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSelectCreationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSelectCreationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSelectCreationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton newCharacterButton;
    private javax.swing.JButton templatesButton;
    // End of variables declaration//GEN-END:variables
}
