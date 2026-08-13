            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIOIlOioIi1 implements OIOi0lOI {
                public static final iIOIlOioIi1 I00000oIO = new iIOIlOioIi1();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            lOlo1i lolo1i = new lOlo1i();
/* 20 */            lolo1i.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000oI1ioi = OooioIOo1.I000oI1ioi(olOO1i11110I00000oIO, lolo1i, "eventCount");
/* 33 */            lOlo1i lolo1i2 = new lOlo1i();
/* 37 */            lolo1i2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000oI1ioi2 = OooioIOo1.I000oI1ioi(olOO1i11110I000oI1ioi, lolo1i2, "inferenceDurationStats");
/* 50 */            lOlo1i lolo1i3 = new lOlo1i();
/* 54 */            lolo1i3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I000oI1ioi2.I001i1lo1io(lolo1i3);
/* 62 */            olOO1i11110I000oI1ioi2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
