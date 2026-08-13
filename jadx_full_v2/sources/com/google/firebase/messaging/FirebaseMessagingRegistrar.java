            package com.google.firebase.messaging;

            import android.app.Application;
            import android.content.Context;
            import android.util.Log;
            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import p000.I000II;
            import p000.I0Oi111ii;
            import p000.I101oOiOiI;
            import p000.I11O1IlIl1I;
            import p000.I1Io0i0II;
            import p000.I1ii1l10IO;
            import p000.I1ii1o0;
            import p000.I1l1000Io;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.Ii1oOil;
            import p000.IiIO0i100IO;
            import p000.IiIooooiilo;
            import p000.IlIII0O1il;
            import p000.IlIoliIO;
            import p000.IlO01o11oOOO;
            import p000.IlO0Ii1Il00o;
            import p000.IlO0O1;
            import p000.IlO0Oio;
            import p000.IlO0iIIo1l;
            import p000.IlO0lI01iol;
            import p000.Io0i00i0;
            import p000.Io1OoiO;
            import p000.OIiilo1Ool0o;
            import p000.OOiO0Il;
            import p000.OOiilOlOOI;
            import p000.OiI1lOO1O0i;
            import p000.OlOO1i11110;
            import p000.OliIolIIi;
            import p000.Oo1oliOoi0I;
            import p000.OoIOi0o1o;
            import p000.OoIOiO;
            import p000.i0i01Ii0iII;
            import p000.iO10oo0i1o;
            import p000.lOio0o;
            import p000.o0IiOl;
            
            public class FirebaseMessagingRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-fcm";

                private static FirebaseMessaging lambda$getComponents$0(OOiilOlOOI oOiilOlOOI, IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */            IlIoliIO ilIoliIO = (IlIoliIO) iOiOIoiiO0i.I00000oIO(IlIoliIO.class);
/* 19 */            if (iOiOIoiiO0i.I00000oIO(IlO0O1.class) != null) {
/* 420 */               OIiilo1Ool0o.I00000oIO();
/* 423 */               return null;
                    }
/* 23 */            OOiO0Il oOiO0IlI0001Ioi1lo = iOiOIoiiO0i.I0001Ioi1lo(IiIO0i100IO.class);
/* 29 */            OOiO0Il oOiO0IlI0001Ioi1lo2 = iOiOIoiiO0i.I0001Ioi1lo(Io1OoiO.class);
/* 39 */            IlO0Ii1Il00o ilO0Ii1Il00o = (IlO0Ii1Il00o) iOiOIoiiO0i.I00000oIO(IlO0Ii1Il00o.class);
/* 43 */            OOiO0Il oOiO0IlI000OiO = iOiOIoiiO0i.I000OiO(oOiilOlOOI);
/* 53 */            OliIolIIi oliIolIIi = (OliIolIIi) iOiOIoiiO0i.I00000oIO(OliIolIIi.class);
/* 57 */            ilIoliIO.I00000oIO();
/* 60 */            Context context = ilIoliIO.I00000oIO;
/* 62 */            I101oOiOiI i101oOiOiI = new I101oOiOiI();
/* 66 */            i101oOiOiI.I00000oOI = 0;
/* 68 */            i101oOiOiI.I0000Il00O = context;
/* 70 */            VarHandle.storeStoreFence();
/* 77 */            ilIoliIO.I00000oIO();
/* 82 */            OiI1lOO1O0i oiI1lOO1O0i = new OiI1lOO1O0i(ilIoliIO.I00000oIO);
/* 87 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(8);
/* 90 */            i0Oi111ii.I00iiI = ilIoliIO;
/* 92 */            i0Oi111ii.I00iiO = i101oOiOiI;
/* 94 */            i0Oi111ii.I00iio = oiI1lOO1O0i;
/* 96 */            i0Oi111ii.I00ilI0I1 = oOiO0IlI0001Ioi1lo;
/* 98 */            i0Oi111ii.I00ilO0 = oOiO0IlI0001Ioi1lo2;
/* 100 */           i0Oi111ii.I00io1l = ilO0Ii1Il00o;
/* 102 */           VarHandle.storeStoreFence();
/* 113 */           ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new iO10oo0i1o("Firebase-Messaging-Task", 5));
/* 127 */           ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new iO10oo0i1o("Firebase-Messaging-Init", 5));
/* 153 */           ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new iO10oo0i1o("Firebase-Messaging-File-Io", 5));
/* 156 */           FirebaseMessaging firebaseMessaging = new FirebaseMessaging();
/* 159 */           firebaseMessaging.I000iOII = false;
/* 161 */           FirebaseMessaging.I000lI = oOiO0IlI000OiO;
/* 163 */           firebaseMessaging.I00000oIO = ilIoliIO;
/* 167 */           I1ii1l10IO i1ii1l10IO = new I1ii1l10IO();
/* 170 */           i1ii1l10IO.I0000O = firebaseMessaging;
/* 172 */           i1ii1l10IO.I00000oOI = oliIolIIi;
/* 174 */           VarHandle.storeStoreFence();
/* 177 */           firebaseMessaging.I0001Ioi1lo = i1ii1l10IO;
/* 179 */           ilIoliIO.I00000oIO();
/* 182 */           Context context2 = ilIoliIO.I00000oIO;
/* 184 */           firebaseMessaging.I00000oOI = context2;
/* 188 */           IlIII0O1il ilIII0O1il = new IlIII0O1il(0);
/* 198 */           ilIII0O1il.I00iiI = new ArrayDeque(10);
/* 200 */           VarHandle.storeStoreFence();
/* 203 */           firebaseMessaging.I000OOo1O = i101oOiOiI;
/* 205 */           firebaseMessaging.I0000Il00O = i0Oi111ii;
/* 207 */           firebaseMessaging.I000OiO = ilO0Ii1Il00o;
/* 221 */           i0i01Ii0iII i0i01ii0iii = new i0i01Ii0iII(context2, i0i01Ii0iII.I000o00OoI0I, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
/* 224 */           I1ii1o0 i1ii1o0 = new I1ii1o0(8, false);
/* 227 */           i1ii1o0.I00iiI = i0i01ii0iii;
/* 229 */           i1ii1o0.I00iiO = ilIoliIO;
/* 231 */           i1ii1o0.I00iio = ilO0Ii1Il00o;
/* 233 */           i1ii1o0.I00ilI0I1 = i0Oi111ii;
/* 235 */           i1ii1o0.I00ilO0 = i101oOiOiI;
/* 237 */           VarHandle.storeStoreFence();
/* 240 */           firebaseMessaging.I0000O = i1ii1o0;
/* 246 */           OlOO1i11110 olOO1i11110 = new OlOO1i11110(24);
/* 254 */           olOO1i11110.I00iiO = new I1Io0i0II(0);
/* 256 */           olOO1i11110.I00iiI = executorServiceNewSingleThreadExecutor;
/* 258 */           VarHandle.storeStoreFence();
/* 261 */           firebaseMessaging.I0000oI00 = olOO1i11110;
/* 263 */           firebaseMessaging.I000II = scheduledThreadPoolExecutor;
/* 265 */           firebaseMessaging.I000O01llI0 = threadPoolExecutor;
/* 267 */           ilIoliIO.I00000oIO();
/* 270 */           Context context3 = ilIoliIO.I00000oIO;
/* 274 */           if (context3 instanceof Application) {
/* 280 */               ((Application) context3).registerActivityLifecycleCallbacks(ilIII0O1il);
                    } else {
/* 305 */               Log.w("FirebaseMessaging", "Context " + context3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
                    }
/* 312 */           if (i1ii1o0.I00IioO0OiOi()) {
/* 316 */               IlO0Oio ilO0Oio = new IlO0Oio();
/* 319 */               ilO0Oio.I00000oIO = firebaseMessaging;
/* 321 */               VarHandle.storeStoreFence();
/* 325 */               IlO01o11oOOO ilO01o11oOOO = (IlO01o11oOOO) ilO0Ii1Il00o;
                        synchronized (ilO01o11oOOO) {
/* 330 */                   ilO01o11oOOO.I000iOII.add(ilO0Oio);
                        }
                    }
/* 340 */           IlO0iIIo1l ilO0iIIo1l = new IlO0iIIo1l(0);
/* 343 */           ilO0iIIo1l.I00iiI = firebaseMessaging;
/* 345 */           VarHandle.storeStoreFence();
/* 348 */           scheduledThreadPoolExecutor.execute(ilO0iIIo1l);
/* 362 */           ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new iO10oo0i1o("Firebase-Messaging-Topics-Io", 5));
/* 367 */           Oo1oliOoi0I oo1oliOoi0I = new Oo1oliOoi0I();
/* 370 */           oo1oliOoi0I.I00000oIO = context2;
/* 372 */           oo1oliOoi0I.I00000oOI = scheduledThreadPoolExecutor2;
/* 374 */           oo1oliOoi0I.I0000Il00O = i101oOiOiI;
/* 376 */           oo1oliOoi0I.I0000O = ilIoliIO;
/* 378 */           oo1oliOoi0I.I0000oI00 = firebaseMessaging;
/* 380 */           oo1oliOoi0I.I0001Ioi1lo = ilO0Ii1Il00o;
/* 382 */           VarHandle.storeStoreFence();
/* 385 */           o0IiOl o0iiolI0000Il00O = lOio0o.I0000Il00O(oo1oliOoi0I, scheduledThreadPoolExecutor2);
/* 391 */           IlO0lI01iol ilO0lI01iol = new IlO0lI01iol(0);
/* 394 */           ilO0lI01iol.I00iiI = firebaseMessaging;
/* 396 */           VarHandle.storeStoreFence();
/* 399 */           o0iiolI0000Il00O.I0000oI00(scheduledThreadPoolExecutor, ilO0lI01iol);
/* 405 */           IlO0iIIo1l ilO0iIIo1l2 = new IlO0iIIo1l(1);
/* 408 */           ilO0iIIo1l2.I00iiI = firebaseMessaging;
/* 410 */           VarHandle.storeStoreFence();
/* 413 */           scheduledThreadPoolExecutor.execute(ilO0iIIo1l2);
/* 416 */           VarHandle.storeStoreFence();
/* 419 */           return firebaseMessaging;
                }

                @Override
                public List<IOiIi0Oi> getComponents() {
/* 7 */             OOiilOlOOI oOiilOlOOI = new OOiilOlOOI(OoIOi0o1o.class, OoIOiO.class);
/* 12 */            IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(FirebaseMessaging.class);
/* 18 */            iOiIOOl0lOI00000oOI.I00000oIO = LIBRARY_NAME;
/* 26 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(IlIoliIO.class));
/* 37 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(0, 0, IlO0O1.class));
/* 48 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(0, 1, IiIO0i100IO.class));
/* 58 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(0, 1, Io1OoiO.class));
/* 67 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(IlO0Ii1Il00o.class));
/* 75 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(oOiilOlOOI, 0, 1));
/* 84 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(OliIolIIi.class));
/* 89 */            Ii1oOil ii1oOil = new Ii1oOil(1);
/* 92 */            ii1oOil.I00iiI = oOiilOlOOI;
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = ii1oOil;
/* 104 */           if (iOiIOOl0lOI00000oOI.I0000O == 0) {
/* 106 */               iOiIOOl0lOI00000oOI.I0000O = 1;
/* 128 */               return Arrays.asList(iOiIOOl0lOI00000oOI.I00000oOI(), IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO(LIBRARY_NAME, "25.1.1")));
                    }
/* 135 */           I000II.I001IO000("Instantiation type has already been set.");
/* 138 */           return null;
                }
            }
