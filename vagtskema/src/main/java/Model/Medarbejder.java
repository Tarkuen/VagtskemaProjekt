package Model;

import java.util.Date;

public class Medarbejder {

   Tidsobjekt tidsObjekt;

    public Medarbejder(Tidsobjekt tidsObjekt) {
        this.tidsObjekt = tidsObjekt;
    }

    public Tidsobjekt getTidsObjekt() {
        return tidsObjekt;
    }

    public void setTidsObjekt(Tidsobjekt tidsObjekt) {
        this.tidsObjekt = tidsObjekt;
    }
}
