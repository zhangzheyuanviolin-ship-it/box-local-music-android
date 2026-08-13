            package p000;

            import java.lang.invoke.VarHandle;
            
            public interface IIli1ol10i {
                public static final I1l0i11iIiI I00000oIO;

                static {
/* 3 */             Object obj = new Object();
/* 8 */             I1l0i11iIiI i1l0i11iIiI = new I1l0i11iIiI();
/* 11 */            i1l0i11iIiI.I00000oIO = obj;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            I00000oIO = i1l0i11iIiI;
                }
            }
