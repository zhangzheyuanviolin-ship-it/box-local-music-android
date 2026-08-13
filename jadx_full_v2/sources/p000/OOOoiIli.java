            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class OOOoiIli extends Io00OlOi0 {
                public static final OOOoiIli I00ilI0I1;
                public static final O0II0llIl I00ilO0 = new O0II0llIl(21);
                public IIOII1 I00iOIl;
                public O0o1lIo I00iiI;
                public byte I00iiO;
                public int I00iio;

                static {
/* 12 */            OOOoiIli oOOoiIli = new OOOoiIli();
/* 16 */            oOOoiIli.I00iiO = (byte) -1;
/* 18 */            oOOoiIli.I00iio = -1;
/* 22 */            oOOoiIli.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00ilI0I1 = oOOoiIli;
/* 31 */            oOOoiIli.I00iiI = O0o1O0olOll.I00iiI;
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
/* 7 */             int i2 = 0;
/* 8 */             int size = 0;
                    while (true) {
/* 11 */                int size2 = this.I00iiI.size();
/* 15 */                O0o1lIo o0o1lIo = this.I00iiI;
/* 17 */                if (i2 >= size2) {
/* 51 */                    int size3 = this.I00iOIl.size() + o0o1lIo.size() + size;
/* 52 */                    this.I00iio = size3;
/* 113 */                   return size3;
                        }
/* 19 */                IIOII1 iioii1I00IoiI = o0o1lIo.I00IoiI(i2);
/* 36 */                size += iioii1I00IoiI.size() + I1I1OO00o1o.I000OOo1O(iioii1I00IoiI.size());
/* 37 */                i2++;
                    }
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOiOi0o oOOiOi0o = new OOOiOi0o(3);
/* 9 */             oOOiOi0o.I00iio = O0o1O0olOll.I00iiI;
/* 29 */            return oOOiOi0o;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             OOOiOi0o oOOiOi0o = new OOOiOi0o(3);
/* 9 */             oOOiOi0o.I00iio = O0o1O0olOll.I00iiI;
/* 11 */            oOOiOi0o.I000l1(this);
/* 29 */            return oOOiOi0o;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 11 */            for (int i = 0; i < this.I00iiI.size(); i++) {
/* 15 */                IIOII1 iioii1I00IoiI = this.I00iiI.I00IoiI(i);
/* 21 */                i1I1OO00o1o.I00IoIO0lI(1, 2);
/* 28 */                i1I1OO00o1o.I00Io1lO(iioii1I00IoiI.size());
/* 31 */                i1I1OO00o1o.I00IO1oi11O(iioii1I00IoiI);
                    }
/* 39 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
