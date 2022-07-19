
package com.mycompany.inventory.management;

/**
 *
 * @author asif
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashPanel = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        headerLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        initialLogoLabel = new javax.swing.JLabel();
        percentageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        progressBar.setBackground(new java.awt.Color(204, 204, 204));
        progressBar.setForeground(new java.awt.Color(102, 102, 102));
        progressBar.setBorder(null);
        progressBar.setBorderPainted(false);

        headerLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(102, 102, 102));
        headerLabel.setText("Inventory Management System");

        titleLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 102, 102));
        titleLabel.setText("InvSys");

        initialLogoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\asifa\\Desktop\\database.png")); // NOI18N

        percentageLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        percentageLabel.setForeground(new java.awt.Color(102, 102, 102));
        percentageLabel.setText("%");

        javax.swing.GroupLayout splashPanelLayout = new javax.swing.GroupLayout(splashPanel);
        splashPanel.setLayout(splashPanelLayout);
        splashPanelLayout.setHorizontalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addGap(69, 69, 69))
            .addGroup(splashPanelLayout.createSequentialGroup()
                .addGroup(splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splashPanelLayout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(percentageLabel))
                    .addGroup(splashPanelLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(initialLogoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        splashPanelLayout.setVerticalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                        .addComponent(initialLogoLabel)
                        .addGap(58, 58, 58)))
                .addComponent(percentageLabel)
                .addGap(44, 44, 44)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        splash splashScreen = new splash();
        splashScreen.setVisible(true);
        try{
            for(int i = 0; i<= 100; i++){
                Thread.sleep(40);
                splashScreen.progressBar.setValue(i);
                splashScreen.percentageLabel.setText(Integer.valueOf(i)+"%");
            }
        } catch(Exception e){
            
        }
        new login().setVisible(true);
        splashScreen.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel initialLogoLabel;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel splashPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
