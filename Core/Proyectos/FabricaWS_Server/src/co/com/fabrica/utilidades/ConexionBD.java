package co.com.fabrica.utilidades;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import javax.persistence.Query;

import java.io.Serializable;
import java.util.List;


import javax.persistence.EntityManager;

public class ConexionBD implements Serializable{
	
	private static final long serialVersionUID = 7615823656867349311L;
	private static final String JNDI_NAME = "jdbc/fabricaDS";
	private static ConexionBD instance;
	private static Context ctx;
	private static EntityManager em;
	
	private ConexionBD() {
		super();
		cargar();
	}

	public static void cargar() {
		try {
			ctx = new InitialContext();
	        em = (EntityManager) ctx.lookup(JNDI_NAME);
		} catch (NamingException e) {
			System.out.println("Error 1:"+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error 2:"+e.getMessage());
		}
	}
	
	static public ConexionBD getInstance() {
		if (instance == null) {
			instance = new ConexionBD();
		}
		return instance;
	}

	public static EntityManager getEm() {
		return em;
	}

	public static void setEm(EntityManager em) {
		ConexionBD.em = em;
	}
	
	

}
