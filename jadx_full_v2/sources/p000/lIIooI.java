            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lIIooI implements OIOi0lOI {
                public static final lIIooI I00000oIO = new lIIooI();

                static {
/* 10 */            OlOO1i11110 olOO1i11110I00000oIO = IlIO00o1.I00000oIO("logEventKey");
/* 16 */            l0OI1ioioli l0oi1ioioli = new l0OI1ioioli();
/* 20 */            l0oi1ioioli.I0000O = 1;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            OlOO1i11110 olOO1i11110I000iOII = io1OllI.I000iOII(olOO1i11110I00000oIO, l0oi1ioioli, "eventCount");
/* 33 */            l0OI1ioioli l0oi1ioioli2 = new l0OI1ioioli();
/* 37 */            l0oi1ioioli2.I0000O = 2;
/* 39 */            VarHandle.storeStoreFence();
/* 44 */            OlOO1i11110 olOO1i11110I000iOII2 = io1OllI.I000iOII(olOO1i11110I000iOII, l0oi1ioioli2, "inferenceDurationStats");
/* 50 */            l0OI1ioioli l0oi1ioioli3 = new l0OI1ioioli();
/* 54 */            l0oi1ioioli3.I0000O = 3;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            olOO1i11110I000iOII2.I001i1lo1io(l0oi1ioioli3);
/* 62 */            olOO1i11110I000iOII2.I000O01llI0();
                }

                @Override
                public final void encode(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 37 */                throw new ClassCastException();
                    }
/* 6 */             throw null;
                }
            }
