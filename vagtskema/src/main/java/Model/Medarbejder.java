package Model;

import java.util.Date;

public class Medarbejder {

   Tidsobjekt tidsObjekt;
   Integer points = 0;

    public Medarbejder(Tidsobjekt tidsObjekt, Integer points) {
        this.tidsObjekt = tidsObjekt;
        this.points = points;
    }

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
