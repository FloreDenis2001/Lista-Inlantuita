package listaTest;


import com.company.Lista;
import com.company.Node;
import com.company.model.Masina;
import org.junit.jupiter.api.Test;

class ListaTest {
    @Test
    public void addTest(){

        Lista masini= new Lista();

        masini.addStart(new Masina(1,"Opel",2004,"alba"));
        masini.addStart(new Masina(2,"Audi",2019,"verde"));
        masini.addStart(new Masina(3,"Mercedes",2020,"albastru"));
        masini.addStart(new Masina(4,"Golf",2017,"negru"));
        masini.addStart(new Masina(5,"Smart",2008,"portocaliu"));
        masini.addStart(new Masina(6,"Ferrari",2014,"rosu"));//0


        Node it=masini.iterator();

        it=it.getNext();



//         masini.adaugaSfarsit(new Masina(7,"Audi",2006,"alb"));
//         masini.afisareLista();
//         masini.eraseStart();
//         masini.afisareLista();
//         masini.adaugarePoz(3,new Masina(7,"Audi",2006,"alb"));
//         masini.afisareLista();
//         masini.eraseSfarsit();
         masini.erasePozitie(1);
         masini.afisareLista();













    }

}