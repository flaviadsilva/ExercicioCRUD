package VIEW;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TelaPedido extends javax.swing.JFrame {

    public TelaPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btnapagar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnvoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Tela Pedido");

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Data Pedido");

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Valor Total");

        btnsalvar.setBackground(new java.awt.Color(255, 255, 204));
        btnsalvar.setForeground(new java.awt.Color(255, 255, 204));
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnatualizar.setBackground(new java.awt.Color(255, 255, 204));
        btnatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/processamento-de-dados.png"))); // NOI18N
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btnapagar.setBackground(new java.awt.Color(255, 255, 204));
        btnapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });

        btnlistar.setBackground(new java.awt.Color(255, 255, 204));
        btnlistar.setForeground(new java.awt.Color(255, 255, 204));
        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lista-de-controle.png"))); // NOI18N
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnvoltar.setBackground(new java.awt.Color(255, 255, 204));
        btnvoltar.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnvoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdata)
                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnsalvar)
                        .addGap(58, 58, 58)
                        .addComponent(btnatualizar)
                        .addGap(63, 63, 63)
                        .addComponent(btnapagar)
                        .addGap(61, 61, 61)
                        .addComponent(btnlistar)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnvoltar)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsalvar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnatualizar)
                        .addComponent(btnapagar)
                        .addComponent(btnlistar)))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        try {
            DTO.PedidoDTO pedido = new DTO.PedidoDTO();
            DAO.PedidoDAO dao = new DAO.PedidoDAO();

            // Pede o ID do cliente (ou você pode usar txtcliente se for o ID)
            String idCliente = JOptionPane.showInputDialog("Digite o ID do cliente:");
            pedido.setId_cliente(Integer.parseInt(idCliente));

            // Converter a data de String para java.util.Date (formato yyyy-MM-dd)
            String textoData = txtdata.getText().trim();
            if (textoData.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe a data (yyyy-MM-dd).");
                return;
            }

            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd-MM-yyyy");
            formato.setLenient(false); // valida estritamente a data
            java.util.Date utilDate = formato.parse(textoData); // retorna java.util.Date
            pedido.setData_pedido(utilDate); // seu DTO aceita java.util.Date

            pedido.setValor_total(Double.parseDouble(txtvalor.getText()));

            dao.cadastrarPedido(pedido); // no DAO você faz new java.sql.Date(pedido.getData_pedido().getTime())
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");

            // Limpar campos
            txtdata.setText("");
            txtvalor.setText("");

        } catch (java.text.ParseException pe) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use yyyy-MM-dd.");
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Verifique o ID do cliente e o valor.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar pedido: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        try {
            DTO.PedidoDTO pedido = new DTO.PedidoDTO();
            DAO.PedidoDAO dao = new DAO.PedidoDAO();

            // Pede o ID do pedido a atualizar
            String idPedido = JOptionPane.showInputDialog("Digite o ID do pedido para atualizar:");
            pedido.setId_pedido(Integer.parseInt(idPedido));

            String idCliente = JOptionPane.showInputDialog("Digite o ID do cliente:");
            pedido.setId_cliente(Integer.parseInt(idCliente));

            // Converter a data de String para java.util.Date
            String textoData = txtdata.getText().trim();
            if (textoData.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe a data (yyyy-MM-dd).");
                return;
            }
            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyy-MM-dd");
            formato.setLenient(false);
            java.util.Date utilDate = formato.parse(textoData);
            pedido.setData_pedido(utilDate);

            pedido.setValor_total(Double.parseDouble(txtvalor.getText()));

            dao.atualizarPedido(pedido);
            JOptionPane.showMessageDialog(null, "Pedido atualizado com sucesso!");

        } catch (java.text.ParseException pe) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use yyyy-MM-dd.");
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Verifique o ID do pedido/cliente e o valor.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar pedido: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
        try {
            DAO.PedidoDAO dao = new DAO.PedidoDAO();
            String idPedido = JOptionPane.showInputDialog("Digite o ID do pedido para apagar:");
            dao.apagarPedido(Integer.parseInt(idPedido));
            JOptionPane.showMessageDialog(null, "Pedido apagado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar pedido: " + e.getMessage());
        }
    }//GEN-LAST:event_btnapagarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        this.dispose();
        ListaPedidos objListaPedidos = new ListaPedidos();
        objListaPedidos.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // Fecha a tela atual
        this.dispose();

        // Abre a TelaPrincipal
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
