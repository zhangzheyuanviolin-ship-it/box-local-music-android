            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lIi0i0oiO1l implements OIOi0lOI {
                public static final lIi0i0oiO1l I00000oIO = new lIi0i0oiO1l();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("totalLatencyMs");
/* 16 */            l0OliiOIio l0oliioiio = new l0OliiOIio();
/* 20 */            l0oliioiio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000l1 = io1OllI.I000l1(olOO1i11110I00000oIO, l0oliioiio, "awbLatencyMs");
/* 33 */            l0OliiOIio l0oliioiio2 = new l0OliiOIio();
/* 37 */            l0oliioiio2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000l12 = io1OllI.I000l1(olOO1i11110I000l1, l0oliioiio2, "colorClassificationLatencyMs");
/* 50 */            l0OliiOIio l0oliioiio3 = new l0OliiOIio();
/* 54 */            l0oliioiio3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 61 */            OlOO1i11110 olOO1i11110I000l13 = io1OllI.I000l1(olOO1i11110I000l12, l0oliioiio3, "shadowRemovalLatencyMs");
/* 67 */            l0OliiOIio l0oliioiio4 = new l0OliiOIio();
/* 71 */            l0oliioiio4.I0000O = 4;
/* 73 */            VarHandle.storeStoreFence();
/* 78 */            OlOO1i11110 olOO1i11110I000l14 = io1OllI.I000l1(olOO1i11110I000l13, l0oliioiio4, "contrastEnhancementLatencyMs");
/* 84 */            l0OliiOIio l0oliioiio5 = new l0OliiOIio();
/* 88 */            l0oliioiio5.I0000O = 5;
/* 90 */            VarHandle.storeStoreFence();
/* 95 */            OlOO1i11110 olOO1i11110I000l15 = io1OllI.I000l1(olOO1i11110I000l14, l0oliioiio5, "sharpeningLatencyMs");
/* 101 */           l0OliiOIio l0oliioiio6 = new l0OliiOIio();
/* 105 */           l0oliioiio6.I0000O = 6;
/* 107 */           VarHandle.storeStoreFence();
/* 112 */           OlOO1i11110 olOO1i11110I000l16 = io1OllI.I000l1(olOO1i11110I000l15, l0oliioiio6, "lumaBoostLatencyMs");
/* 118 */           l0OliiOIio l0oliioiio7 = new l0OliiOIio();
/* 122 */           l0oliioiio7.I0000O = 7;
/* 124 */           VarHandle.storeStoreFence();
/* 129 */           OlOO1i11110 olOO1i11110I000l17 = io1OllI.I000l1(olOO1i11110I000l16, l0oliioiio7, "yuv2rgbaLatencyMs");
/* 135 */           l0OliiOIio l0oliioiio8 = new l0OliiOIio();
/* 140 */           l0oliioiio8.I0000O = 8;
/* 142 */           VarHandle.storeStoreFence();
/* 145 */           olOO1i11110I000l17.I001i1lo1io(l0oliioiio8);
/* 148 */           olOO1i11110I000l17.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
