            package p000;
            
            public final class OioOII0oI {
                public static final OioOII0oI I0000O = new OioOII0oI(0.0f, iiO01ll11o1l.I0000Il00O(4278190080L), 0);
                public final long I00000oIO;
                public final long I00000oOI;
                public final float I0000Il00O;

                public OioOII0oI(float f, long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
/* 8 */             this.I0000Il00O = f;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 43 */                return true;
                    }
/* 6 */             if (!(obj instanceof OioOII0oI)) {
/* 45 */                return false;
                    }
/* 9 */             OioOII0oI oioOII0oI = (OioOII0oI) obj;
/* 11 */            long j = oioOII0oI.I00000oIO;
/* 13 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(this.I00000oIO, j) && OIOlIiiioi.I0000O(this.I00000oOI, oioOII0oI.I00000oOI) && this.I0000Il00O == oioOII0oI.I0000Il00O;
                }

                public final int hashCode() {
/* 1 */             int i = IOOiio0i.I000oI1ioi;
/* 24 */            return Float.hashCode(this.I0000Il00O) + IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 27 */            return Oi010OO0.I001i1O0Ol(IIl001iO0Io.I00111O("Shadow(color=", IOOiio0i.I000OOo1O(this.I00000oIO), ", offset=", OIOlIiiioi.I000OOo1O(this.I00000oOI), ", blurRadius="), this.I0000Il00O, ")");
                }
            }
