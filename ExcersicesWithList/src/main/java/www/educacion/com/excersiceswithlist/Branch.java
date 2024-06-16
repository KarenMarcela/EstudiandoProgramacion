
//SUCURSAL

package www.educacion.com.excersiceswithlist;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Instrument> salesBranch = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
        this.salesBranch = new ArrayList<>();
    }
    
    //Getter para mostrar el nombre de la sucursal

    public String getName() {
        return name;
    }
    
    
    //El metodo lo hice en el metodo branch porque la lista la tengo aqui privada 
    public void listInstruments(){ //Me va a mostrar cada instrumento que se encuentra en el arraylist
        for(Instrument inst : salesBranch){
            System.out.println(inst);
        }
    }
    
    //metodo para agregar instrumentos
    public void addInstruments(Instrument instrument){
       this.salesBranch.add(instrument);
    }
    
    //Metodo para que devuelva una lista de instrumentos cuyo tipo coincida con uno ingresado por parametro
    public ArrayList<Instrument> intrumentByType(InstrumentTypes instrumentTypes){
        ArrayList<Instrument> foundInstrument = new ArrayList<>();
        for(Instrument instrument : salesBranch){
            if(instrument.getInstrumentTypes() == instrumentTypes){
                foundInstrument.add(instrument);
            }
        }
        
        return foundInstrument;
    }
    
    
    
}
