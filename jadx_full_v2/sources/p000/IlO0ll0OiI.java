            package p000;

            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadPoolExecutor;
            
            public final class IlO0ll0OiI implements OliOio1iiOI {
                public FirebaseMessaging I00iOIl;
                public String I00iiI;
                public O1Il01 I00iiO;

                public o0IiOl I00000oIO() {
                    o0IiOl o0iiolI0000O;
                    o0IiOl o0iiolI000iOII;
                    int i;
/* 1 */             FirebaseMessaging firebaseMessaging = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
/* 5 */             O1Il01 o1Il01 = this.I00iiO;
/* 7 */             I1ii1o0 i1ii1o0 = firebaseMessaging.I0000O;
/* 9 */             boolean zI00IioO0OiOi = i1ii1o0.I00IioO0OiOi();
/* 13 */            if (!zI00IioO0OiOi || ((I101oOiOiI) i1ii1o0.I00ilO0).I0000O() < 261200000) {
/* 72 */                I0Oi111ii i0Oi111ii = (I0Oi111ii) i1ii1o0.I00ilI0I1;
/* 78 */                String strI0000Il00O = I101oOiOiI.I0000Il00O((IlIoliIO) i0Oi111ii.I00iiI);
/* 84 */                Bundle bundle = new Bundle();
                        try {
/* 88 */                    i0Oi111ii.I00IoO0(strI0000Il00O, bundle, zI00IioO0OiOi);
/* 93 */                    OiI1lOO1O0i oiI1lOO1O0i = (OiI1lOO1O0i) i0Oi111ii.I00iio;
/* 95 */                    Iii11l iii11l = Iii11l.I00iio;
/* 97 */                    IoOi0looIo ioOi0looIo = oiI1lOO1O0i.I0000Il00O;
/* 106 */                   if (ioOi0looIo.I001i1O0Ol() >= 12000000) {
/* 151 */                       o00io0IiOOo0 o00io0iiooo0I000II = o00io0IiOOo0.I000II(oiI1lOO1O0i.I00000oOI);
                                synchronized (o00io0iiooo0I000II) {
/* 158 */                           i = o00io0iiooo0I000II.I00iiI;
/* 162 */                           o00io0iiooo0I000II.I00iiI = i + 1;
                                }
/* 174 */                       o0iiolI0000O = o00io0iiooo0I000II.I000O01llI0(new lli1OiO(i, 1, bundle, 1)).I000iOII(iii11l, looil0O1Io1.I00l0OO0IO);
                            } else if (ioOi0looIo.I001IO000() != 0) {
/* 114 */                       o0IiOl o0iiolI00000oOI = oiI1lOO1O0i.I00000oOI(bundle);
/* 122 */                       OoIol00Ool ooIol00Ool = new OoIol00Ool(16);
/* 125 */                       ooIol00Ool.I00iiI = oiI1lOO1O0i;
/* 127 */                       ooIol00Ool.I00iiO = bundle;
/* 129 */                       VarHandle.storeStoreFence();
/* 132 */                       o0iiolI0000O = o0iiolI00000oOI.I000l1(iii11l, ooIol00Ool);
                            } else {
/* 144 */                       o0iiolI0000O = lOio0o.I0000O(new IOException("MISSING_INSTANCEID_SERVICE"));
                            }
                        } catch (InterruptedException | ExecutionException e) {
/* 183 */                   o0iiolI0000O = lOio0o.I0000O(e);
                        }
/* 189 */               I1Ii1lIoOI i1Ii1lIoOI = new I1Ii1lIoOI(1);
/* 196 */               IioIoO10iOiI iioIoO10iOiI = new IioIoO10iOiI(23);
/* 199 */               VarHandle.storeStoreFence();
/* 202 */               o0iiolI000iOII = o0iiolI0000O.I000iOII(i1Ii1lIoOI, iioIoO10iOiI);
                    } else {
/* 36 */                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new iO10oo0i1o("Firebase-Messaging-Network-Io", 5));
/* 46 */                o0IiOl o0iiolI0000Il00O = ((IlO01o11oOOO) ((IlO0Ii1Il00o) i1ii1o0.I00iio)).I0000Il00O();
/* 54 */                IIoIil iIoIil = new IIoIil(8);
/* 57 */                iIoIil.I00iiI = i1ii1o0;
/* 59 */                iIoIil.I00iiO = executorServiceNewSingleThreadExecutor;
/* 61 */                VarHandle.storeStoreFence();
/* 64 */                o0iiolI000iOII = o0iiolI0000Il00O.I000l1(executorServiceNewSingleThreadExecutor, iIoIil);
                    }
/* 206 */           ThreadPoolExecutor threadPoolExecutor = firebaseMessaging.I000O01llI0;
/* 210 */           IlO0ll0OiI ilO0ll0OiI = new IlO0ll0OiI();
/* 213 */           ilO0ll0OiI.I00iOIl = firebaseMessaging;
/* 215 */           ilO0ll0OiI.I00iiI = str;
/* 217 */           ilO0ll0OiI.I00iiO = o1Il01;
/* 219 */           VarHandle.storeStoreFence();
/* 224 */           o0IiOl o0iiol = new o0IiOl();
/* 234 */           o0iiolI000iOII.I00000oOI.I000l1(new l0IIioiIOIo(threadPoolExecutor, ilO0ll0OiI, o0iiol));
/* 237 */           o0iiolI000iOII.I0010I0i();
/* 541 */           return o0iiol;
                }

                @Override
                public OloIIoII1oo then(Object obj) {
/* 1 */             FirebaseMessaging firebaseMessaging = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
/* 5 */             O1Il01 o1Il01 = this.I00iiO;
/* 7 */             String str2 = (String) obj;
/* 11 */            Oi0Oooi oi0OooiI0000Il00O = FirebaseMessaging.I0000Il00O(firebaseMessaging.I00000oOI);
/* 17 */            IlIoliIO ilIoliIO = firebaseMessaging.I00000oIO;
/* 19 */            ilIoliIO.I00000oIO();
/* 33 */            String strI0000Il00O = "[DEFAULT]".equals(ilIoliIO.I00000oOI) ? "" : ilIoliIO.I0000Il00O();
/* 39 */            String strI00000oOI = firebaseMessaging.I000OOo1O.I00000oOI();
                    synchronized (oi0OooiI0000Il00O) {
/* 48 */                String strI000II = O1Il01.I000II(System.currentTimeMillis(), str2, strI00000oOI);
/* 52 */                if (strI000II != null) {
/* 60 */                    SharedPreferences.Editor editorEdit = ((SharedPreferences) oi0OooiI0000Il00O.I00iiI).edit();
/* 86 */                    editorEdit.putString(strI0000Il00O + "|T|" + str + "|*", strI000II);
/* 89 */                    editorEdit.commit();
                        }
                    }
/* 99 */            if (firebaseMessaging.I0000O.I00IioO0OiOi() || o1Il01 == null || !str2.equals((String) o1Il01.I00iiI)) {
/* 115 */               IlIoliIO ilIoliIO2 = firebaseMessaging.I00000oIO;
/* 117 */               ilIoliIO2.I00000oIO();
/* 126 */               if ("[DEFAULT]".equals(ilIoliIO2.I00000oOI)) {
/* 136 */                   if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 138 */                       ilIoliIO2.I00000oIO();
                            }
/* 143 */                   boolean zI00IioO0OiOi = firebaseMessaging.I0000O.I00IioO0OiOi();
/* 149 */                   Intent intent = new Intent();
/* 154 */                   intent.putExtra("token", str2);
/* 157 */                   if (zI00IioO0OiOi) {
/* 161 */                       intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                            } else {
/* 167 */                       intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                            }
/* 177 */                   new IIlio101Io(firebaseMessaging.I00000oOI).I00ooiO1I(intent);
                        }
                    }
/* 180 */           return lOio0o.I0000oI00(str2);
                }
            }
