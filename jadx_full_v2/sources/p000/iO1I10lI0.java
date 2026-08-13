            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iO1I10lI0 implements OIOi0lOI {
                public static final iO1I10lI0 I00000oIO = new iO1I10lI0();
                public static final IlIO00o1 I00000oOI;
                public static final IlIO00o1 I0000Il00O;
                public static final IlIO00o1 I0000O;
                public static final IlIO00o1 I0000oI00;
                public static final IlIO00o1 I0001Ioi1lo;

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("durationMs");
/* 16 */            lOlo1i lolo1i = new lOlo1i();
/* 20 */            lolo1i.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            olOO1i11110I00000oIO.I001i1lo1io(lolo1i);
/* 32 */            I00000oOI = olOO1i11110I00000oIO.I000O01llI0();
/* 36 */            OlOO1i11110 olOO1i11110I00000oIO2 = IlIO00o1.I00000oIO("handledErrors");
/* 42 */            lOlo1i lolo1i2 = new lOlo1i();
/* 46 */            lolo1i2.I0000O = 2;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            olOO1i11110I00000oIO2.I001i1lo1io(lolo1i2);
/* 58 */            I0000Il00O = olOO1i11110I00000oIO2.I000O01llI0();
/* 62 */            OlOO1i11110 olOO1i11110I00000oIO3 = IlIO00o1.I00000oIO("partiallyHandledErrors");
/* 68 */            lOlo1i lolo1i3 = new lOlo1i();
/* 72 */            lolo1i3.I0000O = 3;
/* 74 */            VarHandle.storeStoreFence();
/* 77 */            olOO1i11110I00000oIO3.I001i1lo1io(lolo1i3);
/* 84 */            I0000O = olOO1i11110I00000oIO3.I000O01llI0();
/* 88 */            OlOO1i11110 olOO1i11110I00000oIO4 = IlIO00o1.I00000oIO("unhandledErrors");
/* 94 */            lOlo1i lolo1i4 = new lOlo1i();
/* 98 */            lolo1i4.I0000O = 4;
/* 100 */           VarHandle.storeStoreFence();
/* 103 */           olOO1i11110I00000oIO4.I001i1lo1io(lolo1i4);
/* 110 */           I0000oI00 = olOO1i11110I00000oIO4.I000O01llI0();
/* 114 */           OlOO1i11110 olOO1i11110I00000oIO5 = IlIO00o1.I00000oIO("httpResponseCode");
/* 120 */           lOlo1i lolo1i5 = new lOlo1i();
/* 124 */           lolo1i5.I0000O = 5;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           olOO1i11110I00000oIO5.I001i1lo1io(lolo1i5);
/* 136 */           I0001Ioi1lo = olOO1i11110I00000oIO5.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             iOl001i1iO1i iol001i1io1i = (iOl001i1iO1i) obj;
/* 3 */             OIOi0o oIOi0o = (OIOi0o) obj2;
/* 9 */             oIOi0o.add(I00000oOI, iol001i1io1i.I00000oIO);
/* 16 */            oIOi0o.add(I0000Il00O, iol001i1io1i.I00000oOI);
/* 23 */            oIOi0o.add(I0000O, iol001i1io1i.I0000Il00O);
/* 30 */            oIOi0o.add(I0000oI00, iol001i1io1i.I0000O);
/* 37 */            oIOi0o.add(I0001Ioi1lo, iol001i1io1i.I0000oI00);
                }
            }
