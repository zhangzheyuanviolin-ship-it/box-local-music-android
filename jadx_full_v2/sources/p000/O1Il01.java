            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class O1Il01 implements IIlI0I1li {
                public long I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public O1Il01(Object obj, long j, Object obj2) {
/* 1 */             this.I00iiI = obj;
/* 3 */             this.I00iiO = obj2;
/* 5 */             this.I00iOIl = j;
                }

                public static String I000II(long j, String str, String str2) throws JSONException {
                    try {
/* 3 */                 JSONObject jSONObject = new JSONObject();
/* 8 */                 jSONObject.put("token", str);
/* 13 */                jSONObject.put("appVersion", str2);
/* 18 */                jSONObject.put("timestamp", j);
/* 21 */                return jSONObject.toString();
                    } catch (JSONException e) {
/* 43 */                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
/* 46 */                return null;
                    }
                }

                public static O1Il01 I000O01llI0(String str) throws JSONException {
/* 5 */             Object obj = null;
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 15 */            if (!str.startsWith("{")) {
/* 71 */                return new O1Il01(str, 0L, obj);
                    }
                    try {
/* 19 */                JSONObject jSONObject = new JSONObject(str);
/* 42 */                return new O1Il01(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
                    } catch (JSONException e) {
/* 63 */                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
/* 5 */                 return null;
                    }
                }

                @Override
                public Olo0o1II0 I00000oOI() {
/* 3 */             return (Olo0o1II0) this.I00iiO;
                }

                public void I0000Il00O(long j, long j2) {
/* 14 */            ((OooIlilo) this.I00iiI).I00000oIO(Float.intBitsToFloat((int) (j2 >> 32)), j);
/* 32 */            ((OooIlilo) this.I00iiO).I00000oIO(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                }

                @Override
                public int I0000O() {
/* 3 */             IIlI0I1li iIlI0I1li = (IIlI0I1li) this.I00iiI;
/* 5 */             if (iIlI0I1li != null) {
/* 7 */                 return iIlI0I1li.I0000O();
                    }
/* 12 */            return 1;
                }

                @Override
                public long I0000oI00() {
/* 3 */             IIlI0I1li iIlI0I1li = (IIlI0I1li) this.I00iiI;
/* 5 */             if (iIlI0I1li != null) {
/* 7 */                 return iIlI0I1li.I0000oI00();
                    }
/* 12 */            long j = this.I00iOIl;
/* 18 */            if (j != -1) {
/* 20 */                return j;
                    }
/* 23 */            I000II.I001IO000("No timestamp is available.");
/* 26 */            return 0L;
                }

                @Override
                public IIl1oi I0001Ioi1lo() {
/* 3 */             IIlI0I1li iIlI0I1li = (IIlI0I1li) this.I00iiI;
                    return iIlI0I1li != null ? iIlI0I1li.I0001Ioi1lo() : IIl1oi.I00iOIl;
                }

                @Override
                public IIl1lO0O I000OOo1O() {
/* 3 */             IIlI0I1li iIlI0I1li = (IIlI0I1li) this.I00iiI;
                    return iIlI0I1li != null ? iIlI0I1li.I000OOo1O() : IIl1lO0O.I00iOIl;
                }

                @Override
                public IIl1lO0oO I000OiO() {
/* 3 */             IIlI0I1li iIlI0I1li = (IIlI0I1li) this.I00iiI;
                    return iIlI0I1li != null ? iIlI0I1li.I000OiO() : IIl1lO0oO.I00iOIl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
                public List I000iOII() {
                    ArrayList arrayList;
/* 5 */             iOl1lOo1IO iol1loo1io = (iOl1lOo1IO) this.I00iiO;
/* 9 */             l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io.I00iOIl;
/* 13 */            ArrayList arrayList2 = new ArrayList();
/* 18 */            String str = (String) this.I00iiI;
/* 34 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 63 */                    cursorQuery = iol1loo1io.I01Io11IiiiO().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.I00iOIl)}, null, null, "rowid", "1000");
/* 71 */                    if (cursorQuery.moveToFirst()) {
/* 211 */                       do {
/* 74 */                            long j = cursorQuery.getLong(0);
/* 79 */                            long j2 = cursorQuery.getLong(3);
/* 93 */                            boolean z = cursorQuery.getLong(5) == 1;
/* 97 */                            long j3 = cursorQuery.getLong(6);
/* 102 */                           byte[] blob = cursorQuery.getBlob(4);
/* 110 */                           if (j > this.I00iOIl) {
/* 112 */                               this.I00iOIl = j;
                                    }
                                    try {
/* 122 */                               l0l0O000 l0l0o000 = (l0l0O000) lio010i.I01IlIoOI(l0l1iIIOl.I00IlilI0i0i(), blob);
/* 124 */                               String string = cursorQuery.getString(1);
/* 128 */                               if (string == null) {
/* 130 */                                   string = "";
                                        }
/* 132 */                               l0l0o000.I000oI1ioi(string);
/* 136 */                               long j4 = cursorQuery.getLong(2);
/* 140 */                               l0l0o000.I0000Il00O();
/* 147 */                               ((l0l1iIIOl) l0l0o000.I00iiI).I00O0i0ii(j4);
/* 150 */                               l0l0o000.I0000Il00O();
/* 157 */                               ((l0l1iIIOl) l0l0o000.I00iiI).I00111O(j3);
/* 166 */                               l0l1iIIOl l0l1iiiol = (l0l1iIIOl) l0l0o000.I0000oI00();
/* 168 */                               iOOiOo0iiOl iooioo0iiol = new iOOiOo0iiOl();
/* 171 */                               iooioo0iiol.I00000oIO = j;
/* 173 */                               iooioo0iiol.I00000oOI = j2;
/* 175 */                               iooioo0iiol.I0000Il00O = z;
/* 177 */                               iooioo0iiol.I0000O = l0l1iiiol;
/* 179 */                               VarHandle.storeStoreFence();
/* 182 */                               arrayList2.add(iooioo0iiol);
                                    } catch (IOException e) {
/* 191 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 193 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 204 */                               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Data loss. Failed to merge raw event. appId", e);
                                    }
/* 211 */                       } while (cursorQuery.moveToNext());
                            } else {
/* 214 */                       arrayList = Collections.EMPTY_LIST;
                            }
                        } finally {
/* 239 */                   if (0 != 0) {
/* 241 */                       cursorQuery.close();
                            }
                        }
                    } catch (SQLiteException e2) {
/* 217 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 219 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 230 */               l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Data loss. Error querying raw events batch. appId", e2);
                        arrayList = arrayList2;
                    }
/* 238 */           return arrayList;
                }
            }
