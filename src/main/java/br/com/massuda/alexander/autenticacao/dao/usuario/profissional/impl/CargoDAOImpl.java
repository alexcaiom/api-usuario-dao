package br.com.massuda.alexander.autenticacao.dao.usuario.profissional.impl;

import br.com.massuda.alexander.autenticacao.dao.impl.DAO;
import br.com.massuda.alexander.autenticacao.dao.usuario.profissional.ICargoDAO;
import br.com.massuda.alexander.autenticacao.orm.modelo.usuario.profissional.Cargo;

public class CargoDAOImpl extends DAO<Cargo> implements ICargoDAO {

	public CargoDAOImpl() {
		super(Cargo.class);
	}

}
