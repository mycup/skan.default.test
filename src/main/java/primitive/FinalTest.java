package primitive;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-06-04
 */
public class FinalTest {



}

class User {

    final String URL;


    User(String url) {
        URL = url;
    }

    public String getURL() {
        return URL;
    }
}

// ?asdassadsadsd
class User2 {

    final String URL;

    {
        URL = "";
    }

    public String getURL() {
        return URL;
    }
}

