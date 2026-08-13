            package p000;
            
/* 23 */    public final class I11110l0o {
                public final Object I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final String I0000O;

                public I11110l0o(Object obj, int i, int i2, String str) {
/* 4 */             this.I00000oIO = obj;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = i2;
/* 10 */            this.I0000O = str;
/* 17 */            if (i <= i2) {
/* 204 */               return;
                    }
/* 21 */            Ioliol.I00000oIO("Reversed range is not supported");
                }

                public static I11110l0o I00000oIO(I11110l0o i11110l0o, I1110oO i1110oO, int i, int i2) {
                    Object obj = i1110oO;
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 obj = i11110l0o.I00000oIO;
                    }
/* 7 */             int i3 = i11110l0o.I00000oOI;
/* 11 */            if ((i2 & 4) != 0) {
/* 13 */                i = i11110l0o.I0000Il00O;
                    }
/* 19 */            return new I11110l0o(obj, i3, i, i11110l0o.I0000O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I11110l0o)) {
/* 7 */                 return false;
                    }
/* 11 */            I11110l0o i11110l0o = (I11110l0o) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i11110l0o.I00000oIO) && this.I00000oOI == i11110l0o.I00000oOI && this.I0000Il00O == i11110l0o.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, i11110l0o.I0000O);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 32 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
                }

                public final String toString() {
/* 48 */            return "Range(item=" + this.I00000oIO + ", start=" + this.I00000oOI + ", end=" + this.I0000Il00O + ", tag=" + this.I0000O + ")";
                }

/* 24 */        public I11110l0o(Object obj, int i, int i2) {
/* 25 */            this(obj, i, i2, "");
                }
            }
