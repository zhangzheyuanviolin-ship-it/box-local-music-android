            package p000;

            import android.net.Uri;
            import java.util.LinkedHashMap;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class Il0IolOI1 implements I1iOolOO0o {
                public I1ii1o0 I00000oIO;
                public String I00000oOI;
                public Uri I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public LinkedHashMap I0001Ioi1lo;

                static {
/* 13 */            iOIOlii1.I00000oIO("id_token_hint", "post_logout_redirect_uri", "state", "ui_locales");
                }

                @Override
                public final String I00000oIO() {
/* 5 */             return I0000Il00O().toString();
                }

                @Override
                public final String I00000oOI() {
/* 1 */             return this.I0000O;
                }

                public final JSONObject I0000Il00O() throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 14 */            l0IlIoi1oIoO.I000OOo1O(jSONObject, "configuration", this.I00000oIO.I00IoO0());
/* 21 */            l0IlIoi1oIoO.I000iOII(jSONObject, "id_token_hint", this.I00000oOI);
/* 28 */            l0IlIoi1oIoO.I000OiO(jSONObject, "post_logout_redirect_uri", this.I0000Il00O);
/* 35 */            l0IlIoi1oIoO.I000iOII(jSONObject, "state", this.I0000O);
/* 42 */            l0IlIoi1oIoO.I000iOII(jSONObject, "ui_locales", this.I0000oI00);
/* 53 */            l0IlIoi1oIoO.I000OOo1O(jSONObject, "additionalParameters", l0IlIoi1oIoO.I000II(this.I0001Ioi1lo));
/* 113 */           return jSONObject;
                }
            }
