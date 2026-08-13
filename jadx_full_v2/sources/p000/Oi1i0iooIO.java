            package p000;
            
/* 11 */    public final class Oi1i0iooIO {
                public static final Oi1i0iooIO I0000oI00 = new Oi1i0iooIO();
                public final IlliIl1l11O I00000oIO;
                public final IlliOIilI I00000oOI;
                public final IlliIl1l11O I0000Il00O;
                public final IlliOIilI I0000O;

                public Oi1i0iooIO(IlliIl1l11O illiIl1l11O, IlliOIilI illiOIilI, IlliIl1l11O illiIl1l11O2, IlliOIilI illiOIilI2) {
/* 4 */             this.I00000oIO = illiIl1l11O;
/* 6 */             this.I00000oOI = illiOIilI;
/* 8 */             this.I0000Il00O = illiIl1l11O2;
/* 10 */            this.I0000O = illiOIilI2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oi1i0iooIO)) {
/* 7 */                 return false;
                    }
/* 11 */            Oi1i0iooIO oi1i0iooIO = (Oi1i0iooIO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oi1i0iooIO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oi1i0iooIO.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oi1i0iooIO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oi1i0iooIO.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "RichTextThemeConfiguration(textStyleProvider=" + this.I00000oIO + ", textStyleBackProvider=" + this.I00000oOI + ", contentColorProvider=" + this.I0000Il00O + ", contentColorBackProvider=" + this.I0000O + ")";
                }

/* 12 */        public Oi1i0iooIO() {
/* 17 */            this(I00ilI0I1.I00lli11, IOio11l.I00000oIO, I00ilI0I1.I00lll10, IOio11l.I00000oOI);
                }
            }
