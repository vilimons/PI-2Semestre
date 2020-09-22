/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.views;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sKm
 */
public class TelaProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public TelaProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        panelSidebarTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelContainer = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        lblTipoProduto = new javax.swing.JLabel();
        cbxTipoProduto = new javax.swing.JComboBox<>();
        lblValorProduto = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoProduto = new javax.swing.JTextField();
        btnArquivo = new javax.swing.JButton();
        lblImagemProduto = new javax.swing.JLabel();
        txtArquivoImagem = new javax.swing.JTextField();
        lblImagem = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        panelTabelaProdutos = new javax.swing.JPanel();
        spanelProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);

        panelSidebarTop.setBackground(new java.awt.Color(15, 76, 117));

        jLabel2.setText(" ");

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 190, 190));
        jLabel1.setText("Cadastro de Produto");

        javax.swing.GroupLayout panelSidebarTopLayout = new javax.swing.GroupLayout(panelSidebarTop);
        panelSidebarTop.setLayout(panelSidebarTopLayout);
        panelSidebarTopLayout.setHorizontalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSidebarTopLayout.setVerticalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGroup(panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSidebarTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSidebarTopLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));
        panelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblID.setText("ID:");
        panelContainer.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 19, -1, -1));

        lblNomeProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblNomeProduto.setText("Nome:");
        panelContainer.add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 19, -1, -1));

        txtNomeProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        panelContainer.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 40, 335, 30));

        txtIdProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        panelContainer.add(txtIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 40, 254, 30));

        lblTipoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTipoProduto.setText("Tipo:");
        panelContainer.add(lblTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        cbxTipoProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de produto", "Bonés", "Camisetas", "Blusas", "Shorts", "Calças" }));
        panelContainer.add(cbxTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        lblValorProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblValorProduto.setText("Valor:");
        panelContainer.add(lblValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));
        panelContainer.add(txtValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 130, 30));

        lblDescricaoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblDescricaoProduto.setText("Descrição:");
        panelContainer.add(lblDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 20, -1, -1));
        panelContainer.add(txtDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 550, 30));

        btnArquivo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnArquivo.setText("Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });
        panelContainer.add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, 30));

        lblImagemProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblImagemProduto.setText("Selecione uma imagem:");
        panelContainer.add(lblImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        txtArquivoImagem.setEditable(false);
        txtArquivoImagem.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        panelContainer.add(txtArquivoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 243, 30));

        lblImagem.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelContainer.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, 350, 120));

        btnCadastrar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        panelTabelaProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        tbProdutos.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setToolTipText("Tabela Produtos");
        tbProdutos.setShowHorizontalLines(false);
        spanelProdutos.setViewportView(tbProdutos);
        tbProdutos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout panelTabelaProdutosLayout = new javax.swing.GroupLayout(panelTabelaProdutos);
        panelTabelaProdutos.setLayout(panelTabelaProdutosLayout);
        panelTabelaProdutosLayout.setHorizontalGroup(
            panelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
        );
        panelTabelaProdutosLayout.setVerticalGroup(
            panelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        btnSalvar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");

        btnRemoverProduto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnRemoverProduto.setText("Remover");

        btnEditarProduto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnEditarProduto.setText("Editar");

        btnCancelarCadastro.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSidebarTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(panelTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarProduto)
                        .addGap(100, 100, 100)
                        .addComponent(btnRemoverProduto)
                        .addGap(100, 100, 100)
                        .addComponent(btnCancelarCadastro)
                        .addGap(21, 21, 21)))
                .addGap(50, 50, 50))
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarProduto, btnRemoverProduto, btnSalvar});

        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addComponent(panelSidebarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarProduto)
                        .addComponent(btnRemoverProduto)
                        .addComponent(btnCancelarCadastro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar)))
                .addGap(18, 18, 18)
                .addComponent(panelTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarProduto, btnRemoverProduto, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String idProduto = txtIdProduto.getText();
        String nomeProduto = txtNomeProduto.getText();
        String descricaoProduto = txtDescricaoProduto.getText();
        String valorProduto = txtValorProduto.getText();

        if (cbxTipoProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de produto! ", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

        DefaultTableModel dtmCarrinho = (DefaultTableModel) tbProdutos.getModel();
        dtmCarrinho.addRow(new Object[]{
            idProduto,
            nomeProduto,
            cbxTipoProduto.getSelectedItem().toString(),
            descricaoProduto,
            valorProduto,

        });
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed

        // Buscar Imagem com FileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar arquivo de imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter ff = new FileNameExtensionFilter("Imagem", "jpg", "png", "jpeg", "svg");

        fileChooser.setFileFilter(ff);
        int retorno = fileChooser.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            // Mostrar caminho no TextField
            txtArquivoImagem.setText(file.getPath());

            //Apresentar Imagem setada no Label
            Image image = null;
            try {
                image = ImageIO.read(file);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, ERROR);
            }

            lblImagem.setIcon(new ImageIcon(image.getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_DEFAULT)));
        }

    }//GEN-LAST:event_btnArquivoActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelSidebarTop;
    private javax.swing.JPanel panelTabelaProdutos;
    private javax.swing.JScrollPane spanelProdutos;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtArquivoImagem;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
