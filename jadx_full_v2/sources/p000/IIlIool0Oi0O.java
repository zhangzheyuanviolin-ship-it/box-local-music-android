            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class IIlIool0Oi0O {
                public static final IIlIoiO I00000oIO;

                static {
/* 3 */             IIlIoiO iIlIoiO = new IIlIoiO();
/* 8 */             Object obj = new Object();
/* 13 */            I1l0i11iIiI i1l0i11iIiI = new I1l0i11iIiI();
/* 16 */            i1l0i11iIiI.I00000oIO = obj;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            iIlIoiO.I00iOIl = i1l0i11iIiI;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00000oIO = iIlIoiO;
                }
            }
