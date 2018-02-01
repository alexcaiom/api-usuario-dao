package br.com.massuda.alexander.autenticacao.dao.usuario.profissional.impl;

import br.com.massuda.alexander.autenticacao.dao.impl.DAO;
import br.com.massuda.alexander.autenticacao.dao.usuario.profissional.IExperienciaProfissionalDAO;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.profissional.ExperienciaProfissional;
import br.com.waiso.framework.exceptions.ErroUsuario;

public class ExperienciaProfissionalDAOImpl extends DAO<ExperienciaProfissional> implements IExperienciaProfissionalDAO {

	public ExperienciaProfissionalDAOImpl() {
		super(ExperienciaProfissional.class);
	}

	@Override
	public void editar(ExperienciaProfissional o) throws ErroUsuario {
		super.editar(o);
	}

}
