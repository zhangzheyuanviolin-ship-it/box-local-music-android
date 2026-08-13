            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class lOOlii1 {
                public static final lOOlii1 I00000oOI;
                public final Ioio1ol111i I00000oIO;

                static {
/* 3 */             int i = Ioio1ol111i.I00ilO0;
/* 10 */            I00000oOI = new lOOlii1(OOoll01.I00ioIO);
                }

                public lOOlii1(Ioio1ol111i ioio1ol111i) {
/* 4 */             this.I00000oIO = ioio1ol111i;
                }

                public static lOOlii1 I00000oIO(IOOOIO1O ioooio1o) throws iI00lI {
                    String strI00OIo;
                    long j;
                    lOOiOII1OO looioii1oo;
/* 1 */             int iI00i0ilIl0i = ioooio1o.I00i0ilIl0i();
/* 6 */             if (iI00i0ilIl0i < 0) {
/* 206 */               iilo0lOo110.I000II("Negative number of flags");
/* 5 */                 return null;
                    }
/* 8 */             int i = Ioio1ol111i.I00ilO0;
/* 13 */            Ioio10 ioio10 = new Ioio10(4);
/* 18 */            ioio10.I0000oI00 = OI1OOoOiOOl.I00iOIl;
/* 20 */            VarHandle.storeStoreFence();
/* 26 */            long j2 = 0;
/* 27 */            for (int i2 = 0; i2 < iI00i0ilIl0i; i2++) {
/* 29 */                long jI00i0oil = ioooio1o.I00i0oil();
/* 33 */                int i3 = (int) jI00i0oil;
/* 35 */                long j3 = jI00i0oil >>> 3;
/* 38 */                if (j3 == 0) {
/* 44 */                    j = 0;
/* 40 */                    strI00OIo = ioooio1o.I00OIo();
                        } else {
/* 48 */                    long j4 = j3 + j2;
/* 56 */                    if (j4 > 2305843009213693951L) {
/* 190 */                       iilo0lOo110.I000II("Flag name larger than max size");
/* 5 */                         return null;
                            }
/* 58 */                    strI00OIo = null;
/* 60 */                    j = j4;
                        }
/* 61 */                int i4 = i3 & 7;
/* 63 */                if (i4 == 0 || i4 == 1) {
/* 171 */                   looioii1oo = new lOOiOII1OO(j, strI00OIo, i4, 0L, null);
                        } else if (i4 == 2) {
/* 159 */                   looioii1oo = new lOOiOII1OO(j, strI00OIo, i4, ioooio1o.I00i0oil(), null);
                        } else if (i4 == 3) {
/* 145 */                   looioii1oo = new lOOiOII1OO(j, strI00OIo, i4, Double.doubleToRawLongBits(ioooio1o.I00IoiI()), null);
                        } else if (i4 == 4) {
/* 127 */                   looioii1oo = new lOOiOII1OO(j, strI00OIo, i4, 0L, ioooio1o.I00OIo());
                        } else {
/* 76 */                    if (i4 != 5) {
/* 113 */                       iilo0lOo110.I000II(Oi010OO0.I00100l0(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
/* 5 */                         return null;
                            }
/* 88 */                    looioii1oo = new lOOiOII1OO(j, strI00OIo, i4, 0L, ioooio1o.I00Oio());
                        }
/* 174 */               long j5 = looioii1oo.I00iOIl;
/* 178 */               if (j5 != 0) {
/* 180 */                   j2 = j5;
                        }
/* 181 */               ioio10.I00000oOI(looioii1oo);
                    }
/* 200 */           return new lOOlii1(ioio10.I000l1());
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof lOOlii1)) {
/* 16 */                return false;
                    }
/* 11 */            return this.I00000oIO.equals(((lOOlii1) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Ioio1ol111i ioio1ol111i = this.I00000oIO;
/* 3 */             ioio1ol111i.getClass();
/* 6 */             return lOI00O.I00000oIO(ioio1ol111i);
                }
            }
