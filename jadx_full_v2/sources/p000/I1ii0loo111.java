            package p000;

            import android.content.Intent;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.Set;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class I1ii0loo111 extends iOOOol01O0 {
                public static final Set I000OiO = Collections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));
                public final I1ii0iiiloi I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final String I0000oI00;
                public final Long I0001Ioi1lo;
                public final String I000II;
                public final String I000O01llI0;
                public final Map I000OOo1O;

                public I1ii0loo111(I1ii0iiiloi i1ii0iiiloi, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map map) {
/* 4 */             this.I00000oIO = i1ii0iiiloi;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I0000Il00O = str2;
/* 10 */            this.I0000O = str3;
/* 12 */            this.I0000oI00 = str4;
/* 14 */            this.I0001Ioi1lo = l;
/* 16 */            this.I000II = str5;
/* 18 */            this.I000O01llI0 = str6;
/* 20 */            this.I000OOo1O = map;
                }

                public static I1ii0loo111 I0000Il00O(String str) {
/* 3 */             JSONObject jSONObject = new JSONObject(str);
/* 12 */            if (jSONObject.has("request")) {
/* 70 */                return new I1ii0loo111(I1ii0iiiloi.I0000Il00O(jSONObject.getJSONObject("request")), l0IlIoi1oIoO.I0000Il00O(jSONObject, "state"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "token_type"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "code"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "access_token"), l0IlIoi1oIoO.I00000oIO(jSONObject), l0IlIoi1oIoO.I0000Il00O(jSONObject, "id_token"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "scope"), l0IlIoi1oIoO.I0000O(jSONObject, "additional_parameters"));
                    }
/* 76 */            I000II.I000iOII("authorization request not provided and not found in JSON");
/* 79 */            return null;
                }

                @Override
                public final String I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Intent I00000oOI() throws JSONException {
/* 3 */             Intent intent = new Intent();
/* 8 */             JSONObject jSONObject = new JSONObject();
/* 19 */            l0IlIoi1oIoO.I000OOo1O(jSONObject, "request", this.I00000oIO.I0000O());
/* 26 */            l0IlIoi1oIoO.I000iOII(jSONObject, "state", this.I00000oOI);
/* 33 */            l0IlIoi1oIoO.I000iOII(jSONObject, "token_type", this.I0000Il00O);
/* 40 */            l0IlIoi1oIoO.I000iOII(jSONObject, "code", this.I0000O);
/* 47 */            l0IlIoi1oIoO.I000iOII(jSONObject, "access_token", this.I0000oI00);
/* 52 */            Long l = this.I0001Ioi1lo;
/* 54 */            if (l == null) {
/* 64 */                l0IlIoi1oIoO.I000iOII(jSONObject, "id_token", this.I000II);
/* 71 */                l0IlIoi1oIoO.I000iOII(jSONObject, "scope", this.I000O01llI0);
/* 82 */                l0IlIoi1oIoO.I000OOo1O(jSONObject, "additional_parameters", l0IlIoi1oIoO.I000II(this.I000OOo1O));
                    } else {
                        try {
/* 57 */                    jSONObject.put("expires_at", l);
/* 64 */                    l0IlIoi1oIoO.I000iOII(jSONObject, "id_token", this.I000II);
/* 71 */                    l0IlIoi1oIoO.I000iOII(jSONObject, "scope", this.I000O01llI0);
/* 82 */                    l0IlIoi1oIoO.I000OOo1O(jSONObject, "additional_parameters", l0IlIoi1oIoO.I000II(this.I000OOo1O));
                        } catch (JSONException e) {
/* 89 */                    IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
/* 92 */                    jSONObject = null;
                        }
                    }
/* 99 */            intent.putExtra("net.openid.appauth.AuthorizationResponse", jSONObject.toString());
/* 113 */           return intent;
                }
            }
