
//EJERCICIO DE LISTAS

// Una fabrica de instrumentos musicales posee una lista con todas las sucursales. De cada uno de ellos
// se sabe su ID alfanumerico, su precio y su tipo ( Percusion, Viento o Cuerda)
// 1.Hacer un metodo LISTAR INSTRUMENTOS que muestre en la consola los datos de cada uno de los instrumentos
// 2.Hacer un metodo INSTRUMENTOS POR TIPO que devuelva una lista de instrumentos cuyo tipo coincida con el recibido
// por parametro.

package www.educacion.com.excersiceswithlist;
import java.util.ArrayList;
public class ExcersicesWithList {
    public static void main(String[] args) {
        Factory factory = new Factory();
        loadFactory(factory);

        factory.listInstruments();

        //lista de instrumentos 
        ArrayList<Instrument> list = factory.instrumentByType(InstrumentTypes.ROPE);
        for(Instrument instrument : list ){
            System.out.println(instrument);
        }
    }
    //Este metodo se hace con la finalidad de que el main no quede tan cargado
    private static void loadFactory(Factory factory){
        //Sucursales
        Branch branch1 = new Branch("Sucursal 1");
        Branch branch2 = new Branch("Sucursal 2");
        
        //Instrumentos a la venta
        Instrument instrument1 = new Instrument("JH755", 4000000, InstrumentTypes.PERCUSSION);
        Instrument instrument2 = new Instrument("JHFS67", 6000000, InstrumentTypes.WIND);
        Instrument instrument3 = new Instrument("JHgd4", 475500000, InstrumentTypes.ROPE);
        
        //Sucursal 1
        branch1.addInstruments(instrument1);
        branch1.addInstruments(instrument2);
        branch1.addInstruments(instrument3);
        //Sucursal 2
        branch2.addInstruments(instrument2);
        branch2.addInstruments(instrument3);
        
//        branch1.listInstruments();
        
        //Agrego las sucursales a las fabricas
        factory.addBranch(branch1);
        factory.addBranch(branch2);
    }
}
