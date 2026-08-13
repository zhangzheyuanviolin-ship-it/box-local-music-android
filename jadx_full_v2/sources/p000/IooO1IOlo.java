            package p000;
            
            public final class IooO1IOlo {
                public static final IooO1IOlo I0000oI00 = new IooO1IOlo(0, 0, 0, 0);
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;

                public IooO1IOlo(int i, int i2, int i3, int i4) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = i3;
/* 10 */            this.I0000O = i4;
                }

                public final long I00000oIO() {
/* 30 */            return (((I00000oOI() / 2) + this.I00000oOI) & 4294967295L) | (((I0000O() / 2) + this.I00000oIO) << 32);
                }

                public final int I00000oOI() {
/* 5 */             return this.I0000O - this.I00000oOI;
                }

                public final long I0000Il00O() {
/* 16 */            return (this.I00000oIO << 32) | (this.I00000oOI & 4294967295L);
                }

                public final int I0000O() {
/* 5 */             return this.I0000Il00O - this.I00000oIO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IooO1IOlo)) {
/* 7 */                 return false;
                    }
/* 11 */            IooO1IOlo iooO1IOlo = (IooO1IOlo) obj;
                    return this.I00000oIO == iooO1IOlo.I00000oIO && this.I00000oOI == iooO1IOlo.I00000oOI && this.I0000Il00O == iooO1IOlo.I0000Il00O && this.I0000O == iooO1IOlo.I0000O;
                }

                public final int hashCode() {
/* 28 */            return Integer.hashCode(this.I0000O) + IIl001iO0Io.I0000O(this.I0000Il00O, IIl001iO0Io.I0000O(this.I00000oOI, Integer.hashCode(this.I00000oIO) * 31, 31), 31);
                }

                public final String toString() {
/* 9 */             StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("IntRect.fromLTRB(", this.I00000oIO, ", ", this.I00000oOI, ", ");
/* 15 */            sbI0010I0i.append(this.I0000Il00O);
/* 18 */            sbI0010I0i.append(", ");
/* 23 */            sbI0010I0i.append(this.I0000O);
/* 28 */            sbI0010I0i.append(")");
/* 31 */            return sbI0010I0i.toString();
                }
            }
