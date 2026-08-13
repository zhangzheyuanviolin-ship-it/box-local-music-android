            package p000;

            import java.util.concurrent.CancellationException;
            
            public abstract class il001oo1 {
                public static final IIOlO1ii I00000oIO(Ii00l101O ii00l101O) {
/* 9 */             if (ii00l101O.I00lli11(Iioi0lilII.I00iio) == null) {
/* 16 */                ii00l101O = ii00l101O.I00ioIO(l01oO1iOo.I00000oIO());
                    }
/* 20 */            return new IIOlO1ii(ii00l101O);
                }

                public static final void I00000oOI(Ii0110 ii0110, CancellationException cancellationException) {
/* 11 */            O010OIi o010OIi = (O010OIi) ii0110.I00000oIO().I00lli11(Iioi0lilII.I00iio);
/* 13 */            if (o010OIi != null) {
/* 15 */                o010OIi.I000II(cancellationException);
                    } else {
/* 21 */                IOOlIIilOl0.I000lI("Scope cannot be cancelled because it does not have a job: ", ii0110);
                    }
                }

                public static final Object I0000Il00O(IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             OiOOI1I1I101 oiOOI1I1I101 = new OiOOI1I1I101(iOoil1iiIilo, iOoil1iiIilo.getContext());
/* 11 */            Object objI00000oIO = li0011.I00000oIO(oiOOI1I1I101, true, oiOOI1I1I101, illiIl1l11O);
/* 15 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            return objI00000oIO;
                }

                public static final boolean I0000O(Ii0110 ii0110) {
/* 11 */            O010OIi o010OIi = (O010OIi) ii0110.I00000oIO().I00lli11(Iioi0lilII.I00iio);
/* 13 */            if (o010OIi != null) {
/* 15 */                return o010OIi.I0000Il00O();
                    }
/* 20 */            return true;
                }
            }
