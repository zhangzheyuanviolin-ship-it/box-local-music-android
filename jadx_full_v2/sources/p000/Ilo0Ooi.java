            package p000;
            
            @Oili0O
            public final class Ilo0Ooi implements Comparable<Ilo0Ooi> {
                public static final Ilo0Ol Companion = new Ilo0Ol();
                public static final O0ioIllo0i1[] I00l0OO0IO;
                public int I00iOIl;
                public int I00iiI;
                public int I00iiO;
                public i0010oOIlI I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public OI010IlI I00io1l;
                public int I00ioIO;
                public long I00l0I0l0lO1;

                static {
/* 8 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 65 */            I00l0OO0IO = new O0ioIllo0i1[]{null, null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(28)), null, null, l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(29)), null, null};
/* 73 */            Ii1Oii0oIo.I00000oIO(0L);
                }

                @Override
                public final int compareTo(Ilo0Ooi ilo0Ooi) {
/* 7 */             return O0000Ioio00.I0001Ioi1lo(this.I00l0I0l0lO1, ilo0Ooi.I00l0I0l0lO1);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Ilo0Ooi)) {
/* 7 */                 return false;
                    }
/* 11 */            Ilo0Ooi ilo0Ooi = (Ilo0Ooi) obj;
                    return this.I00iOIl == ilo0Ooi.I00iOIl && this.I00iiI == ilo0Ooi.I00iiI && this.I00iiO == ilo0Ooi.I00iiO && this.I00iio == ilo0Ooi.I00iio && this.I00ilI0I1 == ilo0Ooi.I00ilI0I1 && this.I00ilO0 == ilo0Ooi.I00ilO0 && this.I00io1l == ilo0Ooi.I00io1l && this.I00ioIO == ilo0Ooi.I00ioIO && this.I00l0I0l0lO1 == ilo0Ooi.I00l0I0l0lO1;
                }

                public final int hashCode() {
/* 62 */            return Long.hashCode(this.I00l0I0l0lO1) + IIl001iO0Io.I0000O(this.I00ioIO, (this.I00io1l.hashCode() + IIl001iO0Io.I0000O(this.I00ilO0, IIl001iO0Io.I0000O(this.I00ilI0I1, (this.I00iio.hashCode() + IIl001iO0Io.I0000O(this.I00iiO, IIl001iO0Io.I0000O(this.I00iiI, Integer.hashCode(this.I00iOIl) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
                }

                public final String toString() {
/* 98 */            return "GMTDate(seconds=" + this.I00iOIl + ", minutes=" + this.I00iiI + ", hours=" + this.I00iiO + ", dayOfWeek=" + this.I00iio + ", dayOfMonth=" + this.I00ilI0I1 + ", dayOfYear=" + this.I00ilO0 + ", month=" + this.I00io1l + ", year=" + this.I00ioIO + ", timestamp=" + this.I00l0I0l0lO1 + ')';
                }
            }
