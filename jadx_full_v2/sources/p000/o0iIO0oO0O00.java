            package p000;

            import android.content.Context;
            import java.io.IOException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.regex.Pattern;
            
            public final class o0iIO0oO0O00 {
                public static final Pattern I0000oI00 = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
                public Context I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public o0l101oi1li1 I0000O;

                public final HttpURLConnection I00000oIO() throws o0iolOlII11I {
                    try {
/* 31 */                return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.I0000Il00O + "/namespaces/firebase:fetch").openConnection();
                    } catch (IOException e) {
/* 55 */                throw new o0iolOlII11I(e.getMessage());
                    }
                }
            }
