            package p000;
            
/* 108 */   public final class Oo0olliOi1 {
                public final int I00000oIO = 0;
                public int I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public Object I0001Ioi1lo;

                public Oo0olliOi1(I1111OO10i i1111OO10i, long j) {
/* 9 */             String str = i1111OO10i.I00iiI;
/* 12 */            I1I1OO00o1o i1I1OO00o1o = new I1I1OO00o1o(2);
/* 15 */            i1I1OO00o1o.I0000O = str;
/* 18 */            i1I1OO00o1o.I00000oOI = -1;
/* 20 */            i1I1OO00o1o.I0000Il00O = -1;
/* 22 */            this.I0001Ioi1lo = i1I1OO00o1o;
/* 28 */            this.I00000oOI = Oo0lI00l.I000II(j);
/* 34 */            this.I0000Il00O = Oo0lI00l.I0001Ioi1lo(j);
/* 36 */            this.I0000O = -1;
/* 38 */            this.I0000oI00 = -1;
/* 40 */            int iI000II = Oo0lI00l.I000II(j);
/* 44 */            int iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(j);
/* 51 */            if (iI000II < 0 || iI000II > str.length()) {
/* 106 */               I000II.I0010o(IIl001iO0Io.I000l1(iI000II, str.length(), "start (", ") offset is outside of text region "));
/* 332 */               throw null;
                    }
/* 59 */            if (iI0001Ioi1lo < 0 || iI0001Ioi1lo > str.length()) {
/* 92 */                I000II.I0010o(IIl001iO0Io.I000l1(iI0001Ioi1lo, str.length(), "end (", ") offset is outside of text region "));
/* 95 */                throw null;
                    }
/* 67 */            if (iI000II <= iI0001Ioi1lo) {
/* 69 */                return;
                    }
/* 78 */            I000II.I000iOII(IIl001iO0Io.I000l1(iI000II, iI0001Ioi1lo, "Do not set reversed range: ", " > "));
/* 81 */            throw null;
                }

                public void I00000oIO(int i, int i2) {
/* 1 */             long jI00000oIO = lOliOi0Oi.I00000oIO(i, i2);
/* 11 */            ((I1I1OO00o1o) this.I0001Ioi1lo).I001l0I00(i, i2, "");
/* 22 */            long jI00000oIO2 = ilI10oi.I00000oIO(lOliOi0Oi.I00000oIO(this.I00000oOI, this.I0000Il00O), jI00000oIO);
/* 30 */            I000O01llI0(Oo0lI00l.I000II(jI00000oIO2));
/* 37 */            I000II(Oo0lI00l.I0001Ioi1lo(jI00000oIO2));
/* 40 */            int i3 = this.I0000O;
/* 43 */            if (i3 != -1) {
/* 51 */                long jI00000oIO3 = ilI10oi.I00000oIO(lOliOi0Oi.I00000oIO(i3, this.I0000oI00), jI00000oIO);
/* 59 */                if (Oo0lI00l.I0000O(jI00000oIO3)) {
/* 61 */                    this.I0000O = -1;
/* 63 */                    this.I0000oI00 = -1;
                        } else {
/* 70 */                    this.I0000O = Oo0lI00l.I000II(jI00000oIO3);
/* 76 */                    this.I0000oI00 = Oo0lI00l.I0001Ioi1lo(jI00000oIO3);
                        }
                    }
                }

                public char I00000oOI(int i) {
/* 3 */             I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) this.I0001Ioi1lo;
/* 7 */             IOOOi1 iOOOi1 = (IOOOi1) i1I1OO00o1o.I0000oI00;
/* 9 */             if (iOOOi1 == null) {
/* 15 */                return ((String) i1I1OO00o1o.I0000O).charAt(i);
                    }
/* 22 */            if (i < i1I1OO00o1o.I00000oOI) {
/* 28 */                return ((String) i1I1OO00o1o.I0000O).charAt(i);
                    }
/* 39 */            int iI0000Il00O = iOOOi1.I00000oOI - iOOOi1.I0000Il00O();
/* 40 */            int i2 = i1I1OO00o1o.I00000oOI;
/* 44 */            if (i >= iI0000Il00O + i2) {
/* 74 */                return ((String) i1I1OO00o1o.I0000O).charAt(i - ((iI0000Il00O - i1I1OO00o1o.I0000Il00O) + i2));
                    }
/* 46 */            int i3 = i - i2;
/* 47 */            int i4 = iOOOi1.I0000Il00O;
/* 51 */            char[] cArr = (char[]) iOOOi1.I0000oI00;
                    return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + iOOOi1.I0000O];
                }

                public Oo0lI00l I0000Il00O() {
/* 1 */             int i = this.I0000O;
/* 4 */             if (i != -1) {
/* 12 */                return Oo0lI00l.I00000oIO(lOliOi0Oi.I00000oIO(i, this.I0000oI00));
                    }
/* 17 */            return null;
                }

                public void I0000O(int i, int i2, String str) {
/* 3 */             I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) this.I0001Ioi1lo;
/* 7 */             if (i < 0 || i > i1I1OO00o1o.I000lI()) {
/* 86 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i1I1OO00o1o.I000lI(), "start (", ") offset is outside of text region "));
/* 98 */                return;
                    }
/* 15 */            if (i2 < 0 || i2 > i1I1OO00o1o.I000lI()) {
/* 72 */                I000II.I0010o(IIl001iO0Io.I000l1(i2, i1I1OO00o1o.I000lI(), "end (", ") offset is outside of text region "));
/* 75 */                return;
                    }
/* 23 */            if (i > i2) {
/* 58 */                I000II.I000iOII(IIl001iO0Io.I000l1(i, i2, "Do not set reversed range: ", " > "));
/* 61 */                return;
                    }
/* 25 */            i1I1OO00o1o.I001l0I00(i, i2, str);
/* 33 */            I000O01llI0(str.length() + i);
/* 41 */            I000II(str.length() + i);
/* 45 */            this.I0000O = -1;
/* 47 */            this.I0000oI00 = -1;
                }

                public void I0000oI00(int i, int i2) {
/* 3 */             I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) this.I0001Ioi1lo;
/* 7 */             if (i < 0 || i > i1I1OO00o1o.I000lI()) {
/* 66 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i1I1OO00o1o.I000lI(), "start (", ") offset is outside of text region "));
/* 106 */               return;
                    }
/* 15 */            if (i2 < 0 || i2 > i1I1OO00o1o.I000lI()) {
/* 52 */                I000II.I0010o(IIl001iO0Io.I000l1(i2, i1I1OO00o1o.I000lI(), "end (", ") offset is outside of text region "));
                    } else if (i >= i2) {
/* 38 */                I000II.I000iOII(IIl001iO0Io.I000l1(i, i2, "Do not set reversed or empty range: ", " > "));
                    } else {
/* 25 */                this.I0000O = i;
/* 27 */                this.I0000oI00 = i2;
                    }
                }

                public void I0001Ioi1lo(int i, int i2) {
/* 3 */             I1I1OO00o1o i1I1OO00o1o = (I1I1OO00o1o) this.I0001Ioi1lo;
/* 7 */             if (i < 0 || i > i1I1OO00o1o.I000lI()) {
/* 68 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i1I1OO00o1o.I000lI(), "start (", ") offset is outside of text region "));
/* 106 */               return;
                    }
/* 15 */            if (i2 < 0 || i2 > i1I1OO00o1o.I000lI()) {
/* 54 */                I000II.I0010o(IIl001iO0Io.I000l1(i2, i1I1OO00o1o.I000lI(), "end (", ") offset is outside of text region "));
                    } else if (i > i2) {
/* 40 */                I000II.I000iOII(IIl001iO0Io.I000l1(i, i2, "Do not set reversed range: ", " > "));
                    } else {
/* 25 */                I000O01llI0(i);
/* 28 */                I000II(i2);
                    }
                }

                public void I000II(int i) {
/* 6 */             if (!(i >= 0)) {
/* 22 */                Ioliol.I00000oIO("Cannot set selectionEnd to a negative value: " + i);
                    }
/* 25 */            this.I0000Il00O = i;
                }

                public void I000O01llI0(int i) {
/* 6 */             if (!(i >= 0)) {
/* 22 */                Ioliol.I00000oIO("Cannot set selectionStart to a negative value: " + i);
                    }
/* 25 */            this.I00000oOI = i;
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 15 */                    return ((I1I1OO00o1o) this.I0001Ioi1lo).toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 109 */       public Oo0olliOi1() {
                }
            }
