package com.br.POO.HerancaEComparacaoDeInterfaces;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML{

    void abrirConexao();
    void fecharConexao();
}
