            package p000;

            import java.io.IOException;
            
            public final class Iol0Oi0Oo11 extends OlliIl0 {
                public long[] I0001Ioi1lo;

                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws IOException {
/* 1 */             Io1Iiiii0 io1Iiiii0I001i1lo1io = ooIllIioi1l.I001i1lo1io();
/* 5 */             if (io1Iiiii0I001i1lo1io == null) {
/* 60 */                IioIoO10iOiI.I000OOo1O("Could not get head table");
/* 89 */                return;
                    }
/* 12 */            int iI001l0I00 = ooIllIioi1l.I001l0I00() + 1;
/* 15 */            this.I0001Ioi1lo = new long[iI001l0I00];
/* 18 */            for (int i = 0; i < iI001l0I00; i++) {
/* 20 */                short s = io1Iiiii0I001i1lo1io.I000l1;
/* 22 */                if (s == 0) {
/* 33 */                    this.I0001Ioi1lo[i] = ioiOloi.I00OIl() * 2;
                        } else {
/* 36 */                    if (s != 1) {
/* 51 */                        IioIoO10iOiI.I000OOo1O("Error:TTF.loca unknown offset format.");
/* 54 */                        return;
                            }
/* 44 */                    this.I0001Ioi1lo[i] = ioiOloi.I00IoiI();
                        }
                    }
/* 55 */            this.I0000O = true;
                }
            }
