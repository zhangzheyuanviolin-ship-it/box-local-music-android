            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lII0lOl implements OIOi0lOI {
                public static final lII0lOl I00000oIO = new lII0lOl();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            iiiiIilO1iIo iiiiiilo1iio = new iiiiIilO1iIo();
/* 20 */            iiiiiilo1iio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiiiiilo1iio);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("subjectSegmenterOptions");
/* 42 */            iiiiIilO1iIo iiiiiilo1iio2 = new iiiiIilO1iIo();
/* 46 */            iiiiiilo1iio2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiiiiilo1iio2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             llOoOI00I1o lloooi00i1o = (llOoOI00I1o) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 5 */             lloooi00i1o.getClass();
/* 12 */            oIOi0o.add(I00000oOI, li0lO1OoO.NO_ERROR);
/* 19 */            oIOi0o.add(I0000Il00O, lloooi00i1o.I00000oIO);
                }
            }
