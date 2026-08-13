            package com.google.firebase.concurrent;

            import com.google.firebase.components.ComponentRegistrar;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.I1looi0;
            import p000.II1011l1i1lo;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOoIO1OI;
            import p000.IiIl1iOoI01I;
            import p000.IioIoO10iOiI;
            import p000.O0ioIo1O0lO;
            import p000.O0ol1O;
            import p000.OOiilOlOOI;
            import p000.Ooi1oi1il0i;
            import p000.lII0IlO;
            
            public class ExecutorsRegistrar implements ComponentRegistrar {
                public static final O0ioIo1O0lO I00000oIO = new O0ioIo1O0lO(new IOiOoIO1OI(1));
                public static final O0ioIo1O0lO I00000oOI = new O0ioIo1O0lO(new IOiOoIO1OI(2));
                public static final O0ioIo1O0lO I0000Il00O = new O0ioIo1O0lO(new IOiOoIO1OI(3));
                public static final O0ioIo1O0lO I0000O = new O0ioIo1O0lO(new IOiOoIO1OI(4));

                public static IiIl1iOoI01I I00000oIO(ExecutorService executorService) {
/* 9 */             ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) I0000O.get();
/* 11 */            IiIl1iOoI01I iiIl1iOoI01I = new IiIl1iOoI01I();
/* 14 */            iiIl1iOoI01I.I00iOIl = executorService;
/* 16 */            iiIl1iOoI01I.I00iiI = scheduledExecutorService;
/* 18 */            VarHandle.storeStoreFence();
/* 49 */            return iiIl1iOoI01I;
                }

                @Override
                public final List getComponents() {
/* 7 */             OOiilOlOOI oOiilOlOOI = new OOiilOlOOI(I1looi0.class, ScheduledExecutorService.class);
/* 24 */            OOiilOlOOI[] oOiilOlOOIArr = {new OOiilOlOOI(I1looi0.class, ExecutorService.class), new OOiilOlOOI(I1looi0.class, Executor.class)};
/* 30 */            HashSet hashSet = new HashSet();
/* 35 */            HashSet hashSet2 = new HashSet();
/* 40 */            HashSet hashSet3 = new HashSet();
/* 43 */            hashSet.add(oOiilOlOOI);
/* 51 */            for (int i = 0; i < 2; i++) {
/* 55 */                lII0IlO.I00000oIO("Null interface", oOiilOlOOIArr[i]);
                    }
/* 61 */            Collections.addAll(hashSet, oOiilOlOOIArr);
/* 85 */            IOiIi0Oi iOiIi0Oi = new IOiIi0Oi(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new IioIoO10iOiI(3), hashSet3);
/* 92 */            OOiilOlOOI oOiilOlOOI2 = new OOiilOlOOI(II1011l1i1lo.class, ScheduledExecutorService.class);
/* 105 */           OOiilOlOOI[] oOiilOlOOIArr2 = {new OOiilOlOOI(II1011l1i1lo.class, ExecutorService.class), new OOiilOlOOI(II1011l1i1lo.class, Executor.class)};
/* 111 */           HashSet hashSet4 = new HashSet();
/* 116 */           HashSet hashSet5 = new HashSet();
/* 121 */           HashSet hashSet6 = new HashSet();
/* 124 */           hashSet4.add(oOiilOlOOI2);
/* 131 */           for (int i2 = 0; i2 < 2; i2++) {
/* 135 */               lII0IlO.I00000oIO("Null interface", oOiilOlOOIArr2[i2]);
                    }
/* 141 */           Collections.addAll(hashSet4, oOiilOlOOIArr2);
/* 172 */           IOiIi0Oi iOiIi0Oi2 = new IOiIi0Oi(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new IioIoO10iOiI(4), hashSet6);
/* 181 */           OOiilOlOOI oOiilOlOOI3 = new OOiilOlOOI(O0ol1O.class, ScheduledExecutorService.class);
/* 194 */           OOiilOlOOI[] oOiilOlOOIArr3 = {new OOiilOlOOI(O0ol1O.class, ExecutorService.class), new OOiilOlOOI(O0ol1O.class, Executor.class)};
/* 200 */           HashSet hashSet7 = new HashSet();
/* 205 */           HashSet hashSet8 = new HashSet();
/* 210 */           HashSet hashSet9 = new HashSet();
/* 213 */           hashSet7.add(oOiilOlOOI3);
/* 220 */           for (int i3 = 0; i3 < 2; i3++) {
/* 224 */               lII0IlO.I00000oIO("Null interface", oOiilOlOOIArr3[i3]);
                    }
/* 230 */           Collections.addAll(hashSet7, oOiilOlOOIArr3);
/* 261 */           IOiIi0Oi iOiIi0Oi3 = new IOiIi0Oi(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new IioIoO10iOiI(5), hashSet9);
/* 273 */           IOiIOOl0lO iOiIOOl0lOI00000oIO = IOiIi0Oi.I00000oIO(new OOiilOlOOI(Ooi1oi1il0i.class, Executor.class));
/* 283 */           iOiIOOl0lOI00000oIO.I0001Ioi1lo = new IioIoO10iOiI(6);
/* 293 */           return Arrays.asList(iOiIi0Oi, iOiIi0Oi2, iOiIi0Oi3, iOiIOOl0lOI00000oIO.I00000oOI());
                }
            }
