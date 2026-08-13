            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class l0o0ooi implements OIOi0lOI {
                public static final l0o0ooi I00000oIO = new l0o0ooi();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("imageFormat");
/* 16 */            il0I01IoO0I il0i01ioo0i = new il0I01IoO0I();
/* 20 */            il0i01ioo0i.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(il0i01ioo0i);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("originalImageSize");
/* 42 */            il0I01IoO0I il0i01ioo0i2 = new il0I01IoO0I();
/* 46 */            il0i01ioo0i2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(il0i01ioo0i2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("compressedImageSize");
/* 68 */            il0I01IoO0I il0i01ioo0i3 = new il0I01IoO0I();
/* 72 */            il0i01ioo0i3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(il0i01ioo0i3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("isOdmlImage");
/* 94 */            il0I01IoO0I il0i01ioo0i4 = new il0I01IoO0I();
/* 98 */            il0i01ioo0i4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(il0i01ioo0i4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             li11ilO li11ilo = (li11ilO) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, li11ilo.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, li11ilo.I00000oOI);
/* 22 */            oIOi0o.add(I0000O, (Object) null);
/* 27 */            oIOi0o.add(I0000oI00, (Object) null);
                }
            }
