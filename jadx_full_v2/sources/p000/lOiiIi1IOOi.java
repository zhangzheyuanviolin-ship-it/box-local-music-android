            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOiiIi1IOOi implements OIOi0lOI {
                public static final lOiiIi1IOOi I00000oIO = new lOiiIi1IOOi();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("modelType");
/* 16 */            l0OliiOIio l0oliioiio = new l0OliiOIio();
/* 20 */            l0oliioiio.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000l1 = io1OllI.I000l1(olOO1i11110I00000oIO, l0oliioiio, "isDownloaded");
/* 33 */            l0OliiOIio l0oliioiio2 = new l0OliiOIio();
/* 37 */            l0oliioiio2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000l12 = io1OllI.I000l1(olOO1i11110I000l1, l0oliioiio2, "modelName");
/* 50 */            l0OliiOIio l0oliioiio3 = new l0OliiOIio();
/* 54 */            l0oliioiio3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I000l12.I001i1lo1io(l0oliioiio3);
/* 62 */            olOO1i11110I000l12.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
