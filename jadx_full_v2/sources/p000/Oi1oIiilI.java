            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class Oi1oIiilI {
                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, float f) {
/* 3 */             I1O0i0i i1O0i0i = new I1O0i0i();
/* 6 */             i1O0i0i.I00000oIO = f;
/* 11 */            if (f <= 0.0f) {
/* 36 */                IoliiIlI0O.I00000oIO("aspectRatio " + f + " must be > 0");
                    }
/* 13 */            VarHandle.storeStoreFence();
/* 40 */            return o1ooiI111i.I0000O(i1O0i0i);
                }

                public static final boolean I00000oOI(long j, int i, int i2) {
/* 1 */             int iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 9 */             if (i > IOo0oO11ll1O.I000OiO(j) || iI000l1 > i) {
/* 27 */                return false;
                    }
                    return i2 <= IOo0oO11ll1O.I000OOo1O(j) && IOo0oO11ll1O.I000iOII(j) <= i2;
                }
            }
