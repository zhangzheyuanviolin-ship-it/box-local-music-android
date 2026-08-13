            package com.google.firebase.installations;

            import android.content.Context;
            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import p000.I1I0i0Ilo1Oi;
            import p000.I1l1000Io;
            import p000.I1looi0;
            import p000.II1011l1i1lo;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOi00Io1;
            import p000.IiIooooiilo;
            import p000.IioIoO10iOiI;
            import p000.IlIoliIO;
            import p000.IlIolo11lo;
            import p000.IlO01o11oOOO;
            import p000.IlO0Ii1Il00o;
            import p000.Io1Oioii1111;
            import p000.Io1OlOO;
            import p000.IooI0ilii;
            import p000.O0ioIo1O0lO;
            import p000.OOiO0Il;
            import p000.OOiilOlOOI;
            import p000.OOl1lo1111Ii;
            import p000.OilOi11lI0;
            import p000.OolliI1oliO;
            import p000.iooili01;
            import p000.lII0I0I000I;
            
            public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
                private static final String LIBRARY_NAME = "fire-installations";

                private static IlO0Ii1Il00o lambda$getComponents$0(IOiOIoiiO0i iOiOIoiiO0i) {
/* 9 */             IlIoliIO ilIoliIO = (IlIoliIO) iOiOIoiiO0i.I00000oIO(IlIoliIO.class);
/* 13 */            OOiO0Il oOiO0IlI0001Ioi1lo = iOiOIoiiO0i.I0001Ioi1lo(Io1OlOO.class);
/* 30 */            ExecutorService executorService = (ExecutorService) iOiOIoiiO0i.I000iOII(new OOiilOlOOI(I1looi0.class, ExecutorService.class));
/* 45 */            Executor executor = (Executor) iOiOIoiiO0i.I000iOII(new OOiilOlOOI(II1011l1i1lo.class, Executor.class));
/* 49 */            OilOi11lI0 oilOi11lI0 = new OilOi11lI0();
/* 57 */            oilOi11lI0.I00iiI = new ArrayDeque();
/* 60 */            oilOi11lI0.I00iiO = 1;
/* 64 */            oilOi11lI0.I00iio = 0L;
/* 68 */            int i = 2;
/* 69 */            iooili01 iooili01Var = new iooili01(i);
/* 72 */            iooili01Var.I00iiO = oilOi11lI0;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            oilOi11lI0.I00ilI0I1 = iooili01Var;
/* 79 */            lII0I0I000I.I000II(executor);
/* 82 */            oilOi11lI0.I00iOIl = executor;
/* 84 */            VarHandle.storeStoreFence();
/* 89 */            ilIoliIO.I00000oIO();
/* 92 */            Context context = ilIoliIO.I00000oIO;
/* 94 */            IlIolo11lo ilIolo11lo = new IlIolo11lo();
/* 97 */            ilIolo11lo.I00000oIO = context;
/* 99 */            ilIolo11lo.I00000oOI = oOiO0IlI0001Ioi1lo;
/* 103 */           IooI0ilii iooI0ilii = new IooI0ilii();
/* 106 */           OolliI1oliO.I00000oIO();
/* 109 */           VarHandle.storeStoreFence();
/* 112 */           ilIolo11lo.I0000Il00O = iooI0ilii;
/* 114 */           VarHandle.storeStoreFence();
/* 121 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(22);
/* 124 */           i1I0i0Ilo1Oi.I00iiO = ilIoliIO;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           OolliI1oliO oolliI1oliOI00000oIO = OolliI1oliO.I00000oIO();
/* 137 */           IOiOi00Io1 iOiOi00Io1 = new IOiOi00Io1(i);
/* 140 */           iOiOi00Io1.I00000oOI = ilIoliIO;
/* 142 */           VarHandle.storeStoreFence();
/* 145 */           O0ioIo1O0lO o0ioIo1O0lO = new O0ioIo1O0lO(iOiOi00Io1);
/* 150 */           OOl1lo1111Ii oOl1lo1111Ii = new OOl1lo1111Ii();
/* 153 */           IlO01o11oOOO ilO01o11oOOO = new IlO01o11oOOO();
/* 161 */           ilO01o11oOOO.I000II = new Object();
/* 168 */           ilO01o11oOOO.I000iOII = new HashSet();
/* 175 */           ilO01o11oOOO.I000l1 = new ArrayList();
/* 177 */           ilO01o11oOOO.I00000oIO = ilIoliIO;
/* 179 */           ilO01o11oOOO.I00000oOI = ilIolo11lo;
/* 181 */           ilO01o11oOOO.I0000Il00O = i1I0i0Ilo1Oi;
/* 183 */           ilO01o11oOOO.I0000O = oolliI1oliOI00000oIO;
/* 185 */           ilO01o11oOOO.I0000oI00 = o0ioIo1O0lO;
/* 187 */           ilO01o11oOOO.I0001Ioi1lo = oOl1lo1111Ii;
/* 189 */           ilO01o11oOOO.I000O01llI0 = executorService;
/* 191 */           ilO01o11oOOO.I000OOo1O = oilOi11lI0;
/* 193 */           VarHandle.storeStoreFence();
/* 966 */           return ilO01o11oOOO;
                }

                @Override
                public List<IOiIi0Oi> getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(IlO0Ii1Il00o.class);
/* 9 */             iOiIOOl0lOI00000oOI.I00000oIO = LIBRARY_NAME;
/* 17 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(IlIoliIO.class));
/* 29 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(0, 1, Io1OlOO.class));
/* 46 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(new OOiilOlOOI(I1looi0.class, ExecutorService.class), 1, 0));
/* 63 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(new OOiilOlOOI(II1011l1i1lo.class, Executor.class), 1, 0));
/* 73 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IioIoO10iOiI(14);
/* 106 */           return Arrays.asList(iOiIOOl0lOI00000oOI.I00000oOI(), IOiIi0Oi.I0000Il00O(Io1Oioii1111.class, new Io1Oioii1111(0)), IOiIi0Oi.I0000Il00O(I1l1000Io.class, I1l1000Io.I00000oIO(LIBRARY_NAME, "19.1.2")));
                }
            }
