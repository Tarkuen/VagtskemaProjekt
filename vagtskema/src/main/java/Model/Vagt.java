package Model;

import java.util.Date;

public class Vagt {

    Tidsobjekt tidsrumObjekt;

    public Vagt(Tidsobjekt tidsrumObjekt) {
        this.tidsrumObjekt = tidsrumObjekt;
    }

    public Tidsobjekt getTidsrumObjekt() {
        return tidsrumObjekt;
    }

    public void setTidsrumObjekt(Tidsobjekt tidsrumObjekt) {
        this.tidsrumObjekt = tidsrumObjekt;
    }
}
