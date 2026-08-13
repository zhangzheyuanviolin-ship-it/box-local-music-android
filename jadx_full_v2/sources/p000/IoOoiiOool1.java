            package p000;

            import android.net.Uri;
            import android.text.TextUtils;
            import android.util.Base64;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Set;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class IoOoiiOool1 {
                public static final Set I000II = iOIOlii1.I00000oIO("iss", "sub", "aud", "exp", "iat", "nonce", "azp");
                public String I00000oIO;
                public ArrayList I00000oOI;
                public Long I0000Il00O;
                public Long I0000O;
                public String I0000oI00;
                public String I0001Ioi1lo;

                public static IoOoiiOool1 I00000oIO(String str) throws JSONException, IoOoiOooo0 {
                    ArrayList arrayList;
/* 5 */             String[] strArrSplit = str.split("\\.");
/* 11 */            if (strArrSplit.length <= 1) {
/* 966 */               throw new IoOoiOooo0("ID token must have both header and claims section");
                    }
/* 29 */            new JSONObject(new String(Base64.decode(strArrSplit[0], 8)));
/* 45 */            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[1], 8)));
/* 50 */            String strI00000oOI = l0IlIoi1oIoO.I00000oOI(jSONObject, "iss");
/* 56 */            l0IlIoi1oIoO.I00000oOI(jSONObject, "sub");
                    try {
                    } catch (JSONException unused) {
/* 109 */               arrayList = new ArrayList();
/* 116 */               arrayList.add(l0IlIoi1oIoO.I00000oOI(jSONObject, "aud"));
                    }
/* 63 */            if (!jSONObject.has("aud")) {
/* 106 */               throw new JSONException("field \"aud\" not found in json object");
                    }
/* 65 */            JSONArray jSONArray = jSONObject.getJSONArray("aud");
/* 71 */            arrayList = new ArrayList();
/* 74 */            if (jSONArray != null) {
/* 80 */                for (int i = 0; i < jSONArray.length(); i++) {
/* 82 */                    Object obj = jSONArray.get(i);
/* 86 */                    obj.getClass();
/* 93 */                    arrayList.add(obj.toString());
                        }
                    }
/* 125 */           Long lValueOf = Long.valueOf(jSONObject.getLong("exp"));
/* 135 */           Long lValueOf2 = Long.valueOf(jSONObject.getLong("iat"));
/* 141 */           String strI0000Il00O = l0IlIoi1oIoO.I0000Il00O(jSONObject, "nonce");
/* 147 */           String strI0000Il00O2 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "azp");
/* 153 */           Iterator it = I000II.iterator();
/* 161 */           while (it.hasNext()) {
/* 169 */               jSONObject.remove((String) it.next());
                    }
/* 173 */           l0IlIoi1oIoO.I000lI(jSONObject);
/* 178 */           IoOoiiOool1 ioOoiiOool1 = new IoOoiiOool1();
/* 181 */           ioOoiiOool1.I00000oIO = strI00000oOI;
/* 183 */           ioOoiiOool1.I00000oOI = arrayList;
/* 185 */           ioOoiiOool1.I0000Il00O = lValueOf;
/* 187 */           ioOoiiOool1.I0000O = lValueOf2;
/* 189 */           ioOoiiOool1.I0000oI00 = strI0000Il00O;
/* 191 */           ioOoiiOool1.I0001Ioi1lo = strI0000Il00O2;
/* 193 */           VarHandle.storeStoreFence();
/* 196 */           return ioOoiiOool1;
                }

                public final void I00000oOI(Oo1IlOI oo1IlOI, i1O01oOIoI0I i1o01ooioi0i, boolean z) throws I1iOo1IoI1 {
/* 1 */             String str = this.I00000oIO;
/* 7 */             I1iiO10I0i0O i1iiO10I0i0O = (I1iiO10I0i0O) oo1IlOI.I00000oIO.I00ilO0;
/* 9 */             if (i1iiO10I0i0O != null) {
/* 23 */                if (!str.equals((String) i1iiO10I0i0O.I00000oIO(I1iiO10I0i0O.I00000oOI))) {
/* 126 */                   throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Issuer mismatch"));
                        }
/* 25 */                Uri uri = Uri.parse(str);
/* 29 */                if (!z && !uri.getScheme().equals("https")) {
/* 57 */                    throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Issuer must be an https URL"));
                        }
/* 66 */                if (TextUtils.isEmpty(uri.getHost())) {
/* 112 */                   throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Issuer host can not be empty"));
                        }
/* 72 */                if (uri.getFragment() != null || uri.getQueryParameterNames().size() > 0) {
/* 98 */                    throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Issuer URL should not containt query parameters or fragment components"));
                        }
                    }
/* 127 */           String str2 = oo1IlOI.I0000Il00O;
/* 135 */           if (!this.I00000oOI.contains(str2) && !str2.equals(this.I0001Ioi1lo)) {
/* 159 */               throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Audience mismatch"));
                    }
/* 160 */           i1o01ooioi0i.getClass();
/* 169 */           long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
/* 178 */           if (jCurrentTimeMillis > this.I0000Il00O.longValue()) {
/* 2160 */              throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("ID Token expired"));
                    }
/* 195 */           if (Math.abs(jCurrentTimeMillis - this.I0000O.longValue()) > 600) {
/* 246 */               throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Issued at time is more than 10 minutes before or after the current time"));
                    }
/* 205 */           if ("authorization_code".equals(oo1IlOI.I0000O)) {
/* 215 */               if (!TextUtils.equals(this.I0000oI00, oo1IlOI.I00000oOI)) {
/* 231 */                   throw I1iOo1IoI1.I0000O(I1iOll.I0001Ioi1lo, new IoOoiOooo0("Nonce mismatch"));
                        }
                    }
                }
            }
