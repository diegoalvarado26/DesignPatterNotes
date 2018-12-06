package Strategy;

public class DNI {
    //Este design pattern es útil cuando quiero:
    //Definir una clase que va a tener un comportamiento similar a otra en una clase.
    //Tomaré el ejemplo de gente con DNI mayor y menor de edad.

    private int numeroDNI;
    private String apellido;
    private String nombre;
    private MayorDeEdad mayorDeEdad;

    //Estamos "desacoplando" el concepto que varía, que es el de mayor
    //de edad.

    //La composición te permite cambiar el comportamiento
    //de objetos en Runtime: el cambio dinámico es bueno.

    public DNI(int numeroDNI, String apellido, String nombre){
        this.numeroDNI = numeroDNI;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroDNI() {
        return numeroDNI;
    }
    public boolean esMayorDeEdad(){
        return mayorDeEdad.esMayorDeEdad();
        //Va a devolver un boolean (como fue definido en la interface).
    }

    public void setMayoriaDeEdad(MayorDeEdad mE){
        this.mayorDeEdad = mE;
    }
}
