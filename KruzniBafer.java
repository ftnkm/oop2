public class KruzniBafer {
    private Object[] bafer;
    private int readPokazivac = 0;    
    private int writePokazivac = 0;

    public KruzniBafer(int velicina){
        bafer = new Object[velicina];
    }

    public boolean ubaci(Object o){
        if(bafer[writePokazivac] != null)
            return false;
        bafer[writePokazivac] = o;
        writePokazivac = sledeci(writePokazivac);
        return true;
    }

    public Object uzmi(){
        Object o = bafer[readPokazivac];
        if(o != null){
            bafer[readPokazivac] = null;
            readPokazivac = sledeci(readPokazivac);
        }
        return o;
    }

    private int sledeci(int indeks){
        return (indeks + 1) % bafer.length;
    }
}
