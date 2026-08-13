            package p000;
            
/* 39 */    public final class Oo0OI01Il {
                public final I1111OO10i I00000oIO;
                public final long I00000oOI;
                public final Oo0lI00l I0000Il00O;

                static {
/* 13 */            OiIoloOl0.I00000oIO(new Oll1iiOII(6), new Oo011oIOO1(3));
                }

                public Oo0OI01Il(I1111OO10i i1111OO10i, long j, Oo0lI00l oo0lI00l) {
                    Oo0lI00l oo0lI00lI00000oIO;
/* 4 */             this.I00000oIO = i1111OO10i;
/* 16 */            this.I00000oOI = lOliOi0Oi.I00000oOI(i1111OO10i.I00iiI.length(), j);
/* 18 */            if (oo0lI00l != null) {
/* 32 */                oo0lI00lI00000oIO = Oo0lI00l.I00000oIO(lOliOi0Oi.I00000oOI(i1111OO10i.I00iiI.length(), oo0lI00l.I00000oIO));
                    } else {
/* 37 */                oo0lI00lI00000oIO = null;
                    }
/* 38 */            this.I0000Il00O = oo0lI00lI00000oIO;
                }

                public static Oo0OI01Il I00000oIO(Oo0OI01Il oo0OI01Il, I1111OO10i i1111OO10i, long j, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 i1111OO10i = oo0OI01Il.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                j = oo0OI01Il.I00000oOI;
                    }
/* 20 */            Oo0lI00l oo0lI00l = (i & 4) != 0 ? oo0OI01Il.I0000Il00O : null;
/* 21 */            oo0OI01Il.getClass();
/* 26 */            return new Oo0OI01Il(i1111OO10i, j, oo0lI00l);
                }

                public static Oo0OI01Il I00000oOI(Oo0OI01Il oo0OI01Il, String str, long j, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 j = oo0OI01Il.I00000oOI;
                    }
/* 7 */             Oo0lI00l oo0lI00l = oo0OI01Il.I0000Il00O;
/* 9 */             oo0OI01Il.getClass();
/* 19 */            return new Oo0OI01Il(new I1111OO10i(str), j, oo0lI00l);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oo0OI01Il)) {
/* 7 */                 return false;
                    }
/* 11 */            Oo0OI01Il oo0OI01Il = (Oo0OI01Il) obj;
                    return Oo0lI00l.I0000Il00O(this.I00000oOI, oo0OI01Il.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oo0OI01Il.I0000Il00O) && O0000Ioio00.I0000O(this.I00000oIO, oo0OI01Il.I00000oIO);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            int i = Oo0lI00l.I0000Il00O;
/* 14 */            int iI0000O = IIlIOloOOO.I0000O(this.I00000oOI, iHashCode, 31);
/* 18 */            Oo0lI00l oo0lI00l = this.I0000Il00O;
/* 30 */            return iI0000O + (oo0lI00l != null ? Long.hashCode(oo0lI00l.I00000oIO) : 0);
                }

                public final String toString() {
/* 42 */            return "TextFieldValue(text='" + ((Object) this.I00000oIO) + "', selection=" + Oo0lI00l.I000OOo1O(this.I00000oOI) + ", composition=" + this.I0000Il00O + ")";
                }

/* 40 */        public Oo0OI01Il(int i, long j, String str) {
/* 44 */            this(new I1111OO10i((i & 1) != 0 ? "" : str), (i & 2) != 0 ? Oo0lI00l.I00000oOI : j, (Oo0lI00l) null);
                }
            }
