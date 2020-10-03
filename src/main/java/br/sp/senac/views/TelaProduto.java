/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.views;

import java.awt.Color;
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
        panelLogoProduto = new javax.swing.JPanel();
        lblLojaRoupaLogoProduto = new javax.swing.JLabel();
        lblLineProduto = new javax.swing.JLabel();
        panelLineFullLogoProduto = new javax.swing.JPanel();
        lblCadastroProduto = new javax.swing.JLabel();
        tabPaneCadastroProduto = new javax.swing.JTabbedPane();
        panelDadosGerais = new javax.swing.JPanel();
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
        lblTamanhoProduto = new javax.swing.JLabel();
        cbxTamanhoProduto = new javax.swing.JComboBox<>();
        panelImagemMaior = new javax.swing.JPanel();
        lblImagemProdutoTeste = new javax.swing.JLabel();
        btnArquivoTeste = new javax.swing.JButton();
        txtArquivoImagemTeste = new javax.swing.JTextField();
        lblImagemTeste = new javax.swing.JLabel();
        separadorBotoesUp = new javax.swing.JSeparator();
        panelBotoesProduto = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnLimparCadastro = new javax.swing.JButton();
        btnRemoverProduto = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        separadorBotoesDown = new javax.swing.JSeparator();
        panelTabelaProdutos = new javax.swing.JPanel();
        spanelProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);

        panelBg.setBackground(new java.awt.Color(224, 224, 224));

        panelSidebarTop.setBackground(new java.awt.Color(15, 76, 117));

        panelLogoProduto.setBackground(new java.awt.Color(15, 76, 117));
        panelLogoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(190, 176, 40), 1, true));
        panelLogoProduto.setForeground(new java.awt.Color(190, 176, 40));
        panelLogoProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLojaRoupaLogoProduto.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        lblLojaRoupaLogoProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLojaRoupaLogoProduto.setText("Synthesia");
        panelLogoProduto.add(lblLojaRoupaLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 41));

        lblLineProduto.setBackground(new java.awt.Color(190, 190, 190));
        lblLineProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLineProduto.setForeground(new java.awt.Color(190, 176, 40));
        lblLineProduto.setText("____________________________________");
        panelLogoProduto.add(lblLineProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        panelLineFullLogoProduto.setBackground(new java.awt.Color(190, 176, 40));

        javax.swing.GroupLayout panelLineFullLogoProdutoLayout = new javax.swing.GroupLayout(panelLineFullLogoProduto);
        panelLineFullLogoProduto.setLayout(panelLineFullLogoProdutoLayout);
        panelLineFullLogoProdutoLayout.setHorizontalGroup(
            panelLineFullLogoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelLineFullLogoProdutoLayout.setVerticalGroup(
            panelLineFullLogoProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelLogoProduto.add(panelLineFullLogoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 290, 10));

        lblCadastroProduto.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroProduto.setText("Cadastro de Produto");

        javax.swing.GroupLayout panelSidebarTopLayout = new javax.swing.GroupLayout(panelSidebarTop);
        panelSidebarTop.setLayout(panelSidebarTopLayout);
        panelSidebarTopLayout.setHorizontalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelLogoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastroProduto)
                .addGap(53, 53, 53))
        );
        panelSidebarTopLayout.setVerticalGroup(
            panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarTopLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelSidebarTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelLogoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tabPaneCadastroProduto.setBackground(new java.awt.Color(50, 130, 184));
        tabPaneCadastroProduto.setForeground(new java.awt.Color(27, 38, 44));
        tabPaneCadastroProduto.setToolTipText("Cadastro do Produto");
        tabPaneCadastroProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        tabPaneCadastroProduto.setName(""); // NOI18N

        panelDadosGerais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));
        panelDadosGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(27, 38, 44));
        lblID.setText("ID:");
        panelDadosGerais.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 19, -1, -1));

        lblNomeProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblNomeProduto.setText("Nome:");
        panelDadosGerais.add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 19, -1, -1));

        txtNomeProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(27, 38, 44));
        panelDadosGerais.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 40, 335, 30));

        txtIdProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtIdProduto.setForeground(new java.awt.Color(27, 38, 44));
        panelDadosGerais.add(txtIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 40, 254, 30));

        lblTipoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTipoProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblTipoProduto.setText("Tipo:");
        panelDadosGerais.add(lblTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        cbxTipoProduto.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        cbxTipoProduto.setForeground(new java.awt.Color(27, 38, 44));
        cbxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo de produto", "Bonés", "Camisetas", "Blusas", "Shorts", "Calças" }));
        panelDadosGerais.add(cbxTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        lblValorProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblValorProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblValorProduto.setText("Valor:");
        panelDadosGerais.add(lblValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        txtValorProduto.setForeground(new java.awt.Color(27, 38, 44));
        panelDadosGerais.add(txtValorProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 130, 30));

        lblDescricaoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblDescricaoProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblDescricaoProduto.setText("Descrição:");
        panelDadosGerais.add(lblDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 20, -1, -1));

        txtDescricaoProduto.setForeground(new java.awt.Color(27, 38, 44));
        panelDadosGerais.add(txtDescricaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 320, 30));

        btnArquivo.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnArquivo.setForeground(new java.awt.Color(27, 38, 44));
        btnArquivo.setText("Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });
        panelDadosGerais.add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, 30));

        lblImagemProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblImagemProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblImagemProduto.setText("Selecione uma imagem:");
        panelDadosGerais.add(lblImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        txtArquivoImagem.setEditable(false);
        txtArquivoImagem.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtArquivoImagem.setForeground(new java.awt.Color(27, 38, 44));
        panelDadosGerais.add(txtArquivoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 240, 30));

        lblImagem.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        panelDadosGerais.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 170, 110));

        lblTamanhoProduto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblTamanhoProduto.setForeground(new java.awt.Color(27, 38, 44));
        lblTamanhoProduto.setText("Tamanho:");
        panelDadosGerais.add(lblTamanhoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, -1));

        cbxTamanhoProduto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        cbxTamanhoProduto.setForeground(new java.awt.Color(27, 38, 44));
        cbxTamanhoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o tamanho", "Único", "PP", "P", "M", "G", "GG", "XGG", " ", " ", " " }));
        panelDadosGerais.add(cbxTamanhoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 190, 30));

        tabPaneCadastroProduto.addTab("Geral", panelDadosGerais);

        panelImagemMaior.setBackground(new java.awt.Color(224, 224, 224));
        panelImagemMaior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        lblImagemProdutoTeste.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblImagemProdutoTeste.setForeground(new java.awt.Color(27, 38, 44));
        lblImagemProdutoTeste.setText("Selecione uma imagem:");

        btnArquivoTeste.setBackground(new java.awt.Color(224, 224, 224));
        btnArquivoTeste.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnArquivoTeste.setForeground(new java.awt.Color(27, 38, 44));
        btnArquivoTeste.setText("Arquivo");
        btnArquivoTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoTesteActionPerformed(evt);
            }
        });

        txtArquivoImagemTeste.setEditable(false);
        txtArquivoImagemTeste.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtArquivoImagemTeste.setForeground(new java.awt.Color(27, 38, 44));

        lblImagemTeste.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lblImagemTeste.setToolTipText("Imagem do Produto");
        lblImagemTeste.setDoubleBuffered(true);

        javax.swing.GroupLayout panelImagemMaiorLayout = new javax.swing.GroupLayout(panelImagemMaior);
        panelImagemMaior.setLayout(panelImagemMaiorLayout);
        panelImagemMaiorLayout.setHorizontalGroup(
            panelImagemMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagemMaiorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblImagemProdutoTeste)
                .addGap(18, 18, 18)
                .addComponent(txtArquivoImagemTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArquivoTeste)
                .addGap(161, 161, 161)
                .addComponent(lblImagemTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        panelImagemMaiorLayout.setVerticalGroup(
            panelImagemMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImagemMaiorLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(panelImagemMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImagemProdutoTeste)
                    .addComponent(btnArquivoTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArquivoImagemTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblImagemTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPaneCadastroProduto.addTab("\"Imagem Maior\"", panelImagemMaior);

        panelBotoesProduto.setBackground(new java.awt.Color(224, 224, 224));

        btnSalvar.setBackground(new java.awt.Color(224, 224, 224));
        btnSalvar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(27, 38, 44));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_save_24px.png"))); // NOI18N
        btnSalvar.setText("Salvar");

        btnEditarProduto.setBackground(new java.awt.Color(224, 224, 224));
        btnEditarProduto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnEditarProduto.setForeground(new java.awt.Color(27, 38, 44));
        btnEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_edit_24px.png"))); // NOI18N
        btnEditarProduto.setText("Editar");

        btnCadastrar.setBackground(new java.awt.Color(224, 224, 224));
        btnCadastrar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(27, 38, 44));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_registration_24px.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimparCadastro.setBackground(new java.awt.Color(224, 224, 224));
        btnLimparCadastro.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnLimparCadastro.setForeground(new java.awt.Color(27, 38, 44));
        btnLimparCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_broom_24px.png"))); // NOI18N
        btnLimparCadastro.setText("Limpar");
        btnLimparCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCadastroActionPerformed(evt);
            }
        });

        btnRemoverProduto.setBackground(new java.awt.Color(224, 224, 224));
        btnRemoverProduto.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnRemoverProduto.setForeground(new java.awt.Color(27, 38, 44));
        btnRemoverProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_trash_24px.png"))); // NOI18N
        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setBackground(new java.awt.Color(224, 224, 224));
        btnCancelarCadastro.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCancelarCadastro.setForeground(new java.awt.Color(27, 38, 44));
        btnCancelarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_cancel_24px.png"))); // NOI18N
        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesProdutoLayout = new javax.swing.GroupLayout(panelBotoesProduto);
        panelBotoesProduto.setLayout(panelBotoesProdutoLayout);
        panelBotoesProdutoLayout.setHorizontalGroup(
            panelBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSalvar)
                .addGap(217, 217, 217)
                .addComponent(btnLimparCadastro)
                .addGap(40, 40, 40)
                .addComponent(btnEditarProduto)
                .addGap(40, 40, 40)
                .addComponent(btnRemoverProduto)
                .addGap(40, 40, 40)
                .addComponent(btnCancelarCadastro))
        );

        panelBotoesProdutoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarProduto, btnLimparCadastro, btnRemoverProduto, btnSalvar});

        panelBotoesProdutoLayout.setVerticalGroup(
            panelBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditarProduto)
                    .addComponent(btnRemoverProduto)
                    .addComponent(btnCancelarCadastro)
                    .addComponent(btnLimparCadastro))
                .addContainerGap())
        );

        panelBotoesProdutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrar, btnCancelarCadastro, btnEditarProduto, btnLimparCadastro, btnRemoverProduto, btnSalvar});

        panelTabelaProdutos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 76, 117), 1, true));

        tbProdutos.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Tipo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setResizable(false);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbProdutos.getColumnModel().getColumn(1).setResizable(false);
            tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbProdutos.getColumnModel().getColumn(2).setResizable(false);
            tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbProdutos.getColumnModel().getColumn(3).setResizable(false);
            tbProdutos.getColumnModel().getColumn(3).setPreferredWidth(20);
            tbProdutos.getColumnModel().getColumn(4).setResizable(false);
            tbProdutos.getColumnModel().getColumn(4).setPreferredWidth(20);
        }
        tbProdutos.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout panelTabelaProdutosLayout = new javax.swing.GroupLayout(panelTabelaProdutos);
        panelTabelaProdutos.setLayout(panelTabelaProdutosLayout);
        panelTabelaProdutosLayout.setHorizontalGroup(
            panelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaProdutosLayout.createSequentialGroup()
                .addComponent(spanelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTabelaProdutosLayout.setVerticalGroup(
            panelTabelaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spanelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separadorBotoesDown)
                    .addComponent(panelTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotoesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tabPaneCadastroProduto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separadorBotoesUp))
                        .addGap(1, 1, 1)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(panelSidebarTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addComponent(panelSidebarTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabPaneCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(separadorBotoesUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoesProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorBotoesDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String idProduto = txtIdProduto.getText();
        String nomeProduto = txtNomeProduto.getText();
        String descricaoProduto = txtDescricaoProduto.getText();
        String valorProduto = txtValorProduto.getText();

        try {
            if (cbxTipoProduto.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Selecione um tipo de produto! ", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

            DefaultTableModel dtmProdutos = (DefaultTableModel) tbProdutos.getModel();
            dtmProdutos.addRow(new Object[]{
                idProduto,
                nomeProduto,
                descricaoProduto,
                cbxTipoProduto.getSelectedItem().toString(),
                valorProduto,});
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro" + JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        DefaultTableModel dtmProdutos = (DefaultTableModel) tbProdutos.getModel();
        boolean resultadoRemove = false;
        try {
            if (tbProdutos.getSelectedRow() >= 0) {
                dtmProdutos.removeRow(tbProdutos.getSelectedRow());
                tbProdutos.setModel(dtmProdutos);
                resultadoRemove = true;
            } else {
                JOptionPane.showMessageDialog(this, "Para remover, selecione uma linha...", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao remover produto, tente novamente!", "Erro", JOptionPane.ERROR);
        } finally {
            if (resultadoRemove == true) {
                JOptionPane.showMessageDialog(this, "Produto removido com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnLimparCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCadastroActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btnLimparCadastroActionPerformed

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

    private void btnArquivoTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoTesteActionPerformed
        
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
            txtArquivoImagemTeste.setText(file.getPath());

            //Apresentar Imagem setada no Label
            Image image = null;
            try {
                image = ImageIO.read(file);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, ERROR);
            }

            lblImagemTeste.setIcon(new ImageIcon(image.getScaledInstance(lblImagemTeste.getWidth(), lblImagemTeste.getHeight(), Image.SCALE_DEFAULT)));
        }
        
        
        
    }//GEN-LAST:event_btnArquivoTesteActionPerformed

    private void limparCadastro() {
        txtIdProduto.setText("");
        txtNomeProduto.setText("");
        txtDescricaoProduto.setText("");
        cbxTipoProduto.setSelectedIndex(0);
        txtArquivoImagem.setText("");
        txtValorProduto.setText("");
        lblImagem.setIcon(null);
        lblImagemTeste.setIcon(null);
        txtArquivoImagemTeste.setText("");
        
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
    private javax.swing.JButton btnArquivoTeste;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnLimparCadastro;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxTamanhoProduto;
    private javax.swing.JComboBox<String> cbxTipoProduto;
    private javax.swing.JLabel lblCadastroProduto;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblImagemProduto;
    private javax.swing.JLabel lblImagemProdutoTeste;
    private javax.swing.JLabel lblImagemTeste;
    private javax.swing.JLabel lblLineProduto;
    private javax.swing.JLabel lblLojaRoupaLogoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblTamanhoProduto;
    private javax.swing.JLabel lblTipoProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelBotoesProduto;
    private javax.swing.JPanel panelDadosGerais;
    private javax.swing.JPanel panelImagemMaior;
    private javax.swing.JPanel panelLineFullLogoProduto;
    private javax.swing.JPanel panelLogoProduto;
    private javax.swing.JPanel panelSidebarTop;
    private javax.swing.JPanel panelTabelaProdutos;
    private javax.swing.JSeparator separadorBotoesDown;
    private javax.swing.JSeparator separadorBotoesUp;
    private javax.swing.JScrollPane spanelProdutos;
    private javax.swing.JTabbedPane tabPaneCadastroProduto;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtArquivoImagem;
    private javax.swing.JTextField txtArquivoImagemTeste;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
