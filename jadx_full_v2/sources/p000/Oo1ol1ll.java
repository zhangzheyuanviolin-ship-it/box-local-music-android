            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
/* 11 */    public class Oo1ol1ll implements i0IoOO1i1, i0Ii0I1ll, OIOolOo, IIiOOIoi0, iooO1iil, liOII1010il {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public Oo1ol1ll(Object obj, Cloneable cloneable, Object obj2, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = obj;
/* 5 */             this.I00iiO = cloneable;
/* 7 */             this.I00iio = obj2;
                }

                public static Object I0001Ioi1lo(o0IiOl o0iiol) throws IOException {
                    try {
/* 5 */                 return lOio0o.I00000oOI(o0iiol, 30L, TimeUnit.SECONDS);
                    } catch (InterruptedException | TimeoutException e) {
/* 18 */                throw new IOException("SERVICE_NOT_AVAILABLE", e);
                    } catch (ExecutionException e2) {
/* 20 */                Throwable cause = e2.getCause();
/* 26 */                if (cause instanceof IOException) {
/* 77 */                    throw ((IOException) cause);
                        }
/* 30 */                if (cause instanceof RuntimeException) {
/* 34 */                    throw ((RuntimeException) cause);
                        }
/* 40 */                throw new IOException(e2);
                    }
                }

                @Override
                public void I00000oIO(String str) {
/* 3 */             I000O01llI0(0L, str);
                }

                @Override
                public void I00000oOI() {
/* 3 */             Bundle bundle = (Bundle) this.I00iiO;
/* 7 */             String str = (String) this.I00iiI;
/* 11 */            Ii11I0l ii11I0l = (Ii11I0l) this.I00iio;
/* 29 */            ii11I0l.I00000oIO.put(str.concat("notification_intent_reconstruct_from_data"), Boolean.valueOf(bundle.getBoolean("notification_intent_reconstruct_from_data")));
                }

                @Override
                public Object I0000Il00O() {
                    Bundle bundle;
                    switch (this.I00iOIl) {
                        case 5:
/* 88 */                    i0IOo0i0 i0ioo0i0 = (i0IOo0i0) this.I00iio;
/* 92 */                    i0IOo0i0 i0ioo0i02 = (i0IOo0i0) this.I00iiO;
/* 98 */                    Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 102 */                   Object objI0000Il00O2 = i0ioo0i02.I0000Il00O();
/* 116 */                   i0OI0oooo i0oi0oooo = (i0OI0oooo) i0ioo0i0.I0000Il00O();
/* 118 */                   i0O0ioo00 i0o0ioo00 = new i0O0ioo00();
/* 121 */                   i0o0ioo00.I00000oIO = (i0O1I1o) objI0000Il00O;
/* 123 */                   i0o0ioo00.I00000oOI = (i0O0oI10I) objI0000Il00O2;
/* 125 */                   i0o0ioo00.I0000Il00O = i0oi0oooo;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   return i0o0ioo00;
                        default:
/* 10 */                    Context contextI00000oOI = ((i0O00lI) this.I00iiI).I00000oOI();
/* 24 */                    i0IOo0i0 i0ioo0i03 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00iiO));
/* 37 */                    i0IOo0i0 i0ioo0i04 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00iio));
                            try {
/* 54 */                        bundle = contextI00000oOI.getPackageManager().getApplicationInfo(contextI00000oOI.getPackageName(), Barcode.FORMAT_ITF).metaData;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
/* 66 */                    String string = bundle == null ? null : bundle.getString("local_testing_dir");
/* 80 */                    i0OiOI1 i0oioi1 = string == null ? (i0OiOI1) i0ioo0i03.I0000Il00O() : (i0OiOI1) i0ioo0i04.I0000Il00O();
/* 82 */                    liIliolI1Oi0.I00000oIO(i0oioi1);
/* 85 */                    return i0oioi1;
                    }
                }

                @Override
                public void I0000O(String str) {
/* 5 */             ArrayList parcelableArrayList = ((Bundle) this.I00iiO).getParcelableArrayList(str);
/* 9 */             if (parcelableArrayList == null) {
/* 11 */                return;
                    }
/* 16 */            String[] strArr = new String[parcelableArrayList.size()];
/* 23 */            for (int i = 0; i < parcelableArrayList.size(); i++) {
/* 29 */                Intent intent = (Intent) parcelableArrayList.get(i);
/* 51 */                strArr[i] = (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
                    }
/* 72 */            ((Ii11I0l) this.I00iio).I00000oIO.put(IlIi0I0.I000lI((String) this.I00iiI, str, ":intent_data"), strArr);
                }

                @Override
                public void I0000oI00(String str) {
/* 3 */             Bundle bundle = (Bundle) this.I00iiO;
/* 7 */             String str2 = (String) this.I00iiI;
/* 11 */            Ii11I0l ii11I0l = (Ii11I0l) this.I00iio;
/* 27 */            ii11I0l.I00000oIO.put(str2.concat(str), Integer.valueOf(bundle.getInt(str)));
                }

                @Override
                public ArrayList I000II(String str) {
/* 5 */             ArrayList<String> stringArrayList = ((Bundle) this.I00iiO).getStringArrayList(str);
/* 9 */             if (stringArrayList == null) {
/* 13 */                return new ArrayList();
                    }
/* 21 */            String[] strArr = new String[stringArrayList.size()];
/* 28 */            for (int i = 0; i < stringArrayList.size(); i++) {
/* 30 */                String str2 = stringArrayList.get(i);
/* 36 */                if (str2 == null) {
/* 38 */                    str2 = "";
                        }
/* 40 */                strArr[i] = str2;
                    }
/* 47 */            Ii11I0l ii11I0l = (Ii11I0l) this.I00iio;
/* 59 */            ii11I0l.I00000oIO.put(((String) this.I00iiI).concat(str), strArr);
/* 77 */            return stringArrayList;
                }

                @Override
                public void I000O01llI0(long j, String str) {
/* 3 */             Bundle bundle = (Bundle) this.I00iiO;
/* 7 */             String str2 = (String) this.I00iiI;
/* 11 */            Ii11I0l ii11I0l = (Ii11I0l) this.I00iio;
/* 27 */            ii11I0l.I00000oIO.put(str2.concat(str), Long.valueOf(bundle.getLong(str, j)));
                }

                @Override
                public void I000OOo1O(String str) {
/* 5 */             String string = ((Bundle) this.I00iiO).getString(str);
/* 9 */             if (string == null) {
/* 11 */                return;
                    }
/* 14 */            Ii11I0l ii11I0l = (Ii11I0l) this.I00iio;
/* 26 */            ii11I0l.I00000oIO.put(((String) this.I00iiI).concat(str), string);
                }

                public boolean I000OiO() {
/* 11 */            if (((OoOlliI1lo) this.I00iiI).getValue() != this.I00iio) {
/* 28 */                return true;
                    }
/* 15 */            Oo1ol1ll oo1ol1ll = (Oo1ol1ll) this.I00iiO;
                    return oo1ol1ll != null && oo1ol1ll.I000OiO();
                }

                public void I000iOII(int i, long j) {
/* 6 */             this.I00iiO = new i01oi0o();
/* 20 */            ((HashMap) this.I00iiI).put(Long.valueOf(j), (i01oi0o) this.I00iiO);
/* 27 */            ((i01oi0o) this.I00iiO).getClass();
                }

                public void I000l1(String str, String str2, String str3, String str4) throws IOException {
/* 3 */             IlIoliIO ilIoliIO = (IlIoliIO) this.I00iiO;
/* 5 */             IlO0oiiii0IO ilO0oiiii0IO = ilIoliIO.I0000Il00O;
/* 7 */             if (str2 == null || str3 == null) {
/* 202 */               IioIoO10iOiI.I000OOo1O("FIS auth token or FIS ID is empty");
/* 1182 */              return;
                    }
/* 11 */            ilIoliIO.I00000oIO();
/* 14 */            String str5 = ilO0oiiii0IO.I000O01llI0;
/* 16 */            ilIoliIO.I00000oIO();
/* 19 */            String str6 = ilO0oiiii0IO.I00000oIO;
/* 21 */            if (str5 == null) {
/* 196 */               IioIoO10iOiI.I000OOo1O("Project ID or API Key is missing");
/* 199 */               return;
                    }
/* 41 */            URL url = new URL(IIlIOloOOO.I0010I0i(IIl001iO0Io.I00111O("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str, ":", str4));
/* 51 */            if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 53 */                url.toString();
                    }
/* 60 */            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
/* 64 */            httpURLConnection.setRequestMethod("POST");
/* 69 */            httpURLConnection.setRequestProperty("x-goog-api-key", str6);
/* 74 */            httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
/* 78 */            httpURLConnection.setDoOutput(false);
                    try {
                        try {
/* 81 */                    int responseCode = httpURLConnection.getResponseCode();
/* 85 */                    httpURLConnection.disconnect();
/* 90 */                    if (responseCode >= 200 && responseCode < 300) {
/* 96 */                        Log.isLoggable("FirebaseMessaging", 3);
/* 99 */                        return;
                            }
/* 104 */                   if (responseCode == 404 || responseCode == 403) {
/* 151 */                       if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 153 */                           httpURLConnection.getResponseMessage();
                                }
/* 160 */                       StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Topic ", str4, " failed: ");
/* 168 */                       sbI001IIilI0O.append(httpURLConnection.getResponseMessage());
/* 178 */                       throw new IOException(sbI001IIilI0O.toString());
                            }
/* 113 */                   if (responseCode >= 500) {
/* 117 */                       IioIoO10iOiI.I000OOo1O("INTERNAL_SERVER_ERROR");
/* 120 */                       return;
                            }
/* 146 */                   throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } catch (IOException e) {
/* 189 */                   throw new IOException("SERVICE_NOT_AVAILABLE", e);
                        }
                    } catch (Throwable th) {
/* 190 */               httpURLConnection.disconnect();
/* 193 */               throw th;
                    }
                }

                public void I000lI(long j) {
/* 3 */             HashMap map = (HashMap) this.I00iiI;
/* 11 */            if (((i01oi0o) this.I00iio) != null) {
/* 15 */                Log.w("PdfBox-Android", "Method must be called only ones with last startxref value.");
/* 18 */                return;
                    }
/* 21 */            i01oi0o i01oi0oVar = new i01oi0o();
/* 24 */            this.I00iio = i01oi0oVar;
/* 31 */            i01oi0oVar.I00000oIO = new IIOoi0ooOoO();
/* 41 */            i01oi0o i01oi0oVar2 = (i01oi0o) map.get(Long.valueOf(j));
/* 45 */            ArrayList arrayList = new ArrayList();
/* 48 */            if (i01oi0oVar2 == null) {
/* 64 */                Log.w("PdfBox-Android", "Did not found XRef object at specified startxref position " + j);
/* 71 */                arrayList.addAll(map.keySet());
/* 74 */                Collections.sort(arrayList);
                    } else {
/* 82 */                ((i01oi0o) this.I00iio).getClass();
/* 89 */                arrayList.add(Long.valueOf(j));
                        while (true) {
/* 92 */                    IIOoi0ooOoO iIOoi0ooOoO = i01oi0oVar2.I00000oIO;
/* 94 */                    if (iIOoi0ooOoO == null) {
                                break;
                            }
/* 98 */                    long jI0100o111I = iIOoi0ooOoO.I0100o111I(IIi0I0I0o.I0I1lIio);
/* 106 */                   if (jI0100o111I == -1) {
                                break;
                            }
/* 117 */                   i01oi0oVar2 = (i01oi0o) map.get(Long.valueOf(jI0100o111I));
/* 119 */                   if (i01oi0oVar2 == null) {
/* 135 */                       Log.w("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + jI0100o111I);
                                break;
                            } else {
/* 143 */                       arrayList.add(Long.valueOf(jI0100o111I));
/* 154 */                       if (arrayList.size() >= map.size()) {
                                    break;
                                }
                            }
                        }
/* 156 */               Collections.reverse(arrayList);
                    }
/* 159 */           Iterator it = arrayList.iterator();
/* 167 */           while (it.hasNext()) {
/* 179 */               i01oi0o i01oi0oVar3 = (i01oi0o) map.get((Long) it.next());
/* 181 */               IIOoi0ooOoO iIOoi0ooOoO2 = i01oi0oVar3.I00000oIO;
/* 183 */               if (iIOoi0ooOoO2 != null) {
/* 191 */                   ((i01oi0o) this.I00iio).I00000oIO.I00ioIO(iIOoi0ooOoO2);
                        }
/* 202 */               ((i01oi0o) this.I00iio).I00000oOI.putAll(i01oi0oVar3.I00000oOI);
                    }
                }

                public void I000o00OoI0I(IIi0O11lioI1 iIi0O11lioI1, long j) {
/* 3 */             i01oi0o i01oi0oVar = (i01oi0o) this.I00iiO;
/* 5 */             if (i01oi0oVar != null) {
/* 40 */                if (i01oi0oVar.I00000oOI.containsKey(iIi0O11lioI1)) {
/* 106 */                   return;
                        }
/* 52 */                ((i01oi0o) this.I00iiO).I00000oOI.put(iIi0O11lioI1, Long.valueOf(j));
                    } else {
/* 30 */                Log.w("PdfBox-Android", "Cannot add XRef entry for '" + iIi0O11lioI1.I00iOIl + "' because XRef start was not signalled.");
                    }
                }

                public void I000oI1ioi(int i, String str) {
/* 1 */             String strValueOf = String.valueOf(i);
/* 9 */             iliiioOI1Oi iliiiooi1oi = new iliiioOI1Oi(22);
/* 16 */            ((Oo1ol1ll) this.I00iio).I00iio = iliiiooi1oi;
/* 18 */            this.I00iio = iliiiooi1oi;
/* 20 */            iliiiooi1oi.I00iiO = strValueOf;
/* 22 */            iliiiooi1oi.I00iiI = str;
                }

                public byte[] I00100l0(lIO1iOooo1O lio1ioooo1o) {
                    il0lI11lOiI1 il0li11loii1;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                OIOi0lOI oIOi0lOI2 = (OIOi0lOI) this.I00iio;
/* 20 */                il0li11loii1 = new il0lI11lOiI1();
/* 26 */                OOiI1O oOiI1O = new OOiI1O(7);
/* 30 */                oOiI1O.I00000oOI = false;
/* 32 */                oOiI1O.I0000Il00O = false;
/* 34 */                oOiI1O.I0000oI00 = il0li11loii1;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                il0li11loii1.I0000oI00 = oOiI1O;
/* 41 */                il0li11loii1.I00000oIO = byteArrayOutputStream;
/* 43 */                il0li11loii1.I00000oOI = map;
/* 45 */                il0li11loii1.I0000Il00O = map2;
/* 47 */                il0li11loii1.I0000O = oIOi0lOI2;
/* 49 */                VarHandle.storeStoreFence();
/* 58 */                oIOi0lOI = (OIOi0lOI) map.get(lIO1iOooo1O.class);
                    } catch (IOException unused) {
                    }
/* 60 */            if (oIOi0lOI == null) {
/* 81 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(lIO1iOooo1O.class)));
                    }
/* 62 */            oIOi0lOI.encode(lio1ioooo1o, il0li11loii1);
/* 82 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I00100o1O0lo(lOli1l loli1l) {
                    iiIilO iiiilo;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                iiiilo = new iiIilO();
/* 26 */                OOiI1O oOiI1O = new OOiI1O(2);
/* 30 */                oOiI1O.I00000oOI = false;
/* 32 */                oOiI1O.I0000Il00O = false;
/* 34 */                oOiI1O.I0000oI00 = iiiilo;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                iiiilo.I0000oI00 = oOiI1O;
/* 41 */                iiiilo.I00000oIO = byteArrayOutputStream;
/* 43 */                iiiilo.I00000oOI = map;
/* 45 */                iiiilo.I0000Il00O = map2;
/* 47 */                iiiilo.I0000O = iioo0oiii1;
/* 49 */                VarHandle.storeStoreFence();
/* 58 */                oIOi0lOI = (OIOi0lOI) map.get(lOli1l.class);
                    } catch (IOException unused) {
                    }
/* 60 */            if (oIOi0lOI == null) {
/* 81 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(lOli1l.class)));
                    }
/* 62 */            oIOi0lOI.encode(loli1l, iiiilo);
/* 82 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I0010I0i(li0IoOiiO li0iooiio) {
                    iiilolIO0O iiilolio0o;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                iiilolio0o = new iiilolIO0O();
/* 26 */                OOiI1O oOiI1O = new OOiI1O(3);
/* 30 */                oOiI1O.I00000oOI = false;
/* 32 */                oOiI1O.I0000Il00O = false;
/* 34 */                oOiI1O.I0000oI00 = iiilolio0o;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                iiilolio0o.I0000oI00 = oOiI1O;
/* 41 */                iiilolio0o.I00000oIO = byteArrayOutputStream;
/* 43 */                iiilolio0o.I00000oOI = map;
/* 45 */                iiilolio0o.I0000Il00O = map2;
/* 47 */                iiilolio0o.I0000O = iioo0oiii1;
/* 49 */                VarHandle.storeStoreFence();
/* 58 */                oIOi0lOI = (OIOi0lOI) map.get(li0IoOiiO.class);
                    } catch (IOException unused) {
                    }
/* 60 */            if (oIOi0lOI == null) {
/* 81 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(li0IoOiiO.class)));
                    }
/* 62 */            oIOi0lOI.encode(li0iooiio, iiilolio0o);
/* 82 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I0010o(li1OiO li1oio) {
                    iiloIolOi0i iiloioloi0i;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                iiloioloi0i = new iiloIolOi0i();
/* 26 */                OOiI1O oOiI1O = new OOiI1O(5);
/* 30 */                oOiI1O.I00000oOI = false;
/* 32 */                oOiI1O.I0000Il00O = false;
/* 34 */                oOiI1O.I0000oI00 = iiloioloi0i;
/* 36 */                VarHandle.storeStoreFence();
/* 39 */                iiloioloi0i.I0000oI00 = oOiI1O;
/* 41 */                iiloioloi0i.I00000oIO = byteArrayOutputStream;
/* 43 */                iiloioloi0i.I00000oOI = map;
/* 45 */                iiloioloi0i.I0000Il00O = map2;
/* 47 */                iiloioloi0i.I0000O = iioo0oiii1;
/* 49 */                VarHandle.storeStoreFence();
/* 58 */                oIOi0lOI = (OIOi0lOI) map.get(li1OiO.class);
                    } catch (IOException unused) {
                    }
/* 60 */            if (oIOi0lOI == null) {
/* 81 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(li1OiO.class)));
                    }
/* 62 */            oIOi0lOI.encode(li1oio, iiloioloi0i);
/* 82 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I00111O(llillo1Oi llillo1oi) {
                    ioI1iO1i ioi1io1i;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                iIOo0oiIi1 iioo0oiii1 = (iIOo0oiIi1) this.I00iio;
/* 20 */                ioi1io1i = new ioI1iO1i();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(9);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = ioi1io1i;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                ioi1io1i.I0000oI00 = oOiI1O;
/* 42 */                ioi1io1i.I00000oIO = byteArrayOutputStream;
/* 44 */                ioi1io1i.I00000oOI = map;
/* 46 */                ioi1io1i.I0000Il00O = map2;
/* 48 */                ioi1io1i.I0000O = iioo0oiii1;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(llillo1Oi.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(llillo1Oi.class)));
                    }
/* 63 */            oIOi0lOI.encode(llillo1oi, ioi1io1i);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I001IIilI0O(loo0IIIOooii loo0iiioooii) {
                    l0i1l1ooO l0i1l1ooo;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                l0iO10io0IOO l0io10io0ioo = (l0iO10io0IOO) this.I00iio;
/* 20 */                l0i1l1ooo = new l0i1l1ooO();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(10);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = l0i1l1ooo;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                l0i1l1ooo.I0000oI00 = oOiI1O;
/* 42 */                l0i1l1ooo.I00000oIO = byteArrayOutputStream;
/* 44 */                l0i1l1ooo.I00000oOI = map;
/* 46 */                l0i1l1ooo.I0000Il00O = map2;
/* 48 */                l0i1l1ooo.I0000O = l0io10io0ioo;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(loo0IIIOooii.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(loo0IIIOooii.class)));
                    }
/* 63 */            oIOi0lOI.encode(loo0iiioooii, l0i1l1ooo);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public byte[] I001IO000(loo1OOo1O loo1ooo1o) {
                    l0il1O0 l0il1o0;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                l0iO10io0IOO l0io10io0ioo = (l0iO10io0IOO) this.I00iio;
/* 20 */                l0il1o0 = new l0il1O0();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(12);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = l0il1o0;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                l0il1o0.I0000oI00 = oOiI1O;
/* 42 */                l0il1o0.I00000oIO = byteArrayOutputStream;
/* 44 */                l0il1o0.I00000oOI = map;
/* 46 */                l0il1o0.I0000Il00O = map2;
/* 48 */                l0il1o0.I0000O = l0io10io0ioo;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(loo1OOo1O.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(loo1OOo1O.class)));
                    }
/* 63 */            oIOi0lOI.encode(loo1ooo1o, l0il1o0);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 6 */             int i = 6;
/* 7 */             int i2 = 0;
                    switch (this.I00iOIl) {
                        case 10:
/* 446 */                   ilOI1I0lloOl iloi1i0llool = (ilOI1I0lloOl) this.I00iiI;
/* 450 */                   il011ilOliio il011iloliio = (il011ilOliio) this.I00iiO;
/* 454 */                   il1l01I0il il1l01i0il = (il1l01I0il) this.I00iio;
                            try {
/* 456 */                       o0oIIOoI11O1 o0oiiooi11o1 = il011iloliio.I00000oIO;
/* 461 */                       i11I1Ili i11i1ili = new i11I1Ili(4);
/* 464 */                       i11i1ili.I00iiI = iIiOOI;
/* 466 */                       VarHandle.storeStoreFence();
/* 469 */                       liiiOl01O liiiol01oI00000oOI = iloi1i0llool.I00000oOI(o0oiiooi11o1, il1l01i0il, i11i1ili);
/* 475 */                       iiI1IlI iii1ili = new iiI1IlI(1);
/* 478 */                       iii1ili.I00iiI = liiiol01oI00000oOI;
/* 480 */                       VarHandle.storeStoreFence();
/* 485 */                       iIiOOI.I00000oIO(iii1ili, iloi1i0llool.I0000O);
/* 488 */                       return "runInferenceFuture";
                            } catch (RemoteException e) {
/* 509 */                       iIiOOI.I0000O(new iOlI0O0iIiO(2, 6, "Failed to run inference", e));
/* 5 */                         return null;
                            } catch (RuntimeException e2) {
/* 500 */                       iIiOOI.I0000O(new iOlI0O0iIiO(2, 0, "Failed to run inference", e2));
/* 5 */                         return null;
                            }
                        case 11:
/* 376 */                   ilIoii01i ilioii01i = (ilIoii01i) this.I00iiI;
/* 380 */                   il0Oi1i1II il0oi1i1ii = (il0Oi1i1II) this.I00iiO;
/* 384 */                   il1l00IOII il1l00ioii = (il1l00IOII) this.I00iio;
                            try {
/* 386 */                       o0Il1IiOIo o0il1iioio = il0oi1i1ii.I00000oIO;
/* 390 */                       i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 393 */                       i0oi1l1oo.I00iOIl = iIiOOI;
/* 395 */                       VarHandle.storeStoreFence();
/* 398 */                       liiiOiOilI0l liiioioili0lI00000oOI = ilioii01i.I00000oOI(o0il1iioio, il1l00ioii, i0oi1l1oo);
/* 404 */                       iiIii011OlI iiiii011oli = new iiIii011OlI(1);
/* 407 */                       iiiii011oli.I00iiI = liiioioili0lI00000oOI;
/* 409 */                       VarHandle.storeStoreFence();
/* 414 */                       iIiOOI.I00000oIO(iiiii011oli, ilioii01i.I0000O);
/* 417 */                       return "runInferenceFuture";
                            } catch (RemoteException e3) {
/* 438 */                       iIiOOI.I0000O(new iOiIOO1ll(2, 6, "Failed to run inference", e3));
/* 5 */                         return null;
                            } catch (RuntimeException e4) {
/* 429 */                       iIiOOI.I0000O(new iOiIOO1ll(2, 0, "Failed to run inference", e4));
/* 5 */                         return null;
                            }
                        case 15:
/* 278 */                   il0llll00oO il0llll00oo = (il0llll00oO) this.I00iiI;
/* 282 */                   IIiOiI0il iIiOiI0il = (IIiOiI0il) this.I00iiO;
/* 286 */                   ilo1O0Ii ilo1o0ii = (ilo1O0Ii) this.I00iio;
/* 290 */                   il0II0 il0ii0 = new il0II0(0);
/* 293 */                   il0ii0.I00iiI = iIiOiI0il;
/* 295 */                   VarHandle.storeStoreFence();
/* 298 */                   Executor executor = iollol1ioIi.I00iOIl;
/* 300 */                   iIiOOI.I00000oIO(il0ii0, executor);
/* 306 */                   liOO1i1 lioo1i1 = new liOO1i1(5);
/* 309 */                   lioo1i1.I00iiI = iIiOOI;
/* 311 */                   lioo1i1.I00iiO = ilo1o0ii;
/* 313 */                   VarHandle.storeStoreFence();
                            synchronized (il0llll00oo.I00000oOI) {
                                try {
/* 321 */                           if (il0llll00oo.I0000O) {
/* 323 */                               lioo1i1.run();
                                    } else {
/* 332 */                               il0llll00oo.I0000Il00O.add(lioo1i1);
                                    }
                                } finally {
                                }
                            }
/* 340 */                   OlilOlOiI olilOlOiI = new OlilOlOiI(16);
/* 343 */                   olilOlOiI.I00iiI = iIiOOI;
/* 345 */                   olilOlOiI.I00iiO = lioo1i1;
/* 347 */                   olilOlOiI.I00iio = il0llll00oo;
/* 349 */                   VarHandle.storeStoreFence();
/* 354 */                   l0001OI0 l0001oi0 = new l0001OI0(i2);
/* 357 */                   l0001oi0.I00iiI = iIiOiI0il;
/* 359 */                   l0001oi0.I00iiO = olilOlOiI;
/* 361 */                   VarHandle.storeStoreFence();
/* 364 */                   iIiOiI0il.addListener(l0001oi0, executor);
/* 367 */                   return "FailureSignal.propagate";
                        case 16:
/* 183 */                   il0llll00oO il0llll00oo2 = (il0llll00oO) this.I00iiI;
/* 187 */                   IIiOiI0il iIiOiI0il2 = (IIiOiI0il) this.I00iiO;
/* 191 */                   illlli illlliVar = (illlli) this.I00iio;
/* 195 */                   il0II0 il0ii02 = new il0II0(1);
/* 198 */                   il0ii02.I00iiI = iIiOiI0il2;
/* 200 */                   VarHandle.storeStoreFence();
/* 203 */                   Executor executor2 = iol1IOlOo.I00iOIl;
/* 205 */                   iIiOOI.I00000oIO(il0ii02, executor2);
/* 210 */                   IlloOIoilIl illoOIoilIl = new IlloOIoilIl(i);
/* 213 */                   illoOIoilIl.I00iiI = iIiOOI;
/* 215 */                   illoOIoilIl.I00iiO = illlliVar;
/* 217 */                   VarHandle.storeStoreFence();
                            synchronized (il0llll00oo2.I00000oOI) {
                                try {
/* 225 */                           if (il0llll00oo2.I0000O) {
/* 227 */                               illoOIoilIl.run();
                                    } else {
/* 236 */                               il0llll00oo2.I0000Il00O.add(illoOIoilIl);
                                    }
                                } finally {
                                }
                            }
/* 244 */                   Oo1ol1ll oo1ol1ll = new Oo1ol1ll(17);
/* 247 */                   oo1ol1ll.I00iiI = iIiOOI;
/* 249 */                   oo1ol1ll.I00iiO = illoOIoilIl;
/* 251 */                   oo1ol1ll.I00iio = il0llll00oo2;
/* 253 */                   VarHandle.storeStoreFence();
/* 258 */                   iooiio1i0 iooiio1i0Var = new iooiio1i0(i2);
/* 261 */                   iooiio1i0Var.I00iiI = iIiOiI0il2;
/* 263 */                   iooiio1i0Var.I00iiO = oo1ol1ll;
/* 265 */                   VarHandle.storeStoreFence();
/* 268 */                   iIiOiI0il2.addListener(iooiio1i0Var, executor2);
/* 271 */                   return "FailureSignal.propagate";
                        case PoseLandmark.RIGHT_INDEX:
/* 87 */                    il0llll00oO il0llll00oo3 = (il0llll00oO) this.I00iiI;
/* 91 */                    IIiOiI0il iIiOiI0il3 = (IIiOiI0il) this.I00iiO;
/* 95 */                    iliIOlooOio iliioloooio = (iliIOlooOio) this.I00iio;
/* 100 */                   il0II0 il0ii03 = new il0II0(3);
/* 103 */                   il0ii03.I00iiI = iIiOiI0il3;
/* 105 */                   VarHandle.storeStoreFence();
/* 108 */                   Executor executor3 = l0OO1i.I00iOIl;
/* 110 */                   iIiOOI.I00000oIO(il0ii03, executor3);
/* 115 */                   iooiio1i0 iooiio1i0Var2 = new iooiio1i0(i);
/* 118 */                   iooiio1i0Var2.I00iiI = iIiOOI;
/* 120 */                   iooiio1i0Var2.I00iiO = iliioloooio;
/* 122 */                   VarHandle.storeStoreFence();
                            synchronized (il0llll00oo3.I00000oOI) {
                                try {
/* 130 */                           if (il0llll00oo3.I0000O) {
/* 132 */                               iooiio1i0Var2.run();
                                    } else {
/* 141 */                               il0llll00oo3.I0000Il00O.add(iooiio1i0Var2);
                                    }
                                } finally {
                                }
                            }
/* 149 */                   OlilOlOiI olilOlOiI2 = new OlilOlOiI(21);
/* 152 */                   olilOlOiI2.I00iiI = iIiOOI;
/* 154 */                   olilOlOiI2.I00iiO = iooiio1i0Var2;
/* 156 */                   olilOlOiI2.I00iio = il0llll00oo3;
/* 158 */                   VarHandle.storeStoreFence();
/* 163 */                   l0iOoII1Il l0iooii1il = new l0iOoII1Il(i2);
/* 166 */                   l0iooii1il.I00iiI = iIiOiI0il3;
/* 168 */                   l0iooii1il.I00iiO = olilOlOiI2;
/* 170 */                   VarHandle.storeStoreFence();
/* 173 */                   iIiOiI0il3.addListener(l0iooii1il, executor3);
/* 176 */                   return "FailureSignal.propagate";
                        default:
/* 13 */                    ioii01Ii100 ioii01ii100 = (ioii01Ii100) this.I00iiI;
/* 17 */                    l00Oi001i1l l00oi001i1l = (l00Oi001i1l) this.I00iiO;
/* 19 */                    Object obj = this.I00iio;
                            try {
/* 25 */                        Object obj2 = l00oi001i1l.I00000oIO;
/* 29 */                        IlloIo0O illoIo0O = new IlloIo0O();
/* 32 */                        illoIo0O.I00iOIl = iIiOOI;
/* 34 */                        VarHandle.storeStoreFence();
/* 37 */                        iOio1i0 ioio1i0I0000Il00O = ioii01ii100.I0000Il00O(obj2, obj, illoIo0O);
/* 43 */                        io1O1OoO1 io1o1ooo1 = new io1O1OoO1(0);
/* 46 */                        io1o1ooo1.I00iiI = ioio1i0I0000Il00O;
/* 48 */                        VarHandle.storeStoreFence();
/* 53 */                        iIiOOI.I00000oIO(io1o1ooo1, ioii01ii100.I0000O);
/* 56 */                        return "runInferenceFuture";
                            } catch (RemoteException e5) {
/* 74 */                        Log.e("ioii01Ii100", "Failed to run inference.", e5);
/* 81 */                        iIiOOI.I0000O(ilIoOl.I00000oOI(6, e5, "Failed to run inference."));
/* 5 */                         return null;
                            } catch (RuntimeException e6) {
/* 63 */                        Log.e("ioii01Ii100", "Failed to run inference.", e6);
/* 70 */                        iIiOOI.I0000O(ilIoOl.I00000oOI(0, e6, "Failed to run inference."));
/* 5 */                         return null;
                            }
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 3 */             OiI1lOO1O0i oiI1lOO1O0i = (OiI1lOO1O0i) this.I00iiI;
/* 7 */             String str = (String) this.I00iiO;
/* 11 */            ScheduledFuture scheduledFuture = (ScheduledFuture) this.I00iio;
/* 13 */            Ol0Ii10o1 ol0Ii10o1 = oiI1lOO1O0i.I00000oIO;
                    synchronized (ol0Ii10o1) {
/* 16 */                ol0Ii10o1.remove(str);
                    }
/* 21 */            scheduledFuture.cancel(false);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_HIP:
/* 15 */                    StringBuilder sb = new StringBuilder(32);
/* 22 */                    sb.append((String) this.I00iiI);
/* 27 */                    sb.append('{');
/* 36 */                    Oo1ol1ll oo1ol1ll = (Oo1ol1ll) ((Oo1ol1ll) this.I00iiO).I00iio;
/* 38 */                    String str = "";
/* 40 */                    while (oo1ol1ll != null) {
/* 42 */                        Object obj = oo1ol1ll.I00iiO;
/* 44 */                        sb.append(str);
/* 49 */                        String str2 = (String) oo1ol1ll.I00iiI;
/* 51 */                        if (str2 != null) {
/* 53 */                            sb.append(str2);
/* 58 */                            sb.append('=');
                                }
/* 61 */                        if (obj == null || !obj.getClass().isArray()) {
/* 92 */                            sb.append(obj);
                                } else {
/* 88 */                            sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                                }
/* 97 */                        oo1ol1ll = (Oo1ol1ll) oo1ol1ll.I00iio;
/* 99 */                        str = ", ";
                            }
/* 104 */                   sb.append('}');
/* 107 */                   return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public void zza(Throwable th) {
                    switch (this.I00iOIl) {
                        case 17:
/* 57 */                    IIiOOI iIiOOI = (IIiOOI) this.I00iiI;
/* 61 */                    if (th instanceof iOiI1oOo1l) {
/* 63 */                        iIiOOI.I0000O(th);
                            } else if (th instanceof CancellationException) {
/* 75 */                        iIiOOI.I0000O(iOiI1oOo1l.I00000oIO("Operation was cancelled.", th, 7));
                            } else {
/* 83 */                        iIiOOI.I0000O(iOiI1oOo1l.I00000oIO("AiCore request could not be completed.", th, 0));
                            }
/* 94 */                    il0llll00oO.I000II((il0llll00oO) this.I00iio, (IlloOIoilIl) this.I00iiO);
                            break;
                        default:
/* 14 */                    IIiOOI iIiOOI2 = (IIiOOI) this.I00iiI;
/* 18 */                    if (th instanceof ilIoOl) {
/* 20 */                        iIiOOI2.I0000O(th);
                            } else if (th instanceof CancellationException) {
/* 32 */                        iIiOOI2.I0000O(ilIoOl.I0000O("Operation was cancelled.", th, 7));
                            } else {
/* 40 */                        iIiOOI2.I0000O(ilIoOl.I0000O("AiCore request could not be completed.", th, 0));
                            }
/* 51 */                    ((il0llll00oO) this.I00iio).I000l1((IlloOi1I1OO) this.I00iiO);
                            break;
                    }
                }

                @Override
                public void zzb(Object obj) {
                    switch (this.I00iOIl) {
                        case 17:
/* 29 */                    ((IIiOOI) this.I00iiI).I00000oOI(obj);
/* 40 */                    il0llll00oO.I000II((il0llll00oO) this.I00iio, (IlloOIoilIl) this.I00iiO);
                            break;
                        default:
/* 10 */                    ((IIiOOI) this.I00iiI).I00000oOI(obj);
/* 21 */                    ((il0llll00oO) this.I00iio).I000l1((IlloOi1I1OO) this.I00iiO);
                            break;
                    }
                }

/* 12 */        public Oo1ol1ll(int i) {
/* 13 */            this.I00iOIl = i;
                }
            }
