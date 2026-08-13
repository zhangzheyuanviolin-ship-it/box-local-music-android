            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class I0lOoloIoi implements Executor {
                public final int I00iOIl;
                public Object I00iiI;

                public I0lOoloIoi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void execute(Runnable runnable) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 32 */                    I0lio1O01i01 i0lio1O01i01M30getOutOfFrameExecutor = ((I0lio1O01i01) obj).m30getOutOfFrameExecutor();
/* 36 */                    if (i0lio1O01i01M30getOutOfFrameExecutor != null) {
/* 53 */                        i0lio1O01i01M30getOutOfFrameExecutor.I00II0Ol1O0l(new I0lii0I00(0, runnable, Runnable.class, "run", "run()V", 0, 1));
                                break;
                            }
                            break;
                        default:
/* 8 */                     OolOi0i oolOi0i = (OolOi0i) obj;
/* 10 */                    OilOiO10IO oilOiO10IO = oolOi0i.I00000oOI;
/* 16 */                    Io11iII11ll io11iII11ll = new Io11iII11ll(26);
/* 19 */                    io11iII11ll.I00iiI = oolOi0i;
/* 21 */                    io11iII11ll.I00iiO = runnable;
/* 23 */                    VarHandle.storeStoreFence();
/* 26 */                    oilOiO10IO.execute(io11iII11ll);
                            break;
                    }
                }
            }
