            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public final class O0IIO0lO extends Io00OlOi0 {
                public static final O0IIO0lO I00l0OO0IO;
                public static final O0II0llIl I00li1OI = new O0II0llIl(2);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public O0II1001o I00iiO;
                public O0III0iooOOi I00iio;
                public O0III0iooOOi I00ilI0I1;
                public O0III0iooOOi I00ilO0;
                public O0III0iooOOi I00io1l;
                public byte I00ioIO;
                public int I00l0I0l0lO1;

                static {
/* 11 */            O0IIO0lO o0IIO0lO = new O0IIO0lO();
/* 15 */            o0IIO0lO.I00ioIO = (byte) -1;
/* 17 */            o0IIO0lO.I00l0I0l0lO1 = -1;
/* 21 */            o0IIO0lO.I00iOIl = IIOII1.I00iOIl;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00l0OO0IO = o0IIO0lO;
/* 30 */            o0IIO0lO.I00iiO = O0II1001o.I00io1l;
/* 32 */            O0III0iooOOi o0III0iooOOi = O0III0iooOOi.I00io1l;
/* 34 */            o0IIO0lO.I00iio = o0III0iooOOi;
/* 36 */            o0IIO0lO.I00ilI0I1 = o0III0iooOOi;
/* 38 */            o0IIO0lO.I00ilO0 = o0III0iooOOi;
/* 40 */            o0IIO0lO.I00io1l = o0III0iooOOi;
                }

                @Override
                public final boolean I00000oOI() {
/* 4 */             if (this.I00ioIO == 1) {
/* 3 */                 return true;
                    }
/* 7 */             this.I00ioIO = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             int i = this.I00l0I0l0lO1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 20 */            int iI000II = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I000II(1, this.I00iiO) : 0;
/* 25 */            if ((this.I00iiI & 2) == 2) {
/* 33 */                iI000II += I1I1OO00o1o.I000II(2, this.I00iio);
                    }
/* 38 */            if ((this.I00iiI & 4) == 4) {
/* 47 */                iI000II += I1I1OO00o1o.I000II(3, this.I00ilI0I1);
                    }
/* 53 */            if ((this.I00iiI & 8) == 8) {
/* 61 */                iI000II += I1I1OO00o1o.I000II(4, this.I00ilO0);
                    }
/* 67 */            if ((this.I00iiI & 16) == 16) {
/* 76 */                iI000II += I1I1OO00o1o.I000II(5, this.I00io1l);
                    }
/* 83 */            int size = this.I00iOIl.size() + iI000II;
/* 84 */            this.I00l0I0l0lO1 = size;
/* 113 */           return size;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return O0IIIo1OiiI.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             O0IIIo1OiiI o0IIIo1OiiII000O01llI0 = O0IIIo1OiiI.I000O01llI0();
/* 5 */             o0IIIo1OiiII000O01llI0.I000OiO(this);
/* 29 */            return o0IIIo1OiiII000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I00II0Ol1O0l(1, this.I00iiO);
                    }
/* 19 */            if ((this.I00iiI & 2) == 2) {
/* 23 */                i1I1OO00o1o.I00II0Ol1O0l(2, this.I00iio);
                    }
/* 30 */            if ((this.I00iiI & 4) == 4) {
/* 35 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00ilI0I1);
                    }
/* 43 */            if ((this.I00iiI & 8) == 8) {
/* 47 */                i1I1OO00o1o.I00II0Ol1O0l(4, this.I00ilO0);
                    }
/* 55 */            if ((this.I00iiI & 16) == 16) {
/* 60 */                i1I1OO00o1o.I00II0Ol1O0l(5, this.I00io1l);
                    }
/* 65 */            i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }

                public final boolean I000OOo1O() {
                    return (this.I00iiI & 4) == 4;
                }
            }
