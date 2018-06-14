package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Contatos contacts = new Contatos("john.doe@gmail.com", "9876-5432");
        Usuario user = new Usuario("John Doe", contacts);

        user.comecaNovoMes();

        Gasto j1 = new Gasto(30, Calendar.JANUARY, "agua");
        Gasto j2 = new Gasto(70, Calendar.JANUARY, "telefone");

        user.incluirGasto(j1);
        user.incluirGasto(j2);
        user.mapeiaMes(j1.getMes());
        user.comecaNovoMes();

        Gasto f1 = new Gasto(10, Calendar.FEBRUARY, "agua");
        Gasto f2  = new Gasto(40, Calendar.FEBRUARY, "telefone");

        user.incluirGasto(f1);
        user.incluirGasto(f2);
        user.mapeiaMes(f1.getMes());
        user.comecaNovoMes();

        Gasto m1 = new Gasto(30, Calendar.MARCH, "agua");
        Gasto m2 = new Gasto(70, Calendar.MARCH, "telefone");
        Gasto m3 = new Gasto(100, Calendar.MARCH, "luz");
        Gasto m4 = new Gasto(700, Calendar.MARCH, "celular novo");

        user.incluirGasto(m1);
        user.incluirGasto(m2);
        user.incluirGasto(m3);
        user.incluirGasto(m4);
        user.mapeiaMes(m1.getMes());
        user.comecaNovoMes();

        Gasto a1 = new Gasto(30, Calendar.APRIL, "agua");
        Gasto a2 = new Gasto(70, Calendar.APRIL, "telefone");
        Gasto a3 = new Gasto(100, Calendar.APRIL, "luz");
        Gasto a4 = new Gasto(100, Calendar.APRIL, "refeicao");

        user.incluirGasto(a1);
        user.incluirGasto(a2);
        user.incluirGasto(a3);
        user.incluirGasto(a4);
        user.mapeiaMes(a1.getMes());
        user.comecaNovoMes();

        Gasto ma1 = new Gasto(30, Calendar.MAY, "agua");
        Gasto ma2 = new Gasto(70, Calendar.MAY, "telefone");

        user.incluirGasto(ma1);
        user.incluirGasto(ma2);
        user.mapeiaMes(ma1.getMes());
        user.comecaNovoMes();

        Gasto ju1 = new Gasto(30, Calendar.JUNE, "agua");
        Gasto ju2 = new Gasto(70, Calendar.JUNE, "telefone");
        Gasto ju3 = new Gasto(5900, Calendar.JUNE, "presente para o professor");
        user.incluirGasto(ju1);
        user.incluirGasto(ju2);
        user.incluirGasto(ju3);

        user.mapeiaMes(ju1.getMes());
        user.comecaNovoMes();

        user.exibeRelatorio();
    }
}
