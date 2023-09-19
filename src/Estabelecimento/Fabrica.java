package Estabelecimento;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.DeskJet;
import Equipamentos.Impressora.Impressora;
import Equipamentos.Multifuncional.MultifuncionalPrint;

public class Fabrica {
    public static void main(String[] args){
        MultifuncionalPrint mp = new MultifuncionalPrint();

        Impressora impressora = mp;
        impressora.imprimir();

        Copiadora copiadora = mp;
        copiadora.copiar();

        Digitalizadora digitalizadora = mp;
        digitalizadora.digitalizar();
    }
}
