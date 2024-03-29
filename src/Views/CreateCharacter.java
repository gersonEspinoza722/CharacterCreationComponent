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
import BoardElement.Tools.ITool;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolFactory;
import BoardElement.Tools.ToolListingFactory;
import Media.IMediaElement;
import Media.IMediaListing;
import Media.MediaElementFactory;
import Media.MediaListingFactory;
import Patterns.IPrototype;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
    public ArrayList<IPrototype> prototypes;
    public IToolListing tools;
    CharacterBasic.CharacterBasicBuilder characterBasicBuilder = new CharacterBasic.CharacterBasicBuilder();
    ICharacter character;
    /**
     * Creates new form CreateCharacter
     */
    public CreateCharacter(ArrayList<IPrototype> prototypes, IToolListing tools) {
        initComponents();
        this.tools = tools;
        this.prototypes = prototypes;
        loadTools(this.tools);
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
        characterView = new javax.swing.JLabel();
        savePrototype = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        toolsAvailable = new javax.swing.JScrollPane();
        toolsAvaiableView = new javax.swing.JPanel();
        myTools = new javax.swing.JScrollPane();
        myToolsView = new javax.swing.JPanel();

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

        savePrototype.setText("Save prototype");
        savePrototype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePrototypeActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        toolsAvaiableView.setLayout(new java.awt.GridLayout(0, 5));
        toolsAvailable.setViewportView(toolsAvaiableView);

        myToolsView.setLayout(new java.awt.GridLayout(0, 5));
        myTools.setViewportView(myToolsView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 693, Short.MAX_VALUE)
                .addComponent(createCharacter)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGap(84, 84, 84)
                                .addComponent(characterView, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(savePrototype)
                                .addGap(54, 54, 54)
                                .addComponent(toolsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(myTools, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addImage)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(textFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(characterView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolsAvailable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(savePrototype)
                        .addGap(26, 26, 26)
                        .addComponent(addImage)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addComponent(myTools))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCharacter)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadTools(IToolListing tools){
        for(ITool tool: tools.getToolList()){
            setTool(tool);
        }
    }
    
    public void setTool(ITool tool){
        JButton toolButton = new JButton();
        //System.out.println(tool.getMediaListing().getMedia().size());
        String path = tool.getMediaListing().getImages().get(0).getPath();
        //System.out.println(path);
        toolButton.setIcon(new javax.swing.ImageIcon(path));
        this.toolsAvaiableView.add(toolButton);
        this.toolsAvaiableView.updateUI();
        toolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(path);
                try {
                    System.out.println("Soy:" + tool.getType());
                    int i = tool.getType();
                    ITool itool = (ITool ) tool.deepCloneAux();
                    characterBasicBuilder.addTool(itool);
                    JButton toolButton = new JButton();
                    String path = itool.getMediaListing().getImages().get(0).getPath();
                    toolButton.setIcon(new javax.swing.ImageIcon(path));
                    myToolsView.add(toolButton);
                    myToolsView.updateUI();
                    System.out.println("Agregue un tool");
                } catch (Exception ex) {
                    Logger.getLogger(CharacterView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // TODO add your handling code here:
        IMediaListing imagesCharacter = mediaListingFactory.getMediaListing(0);
        IMediaElement imageCharacterLvl0= mediaElementFactory.getMedia(0);
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File archivo = file.getSelectedFile();
        if(archivo != null){
            String origen = archivo.getPath();
            imageCharacterLvl0.setPath(origen);
            imagesCharacter.loadMedia(imageCharacterLvl0);
            characterBasicBuilder.addImage(imageCharacterLvl0);
             String path = imageCharacterLvl0.getPath();
             ImageIcon icon = new ImageIcon(path);
             Image image = icon.getImage().getScaledInstance(characterView.getWidth(), characterView.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon newIcon = new ImageIcon(image);
             characterView.setIcon(newIcon);
             characterView.updateUI();
            System.out.println("Path elegido:" + imageCharacterLvl0.getPath());
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
        }
    }//GEN-LAST:event_addImageActionPerformed

    private void createCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCharacterActionPerformed
        // TODO add your handling code here:
        int decrementableLife = Integer.parseInt(this.textDecrementable.getText());
        int defaultLife = Integer.parseInt(this.textDefaultLife.getText());
        int fields = Integer.parseInt(this.textFields.getText());
        int hitsPerUnit = Integer.parseInt(this.textHitsPerUnit.getText());
        int level = Integer.parseInt(this.textLevel.getText());
        int minPlayerLevelReq = Integer.parseInt(this.textMinPlayer.getText());
        String name = this.textName.getText();
        characterListing = characterListingFactory.getCharacterListing(0);
        characterBasicBuilder.setDecrementableLife(decrementableLife).setDefaultLife(defaultLife).setFields(fields).setHitsPerUnit(hitsPerUnit)
                .setLevel(level).setMinPlayerLevelReq(minPlayerLevelReq).setName(name);
        character = characterBasicBuilder.build();
        characterListing.addCharacter(character);
        //characterFactory.addPrototype(character);
        if(savePrototype.isSelected()){
            prototypes.add(character.deepCloneAux());
        }
        CharacterView characterView = new CharacterView(character,this.prototypes,tools);
        characterView.show();
        this.dispose();
    }//GEN-LAST:event_createCharacterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void savePrototypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePrototypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savePrototypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImage;
    private javax.swing.JLabel characterView;
    private javax.swing.JButton createCharacter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane myTools;
    private javax.swing.JPanel myToolsView;
    private javax.swing.JRadioButton savePrototype;
    private javax.swing.JTextField textDecrementable;
    private javax.swing.JTextField textDefaultLife;
    private javax.swing.JTextField textFields;
    private javax.swing.JTextField textHitsPerUnit;
    private javax.swing.JTextField textLevel;
    private javax.swing.JTextField textMinPlayer;
    private javax.swing.JTextField textName;
    private javax.swing.JPanel toolsAvaiableView;
    private javax.swing.JScrollPane toolsAvailable;
    // End of variables declaration//GEN-END:variables
}
