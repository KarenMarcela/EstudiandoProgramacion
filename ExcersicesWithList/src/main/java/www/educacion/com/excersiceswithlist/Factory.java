
package www.educacion.com.excersiceswithlist;

import java.util.ArrayList;

public class Factory {
    private ArrayList<Branch> branchList = new ArrayList<>();

    public Factory() {
        this.branchList = new ArrayList<>();
    }
    
    //Metodo para listar los instrumentos de la clase fabrica
    public void listInstruments(){
        for(Branch branch : branchList){
            System.out.println(branch.getName());
            branch.listInstruments();
        }
    }
    
    //Metodo para agregar sucursales
    public void addBranch(Branch branch){
        this.branchList.add(branch);
    }
    
    //Metodo para que devuelva una lista de instrumentos cuyo tipo coincida con uno ingresado por parametro
    public ArrayList<Instrument> instrumentByType(InstrumentTypes types){
        ArrayList<Instrument> foundInstrument = new ArrayList<>() ;
        
        for(Branch branch : branchList){
            foundInstrument.addAll(branch.intrumentByType(types)); //addAll es para que reuna todos los intrumentos asi sean de sucursales distintas
            
        }
        
        return foundInstrument;
    }
    
    
    
}
