            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class o0iIOlIoo00 implements Function1 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public o0iIOlIoo00(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 38 */                    ii01O1l ii01o1l = (ii01O1l) this.I00iiI;
/* 40 */                    ArrayList arrayList = ii01o1l.I00000oIO;
/* 42 */                    int size = arrayList.size();
/* 49 */                    Oo0OlIO oo0OlIO = new Oo0OlIO(3);
/* 52 */                    oo0OlIO.I00iiI = arrayList;
/* 54 */                    VarHandle.storeStoreFence();
/* 59 */                    Function1 function1 = (Function1) this.I00iiO;
/* 64 */                    IlI0l10lO ilI0l10lO = new IlI0l10lO(1);
/* 67 */                    ilI0l10lO.I00iiI = arrayList;
/* 69 */                    ilI0l10lO.I00iiO = function1;
/* 71 */                    ilI0l10lO.I00iio = ii01o1l;
/* 73 */                    VarHandle.storeStoreFence();
/* 85 */                    ((O0lolo) obj).I0000oI00(size, null, oo0OlIO, new IOii1l(2039820996, ilI0l10lO, true));
                            break;
                        default:
/* 8 */                     Throwable th = (Throwable) obj;
/* 12 */                    if (th instanceof i01iIoo1loO) {
/* 22 */                        ((O10oIiIi0OI0) this.I00iiI).stop(((i01iIoo1loO) th).I00iOIl);
                            }
/* 30 */                    ((ListenableFuture) this.I00iiO).cancel(false);
                            break;
                    }
/* 33 */            return ooiIlOl1iI;
                }
            }
