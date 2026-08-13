            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0i10l0i0Io implements OIOi0lOI {
                public static final l0i10l0i0Io I00000oIO = new l0i10l0i0Io();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;
                public static final IlIO00o1 I000II;
                public static final IlIO00o1 I000O01llI0;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            io0o0I0li1 io0o0i0li1 = new io0o0I0li1();
/* 20 */            io0o0i0li1.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(io0o0i0li1);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("hasResult");
/* 42 */            io0o0I0li1 io0o0i0li12 = new io0o0I0li1();
/* 46 */            io0o0i0li12.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(io0o0i0li12);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("isColdCall");
/* 68 */            io0o0I0li1 io0o0i0li13 = new io0o0I0li1();
/* 72 */            io0o0i0li13.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(io0o0i0li13);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("imageInfo");
/* 94 */            io0o0I0li1 io0o0i0li14 = new io0o0I0li1();
/* 98 */            io0o0i0li14.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(io0o0i0li14);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("options");
/* 120 */           io0o0I0li1 io0o0i0li15 = new io0o0I0li1();
/* 124 */           io0o0i0li15.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(io0o0i0li15);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
/* 140 */           OlOO1i11110 olOO1i11110I00000oIO6 = IlIO00o1.I00000oIO("detectedBarcodeFormats");
/* 146 */           io0o0I0li1 io0o0i0li16 = new io0o0I0li1();
/* 150 */           io0o0i0li16.I0000O = 6;
/* 152 */           VarHandle.storeStoreFence();
/* 155 */           olOO1i11110I00000oIO6.I001i1lo1io(io0o0i0li16);
/* 162 */           I000II = olOO1i11110I00000oIO6.I000O01llI0();
/* 166 */           OlOO1i11110 olOO1i11110I00000oIO7 = IlIO00o1.I00000oIO("detectedBarcodeValueTypes");
/* 172 */           io0o0I0li1 io0o0i0li17 = new io0o0I0li1();
/* 176 */           io0o0i0li17.I0000O = 7;
/* 178 */           VarHandle.storeStoreFence();
/* 181 */           olOO1i11110I00000oIO7.I001i1lo1io(io0o0i0li17);
/* 188 */           I000O01llI0 = olOO1i11110I00000oIO7.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             ioi1lOIlO1 ioi1loilo1 = (ioi1lOIlO1) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, ioi1loilo1.I00000oIO);
/* 15 */            oIOi0o.add(I0000Il00O, (Object) null);
/* 22 */            oIOi0o.add(I0000O, ioi1loilo1.I00000oOI);
/* 27 */            oIOi0o.add(I0000oI00, (Object) null);
/* 34 */            oIOi0o.add(I0001Ioi1lo, ioi1loilo1.I0000Il00O);
/* 41 */            oIOi0o.add(I000II, ioi1loilo1.I0000O);
/* 48 */            oIOi0o.add(I000O01llI0, ioi1loilo1.I0000oI00);
                }
            }
