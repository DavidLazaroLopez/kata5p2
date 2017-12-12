package pa04.view;

import java.util.List;
import pa04.model.Histogram;
import pa04.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain());
        }
        return histo;
    }    
}
