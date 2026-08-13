            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class iOi1iOl1IIoI implements liI0OilOI1I1 {
                public static final iOi1iOl1IIoI I00000oOI = new iOi1iOl1IIoI(0);
                public static final iOi1iOl1IIoI I0000Il00O = new iOi1iOl1IIoI(1);
                public final int I00000oIO;

                public iOi1iOl1IIoI(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final ListenableFuture zza(Object obj) {
                    int i;
                    switch (this.I00000oIO) {
                        case 0:
/* 54 */                    ioii01Ii100 ioii01ii100 = (ioii01Ii100) obj;
/* 56 */                    liIOoOi1Ii1 liioooi1ii1I0001Ioi1lo = ioii01ii100.I0001Ioi1lo();
/* 63 */                    io0o0011 io0o0011Var = new io0o0011(0);
/* 66 */                    io0o0011Var.I00000oOI = ioii01ii100;
/* 68 */                    VarHandle.storeStoreFence();
/* 73 */                    return ll0li01oO0li.I0000Il00O(liioooi1ii1I0001Ioi1lo, io0o0011Var, ioii01ii100.I0000O);
                        default:
/* 6 */                     ilOiOOII0I0 iloiooii0i0 = (ilOiOOII0I0) obj;
/* 8 */                     if (iloiooii0i0 == null) {
/* 17 */                        return ll0li01oO0li.I00000oOI(new IllegalStateException("Failed to get base model name. aiFeature is null."));
                            }
/* 22 */                    String str = iloiooii0i0.I00000oOI;
                            return ("nano-v4-full".equals(str) && ((i = iloiooii0i0.I0000oI00) == 646 || i == 645)) ? ll0li01oO0li.I00000oIO("nano-v4-fast") : ll0li01oO0li.I00000oIO(str);
                    }
                }
            }
