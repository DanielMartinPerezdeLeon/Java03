
package p03;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author damar
 */
public class Cuenta {
    private int numero; //numero de la cuenta(No indica orden)
    private int saldo;
    private GregorianCalendar fecha;
    private String propietario;
    
    
    public Cuenta(){
        this.numero=0;
        this.saldo=0;
        this.fecha=new GregorianCalendar(); //Coge la fecha del sistema
        this.propietario=null;
    }
    
    public Cuenta(int n, int sal, String prop){ //Llama a la anterior y lo sobreescribe
        this();
        numero=n;
        saldo=sal;
        propietario=prop;
    }
    
    public Cuenta(int n, int sal, GregorianCalendar fec, String prop){  //IDEM pero con la fecha incluida
        this(n, sal, prop);
        fecha=fec;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getFecha() {  //reformatea gregoriancalendar
        SimpleDateFormat fechaejemplo= new SimpleDateFormat("dd-MMM-yyyy");
        String fechaformateada = fechaejemplo.format(this.fecha.getTime());
       
        return fechaformateada.toString();
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
}
