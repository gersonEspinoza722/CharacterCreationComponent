/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import BoardElement.Character.Concrete.CharacterBasic;
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import Patterns.IPrototype;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Marvin Armando
 */
public class TemplatesCharacterView extends javax.swing.JFrame {

    /**
     * Creates new form TemplatesCharacterView
     *
     * @param warrior
     */
    public TemplatesCharacterView(ArrayList<IPrototype> prototypes) {
        //System.out.println(warrior.getToString());
        initComponents();
        setCharacters(prototypes);
    }

    public void setCharacters(ArrayList<IPrototype> prototypes) {
        System.out.println(prototypes.size());
        for (IPrototype prototype : prototypes) {
            CharacterBasic character = (CharacterBasic) prototype.deepClone();
            //System.out.println(character.getToString());
            //System.out.println(character.getMedia().getMedia().size());
            JButton toolButton = new JButton();
            String path = character.getMedia().getMedia().get(0).getPath();
            ImageIcon icon = new ImageIcon(path);
            Image image = icon.getImage().getScaledInstance(250, 500, Image.SCALE_DEFAULT);
            ImageIcon newIcon = new ImageIcon(image);
            toolButton.setIcon(newIcon);
            //System.out.println("PRUEBA");
            this.templatesCharacter.add(toolButton);
            this.templatesCharacter.updateUI();
            toolButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println(path);
                    try {
                        CharacterView characterView = new CharacterView(character);
                        characterView.setVisible(true);

                    } catch (Exception ex) {
                        Logger.getLogger(CharacterView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
        //String path = warrior.getMedia().getImages().get(0).getPath();
        //toolButton.setIcon(new javax.swing.ImageIcon(path));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        templatesCharacterScroll = new javax.swing.JScrollPane();
        templatesCharacter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        templatesCharacter.setLayout(new java.awt.GridLayout(0, 5));
        templatesCharacterScroll.setViewportView(templatesCharacter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(templatesCharacterScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(templatesCharacterScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel templatesCharacter;
    private javax.swing.JScrollPane templatesCharacterScroll;
    // End of variables declaration//GEN-END:variables
}
