            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class OIi0Oio extends I1IlollII1lI {
                public final I11O0Ol I00iOIl;
                public final int I00iiI;

                public OIi0Oio(int i, I11O0Ol i11O0Ol) {
/* 4 */             this.I00iOIl = i11O0Ol;
/* 6 */             this.I00iiI = i;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 1;
                }

                @Override
                public final void I0000O(int i, I11O0Ol i11O0Ol) {
/* 89 */            throw new IllegalStateException();
                }

                @Override
                public final Object get(int i) {
/* 3 */             if (i == this.I00iiI) {
/* 5 */                 return this.I00iOIl;
                    }
/* 8 */             return null;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             OilOIO0i01l oilOIO0i01l = new OilOIO0i01l(2);
/* 7 */             oilOIO0i01l.I00iiI = this;
/* 10 */            oilOIO0i01l.I00iiO = true;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return oilOIO0i01l;
                }
            }
