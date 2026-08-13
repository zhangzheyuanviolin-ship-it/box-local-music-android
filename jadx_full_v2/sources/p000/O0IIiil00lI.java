            package p000;

            import java.io.IOException;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0IIiil00lI extends Io00OlOi0 {
                public static final O0IIiil00lI I00lli11;
                public static final O0II0llIl I00lll10 = new O0II0llIl(4);
                public IIOII1 I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public O0IIiO1iiio0 I00ilO0;
                public List I00io1l;
                public int I00ioIO;
                public List I00l0I0l0lO1;
                public int I00l0OO0IO;
                public byte I00li1OI;
                public int I00ll1;

                static {
/* 11 */            O0IIiil00lI o0IIiil00lI = new O0IIiil00lI();
/* 15 */            o0IIiil00lI.I00ioIO = -1;
/* 17 */            o0IIiil00lI.I00l0OO0IO = -1;
/* 19 */            o0IIiil00lI.I00li1OI = (byte) -1;
/* 21 */            o0IIiil00lI.I00ll1 = -1;
/* 25 */            o0IIiil00lI.I00iOIl = IIOII1.I00iOIl;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            I00lli11 = o0IIiil00lI;
/* 33 */            o0IIiil00lI.I00iiO = 1;
/* 36 */            o0IIiil00lI.I00iio = 0;
/* 40 */            o0IIiil00lI.I00ilI0I1 = "";
/* 44 */            o0IIiil00lI.I00ilO0 = O0IIiO1iiio0.NONE;
/* 46 */            List list = Collections.EMPTY_LIST;
/* 48 */            o0IIiil00lI.I00io1l = list;
/* 50 */            o0IIiil00lI.I00l0I0l0lO1 = list;
                }

                @Override
                public final boolean I00000oOI() {
/* 4 */             if (this.I00li1OI == 1) {
/* 3 */                 return true;
                    }
/* 7 */             this.I00li1OI = (byte) 1;
/* 3 */             return true;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
                    List list2;
                    IIOII1 o1101ooIo0l;
/* 1 */             int i = this.I00ll1;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 21 */            int iI0000oI00 = (this.I00iiI & 1) == 1 ? I1I1OO00o1o.I0000oI00(1, this.I00iiO) : 0;
/* 26 */            if ((this.I00iiI & 2) == 2) {
/* 34 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00iio);
                    }
/* 40 */            if ((this.I00iiI & 8) == 8) {
/* 51 */                iI0000oI00 += I1I1OO00o1o.I0000O(3, this.I00ilO0.I00iOIl);
                    }
/* 52 */            int i2 = 0;
/* 53 */            int iI0001Ioi1lo = 0;
                    while (true) {
/* 56 */                int size = this.I00io1l.size();
/* 60 */                list = this.I00io1l;
/* 62 */                if (i2 >= size) {
                            break;
                        }
/* 78 */                iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i2)).intValue());
/* 79 */                i2++;
                    }
/* 82 */            int iI0001Ioi1lo2 = iI0000oI00 + iI0001Ioi1lo;
/* 87 */            if (!list.isEmpty()) {
/* 95 */                iI0001Ioi1lo2 = iI0001Ioi1lo2 + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo);
                    }
/* 96 */            this.I00ioIO = iI0001Ioi1lo;
/* 98 */            int i3 = 0;
/* 99 */            int iI0001Ioi1lo3 = 0;
                    while (true) {
/* 102 */               int size2 = this.I00l0I0l0lO1.size();
/* 106 */               list2 = this.I00l0I0l0lO1;
/* 108 */               if (i3 >= size2) {
                            break;
                        }
/* 124 */               iI0001Ioi1lo3 += I1I1OO00o1o.I0001Ioi1lo(((Integer) list2.get(i3)).intValue());
/* 125 */               i3++;
                    }
/* 128 */           int size3 = iI0001Ioi1lo2 + iI0001Ioi1lo3;
/* 133 */           if (!list2.isEmpty()) {
/* 141 */               size3 = size3 + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo3);
                    }
/* 142 */           this.I00l0OO0IO = iI0001Ioi1lo3;
/* 148 */           if ((this.I00iiI & 4) == 4) {
/* 150 */               Object obj = this.I00ilI0I1;
/* 154 */               if (obj instanceof String) {
                            try {
/* 166 */                       o1101ooIo0l = new O1101ooIo0l(((String) obj).getBytes("UTF-8"));
/* 169 */                       this.I00ilI0I1 = o1101ooIo0l;
                            } catch (UnsupportedEncodingException e) {
/* 175 */                       OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 11 */                        return 0;
                            }
                        } else {
/* 180 */                   o1101ooIo0l = (IIOII1) obj;
                        }
/* 201 */               size3 += o1101ooIo0l.size() + I1I1OO00o1o.I000OOo1O(o1101ooIo0l.size()) + I1I1OO00o1o.I000iOII(6);
                    }
/* 208 */           int size4 = this.I00iOIl.size() + size3;
/* 209 */           this.I00ll1 = size4;
/* 541 */           return size4;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return O0IIiI.I000II();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             O0IIiI o0IIiII000II = O0IIiI.I000II();
/* 5 */             o0IIiII000II.I000O01llI0(this);
/* 29 */            return o0IIiII000II;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
                    IIOII1 o1101ooIo0l;
/* 1 */             I0000Il00O();
/* 8 */             if ((this.I00iiI & 1) == 1) {
/* 12 */                i1I1OO00o1o.I001lllioOl(1, this.I00iiO);
                    }
/* 19 */            if ((this.I00iiI & 2) == 2) {
/* 23 */                i1I1OO00o1o.I001lllioOl(2, this.I00iio);
                    }
/* 31 */            if ((this.I00iiI & 8) == 8) {
/* 38 */                i1I1OO00o1o.I001lIiIIo1O(3, this.I00ilO0.I00iOIl);
                    }
/* 47 */            if (this.I00io1l.size() > 0) {
/* 51 */                i1I1OO00o1o.I00Io1lO(34);
/* 56 */                i1I1OO00o1o.I00Io1lO(this.I00ioIO);
                    }
/* 67 */            for (int i = 0; i < this.I00io1l.size(); i++) {
/* 81 */                i1I1OO00o1o.I001lloI(((Integer) this.I00io1l.get(i)).intValue());
                    }
/* 93 */            if (this.I00l0I0l0lO1.size() > 0) {
/* 97 */                i1I1OO00o1o.I00Io1lO(42);
/* 102 */               i1I1OO00o1o.I00Io1lO(this.I00l0OO0IO);
                    }
/* 111 */           for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 125 */               i1I1OO00o1o.I001lloI(((Integer) this.I00l0I0l0lO1.get(i2)).intValue());
                    }
/* 135 */           if ((this.I00iiI & 4) == 4) {
/* 137 */               Object obj = this.I00ilI0I1;
/* 141 */               if (obj instanceof String) {
                            try {
/* 153 */                       o1101ooIo0l = new O1101ooIo0l(((String) obj).getBytes("UTF-8"));
/* 156 */                       this.I00ilI0I1 = o1101ooIo0l;
                            } catch (UnsupportedEncodingException e) {
/* 162 */                       OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 165 */                       return;
                            }
                        } else {
/* 167 */                   o1101ooIo0l = (IIOII1) obj;
                        }
/* 170 */               i1I1OO00o1o.I00IoIO0lI(6, 2);
/* 177 */               i1I1OO00o1o.I00Io1lO(o1101ooIo0l.size());
/* 180 */               i1I1OO00o1o.I00IO1oi11O(o1101ooIo0l);
                    }
/* 185 */           i1I1OO00o1o.I00IO1oi11O(this.I00iOIl);
                }
            }
