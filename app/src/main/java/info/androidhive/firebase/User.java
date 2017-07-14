package info.androidhive.firebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Ravi Tamada on 07/10/16.
 * www.androidhive.info
 */

@IgnoreExtraProperties
public class User {

    public String header;
    public String footer;
    public String middle;
    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String header, String footer,String middle) {
        this.header = header;
        this.footer = footer;
        this.middle = middle;
    }
}
