            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOo0O0il1 implements OIOi0lOI {
                public static final lOo0O0il1 I00000oIO = new lOo0O0il1();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("versionName");
/* 16 */            l11OIolOi l11oioloi = new l11OIolOi();
/* 20 */            l11oioloi.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000lI = io1OllI.I000lI(olOO1i11110I00000oIO, l11oioloi, "sessionId");
/* 33 */            l11OIolOi l11oioloi2 = new l11OIolOi();
/* 37 */            l11oioloi2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000lI2 = io1OllI.I000lI(olOO1i11110I000lI, l11oioloi2, "averageTimeToFirstPageReadyMs");
/* 50 */            l11OIolOi l11oioloi3 = new l11OIolOi();
/* 54 */            l11oioloi3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 61 */            OlOO1i11110 olOO1i11110I000lI3 = io1OllI.I000lI(olOO1i11110I000lI2, l11oioloi3, "averageCurrentPageReadyLatencyMs");
/* 67 */            l11OIolOi l11oioloi4 = new l11OIolOi();
/* 71 */            l11oioloi4.I0000O = 4;
/* 73 */            VarHandle.storeStoreFence();
/* 78 */            OlOO1i11110 olOO1i11110I000lI4 = io1OllI.I000lI(olOO1i11110I000lI3, l11oioloi4, "averageSaveButtonReadyLatencyMs");
/* 84 */            l11OIolOi l11oioloi5 = new l11OIolOi();
/* 88 */            l11oioloi5.I0000O = 5;
/* 90 */            VarHandle.storeStoreFence();
/* 95 */            OlOO1i11110 olOO1i11110I000lI5 = io1OllI.I000lI(olOO1i11110I000lI4, l11oioloi5, "isFilterScreenUsedInSession");
/* 101 */           l11OIolOi l11oioloi6 = new l11OIolOi();
/* 105 */           l11oioloi6.I0000O = 6;
/* 107 */           VarHandle.storeStoreFence();
/* 110 */           olOO1i11110I000lI5.I001i1lo1io(l11oioloi6);
/* 113 */           olOO1i11110I000lI5.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
