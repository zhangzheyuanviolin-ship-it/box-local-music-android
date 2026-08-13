            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            
            public final class OO0oo1 extends I01OoOi implements Ioio0iiil1, Collection, O0IlIoi {
                public static final OO0oo1 I00iio;
                public final Object I00iOIl;
                public final Object I00iiI;
                public final OO0lili I00iiO;

                static {
/* 3 */             l1I0oI l1i0oi = l1I0oI.I00iio;
/* 10 */            I00iio = new OO0oo1(l1i0oi, l1i0oi, OO0lili.I00iiO);
                }

                public OO0oo1(Object obj, Object obj2, OO0lili oO0lili) {
/* 4 */             this.I00iOIl = obj;
/* 6 */             this.I00iiI = obj2;
/* 8 */             this.I00iiO = oO0lili;
                }

                @Override
                public final int I00000oOI() {
/* 3 */             return this.I00iiO.I00iiI;
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiO.containsKey(obj);
                }

                @Override
                public final Iterator iterator() {
/* 3 */             OO0oo0lO oO0oo0lO = new OO0oo0lO();
/* 8 */             oO0oo0lO.I00iiI = this.I00iOIl;
/* 12 */            oO0oo0lO.I00iiO = this.I00iiO;
/* 14 */            VarHandle.storeStoreFence();
/* 20 */            return oO0oo0lO;
                }
            }
