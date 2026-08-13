            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol0OIOIi implements OiI1io {
                @Override
                public final O1ooiI111i I00000oIO() {
/* 1 */             II0O000iIl iI0O000iIl = i1O01oOIoI0I.I00lli11;
/* 5 */             OooOOIIiO0l oooOOIIiO0l = new OooOOIIiO0l();
/* 8 */             oooOOIIiO0l.I00000oIO = iI0O000iIl;
/* 10 */            VarHandle.storeStoreFence();
/* 20 */            return oooOOIIiO0l;
                }

                @Override
                public final O1ooiI111i I00000oOI(O1ooiI111i o1ooiI111i, float f, boolean z) {
/* 6 */             if (f <= 0.0d) {
/* 11 */                IoliiIlI0O.I00000oIO("invalid weight; must be greater than zero");
                    }
/* 21 */            if (f > Float.MAX_VALUE) {
/* 23 */                f = Float.MAX_VALUE;
                    }
/* 28 */            return o1ooiI111i.I0000O(new O0io1O(f, true));
                }
            }
