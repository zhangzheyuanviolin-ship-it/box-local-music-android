            package p000;
            
            public final class OlOooI0l0011 extends Iilloo0IOoIo {
                public final float I00000oIO;
                public final float I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final I0ol1Ioloo I0000oI00;

                public OlOooI0l0011(float f, float f2, int i, int i2, I0ol1Ioloo i0ol1Ioloo, int i3) {
/* 3 */             f = (i3 & 1) != 0 ? 0.0f : f;
/* 8 */             f2 = (i3 & 2) != 0 ? 4.0f : f2;
/* 15 */            i = (i3 & 4) != 0 ? 0 : i;
/* 20 */            i2 = (i3 & 8) != 0 ? 0 : i2;
/* 25 */            i0ol1Ioloo = (i3 & 16) != 0 ? null : i0ol1Ioloo;
/* 31 */            this.I00000oIO = f;
/* 33 */            this.I00000oOI = f2;
/* 35 */            this.I0000Il00O = i;
/* 37 */            this.I0000O = i2;
/* 39 */            this.I0000oI00 = i0ol1Ioloo;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OlOooI0l0011)) {
/* 7 */                 return false;
                    }
/* 11 */            OlOooI0l0011 olOooI0l0011 = (OlOooI0l0011) obj;
                    return this.I00000oIO == olOooI0l0011.I00000oIO && this.I00000oOI == olOooI0l0011.I00000oOI && this.I0000Il00O == olOooI0l0011.I0000Il00O && this.I0000O == olOooI0l0011.I0000O && O0000Ioio00.I0000O(this.I0000oI00, olOooI0l0011.I0000oI00);
                }

                public final int hashCode() {
/* 24 */            int iI0000O = IIl001iO0Io.I0000O(this.I0000O, IIl001iO0Io.I0000O(this.I0000Il00O, OooioIOo1.I0000O(Float.hashCode(this.I00000oIO) * 31, 31, this.I00000oOI), 31), 31);
/* 28 */            I0ol1Ioloo i0ol1Ioloo = this.I0000oI00;
/* 38 */            return iI0000O + (i0ol1Ioloo != null ? i0ol1Ioloo.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = "Unknown";
/* 7 */             int i = this.I0000Il00O;
/* 20 */            String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? OIlllOo01.I00ll1 : "Unknown";
/* 24 */            int i2 = this.I0000O;
/* 26 */            if (i2 == 0) {
/* 28 */                str = "Miter";
                    } else if (i2 == 1) {
/* 4 */                 str = "Round";
                    } else if (i2 == 2) {
/* 37 */                str = "Bevel";
                    }
/* 49 */            StringBuilder sbI00100l0 = IlIi0I0.I00100l0("Stroke(width=", this.I00000oIO, ", miter=", this.I00000oOI, ", cap=");
/* 57 */            IIl001iO0Io.I001lIiIIo1O(sbI00100l0, str2, ", join=", str, ", pathEffect=");
/* 62 */            sbI00100l0.append(this.I0000oI00);
/* 67 */            sbI00100l0.append(")");
/* 70 */            return sbI00100l0.toString();
                }
            }
