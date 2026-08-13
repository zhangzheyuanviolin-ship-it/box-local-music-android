            package p000;
            
/* 11 */    public final class Oil1oo000i {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;

                public Oil1oo000i(String str, String str2, String str3, String str4) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = str3;
/* 10 */            this.I0000O = str4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oil1oo000i)) {
/* 7 */                 return false;
                    }
/* 11 */            Oil1oo000i oil1oo000i = (Oil1oo000i) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oil1oo000i.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oil1oo000i.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oil1oo000i.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oil1oo000i.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 23 */            return IIl001iO0Io.I00100o1O0lo(IIl001iO0Io.I00111O("SenseVoiceResult(text=", this.I00000oIO, ", emotion=", this.I00000oOI, ", event="), this.I0000Il00O, ", language=", this.I0000O, ")");
                }

/* 12 */        public Oil1oo000i() {
/* 13 */            this("", "", "", "");
                }
            }
