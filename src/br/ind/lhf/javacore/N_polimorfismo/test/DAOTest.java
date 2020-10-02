package br.ind.lhf.javacore.N_polimorfismo.test;

import br.ind.lhf.javacore.N_polimorfismo.classes.ArquivoDAOImpl;
import br.ind.lhf.javacore.N_polimorfismo.classes.DatabaseDAOImpl;
import br.ind.lhf.javacore.N_polimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
    }
}
