            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOiooooI1o extends Io00OlOi0 {
                public static final OOOiooooI1o I00l0OO0IO;
                public static final O0II0llIl I00li1OI = new O0II0llIl(12);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public OOOiol0loO1O I00iiO;
                public List I00iio;
                public OOOlOO0IO I00ilI0I1;
                public OOOiolI I00ilO0;
                public OOOioO I00io1l;
                public byte I00ioIO;
                public int I00l0I0l0lO1;

                static {
/* 12 */            OOOiooooI1o oOOiooooI1o = new OOOiooooI1o();
/* 16 */            oOOiooooI1o.I00ioIO = (byte) -1;
/* 18 */            oOOiooooI1o.I00l0I0l0lO1 = -1;
/* 22 */            oOOiooooI1o.I00iOIl = IIOII1.I00iOIl;
/* 24 */            VarHandle.storeStoreFence();
/* 27 */            I00l0OO0IO = oOOiooooI1o;
/* 31 */            oOOiooooI1o.I00iiO = OOOiol0loO1O.RETURNS_CONSTANT;
/* 35 */            oOOiooooI1o.I00iio = Collections.EMPTY_LIST;
/* 39 */            oOOiooooI1o.I00ilI0I1 = OOOlOO0IO.I00ll1;
/* 43 */            oOOiooooI1o.I00ilO0 = OOOiolI.AT_MOST_ONCE;
/* 47 */            oOOiooooI1o.I00io1l = OOOioO.CONCLUSION_CONDITION;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ioIO;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 18 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 32 */                if (!((OOOlOO0IO) this.I00iio.get(i)).I00000oOI()) {
/* 34 */                    this.I00ioIO = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 44 */            if ((this.I00iiI & 2) != 2 || this.I00ilI0I1.I00000oOI()) {
/* 57 */                this.I00ioIO = (byte) 1;
/* 3 */                 return true;
                    }
/* 54 */            this.I00ioIO = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00l0I0l0lO1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 23 */            int iI0000O = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000O(1, this.I00iiO.I00iOIl) : 0;
/* 31 */            for (int i2 = 0; i2 < this.I00iio.size(); i2++) {
/* 45 */                iI0000O += I1I1OO00o1o.I000II(2, (I01Ilioliio) this.I00iio.get(i2));
                    }
/* 52 */            if ((this.I00iiI & 2) == 2) {
/* 61 */                iI0000O += I1I1OO00o1o.I000II(3, this.I00ilI0I1);
                    }
/* 66 */            if ((this.I00iiI & 4) == 4) {
/* 76 */                iI0000O += I1I1OO00o1o.I0000O(4, this.I00ilO0.I00iOIl);
                    }
/* 82 */            if ((this.I00iiI & 8) == 8) {
/* 93 */                iI0000O += I1I1OO00o1o.I0000O(5, this.I00io1l.I00iOIl);
                    }
/* 100 */           int size = this.I00iOIl.size() + iI0000O;
/* 101 */           this.I00l0I0l0lO1 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return O0IIIo1OiiI.I000OOo1O();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             O0IIIo1OiiI o0IIIo1OiiII000OOo1O = O0IIIo1OiiI.I000OOo1O();
/* 5 */             o0IIIo1OiiII000OOo1O.I000iOII(this);
/* 29 */            return o0IIIo1OiiII000OOo1O;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 14 */                i1I1OO00o1o.I001lIiIIo1O(1, this.I00iiO.I00iOIl);
                    }
/* 25 */            for (int i = 0; i < this.I00iio.size(); i++) {
/* 35 */                i1I1OO00o1o.I00II0Ol1O0l(2, (I01Ilioliio) this.I00iio.get(i));
                    }
/* 44 */            if ((this.I00iiI & 2) == 2) {
/* 49 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00ilI0I1);
                    }
/* 56 */            if ((this.I00iiI & 4) == 4) {
/* 62 */                i1I1OO00o1o.I001lIiIIo1O(4, this.I00ilO0.I00iOIl);
                    }
/* 70 */            if ((this.I00iiI & 8) == 8) {
/* 77 */                i1I1OO00o1o.I001lIiIIo1O(5, this.I00io1l.I00iOIl);
                    }
/* 82 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
