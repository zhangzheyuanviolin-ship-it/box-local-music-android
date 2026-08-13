            package p000;
            
/* 15 */    public final class I111101Olo00 {
                public final Object I00000oIO;
                public final int I00000oOI;
                public int I0000Il00O;
                public final String I0000O;

                public I111101Olo00(int i, int i2, int i3, Object obj, String str) {
/* 13 */            this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
                }

                public final I11110l0o I00000oIO(int i) {
/* 1 */             int i2 = this.I0000Il00O;
/* 5 */             if (i2 != Integer.MIN_VALUE) {
/* 8 */                 i = i2;
                    }
/* 14 */            if (!(i != Integer.MIN_VALUE)) {
/* 18 */                Ioliol.I0000Il00O("Item.end should be set first");
                    }
/* 29 */            return new I11110l0o(this.I00000oIO, this.I00000oOI, i, this.I0000O);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I111101Olo00)) {
/* 7 */                 return false;
                    }
/* 11 */            I111101Olo00 i111101Olo00 = (I111101Olo00) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i111101Olo00.I00000oIO) && this.I00000oOI == i111101Olo00.I00000oOI && this.I0000Il00O == i111101Olo00.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, i111101Olo00.I0000O);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 32 */            return this.I0000O.hashCode() + IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
                }

                public final String toString() {
/* 48 */            return "MutableRange(item=" + this.I00000oIO + ", start=" + this.I00000oOI + ", end=" + this.I0000Il00O + ", tag=" + this.I0000O + ")";
                }

/* 16 */        public I111101Olo00(Object obj, int i, int i2, String str) {
/* 18 */            this.I00000oIO = obj;
/* 19 */            this.I00000oOI = i;
/* 20 */            this.I0000Il00O = i2;
/* 21 */            this.I0000O = str;
                }
            }
