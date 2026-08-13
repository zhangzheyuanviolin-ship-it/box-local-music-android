            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi0I1OIil implements Io00l010I {
                public static final Oi0I1OIil I00000oIO;
                private static final OilOloI descriptor;

                static {
/* 3 */             Oi0I1OIil oi0I1OIil = new Oi0I1OIil();
/* 6 */             I00000oIO = oi0I1OIil;
/* 12 */            Iolii1loo1 iolii1loo1 = new Iolii1loo1("io.modelcontextprotocol.kotlin.sdk.types.RequestId.NumberId", oi0I1OIil);
/* 18 */            iolii1loo1.I000OiO("value", false);
/* 21 */            descriptor = iolii1loo1;
                }

                @Override
                public final O0O01001OOII[] I00000oIO() {
/* 2 */             return new O0O01001OOII[]{O1IOi1i.I00000oIO};
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 7 */             long jI001IIilI0O = ii1iO1O.I00100l0(descriptor).I001IIilI0O();
/* 13 */            Oi0I1ollliiI oi0I1ollliiI = new Oi0I1ollliiI();
/* 16 */            oi0I1ollliiI.I00000oIO = jI001IIilI0O;
/* 18 */            VarHandle.storeStoreFence();
/* 49 */            return oi0I1ollliiI;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 3 */             long j = ((Oi0I1ollliiI) obj).I00000oIO;
/* 7 */             Il0I1ii il0I1iiI000iOII = il0I1ii.I000iOII(descriptor);
/* 11 */            if (il0I1iiI000iOII == null) {
/* 13 */                return;
                    }
/* 14 */            il0I1iiI000iOII.I001l0I00(j);
                }

                @Override
                public final OilOloI I0000O() {
/* 1 */             return descriptor;
                }
            }
