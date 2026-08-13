            package p000;

            import android.content.Intent;
            import android.net.Uri;
            import java.util.Collections;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class I1iOo1IoI1 extends Exception {
                public static final int I00ilO0 = 0;
                public final int I00iOIl;
                public final int I00iiI;
                public final String I00iiO;
                public final String I00iio;
                public final Uri I00ilI0I1;

                public I1iOo1IoI1(int i, int i2, String str, String str2, Uri uri, Throwable th) {
/* 1 */             super(str2, th);
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = str;
/* 10 */            this.I00iio = str2;
/* 12 */            this.I00ilI0I1 = uri;
                }

                public static I1iOo1IoI1 I00000oIO(int i, String str) {
/* 9 */             return new I1iOo1IoI1(1, i, str, null, null, null);
                }

                public static Map I00000oOI(I1iOo1IoI1... i1iOo1IoI1Arr) {
/* 4 */             I1Io0i0II i1Io0i0II = new I1Io0i0II(i1iOo1IoI1Arr.length);
/* 9 */             for (I1iOo1IoI1 i1iOo1IoI1 : i1iOo1IoI1Arr) {
/* 13 */                String str = i1iOo1IoI1.I00iiO;
/* 15 */                if (str != null) {
/* 17 */                    i1Io0i0II.put(str, i1iOo1IoI1);
                        }
                    }
/* 23 */            return Collections.unmodifiableMap(i1Io0i0II);
                }

                public static I1iOo1IoI1 I0000Il00O(String str) {
/* 3 */             lII1IoI.I00000oOI(str, "jsonStr cannot be null or empty");
/* 8 */             JSONObject jSONObject = new JSONObject(str);
/* 44 */            return new I1iOo1IoI1(jSONObject.getInt("type"), jSONObject.getInt("code"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "error"), l0IlIoi1oIoO.I0000Il00O(jSONObject, "errorDescription"), l0IlIoi1oIoO.I0001Ioi1lo(jSONObject, "errorUri"), null);
                }

                public static I1iOo1IoI1 I0000O(I1iOo1IoI1 i1iOo1IoI1, Exception exc) {
/* 14 */            return new I1iOo1IoI1(i1iOo1IoI1.I00iOIl, i1iOo1IoI1.I00iiI, i1iOo1IoI1.I00iiO, i1iOo1IoI1.I00iio, i1iOo1IoI1.I00ilI0I1, exc);
                }

                public static I1iOo1IoI1 I0000oI00(int i, String str) {
/* 9 */             return new I1iOo1IoI1(0, i, null, str, null, null);
                }

                public static I1iOo1IoI1 I000O01llI0(int i, String str) {
/* 9 */             return new I1iOo1IoI1(2, i, str, null, null, null);
                }

                public final Intent I0001Ioi1lo() {
/* 3 */             Intent intent = new Intent();
/* 12 */            intent.putExtra("net.openid.appauth.AuthorizationException", I000II());
/* 29 */            return intent;
                }

                public final String I000II() throws JSONException {
/* 5 */             JSONObject jSONObject = new JSONObject();
                    try {
/* 12 */                jSONObject.put("type", this.I00iOIl);
                        try {
/* 19 */                    jSONObject.put("code", this.I00iiI);
/* 26 */                    l0IlIoi1oIoO.I000iOII(jSONObject, "error", this.I00iiO);
/* 33 */                    l0IlIoi1oIoO.I000iOII(jSONObject, "errorDescription", this.I00iio);
/* 40 */                    l0IlIoi1oIoO.I000OiO(jSONObject, "errorUri", this.I00ilI0I1);
/* 43 */                    return jSONObject.toString();
                        } catch (JSONException unused) {
/* 48 */                    I000II.I001IO000("JSONException thrown in violation of contract, ex");
/* 51 */                    return null;
                        }
                    } catch (JSONException unused2) {
/* 53 */                I000II.I001IO000("JSONException thrown in violation of contract, ex");
/* 56 */                return null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && (obj instanceof I1iOo1IoI1)) {
/* 13 */                I1iOo1IoI1 i1iOo1IoI1 = (I1iOo1IoI1) obj;
/* 19 */                if (this.I00iOIl == i1iOo1IoI1.I00iOIl && this.I00iiI == i1iOo1IoI1.I00iiI) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return ((this.I00iOIl + 31) * 31) + this.I00iiI;
                }

                @Override
                public final String toString() {
/* 15 */            return "AuthorizationException: " + I000II();
                }
            }
