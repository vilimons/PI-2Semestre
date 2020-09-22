/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.views;

/**
 *
 * @author sKm
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public TelaCliente() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        panelBg = new javax.swing.JPanel();
        btnCancelarCadastro = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        panelTabelaCliente = new javax.swing.JPanel();
        spanelClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        panelContainer = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblDescricaoProduto = new javax.swing.JLabel();
        txtDescricaoCliente = new javax.swing.JTextField();
        lblCpfCliente = new javax.swing.JLabel();
        formatCpfCliente = new javax.swing.JFormattedTextField();
        lblEmailCliente = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        lblSexoCliente = new javax.swing.JLabel();
        cbxSexoCliente = new javax.swing.JComboBox<>();
        lblTelefoneCliente = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JTextField();
        panelSidebarTop = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setResizable(false);

        btnCancelarCadastro.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnEditarCliente.setText("Editar");

        btnRemoverCliente.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnRemoverCliente.setText("Remover");

        btnSalvar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");

        panelTabelaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        tbClientes.setBackground(new java.awt.Color(27, 38, 44));
        tbClientes.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        tbClientes.setForeground(new java.awt.Color(190, 190, 190));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Endereço", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setToolTipText("Tabela Produtos");
        tbClientes.setShowHorizontalLines(false);
        spanelClientes.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbClientes.getColumnModel().getColumn(0).setHeaderValue("ID");
            tbClientes.getColumnModel().getColumn(1).setResizable(false);
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(25);
            tbClientes.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tbClientes.getColumnModel().getColumn(2).setResizable(false);
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(15);
            tbClientes.getColumnModel().getColumn(2).setHeaderValue("CPF");
            tbClientes.getColumnModel().getColumn(3).setResizable(false);
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(25);
            tbClientes.getColumnModel().getColumn(3).setHeaderValue("Endereço");
            tbClientes.getColumnModel().getColumn(4).setResizable(false);
            tbClientes.getColumnModel().getColumn(4).setHeaderValue("Email");
            tbClientes.getColumnModel().getColumn(5).setResizable(false);
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(15);
            tbClientes.getColumnModel().getColumn(5).setHeaderValue("Telefone");
        }

        javax.swing.GroupLayout panelTabelaClienteLayout = new javax.swing.GroupLayout(panelTabelaCliente);
        panelTabelaCliente.setLayout(panelTabelaClienteLayout);
        panelTabelaClienteLayout.setHorizontalGroup(
            panelTabelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 1283, Short.MAX_VALUE)
        );
        panelTabelaClienteLayout.setVerticalGroup(
            panelTabelaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        btnCadastrar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        panelContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));
        panelContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblID.setText("ID:");
        panelContainer.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 19, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        panelContainer.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 40, 254, 30));

        lblNomeCliente.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblNomeCliente.setText("Nome:");
        panelContainer.add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 19, -1, -1));

        txtNomeCliente.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        panelContainer.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 40, 335, 30));

        lblDescricaoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblDescricaoProduto.setText("Endereço:");
        panelContainer.add(lblDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));
        panelContainer.add(txtDescricaoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 550, 30));

        lblCpfCliente.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblCpfCliente.setText("CPF:");
        panelContainer.add(lblCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        panelContainer.add(formatCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 240, 30));

        lblEmailCliente.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblEmailCliente.setText("Email:");
        panelContainer.add(lblEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        panelContainer.add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, 30));

        lblSexoCliente.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblSexoCliente.setText("Sexo:");
        panelContainer.add(lblSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        cbxSexoCliente.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cbxSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Masculino", "Feminino", "Outros", " " }));
        panelContainer.add(cbxSexoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 190, 30));

        lblTelefoneCliente.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTelefoneCliente.setText("Telefone:");
        panelContainer.add(lblTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, -1));
        panelContainer.add(txtTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 240, 30));

        panelSidebarTop.setBackground(new java.awt.Color(15, 76, 117));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(190, 190, 190));
        jLabel11.setText("Cadastro de Cliente");

        javax.swing.GroupLayout panelSidebarTopLayout = new javax.swing.GroupLayout(panelSidebarTop);
        panelSidebarTop.setLayout(panelSidebarTopLayout);
        panelSidebarTopLayout.setHorizontalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSidebarTopLayout.setVerticalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSidebarTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                        .addComponent(btnEditarCliente)
                        .addGap(100, 100, 100)
                        .addComponent(btnRemoverCliente)
                        .addGap(100, 100, 100)
                        .addComponent(btnCancelarCadastro)
                        .addGap(71, 71, 71))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTabelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarCliente, btnRemoverCliente, btnSalvar});

        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSidebarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarCliente)
                        .addComponent(btnRemoverCliente)
                        .addComponent(btnCancelarCadastro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar)))
                .addGap(18, 18, 18)
                .addComponent(panelTabelaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBgLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarCliente, btnRemoverCliente, btnSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxSexoCliente;
    private javax.swing.JFormattedTextField formatCpfCliente;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblSexoCliente;
    private javax.swing.JLabel lblTelefoneCliente;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelSidebarTop;
    private javax.swing.JPanel panelTabelaCliente;
    private javax.swing.JScrollPane spanelClientes;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtDescricaoCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
