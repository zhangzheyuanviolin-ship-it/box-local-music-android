            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooi1l0 implements O0O01001OOII {
                public static final Ooi1l0 I00000oIO = new Ooi1l0();
                public static final Iolii1loo1 I00000oOI = iollIlI01II.I00000oIO(Ol01I1i.I00000oIO, "kotlin.UShort");

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 7 */             short sI001lllioOl = ii1iO1O.I00100l0(I00000oOI).I001lllioOl();
/* 13 */            Ooi1IIOloiii ooi1IIOloiii = new Ooi1IIOloiii();
/* 16 */            ooi1IIOloiii.I00iOIl = sI001lllioOl;
/* 18 */            VarHandle.storeStoreFence();
/* 49 */            return ooi1IIOloiii;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 11 */            il0I1ii.I000iOII(I00000oOI).I000II(((Ooi1IIOloiii) obj).I00iOIl);
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return I00000oOI;
                }
            }
