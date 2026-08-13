            package com.google.android.gms.measurement.internal;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.I000II;
            import p000.I1Io0i0II;
            import p000.IO0iIlI1li;
            import p000.IOloiOI1;
            import p000.IlIII0O1il;
            import p000.IlloOIoilIl;
            import p000.IlloOi1I1OO;
            import p000.IoOlilli0ol;
            import p000.OIOiOlIO01;
            import p000.OoOlO1O0o;
            import p000.iIl1iil;
            import p000.ii0il0lOolIo;
            import p000.ii0oooi0IO0l;
            import p000.iiollloIii1;
            import p000.il0IOO;
            import p000.il0lI0oo1;
            import p000.il0o00iO;
            import p000.il10Io00IlII;
            import p000.il11ll0i;
            import p000.il1OIOoloo;
            import p000.il1i11oOloil;
            import p000.il1l0io1O;
            import p000.iol1II1ii1i;
            import p000.iooiio1i0;
            import p000.iooili01;
            import p000.iooloO1iOil;
            import p000.l01O0IO1ooO0;
            import p000.l0I0Ii1OIi0;
            import p000.l0iOoII1Il;
            import p000.l0o10OoO0;
            import p000.l0olllO1i;
            import p000.l1Il1IliOI1l;
            import p000.l1oOI1O;
            import p000.l1oloOI;
            import p000.l1ooOIo;
            import p000.lI0OI1i1ii;
            import p000.lI1olilOllO1;
            import p000.lII0I0I000I;
            import p000.lIl1O1li;
            import p000.lIloiI;
            import p000.lIoI0O1iI0l;
            import p000.lIol0ili1Oi;
            import p000.lO0liIO0;
            import p000.liIOlO1;
            import p000.liO11Oo1loO;
            import p000.liOO1i1;
            import p000.lioil0ilIOi;
            import p000.ll0o10l0I01l;
            import p000.lolOiIoiillI;
            
/* 35 */    public class AppMeasurementDynamiteService extends iiollloIii1 {
                public l0olllO1i I000II;
                public final I1Io0i0II I000O01llI0;

                public AppMeasurementDynamiteService() {
/* 3 */             super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
/* 7 */             this.I000II = null;
/* 15 */            this.I000O01llI0 = new I1Io0i0II(0);
                }

                public final void I0000O() {
/* 3 */             if (this.I000II != null) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Attempting to perform action before initialize.");
                }

                public final void I0000oI00(String str, il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lioil0ilIOi lioil0ilioi = this.I000II.I00l0I0l0lO1;
/* 8 */             l0olllO1i.I0000oI00(lioil0ilioi);
/* 11 */            lioil0ilioi.I01Ilo0i(str, il0ioo);
                }

                @Override
                public void beginAdUnitExposure(String str, long j) {
/* 1 */             I0000O();
/* 6 */             il11ll0i il11ll0iVar = this.I000II.I00lll10;
/* 8 */             l0olllO1i.I0000O(il11ll0iVar);
/* 11 */            il11ll0iVar.I010OIo1l(j, str);
                }

                @Override
                public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lil1o1li.I011IO1I11OI(str, str2, bundle);
                }

                @Override
                public void clearMeasurementEnabled(long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lil1o1li.I010OIo1l();
/* 18 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 20 */            l0olllO1i.I000II(l0o10ooo0);
/* 27 */            IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(9);
/* 31 */            illoOi1I1OO.I00iiI = null;
/* 33 */            illoOi1I1OO.I00iiO = lil1o1li;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            l0o10ooo0.I010o0o0oO(illoOi1I1OO);
                }

                @Override
                public void endAdUnitExposure(String str, long j) {
/* 1 */             I0000O();
/* 6 */             il11ll0i il11ll0iVar = this.I000II.I00lll10;
/* 8 */             l0olllO1i.I0000O(il11ll0iVar);
/* 11 */            il11ll0iVar.I010i10l(j, str);
                }

                @Override
                public void generateEventId(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lioil0ilIOi lioil0ilioi = this.I000II.I00l0I0l0lO1;
/* 8 */             l0olllO1i.I0000oI00(lioil0ilioi);
/* 11 */            long jI01OIo = lioil0ilioi.I01OIo();
/* 15 */            I0000O();
/* 20 */            lioil0ilIOi lioil0ilioi2 = this.I000II.I00l0I0l0lO1;
/* 22 */            l0olllO1i.I0000oI00(lioil0ilioi2);
/* 25 */            lioil0ilioi2.I01Io000(il0ioo, jI01OIo);
                }

                @Override
                public void getAppInstanceId(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 8 */             l0olllO1i.I000II(l0o10ooo0);
/* 14 */            iooili01 iooili01Var = new iooili01(7);
/* 17 */            iooili01Var.I00iiI = il0ioo;
/* 19 */            iooili01Var.I00iiO = this;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            l0o10ooo0.I010o0o0oO(iooili01Var);
                }

                @Override
                public void getCachedAppInstanceId(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 19 */            I0000oI00((String) lil1o1li.I00io1l.get(), il0ioo);
                }

                @Override
                public void getConditionalUserProperties(String str, String str2, il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 8 */             l0olllO1i.I000II(l0o10ooo0);
/* 15 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(12);
/* 18 */            iO0iIlI1li.I00iiI = il0ioo;
/* 20 */            iO0iIlI1li.I00iiO = str;
/* 22 */            iO0iIlI1li.I00iio = str2;
/* 24 */            iO0iIlI1li.I00ilI0I1 = this;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            l0o10ooo0.I010o0o0oO(iO0iIlI1li);
                }

                @Override
                public void getCurrentScreenClass(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            lO0liIO0 lo0liio0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ll1;
/* 17 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 20 */            lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 28 */            I0000oI00(liol0ili1oi != null ? liol0ili1oi.I00000oOI : null, il0ioo);
                }

                @Override
                public void getCurrentScreenName(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            lO0liIO0 lo0liio0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ll1;
/* 17 */            l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 20 */            lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 28 */            I0000oI00(liol0ili1oi != null ? liol0ili1oi.I00000oIO : null, il0ioo);
                }

                @Override
                public void getGmpAppId(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            I0000oI00(lil1o1li.I011IOil(), il0ioo);
                }

                @Override
                public void getMaxUserProperties(String str, il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lII0I0I000I.I0000O(str);
/* 18 */            iIl1iil iil1iil = ((l0olllO1i) lil1o1li.I00iOIl).I00iio;
/* 20 */            I0000O();
/* 25 */            lioil0ilIOi lioil0ilioi = this.I000II.I00l0I0l0lO1;
/* 27 */            l0olllO1i.I0000oI00(lioil0ilioi);
/* 32 */            lioil0ilioi.I01Io001O(il0ioo, 25);
                }

                @Override
                public void getSessionId(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 17 */            l0olllO1i.I000II(l0o10ooo0);
/* 24 */            iooili01 iooili01Var = new iooili01(9);
/* 27 */            iooili01Var.I00iiI = il0ioo;
/* 29 */            iooili01Var.I00iiO = lil1o1li;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            l0o10ooo0.I010o0o0oO(iooili01Var);
                }

                @Override
                public void getTestFlag(il0IOO il0ioo, int i) {
/* 1 */             I0000O();
/* 4 */             int i2 = 0;
/* 5 */             if (i == 0) {
/* 287 */               lioil0ilIOi lioil0ilioi = this.I000II.I00l0I0l0lO1;
/* 289 */               l0olllO1i.I0000oI00(lioil0ilioi);
/* 294 */               lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 296 */               l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 301 */               AtomicReference atomicReference = new AtomicReference();
/* 308 */               l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 310 */               l0olllO1i.I000II(l0o10ooo0);
/* 315 */               lI1olilOllO1 li1olilollo1 = new lI1olilOllO1(i2);
/* 318 */               li1olilollo1.I00iiO = atomicReference;
/* 320 */               li1olilollo1.I00iiI = lil1o1li;
/* 322 */               VarHandle.storeStoreFence();
/* 335 */               lioil0ilioi.I01Ilo0i((String) l0o10ooo0.I010oio1OO0(atomicReference, 15000L, "String test flag value", li1olilollo1), il0ioo);
/* 900 */               return;
                    }
/* 8 */             int i3 = 9;
/* 10 */            if (i == 1) {
/* 229 */               lioil0ilIOi lioil0ilioi2 = this.I000II.I00l0I0l0lO1;
/* 231 */               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 236 */               lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 238 */               l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 243 */               AtomicReference atomicReference2 = new AtomicReference();
/* 250 */               l0o10OoO0 l0o10ooo02 = ((l0olllO1i) lil1o1li2.I00iOIl).I00io1l;
/* 252 */               l0olllO1i.I000II(l0o10ooo02);
/* 257 */               l0iOoII1Il l0iooii1il = new l0iOoII1Il(i3);
/* 260 */               l0iooii1il.I00iiI = atomicReference2;
/* 262 */               l0iooii1il.I00iiO = lil1o1li2;
/* 264 */               VarHandle.storeStoreFence();
/* 281 */               lioil0ilioi2.I01Io000(il0ioo, ((Long) l0o10ooo02.I010oio1OO0(atomicReference2, 15000L, "long test flag value", l0iooii1il)).longValue());
/* 284 */               return;
                    }
/* 13 */            if (i == 2) {
/* 140 */               lioil0ilIOi lioil0ilioi3 = this.I000II.I00l0I0l0lO1;
/* 142 */               l0olllO1i.I0000oI00(lioil0ilioi3);
/* 147 */               lIl1O1li lil1o1li3 = this.I000II.I00lli11;
/* 149 */               l0olllO1i.I0001Ioi1lo(lil1o1li3);
/* 154 */               AtomicReference atomicReference3 = new AtomicReference();
/* 161 */               l0o10OoO0 l0o10ooo03 = ((l0olllO1i) lil1o1li3.I00iOIl).I00io1l;
/* 163 */               l0olllO1i.I000II(l0o10ooo03);
/* 170 */               IlloOIoilIl illoOIoilIl = new IlloOIoilIl(10);
/* 173 */               illoOIoilIl.I00iiI = atomicReference3;
/* 175 */               illoOIoilIl.I00iiO = lil1o1li3;
/* 177 */               VarHandle.storeStoreFence();
/* 190 */               double dDoubleValue = ((Double) l0o10ooo03.I010oio1OO0(atomicReference3, 15000L, "double test flag value", illoOIoilIl)).doubleValue();
/* 196 */               Bundle bundle = new Bundle();
/* 201 */               bundle.putDouble("r", dDoubleValue);
                        try {
/* 204 */                   il0ioo.I001i1lo1io(bundle);
/* 207 */                   return;
                        } catch (RemoteException e) {
/* 214 */                   l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lioil0ilioi3.I00iOIl).I00ilO0;
/* 216 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 223 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning double value to wrapper", e);
/* 226 */                   return;
                        }
                    }
/* 16 */            if (i == 3) {
/* 82 */                lioil0ilIOi lioil0ilioi4 = this.I000II.I00l0I0l0lO1;
/* 84 */                l0olllO1i.I0000oI00(lioil0ilioi4);
/* 89 */                lIl1O1li lil1o1li4 = this.I000II.I00lli11;
/* 91 */                l0olllO1i.I0001Ioi1lo(lil1o1li4);
/* 96 */                AtomicReference atomicReference4 = new AtomicReference();
/* 103 */               l0o10OoO0 l0o10ooo04 = ((l0olllO1i) lil1o1li4.I00iOIl).I00io1l;
/* 105 */               l0olllO1i.I000II(l0o10ooo04);
/* 110 */               liOO1i1 lioo1i1 = new liOO1i1(i3);
/* 113 */               lioo1i1.I00iiI = atomicReference4;
/* 115 */               lioo1i1.I00iiO = lil1o1li4;
/* 117 */               VarHandle.storeStoreFence();
/* 134 */               lioil0ilioi4.I01Io001O(il0ioo, ((Integer) l0o10ooo04.I010oio1OO0(atomicReference4, 15000L, "int test flag value", lioo1i1)).intValue());
/* 137 */               return;
                    }
/* 19 */            if (i != 4) {
/* 21 */                return;
                    }
/* 24 */            lioil0ilIOi lioil0ilioi5 = this.I000II.I00l0I0l0lO1;
/* 26 */            l0olllO1i.I0000oI00(lioil0ilioi5);
/* 31 */            lIl1O1li lil1o1li5 = this.I000II.I00lli11;
/* 33 */            l0olllO1i.I0001Ioi1lo(lil1o1li5);
/* 38 */            AtomicReference atomicReference5 = new AtomicReference();
/* 45 */            l0o10OoO0 l0o10ooo05 = ((l0olllO1i) lil1o1li5.I00iOIl).I00io1l;
/* 47 */            l0olllO1i.I000II(l0o10ooo05);
/* 52 */            lI0OI1i1ii li0oi1i1ii = new lI0OI1i1ii(i2);
/* 55 */            li0oi1i1ii.I00iiO = atomicReference5;
/* 57 */            li0oi1i1ii.I00iiI = lil1o1li5;
/* 59 */            VarHandle.storeStoreFence();
/* 76 */            lioil0ilioi5.I01Io11IiiiO(il0ioo, ((Boolean) l0o10ooo05.I010oio1OO0(atomicReference5, 15000L, "boolean test flag value", li0oi1i1ii)).booleanValue());
                }

                @Override
                public void getUserProperties(String str, String str2, boolean z, il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 8 */             l0olllO1i.I000II(l0o10ooo0);
/* 14 */            l1oloOI l1olooi = new l1oloOI(0);
/* 17 */            l1olooi.I00ilI0I1 = il0ioo;
/* 19 */            l1olooi.I00iiI = str;
/* 21 */            l1olooi.I00iiO = str2;
/* 23 */            l1olooi.I00iio = z;
/* 25 */            l1olooi.I00ilO0 = this;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            l0o10ooo0.I010o0o0oO(l1olooi);
                }

                @Override
                public void initForTests(Map map) {
/* 1 */             I0000O();
                }

                @Override
                public void initialize(IoOlilli0ol ioOlilli0ol, il1i11oOloil il1i11ooloil, long j) {
/* 1 */             l0olllO1i l0olllo1i = this.I000II;
/* 3 */             if (l0olllo1i == null) {
/* 9 */                 Context context = (Context) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 11 */                lII0I0I000I.I000II(context);
/* 23 */                this.I000II = l0olllO1i.I000l1(context, il1i11ooloil, Long.valueOf(j), null);
                    } else {
/* 26 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 28 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 35 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Attempting to initialize multiple times");
                    }
                }

                @Override
                public void initializeWithElapsedTime(IoOlilli0ol ioOlilli0ol, il1i11oOloil il1i11ooloil, long j, long j2) {
/* 1 */             l0olllO1i l0olllo1i = this.I000II;
/* 3 */             if (l0olllo1i == null) {
/* 9 */                 Context context = (Context) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 11 */                lII0I0I000I.I000II(context);
/* 26 */                this.I000II = l0olllO1i.I000l1(context, il1i11ooloil, Long.valueOf(j), Long.valueOf(j2));
                    } else {
/* 29 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 31 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 38 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Attempting to initialize multiple times");
                    }
                }

                @Override
                public void isDataCollectionEnabled(il0IOO il0ioo) {
/* 1 */             I0000O();
/* 6 */             l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 8 */             l0olllO1i.I000II(l0o10ooo0);
/* 15 */            iooiio1i0 iooiio1i0Var = new iooiio1i0(12);
/* 18 */            iooiio1i0Var.I00iiI = il0ioo;
/* 20 */            iooiio1i0Var.I00iiO = this;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            l0o10ooo0.I010o0o0oO(iooiio1i0Var);
                }

                @Override
                public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 20 */            lil1o1li.I010l10O(str, str2, bundle, z, z2, j, 0L);
                }

                @Override
                public void logEventAndBundle(String str, String str2, Bundle bundle, il0IOO il0ioo, long j) {
/* 1 */             I0000O();
/* 4 */             lII0I0I000I.I0000O(str2);
/* 25 */            String str3 = true != this.I000II.I00iio.I01101IOlO(null, iol1II1ii1i.I0110OiO) ? "app" : "auto";
/* 43 */            (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
/* 57 */            ii0oooi0IO0l ii0oooi0io0l = new ii0oooi0IO0l(str2, new ii0il0lOolIo(bundle), str3, j, 0L);
/* 62 */            l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 64 */            l0olllO1i.I000II(l0o10ooo0);
/* 70 */            IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(7);
/* 73 */            iO0iIlI1li.I00iiI = il0ioo;
/* 75 */            iO0iIlI1li.I00iiO = ii0oooi0io0l;
/* 77 */            iO0iIlI1li.I00iio = str;
/* 79 */            iO0iIlI1li.I00ilI0I1 = this;
/* 81 */            VarHandle.storeStoreFence();
/* 84 */            l0o10ooo0.I010o0o0oO(iO0iIlI1li);
                }

                @Override
                public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 20 */            lil1o1li.I010l10O(str, str2, bundle, z, z2, j, j2);
                }

                @Override
                public void logHealthData(int i, String str, IoOlilli0ol ioOlilli0ol, IoOlilli0ol ioOlilli0ol2, IoOlilli0ol ioOlilli0ol3) {
/* 1 */             I0000O();
/* 9 */             Object objI00O0o1oo = ioOlilli0ol == null ? null : OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 18 */            Object objI00O0o1oo2 = ioOlilli0ol2 == null ? null : OIOiOlIO01.I00O0o1oo(ioOlilli0ol2);
/* 27 */            Object objI00O0o1oo3 = ioOlilli0ol3 != null ? OIOiOlIO01.I00O0o1oo(ioOlilli0ol3) : null;
/* 34 */            l01O0IO1ooO0 l01o0io1ooo0 = this.I000II.I00ilO0;
/* 36 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 43 */            l01o0io1ooo0.I010l10O(i, true, false, str, objI00O0o1oo, objI00O0o1oo2, objI00O0o1oo3);
                }

                @Override
                public void onActivityCreated(IoOlilli0ol ioOlilli0ol, Bundle bundle, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityCreatedByScionActivityInfo(il1l0io1O.I00000oOI(activity), bundle, j);
                }

                @Override
                public void onActivityCreatedByScionActivityInfo(il1l0io1O il1l0io1o, Bundle bundle, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 13 */            if (ilIII0O1il != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
/* 25 */                ilIII0O1il.I000OOo1O(il1l0io1o, bundle);
                    }
                }

                @Override
                public void onActivityDestroyed(IoOlilli0ol ioOlilli0ol, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityDestroyedByScionActivityInfo(il1l0io1O.I00000oOI(activity), j);
                }

                @Override
                public void onActivityDestroyedByScionActivityInfo(il1l0io1O il1l0io1o, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 13 */            if (ilIII0O1il != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
/* 25 */                ilIII0O1il.I000OiO(il1l0io1o);
                    }
                }

                @Override
                public void onActivityPaused(IoOlilli0ol ioOlilli0ol, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityPausedByScionActivityInfo(il1l0io1O.I00000oOI(activity), j);
                }

                @Override
                public void onActivityPausedByScionActivityInfo(il1l0io1O il1l0io1o, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 13 */            if (ilIII0O1il != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
/* 25 */                ilIII0O1il.I000iOII(il1l0io1o);
                    }
                }

                @Override
                public void onActivityResumed(IoOlilli0ol ioOlilli0ol, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityResumedByScionActivityInfo(il1l0io1O.I00000oOI(activity), j);
                }

                @Override
                public void onActivityResumedByScionActivityInfo(il1l0io1O il1l0io1o, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 13 */            if (ilIII0O1il != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
/* 25 */                ilIII0O1il.I000l1(il1l0io1o);
                    }
                }

                @Override
                public void onActivitySaveInstanceState(IoOlilli0ol ioOlilli0ol, il0IOO il0ioo, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivitySaveInstanceStateByScionActivityInfo(il1l0io1O.I00000oOI(activity), il0ioo, j);
                }

                @Override
                public void onActivitySaveInstanceStateByScionActivityInfo(il1l0io1O il1l0io1o, il0IOO il0ioo, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            IlIII0O1il ilIII0O1il = lil1o1li.I00iiO;
/* 15 */            Bundle bundle = new Bundle();
/* 18 */            if (ilIII0O1il != null) {
/* 22 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 24 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 27 */                lil1o1li2.I011iIOio();
/* 30 */                ilIII0O1il.I000lI(il1l0io1o, bundle);
                    }
                    try {
/* 33 */                il0ioo.I001i1lo1io(bundle);
                    } catch (RemoteException e) {
/* 40 */                l01O0IO1ooO0 l01o0io1ooo0 = this.I000II.I00ilO0;
/* 42 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 49 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error returning bundle value to wrapper", e);
                    }
                }

                @Override
                public void onActivityStarted(IoOlilli0ol ioOlilli0ol, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityStartedByScionActivityInfo(il1l0io1O.I00000oOI(activity), j);
                }

                @Override
                public void onActivityStartedByScionActivityInfo(il1l0io1O il1l0io1o, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            if (lil1o1li.I00iiO != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
                    }
                }

                @Override
                public void onActivityStopped(IoOlilli0ol ioOlilli0ol, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 17 */            onActivityStoppedByScionActivityInfo(il1l0io1O.I00000oOI(activity), j);
                }

                @Override
                public void onActivityStoppedByScionActivityInfo(il1l0io1O il1l0io1o, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            if (lil1o1li.I00iiO != null) {
/* 17 */                lIl1O1li lil1o1li2 = this.I000II.I00lli11;
/* 19 */                l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 22 */                lil1o1li2.I011iIOio();
                    }
                }

                @Override
                public void performAction(Bundle bundle, il0IOO il0ioo, long j) {
/* 1 */             I0000O();
/* 5 */             il0ioo.I001i1lo1io(null);
                }

                @Override
                public void registerOnMeasurementEventListener(il10Io00IlII il10io00ilii) {
                    ll0o10l0I01l ll0o10l0i01l;
/* 1 */             I0000O();
/* 4 */             I1Io0i0II i1Io0i0II = this.I000O01llI0;
                    synchronized (i1Io0i0II) {
                        try {
/* 7 */                     il0o00iO il0o00io = (il0o00iO) il10io00ilii;
/* 14 */                    Parcel parcelI00IoiI = il0o00io.I00IoiI(2, il0o00io.I00Iooi00oi());
/* 18 */                    int i = parcelI00IoiI.readInt();
/* 22 */                    parcelI00IoiI.recycle();
/* 33 */                    ll0o10l0i01l = (ll0o10l0I01l) i1Io0i0II.get(Integer.valueOf(i));
/* 35 */                    if (ll0o10l0i01l == null) {
/* 39 */                        ll0o10l0i01l = new ll0o10l0I01l();
/* 42 */                        ll0o10l0i01l.I00000oOI = this;
/* 44 */                        ll0o10l0i01l.I00000oIO = il0o00io;
/* 46 */                        VarHandle.storeStoreFence();
/* 53 */                        Parcel parcelI00IoiI2 = il0o00io.I00IoiI(2, il0o00io.I00Iooi00oi());
/* 57 */                        int i2 = parcelI00IoiI2.readInt();
/* 61 */                        parcelI00IoiI2.recycle();
/* 68 */                        i1Io0i0II.put(Integer.valueOf(i2), ll0o10l0i01l);
                            }
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 77 */            lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 79 */            l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 82 */            lil1o1li.I010OIo1l();
/* 91 */            if (lil1o1li.I00ilI0I1.add(ll0o10l0i01l)) {
/* 109 */               return;
                    }
/* 97 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 99 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 106 */           l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("OnEventListener already registered");
                }

                @Override
                @Deprecated
                public void resetAnalyticsData(long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lil1o1li.I0110OiO(j);
                }

                @Override
                public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lil1o1li.I0110OiO(j);
                }

                @Override
                public void retrieveAndUploadBatches(il0lI0oo1 il0li0oo1) throws MalformedURLException {
                    int i;
                    lIoI0O1iI0l lioi0o1ii0l;
/* 3 */             I0000O();
/* 8 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 10 */            l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            lil1o1li.I010OIo1l();
/* 19 */            l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 21 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 23 */            l0olllO1i.I000II(l0o10ooo0);
/* 30 */            if (l0o10ooo0.I010l1O()) {
/* 559 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 561 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 568 */               l01o0io1ooo0.I00ilO0.I00000oOI("Cannot retrieve and upload batches from analytics worker thread");
/* 1261 */              return;
                    }
/* 32 */            l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 34 */            l0olllO1i.I000II(l0o10ooo02);
/* 43 */            if (Thread.currentThread() == l0o10ooo02.I00iio) {
/* 45 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 47 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 54 */                l01o0io1ooo02.I00ilO0.I00000oOI("Cannot retrieve and upload batches from analytics network thread");
/* 57 */                return;
                    }
/* 58 */            boolean zI0001Ioi1lo = lolOiIoiillI.I0001Ioi1lo();
/* 62 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 64 */            if (zI0001Ioi1lo) {
/* 548 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 555 */               l01o0io1ooo03.I00ilO0.I00000oOI("Cannot retrieve and upload batches from main thread");
/* 558 */               return;
                    }
/* 66 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 73 */            l01o0io1ooo03.I00lll10.I00000oOI("[sgtm] Started client-side batch upload work.");
/* 76 */            boolean z = false;
/* 77 */            int size = 0;
/* 78 */            int i2 = 0;
/* 79 */            while (!z) {
/* 81 */                l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 83 */                l0olllO1i.I000II(l01o0io1ooo04);
/* 90 */                l01o0io1ooo04.I00lll10.I00000oOI("[sgtm] Getting upload batches from service (FE)");
/* 95 */                AtomicReference atomicReference = new AtomicReference();
/* 98 */                l0o10OoO0 l0o10ooo03 = l0olllo1i.I00io1l;
/* 100 */               l0olllO1i.I000II(l0o10ooo03);
/* 106 */               lI0OI1i1ii li0oi1i1ii = new lI0OI1i1ii(1);
/* 109 */               li0oi1i1ii.I00iiI = lil1o1li;
/* 111 */               li0oi1i1ii.I00iiO = atomicReference;
/* 113 */               VarHandle.storeStoreFence();
/* 120 */               l0o10ooo03.I010oio1OO0(atomicReference, 10000L, "[sgtm] Getting upload batches", li0oi1i1ii);
/* 127 */               liO11Oo1loO lio11oo1loo = (liO11Oo1loO) atomicReference.get();
/* 129 */               if (lio11oo1loo == null) {
                            break;
                        }
/* 131 */               List list = lio11oo1loo.I00iOIl;
/* 137 */               if (list.isEmpty()) {
                            break;
                        }
/* 141 */               l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 143 */               l0olllO1i.I000II(l01o0io1ooo05);
/* 158 */               l01o0io1ooo05.I00lll10.I0000Il00O("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
/* 165 */               size += list.size();
/* 166 */               Iterator it = list.iterator();
                        while (true) {
/* 174 */                   if (!it.hasNext()) {
/* 502 */                       z = false;
                                break;
                            }
/* 181 */                   liIOlO1 liiolo1 = (liIOlO1) it.next();
                            try {
/* 190 */                       URL url = new URI(liiolo1.I00iiO).toURL();
/* 196 */                       AtomicReference atomicReference2 = new AtomicReference();
/* 203 */                       iooloO1iOil iooloo1ioilI000iOII = ((l0olllO1i) lil1o1li.I00iOIl).I000iOII();
/* 207 */                       iooloo1ioilI000iOII.I010OIo1l();
/* 212 */                       lII0I0I000I.I000II(iooloo1ioilI000iOII.I00io1l);
/* 215 */                       String str = iooloo1ioilI000iOII.I00io1l;
/* 219 */                       l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 221 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i2.I00ilO0;
/* 223 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 226 */                       IOloiOI1 iOloiOI1 = l01o0io1ooo06.I00lll10;
/* 228 */                       i = size;
/* 232 */                       Long lValueOf = Long.valueOf(liiolo1.I00iOIl);
/* 247 */                       iOloiOI1.I0000oI00("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, liiolo1.I00iiO, Integer.valueOf(liiolo1.I00iiI.length));
/* 256 */                       if (!TextUtils.isEmpty(liiolo1.I00io1l)) {
/* 258 */                           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i2.I00ilO0;
/* 260 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 269 */                           l01o0io1ooo07.I00lll10.I0000O(lValueOf, "[sgtm] Uploading data from app. row_id", liiolo1.I00io1l);
                                }
/* 274 */                       HashMap map = new HashMap();
/* 277 */                       Bundle bundle = liiolo1.I00iio;
/* 291 */                       for (String str2 : bundle.keySet()) {
/* 299 */                           String string = bundle.getString(str2);
/* 307 */                           if (!TextUtils.isEmpty(string)) {
/* 309 */                               map.put(str2, string);
                                    }
                                }
/* 313 */                       lIloiI liloii = l0olllo1i2.I00o0iI0io1;
/* 315 */                       l0olllO1i.I000II(liloii);
/* 318 */                       byte[] bArr = liiolo1.I00iiI;
/* 322 */                       l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 325 */                       l1il1ilioi1l.I00iOIl = lil1o1li;
/* 327 */                       l1il1ilioi1l.I00iiI = atomicReference2;
/* 329 */                       l1il1ilioi1l.I00iiO = liiolo1;
/* 331 */                       VarHandle.storeStoreFence();
/* 334 */                       liloii.I010i10l();
/* 337 */                       lII0I0I000I.I000II(url);
/* 340 */                       lII0I0I000I.I000II(bArr);
/* 347 */                       l0o10OoO0 l0o10ooo04 = ((l0olllO1i) liloii.I00iOIl).I00io1l;
/* 349 */                       l0olllO1i.I000II(l0o10ooo04);
/* 361 */                       l0o10ooo04.I01101olii(new l0I0Ii1OIi0(liloii, str, url, bArr, map, l1il1ilioi1l));
                                try {
/* 364 */                           lioil0ilIOi lioil0ilioi = l0olllo1i2.I00l0I0l0lO1;
/* 366 */                           l0olllO1i.I0000oI00(lioil0ilioi);
/* 371 */                           l0olllO1i l0olllo1i3 = (l0olllO1i) lioil0ilioi.I00iOIl;
/* 375 */                           l0olllo1i3.I00li1OI.getClass();
/* 385 */                           long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                                    synchronized (atomicReference2) {
/* 391 */                               for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                            try {
/* 399 */                                       atomicReference2.wait(jCurrentTimeMillis2);
/* 404 */                                       l0olllo1i3.I00li1OI.getClass();
                                            } catch (Throwable th) {
/* 419 */                                       throw th;
                                            }
                                        }
                                    }
                                } catch (InterruptedException unused) {
/* 424 */                           l01O0IO1ooO0 l01o0io1ooo08 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 426 */                           l0olllO1i.I000II(l01o0io1ooo08);
/* 433 */                           l01o0io1ooo08.I00l0I0l0lO1.I00000oOI("[sgtm] Interrupted waiting for uploading batch");
                                }
/* 449 */                       lioi0o1ii0l = atomicReference2.get() == null ? lIoI0O1iI0l.UNKNOWN : (lIoI0O1iI0l) atomicReference2.get();
                            } catch (MalformedURLException | URISyntaxException e) {
/* 453 */                       i = size;
/* 459 */                       l01O0IO1ooO0 l01o0io1ooo09 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 461 */                       l0olllO1i.I000II(l01o0io1ooo09);
/* 476 */                       l01o0io1ooo09.I00ilO0.I0000oI00("[sgtm] Bad upload url for row_id", liiolo1.I00iiO, Long.valueOf(liiolo1.I00iOIl), e);
/* 479 */                       lioi0o1ii0l = lIoI0O1iI0l.FAILURE;
                            }
/* 483 */                   if (lioi0o1ii0l != lIoI0O1iI0l.SUCCESS) {
/* 493 */                       if (lioi0o1ii0l == lIoI0O1iI0l.BACKOFF) {
/* 495 */                           z = true;
/* 496 */                           size = i;
                                    break;
                                }
                            } else {
/* 485 */                       i2++;
                            }
/* 487 */                   size = i;
                        }
                    }
/* 505 */           l01O0IO1ooO0 l01o0io1ooo010 = l0olllo1i.I00ilO0;
/* 507 */           l0olllO1i.I000II(l01o0io1ooo010);
/* 522 */           l01o0io1ooo010.I00lll10.I0000O(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i2));
                    try {
/* 525 */               il0li0oo1.zze();
                    } catch (RemoteException e2) {
/* 530 */               l0olllO1i l0olllo1i4 = this.I000II;
/* 532 */               lII0I0I000I.I000II(l0olllo1i4);
/* 535 */               l01O0IO1ooO0 l01o0io1ooo011 = l0olllo1i4.I00ilO0;
/* 537 */               l0olllO1i.I000II(l01o0io1ooo011);
/* 544 */               l01o0io1ooo011.I00l0I0l0lO1.I0000Il00O("Failed to call IDynamiteUploadBatchesCallback", e2);
                    }
                }

                @Override
                public void setConditionalUserProperty(Bundle bundle, long j) {
/* 1 */             I0000O();
/* 4 */             l0olllO1i l0olllo1i = this.I000II;
/* 6 */             if (bundle == null) {
/* 8 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 17 */                l01o0io1ooo0.I00ilO0.I00000oOI("Conditional user property must not be null");
                    } else {
/* 21 */                lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 23 */                l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 26 */                lil1o1li.I0111i(bundle, j);
                    }
                }

                @Override
                public void setConsentThirdParty(Bundle bundle, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            lil1o1li.I011iO(bundle, -20, j);
                }

                @Override
                public void setCurrentScreen(IoOlilli0ol ioOlilli0ol, String str, String str2, long j) {
/* 1 */             I0000O();
/* 8 */             Activity activity = (Activity) OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lII0I0I000I.I000II(activity);
/* 21 */            setCurrentScreenByScionActivityInfo(il1l0io1O.I00000oOI(activity), str, str2, j);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
                
                    if (r2 > 500) goto L27;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void setCurrentScreenByScionActivityInfo(il1l0io1O il1l0io1o, String str, String str2, long j) {
/* 1 */             I0000O();
/* 6 */             lO0liIO0 lo0liio0 = this.I000II.I00ll1;
/* 8 */             l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) lo0liio0.I00iOIl;
/* 21 */            if (!l0olllo1i.I00iio.I0111i()) {
/* 23 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 25 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 32 */                l01o0io1ooo0.I00li1OI.I00000oOI("setCurrentScreen cannot be called while screen reporting is disabled.");
/* 35 */                return;
                    }
/* 36 */            lIol0ili1Oi liol0ili1oi = lo0liio0.I00iiO;
/* 38 */            if (liol0ili1oi == null) {
/* 40 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 42 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 49 */                l01o0io1ooo02.I00li1OI.I00000oOI("setCurrentScreen cannot be called while no activity active");
/* 52 */                return;
                    }
/* 53 */            ConcurrentHashMap concurrentHashMap = lo0liio0.I00ilO0;
/* 57 */            Integer numValueOf = Integer.valueOf(il1l0io1o.I00iOIl);
/* 65 */            if (concurrentHashMap.get(numValueOf) == null) {
/* 67 */                l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 69 */                l0olllO1i.I000II(l01o0io1ooo03);
/* 76 */                l01o0io1ooo03.I00li1OI.I00000oOI("setCurrentScreen must be called with an activity in the activity lifecycle");
/* 79 */                return;
                    }
/* 80 */            if (str2 == null) {
/* 84 */                str2 = lo0liio0.I010l10O(il1l0io1o.I00iiI);
                    }
/* 88 */            String str3 = liol0ili1oi.I00000oOI;
/* 90 */            String str4 = liol0ili1oi.I00000oIO;
/* 92 */            boolean zEquals = Objects.equals(str3, str2);
/* 96 */            boolean zEquals2 = Objects.equals(str4, str);
/* 100 */           if (zEquals && zEquals2) {
/* 104 */               l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 106 */               l0olllO1i.I000II(l01o0io1ooo04);
/* 113 */               l01o0io1ooo04.I00li1OI.I00000oOI("setCurrentScreen cannot be called with the same class and name");
/* 116 */               return;
                    }
/* 119 */           if (str != null) {
/* 125 */               if (str.length() > 0) {
/* 127 */                   int length = str.length();
/* 133 */                   l0olllo1i.I00iio.getClass();
                        }
/* 138 */               l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 140 */               l0olllO1i.I000II(l01o0io1ooo05);
/* 155 */               l01o0io1ooo05.I00li1OI.I0000Il00O("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
/* 158 */               return;
                    }
/* 163 */           if (str2.length() > 0) {
/* 165 */               int length2 = str2.length();
/* 171 */               l0olllo1i.I00iio.getClass();
/* 174 */               if (length2 <= 500) {
/* 177 */                   l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i.I00ilO0;
/* 179 */                   l0olllO1i.I000II(l01o0io1ooo06);
/* 192 */                   l01o0io1ooo06.I00lll10.I0000O(str == null ? "null" : str, "Setting current screen to name, class", str2);
/* 197 */                   lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 199 */                   l0olllO1i.I0000oI00(lioil0ilioi);
/* 206 */                   lIol0ili1Oi liol0ili1oi2 = new lIol0ili1Oi(str, str2, lioil0ilioi.I01OIo());
/* 209 */                   concurrentHashMap.put(numValueOf, liol0ili1oi2);
/* 215 */                   lo0liio0.I010lI0oi(il1l0io1o.I00iiI, liol0ili1oi2, true);
/* 218 */                   return;
                        }
                    }
/* 219 */           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i.I00ilO0;
/* 221 */           l0olllO1i.I000II(l01o0io1ooo07);
/* 236 */           l01o0io1ooo07.I00li1OI.I0000Il00O("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
                }

                @Override
                public void setDataCollectionEnabled(boolean z) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            lil1o1li.I010OIo1l();
/* 18 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 20 */            l0olllO1i.I000II(l0o10ooo0);
/* 25 */            l1oOI1O l1ooi1o = new l1oOI1O();
/* 28 */            l1ooi1o.I00iOIl = z;
/* 30 */            l1ooi1o.I00iiI = lil1o1li;
/* 32 */            VarHandle.storeStoreFence();
/* 35 */            l0o10ooo0.I010o0o0oO(l1ooi1o);
                }

                @Override
                public void setDefaultEventParameters(Bundle bundle) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 21 */            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
/* 29 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 31 */            l0olllO1i.I000II(l0o10ooo0);
/* 38 */            liOO1i1 lioo1i1 = new liOO1i1(10);
/* 41 */            lioo1i1.I00iiI = lil1o1li;
/* 43 */            lioo1i1.I00iiO = bundle2;
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            l0o10ooo0.I010o0o0oO(lioo1i1);
                }

                @Override
                public void setEventInterceptor(il10Io00IlII il10io00ilii) {
/* 1 */             I0000O();
/* 8 */             OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(12);
/* 11 */            ooOlO1O0o.I00iiO = this;
/* 13 */            ooOlO1O0o.I00iiI = il10io00ilii;
/* 15 */            VarHandle.storeStoreFence();
/* 20 */            l0o10OoO0 l0o10ooo0 = this.I000II.I00io1l;
/* 22 */            l0olllO1i.I000II(l0o10ooo0);
/* 25 */            boolean zI010l1O = l0o10ooo0.I010l1O();
/* 29 */            l0olllO1i l0olllo1i = this.I000II;
/* 31 */            if (!zI010l1O) {
/* 61 */                l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 63 */                l0olllO1i.I000II(l0o10ooo02);
/* 70 */                iooiio1i0 iooiio1i0Var = new iooiio1i0(10);
/* 73 */                iooiio1i0Var.I00iiI = ooOlO1O0o;
/* 75 */                iooiio1i0Var.I00iiO = this;
/* 77 */                VarHandle.storeStoreFence();
/* 80 */                l0o10ooo02.I010o0o0oO(iooiio1i0Var);
/* 168 */               return;
                    }
/* 33 */            lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 35 */            l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 38 */            lil1o1li.I010II();
/* 41 */            lil1o1li.I010OIo1l();
/* 44 */            OoOlO1O0o ooOlO1O0o2 = lil1o1li.I00iio;
/* 46 */            if (ooOlO1O0o != ooOlO1O0o2) {
/* 55 */                lII0I0I000I.I000OOo1O("EventInterceptor already set.", ooOlO1O0o2 == null);
                    }
/* 58 */            lil1o1li.I00iio = ooOlO1O0o;
                }

                @Override
                public void setInstanceIdProvider(il1OIOoloo il1oiooloo) {
/* 1 */             I0000O();
                }

                @Override
                public void setMeasurementEnabled(boolean z, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 11 */            Boolean boolValueOf = Boolean.valueOf(z);
/* 15 */            lil1o1li.I010OIo1l();
/* 22 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 24 */            l0olllO1i.I000II(l0o10ooo0);
/* 31 */            IlloOi1I1OO illoOi1I1OO = new IlloOi1I1OO(9);
/* 34 */            illoOi1I1OO.I00iiI = boolValueOf;
/* 36 */            illoOi1I1OO.I00iiO = lil1o1li;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            l0o10ooo0.I010o0o0oO(illoOi1I1OO);
                }

                @Override
                public void setMinimumSessionDuration(long j) {
/* 1 */             I0000O();
                }

                @Override
                public void setSessionTimeoutDuration(long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00io1l;
/* 17 */            l0olllO1i.I000II(l0o10ooo0);
/* 23 */            l1ooOIo l1oooio = new l1ooOIo(0);
/* 26 */            l1oooio.I00iiI = j;
/* 28 */            l1oooio.I00iiO = lil1o1li;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            l0o10ooo0.I010o0o0oO(l1oooio);
                }

                @Override
                public void setSgtmDebugInfo(Intent intent) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 15 */            Uri data = intent.getData();
/* 19 */            if (data == null) {
/* 21 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 23 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 30 */                l01o0io1ooo0.I00ll1.I00000oOI("Activity intent has no data. Preview Mode was not enabled.");
/* 33 */                return;
                    }
/* 36 */            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
/* 40 */            if (queryParameter == null || !queryParameter.equals("1")) {
/* 80 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 82 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 89 */                l01o0io1ooo02.I00ll1.I00000oOI("[sgtm] Preview Mode was not enabled.");
/* 95 */                l0olllo1i.I00iio.I00iiO = null;
/* 168 */               return;
                    }
/* 53 */            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
/* 61 */            if (TextUtils.isEmpty(queryParameter2)) {
/* 79 */                return;
                    }
/* 63 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 65 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 72 */            l01o0io1ooo03.I00ll1.I0000Il00O("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
/* 77 */            l0olllo1i.I00iio.I00iiO = queryParameter2;
                }

                @Override
                public void setUserId(String str, long j) {
/* 1 */             I0000O();
/* 6 */             lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 8 */             l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 15 */            if (str != null && TextUtils.isEmpty(str)) {
/* 23 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 25 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 32 */                l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("User ID must be non-empty or null");
/* 35 */                return;
                    }
/* 36 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 38 */            l0olllO1i.I000II(l0o10ooo0);
/* 45 */            IlloOIoilIl illoOIoilIl = new IlloOIoilIl(11);
/* 48 */            illoOIoilIl.I00iiI = lil1o1li;
/* 50 */            illoOIoilIl.I00iiO = str;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            l0o10ooo0.I010o0o0oO(illoOIoilIl);
/* 64 */            lil1o1li.I010oio1OO0(null, "_id", str, true, j);
                }

                @Override
                public void setUserProperty(String str, String str2, IoOlilli0ol ioOlilli0ol, boolean z, long j) throws SecurityException {
/* 1 */             I0000O();
/* 4 */             Object objI00O0o1oo = OIOiOlIO01.I00O0o1oo(ioOlilli0ol);
/* 10 */            lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 12 */            l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 15 */            lil1o1li.I010oio1OO0(str, str2, objI00O0o1oo, z, j);
                }

                @Override
                public void unregisterOnMeasurementEventListener(il10Io00IlII il10io00ilii) {
                    il0o00iO il0o00io;
                    ll0o10l0I01l ll0o10l0i01l;
/* 1 */             I0000O();
/* 4 */             I1Io0i0II i1Io0i0II = this.I000O01llI0;
                    synchronized (i1Io0i0II) {
/* 7 */                 il0o00io = (il0o00iO) il10io00ilii;
/* 14 */                Parcel parcelI00IoiI = il0o00io.I00IoiI(2, il0o00io.I00Iooi00oi());
/* 18 */                int i = parcelI00IoiI.readInt();
/* 22 */                parcelI00IoiI.recycle();
/* 33 */                ll0o10l0i01l = (ll0o10l0I01l) i1Io0i0II.remove(Integer.valueOf(i));
                    }
/* 36 */            if (ll0o10l0i01l == null) {
/* 40 */                ll0o10l0i01l = new ll0o10l0I01l();
/* 43 */                ll0o10l0i01l.I00000oOI = this;
/* 45 */                ll0o10l0i01l.I00000oIO = il0o00io;
/* 47 */                VarHandle.storeStoreFence();
                    }
/* 52 */            lIl1O1li lil1o1li = this.I000II.I00lli11;
/* 54 */            l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 57 */            lil1o1li.I010OIo1l();
/* 66 */            if (lil1o1li.I00ilI0I1.remove(ll0o10l0i01l)) {
/* 84 */                return;
                    }
/* 72 */            l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 74 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 81 */            l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("OnEventListener had not been registered");
                }

                @Override
/* 36 */        public void setConsent(Bundle bundle, long j) {
                }
            }
