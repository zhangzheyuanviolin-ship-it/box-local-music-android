            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0l1oOiiol0l implements OIOi0lOI {
                public static final l0l1oOiiol0l I00000oIO = new l0l1oOiiol0l();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("maxMs");
/* 16 */            il0I01IoO0I il0i01ioo0i = new il0I01IoO0I();
/* 20 */            il0i01ioo0i.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(il0i01ioo0i);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("minMs");
/* 42 */            il0I01IoO0I il0i01ioo0i2 = new il0I01IoO0I();
/* 46 */            il0i01ioo0i2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(il0i01ioo0i2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("avgMs");
/* 68 */            il0I01IoO0I il0i01ioo0i3 = new il0I01IoO0I();
/* 72 */            il0i01ioo0i3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(il0i01ioo0i3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("firstQuartileMs");
/* 94 */            il0I01IoO0I il0i01ioo0i4 = new il0I01IoO0I();
/* 98 */            il0i01ioo0i4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(il0i01ioo0i4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("medianMs");
/* 120 */           il0I01IoO0I il0i01ioo0i5 = new il0I01IoO0I();
/* 124 */           il0i01ioo0i5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(il0i01ioo0i5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("thirdQuartileMs");
/* 146 */           il0I01IoO0I il0i01ioo0i6 = new il0I01IoO0I();
/* 150 */           il0i01ioo0i6.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(il0i01ioo0i6);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             li001Ol li001ol = (li001Ol) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, li001ol.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, li001ol.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, li001ol.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, li001ol.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, li001ol.I0000oI00);
/* 44 */            oIOi0o.add(I000II, li001ol.I0001Ioi1lo);
                }
            }
