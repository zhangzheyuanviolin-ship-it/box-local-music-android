            package p000;
            
            public final class i001iI0o1iOo {
                public long I00000oIO;
                public long I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof i001iI0o1iOo)) {
/* 39 */                return false;
                    }
/* 9 */             i001iI0o1iOo i001ii0o1ioo = (i001iI0o1iOo) obj;
                    return this.I00000oIO == i001ii0o1ioo.I00000oIO && this.I00000oOI == i001ii0o1ioo.I00000oOI && this.I0000Il00O.equals(i001ii0o1ioo.I0000Il00O);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31);
                }

                public final String toString() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             long j2 = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 11 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "WhisperSegment(startMs=", ", endMs=");
/* 15 */            sbI001iOo1i0O.append(j2);
/* 20 */            sbI001iOo1i0O.append(", text=");
/* 23 */            sbI001iOo1i0O.append(str);
/* 28 */            sbI001iOo1i0O.append(")");
/* 31 */            return sbI001iOo1i0O.toString();
                }
            }
