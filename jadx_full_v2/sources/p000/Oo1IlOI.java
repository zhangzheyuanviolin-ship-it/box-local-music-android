            package p000;

            import android.net.Uri;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.Set;
            
            public final class Oo1IlOI {
                public static final Set I000OOo1O = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));
                public I1ii1o0 I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public String I0000O;
                public Uri I0000oI00;
                public String I0001Ioi1lo;
                public String I000II;
                public Map I000O01llI0;

                public final HashMap I00000oIO() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("grant_type", this.I0000O);
/* 13 */            Uri uri = this.I0000oI00;
/* 15 */            if (uri != null) {
/* 23 */                map.put("redirect_uri", uri.toString());
                    }
/* 26 */            String str = this.I0001Ioi1lo;
/* 28 */            if (str != null) {
/* 36 */                map.put("code", str.toString());
                    }
/* 39 */            String str2 = this.I000II;
/* 41 */            if (str2 != null) {
/* 49 */                map.put("code_verifier", str2.toString());
                    }
/* 66 */            for (Map.Entry entry : this.I000O01llI0.entrySet()) {
/* 86 */                map.put((String) entry.getKey(), (String) entry.getValue());
                    }
/* 113 */           return map;
                }
            }
