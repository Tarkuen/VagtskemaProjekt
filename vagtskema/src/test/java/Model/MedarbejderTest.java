package Model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MedarbejderTest {



    @Test
    public void checkDates(){
//        Assert.assertEquals(m.tidsObjekt, v.tidsrumObjekt);
//        Boolean check = m.tidsObjekt.before(v1.tidsrumObjekt);
//        Assert.assertEquals(true, check);
//        check = m.tidsObjekt.after(v1.tidsrumObjekt);
//        Assert.assertEquals(false, check);

        Vagt v = new Vagt(new Tidsobjekt(new Date(2018,10,18, 9,0 ), new Date(2018,10,18,15,0)));
        Medarbejder m = new Medarbejder(new Tidsobjekt(new Date(2018,10,18, 15,0 ), new Date(2018,10,18,18,0)));

        compareDates(v, m);

    }


    public void compareDates(Vagt v, Medarbejder m){
        int check = 0;
//        Forslået Vagt
        Date a1 = v.tidsrumObjekt.startTid;
        Date a2 = v.tidsrumObjekt.slutTid;

//        Medarbejder vagt
        Date b1 = m.tidsObjekt.startTid;
        Date b2 = m.tidsObjekt.slutTid;

//        A1 > B2
//        a1.after(b2);
//
//        A1 = B2
//
//         if(check == a1.compareTo(b2)){ }
//
//         A2 < B1
//        a2.before(b1);
//
//         A2 = B1
//         if(check == a2.compareTo(b1)){ }

         if(a1.after(b2) || check==a1.compareTo(b2)){
             System.out.println("Eligible");
         }
         else if(a2.before(b1) || check==a2.compareTo(b1)){
             System.out.println("Eligible");
         }

         else{
             System.out.println("Not eligible");
         }


    }
}