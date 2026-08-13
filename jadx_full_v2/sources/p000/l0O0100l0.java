            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0O0100l0 implements OIOi0lOI {
                public static final l0O0100l0 I00000oIO = new l0O0100l0();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("numSamples");
/* 16 */            i1liOIOoi i1lioiooi = new i1liOIOoi();
/* 20 */            i1lioiooi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000O01llI0 = OooioIOo1.I000O01llI0(olOO1i11110I00000oIO, i1lioiooi, "errorCode");
/* 33 */            i1liOIOoi i1lioiooi2 = new i1liOIOoi();
/* 37 */            i1lioiooi2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000O01llI02 = OooioIOo1.I000O01llI0(olOO1i11110I000O01llI0, i1lioiooi2, "metricResults");
/* 50 */            i1liOIOoi i1lioiooi3 = new i1liOIOoi();
/* 54 */            i1lioiooi3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I000O01llI02.I001i1lo1io(i1lioiooi3);
/* 62 */            olOO1i11110I000O01llI02.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
