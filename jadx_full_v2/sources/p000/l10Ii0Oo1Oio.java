            package p000;

            import android.content.Context;
            import java.lang.invoke.VarHandle;
            
            public abstract class l10Ii0Oo1Oio {
                public static IOiIi0Oi I00000oIO(String str, IioIoO10iOiI iioIoO10iOiI) {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(I1l1000Io.class);
/* 8 */             iOiIOOl0lOI00000oOI.I0000oI00 = 1;
/* 16 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 23 */            IIoIil iIoIil = new IIoIil(10);
/* 26 */            iIoIil.I00iiI = str;
/* 28 */            iIoIil.I00iiO = iioIoO10iOiI;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = iIoIil;
/* 35 */            return iOiIOOl0lOI00000oOI.I00000oOI();
                }
            }
