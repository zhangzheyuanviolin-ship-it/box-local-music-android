            package p000;

            import android.net.TrafficStats;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.security.KeyFactory;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.security.PublicKey;
            import java.security.spec.InvalidKeySpecException;
            import java.security.spec.X509EncodedKeySpec;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.regex.Pattern;
            import org.json.JSONException;
            
            public final class IlO01o11oOOO implements IlO0Ii1Il00o {
                public static final Object I000lI = new Object();
                public IlIoliIO I00000oIO;
                public IlIolo11lo I00000oOI;
                public I1I0i0Ilo1Oi I0000Il00O;
                public OolliI1oliO I0000O;
                public O0ioIo1O0lO I0000oI00;
                public OOl1lo1111Ii I0001Ioi1lo;
                public Object I000II;
                public ExecutorService I000O01llI0;
                public OilOi11lI0 I000OOo1O;
                public String I000OiO;
                public HashSet I000iOII;
                public ArrayList I000l1;

                static {
/* 11 */            new AtomicInteger(1);
                }

                /* JADX WARN: Finally extract failed */
                public final void I00000oIO() {
                    I1lI11 i1lI11I00Oio;
                    int i;
                    synchronized (I000lI) {
                        try {
/* 4 */                     IlIoliIO ilIoliIO = this.I00000oIO;
/* 6 */                     ilIoliIO.I00000oIO();
/* 11 */                    OlOO1i11110 olOO1i11110I0000O = OlOO1i11110.I0000O(ilIoliIO.I00000oIO);
                            try {
/* 17 */                        i1lI11I00Oio = this.I0000Il00O.I00Oio();
/* 21 */                        int i2 = i1lI11I00Oio.I00000oOI;
/* 24 */                        i = 1;
/* 33 */                        if (i2 == 2 || i2 == 1) {
/* 35 */                            String strI0001Ioi1lo = I0001Ioi1lo(i1lI11I00Oio);
/* 39 */                            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = this.I0000Il00O;
/* 41 */                            I1lI0iIOiOl i1lI0iIOiOlI00000oIO = i1lI11I00Oio.I00000oIO();
/* 45 */                            i1lI0iIOiOlI00000oIO.I00000oIO = strI0001Ioi1lo;
/* 48 */                            i1lI0iIOiOlI00000oIO.I00000oOI = 3;
/* 50 */                            i1lI11I00Oio = i1lI0iIOiOlI00000oIO.I00000oIO();
/* 54 */                            i1I0i0Ilo1Oi.I00OI1(i1lI11I00Oio);
                                }
/* 60 */                        if (olOO1i11110I0000O != null) {
/* 62 */                            olOO1i11110I0000O.I00111O();
                                }
                            } catch (Throwable th) {
/* 88 */                        if (olOO1i11110I0000O != null) {
/* 90 */                            olOO1i11110I0000O.I00111O();
                                }
/* 93 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 113 */                   throw th2;
                        }
                    }
/* 69 */            I000OOo1O(i1lI11I00Oio);
/* 72 */            OilOi11lI0 oilOi11lI0 = this.I000OOo1O;
/* 76 */            IlO00oo1IIi0 ilO00oo1IIi0 = new IlO00oo1IIi0(i);
/* 79 */            ilO00oo1IIi0.I00iiI = this;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            oilOi11lI0.execute(ilO00oo1IIi0);
                }

                public final I1lI11 I00000oOI(I1lI11 i1lI11) throws IlO0IilI1ii1 {
                    int i;
                    int responseCode;
                    I1lO0lOlOIi i1lO0lOlOIi;
                    I1lO0lOlOIi i1lO0lOlOIiI0001Ioi1lo;
/* 5 */             IlIolo11lo ilIolo11lo = this.I00000oOI;
/* 7 */             IlIoliIO ilIoliIO = this.I00000oIO;
/* 9 */             ilIoliIO.I00000oIO();
/* 14 */            String str = ilIoliIO.I0000Il00O.I00000oIO;
/* 16 */            String str2 = i1lI11.I00000oIO;
/* 18 */            IlIoliIO ilIoliIO2 = this.I00000oIO;
/* 20 */            ilIoliIO2.I00000oIO();
/* 25 */            String str3 = ilIoliIO2.I0000Il00O.I000O01llI0;
/* 27 */            String str4 = i1lI11.I0000O;
/* 31 */            IooI0ilii iooI0ilii = ilIolo11lo.I0000Il00O;
/* 37 */            if (!iooI0ilii.I00000oIO()) {
/* 966 */               throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                    }
/* 66 */            URL urlI00000oIO = IlIolo11lo.I00000oIO("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
/* 72 */            for (int i2 = 0; i2 <= 1; i2 = i + 1) {
/* 77 */                TrafficStats.setThreadStatsTag(32771);
/* 80 */                HttpURLConnection httpURLConnectionI0000Il00O = ilIolo11lo.I0000Il00O(urlI00000oIO, str);
                        try {
                            try {
/* 86 */                        httpURLConnectionI0000Il00O.setRequestMethod("POST");
/* 108 */                       httpURLConnectionI0000Il00O.addRequestProperty("Authorization", "FIS_v2 " + str4);
/* 111 */                       httpURLConnectionI0000Il00O.setDoOutput(true);
/* 114 */                       IlIolo11lo.I000O01llI0(httpURLConnectionI0000Il00O);
/* 117 */                       responseCode = httpURLConnectionI0000Il00O.getResponseCode();
/* 121 */                       iooI0ilii.I00000oOI(responseCode);
                            } catch (IOException | AssertionError unused) {
/* 154 */                       i = i2;
                            }
/* 137 */                   if (responseCode >= 200 && responseCode < 300) {
/* 139 */                       i1lO0lOlOIiI0001Ioi1lo = IlIolo11lo.I0001Ioi1lo(httpURLConnectionI0000Il00O);
                            } else {
/* 157 */                       IlIolo11lo.I00000oOI(httpURLConnectionI0000Il00O, null, str, str3);
/* 162 */                       i = i2;
/* 166 */                       if (responseCode == 401 || responseCode == 404) {
/* 247 */                           if (((byte) (0 | 1)) != 1) {
/* 366 */                               throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                    }
/* 251 */                           i1lO0lOlOIi = new I1lO0lOlOIi();
/* 255 */                           i1lO0lOlOIi.I00000oIO = null;
/* 257 */                           i1lO0lOlOIi.I00000oOI = 0L;
/* 260 */                           i1lO0lOlOIi.I0000Il00O = 3;
/* 262 */                           VarHandle.storeStoreFence();
/* 220 */                           httpURLConnectionI0000Il00O.disconnect();
/* 223 */                           TrafficStats.clearThreadStatsTag();
/* 226 */                           i1lO0lOlOIiI0001Ioi1lo = i1lO0lOlOIi;
                                } else {
/* 175 */                           if (responseCode == 429) {
/* 243 */                               throw new IlO0IilI1ii1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                    }
/* 179 */                           if (responseCode < 500 || responseCode >= 600) {
/* 197 */                               Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
/* 203 */                               if (((byte) (0 | 1)) != 1) {
/* 235 */                                   throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                        }
/* 207 */                               i1lO0lOlOIi = new I1lO0lOlOIi();
/* 211 */                               i1lO0lOlOIi.I00000oIO = null;
/* 213 */                               i1lO0lOlOIi.I00000oOI = 0L;
/* 215 */                               i1lO0lOlOIi.I0000Il00O = 2;
/* 217 */                               VarHandle.storeStoreFence();
/* 220 */                               httpURLConnectionI0000Il00O.disconnect();
/* 223 */                               TrafficStats.clearThreadStatsTag();
/* 226 */                               i1lO0lOlOIiI0001Ioi1lo = i1lO0lOlOIi;
                                    }
                                }
                            }
/* 268 */                   int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i1lO0lOlOIiI0001Ioi1lo.I0000Il00O);
/* 272 */                   if (iI001lIiIIo1O == 0) {
/* 319 */                       String str5 = i1lO0lOlOIiI0001Ioi1lo.I00000oIO;
/* 321 */                       long j = i1lO0lOlOIiI0001Ioi1lo.I00000oOI;
/* 325 */                       this.I0000O.getClass();
/* 334 */                       long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
/* 335 */                       I1lI0iIOiOl i1lI0iIOiOlI00000oIO = i1lI11.I00000oIO();
/* 339 */                       i1lI0iIOiOlI00000oIO.I0000Il00O = str5;
/* 341 */                       i1lI0iIOiOlI00000oIO.I0000oI00 = j;
/* 346 */                       byte b = (byte) (i1lI0iIOiOlI00000oIO.I000O01llI0 | 1);
/* 347 */                       i1lI0iIOiOlI00000oIO.I0001Ioi1lo = jCurrentTimeMillis;
/* 352 */                       i1lI0iIOiOlI00000oIO.I000O01llI0 = (byte) (b | 2);
/* 354 */                       return i1lI0iIOiOlI00000oIO.I00000oIO();
                            }
/* 274 */                   if (iI001lIiIIo1O == 1) {
/* 305 */                       I1lI0iIOiOl i1lI0iIOiOlI00000oIO2 = i1lI11.I00000oIO();
/* 309 */                       i1lI0iIOiOlI00000oIO2.I000II = "BAD CONFIG";
/* 312 */                       i1lI0iIOiOlI00000oIO2.I00000oOI = 5;
/* 314 */                       return i1lI0iIOiOlI00000oIO2.I00000oIO();
                            }
/* 276 */                   if (iI001lIiIIo1O != 2) {
/* 302 */                       throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            synchronized (this) {
/* 280 */                       this.I000OiO = null;
                            }
/* 283 */                   I1lI0iIOiOl i1lI0iIOiOlI00000oIO3 = i1lI11.I00000oIO();
/* 287 */                   i1lI0iIOiOlI00000oIO3.I00000oOI = 2;
/* 289 */                   return i1lI0iIOiOlI00000oIO3.I00000oIO();
                        } finally {
/* 367 */                   httpURLConnectionI0000Il00O.disconnect();
/* 370 */                   TrafficStats.clearThreadStatsTag();
                        }
                    }
/* 383 */           throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                }

                public final o0IiOl I0000Il00O() {
                    String str;
/* 1 */             I0000oI00();
                    synchronized (this) {
/* 5 */                 str = this.I000OiO;
                    }
/* 8 */             if (str != null) {
/* 10 */                return lOio0o.I0000oI00(str);
                    }
/* 17 */            OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 22 */            Io01OlIO01 io01OlIO01 = new Io01OlIO01();
/* 25 */            io01OlIO01.I00000oIO = oloIlI0ll;
/* 27 */            VarHandle.storeStoreFence();
                    synchronized (this.I000II) {
/* 35 */                this.I000l1.add(io01OlIO01);
                    }
/* 39 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 41 */            ExecutorService executorService = this.I000O01llI0;
/* 46 */            IlO00oo1IIi0 ilO00oo1IIi0 = new IlO00oo1IIi0(0);
/* 49 */            ilO00oo1IIi0.I00iiI = this;
/* 51 */            VarHandle.storeStoreFence();
/* 54 */            executorService.execute(ilO00oo1IIi0);
/* 57 */            return o0iiol;
                }

                public final o0IiOl I0000O() {
/* 1 */             I0000oI00();
/* 6 */             OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 11 */            OolliI1oliO oolliI1oliO = this.I0000O;
/* 13 */            Io01IO io01IO = new Io01IO();
/* 16 */            io01IO.I00000oIO = oolliI1oliO;
/* 18 */            io01IO.I00000oOI = oloIlI0ll;
/* 20 */            VarHandle.storeStoreFence();
                    synchronized (this.I000II) {
/* 28 */                this.I000l1.add(io01IO);
                    }
/* 32 */            o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 34 */            ExecutorService executorService = this.I000O01llI0;
/* 39 */            IlO00oo1IIi0 ilO00oo1IIi0 = new IlO00oo1IIi0(2);
/* 42 */            ilO00oo1IIi0.I00iiI = this;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            executorService.execute(ilO00oo1IIi0);
/* 50 */            return o0iiol;
                }

                public final void I0000oI00() {
/* 1 */             IlIoliIO ilIoliIO = this.I00000oIO;
/* 3 */             ilIoliIO.I00000oIO();
/* 12 */            lII0I0I000I.I0000oI00(ilIoliIO.I0000Il00O.I00000oOI, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
/* 15 */            ilIoliIO.I00000oIO();
/* 24 */            lII0I0I000I.I0000oI00(ilIoliIO.I0000Il00O.I000O01llI0, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
/* 27 */            ilIoliIO.I00000oIO();
/* 36 */            lII0I0I000I.I0000oI00(ilIoliIO.I0000Il00O.I00000oIO, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
/* 39 */            ilIoliIO.I00000oIO();
/* 44 */            String str = ilIoliIO.I0000Il00O.I00000oOI;
/* 46 */            Pattern pattern = OolliI1oliO.I00000oIO;
/* 54 */            lII0I0I000I.I00000oIO("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
/* 57 */            ilIoliIO.I00000oIO();
/* 74 */            lII0I0I000I.I00000oIO("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", OolliI1oliO.I00000oIO.matcher(ilIoliIO.I0000Il00O.I00000oIO).matches());
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
                /* JADX WARN: Type inference failed for: r5v0, types: [IOoil1iiIilo, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I0001Ioi1lo(I1lI11 i1lI11) throws InvalidKeySpecException {
                    PublicKey publicKeyGeneratePublic;
/* 1 */             OOl1lo1111Ii oOl1lo1111Ii = this.I0001Ioi1lo;
/* 3 */             IlIoliIO ilIoliIO = this.I00000oIO;
/* 5 */             ilIoliIO.I00000oIO();
/* 8 */             String str = ilIoliIO.I00000oOI;
/* 16 */            if (!str.equals("CHIME_ANDROID_SDK")) {
/* 18 */                ilIoliIO.I00000oIO();
/* 27 */                if ("[DEFAULT]".equals(str)) {
/* 32 */                    if (i1lI11.I00000oOI == 1) {
/* 42 */                        O00lOo o00lOo = ((IoOoiiiOl) this.I0000oI00.get()).I00000oIO;
/* 44 */                        o00lOo.getClass();
/* 53 */                        String strEncodeToString = 0;
/* 53 */                        strEncodeToString = 0;
/* 53 */                        strEncodeToString = 0;
/* 55 */                        IiI110i1O iiI110i1O = new IiI110i1O(o00lOo, IoOoiiiOl.I0000O, strEncodeToString, strEncodeToString, 17);
/* 58 */                        Il00o11 il00o11 = Il00o11.I00iOIl;
/* 64 */                        String str2 = (String) iOi1IOoIO0l.I00000oIO(il00o11, iiI110i1O);
/* 66 */                        if (str2 != null) {
/* 68 */                            strEncodeToString = str2;
                                } else {
/* 86 */                            String str3 = (String) iOi1IOoIO0l.I00000oIO(il00o11, new IiI110i1O(o00lOo, IoOoiiiOl.I0000Il00O, strEncodeToString, strEncodeToString, 17));
/* 88 */                            if (str3 != null) {
                                        try {
/* 108 */                                   publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 8)));
                                        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
/* 129 */                                   Log.w("ContentValues", "Invalid key stored " + e);
/* 132 */                                   publicKeyGeneratePublic = null;
                                        }
/* 133 */                               if (publicKeyGeneratePublic != null) {
                                            try {
/* 146 */                                       byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
/* 160 */                                       bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
/* 164 */                                       strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                                            } catch (NoSuchAlgorithmException unused) {
/* 171 */                                       Log.w("ContentValues", "Unexpected error, device missing required algorithms");
                                            }
                                        }
                                    }
                                }
/* 178 */                       if (!TextUtils.isEmpty(strEncodeToString)) {
/* 187 */                           return strEncodeToString;
                                }
/* 180 */                       oOl1lo1111Ii.getClass();
/* 183 */                       return OOl1lo1111Ii.I00000oIO();
                            }
                        }
                    }
/* 188 */           oOl1lo1111Ii.getClass();
/* 191 */           return OOl1lo1111Ii.I00000oIO();
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
                
                    if (r6.startsWith("{") == false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
                
                    r6 = new org.json.JSONObject(r6).getString("token");
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I1lI11 I000II(I1lI11 i1lI11) throws JSONException, IlO0IilI1ii1 {
                    String string;
                    IOoil1iiIilo iOoil1iiIilo;
                    char c;
                    int responseCode;
                    I1l0lloO1l i1l0lloO1lI0000oI00;
/* 3 */             IlIoliIO ilIoliIO = this.I00000oIO;
/* 7 */             String str = i1lI11.I00000oIO;
/* 10 */            IOoil1iiIilo iOoil1iiIilo2 = null;
/* 11 */            if (str != null && str.length() == 11) {
/* 28 */                IoOoiiiOl ioOoiiiOl = (IoOoiiiOl) this.I0000oI00.get();
/* 30 */                ioOoiiiOl.getClass();
/* 33 */                int i = 0;
                        while (true) {
/* 34 */                    if (i >= 4) {
                                break;
                            }
/* 52 */                    OOI0IO111Ii oOI0IO111Ii = new OOI0IO111Ii(IIl001iO0Io.I000oI1ioi("|T|", ioOoiiiOl.I00000oOI, "|", IoOoiiiOl.I0000oI00[i]));
/* 55 */                    O00lOo o00lOo = ioOoiiiOl.I00000oIO;
/* 57 */                    o00lOo.getClass();
/* 74 */                    string = (String) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new IiI110i1O(o00lOo, oOI0IO111Ii, iOoil1iiIilo2, iOoil1iiIilo2, 17));
/* 76 */                    if (string != null && !string.isEmpty()) {
                                break;
                            }
/* 104 */                   i++;
                        }
                    } else {
/* 107 */               string = null;
                    }
/* 108 */           IlIolo11lo ilIolo11lo = this.I00000oOI;
/* 110 */           ilIoliIO.I00000oIO();
/* 115 */           String str2 = ilIoliIO.I0000Il00O.I00000oIO;
/* 117 */           ilIoliIO.I00000oIO();
/* 122 */           String str3 = ilIoliIO.I0000Il00O.I000O01llI0;
/* 124 */           ilIoliIO.I00000oIO();
/* 129 */           String str4 = ilIoliIO.I0000Il00O.I00000oOI;
/* 131 */           IooI0ilii iooI0ilii = ilIolo11lo.I0000Il00O;
/* 139 */           if (!iooI0ilii.I00000oIO()) {
/* 966 */               throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                    }
/* 160 */           URL urlI00000oIO = IlIolo11lo.I00000oIO("projects/" + str3 + "/installations");
/* 164 */           int i2 = 0;
/* 166 */           while (i2 <= 1) {
/* 171 */               TrafficStats.setThreadStatsTag(32769);
/* 174 */               HttpURLConnection httpURLConnectionI0000Il00O = ilIolo11lo.I0000Il00O(urlI00000oIO, str2);
                        try {
                            try {
/* 180 */                       httpURLConnectionI0000Il00O.setRequestMethod("POST");
/* 183 */                       httpURLConnectionI0000Il00O.setDoOutput(true);
/* 186 */                       if (string != null) {
/* 190 */                           httpURLConnectionI0000Il00O.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                                }
/* 202 */                       IlIolo11lo.I000II(httpURLConnectionI0000Il00O, str, str4);
/* 205 */                       responseCode = httpURLConnectionI0000Il00O.getResponseCode();
/* 209 */                       iooI0ilii.I00000oOI(responseCode);
                            } finally {
/* 397 */                       httpURLConnectionI0000Il00O.disconnect();
/* 400 */                       TrafficStats.clearThreadStatsTag();
                            }
                        } catch (IOException | AssertionError unused) {
/* 197 */                   iOoil1iiIilo = iOoil1iiIilo2;
                        }
/* 224 */               if (responseCode >= 200 && responseCode < 300) {
/* 226 */                   i1l0lloO1lI0000oI00 = IlIolo11lo.I0000oI00(httpURLConnectionI0000Il00O);
/* 230 */                   httpURLConnectionI0000Il00O.disconnect();
/* 233 */                   TrafficStats.clearThreadStatsTag();
                        } else {
                            try {
/* 239 */                       IlIolo11lo.I00000oOI(httpURLConnectionI0000Il00O, str4, str2, str3);
                            } catch (IOException | AssertionError unused2) {
/* 237 */                       iOoil1iiIilo = null;
                            }
/* 244 */                   if (responseCode == 429) {
/* 386 */                       iOoil1iiIilo = null;
/* 387 */                       c = 4;
                                try {
/* 396 */                           throw new IlO0IilI1ii1("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                } catch (IOException | AssertionError unused3) {
/* 410 */                           i2++;
/* 412 */                           iOoil1iiIilo2 = iOoil1iiIilo;
                                }
                            } else if (responseCode < 500 || responseCode >= 600) {
/* 269 */                       Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
/* 274 */                       I1l0lloO1l i1l0lloO1l = new I1l0lloO1l();
/* 277 */                       iOoil1iiIilo = null;
                                try {
/* 278 */                           i1l0lloO1l.I00000oIO = null;
/* 280 */                           i1l0lloO1l.I00000oOI = null;
/* 282 */                           i1l0lloO1l.I0000Il00O = null;
/* 284 */                           i1l0lloO1l.I0000O = null;
/* 286 */                           i1l0lloO1l.I0000oI00 = 2;
/* 288 */                           VarHandle.storeStoreFence();
/* 291 */                           httpURLConnectionI0000Il00O.disconnect();
/* 294 */                           TrafficStats.clearThreadStatsTag();
/* 297 */                           i1l0lloO1lI0000oI00 = i1l0lloO1l;
                                } catch (IOException | AssertionError unused4) {
/* 198 */                           c = 4;
/* 410 */                           i2++;
/* 412 */                           iOoil1iiIilo2 = iOoil1iiIilo;
                                }
                            } else {
/* 254 */                       httpURLConnectionI0000Il00O.disconnect();
/* 257 */                       TrafficStats.clearThreadStatsTag();
/* 260 */                       iOoil1iiIilo = null;
/* 261 */                       c = 4;
/* 410 */                       i2++;
/* 412 */                       iOoil1iiIilo2 = iOoil1iiIilo;
                            }
                        }
/* 300 */               int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(i1l0lloO1lI0000oI00.I0000oI00);
/* 304 */               if (iI001lIiIIo1O != 0) {
/* 307 */                   if (iI001lIiIIo1O != 1) {
/* 330 */                       throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                            }
/* 309 */                   I1lI0iIOiOl i1lI0iIOiOlI00000oIO = i1lI11.I00000oIO();
/* 315 */                   i1lI0iIOiOlI00000oIO.I000II = "BAD CONFIG";
/* 318 */                   i1lI0iIOiOlI00000oIO.I00000oOI = 5;
/* 320 */                   return i1lI0iIOiOlI00000oIO.I00000oIO();
                        }
/* 331 */               String str5 = i1l0lloO1lI0000oI00.I00000oOI;
/* 333 */               String str6 = i1l0lloO1lI0000oI00.I0000Il00O;
/* 337 */               this.I0000O.getClass();
/* 346 */               long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
/* 347 */               I1lO0lOlOIi i1lO0lOlOIi = i1l0lloO1lI0000oI00.I0000O;
/* 349 */               String str7 = i1lO0lOlOIi.I00000oIO;
/* 351 */               long j = i1lO0lOlOIi.I00000oOI;
/* 353 */               I1lI0iIOiOl i1lI0iIOiOlI00000oIO2 = i1lI11.I00000oIO();
/* 357 */               i1lI0iIOiOlI00000oIO2.I00000oIO = str5;
/* 360 */               i1lI0iIOiOlI00000oIO2.I00000oOI = 4;
/* 362 */               i1lI0iIOiOlI00000oIO2.I0000Il00O = str7;
/* 364 */               i1lI0iIOiOlI00000oIO2.I0000O = str6;
/* 366 */               i1lI0iIOiOlI00000oIO2.I0000oI00 = j;
/* 374 */               byte b = (byte) (i1lI0iIOiOlI00000oIO2.I000O01llI0 | 1);
/* 375 */               i1lI0iIOiOlI00000oIO2.I0001Ioi1lo = jCurrentTimeMillis;
/* 379 */               i1lI0iIOiOlI00000oIO2.I000O01llI0 = (byte) (b | 2);
/* 381 */               return i1lI0iIOiOlI00000oIO2.I00000oIO();
                    }
/* 422 */           throw new IlO0IilI1ii1("Firebase Installations Service is unavailable. Please try again later.");
                }

                public final void I000O01llI0(Exception exc) {
                    synchronized (this.I000II) {
                        try {
/* 6 */                     Iterator it = this.I000l1.iterator();
/* 14 */                    while (it.hasNext()) {
/* 26 */                        if (((OlO0oO1) it.next()).I00000oIO(exc)) {
/* 28 */                            it.remove();
                                }
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }

                public final void I000OOo1O(I1lI11 i1lI11) {
                    synchronized (this.I000II) {
                        try {
/* 6 */                     Iterator it = this.I000l1.iterator();
/* 14 */                    while (it.hasNext()) {
/* 26 */                        if (((OlO0oO1) it.next()).I00000oOI(i1lI11)) {
/* 28 */                            it.remove();
                                }
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }
            }
