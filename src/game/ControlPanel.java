/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.SoundClip;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Sarath
 */
/**
 * This is the control panel where GUI buttons allow the user interact with the game 
 */
public class ControlPanel extends javax.swing.JPanel {
    private Game game;
    private SoundClip gameMusic1,gameMusic2,gameMusic3,gameMusic4;
    /**
     * Creates new form ControlPanel
     */
    public ControlPanel(Game game) {
        initComponents();
        this.game = game;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pause = new javax.swing.JButton();
        Resume = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Next_Level = new javax.swing.JButton();
        Restart_Game = new javax.swing.JButton();
        highScore = new javax.swing.JButton();

        Pause.setText("Pause");
        Pause.setFocusable(false);
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });

        Resume.setText("Resume");
        Resume.setFocusable(false);
        Resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.setFocusable(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Next_Level.setText("Next Level");
        Next_Level.setFocusable(false);
        Next_Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_LevelActionPerformed(evt);
            }
        });

        Restart_Game.setText("Restart Game");
        Restart_Game.setFocusable(false);
        Restart_Game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Restart_GameActionPerformed(evt);
            }
        });

        highScore.setText("Leaderboard");
        highScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Pause, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Resume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Restart_Game, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(Next_Level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Pause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Restart_Game)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Next_Level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        // TODO add your handling code here:
        System.out.println("Game was Paused");
        game.getWorld().stop();
        
        
    }//GEN-LAST:event_PauseActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.out.println("Better Luck Next Time ");
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeActionPerformed
        // TODO add your handling code here:
        System.out.println("Game Started");
        game.getWorld().start();
    }//GEN-LAST:event_ResumeActionPerformed

    private void Next_LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_LevelActionPerformed
        // TODO add your handling code here:
        //level++;
        game.goNextLevel();
        
    }//GEN-LAST:event_Next_LevelActionPerformed

    private void Restart_GameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Restart_GameActionPerformed
        // TODO add your handling code here:
        new Game();
    }//GEN-LAST:event_Restart_GameActionPerformed

    private void highScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreActionPerformed
        try {
            // TODO add your handling code here:
            game.readScore();
            JFrame highScore = new JFrame("High Scores");
            highScore.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            highScore.add(game.getHighScoreReader());
            highScore.setVisible(true);
            highScore.pack();
            
        } catch (IOException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_highScoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Next_Level;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Restart_Game;
    private javax.swing.JButton Resume;
    private javax.swing.JButton highScore;
    // End of variables declaration//GEN-END:variables
}