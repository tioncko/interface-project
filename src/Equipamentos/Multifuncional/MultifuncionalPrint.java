package Equipamentos.Multifuncional;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class MultifuncionalPrint implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando arquivos da copiadora");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizar arquivos da digitalizadora");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir arquivos da impressora");
    }
}
