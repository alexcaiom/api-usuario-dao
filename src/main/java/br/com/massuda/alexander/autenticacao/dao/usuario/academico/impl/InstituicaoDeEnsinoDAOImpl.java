package br.com.massuda.alexander.autenticacao.dao.usuario.academico.impl;

import br.com.massuda.alexander.autenticacao.dao.impl.DAO;
import br.com.massuda.alexander.autenticacao.dao.usuario.academico.IInstituicaoDeEnsinoDAO;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.academico.InstituicaoDeEnsino;

public class InstituicaoDeEnsinoDAOImpl extends DAO<InstituicaoDeEnsino> implements IInstituicaoDeEnsinoDAO {

	public InstituicaoDeEnsinoDAOImpl() {
		super(InstituicaoDeEnsino.class);
	}

}
