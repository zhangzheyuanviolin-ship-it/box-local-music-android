            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class ioIl1ooO1 implements OIOi0lOI {
                public static final ioIl1ooO1 I00000oIO = new ioIl1ooO1();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            iiiiIilO1iIo iiiiiilo1iio = new iiiiIilO1iIo();
/* 20 */            iiiiiilo1iio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000iOII = OooioIOo1.I000iOII(olOO1i11110I00000oIO, iiiiiilo1iio, "imageInfo");
/* 33 */            iiiiIilO1iIo iiiiiilo1iio2 = new iiiiIilO1iIo();
/* 37 */            iiiiiilo1iio2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000iOII2 = OooioIOo1.I000iOII(olOO1i11110I000iOII, iiiiiilo1iio2, "isColdCall");
/* 50 */            iiiiIilO1iIo iiiiiilo1iio3 = new iiiiIilO1iIo();
/* 54 */            iiiiiilo1iio3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 61 */            OlOO1i11110 olOO1i11110I000iOII3 = OooioIOo1.I000iOII(olOO1i11110I000iOII2, iiiiiilo1iio3, "params");
/* 67 */            iiiiIilO1iIo iiiiiilo1iio4 = new iiiiIilO1iIo();
/* 71 */            iiiiiilo1iio4.I0000O = 4;
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            olOO1i11110I000iOII3.I001i1lo1io(iiiiiilo1iio4);
/* 79 */            olOO1i11110I000iOII3.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
