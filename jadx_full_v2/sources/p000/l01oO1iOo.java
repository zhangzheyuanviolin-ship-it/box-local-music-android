            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class l01oO1iOo {
                public static O010loOOi0Oo I00000oIO() {
/* 4 */             return new O010loOOi0Oo(null);
                }

                public static final void I00000oOI(Ii00l101O ii00l101O, CancellationException cancellationException) {
/* 7 */             O010OIi o010OIi = (O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio);
/* 9 */             if (o010OIi != null) {
/* 11 */                o010OIi.I000II(cancellationException);
                    }
                }

                public static final Object I0000Il00O(O010OIi o010OIi, IOoilo iOoilo) {
/* 2 */             o010OIi.I000II(null);
/* 5 */             Object objI001l0I00 = o010OIi.I001l0I00(iOoilo);
                    return objI001l0I00 == Ii0111o.I00iOIl ? objI001l0I00 : OoiIlOl1iI.I00000oIO;
                }

                public static final void I0000O(Ii00l101O ii00l101O) {
/* 7 */             O010OIi o010OIi = (O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio);
/* 9 */             if (o010OIi != null && !o010OIi.I0000Il00O()) {
/* 22 */                throw o010OIi.I00Io1lO();
                    }
                }

                public static final O010OIi I0000oI00(Ii00l101O ii00l101O) {
/* 7 */             O010OIi o010OIi = (O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio);
/* 9 */             if (o010OIi != null) {
/* 11 */                return o010OIi;
                    }
/* 14 */            IOOlIIilOl0.I000lI("Current context doesn't contain Job in it: ", ii00l101O);
/* 17 */            return null;
                }

                public static final IiiOlIiio I0001Ioi1lo(O010OIi o010OIi, boolean z, O010olO o010olO) {
/* 3 */             if (o010OIi instanceof O011OOl11) {
/* 7 */                 return ((O011OOl11) o010OIi).I00O0i0ii(z, o010olO);
                    }
/* 32 */            return o010OIi.I00IioO0OiOi(o010olO.I000o00OoI0I(), z, new I00oII(1, o010olO, O010olO.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 10));
                }

                public static final boolean I000II(Ii00l101O ii00l101O) {
/* 7 */             O010OIi o010OIi = (O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio);
/* 9 */             if (o010OIi != null) {
/* 11 */                return o010OIi.I0000Il00O();
                    }
/* 16 */            return true;
                }
            }
