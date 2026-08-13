            package p000;

            import android.text.TextUtils;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.io.IOException;
            import java.util.Iterator;
            import org.json.JSONException;
            
            public final class IlO00oo1IIi0 implements Runnable {
                public final int I00iOIl;
                public IlO01o11oOOO I00iiI;

                public IlO00oo1IIi0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Finally extract failed */
                @Override
                public final void run() throws JSONException {
                    I1lI11 i1lI11I00Oio;
                    I1lI11 i1lI11I000II;
/* 1 */             int i = this.I00iOIl;
/* 3 */             IlO01o11oOOO ilO01o11oOOO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 271 */                   ilO01o11oOOO.I00000oIO();
/* 274 */                   return;
                        case 1:
/* 12 */                    Object obj = IlO01o11oOOO.I000lI;
                            synchronized (obj) {
                                try {
/* 15 */                            IlIoliIO ilIoliIO = ilO01o11oOOO.I00000oIO;
/* 17 */                            ilIoliIO.I00000oIO();
/* 22 */                            OlOO1i11110 olOO1i11110I0000O = OlOO1i11110.I0000O(ilIoliIO.I00000oIO);
                                    try {
/* 28 */                                i1lI11I00Oio = ilO01o11oOOO.I0000Il00O.I00Oio();
/* 32 */                                if (olOO1i11110I0000O != null) {
/* 34 */                                    olOO1i11110I0000O.I00111O();
                                        }
                                    } catch (Throwable th) {
/* 263 */                               if (olOO1i11110I0000O != null) {
/* 265 */                                   olOO1i11110I0000O.I00111O();
                                        }
/* 268 */                               throw th;
                                    }
                                } finally {
                                }
                            }
                            try {
/* 42 */                        int i2 = i1lI11I00Oio.I00000oOI;
/* 53 */                        if (i2 == 5) {
/* 79 */                            i1lI11I000II = ilO01o11oOOO.I000II(i1lI11I00Oio);
                                } else {
/* 60 */                            if (i2 == 3) {
/* 79 */                                i1lI11I000II = ilO01o11oOOO.I000II(i1lI11I00Oio);
                                    } else if (!ilO01o11oOOO.I0000O.I00000oOI(i1lI11I00Oio)) {
/* 261 */                               return;
                                    } else {
/* 71 */                                i1lI11I000II = ilO01o11oOOO.I00000oOI(i1lI11I00Oio);
                                    }
                                }
                                synchronized (obj) {
                                    try {
/* 84 */                                IlIoliIO ilIoliIO2 = ilO01o11oOOO.I00000oIO;
/* 86 */                                ilIoliIO2.I00000oIO();
/* 91 */                                OlOO1i11110 olOO1i11110I0000O2 = OlOO1i11110.I0000O(ilIoliIO2.I00000oIO);
                                        try {
/* 97 */                                    ilO01o11oOOO.I0000Il00O.I00OI1(i1lI11I000II);
/* 100 */                                   if (olOO1i11110I0000O2 != null) {
/* 102 */                                       olOO1i11110I0000O2.I00111O();
                                            }
                                        } catch (Throwable th2) {
/* 250 */                                   if (olOO1i11110I0000O2 != null) {
/* 252 */                                       olOO1i11110I0000O2.I00111O();
                                            }
/* 255 */                                   throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (ilO01o11oOOO) {
/* 118 */                           boolean z = i1lI11I000II.I00000oOI == 4;
/* 119 */                           String str = i1lI11I000II.I00000oIO;
/* 121 */                           if (z && !TextUtils.isEmpty(str)) {
/* 135 */                               if (TextUtils.equals(i1lI11I00Oio.I00000oIO, str)) {
                                            z = !(i1lI11I00Oio.I00000oOI == 4);
                                        } else {
/* 137 */                                   z = true;
                                        }
                                    }
/* 145 */                           if (z) {
/* 149 */                               Iterator it = ilO01o11oOOO.I000iOII.iterator();
/* 157 */                               while (it.hasNext()) {
/* 165 */                                   FirebaseMessaging firebaseMessaging = ((IlO0Oio) it.next()).I00000oIO;
/* 171 */                                   if (firebaseMessaging.I0000O() != null) {
/* 176 */                                       Log.isLoggable("FirebaseMessaging", 3);
                                                synchronized (firebaseMessaging) {
/* 182 */                                           if (!firebaseMessaging.I000iOII) {
/* 186 */                                               firebaseMessaging.I000II(0L);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
/* 201 */                       if (i1lI11I000II.I00000oOI == 4) {
/* 203 */                           String str2 = i1lI11I000II.I00000oIO;
                                    synchronized (ilO01o11oOOO) {
/* 206 */                               ilO01o11oOOO.I000OiO = str2;
                                    }
                                }
/* 213 */                       int i3 = i1lI11I000II.I00000oOI;
/* 215 */                       if (i3 == 5) {
/* 222 */                           ilO01o11oOOO.I000O01llI0(new IlO0IilI1ii1());
/* 261 */                           return;
                                } else if (i3 == 2 || i3 == 1) {
/* 243 */                           ilO01o11oOOO.I000O01llI0(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
/* 261 */                           return;
                                } else {
/* 232 */                           ilO01o11oOOO.I000OOo1O(i1lI11I000II);
/* 261 */                           return;
                                }
                            } catch (IlO0IilI1ii1 e) {
/* 258 */                       ilO01o11oOOO.I000O01llI0(e);
/* 261 */                       return;
                            }
                        default:
/* 8 */                     ilO01o11oOOO.I00000oIO();
/* 11 */                    return;
                    }
                }
            }
