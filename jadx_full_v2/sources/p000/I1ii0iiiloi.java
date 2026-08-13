            package p000;

            import android.net.Uri;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class I1ii0iiiloi implements I1iOolOO0o {
                public final I1ii1o0 I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;
                public final String I0000oI00;
                public final String I0001Ioi1lo;
                public final String I000II;
                public final Uri I000O01llI0;
                public final String I000OOo1O;
                public final String I000OiO;
                public final String I000iOII;
                public final String I000l1;
                public final String I000lI;
                public final String I000o00OoI0I;
                public final String I000oI1ioi;
                public final JSONObject I00100l0;
                public final String I00100o1O0lo;
                public final Map I0010I0i;

                static {
/* 33 */            iOIOlii1.I00000oIO("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", "redirect_uri", "response_mode", "response_type", "scope", "state", "claims", "claims_locales");
                }

                public I1ii0iiiloi(I1ii1o0 i1ii1o0, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map map) {
/* 4 */             this.I00000oIO = i1ii1o0;
/* 6 */             this.I00000oOI = str;
/* 8 */             this.I000II = str2;
/* 10 */            this.I000O01llI0 = uri;
/* 14 */            this.I0010I0i = map;
/* 16 */            this.I0000Il00O = str3;
/* 18 */            this.I0000O = str4;
/* 20 */            this.I0000oI00 = str5;
/* 22 */            this.I0001Ioi1lo = str6;
/* 24 */            this.I000OOo1O = str7;
/* 26 */            this.I000OiO = str8;
/* 28 */            this.I000iOII = str9;
/* 30 */            this.I000l1 = str10;
/* 32 */            this.I000lI = str11;
/* 34 */            this.I000o00OoI0I = str12;
/* 36 */            this.I000oI1ioi = str13;
/* 40 */            this.I00100l0 = jSONObject;
/* 44 */            this.I00100o1O0lo = str14;
                }

                public static I1ii0iiiloi I0000Il00O(JSONObject jSONObject) throws JSONException {
                    JSONObject jSONObjectOptJSONObject;
/* 5 */             lII1IoI.I0000Il00O("json cannot be null", jSONObject);
/* 16 */            I1ii1o0 i1ii1o0I00II0Ol1O0l = I1ii1o0.I00II0Ol1O0l(jSONObject.getJSONObject("configuration"));
/* 22 */            String strI00000oOI = l0IlIoi1oIoO.I00000oOI(jSONObject, "clientId");
/* 28 */            String strI00000oOI2 = l0IlIoi1oIoO.I00000oOI(jSONObject, "responseType");
/* 34 */            Uri uriI0000oI00 = l0IlIoi1oIoO.I0000oI00(jSONObject, "redirectUri");
/* 40 */            String strI0000Il00O = l0IlIoi1oIoO.I0000Il00O(jSONObject, "display");
/* 46 */            String strI0000Il00O2 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "login_hint");
/* 52 */            String strI0000Il00O3 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "prompt");
/* 58 */            String strI0000Il00O4 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "ui_locales");
/* 64 */            String strI0000Il00O5 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "scope");
/* 70 */            String strI0000Il00O6 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "state");
/* 76 */            String strI0000Il00O7 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "nonce");
/* 82 */            String strI0000Il00O8 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "codeVerifier");
/* 88 */            String strI0000Il00O9 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "codeVerifierChallenge");
/* 94 */            String strI0000Il00O10 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "codeVerifierChallengeMethod");
/* 100 */           String strI0000Il00O11 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "responseMode");
/* 110 */           if (jSONObject.has("claims")) {
/* 116 */               jSONObjectOptJSONObject = jSONObject.optJSONObject("claims");
/* 120 */               if (jSONObjectOptJSONObject == null) {
/* 168 */                   throw new JSONException("field \"claims\" is mapped to a null value");
                        }
                    } else {
/* 112 */               jSONObjectOptJSONObject = null;
                    }
/* 135 */           return new I1ii0iiiloi(i1ii1o0I00II0Ol1O0l, strI00000oOI, strI00000oOI2, uriI0000oI00, strI0000Il00O, strI0000Il00O2, strI0000Il00O3, strI0000Il00O4, strI0000Il00O5, strI0000Il00O6, strI0000Il00O7, strI0000Il00O8, strI0000Il00O9, strI0000Il00O10, strI0000Il00O11, jSONObjectOptJSONObject, l0IlIoi1oIoO.I0000Il00O(jSONObject, "claimsLocales"), l0IlIoi1oIoO.I0000O(jSONObject, "additionalParameters"));
                }

                @Override
                public final String I00000oIO() {
/* 5 */             return I0000O().toString();
                }

                @Override
                public final String I00000oOI() {
/* 1 */             return this.I000OiO;
                }

                public final JSONObject I0000O() throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 14 */            l0IlIoi1oIoO.I000OOo1O(jSONObject, "configuration", this.I00000oIO.I00IoO0());
/* 21 */            l0IlIoi1oIoO.I000O01llI0(jSONObject, "clientId", this.I00000oOI);
/* 28 */            l0IlIoi1oIoO.I000O01llI0(jSONObject, "responseType", this.I000II);
/* 39 */            l0IlIoi1oIoO.I000O01llI0(jSONObject, "redirectUri", this.I000O01llI0.toString());
/* 46 */            l0IlIoi1oIoO.I000iOII(jSONObject, "display", this.I0000Il00O);
/* 53 */            l0IlIoi1oIoO.I000iOII(jSONObject, "login_hint", this.I0000O);
/* 60 */            l0IlIoi1oIoO.I000iOII(jSONObject, "scope", this.I000OOo1O);
/* 67 */            l0IlIoi1oIoO.I000iOII(jSONObject, "prompt", this.I0000oI00);
/* 74 */            l0IlIoi1oIoO.I000iOII(jSONObject, "ui_locales", this.I0001Ioi1lo);
/* 81 */            l0IlIoi1oIoO.I000iOII(jSONObject, "state", this.I000OiO);
/* 88 */            l0IlIoi1oIoO.I000iOII(jSONObject, "nonce", this.I000iOII);
/* 95 */            l0IlIoi1oIoO.I000iOII(jSONObject, "codeVerifier", this.I000l1);
/* 102 */           l0IlIoi1oIoO.I000iOII(jSONObject, "codeVerifierChallenge", this.I000lI);
/* 109 */           l0IlIoi1oIoO.I000iOII(jSONObject, "codeVerifierChallengeMethod", this.I000o00OoI0I);
/* 116 */           l0IlIoi1oIoO.I000iOII(jSONObject, "responseMode", this.I000oI1ioi);
/* 121 */           JSONObject jSONObject2 = this.I00100l0;
/* 123 */           if (jSONObject2 != null) {
                        try {
/* 126 */                   jSONObject.put("claims", jSONObject2);
                        } catch (JSONException e) {
/* 151 */                   IoOOl0iOl1io.I000l1("JSONException thrown in violation of contract", e);
/* 154 */                   return null;
                        }
                    }
/* 133 */           l0IlIoi1oIoO.I000iOII(jSONObject, "claimsLocales", this.I00100o1O0lo);
/* 144 */           l0IlIoi1oIoO.I000OOo1O(jSONObject, "additionalParameters", l0IlIoi1oIoO.I000II(this.I0010I0i));
/* 147 */           return jSONObject;
                }
            }
