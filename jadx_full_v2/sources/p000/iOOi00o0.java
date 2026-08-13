            package p000;

            import android.net.Uri;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public abstract class iOOi00o0 {
                public static I1iOolOO0o I00000oIO(String str, String str2) throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject(str);
/* 12 */            if ("authorization".equals(str2)) {
/* 14 */                return I1ii0iiiloi.I0000Il00O(jSONObject);
                    }
/* 25 */            if (!"end_session".equals(str2)) {
/* 90 */                I000II.I000iOII("No AuthorizationManagementRequest found matching to this json schema");
/* 93 */                return null;
                    }
/* 35 */            I1ii1o0 i1ii1o0I00II0Ol1O0l = I1ii1o0.I00II0Ol1O0l(jSONObject.getJSONObject("configuration"));
/* 41 */            String strI0000Il00O = l0IlIoi1oIoO.I0000Il00O(jSONObject, "id_token_hint");
/* 47 */            Uri uriI0001Ioi1lo = l0IlIoi1oIoO.I0001Ioi1lo(jSONObject, "post_logout_redirect_uri");
/* 53 */            String strI0000Il00O2 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "state");
/* 59 */            String strI0000Il00O3 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "ui_locales");
/* 65 */            LinkedHashMap linkedHashMapI0000O = l0IlIoi1oIoO.I0000O(jSONObject, "additionalParameters");
/* 69 */            Il0IolOI1 il0IolOI1 = new Il0IolOI1();
/* 72 */            il0IolOI1.I00000oIO = i1ii1o0I00II0Ol1O0l;
/* 74 */            il0IolOI1.I00000oOI = strI0000Il00O;
/* 76 */            il0IolOI1.I0000Il00O = uriI0001Ioi1lo;
/* 78 */            il0IolOI1.I0000O = strI0000Il00O2;
/* 80 */            il0IolOI1.I0000oI00 = strI0000Il00O3;
/* 82 */            il0IolOI1.I0001Ioi1lo = linkedHashMapI0000O;
/* 84 */            VarHandle.storeStoreFence();
/* 87 */            return il0IolOI1;
                }
            }
