package br.edu.utfpr.dv.siacoes.dao;

import java.sql.SQLException;
import java.util.List;


public abstract class handleStructure<L> {
	 public abstract List<L> listAll() throws SQLException;
	 public abstract List<L> listAll(boolean onlyActive) throws SQLException;
	 public abstract L findById(int id) throws SQLException;
	 public abstract int save(int idUser, L unit) throws SQLException;
}
