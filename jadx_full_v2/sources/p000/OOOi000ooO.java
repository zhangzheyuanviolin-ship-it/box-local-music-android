            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOi000ooO extends Io00OlOi0 {
                public static final OOOi000ooO I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(5);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public List I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 11 */            OOOi000ooO oOOi000ooO = new OOOi000ooO();
/* 15 */            oOOi000ooO.I00ilI0I1 = (byte) -1;
/* 17 */            oOOi000ooO.I00ilO0 = -1;
/* 21 */            oOOi000ooO.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00io1l = oOOi000ooO;
/* 29 */            oOOi000ooO.I00iiO = 0;
/* 33 */            oOOi000ooO.I00iio = Collections.EMPTY_LIST;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ilI0I1;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 14 */            if ((this.I00iiI & 1) != 1) {
/* 48 */                this.I00ilI0I1 = (byte) 0;
/* 7 */                 return false;
                    }
/* 23 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 37 */                if (!((OOOOlOoi0) this.I00iio.get(i)).I00000oOI()) {
/* 39 */                    this.I00ilI0I1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 45 */            this.I00ilI0I1 = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00ilO0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 28 */            for (int i2 = 0; i2 < this.I00iio.size(); i2++) {
/* 43 */                iI0000oI00 += I1I1OO00o1o.I000II(2, (I01Ilioliio) this.I00iio.get(i2));
                    }
/* 53 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 54 */            this.I00ilO0 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(0);
/* 9 */             oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 29 */            return oOOOo00i00Io;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 4 */             OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(0);
/* 9 */             oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 11 */            oOOOo00i00Io.I000O01llI0(this);
/* 29 */            return oOOOo00i00Io;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I001lllioOl(1, this.I00iiO);
                    }
/* 22 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 33 */                i1I1OO00o1o.I00II0Ol1O0l(2, (I01Ilioliio) this.I00iio.get(i));
                    }
/* 41 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
