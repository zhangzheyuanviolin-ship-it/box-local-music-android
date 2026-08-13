            package p000;

            import android.content.Intent;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class Il0O0O0I extends iOOOol01O0 {
                public Il0IolOI1 I00000oIO;
                public String I00000oOI;

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Intent I00000oOI() throws JSONException {
/* 3 */             Intent intent = new Intent();
/* 8 */             JSONObject jSONObject = new JSONObject();
/* 19 */            l0IlIoi1oIoO.I000OOo1O(jSONObject, "request", this.I00000oIO.I0000Il00O());
/* 26 */            l0IlIoi1oIoO.I000iOII(jSONObject, "state", this.I00000oOI);
/* 35 */            intent.putExtra("net.openid.appauth.EndSessionResponse", jSONObject.toString());
/* 113 */           return intent;
                }
            }
