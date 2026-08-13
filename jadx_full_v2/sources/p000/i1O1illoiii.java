            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Level;
            
            public final class i1O1illoiii extends i1OO1I1lOi {
                public static final i1O1illoiii I00000oOI;
                public AtomicReference I00000oIO;

                static {
/* 3 */             i1OOIiOOiOi0 i1ooiiooioi0 = i1OOIiOOiOi0.I00000oIO;
/* 5 */             i1O1illoiii i1o1illoiii = new i1O1illoiii();
/* 13 */            i1o1illoiii.I00000oIO = new AtomicReference(i1ooiiooioi0);
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            I00000oOI = i1o1illoiii;
                }

                @Override
                public final void I00000oIO(String str, Level level, boolean z) {
/* 9 */             ((i1OO1I1lOi) this.I00000oIO.get()).I00000oIO(str, level, z);
                }

                @Override
                public final i1OlOoO10O1 I00000oOI() {
/* 9 */             return ((i1OO1I1lOi) this.I00000oIO.get()).I00000oOI();
                }

                @Override
                public final ll1lIIo I0000Il00O() {
/* 9 */             return ((i1OO1I1lOi) this.I00000oIO.get()).I0000Il00O();
                }
            }
