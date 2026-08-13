            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class IIl00i0o0oI {
                public static IIoI00I00I I00000oIO(Context context, Ii10Ioo00l ii10Ioo00l, Set set) throws IolIoOoi11, NumberFormatException {
/* 3 */             IIoI00I00I iIoI00I00I = new IIoI00I00I();
/* 6 */             iIoI00I00I.I00000oIO = context;
/* 8 */             iIoI00I00I.I00000oOI = ii10Ioo00l;
/* 15 */            iIoI00I00I.I0000Il00O = new Object();
/* 19 */            iIoI00I00I.I0000O = Il011I1OiO0I.I00iOIl;
                    try {
/* 27 */                iIoI00I00I.I00000oIO(IOOi0Ool1i.I00iIi0i1o(set));
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                return iIoI00I00I;
                    } catch (IIoIIIiillO e) {
/* 98 */                throw new IolIoOoi11(e);
                    }
                }
            }
