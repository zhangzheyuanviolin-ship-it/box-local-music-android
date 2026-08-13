            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOi0i0OO0lol extends Io00OlOi0 {
                public static final OOi0i0OO0lol I00io1l;
                public static final O0II0llIl I00ioIO = new O0II0llIl(26);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public List I00iiO;
                public int I00iio;
                public byte I00ilI0I1;
                public int I00ilO0;

                static {
/* 12 */            OOi0i0OO0lol oOi0i0OO0lol = new OOi0i0OO0lol();
/* 16 */            oOi0i0OO0lol.I00ilI0I1 = (byte) -1;
/* 18 */            oOi0i0OO0lol.I00ilO0 = -1;
/* 22 */            oOi0i0OO0lol.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00io1l = oOi0i0OO0lol;
/* 31 */            oOi0i0OO0lol.I00iiO = Collections.EMPTY_LIST;
/* 33 */            oOi0i0OO0lol.I00iio = -1;
                }

                public static OOOOo00i00Io I000OOo1O(OOi0i0OO0lol oOi0i0OO0lol) {
/* 4 */             OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(1);
/* 9 */             oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 12 */            oOOOo00i00Io.I00ilI0I1 = -1;
/* 14 */            oOOOo00i00Io.I000OOo1O(oOi0i0OO0lol);
/* 49 */            return oOOOo00i00Io;
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
/* 18 */            for (int i = 0; i < this.I00iiO.size(); i++) {
/* 32 */                if (!((OOi001oo1OOI) this.I00iiO.get(i)).I00000oOI()) {
/* 34 */                    this.I00ilI0I1 = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 40 */            this.I00ilI0I1 = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00ilO0;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 8 */             int iI0000oI00 = 0;
/* 16 */            for (int i2 = 0; i2 < this.I00iiO.size(); i2++) {
/* 30 */                iI0000oI00 += I1I1OO00o1o.I000II(1, (I01Ilioliio) this.I00iiO.get(i2));
                    }
/* 37 */            if ((this.I00iiI & 1) == 1) {
/* 46 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00iio);
                    }
/* 53 */            int size = this.I00iOIl.size() + iI0000oI00;
/* 54 */            this.I00ilO0 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 4 */             OOOOo00i00Io oOOOo00i00Io = new OOOOo00i00Io(1);
/* 9 */             oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 12 */            oOOOo00i00Io.I00ilI0I1 = -1;
/* 29 */            return oOOOo00i00Io;
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             return I000OOo1O(this);
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 12 */            for (int i = 0; i < this.I00iiO.size(); i++) {
/* 22 */                i1I1OO00o1o.I00II0Ol1O0l(1, (I01Ilioliio) this.I00iiO.get(i));
                    }
/* 31 */            if ((this.I00iiI & 1) == 1) {
/* 36 */                i1I1OO00o1o.I001lllioOl(2, this.I00iio);
                    }
/* 41 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
