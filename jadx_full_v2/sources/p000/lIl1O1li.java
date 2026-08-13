            package p000;

            import android.app.Application;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.EnumMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Objects;
            import java.util.PriorityQueue;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lIl1O1li extends iolOI0li {
                public IlIII0O1il I00iiO;
                public OoOlO1O0o I00iio;
                public CopyOnWriteArraySet I00ilI0I1;
                public boolean I00ilO0;
                public AtomicReference I00io1l;
                public Object I00ioIO;
                public boolean I00l0I0l0lO1;
                public int I00l0OO0IO;
                public l1o00OIlII I00li1OI;
                public l1o00OIlII I00ll1;
                public PriorityQueue I00lli11;
                public l1ioIO011Oo I00lll10;
                public AtomicLong I00o0iI0io1;
                public long I00o0l1o1o0;
                public iili011O1 I00o101lO;
                public boolean I00oI0i;
                public l1o00OIlII I00oII;
                public lIiOOollI0O I00oIiI10;
                public l1o00OIlII I00oO101o;
                public i1Il01 I00oOio10iI1;

                @Override
                public final boolean I010iIIOlo() {
/* 1 */             return false;
                }

                public final void I010ioo(String str, String str2, Bundle bundle) {
                    long jElapsedRealtime;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             l0olllo1i.I00li1OI.getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 23 */            if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 27 */                l0olllo1i.I00li1OI.getClass();
/* 30 */                jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
/* 36 */                jElapsedRealtime = 0;
                    }
/* 45 */            I010l10O(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
                
                    if (r2 > 500) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
                
                    if (r6 > 500) goto L36;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l10O(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
/* 15 */            Bundle bundle2 = bundle == null ? new Bundle() : bundle;
/* 28 */            if (!Objects.equals(str2, "screen_view")) {
/* 363 */               boolean z3 = !z2 || this.I00iio == null || lioil0ilIOi.I01I1Oo0oll(str2);
/* 369 */               String str3 = str == null ? "app" : str;
/* 383 */               long j3 = true == ((l0olllO1i) this.I00iOIl).I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii) ? j2 : 0L;
/* 390 */               Bundle bundle3 = new Bundle(bundle2);
/* 405 */               for (String str4 : bundle3.keySet()) {
/* 413 */                   Object obj = bundle3.get(str4);
/* 419 */                   if (obj instanceof Bundle) {
/* 428 */                       bundle3.putBundle(str4, new Bundle((Bundle) obj));
                            } else if (obj instanceof Parcelable[]) {
/* 436 */                       Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 440 */                       for (int i = 0; i < parcelableArr.length; i++) {
/* 442 */                           Parcelable parcelable = parcelableArr[i];
/* 446 */                           if (parcelable instanceof Bundle) {
/* 455 */                               parcelableArr[i] = new Bundle((Bundle) parcelable);
                                    }
                                }
                            } else if (obj instanceof List) {
/* 464 */                       List list = (List) obj;
/* 471 */                       for (int i2 = 0; i2 < list.size(); i2++) {
/* 473 */                           Object obj2 = list.get(i2);
/* 479 */                           if (obj2 instanceof Bundle) {
/* 488 */                               list.set(i2, new Bundle((Bundle) obj2));
                                    }
                                }
                            }
                        }
/* 498 */               l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 500 */               l0olllO1i.I000II(l0o10ooo0);
/* 505 */               lI00ol1liI li00ol1lii = new lI00ol1liI();
/* 508 */               li00ol1lii.I00iOIl = str3;
/* 510 */               li00ol1lii.I00iiI = str2;
/* 514 */               li00ol1lii.I00iiO = j;
/* 516 */               li00ol1lii.I00iio = j3;
/* 518 */               li00ol1lii.I00ilI0I1 = bundle3;
/* 520 */               li00ol1lii.I00ilO0 = z2;
/* 522 */               li00ol1lii.I00io1l = z3;
/* 526 */               li00ol1lii.I00ioIO = z;
/* 528 */               li00ol1lii.I00l0I0l0lO1 = this;
/* 530 */               VarHandle.storeStoreFence();
/* 533 */               l0o10ooo0.I010o0o0oO(li00ol1lii);
/* 965 */               return;
                    }
/* 32 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 34 */            lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 36 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 52 */            long j4 = true != l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii) ? 0L : j2;
                    synchronized (lo0liio0.I00ll1) {
                        try {
/* 59 */                    if (!lo0liio0.I00li1OI) {
/* 65 */                        l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lo0liio0.I00iOIl).I00ilO0;
/* 67 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 74 */                        l01o0io1ooo0.I00li1OI.I00000oOI("Cannot log screen view event when the app is in the background.");
/* 78 */                        return;
                            }
/* 84 */                    String string = bundle2.getString("screen_name");
/* 90 */                    if (string != null) {
/* 96 */                        if (string.length() > 0) {
/* 98 */                            int length = string.length();
/* 108 */                           ((l0olllO1i) lo0liio0.I00iOIl).I00iio.getClass();
                                }
/* 117 */                       l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) lo0liio0.I00iOIl).I00ilO0;
/* 119 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 134 */                       l01o0io1ooo02.I00li1OI.I0000Il00O("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
/* 138 */                       return;
                            }
/* 141 */                   String string2 = bundle2.getString("screen_class");
/* 145 */                   if (string2 != null) {
/* 151 */                       if (string2.length() > 0) {
/* 153 */                           int length2 = string2.length();
/* 163 */                           ((l0olllO1i) lo0liio0.I00iOIl).I00iio.getClass();
                                }
/* 172 */                       l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) lo0liio0.I00iOIl).I00ilO0;
/* 174 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 189 */                       l01o0io1ooo03.I00li1OI.I0000Il00O("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
/* 193 */                       return;
                            }
/* 194 */                   if (string2 == null) {
/* 196 */                       il1l0io1O il1l0io1o = lo0liio0.I00io1l;
/* 208 */                       string2 = il1l0io1o != null ? lo0liio0.I010l10O(il1l0io1o.I00iiI) : "Activity";
                            }
/* 206 */                   String str5 = string2;
/* 211 */                   lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 215 */                   if (lo0liio0.I00ioIO && liol0ili1oi != null) {
/* 219 */                       lo0liio0.I00ioIO = false;
/* 223 */                       boolean zEquals = Objects.equals(liol0ili1oi.I00000oOI, str5);
/* 229 */                       boolean zEquals2 = Objects.equals(liol0ili1oi.I00000oIO, string);
/* 233 */                       if (zEquals && zEquals2) {
/* 241 */                           l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) lo0liio0.I00iOIl).I00ilO0;
/* 243 */                           l0olllO1i.I000II(l01o0io1ooo04);
/* 250 */                           l01o0io1ooo04.I00li1OI.I00000oOI("Ignoring call to log screen view event with duplicate parameters.");
/* 254 */                           return;
                                }
                            }
/* 258 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) lo0liio0.I00iOIl;
/* 260 */                   l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i2.I00ilO0;
/* 262 */                   l0olllO1i.I000II(l01o0io1ooo05);
/* 275 */                   l01o0io1ooo05.I00lll10.I0000O(string == null ? "null" : string, "Logging screen view with name, class", str5);
/* 285 */                   lIol0ili1Oi liol0ili1oi2 = lo0liio0.I00iiO == null ? lo0liio0.I00iio : lo0liio0.I00iiO;
/* 289 */                   lioil0ilIOi lioil0ilioi = l0olllo1i2.I00l0I0l0lO1;
/* 291 */                   l0olllO1i.I0000oI00(lioil0ilioi);
/* 301 */                   lIol0ili1Oi liol0ili1oi3 = new lIol0ili1Oi(string, str5, lioil0ilioi.I01OIo(), true, j, j4);
/* 304 */                   lo0liio0.I00iiO = liol0ili1oi3;
/* 306 */                   lo0liio0.I00iio = liol0ili1oi2;
/* 308 */                   lo0liio0.I00l0I0l0lO1 = liol0ili1oi3;
/* 312 */                   l0olllo1i2.I00li1OI.getClass();
/* 315 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 319 */                   l0o10OoO0 l0o10ooo02 = l0olllo1i2.I00io1l;
/* 321 */                   l0olllO1i.I000II(l0o10ooo02);
/* 327 */                   Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(3);
/* 330 */                   oo1ooo0ollI.I00iiO = bundle2;
/* 332 */                   oo1ooo0ollI.I00iio = liol0ili1oi3;
/* 334 */                   oo1ooo0ollI.I00ilI0I1 = liol0ili1oi2;
/* 336 */                   oo1ooo0ollI.I00iiI = jElapsedRealtime;
/* 338 */                   oo1ooo0ollI.I00ilO0 = lo0liio0;
/* 340 */                   VarHandle.storeStoreFence();
/* 343 */                   l0o10ooo02.I010o0o0oO(oo1ooo0ollI);
                        } catch (Throwable th) {
/* 348 */                   throw th;
                        }
                    }
                }

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                    	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                    	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                    	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                    	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                    */
                public final void I010l1O() {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                        */
                    /*
                        Method dump skipped, instructions count: 1372
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.lIl1O1li.I010l1O():void");
                }

                public final void I010l1ol111(String str, String str2, Bundle bundle) {
                    long jElapsedRealtime;
/* 1 */             I010II();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 10 */            l0olllo1i.I00li1OI.getClass();
/* 13 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 26 */            if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 30 */                l0olllo1i.I00li1OI.getClass();
/* 33 */                jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
/* 43 */                jElapsedRealtime = 0;
                    }
/* 46 */            I010lI0oi(str, str2, jCurrentTimeMillis, jElapsedRealtime, bundle);
                }

                public final void I010lI0oi(String str, String str2, long j, long j2, Bundle bundle) {
/* 1 */             I010II();
/* 6 */             boolean z = true;
/* 7 */             if (this.I00iio != null && !lioil0ilIOi.I01I1Oo0oll(str2)) {
/* 17 */                z = false;
                    }
/* 29 */            I010o0o0oO(str, str2, j, j2, bundle, true, z, true);
                }

                /* JADX WARN: Removed duplicated region for block: B:143:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x03d4  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x03ea  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0440  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010o0o0oO(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    iIl1iil iil1iil;
                    Iioi0lilII iioi0lilII;
                    lioil0ilIOi lioil0ilioi;
                    l01O0IO1ooO0 l01o0io1ooo0;
                    i1Il01 i1il01;
                    String str3;
                    lIl1O1li lil1o1li;
                    l0Oi0o l0oi0o;
                    lioil0ilIOi lioil0ilioi2;
                    l0olllO1i l0olllo1i;
                    boolean z4;
                    long j3;
                    boolean zI00000oIO;
                    long j4;
                    long j5;
                    String str4;
                    lO0liIO0 lo0liio0;
                    lioil0ilIOi lioil0ilioi3;
                    l01O0IO1ooO0 l01o0io1ooo02;
                    String str5;
                    int i;
                    int i2;
                    int size;
                    int i3;
                    int i4;
                    boolean zI010l1ol111;
                    ArrayList arrayList;
                    Bundle[] bundleArr;
                    int i5;
                    int i6;
/* 3 */             String str6 = str;
/* 13 */            i1Il01 i1il012 = this.I00oOio10iI1;
/* 15 */            lII0I0I000I.I0000O(str6);
/* 18 */            lII0I0I000I.I000II(bundle);
/* 21 */            I010II();
/* 24 */            I010OIo1l();
/* 30 */            l0olllO1i l0olllo1i2 = (l0olllO1i) this.I00iOIl;
/* 32 */            boolean zI00000oIO2 = l0olllo1i2.I00000oIO();
/* 36 */            li10O1l0 li10o1l0 = l0olllo1i2.I00ioIO;
/* 38 */            iIl1iil iil1iil2 = l0olllo1i2.I00iio;
/* 40 */            Context context = l0olllo1i2.I00iOIl;
/* 42 */            lioil0ilIOi lioil0ilioi4 = l0olllo1i2.I00l0I0l0lO1;
/* 44 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 46 */            if (!zI00000oIO2) {
/* 1359 */              l0olllO1i.I000II(l01o0io1ooo03);
/* 1366 */              l01o0io1ooo03.I00lli11.I00000oOI("Event not sent since app measurement is disabled");
/* 1750 */              return;
                    }
/* 52 */            List list = l0olllo1i2.I000iOII().I00li1OI;
/* 54 */            if (list != null && !list.contains(str2)) {
/* 62 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 69 */                l01o0io1ooo03.I00lli11.I0000O(str2, "Dropping non-safelisted event. event name, origin", str6);
/* 72 */                return;
                    }
/* 76 */            if (!this.I00ilO0) {
/* 78 */                this.I00ilO0 = true;
                        try {
                            try {
/* 118 */                       (!l0olllo1i2.I00iiI ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                            } catch (Exception e) {
/* 123 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 130 */                       l01o0io1ooo03.I00l0I0l0lO1.I0000Il00O("Failed to invoke Tag Manager's initialize() method", e);
                            }
                        } catch (ClassNotFoundException unused) {
/* 134 */                   l0olllO1i.I000II(l01o0io1ooo03);
/* 141 */                   l01o0io1ooo03.I00ll1.I00000oOI("Tag Manager is not found and thus will not be used");
                        }
                    }
/* 144 */           l00i1l00OlIO l00i1l00olio = l0olllo1i2.I00l0OO0IO;
/* 146 */           l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 148 */           Iioi0lilII iioi0lilII2 = l0olllo1i2.I00li1OI;
/* 159 */           if (!iil1iil2.I01101IOlO(null, iol1II1ii1i.I010l1ol111) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
/* 177 */               String string = bundle.getString("gclid");
/* 181 */               iioi0lilII2.getClass();
/* 186 */               iioi0lilII = iioi0lilII2;
/* 192 */               l01o0io1ooo0 = l01o0io1ooo03;
/* 196 */               lioil0ilioi = lioil0ilioi4;
/* 201 */               i1il01 = i1il012;
/* 203 */               iil1iil = iil1iil2;
/* 205 */               str3 = null;
/* 206 */               lil1o1li = this;
/* 208 */               lil1o1li.I01101olii(System.currentTimeMillis(), string, "auto", "_lgclid");
                    } else {
/* 212 */               iil1iil = iil1iil2;
/* 214 */               iioi0lilII = iioi0lilII2;
/* 216 */               lioil0ilioi = lioil0ilioi4;
/* 218 */               l01o0io1ooo0 = l01o0io1ooo03;
/* 220 */               i1il01 = i1il012;
/* 222 */               str3 = null;
/* 223 */               lil1o1li = this;
                    }
/* 226 */           if (!z || lioil0ilIOi.I00l0OO0IO[0].equals(str2)) {
/* 258 */               l0oi0o = l0oi0o2;
/* 260 */               lioil0ilioi2 = lioil0ilioi;
                    } else {
/* 238 */               l0olllO1i.I0000oI00(lioil0ilioi);
/* 241 */               l0olllO1i.I0000oI00(l0oi0o2);
/* 244 */               l0oi0o = l0oi0o2;
/* 252 */               lioil0ilioi2 = lioil0ilioi;
/* 254 */               lioil0ilioi2.I0110OiO(bundle, l0oi0o.I00oli.I0010o());
                    }
/* 262 */           if (!z3 && !"_iap".equals(str2)) {
/* 272 */               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 281 */               if (lioil0ilioi2.I01OiO1OI("event", str2)) {
/* 312 */                   if (lioil0ilioi2.I01OlIoIl("event", iO1l1II0O0.I00000oIO, ((l0olllO1i) lioil0ilioi2.I00iOIl).I00iio.I01101IOlO(str3, iol1II1ii1i.I0110OiO) ? iO1l1II0O0.I0000Il00O : iO1l1II0O0.I00000oOI, str2)) {
/* 320 */                       i5 = 40;
/* 326 */                       if (lioil0ilioi2.I01OlOoii0("event", 40, str2)) {
/* 329 */                           i6 = 0;
                                }
                            } else {
/* 316 */                       i6 = 13;
/* 317 */                       i5 = 40;
                            }
/* 330 */                   if (i6 != 0) {
/* 332 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 345 */                       l01o0io1ooo0.I00ioIO.I0000Il00O("Invalid public event name. Event will not be logged (FE)", l00i1l00olio.I00000oIO(str2));
/* 348 */                       l0olllO1i.I0000oI00(lioil0ilioi2);
/* 379 */                       lioil0ilIOi.I011Ill(i1il01, null, i6, "_ev", lioil0ilIOi.I010l1ol111(true, str2, i5), str2 != null ? str2.length() : 0);
/* 382 */                       return;
                            }
                        } else {
/* 283 */                   i5 = 40;
                        }
/* 285 */               i6 = 2;
/* 330 */               if (i6 != 0) {
                        }
                    }
/* 383 */           l01O0IO1ooO0 l01o0io1ooo04 = l01o0io1ooo0;
/* 386 */           lO0liIO0 lo0liio02 = l0olllo1i2.I00ll1;
/* 388 */           l0olllO1i.I0001Ioi1lo(lo0liio02);
/* 392 */           lIol0ili1Oi liol0ili1oiI010ioo = lo0liio02.I010ioo(false);
/* 398 */           if (liol0ili1oiI010ioo == null || bundle.containsKey("_sc")) {
/* 412 */               l0olllo1i = l0olllo1i2;
                    } else {
/* 406 */               l0olllo1i = l0olllo1i2;
/* 409 */               liol0ili1oiI010ioo.I0000O = true;
                    }
/* 421 */           lioil0ilIOi.I01O1I1(liol0ili1oiI010ioo, bundle, z && !z3);
/* 426 */           boolean zEquals = "am".equals(str6);
/* 430 */           boolean zI01I1Oo0oll = lioil0ilIOi.I01I1Oo0oll(str2);
/* 434 */           if (z) {
/* 436 */               z4 = zEquals;
/* 440 */               if (lil1o1li.I00iio != null && !zI01I1Oo0oll) {
/* 444 */                   if (!z4) {
/* 449 */                       l0olllO1i.I000II(l01o0io1ooo04);
/* 464 */                       l01o0io1ooo04.I00lli11.I0000O(l00i1l00olio.I00000oIO(str2), "Passing event to registered event handler (FE)", l00i1l00olio.I0000oI00(bundle));
/* 469 */                       lII0I0I000I.I000II(lil1o1li.I00iio);
/* 472 */                       OoOlO1O0o ooOlO1O0o = lil1o1li.I00iio;
/* 474 */                       ooOlO1O0o.getClass();
                                try {
/* 481 */                           il0o00iO il0o00io = (il0o00iO) ((il10Io00IlII) ooOlO1O0o.I00iiI);
/* 483 */                           Parcel parcelI00Iooi00oi = il0o00io.I00Iooi00oi();
/* 487 */                           parcelI00Iooi00oi.writeString(str6);
/* 490 */                           parcelI00Iooi00oi.writeString(str2);
/* 493 */                           iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi, bundle);
/* 496 */                           parcelI00Iooi00oi.writeLong(j);
/* 500 */                           il0o00io.I00O0o1oo(1, parcelI00Iooi00oi);
/* 1357 */                          return;
                                } catch (RemoteException e2) {
/* 510 */                           l0olllO1i l0olllo1i3 = ((AppMeasurementDynamiteService) ooOlO1O0o.I00iiO).I000II;
/* 512 */                           if (l0olllo1i3 != null) {
/* 514 */                               l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i3.I00ilO0;
/* 516 */                               l0olllO1i.I000II(l01o0io1ooo05);
/* 523 */                               l01o0io1ooo05.I00l0I0l0lO1.I0000Il00O("Event interceptor threw exception", e2);
/* 1357 */                              return;
                                    }
/* 1357 */                          return;
                                }
                            }
/* 446 */                   z4 = true;
                        }
                    } else {
/* 528 */               z4 = zEquals;
                    }
/* 534 */           if (l0olllo1i.I0000Il00O()) {
/* 538 */               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 543 */               l0olllO1i l0olllo1i4 = (l0olllO1i) lioil0ilioi2.I00iOIl;
/* 545 */               int iI01Olioli = lioil0ilioi2.I01Olioli(str2);
/* 549 */               if (iI01Olioli != 0) {
/* 551 */                   l0olllO1i.I000II(l01o0io1ooo04);
/* 562 */                   l01o0io1ooo04.I00ioIO.I0000Il00O("Invalid event name. Event will not be logged (FE)", l00i1l00olio.I00000oIO(str2));
/* 568 */                   String strI010l1ol111 = lioil0ilIOi.I010l1ol111(true, str2, 40);
/* 579 */                   int length = str2 != null ? str2.length() : 0;
/* 580 */                   l0olllO1i.I0000oI00(lioil0ilioi2);
/* 598 */                   lioil0ilIOi.I011Ill(i1il01, null, iI01Olioli, "_ev", strI010l1ol111, length);
/* 601 */                   return;
                        }
/* 618 */               Bundle bundleI010oio1OO0 = lioil0ilioi2.I010oio1OO0(str2, bundle, iiIIl0oOoi.I00000oIO("_o", "_sn", "_sc", "_si"), z3);
/* 622 */               lII0I0I000I.I000II(bundleI010oio1OO0);
/* 625 */               l0olllO1i.I0001Ioi1lo(lo0liio02);
/* 635 */               if (lo0liio02.I010ioo(false) == null || !"_ae".equals(str2)) {
/* 681 */                   j3 = 0;
                        } else {
/* 643 */                   l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 646 */                   OooI11loO0I oooI11loO0I = li10o1l0.I00ilO0;
/* 648 */                   j3 = 0;
/* 660 */                   ((l0olllO1i) ((li10O1l0) oooI11loO0I.I00iio).I00iOIl).I00li1OI.getClass();
/* 663 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 669 */                   long j6 = jElapsedRealtime - oooI11loO0I.I00iiI;
/* 671 */                   oooI11loO0I.I00iiI = jElapsedRealtime;
/* 675 */                   if (j6 > 0) {
/* 677 */                       lioil0ilioi2.I01Ilioliio(bundleI010oio1OO0, j6);
                            }
                        }
/* 691 */               if (!"auto".equals(str6) && "_ssr".equals(str2)) {
/* 701 */                   String string2 = bundleI010oio1OO0.getString("_ffr");
/* 705 */                   int i7 = OlOoO1.I00000oIO;
/* 707 */                   if (string2 == null || string2.trim().isEmpty()) {
/* 727 */                       string2 = null;
                            } else if (string2 != null) {
/* 722 */                       string2 = string2.trim();
                            }
/* 728 */                   l0Oi0o l0oi0o3 = l0olllo1i4.I00ilI0I1;
/* 730 */                   l0olllO1i.I0000oI00(l0oi0o3);
/* 743 */                   if (Objects.equals(string2, l0oi0o3.I00oOio10iI1.I000II())) {
/* 756 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i4.I00ilO0;
/* 758 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 765 */                       l01o0io1ooo06.I00lli11.I00000oOI("Not logging duplicate session_start_with_rollout event");
/* 768 */                       return;
                            } else {
/* 745 */                       l0Oi0o l0oi0o4 = l0olllo1i4.I00ilI0I1;
/* 747 */                       l0olllO1i.I0000oI00(l0oi0o4);
/* 752 */                       l0oi0o4.I00oOio10iI1.I000O01llI0(string2);
                            }
                        } else if ("_ae".equals(str2)) {
/* 775 */                   l0Oi0o l0oi0o5 = l0olllo1i4.I00ilI0I1;
/* 777 */                   l0olllO1i.I0000oI00(l0oi0o5);
/* 782 */                   String strI000II = l0oi0o5.I00oOio10iI1.I000II();
/* 790 */                   if (!TextUtils.isEmpty(strI000II)) {
/* 792 */                       bundleI010oio1OO0.putString("_ffr", strI000II);
                            }
                        }
/* 797 */               ArrayList arrayList2 = new ArrayList();
/* 800 */               arrayList2.add(bundleI010oio1OO0);
/* 812 */               if (iil1iil.I01101IOlO(null, iol1II1ii1i.I010II)) {
/* 814 */                   l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 817 */                   li10o1l0.I010II();
/* 820 */                   zI00000oIO = li10o1l0.I00iio;
                        } else {
/* 823 */                   l0olllO1i.I0000oI00(l0oi0o);
/* 828 */                   zI00000oIO = l0oi0o.I00oII.I00000oIO();
                        }
/* 832 */               l0olllO1i.I0000oI00(l0oi0o);
/* 843 */               if (l0oi0o.I00o0l1o1o0.I00000oIO() > j3) {
/* 845 */                   j4 = j;
/* 851 */                   if (l0oi0o.I010o0o0oO(j4) && zI00000oIO) {
/* 855 */                       l0olllO1i.I000II(l01o0io1ooo04);
/* 862 */                       l01o0io1ooo04.I00lll10.I00000oOI("Current session is expired, remove the session number, ID, and engagement time");
/* 865 */                       iioi0lilII.getClass();
/* 873 */                       l01o0io1ooo02 = l01o0io1ooo04;
/* 877 */                       lo0liio0 = lo0liio02;
/* 880 */                       lioil0ilioi3 = lioil0ilioi2;
/* 633 */                       str5 = "_ae";
/* 887 */                       i = 1;
/* 889 */                       i2 = 0;
/* 608 */                       str4 = "_o";
/* 894 */                       I01101olii(System.currentTimeMillis(), null, "auto", "_sid");
/* 905 */                       I01101olii(System.currentTimeMillis(), null, "auto", "_sno");
/* 916 */                       I01101olii(System.currentTimeMillis(), null, "auto", "_se");
/* 921 */                       j5 = j3;
/* 923 */                       l0oi0o.I00o101lO.I00000oOI(j5);
                            }
/* 956 */                   if (bundleI010oio1OO0.getLong("extend_session", j5) != 1) {
/* 958 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 967 */                       l01o0io1ooo02.I00lll10.I00000oOI("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
/* 970 */                       l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 977 */                       li10o1l0.I00ilI0I1.I0000oI00(j4, j2);
                            }
/* 989 */                   ArrayList arrayList3 = new ArrayList(bundleI010oio1OO0.keySet());
/* 992 */                   Collections.sort(arrayList3);
/* 995 */                   size = arrayList3.size();
/* 999 */                   i3 = i2;
/* 1001 */                  while (i3 < size) {
/* 1007 */                      String str7 = (String) arrayList3.get(i3);
/* 1009 */                      if (str7 != null) {
/* 1011 */                          l0olllO1i.I0000oI00(lioil0ilioi3);
/* 1014 */                          Object obj = bundleI010oio1OO0.get(str7);
/* 1018 */                          arrayList = arrayList3;
/* 1022 */                          if (obj instanceof Bundle) {
/* 1024 */                              bundleArr = new Bundle[i];
/* 1028 */                              bundleArr[i2] = (Bundle) obj;
                                    } else if (obj instanceof Parcelable[]) {
/* 1035 */                              Parcelable[] parcelableArr = (Parcelable[]) obj;
/* 1044 */                              bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                    } else if (obj instanceof ArrayList) {
/* 1051 */                              ArrayList arrayList4 = (ArrayList) obj;
/* 1063 */                              bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                                    } else {
/* 1066 */                              bundleArr = null;
                                    }
/* 1067 */                          if (bundleArr != null) {
/* 1069 */                              bundleI010oio1OO0.putParcelableArray(str7, bundleArr);
                                    }
                                } else {
/* 1073 */                          arrayList = arrayList3;
                                }
/* 1075 */                      i3++;
/* 1077 */                      arrayList3 = arrayList;
/* 1079 */                      i = 1;
                            }
/* 1081 */                  i4 = i2;
/* 1087 */                  while (i4 < arrayList2.size()) {
/* 1093 */                      Bundle bundleI01IO0oio = (Bundle) arrayList2.get(i4);
/* 1100 */                      String str8 = i4 != 0 ? "_ep" : str2;
/* 1101 */                      bundleI01IO0oio.putString(str4, str6);
/* 1104 */                      lioil0ilIOi lioil0ilioi5 = lioil0ilioi3;
/* 1106 */                      if (z2) {
/* 1108 */                          bundleI01IO0oio = lioil0ilioi5.I01IO0oio(bundleI01IO0oio);
                                }
/* 1112 */                      Bundle bundle2 = bundleI01IO0oio;
/* 1120 */                      long j7 = j4;
/* 1127 */                      String str9 = str6;
/* 1130 */                      ii0oooi0IO0l ii0oooi0io0l = new ii0oooi0IO0l(str8, new ii0il0lOolIo(bundle2), str9, j7, j2);
/* 1133 */                      str6 = str9;
/* 1134 */                      lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 1138 */                      loliolo1ioI000OOo1O.getClass();
/* 1141 */                      loliolo1ioI000OOo1O.I010II();
/* 1144 */                      loliolo1ioI000OOo1O.I010OIo1l();
/* 1147 */                      loliolo1ioI000OOo1O.I01101olii();
/* 1154 */                      l00Ii0II l00ii0iiI000O01llI0 = ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I000O01llI0();
/* 1158 */                      l00ii0iiI000O01llI0.getClass();
/* 1161 */                      Parcel parcelObtain = Parcel.obtain();
/* 1167 */                      iIlI1lioo0lO.I00000oIO(ii0oooi0io0l, parcelObtain, i2);
/* 1170 */                      byte[] bArrMarshall = parcelObtain.marshall();
/* 1174 */                      parcelObtain.recycle();
/* 1178 */                      ArrayList arrayList5 = arrayList2;
/* 1182 */                      if (bArrMarshall.length > 131072) {
/* 1188 */                          l01O0IO1ooO0 l01o0io1ooo07 = ((l0olllO1i) l00ii0iiI000O01llI0.I00iOIl).I00ilO0;
/* 1190 */                          l0olllO1i.I000II(l01o0io1ooo07);
/* 1197 */                          l01o0io1ooo07.I00io1l.I00000oOI("Event is too long for local database. Sending event directly to service");
/* 1200 */                          zI010l1ol111 = false;
                                } else {
/* 1204 */                          zI010l1ol111 = l00ii0iiI000O01llI0.I010l1ol111(0, bArrMarshall);
                                }
/* 1209 */                      lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(true);
/* 1216 */                      ioli0l0 ioli0l0Var = new ioli0l0(2);
/* 1219 */                      ioli0l0Var.I00iiO = lli10iiI011IO1I11OI;
/* 1221 */                      ioli0l0Var.I00iiI = zI010l1ol111;
/* 1223 */                      ioli0l0Var.I00iio = ii0oooi0io0l;
/* 1225 */                      ioli0l0Var.I00ilI0I1 = loliolo1ioI000OOo1O;
/* 1227 */                      VarHandle.storeStoreFence();
/* 1230 */                      loliolo1ioI000OOo1O.I0110o(ioli0l0Var);
/* 1233 */                      if (!z4) {
/* 1237 */                          Iterator it = this.I00ilI0I1.iterator();
/* 1245 */                          while (it.hasNext()) {
/* 1252 */                              ll0o10l0I01l ll0o10l0i01l = (ll0o10l0I01l) it.next();
/* 1256 */                              Bundle bundle3 = new Bundle(bundle2);
/* 1259 */                              ll0o10l0i01l.getClass();
                                        try {
/* 1264 */                                  il0o00iO il0o00io2 = (il0o00iO) ll0o10l0i01l.I00000oIO;
/* 1266 */                                  Parcel parcelI00Iooi00oi2 = il0o00io2.I00Iooi00oi();
/* 1270 */                                  parcelI00Iooi00oi2.writeString(str6);
/* 1273 */                                  parcelI00Iooi00oi2.writeString(str2);
/* 1276 */                                  iiIIoi1oIO1.I00000oOI(parcelI00Iooi00oi2, bundle3);
/* 1279 */                                  parcelI00Iooi00oi2.writeLong(j7);
/* 1283 */                                  il0o00io2.I00O0o1oo(1, parcelI00Iooi00oi2);
                                        } catch (RemoteException e3) {
/* 1290 */                                  l0olllO1i l0olllo1i5 = ll0o10l0i01l.I00000oOI.I000II;
/* 1292 */                                  if (l0olllo1i5 != null) {
/* 1294 */                                      l01O0IO1ooO0 l01o0io1ooo08 = l0olllo1i5.I00ilO0;
/* 1296 */                                      l0olllO1i.I000II(l01o0io1ooo08);
/* 1303 */                                      l01o0io1ooo08.I00l0I0l0lO1.I0000Il00O("Event listener threw exception", e3);
                                            }
                                        }
                                    }
                                }
/* 1308 */                      i4++;
/* 1312 */                      arrayList2 = arrayList5;
/* 1314 */                      j4 = j7;
/* 1315 */                      lioil0ilioi3 = lioil0ilioi5;
/* 1317 */                      i2 = 0;
                            }
/* 1321 */                  l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 1331 */                  if (lo0liio0.I010ioo(false) == null && str5.equals(str2)) {
/* 1341 */                      l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 1344 */                      iioi0lilII.getClass();
/* 1354 */                      li10o1l0.I00ilO0.I0000oI00(SystemClock.elapsedRealtime(), true, true);
/* 1357 */                      return;
                            }
                        }
/* 943 */               j4 = j;
/* 927 */               j5 = j3;
/* 608 */               str4 = "_o";
/* 930 */               lo0liio0 = lo0liio02;
/* 932 */               lioil0ilioi3 = lioil0ilioi2;
/* 934 */               l01o0io1ooo02 = l01o0io1ooo04;
/* 633 */               str5 = "_ae";
/* 938 */               i = 1;
/* 940 */               i2 = 0;
/* 956 */               if (bundleI010oio1OO0.getLong("extend_session", j5) != 1) {
                        }
/* 989 */               ArrayList arrayList32 = new ArrayList(bundleI010oio1OO0.keySet());
/* 992 */               Collections.sort(arrayList32);
/* 995 */               size = arrayList32.size();
/* 999 */               i3 = i2;
/* 1001 */              while (i3 < size) {
                        }
/* 1081 */              i4 = i2;
/* 1087 */              while (i4 < arrayList2.size()) {
                        }
/* 1321 */              l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 1331 */              if (lo0liio0.I010ioo(false) == null) {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010oio1OO0(String str, String str2, Object obj, boolean z, long j) {
                    int iI01OoOi;
                    int length;
/* 1 */             i1Il01 i1il01 = this.I00oOio10iI1;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 10 */            if (z) {
/* 12 */                lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 14 */                l0olllO1i.I0000oI00(lioil0ilioi);
/* 17 */                iI01OoOi = lioil0ilioi.I01OoOi(str2);
                    } else {
/* 22 */                lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 24 */                l0olllO1i.I0000oI00(lioil0ilioi2);
/* 34 */                if (lioil0ilioi2.I01OiO1OI("user property", str2)) {
/* 45 */                    if (lioil0ilioi2.I01OlIoIl("user property", iO1lI0lo110.I00000oIO, null, str2)) {
/* 54 */                        iIl1iil iil1iil = ((l0olllO1i) lioil0ilioi2.I00iOIl).I00iio;
/* 63 */                        iI01OoOi = !lioil0ilioi2.I01OlOoii0("user property", 24, str2) ? 6 : 0;
                            } else {
/* 47 */                        iI01OoOi = 15;
                            }
                        }
                    }
/* 65 */            if (iI01OoOi != 0) {
/* 69 */                l0olllO1i.I0000oI00(l0olllo1i.I00l0I0l0lO1);
/* 72 */                String strI010l1ol111 = lioil0ilIOi.I010l1ol111(true, str2, 24);
/* 78 */                length = str2 != null ? str2.length() : 0;
/* 84 */                l0olllO1i.I0000oI00(l0olllo1i.I00l0I0l0lO1);
/* 96 */                lioil0ilIOi.I011Ill(i1il01, null, iI01OoOi, "_ev", strI010l1ol111, length);
/* 99 */                return;
                    }
/* 100 */           if (str == null) {
/* 102 */               str = "app";
                    }
/* 104 */           String str3 = str;
/* 105 */           if (obj == null) {
/* 185 */               I01101IOlO(j, null, str3, str2);
/* 399 */               return;
                    }
/* 107 */           lioil0ilIOi lioil0ilioi3 = l0olllo1i.I00l0I0l0lO1;
/* 109 */           lioil0ilIOi lioil0ilioi4 = l0olllo1i.I00l0I0l0lO1;
/* 111 */           l0olllO1i.I0000oI00(lioil0ilioi3);
/* 114 */           int iI0111i = lioil0ilioi3.I0111i(str2, obj);
/* 118 */           if (iI0111i != 0) {
/* 120 */               l0olllO1i.I0000oI00(lioil0ilioi4);
/* 123 */               String strI010l1ol1112 = lioil0ilIOi.I010l1ol111(true, str2, 24);
/* 139 */               length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
/* 143 */               l0olllO1i.I0000oI00(lioil0ilioi4);
/* 159 */               lioil0ilIOi.I011Ill(i1il01, null, iI0111i, "_ev", strI010l1ol1112, length);
/* 162 */               return;
                    }
/* 163 */           l0olllO1i.I0000oI00(lioil0ilioi4);
/* 166 */           Object objI011IO1I11OI = lioil0ilioi4.I011IO1I11OI(str2, obj);
/* 170 */           if (objI011IO1I11OI != null) {
/* 176 */               I01101IOlO(j, objI011IO1I11OI, str3, str2);
                    }
                }

                public final void I01101IOlO(long j, Object obj, String str, String str2) {
/* 5 */             l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 7 */             l0olllO1i.I000II(l0o10ooo0);
/* 13 */            Oo1ooo0ollI oo1ooo0ollI = new Oo1ooo0ollI(2);
/* 16 */            oo1ooo0ollI.I00iiO = str;
/* 18 */            oo1ooo0ollI.I00iio = str2;
/* 20 */            oo1ooo0ollI.I00ilI0I1 = obj;
/* 22 */            oo1ooo0ollI.I00iiI = j;
/* 24 */            oo1ooo0ollI.I00ilO0 = this;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            l0o10ooo0.I010o0o0oO(oo1ooo0ollI);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I01101olii(long j, Object obj, String str, String str2) {
                    boolean zI010l1ol111;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             lII0I0I000I.I0000O(str);
/* 8 */             lII0I0I000I.I0000O(str2);
/* 11 */            I010II();
/* 14 */            I010OIo1l();
/* 23 */            int i = 1;
/* 24 */            if ("allow_personalized_ads".equals(str2)) {
/* 30 */                if (obj instanceof String) {
/* 33 */                    String str3 = (String) obj;
/* 39 */                    if (TextUtils.isEmpty(str3)) {
/* 84 */                        if (obj == null) {
/* 86 */                            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 88 */                            l0olllO1i.I0000oI00(l0oi0o);
/* 95 */                            l0oi0o.I00lli11.I000O01llI0("unset");
                                }
/* 99 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 101 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 110 */                       l01o0io1ooo0.I00lll10.I0000O("non_personalized_ads(_npa)", "Setting user property(FE)", obj);
                            } else {
/* 60 */                        long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
/* 61 */                        Long lValueOf = Long.valueOf(j2);
/* 65 */                        l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 67 */                        l0olllO1i.I0000oI00(l0oi0o2);
/* 78 */                        l0oi0o2.I00lli11.I000O01llI0(j2 == 1 ? "true" : "false");
/* 81 */                        obj = lValueOf;
                            }
/* 28 */                    str2 = "_npa";
/* 99 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 101 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 110 */                   l01o0io1ooo02.I00lll10.I0000O("non_personalized_ads(_npa)", "Setting user property(FE)", obj);
                        }
                    }
/* 113 */           Object obj2 = obj;
/* 114 */           String str4 = str2;
/* 119 */           if (!l0olllo1i.I00000oIO()) {
/* 121 */               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 123 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 130 */               l01o0io1ooo03.I00lll10.I00000oOI("User property not set since app measurement is disabled");
/* 133 */               return;
                    }
/* 138 */           if (l0olllo1i.I0000Il00O()) {
/* 145 */               lio0llOI0 lio0lloi0 = new lio0llOI0(j, obj2, str4, str);
/* 148 */               lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 152 */               loliolo1ioI000OOo1O.I010II();
/* 155 */               loliolo1ioI000OOo1O.I010OIo1l();
/* 158 */               loliolo1ioI000OOo1O.I01101olii();
/* 165 */               l00Ii0II l00ii0iiI000O01llI0 = ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I000O01llI0();
/* 169 */               l00ii0iiI000O01llI0.getClass();
/* 172 */               Parcel parcelObtain = Parcel.obtain();
/* 176 */               iolIll1o.I00000oOI(lio0lloi0, parcelObtain);
/* 179 */               byte[] bArrMarshall = parcelObtain.marshall();
/* 183 */               parcelObtain.recycle();
/* 189 */               if (bArrMarshall.length > 131072) {
/* 195 */                   l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) l00ii0iiI000O01llI0.I00iOIl).I00ilO0;
/* 197 */                   l0olllO1i.I000II(l01o0io1ooo04);
/* 204 */                   l01o0io1ooo04.I00io1l.I00000oOI("User property too long for local database. Sending directly to service");
/* 207 */                   zI010l1ol111 = false;
                        } else {
/* 209 */                   zI010l1ol111 = l00ii0iiI000O01llI0.I010l1ol111(1, bArrMarshall);
                        }
/* 213 */               lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(true);
/* 219 */               ioli0l0 ioli0l0Var = new ioli0l0(i);
/* 222 */               ioli0l0Var.I00iiO = lli10iiI011IO1I11OI;
/* 224 */               ioli0l0Var.I00iiI = zI010l1ol111;
/* 226 */               ioli0l0Var.I00iio = lio0lloi0;
/* 228 */               ioli0l0Var.I00ilI0I1 = loliolo1ioI000OOo1O;
/* 230 */               VarHandle.storeStoreFence();
/* 233 */               loliolo1ioI000OOo1O.I0110o(ioli0l0Var);
                    }
                }

                public final void I0110OiO(long j) {
/* 4 */             this.I00io1l.set(null);
/* 11 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 13 */            l0olllO1i.I000II(l0o10ooo0);
/* 19 */            l1ooOIo l1oooio = new l1ooOIo(1);
/* 22 */            l1oooio.I00iiI = j;
/* 24 */            l1oooio.I00iiO = this;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            l0o10ooo0.I010o0o0oO(l1oooio);
                }

                public final void I0110o() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 9 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 15 */            if (l0olllo1i.I0000Il00O()) {
/* 19 */                iIl1iil iil1iil = l0olllo1i.I00iio;
/* 25 */                ((l0olllO1i) iil1iil.I00iOIl).getClass();
/* 30 */                Boolean boolI0110OiO = iil1iil.I0110OiO("google_analytics_deferred_deep_link_enabled");
/* 34 */                if (boolI0110OiO != null && boolI0110OiO.booleanValue()) {
/* 42 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 44 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 51 */                    l01o0io1ooo0.I00lli11.I00000oOI("Deferred Deep Link feature enabled.");
/* 54 */                    l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 56 */                    l0olllO1i.I000II(l0o10ooo0);
/* 62 */                    l1lo100oo0 l1lo100oo0Var = new l1lo100oo0(2);
/* 65 */                    l1lo100oo0Var.I00iiI = this;
/* 67 */                    VarHandle.storeStoreFence();
/* 70 */                    l0o10ooo0.I010o0o0oO(l1lo100oo0Var);
                        }
/* 73 */                lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 77 */                loliolo1ioI000OOo1O.I010II();
/* 80 */                loliolo1ioI000OOo1O.I010OIo1l();
/* 84 */                lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(true);
/* 88 */                loliolo1ioI000OOo1O.I01101olii();
/* 93 */                l0olllO1i l0olllo1i2 = (l0olllO1i) loliolo1ioI000OOo1O.I00iOIl;
/* 100 */               l0olllo1i2.I00iio.I01101IOlO(null, iol1II1ii1i.I010ioo);
/* 111 */               l0olllo1i2.I000O01llI0().I010l1ol111(3, new byte[0]);
/* 118 */               iooili01 iooili01Var = new iooili01(11);
/* 121 */               iooili01Var.I00iiI = lli10iiI011IO1I11OI;
/* 123 */               iooili01Var.I00iiO = loliolo1ioI000OOo1O;
/* 125 */               VarHandle.storeStoreFence();
/* 128 */               loliolo1ioI000OOo1O.I0110o(iooili01Var);
/* 131 */               this.I00oI0i = false;
/* 133 */               l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 135 */               l0olllO1i.I0000oI00(l0oi0o);
/* 138 */               l0oi0o.I010II();
/* 147 */               String string = l0oi0o.I010ioo().getString("previous_os_version", null);
/* 159 */               ((l0olllO1i) l0oi0o.I00iOIl).I000OiO().I010i10l();
/* 162 */               String str = Build.VERSION.RELEASE;
/* 168 */               if (!TextUtils.isEmpty(str) && !str.equals(string)) {
/* 180 */                   SharedPreferences.Editor editorEdit = l0oi0o.I010ioo().edit();
/* 184 */                   editorEdit.putString("previous_os_version", str);
/* 187 */                   editorEdit.apply();
                        }
/* 194 */               if (TextUtils.isEmpty(string)) {
/* 245 */                   return;
                        }
/* 200 */               l0olllo1i.I000OiO().I010i10l();
/* 207 */               if (string.equals(str)) {
/* 245 */                   return;
                        }
/* 211 */               Bundle bundle = new Bundle();
/* 216 */               bundle.putString("_po", string);
/* 223 */               I010l1ol111("auto", "_ou", bundle);
                    }
                }

                public final void I0111i(Bundle bundle, long j) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             lII0I0I000I.I000II(bundle);
/* 10 */            Bundle bundle2 = new Bundle(bundle);
/* 23 */            if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
/* 25 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 27 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 34 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Package name should be null when calling setConditionalUserProperty");
                    }
/* 37 */            bundle2.remove("app_id");
/* 43 */            ll0I11O.I00000oOI(bundle2, "app_id", String.class, null);
/* 48 */            ll0I11O.I00000oOI(bundle2, "origin", String.class, null);
/* 53 */            ll0I11O.I00000oOI(bundle2, "name", String.class, null);
/* 60 */            ll0I11O.I00000oOI(bundle2, "value", Object.class, null);
/* 65 */            ll0I11O.I00000oOI(bundle2, "trigger_event_name", String.class, null);
/* 78 */            ll0I11O.I00000oOI(bundle2, "trigger_timeout", Long.class, 0L);
/* 83 */            ll0I11O.I00000oOI(bundle2, "timed_out_event_name", String.class, null);
/* 90 */            ll0I11O.I00000oOI(bundle2, "timed_out_event_params", Bundle.class, null);
/* 95 */            ll0I11O.I00000oOI(bundle2, "triggered_event_name", String.class, null);
/* 100 */           ll0I11O.I00000oOI(bundle2, "triggered_event_params", Bundle.class, null);
/* 105 */           ll0I11O.I00000oOI(bundle2, "time_to_live", Long.class, 0L);
/* 110 */           ll0I11O.I00000oOI(bundle2, "expired_event_name", String.class, null);
/* 115 */           ll0I11O.I00000oOI(bundle2, "expired_event_params", Bundle.class, null);
/* 122 */           lII0I0I000I.I0000O(bundle2.getString("name"));
/* 129 */           lII0I0I000I.I0000O(bundle2.getString("origin"));
/* 136 */           lII0I0I000I.I000II(bundle2.get("value"));
/* 141 */           bundle2.putLong("creation_timestamp", j);
/* 144 */           String string = bundle2.getString("name");
/* 148 */           Object obj = bundle2.get("value");
/* 152 */           lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 154 */           l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 156 */           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 158 */           l0olllO1i.I0000oI00(lioil0ilioi);
/* 165 */           if (lioil0ilioi.I01OoOi(string) != 0) {
/* 318 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 329 */               l01o0io1ooo02.I00ilO0.I0000Il00O("Invalid conditional user property name", l00i1l00olio.I0000Il00O(string));
/* 332 */               return;
                    }
/* 167 */           l0olllO1i.I0000oI00(lioil0ilioi);
/* 174 */           if (lioil0ilioi.I0111i(string, obj) != 0) {
/* 303 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 314 */               l01o0io1ooo02.I00ilO0.I0000O(l00i1l00olio.I0000Il00O(string), "Invalid conditional user property value", obj);
/* 317 */               return;
                    }
/* 176 */           Object objI011IO1I11OI = lioil0ilioi.I011IO1I11OI(string, obj);
/* 180 */           if (objI011IO1I11OI == null) {
/* 182 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 193 */               l01o0io1ooo02.I00ilO0.I0000O(l00i1l00olio.I0000Il00O(string), "Unable to normalize conditional user property value", obj);
/* 196 */               return;
                    }
/* 197 */           ll0I11O.I00000oIO(bundle2, objI011IO1I11OI);
/* 200 */           long j2 = bundle2.getLong("trigger_timeout");
/* 219 */           if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
/* 229 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 244 */               l01o0io1ooo02.I00ilO0.I0000O(l00i1l00olio.I0000Il00O(string), "Invalid conditional user property timeout", Long.valueOf(j2));
/* 247 */               return;
                    }
/* 248 */           long j3 = bundle2.getLong("time_to_live");
/* 254 */           if (j3 > 15552000000L || j3 < 1) {
/* 284 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 299 */               l01o0io1ooo02.I00ilO0.I0000O(l00i1l00olio.I0000Il00O(string), "Invalid conditional user property time to live", Long.valueOf(j3));
/* 302 */               return;
                    }
/* 261 */           l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 263 */           l0olllO1i.I000II(l0o10ooo0);
/* 270 */           illioiliioi illioiliioiVar = new illioiliioi(9);
/* 273 */           illioiliioiVar.I00iiI = bundle2;
/* 275 */           illioiliioiVar.I00iiO = this;
/* 277 */           VarHandle.storeStoreFence();
/* 280 */           l0o10ooo0.I010o0o0oO(illioiliioiVar);
                }

                public final void I011IO1I11OI(String str, String str2, Bundle bundle) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             l0olllo1i.I00li1OI.getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */            lII0I0I000I.I0000O(str);
/* 19 */            Bundle bundle2 = new Bundle();
/* 24 */            bundle2.putString("name", str);
/* 29 */            bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
/* 32 */            if (str2 != null) {
/* 36 */                bundle2.putString("expired_event_name", str2);
/* 41 */                bundle2.putBundle("expired_event_params", bundle);
                    }
/* 44 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 46 */            l0olllO1i.I000II(l0o10ooo0);
/* 53 */            iooiio1i0 iooiio1i0Var = new iooiio1i0(9);
/* 56 */            iooiio1i0Var.I00iiI = bundle2;
/* 58 */            iooiio1i0Var.I00iiO = this;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            l0o10ooo0.I010o0o0oO(iooiio1i0Var);
                }

                public final String I011IOil() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
                    try {
/* 9 */                 return ll0i0l0Ili.I00000oIO(l0olllo1i.I00iOIl, l0olllo1i.I00o0l1o1o0);
                    } catch (IllegalStateException e) {
/* 15 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 24 */                l01o0io1ooo0.I00ilO0.I0000Il00O("getGoogleAppId failed with exception", e);
/* 27 */                return null;
                    }
                }

                public final void I011Ill(l1ioIO011Oo l1ioio011oo, long j, boolean z) {
/* 1 */             int i = l1ioio011oo.I00000oOI;
/* 3 */             I010II();
/* 6 */             I010OIo1l();
/* 11 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 13 */            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 15 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */            l0olllO1i.I0000oI00(l0oi0o);
/* 20 */            l1ioIO011Oo l1ioio011ooI010l1ol111 = l0oi0o.I010l1ol111();
/* 28 */            if (j <= this.I00o0l1o1o0 && l1ioIO011Oo.I000l1(l1ioio011ooI010l1ol111.I00000oOI, i)) {
/* 38 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 45 */                l01o0io1ooo0.I00ll1.I0000Il00O("Dropped out-of-date consent setting, proposed settings", l1ioio011oo);
/* 48 */                return;
                    }
/* 49 */            l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 51 */            l0olllO1i.I0000oI00(l0oi0o2);
/* 54 */            l0oi0o2.I010II();
/* 73 */            if (!l1ioIO011Oo.I000l1(i, l0oi0o2.I010ioo().getInt("consent_source", 100))) {
/* 167 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 178 */               l01o0io1ooo0.I00ll1.I0000Il00O("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
/* 408 */               return;
                    }
/* 79 */            SharedPreferences.Editor editorEdit = l0oi0o2.I010ioo().edit();
/* 89 */            editorEdit.putString("consent_settings", l1ioio011oo.I000II());
/* 92 */            editorEdit.putInt("consent_source", i);
/* 95 */            editorEdit.apply();
/* 98 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 105 */           l01o0io1ooo0.I00lll10.I0000Il00O("Setting storage consent(FE)", l1ioio011oo);
/* 108 */           this.I00o0l1o1o0 = j;
/* 118 */           if (l0olllo1i.I000OOo1O().I010oio1OO0()) {
/* 120 */               lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 124 */               loliolo1ioI000OOo1O.I010II();
/* 127 */               loliolo1ioI000OOo1O.I010OIo1l();
/* 133 */               lOilIOO loilioo = new lOilIOO(2);
/* 136 */               loilioo.I00iiI = loliolo1ioI000OOo1O;
/* 138 */               VarHandle.storeStoreFence();
/* 141 */               loliolo1ioI000OOo1O.I0110o(loilioo);
                    } else {
/* 149 */               l0olllo1i.I000OOo1O().I011Ill();
                    }
/* 152 */           if (z) {
/* 163 */               l0olllo1i.I000OOo1O().I010ioo(new AtomicReference());
                    }
                }

                public final void I011Io0I1ioi(Boolean bool, boolean z) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 9 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 11 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 13 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 20 */            l01o0io1ooo0.I00lli11.I0000Il00O("Setting app measurement enabled (FE)", bool);
/* 23 */            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 25 */            l0olllO1i.I0000oI00(l0oi0o);
/* 28 */            l0oi0o.I010II();
/* 35 */            SharedPreferences.Editor editorEdit = l0oi0o.I010ioo().edit();
/* 41 */            if (bool != null) {
/* 47 */                editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
                    } else {
/* 51 */                editorEdit.remove("measurement_enabled");
                    }
/* 54 */            editorEdit.apply();
/* 57 */            if (z) {
/* 59 */                l0oi0o.I010II();
/* 66 */                SharedPreferences.Editor editorEdit2 = l0oi0o.I010ioo().edit();
/* 72 */                if (bool != null) {
/* 78 */                    editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                        } else {
/* 82 */                    editorEdit2.remove("measurement_enabled_from_api");
                        }
/* 85 */                editorEdit2.apply();
                    }
/* 88 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 90 */            l0olllO1i.I000II(l0o10ooo0);
/* 93 */            l0o10ooo0.I010II();
/* 98 */            if (l0olllo1i.I00oliIiO01i || !(bool == null || bool.booleanValue())) {
/* 110 */               I011Ol0();
                    }
                }

                public final void I011Ol0() {
/* 1 */             I010II();
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */             l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 11 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 13 */            Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 15 */            l0olllO1i.I0000oI00(l0oi0o);
/* 20 */            String strI000II = l0oi0o.I00lli11.I000II();
/* 24 */            int i = 1;
/* 25 */            if (strI000II != null) {
/* 33 */                if ("unset".equals(strI000II)) {
/* 35 */                    iioi0lilII.getClass();
/* 48 */                    I01101olii(System.currentTimeMillis(), null, "app", "_npa");
                        } else {
/* 65 */                    Long lValueOf = Long.valueOf(true != "true".equals(strI000II) ? 0L : 1L);
/* 69 */                    iioi0lilII.getClass();
/* 81 */                    I01101olii(System.currentTimeMillis(), lValueOf, "app", "_npa");
                        }
                    }
/* 88 */            if (!l0olllo1i.I00000oIO() || !this.I00oI0i) {
/* 136 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 143 */               l01o0io1ooo0.I00lli11.I00000oOI("Updating Scion state (FE)");
/* 146 */               lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i.I000OOo1O();
/* 150 */               loliolo1ioI000OOo1O.I010II();
/* 153 */               loliolo1ioI000OOo1O.I010OIo1l();
/* 156 */               lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(true);
/* 164 */               liOO1i1 lioo1i1 = new liOO1i1(11);
/* 167 */               lioo1i1.I00iiI = lli10iiI011IO1I11OI;
/* 169 */               lioo1i1.I00iiO = loliolo1ioI000OOo1O;
/* 171 */               VarHandle.storeStoreFence();
/* 174 */               loliolo1ioI000OOo1O.I0110o(lioo1i1);
/* 245 */               return;
                    }
/* 94 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 101 */           l01o0io1ooo0.I00lli11.I00000oOI("Recording app launch after enabling measurement for the first time (FE)");
/* 104 */           I0110o();
/* 107 */           li10O1l0 li10o1l0 = l0olllo1i.I00ioIO;
/* 109 */           l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 114 */           li10o1l0.I00ilI0I1.I00000oOI();
/* 117 */           l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 119 */           l0olllO1i.I000II(l0o10ooo0);
/* 124 */           l1lo100oo0 l1lo100oo0Var = new l1lo100oo0(i);
/* 127 */           l1lo100oo0Var.I00iiI = this;
/* 129 */           VarHandle.storeStoreFence();
/* 132 */           l0o10ooo0.I010o0o0oO(l1lo100oo0Var);
                }

                public final void I011iIOio() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 13 */            if (!(l0olllo1i.I00iOIl.getApplicationContext() instanceof Application) || this.I00iiO == null) {
/* 55 */                return;
                    }
/* 29 */            ((Application) l0olllo1i.I00iOIl.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.I00iiO);
                }

                public final void I011iO(Bundle bundle, int i, long j) {
                    Boolean bool;
                    String string;
                    l1iIoO01 l1iioo01;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010OIo1l();
/* 8 */             l1ioIO011Oo l1ioio011oo = l1ioIO011Oo.I0000Il00O;
/* 12 */            l1iioiool[] l1iioioolVarArr = l1iOili.STORAGE.I00iOIl;
/* 14 */            int length = l1iioioolVarArr.length;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                bool = null;
/* 17 */                if (i2 >= length) {
/* 64 */                    string = null;
                            break;
                        }
/* 21 */                String str = l1iioioolVarArr[i2].I00iOIl;
/* 27 */                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
/* 58 */                    if ((string.equals("granted") ? Boolean.TRUE : string.equals("denied") ? Boolean.FALSE : null) == null) {
                                break;
                            }
                        }
/* 61 */                i2++;
                    }
/* 65 */            if (string != null) {
/* 67 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 69 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 76 */                l01o0io1ooo0.I00li1OI.I0000Il00O("Ignoring invalid consent setting", string);
/* 79 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 81 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 88 */                l01o0io1ooo02.I00li1OI.I00000oOI("Valid consent values are 'granted', 'denied'");
                    }
/* 91 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 93 */            l0olllO1i.I000II(l0o10ooo0);
/* 96 */            boolean zI010l1O = l0o10ooo0.I010l1O();
/* 100 */           l1ioIO011Oo l1ioio011ooI00000oOI = l1ioIO011Oo.I00000oOI(i, bundle);
/* 110 */           Iterator it = l1ioio011ooI00000oOI.I00000oIO.values().iterator();
                    while (true) {
/* 114 */               boolean zHasNext = it.hasNext();
/* 118 */               l1iioo01 = l1iIoO01.UNINITIALIZED;
/* 120 */               if (!zHasNext) {
                            break;
                        } else if (((l1iIoO01) it.next()) != l1iioo01) {
/* 130 */                   I011lIilI0lo(l1ioio011ooI00000oOI, zI010l1O);
                            break;
                        }
                    }
/* 133 */           iOoOIi0i ioooii0iI0000Il00O = iOoOIi0i.I0000Il00O(i, bundle);
/* 143 */           Iterator it2 = ioooii0iI0000Il00O.I0000oI00.values().iterator();
                    while (true) {
/* 151 */               if (!it2.hasNext()) {
                            break;
                        } else if (((l1iIoO01) it2.next()) != l1iioo01) {
/* 161 */                   I011iiii0i(ioooii0iI0000Il00O, zI010l1O);
                            break;
                        }
                    }
/* 164 */           if (bundle != null) {
/* 177 */               int iOrdinal = l1ioIO011Oo.I0000O(bundle.getString("ad_personalization")).ordinal();
/* 182 */               if (iOrdinal == 2) {
/* 191 */                   bool = Boolean.FALSE;
                        } else if (iOrdinal == 3) {
/* 188 */                   bool = Boolean.TRUE;
                        }
                    }
/* 193 */           if (bool != null) {
/* 202 */               String str2 = i == -30 ? "tcf" : "app";
/* 204 */               if (zI010l1O) {
/* 215 */                   I01101olii(j, bool.toString(), str2, "allow_personalized_ads");
                        } else {
/* 228 */                   I010oio1OO0(str2, "allow_personalized_ads", bool.toString(), false, j);
                        }
                    }
                }

                public final void I011iiii0i(iOoOIi0i ioooii0i, boolean z) {
/* 5 */             illioiliioi illioiliioiVar = new illioiliioi(10);
/* 8 */             illioiliioiVar.I00iiI = ioooii0i;
/* 10 */            illioiliioiVar.I00iiO = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            if (z) {
/* 17 */                I010II();
/* 20 */                illioiliioiVar.run();
                    } else {
/* 28 */                l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 30 */                l0olllO1i.I000II(l0o10ooo0);
/* 33 */                l0o10ooo0.I010o0o0oO(illioiliioiVar);
                    }
                }

                public final void I011lIilI0lo(l1ioIO011Oo l1ioio011oo, boolean z) {
                    boolean z2;
                    boolean z3;
                    boolean z4;
/* 1 */             I010OIo1l();
/* 4 */             int i = l1ioio011oo.I00000oOI;
/* 8 */             if (i != -10) {
/* 18 */                l1iIoO01 l1iioo01 = (l1iIoO01) l1ioio011oo.I00000oIO.get(l1iioiool.AD_STORAGE);
/* 20 */                if (l1iioo01 == null) {
/* 22 */                    l1iioo01 = l1iIoO01.UNINITIALIZED;
                        }
/* 24 */                l1iIoO01 l1iioo012 = l1iIoO01.UNINITIALIZED;
/* 26 */                if (l1iioo01 == l1iioo012) {
/* 36 */                    l1iIoO01 l1iioo013 = (l1iIoO01) l1ioio011oo.I00000oIO.get(l1iioiool.ANALYTICS_STORAGE);
/* 38 */                    if (l1iioo013 == null) {
/* 40 */                        l1iioo013 = l1iioo012;
                            }
/* 41 */                    if (l1iioo013 == l1iioo012) {
/* 47 */                        l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 49 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 56 */                        l01o0io1ooo0.I00li1OI.I00000oOI("Ignoring empty consent settings");
/* 59 */                        return;
                            }
                        }
                    }
                    synchronized (this.I00ioIO) {
                        try {
/* 73 */                    if (l1ioIO011Oo.I000l1(i, this.I00lll10.I00000oOI)) {
/* 75 */                        l1ioIO011Oo l1ioio011oo2 = this.I00lll10;
/* 77 */                        EnumMap enumMap = l1ioio011oo.I00000oIO;
/* 89 */                        l1iioiool[] l1iioioolVarArr = (l1iioiool[]) enumMap.keySet().toArray(new l1iioiool[0]);
/* 91 */                        int length = l1iioioolVarArr.length;
/* 92 */                        int i2 = 0;
                                while (true) {
/* 93 */                            if (i2 >= length) {
/* 122 */                               z2 = false;
                                        break;
                                    }
/* 95 */                            l1iioiool l1iioioolVar = l1iioioolVarArr[i2];
/* 101 */                           l1iIoO01 l1iioo014 = (l1iIoO01) enumMap.get(l1iioioolVar);
/* 109 */                           l1iIoO01 l1iioo015 = (l1iIoO01) l1ioio011oo2.I00000oIO.get(l1iioioolVar);
/* 111 */                           l1iIoO01 l1iioo016 = l1iIoO01.DENIED;
/* 113 */                           if (l1iioo014 == l1iioo016 && l1iioo015 != l1iioo016) {
/* 117 */                               z2 = true;
                                        break;
                                    }
/* 119 */                           i2++;
                                }
/* 123 */                       l1iioiool l1iioioolVar2 = l1iioiool.ANALYTICS_STORAGE;
/* 141 */                       z3 = l1ioio011oo.I000OOo1O(l1iioioolVar2) && !this.I00lll10.I000OOo1O(l1iioioolVar2);
/* 148 */                       l1ioio011oo = l1ioio011oo.I000iOII(this.I00lll10);
/* 152 */                       this.I00lll10 = l1ioio011oo;
/* 154 */                       z4 = true;
                            } else {
/* 156 */                       z2 = false;
/* 157 */                       z3 = false;
/* 158 */                       z4 = false;
                            }
                        } catch (Throwable th) {
/* 332 */                   throw th;
                        }
                    }
/* 160 */           if (!z4) {
/* 166 */               l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 168 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 175 */               l01o0io1ooo02.I00ll1.I0000Il00O("Ignoring lower-priority consent settings, proposed settings", l1ioio011oo);
/* 178 */               return;
                    }
/* 181 */           long andIncrement = this.I00o0iI0io1.getAndIncrement();
/* 185 */           if (z2) {
/* 190 */               this.I00io1l.set(null);
/* 195 */               lIIli11i1 liili11i1 = new lIIli11i1(0);
/* 198 */               liili11i1.I00iiI = l1ioio011oo;
/* 200 */               liili11i1.I00iiO = andIncrement;
/* 202 */               liili11i1.I00iio = z3;
/* 204 */               liili11i1.I00ilI0I1 = this;
/* 206 */               VarHandle.storeStoreFence();
/* 209 */               if (z) {
/* 211 */                   I010II();
/* 214 */                   liili11i1.run();
/* 217 */                   return;
                        } else {
/* 222 */                   l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 224 */                   l0olllO1i.I000II(l0o10ooo0);
/* 227 */                   l0o10ooo0.I01101IOlO(liili11i1);
/* 230 */                   return;
                        }
                    }
/* 233 */           lIIli11i1 liili11i12 = new lIIli11i1(1);
/* 236 */           liili11i12.I00iiI = l1ioio011oo;
/* 238 */           liili11i12.I00iiO = andIncrement;
/* 240 */           liili11i12.I00iio = z3;
/* 242 */           liili11i12.I00ilI0I1 = this;
/* 244 */           VarHandle.storeStoreFence();
/* 247 */           if (z) {
/* 249 */               I010II();
/* 252 */               liili11i12.run();
                    } else if (i == 30 || i == -10) {
/* 280 */               l0o10OoO0 l0o10ooo02 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 282 */               l0olllO1i.I000II(l0o10ooo02);
/* 285 */               l0o10ooo02.I01101IOlO(liili11i12);
                    } else {
/* 267 */               l0o10OoO0 l0o10ooo03 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 269 */               l0olllO1i.I000II(l0o10ooo03);
/* 272 */               l0o10ooo03.I010o0o0oO(liili11i12);
                    }
                }

                public final void I011lO1liO1O() {
/* 1 */             iIO0ooOool.I00000oIO();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             iIl1iil iil1iil = l0olllo1i.I00iio;
/* 10 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 12 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 21 */            if (iil1iil.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 23 */                l0olllO1i.I000II(l0o10ooo0);
/* 30 */                if (l0o10ooo0.I010l1O()) {
/* 130 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 137 */                   l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get trigger URIs from analytics worker thread");
/* 245 */                   return;
                        }
/* 36 */                if (lolOiIoiillI.I0001Ioi1lo()) {
/* 119 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 126 */                   l01o0io1ooo0.I00ilO0.I00000oOI("Cannot get trigger URIs from main thread");
/* 129 */                   return;
                        }
/* 38 */                I010OIo1l();
/* 41 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 48 */                l01o0io1ooo0.I00lll10.I00000oOI("Getting trigger URIs (FE)");
/* 53 */                AtomicReference atomicReference = new AtomicReference();
/* 56 */                l0olllO1i.I000II(l0o10ooo0);
/* 62 */                lI1olilOllO1 li1olilollo1 = new lI1olilOllO1(1);
/* 65 */                li1olilollo1.I00iiI = this;
/* 67 */                li1olilollo1.I00iiO = atomicReference;
/* 69 */                VarHandle.storeStoreFence();
/* 76 */                l0o10ooo0.I010oio1OO0(atomicReference, 10000L, "get trigger URIs", li1olilollo1);
/* 83 */                List list = (List) atomicReference.get();
/* 85 */                if (list == null) {
/* 87 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 94 */                    l01o0io1ooo0.I00ioIO.I00000oOI("Timed out waiting for get trigger URIs");
/* 97 */                    return;
                        }
/* 98 */                l0olllO1i.I000II(l0o10ooo0);
/* 105 */               l0iOoII1Il l0iooii1il = new l0iOoII1Il(10);
/* 108 */               l0iooii1il.I00iiI = this;
/* 110 */               l0iooii1il.I00iiO = list;
/* 112 */               VarHandle.storeStoreFence();
/* 115 */               l0o10ooo0.I010o0o0oO(l0iooii1il);
                    }
                }

                public final PriorityQueue I011lOIoo0l() {
/* 1 */             PriorityQueue priorityQueue = this.I00lli11;
/* 3 */             if (priorityQueue != null) {
/* 20 */                return priorityQueue;
                    }
/* 15 */            PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(lI0lO0ili.I0000Il00O, OiOIlO1OII0.I00iiO));
/* 18 */            this.I00lli11 = priorityQueue2;
/* 20 */            return priorityQueue2;
                }

                public final void I011olOoO() {
                    li1l0Iiiii li1l0iiiii;
/* 1 */             I010II();
/* 12 */            if (I011lOIoo0l().isEmpty() || this.I00l0I0l0lO1 || (li1l0iiiii = (li1l0Iiiii) I011lOIoo0l().poll()) == null) {
/* 245 */               return;
                    }
/* 33 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 35 */            lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 37 */            l0olllO1i.I0000oI00(lioil0ilioi);
/* 40 */            O1iOlOIiO o1iOlOIiOI011iO = lioil0ilioi.I011iO();
/* 44 */            if (o1iOlOIiOI011iO != null) {
/* 47 */                this.I00l0I0l0lO1 = true;
/* 49 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 51 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 54 */                IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 56 */                String str = li1l0iiiii.I00iOIl;
/* 60 */                iOloiOI1.I0000Il00O("Registering trigger URI", str);
/* 67 */                ListenableFuture listenableFutureI0000oI00 = o1iOlOIiOI011iO.I0000oI00(Uri.parse(str));
/* 71 */                int i = 0;
/* 72 */                if (listenableFutureI0000oI00 == null) {
/* 74 */                    this.I00l0I0l0lO1 = false;
/* 80 */                    I011lOIoo0l().add(li1l0iiiii);
/* 83 */                    return;
                        }
/* 87 */                Io1iO1Ooo0l io1iO1Ooo0l = new Io1iO1Ooo0l(3);
/* 90 */                io1iO1Ooo0l.I00iiI = this;
/* 92 */                VarHandle.storeStoreFence();
/* 99 */                OoIOol ooIOol = new OoIOol(13);
/* 102 */               ooIOol.I00iiI = li1l0iiiii;
/* 104 */               ooIOol.I00iiO = this;
/* 106 */               VarHandle.storeStoreFence();
/* 111 */               IlloOIoilIl illoOIoilIl = new IlloOIoilIl(i);
/* 114 */               illoOIoilIl.I00iiI = listenableFutureI0000oI00;
/* 116 */               illoOIoilIl.I00iiO = ooIOol;
/* 118 */               VarHandle.storeStoreFence();
/* 121 */               listenableFutureI0000oI00.addListener(illoOIoilIl, io1iO1Ooo0l);
                    }
                }

                public final void I01I01Oolii(l1ioIO011Oo l1ioio011oo) {
/* 1 */             I010II();
/* 40 */            boolean z = (l1ioio011oo.I000OOo1O(l1iioiool.ANALYTICS_STORAGE) && l1ioio011oo.I000OOo1O(l1iioiool.AD_STORAGE)) || ((l0olllO1i) this.I00iOIl).I000OOo1O().I010o0o0oO();
/* 43 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 45 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 47 */            l0olllO1i.I000II(l0o10ooo0);
/* 50 */            l0o10ooo0.I010II();
/* 55 */            if (z != l0olllo1i.I00oliIiO01i) {
/* 57 */                l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 59 */                l0olllO1i.I000II(l0o10ooo02);
/* 62 */                l0o10ooo02.I010II();
/* 65 */                l0olllo1i.I00oliIiO01i = z;
/* 71 */                l0Oi0o l0oi0o = ((l0olllO1i) this.I00iOIl).I00ilI0I1;
/* 73 */                l0olllO1i.I0000oI00(l0oi0o);
/* 76 */                l0oi0o.I010II();
/* 104 */               Boolean boolValueOf = l0oi0o.I010ioo().contains("measurement_enabled_from_api") ? Boolean.valueOf(l0oi0o.I010ioo().getBoolean("measurement_enabled_from_api", true)) : null;
/* 105 */               if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
/* 119 */                   I011Io0I1ioi(Boolean.valueOf(z), false);
                        }
                    }
                }
            }
