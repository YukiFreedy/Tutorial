package nivelbasico;

import org.junit.Test;

public class test {

    private toImplement test = new Implementacion();

    @Test
    public void testMultiplicar(){
        assert test.multiplicar(2, 4) == 8;
        assert test.multiplicar(0, 2) == 0;
        assert test.multiplicar(10, 20) == 200;
    }

    @Test
    public void testRestar(){
        assert test.restar(4,3,2) == -1;
        assert test.restar(10, 4, 2) == 4;
        assert test.restar(-10, 2, -4) == -8;
    }

    @Test
    public void testEsMayorA(){
        assert !test.esMayorA(2,3);
        assert test.esMayorA(3, 2);
        assert !test.esMayorA(2,2);
        assert !test.esMayorA(-2, -1);
        assert test.esMayorA(-1,-2);
    }

    @Test
    public void testDistanciaA(){
        assert test.distanciaEntre(4, 5) == 1;
        assert test.distanciaEntre(10, 5) == 5;
        assert test.distanciaEntre(0, 0) == 0;
        assert test.distanciaEntre(-20, 0) == 20;
    }

    @Test
    public void testJuntarOraciones(){
        assert test.juntarOraciones("uno", "dos").equals("uno dos");
    }

    @Test
    public void testSumarLista(){
        int [] lista = new int[10];
        for(int i = 0; i < 10; i++)
            lista[i] = i;
        assert test.sumarLista(lista) == 45;
    }

    @Test
    public void testConcatenarLista(){
        String [] lista = new String[3];
        lista[0] = "platano";
        lista[1] = "manzana";
        lista[2] = "pera";
        assert test.concatenarLista(lista).equals("platano manzana pera");
    }
}
