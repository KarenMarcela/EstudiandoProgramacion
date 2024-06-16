
package www.educacion.com.excersiceswithlist;

public class Instrument {
    private String ID;
    private double price;
    private InstrumentTypes instrumentTypes;

    public Instrument(String ID, double price, InstrumentTypes instrumentTypes) {
        this.ID = ID;
        this.price = price;
        this.instrumentTypes = instrumentTypes;
    }

    public InstrumentTypes getInstrumentTypes() {
        return instrumentTypes;
    }
    
    

    @Override
    public String toString() {
        return "Instrument{" + "ID=" + ID + ", price=" + price + ", instrumentTypes=" + instrumentTypes + '}';
    }
    
    
    
}
