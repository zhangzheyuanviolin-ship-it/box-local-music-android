            package p000;

            import android.graphics.RectF;
            
            public final class IiOoOOO {
                public final String I00000oIO;
                public final float I00000oOI;
                public final RectF I0000Il00O;
                public final IiO0i0O I0000O;
                public final String I0000oI00;

                public IiOoOOO(String str, float f, RectF rectF, IiO0i0O iiO0i0O, String str2) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = f;
/* 8 */             this.I0000Il00O = rectF;
/* 10 */            this.I0000O = iiO0i0O;
/* 12 */            this.I0000oI00 = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 63 */                return true;
                    }
/* 6 */             if (!(obj instanceof IiOoOOO)) {
/* 61 */                return false;
                    }
/* 9 */             IiOoOOO iiOoOOO = (IiOoOOO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iiOoOOO.I00000oIO) && Float.compare(this.I00000oOI, iiOoOOO.I00000oOI) == 0 && this.I0000Il00O.equals(iiOoOOO.I0000Il00O) && this.I0000O == iiOoOOO.I0000O && this.I0000oI00.equals(iiOoOOO.I0000oI00);
                }

                public final int hashCode() {
/* 38 */            return this.I0000oI00.hashCode() + ((this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + OooioIOo1.I0000O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI)) * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Detection(label=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", score=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", box=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", depth=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", horizontal=");
/* 52 */            return IIl001iO0Io.I00100l0(sb, this.I0000oI00, ")");
                }
            }
