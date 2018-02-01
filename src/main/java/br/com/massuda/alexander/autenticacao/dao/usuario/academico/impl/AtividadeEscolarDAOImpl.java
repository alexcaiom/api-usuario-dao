package br.com.massuda.alexander.autenticacao.dao.usuario.academico.impl;

import br.com.massuda.alexander.autenticacao.dao.impl.DAO;
import br.com.massuda.alexander.autenticacao.dao.usuario.academico.IAtividadeEscolarDAO;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.academico.AtividadeEscolar;

public class AtividadeEscolarDAOImpl extends DAO<AtividadeEscolar> implements IAtividadeEscolarDAO {

	public AtividadeEscolarDAOImpl() {
		super(AtividadeEscolar.class);
	}

}
