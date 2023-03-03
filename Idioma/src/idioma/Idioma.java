
package idioma;

import java.util.Locale;


public class Idioma {
    
    public static void main(String[] args) {
        
        Locale loc;
        loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("Seu sistema esta em" + idioma);
    }

}
