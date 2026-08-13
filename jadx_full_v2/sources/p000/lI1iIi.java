            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lI1iIi implements OIOi0lOI {
                public static final lI1iIi I00000oIO = new lI1iIi();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            iio00OliII iio00oliii = new iio00OliII();
/* 20 */            iio00oliii.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000O01llI0 = io1OllI.I000O01llI0(olOO1i11110I00000oIO, iio00oliii, "durationMs");
/* 33 */            iio00OliII iio00oliii2 = new iio00OliII();
/* 37 */            iio00oliii2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            olOO1i11110I000O01llI0.I001i1lo1io(iio00oliii2);
/* 45 */            olOO1i11110I000O01llI0.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
