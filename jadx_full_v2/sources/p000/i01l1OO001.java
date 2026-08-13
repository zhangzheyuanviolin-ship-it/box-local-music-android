            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public final class i01l1OO001 {
                public static final i01l1OO001 I00000oOI;
                public I1O0ol I00000oIO;

                static {
/* 3 */             i01l1OO001 i01l1oo001 = new i01l1OO001();
/* 7 */             i01l1oo001.I00000oIO = null;
/* 9 */             I00000oOI = i01l1oo001;
                }

                public static I1O0ol I00000oIO(Context context) {
                    I1O0ol i1O0ol;
/* 1 */             i01l1OO001 i01l1oo001 = I00000oOI;
                    synchronized (i01l1oo001) {
                        try {
/* 4 */                     i1O0ol = i01l1oo001.I00000oIO;
/* 6 */                     if (i1O0ol == null) {
/* 12 */                        if (context.getApplicationContext() != null) {
/* 14 */                            context = context.getApplicationContext();
                                }
/* 23 */                        i1O0ol = new I1O0ol();
/* 26 */                        i1O0ol.I00000oIO = context;
/* 28 */                        VarHandle.storeStoreFence();
/* 31 */                        i01l1oo001.I00000oIO = i1O0ol;
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 34 */            return i1O0ol;
                }
            }
