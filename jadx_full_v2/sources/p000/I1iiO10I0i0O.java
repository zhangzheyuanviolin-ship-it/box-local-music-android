            package p000;

            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class I1iiO10I0i0O {
                public static final O01oIIIIO I00000oOI = new O01oIIIIO("issuer", null, 0);
                public static final O01oIIIIO I0000Il00O = new O01oIIIIO("authorization_endpoint", null, 1);
                public static final O01oIIIIO I0000O = new O01oIIIIO("token_endpoint", null, 1);
                public static final O01oIIIIO I0000oI00 = new O01oIIIIO("end_session_endpoint", null, 1);
                public static final O01oIIIIO I0001Ioi1lo = new O01oIIIIO("registration_endpoint", null, 1);
                public static final List I000II;
                public final JSONObject I00000oIO;

                static {
/* 58 */            Arrays.asList("authorization_code", "implicit");
/* 63 */            Collections.singletonList("client_secret_basic");
/* 68 */            Collections.singletonList("normal");
/* 87 */            I000II = Arrays.asList("issuer", "authorization_endpoint", "jwks_uri", "response_types_supported", "subject_types_supported", "id_token_signing_alg_values_supported");
                }

                public I1iiO10I0i0O(JSONObject jSONObject) throws I1iiIIoo {
/* 4 */             jSONObject.getClass();
/* 7 */             this.I00000oIO = jSONObject;
/* 19 */            for (String str : I000II) {
/* 33 */                if (!this.I00000oIO.has(str) || this.I00000oIO.get(str) == null) {
/* 52 */                    I1iiIIoo i1iiIIoo = new I1iiIIoo(IIl001iO0Io.I000o00OoI0I("Missing mandatory configuration field: ", str));
/* 55 */                    i1iiIIoo.I00iOIl = str;
/* 57 */                    throw i1iiIIoo;
                        }
                    }
                }

                public final Object I00000oIO(I01loIooI i01loIooI) {
/* 1 */             JSONObject jSONObject = this.I00000oIO;
                    try {
                        return !jSONObject.has((String) i01loIooI.I00000oIO) ? i01loIooI.I00000oOI : i01loIooI.I000II(jSONObject.getString((String) i01loIooI.I00000oIO));
                    } catch (JSONException e) {
/* 32 */                IoOOl0iOl1io.I000l1("unexpected JSONException", e);
/* 35 */                return null;
                    }
                }
            }
