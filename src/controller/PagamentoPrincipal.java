package controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Pagamento;
import persistence.PagamentoDB;

import java.sql.SQLException;
public class PagamentoPrincipal implements Ipagamento {

    public String msg_pagamento = "Forma de Pagamento";
    public TextField tfid_pg;

    public TextField tfendereco;

    public TextField tfformapagamento;

    public TextField tftotalFrete;

    public PagamentoPrincipal(TextField tfid_pg, TextField tfendereco, TextField tfformapagamento, TextField tftotalFrete, Label msg_pagamento) {
        this.tfid_pg = tfid_pg;
        this.tfendereco = tfendereco;
        this.tfformapagamento = tfformapagamento;
        this.tftotalFrete = tftotalFrete;
        this.msg_pagamento = String.valueOf(msg_pagamento);
    }



    @Override
    public void inserirPagamento(Pagamento P) throws SQLException, ClassNotFoundException {
        PagamentoDB PDB = new PagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
        tfformapagamento.setText(P.getFormapagamento());
        tftotalFrete.setText(String.valueOf(P.getTotalFrete()));
        tfendereco.setText(P.getEndereco());
    }

    @Override
    public void buscarPagamento(Pagamento P) throws SQLException, ClassNotFoundException {
        PagamentoDB PDB = new PagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
    }

    @Override
    public void atualizarPagamento(Pagamento P) throws SQLException, ClassNotFoundException {
        PagamentoDB PDB = new PagamentoDB();
        PDB.inserirPagamento(P);
        PDB.buscarPagamento(P);
        PDB.atualizarPagamento(P);
        PDB.excluirPagamento(P);
    }

    @Override
    public void excluirPagamento(Pagamento P) throws SQLException, ClassNotFoundException {
        PagamentoDB PDB = new PagamentoDB();
        PDB.excluirPagamento(P);
        PDB.buscarPagamento(P);
    }
}