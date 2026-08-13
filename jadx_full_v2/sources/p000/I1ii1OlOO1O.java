            package p000;

            import android.net.Uri;
            import android.os.AsyncTask;
            import android.text.TextUtils;
            import java.io.IOException;
            import java.io.OutputStreamWriter;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class I1ii1OlOO1O extends AsyncTask {
                public Oo1IlOI I00000oIO;
                public IOO0o0I1l I00000oOI;
                public Io1Oioii1111 I0000Il00O;
                public IiI0oIlol0 I0000O;
                public i1O01oOIoI0I I0000oI00;
                public boolean I0001Ioi1lo;
                public I1iOo1IoI1 I000II;

                public static void I00000oIO(HttpURLConnection httpURLConnection) {
/* 11 */            if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("Accept"))) {
/* 15 */                httpURLConnection.setRequestProperty("Accept", "application/json");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[PHI: r1
                  0x00cd: PHI (r1v6 Oo1IlOI) = (r1v18 Oo1IlOI), (r1v19 Oo1IlOI), (r1v20 Oo1IlOI) binds: [B:28:0x00b0, B:29:0x00b2, B:34:0x00ca] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[EXC_TOP_SPLITTER, PHI: r1
                  0x00b2: PHI (r1v5 ??) = (r1v21 ??), (r1v22 ??) binds: [B:28:0x00b0, B:34:0x00ca] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r10v12, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r10v13, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r10v17, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r1v21 */
                /* JADX WARN: Type inference failed for: r1v22 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.io.InputStream] */
                /* JADX WARN: Type inference failed for: r4v3 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object doInBackground(Object[] objArr) throws Throwable {
                    Oo1IlOI oo1IlOI;
                    Oo1IlOI oo1IlOI2;
                    ?? r1;
                    ?? errorStream;
/* 5 */             IOO0o0I1l iOO0o0I1l = this.I00000oOI;
/* 7 */             Oo1IlOI oo1IlOI3 = this.I00000oIO;
/* 11 */            ?? r4 = null;
                    try {
                        try {
/* 12 */                    Io1Oioii1111 io1Oioii1111 = this.I0000Il00O;
/* 18 */                    Uri uri = (Uri) oo1IlOI3.I00000oIO.I00iiO;
/* 20 */                    io1Oioii1111.getClass();
/* 23 */                    HttpURLConnection httpURLConnectionI000OiO = Io1Oioii1111.I000OiO(uri);
/* 29 */                    httpURLConnectionI000OiO.setRequestMethod("POST");
/* 36 */                    httpURLConnectionI000OiO.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
/* 39 */                    I00000oIO(httpURLConnectionI000OiO);
/* 43 */                    httpURLConnectionI000OiO.setDoOutput(true);
/* 46 */                    iOO0o0I1l.getClass();
/* 49 */                    HashMap mapI00000oIO = oo1IlOI3.I00000oIO();
/* 57 */                    Map mapSingletonMap = Collections.singletonMap("client_id", oo1IlOI3.I0000Il00O);
/* 61 */                    if (mapSingletonMap != null) {
/* 63 */                        mapI00000oIO.putAll(mapSingletonMap);
                            }
/* 77 */                    String strI00000oOI = li0IOIio0l1I.I00000oOI(mapI00000oIO);
/* 91 */                    httpURLConnectionI000OiO.setRequestProperty("Content-Length", String.valueOf(strI00000oOI.length()));
/* 100 */                   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionI000OiO.getOutputStream());
/* 103 */                   outputStreamWriter.write(strI00000oOI);
/* 106 */                   outputStreamWriter.flush();
/* 130 */                   errorStream = (httpURLConnectionI000OiO.getResponseCode() < 200 || httpURLConnectionI000OiO.getResponseCode() >= 300) ? httpURLConnectionI000OiO.getErrorStream() : httpURLConnectionI000OiO.getInputStream();
                        } catch (Throwable th) {
/* 183 */                   th = th;
/* 184 */                   r4 = oo1IlOI3;
                        }
                        try {
/* 140 */                   JSONObject jSONObject = new JSONObject(li10O1O0.I00000oIO(errorStream));
                            try {
/* 143 */                       errorStream.close();
                            } catch (IOException unused) {
                            }
/* 146 */                   return jSONObject;
                        } catch (IOException e) {
/* 157 */                   oo1IlOI2 = errorStream;
/* 158 */                   e = e;
/* 192 */                   O1I1OO.I000OOo1O().I000l1(3, e, "Failed to complete exchange request", new Object[0]);
/* 201 */                   this.I000II = I1iOo1IoI1.I0000O(I1iOll.I0000Il00O, e);
                            oo1IlOI3 = oo1IlOI2;
                            r1 = oo1IlOI2;
/* 203 */                   if (oo1IlOI2 != null) {
                                try {
/* 179 */                           r1.close();
                                    oo1IlOI3 = r1;
                                } catch (IOException unused2) {
/* 11 */                            return null;
                                }
                            }
/* 11 */                    return null;
                        } catch (JSONException e2) {
/* 152 */                   oo1IlOI = errorStream;
/* 153 */                   e = e2;
/* 166 */                   O1I1OO.I000OOo1O().I000l1(3, e, "Failed to complete exchange request", new Object[0]);
/* 175 */                   this.I000II = I1iOo1IoI1.I0000O(I1iOll.I0000O, e);
                            oo1IlOI3 = oo1IlOI;
                            r1 = oo1IlOI;
/* 177 */                   if (oo1IlOI != null) {
                            }
/* 11 */                    return null;
                        } catch (Throwable th2) {
/* 147 */                   th = th2;
/* 148 */                   r4 = errorStream;
/* 207 */                   if (r4 != null) {
                                try {
/* 209 */                           r4.close();
                                } catch (IOException unused3) {
                                }
                            }
/* 966 */                   throw th;
                        }
                    } catch (IOException e3) {
/* 73 */                e = e3;
/* 74 */                oo1IlOI2 = null;
                    } catch (JSONException e4) {
/* 70 */                e = e4;
/* 71 */                oo1IlOI = null;
                    } catch (Throwable th3) {
/* 67 */                th = th3;
                    }
                }

                @Override
                public final void onPostExecute(Object obj) throws JSONException {
                    I1iOo1IoI1 i1iOo1IoI1I0000O;
/* 1 */             JSONObject jSONObject = (JSONObject) obj;
/* 3 */             Oo1IlOI oo1IlOI = this.I00000oIO;
/* 5 */             IiI0oIlol0 iiI0oIlol0 = this.I0000O;
/* 7 */             I1iOo1IoI1 i1iOo1IoI1 = this.I000II;
/* 10 */            if (i1iOo1IoI1 != null) {
/* 12 */                iiI0oIlol0.I0000Il00O(null, i1iOo1IoI1);
/* 15 */                return;
                    }
/* 22 */            if (jSONObject.has("error")) {
                        try {
/* 24 */                    String string = jSONObject.getString("error");
/* 34 */                    I1iOo1IoI1 i1iOo1IoI12 = (I1iOo1IoI1) I1iOo10.I00000oOI.get(string);
/* 36 */                    if (i1iOo1IoI12 == null) {
/* 39 */                        i1iOo1IoI12 = I1iOo10.I00000oIO;
                            }
/* 43 */                    String strOptString = jSONObject.optString("error_description", null);
/* 49 */                    String strOptString2 = jSONObject.optString("error_uri");
/* 57 */                    Uri uri = strOptString2 == null ? null : Uri.parse(strOptString2);
/* 63 */                    int i = i1iOo1IoI12.I00iOIl;
/* 65 */                    int i2 = i1iOo1IoI12.I00iiI;
/* 67 */                    if (string == null) {
/* 71 */                        string = i1iOo1IoI12.I00iiO;
                            }
/* 69 */                    String str = string;
/* 74 */                    if (strOptString == null) {
/* 78 */                        strOptString = i1iOo1IoI12.I00iio;
                            }
/* 76 */                    String str2 = strOptString;
/* 81 */                    if (uri == null) {
/* 85 */                        uri = i1iOo1IoI12.I00ilI0I1;
                            }
/* 89 */                    i1iOo1IoI1I0000O = new I1iOo1IoI1(i, i2, str, str2, uri, null);
                        } catch (JSONException e) {
/* 97 */                    i1iOo1IoI1I0000O = I1iOo1IoI1.I0000O(I1iOll.I0000O, e);
                        }
/* 101 */               iiI0oIlol0.I0000Il00O(null, i1iOo1IoI1I0000O);
/* 966 */               return;
                    }
                    try {
/* 107 */               o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 112 */               lII1IoI.I0000Il00O("request cannot be null", oo1IlOI);
/* 115 */               Map map = Collections.EMPTY_MAP;
/* 117 */               o01l1iooo0.I000O01llI0(jSONObject);
/* 124 */               String str3 = (String) o01l1iooo0.I00iOIl;
/* 128 */               Long l = (Long) o01l1iooo0.I00iiI;
/* 132 */               String str4 = (String) o01l1iooo0.I00iiO;
/* 136 */               String str5 = (String) o01l1iooo0.I00iio;
/* 138 */               Oo1Ioo1 oo1Ioo1 = new Oo1Ioo1();
/* 141 */               oo1Ioo1.I00000oIO = str3;
/* 143 */               oo1Ioo1.I00000oOI = l;
/* 145 */               oo1Ioo1.I0000Il00O = str5;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               if (str4 != null) {
                            try {
                                try {
/* 160 */                           IoOoiiOool1.I00000oIO(str4).I00000oOI(oo1IlOI, this.I0000oI00, this.I0001Ioi1lo);
                                } catch (I1iOo1IoI1 e2) {
/* 166 */                           iiI0oIlol0.I0000Il00O(null, e2);
/* 966 */                           return;
                                }
                            } catch (IoOoiOooo0 | JSONException e3) {
/* 178 */                       iiI0oIlol0.I0000Il00O(null, I1iOo1IoI1.I0000O(I1iOll.I0000oI00, e3));
/* 966 */                       return;
                            }
                        }
/* 194 */               O1I1OO.I0001Ioi1lo("Token exchange with %s completed", (Uri) oo1IlOI.I00000oIO.I00iiO);
/* 197 */               iiI0oIlol0.I0000Il00O(oo1Ioo1, null);
                    } catch (JSONException e4) {
/* 209 */               iiI0oIlol0.I0000Il00O(null, I1iOo1IoI1.I0000O(I1iOll.I0000O, e4));
                    }
                }
            }
