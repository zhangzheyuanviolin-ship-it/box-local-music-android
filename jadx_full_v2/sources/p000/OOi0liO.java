            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0liO extends Io00OlOi0 {
                public static final OOi0liO I00ilI0I1;
                public static final O0II0llIl I00ilO0 = new O0II0llIl(29);
                public IIOII1 I00iOIl;
                public List I00iiI;
                public byte I00iiO;
                public int I00iio;

                static {
/* 12 */            OOi0liO oOi0liO = new OOi0liO();
/* 16 */            oOi0liO.I00iiO = (byte) -1;
/* 18 */            oOi0liO.I00iio = -1;
/* 22 */            oOi0liO.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ilI0I1 = oOi0liO;
/* 31 */            oOi0liO.I00iiI = Collections.EMPTY_LIST;
                }

                @Override
                public final boolean I00000oOI() {
/* 4 */             if (this.I00iiO == 1) {
/* 3 */                 return true;
                    }
/* 7 */             this.I00iiO = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00iio;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int iI000II = 0;
/* 15 */            for (int i2 = 0; i2 < this.I00iiI.size(); i2++) {
/* 30 */                iI000II += I1I1OO00o1o.I000II(1, (I01Ilioliio) this.I00iiI.get(i2));
                    }
/* 40 */            int size = this.I00iOIl.size() + iI000II;
/* 41 */            this.I00iio = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOiOi0o oOOiOi0o = new OOOiOi0o(2);
/* 9 */             oOOiOi0o.I00iio = Collections.EMPTY_LIST;
/* 29 */            return oOOiOi0o;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             OOOiOi0o oOOiOi0o = new OOOiOi0o(2);
/* 9 */             oOOiOi0o.I00iio = Collections.EMPTY_LIST;
/* 11 */            oOOiOi0o.I000lI(this);
/* 29 */            return oOOiOi0o;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 11 */            for (int i = 0; i < this.I00iiI.size(); i++) {
/* 22 */                i1I1OO00o1o.I00II0Ol1O0l(1, (I01Ilioliio) this.I00iiI.get(i));
                    }
/* 30 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
