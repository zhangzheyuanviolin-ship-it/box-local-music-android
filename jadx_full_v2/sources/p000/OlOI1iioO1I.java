            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlOI1iioO1I implements Io00l010I {
                public static final OlOI1iioO1I I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             OlOI1iioO1I olOI1iioO1I = new OlOI1iioO1I();
/* 6 */             I00000oIO = olOI1iioO1I;
/* 12 */            Iolii1loo1 iolii1loo1 = new Iolii1loo1("io.modelcontextprotocol.kotlin.sdk.types.StopReason", olOI1iioO1I);
/* 18 */            iolii1loo1.I000OiO("value", false);
/* 21 */            descriptor = iolii1loo1;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 2 */             return new O0O01001OOII[]{OlOlllO.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 7 */             String strI0010o = ii1iO1O.I00100l0(descriptor).I0010o();
/* 13 */            OlOII1OOo1O1 olOII1OOo1O1 = new OlOII1OOo1O1();
/* 16 */            olOII1OOo1O1.I00000oIO = strI0010o;
/* 18 */            VarHandle.storeStoreFence();
/* 49 */            return olOII1OOo1O1;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             String str = ((OlOII1OOo1O1) obj).I00000oIO;
/* 7 */             Il0I1ii il0I1iiI000iOII = il0I1ii.I000iOII(descriptor);
/* 11 */            if (il0I1iiI000iOII == null) {
/* 13 */                return;
                    }
/* 14 */            il0I1iiI000iOII.I001lloI(str);
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }
