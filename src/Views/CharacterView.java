/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import BoardElement.Character.ICharacter;
import BoardElement.Tools.Concrete.Skill;
import BoardElement.Tools.Concrete.Weapon;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolArray;
import Media.Concrete.ImageArray;
import Media.IMediaListing;
import Patterns.IPrototype;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Marvin Armando
 */
public class CharacterView extends javax.swing.JFrame {

    public int characterLvl;
    public int toolLvl;
    public ICharacter character;
    public ITool toolSelect;
    public ArrayList<IPrototype> prototypes;
    public IToolListing tools;

    /**
     * Creates new form CharacterView
     * @param character
     */
    public CharacterView(ICharacter character,ArrayList<IPrototype> prototypes,IToolListing tools) {
        initComponents();
        characterLvl = 0;
        this.prototypes = prototypes;
        this.character = character;
        toolLvl = 1;
        this.tools = tools;
        this.backButton.setEnabled(false);
        loadCharacter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StatisticsScroll = new javax.swing.JScrollPane();
        Statistics = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        toolViewCharacter = new javax.swing.JLabel();
        characterView = new javax.swing.JLabel();
        WeaponScroll = new javax.swing.JScrollPane();
        WeaponPanel = new javax.swing.JPanel();
        SkillScroll = new javax.swing.JScrollPane();
        SkillPanel = new javax.swing.JPanel();
        ToolStatisticsScroll = new javax.swing.JScrollPane();
        ToolStatistics = new javax.swing.JTextArea();
        ToolView = new javax.swing.JLabel();
        lvlIncButton = new javax.swing.JButton();
        lvlDecButton = new javax.swing.JButton();
        backView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Statistics.setColumns(20);
        Statistics.setRows(5);
        StatisticsScroll.setViewportView(Statistics);

        getContentPane().add(StatisticsScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 390));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ImagePanel.add(toolViewCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));
        ImagePanel.add(characterView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 357));

        getContentPane().add(ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 390, 370));

        WeaponPanel.setLayout(new java.awt.GridLayout(0, 5));
        WeaponScroll.setViewportView(WeaponPanel);

        getContentPane().add(WeaponScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 370, 110));

        SkillPanel.setLayout(new java.awt.GridLayout(0, 5));
        SkillScroll.setViewportView(SkillPanel);

        getContentPane().add(SkillScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 370, 110));

        ToolStatistics.setColumns(20);
        ToolStatistics.setRows(5);
        ToolStatisticsScroll.setViewportView(ToolStatistics);

        getContentPane().add(ToolStatisticsScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 220, 220));
        getContentPane().add(ToolView, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 210, 220));

        lvlIncButton.setText("LVL+");
        lvlIncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlIncButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lvlIncButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 60, -1));

        lvlDecButton.setText("LVL-");
        lvlDecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlDecButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lvlDecButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 60, -1));

        backView.setText("Back");
        backView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backViewActionPerformed(evt);
            }
        });
        getContentPane().add(backView, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.nextButton.setEnabled(true);
        String path = "";
         characterLvl--;
        if (characterLvl > 0) {
           
            path = character.getMedia().getImages().get(characterLvl).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            this.characterView.setIcon(newIcon);

        } else {
            path = character.getMedia().getImages().get(0).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            this.characterView.setIcon(newIcon);
            this.backButton.setEnabled(false);
        }
        character.decLife(20);
        character.decLvl(1);
        this.Statistics.setText(character.getToString());
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        int sizeList = character.getMedia().getImages().size() - 1;
        //System.out.println("El size:" + sizeList);
        this.backButton.setEnabled(true);
        String path = "";
        characterLvl++;
        if (characterLvl < sizeList) {
            
            path = character.getMedia().getImages().get(characterLvl).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            this.characterView.setIcon(newIcon);

        } else {
            path = character.getMedia().getImages().get(sizeList).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            this.characterView.setIcon(newIcon);
            this.nextButton.setEnabled(false);
        }
        character.incLife(20);
        character.incLvl(1);
        this.Statistics.setText(character.getToString());
    }//GEN-LAST:event_nextButtonActionPerformed

    private void lvlIncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlIncButtonActionPerformed
        // TODO add your handling code here:
        
        int sizeList = this.toolSelect.getMediaListing().getImages().size() -1;
        this.lvlDecButton.setEnabled(true);
        toolLvl++;
        if (toolLvl < sizeList) {
            String path = toolSelect.getMediaListing().getImages().get(toolLvl).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(ToolView.getWidth(), ToolView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            ToolView.setIcon(newIcon);
            Image image2 = icon.getImage().getScaledInstance(toolViewCharacter.getWidth(), toolViewCharacter.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon2 = new ImageIcon(image2);
            toolViewCharacter.setIcon(newIcon2);
        }else {
            String path = toolSelect.getMediaListing().getImages().get(sizeList).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(ToolView.getWidth(), ToolView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            ToolView.setIcon(newIcon);
            Image image2 = icon.getImage().getScaledInstance(toolViewCharacter.getWidth(), toolViewCharacter.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon2 = new ImageIcon(image2);
            toolViewCharacter.setIcon(newIcon2);
            this.lvlIncButton.setEnabled(false);
        }
        toolSelect.incLevel();
        ToolStatistics.setText(toolSelect.getToString());
    }//GEN-LAST:event_lvlIncButtonActionPerformed

    private void lvlDecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlDecButtonActionPerformed
        // TODO add your handling code here:int sizeList = this.toolSelect.getMediaListing().getImages().size();
        this.lvlIncButton.setEnabled(true);
        toolLvl--;
        if (toolLvl > 1) {
            
            String path = toolSelect.getMediaListing().getImages().get(toolLvl).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(ToolView.getWidth(), ToolView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            ToolView.setIcon(newIcon);
            Image image2 = icon.getImage().getScaledInstance(toolViewCharacter.getWidth(), toolViewCharacter.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon2 = new ImageIcon(image2);
            toolViewCharacter.setIcon(newIcon2);
        }else {
            String path = toolSelect.getMediaListing().getImages().get(1).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(ToolView.getWidth(), ToolView.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            ToolView.setIcon(newIcon);
            Image image2 = icon.getImage().getScaledInstance(toolViewCharacter.getWidth(), toolViewCharacter.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon newIcon2 = new ImageIcon(image2);
            toolViewCharacter.setIcon(newIcon2);
            this.lvlDecButton.setEnabled(false);
        }
        toolSelect.decLevel();
        ToolStatistics.setText(toolSelect.getToString());
        
    }//GEN-LAST:event_lvlDecButtonActionPerformed

    private void backViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backViewActionPerformed
        // TODO add your handling code here:
        MainSelectCreationView mainSelectCreationView = new MainSelectCreationView(this.prototypes,tools);
        mainSelectCreationView.show();
        this.dispose();
    }//GEN-LAST:event_backViewActionPerformed


    //
    public void setTools(ITool tool){
        toolLvl = 0;
        JButton toolButton = new JButton();
        //System.out.println(tool.getMediaListing().getMedia().size());
        String path = tool.getMediaListing().getImages().get(0).getPath();
        //System.out.println(path);
        toolButton.setIcon(new javax.swing.ImageIcon(path));
        if (tool.getType() == 0) {
            this.SkillPanel.add(toolButton);
            this.SkillPanel.updateUI();
        } else {
            this.WeaponPanel.add(toolButton);
            this.WeaponPanel.updateUI();
        }
        toolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(path);
                try {
                    //System.out.println("Soy:" + tool.getType());
                    toolSelect = tool;
                    toolLvl = 1;
                    lvlDecButton.setEnabled(false);
                    lvlIncButton.setEnabled(true);
                    ToolStatistics.setText(tool.getToString());
                    String path = tool.getMediaListing().getImages().get(toolLvl).getPath();
                    ImageIcon icon = new ImageIcon(path);
                    Image image = icon.getImage().getScaledInstance(ToolView.getWidth(), ToolView.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon newIcon = new ImageIcon(image);
                    ToolView.setIcon(newIcon);
                    ImageIcon icon2 = new ImageIcon(path);
                    Image image2 = icon.getImage().getScaledInstance(toolViewCharacter.getWidth(), toolViewCharacter.getHeight(), Image.SCALE_DEFAULT);
                    ImageIcon newIcon2 = new ImageIcon(image2);
                    toolViewCharacter.setIcon(newIcon2);

                } catch (Exception ex) {
                    Logger.getLogger(CharacterView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public final void loadCharacter() {
        String path = character.getMedia().getImages().get(0).getPath();
        System.out.println("Soy el path del character" + path);
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon newIcon = new ImageIcon(image);
        this.characterView.setIcon(newIcon);
        this.Statistics.setText(character.getToString());
        ArrayList<ITool> toolsList = character.getTools().getToolList();
        for (ITool tool : toolsList) {
            //System.out.println("El size de toolMediaListinn"+ tool.getMediaListing().getMedia().size());
            System.out.println(tool.getToString());
            
            setTools(tool);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JPanel SkillPanel;
    private javax.swing.JScrollPane SkillScroll;
    private javax.swing.JTextArea Statistics;
    private javax.swing.JScrollPane StatisticsScroll;
    private javax.swing.JTextArea ToolStatistics;
    private javax.swing.JScrollPane ToolStatisticsScroll;
    private javax.swing.JLabel ToolView;
    private javax.swing.JPanel WeaponPanel;
    private javax.swing.JScrollPane WeaponScroll;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backView;
    private javax.swing.JLabel characterView;
    private javax.swing.JButton lvlDecButton;
    private javax.swing.JButton lvlIncButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel toolViewCharacter;
    // End of variables declaration//GEN-END:variables
}
