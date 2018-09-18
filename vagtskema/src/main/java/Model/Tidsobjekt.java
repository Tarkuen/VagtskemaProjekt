package Model;

import java.util.Date;

public class Tidsobjekt {

    Date startTid;
    Date slutTid;

    public Tidsobjekt(Date startTid, Date slutTid) {
        this.startTid = startTid;
        this.slutTid = slutTid;
    }

    public Date getStartTid() {
        return startTid;
    }

    public void setStartTid(Date startTid) {
        this.startTid = startTid;
    }

    public Date getSlutTid() {
        return slutTid;
    }

    public void setSlutTid(Date slutTid) {
        this.slutTid = slutTid;
    }
}
