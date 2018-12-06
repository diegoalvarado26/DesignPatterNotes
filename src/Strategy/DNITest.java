package Strategy;

import static org.junit.jupiter.api.Assertions.*;

class DNITest {

    DNI elDNI1 = new DNI(10793366, "Gutierrez", "Nancy");
    DNI elDNI2 = new DNI(71395434, "Alvarado", "Luciana");

    @org.junit.jupiter.api.Test
    void esMayorDeEdad() {
        //Este lo probamos con el DNI de Nancy.
        elDNI1.setMayoriaDeEdad(new siEsMayor());
        assertEquals(true, elDNI1.esMayorDeEdad());
    }

    @org.junit.jupiter.api.Test
    void setMayoriaDeEdad() {
        //Lo probamos con el de Luciana.
        elDNI2.setMayoriaDeEdad(new noEsMayor());
        assertEquals(false, elDNI2.esMayorDeEdad());
    }
}