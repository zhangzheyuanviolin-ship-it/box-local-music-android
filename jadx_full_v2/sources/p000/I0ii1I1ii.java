            package p000;

            import java.util.Set;
            import java.util.logging.Level;
            
            public abstract class I0ii1I1ii extends I0110o {
                public static final iOIi0iO1OI1I I00l0OO0IO;
                public static final O0o0ill01o0 I00li1OI = new O0o0ill01o0(0, I0ii1I1ii.class);
                public volatile Set I00ioIO;
                public volatile int I00l0I0l0lO1;

                static {
                    Throwable th;
                    iOIi0iO1OI1I i0ii0oOil;
                    try {
/* 13 */                i0ii0oOil = new I0ii0I010ioo();
/* 16 */                th = null;
                    } catch (Throwable th2) {
/* 19 */                th = th2;
/* 22 */                i0ii0oOil = new I0ii0oOil();
                    }
/* 25 */            I00l0OO0IO = i0ii0oOil;
/* 27 */            if (th != null) {
/* 39 */                I00li1OI.I00000oIO().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
                    }
                }
            }
