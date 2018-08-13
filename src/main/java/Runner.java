import db.DBGuitarist;
import models.Guitarist;

import java.util.List;

public class Runner {

    public  static void main(String[] args) {
        Guitarist guitarist1 = new Guitarist("Emil", "Vaklinov", 32);
        DBGuitarist.save(guitarist1);
        Guitarist guitarist2 = new Guitarist("Rubby", "Mcmahon", 25);

        List<Guitarist> guitarists = DBGuitarist.getAll();

    }

}
