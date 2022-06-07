package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.login;
import model.pagamento;
import persistence.pagamentoDB;

import java.sql.SQLException;
public class pagamentoPrincipal implements Ipagamento {

    public String msg_pagamento = "Forma de pagamento";
    public TextField tfid_pg;

    public TextField tfendereco;

    public TextField tfformapagamento;

    public TextField tftotalFrete;

    public pagamentoPrincipal(TextField tfid_pg, TextField tfendereco, TextField tfformapagamento, TextField tftotalFrete, Label msg_pagamento) {
        this.tfid_pg = tfid_pg;
        this.tfendereco = tfendereco;
        this.tfformapagamento = tfformapagamento;
        this.tftotalFrete = tftotalFrete;
        this.msg_pagamento = String.valueOf(msg_pagamento);
    }

    @Override
    public void inserirPagamento(pagamento P) throws SQLException, ClassNotFoundException {
        pagamentoDB PDB = new pagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
        tfformapagamento.setText(P.getFormapagamento());
        tftotalFrete.setText(String.valueOf(P.getTotalFrete()));
        tfendereco.setText(P.getEndereco());
    }

    @Override
    public void buscarPagamento(pagamento P) throws SQLException, ClassNotFoundException {
        pagamentoDB PDB = new pagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
    }

    @Override
    public void atualizarPagamento(pagamento P) throws SQLException, ClassNotFoundException {
        pagamentoDB PDB = new pagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
        PDB.excluirPagamento(P);
    }

    @Override
    public void excluirPagamento(pagamento P) throws SQLException, ClassNotFoundException {
        pagamentoDB PDB = new pagamentoDB();
        PDB.excluirPagamento(P);
        PDB.buscarPagamento(P);
    }
}