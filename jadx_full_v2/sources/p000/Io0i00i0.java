            package p000;

            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            
            public final class Io0i00i0 {
                public static final Io0i00i0 I0000Il00O;
                public lolIo0 I00000oIO;
                public Looper I00000oOI;

                static {
/* 5 */             lolIo0 lolio0 = new lolIo0(8);
/* 8 */             Looper mainLooper = Looper.getMainLooper();
/* 14 */            Io0i00i0 io0i00i0 = new Io0i00i0();
/* 17 */            io0i00i0.I00000oIO = lolio0;
/* 19 */            io0i00i0.I00000oOI = mainLooper;
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            I0000Il00O = io0i00i0;
                }
            }
