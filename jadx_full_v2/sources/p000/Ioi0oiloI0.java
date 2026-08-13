            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.concurrent.Executor;
            
            public final class Ioi0oiloI0 implements Iliol1ioii0i {
                public final int I00iOIl;
                public Object I00iiI;

                public Ioi0oiloI0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void I00000oIO(Ilioo0O0O ilioo0O0O) {
                    Olo1I1 olo1I1;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 54 */                    Ioi10iOOI ioi10iOOI = (Ioi10iOOI) ((WeakReference) ((Ioi0ololOi) obj).I00ilI0I1).get();
/* 56 */                    if (ioi10iOOI != null) {
/* 58 */                        Executor executor = ioi10iOOI.I00oOio10iI1;
/* 64 */                        I0100i i0100i = new I0100i(23);
/* 67 */                        i0100i.I00iiI = ioi10iOOI;
/* 69 */                        VarHandle.storeStoreFence();
/* 72 */                        executor.execute(i0100i);
/* 75 */                        return;
                            }
/* 75 */                    return;
                        default:
/* 8 */                     OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) obj;
                            synchronized (oOlli1l1lOlI.I00iiO) {
                                try {
                                    int i2 = oOlli1l1lOlI.I00iOIl - 1;
/* 17 */                            oOlli1l1lOlI.I00iOIl = i2;
/* 21 */                            if (oOlli1l1lOlI.I00iiI && i2 == 0) {
/* 25 */                                oOlli1l1lOlI.close();
                                    }
/* 33 */                            olo1I1 = (Olo1I1) oOlli1l1lOlI.I00ilO0;
                                } catch (Throwable th) {
/* 43 */                            throw th;
                                }
                            }
/* 36 */                    if (olo1I1 != null) {
/* 38 */                        olo1I1.I00000oIO(ilioo0O0O);
/* 41 */                        return;
                            }
/* 41 */                    return;
                    }
                }
            }
