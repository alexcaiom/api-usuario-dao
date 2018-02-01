package br.com.massuda.alexander.autenticacao.dao.usuario.academico.impl;

import br.com.massuda.alexander.autenticacao.dao.impl.DAO;
import br.com.massuda.alexander.autenticacao.dao.usuario.academico.IAreaDeEstudoDAO;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.academico.AreaDeEstudo;

public class AreaDeEstudoDAOImpl extends DAO<AreaDeEstudo> implements IAreaDeEstudoDAO {

	public AreaDeEstudoDAOImpl() {
		super(AreaDeEstudo.class);
	}

}
