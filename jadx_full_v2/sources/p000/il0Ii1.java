            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class il0Ii1 extends il10o0000 {
                public static final il0Ii1 I00000oOI;
                public AtomicReference I00000oIO;

                static {
/* 3 */             il1ilO il1ilo = il1ilO.I00000oIO;
/* 5 */             il0Ii1 il0ii1 = new il0Ii1();
/* 13 */            il0ii1.I00000oIO = new AtomicReference(il1ilo);
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            I00000oOI = il0ii1;
                }

                @Override
                public final lilI1ii I00000oIO() {
/* 9 */             return ((il10o0000) this.I00000oIO.get()).I00000oIO();
                }

                @Override
                public final ilIOIll I00000oOI() {
/* 9 */             return ((il10o0000) this.I00000oIO.get()).I00000oOI();
                }

                @Override
                public final void I0000Il00O(String str, Level level, boolean z) {
/* 9 */             ((il10o0000) this.I00000oIO.get()).I0000Il00O(str, level, z);
                }
            }
