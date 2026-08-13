            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lI0OOllli1 implements OIOi0lOI {
                public static final lI0OOllli1 I00000oIO = new lI0OOllli1();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("errorCode");
/* 16 */            l0OliiOIio l0oliioiio = new l0OliiOIio();
/* 20 */            l0oliioiio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000l1 = io1OllI.I000l1(olOO1i11110I00000oIO, l0oliioiio, "isColdCall");
/* 33 */            l0OliiOIio l0oliioiio2 = new l0OliiOIio();
/* 37 */            l0oliioiio2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000l12 = io1OllI.I000l1(olOO1i11110I000l1, l0oliioiio2, "imageInfo");
/* 50 */            l0OliiOIio l0oliioiio3 = new l0OliiOIio();
/* 54 */            l0oliioiio3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 61 */            OlOO1i11110 olOO1i11110I000l13 = io1OllI.I000l1(olOO1i11110I000l12, l0oliioiio3, "detectorOptions");
/* 67 */            l0OliiOIio l0oliioiio4 = new l0OliiOIio();
/* 71 */            l0oliioiio4.I0000O = 4;
/* 73 */            VarHandle.storeStoreFence();
/* 78 */            OlOO1i11110 olOO1i11110I000l14 = io1OllI.I000l1(olOO1i11110I000l13, l0oliioiio4, "contourDetectedFaces");
/* 84 */            l0OliiOIio l0oliioiio5 = new l0OliiOIio();
/* 88 */            l0oliioiio5.I0000O = 5;
/* 90 */            VarHandle.storeStoreFence();
/* 95 */            OlOO1i11110 olOO1i11110I000l15 = io1OllI.I000l1(olOO1i11110I000l14, l0oliioiio5, "nonContourDetectedFaces");
/* 101 */           l0OliiOIio l0oliioiio6 = new l0OliiOIio();
/* 105 */           l0oliioiio6.I0000O = 6;
/* 107 */           VarHandle.storeStoreFence();
/* 110 */           olOO1i11110I000l15.I001i1lo1io(l0oliioiio6);
/* 113 */           olOO1i11110I000l15.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
