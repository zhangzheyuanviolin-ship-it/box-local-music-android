            package p000;

            import java.util.regex.Pattern;
            
            public abstract class IOOIiOIi0 {
                public static final Pattern I00000oIO = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

                public static void I00000oIO(String str) {
/* 16 */            lII1IoI.I00000oIO("codeVerifier length is shorter than allowed by the PKCE specification", 43 <= str.length());
/* 30 */            lII1IoI.I00000oIO("codeVerifier length is longer than allowed by the PKCE specification", str.length() <= 128);
/* 45 */            lII1IoI.I00000oIO("codeVerifier string contains illegal characters", I00000oIO.matcher(str).matches());
                }
            }
