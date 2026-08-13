            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0IOlOl implements OIOi0lOI {
                public static final l0IOlOl I00000oIO = new l0IOlOl();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("maxMs");
/* 16 */            iiio100i00IO iiio100i00io = new iiio100i00IO();
/* 20 */            iiio100i00io.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(iiio100i00io);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("minMs");
/* 42 */            iiio100i00IO iiio100i00io2 = new iiio100i00IO();
/* 46 */            iiio100i00io2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(iiio100i00io2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("avgMs");
/* 68 */            iiio100i00IO iiio100i00io3 = new iiio100i00IO();
/* 72 */            iiio100i00io3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(iiio100i00io3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("firstQuartileMs");
/* 94 */            iiio100i00IO iiio100i00io4 = new iiio100i00IO();
/* 98 */            iiio100i00io4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(iiio100i00io4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("medianMs");
/* 120 */           iiio100i00IO iiio100i00io5 = new iiio100i00IO();
/* 124 */           iiio100i00io5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(iiio100i00io5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("thirdQuartileMs");
/* 146 */           iiio100i00IO iiio100i00io6 = new iiio100i00IO();
/* 150 */           iiio100i00io6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(iiio100i00io6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             lOilIl0 loilil0 = (lOilIl0) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, loilil0.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, loilil0.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, loilil0.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, loilil0.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, loilil0.I0000oI00);
/* 44 */            oIOi0o.add(I000II, loilil0.I0001Ioi1lo);
                }
            }
