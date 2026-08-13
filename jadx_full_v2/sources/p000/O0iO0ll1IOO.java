            package p000;
            
            public final class O0iO0ll1IOO {
                public long I00000oIO;
                public long I00000oOI;
                public String I0000Il00O;
                public String I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0iO0ll1IOO)) {
/* 50 */                return false;
                    }
/* 9 */             O0iO0ll1IOO o0iO0ll1IOO = (O0iO0ll1IOO) obj;
                    return this.I00000oIO == o0iO0ll1IOO.I00000oIO && this.I00000oOI == o0iO0ll1IOO.I00000oOI && this.I0000Il00O.equals(o0iO0ll1IOO.I0000Il00O) && this.I0000O.equals(o0iO0ll1IOO.I0000O);
                }

                public final int hashCode() {
/* 28 */            return this.I0000O.hashCode() + Oi010OO0.I000O01llI0(IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31, this.I0000Il00O);
                }

                public final String toString() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             long j2 = this.I00000oOI;
/* 5 */             String str = this.I0000Il00O;
/* 7 */             String str2 = this.I0000O;
/* 13 */            StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "LabeledSegment(startMs=", ", endMs=");
/* 17 */            sbI001iOo1i0O.append(j2);
/* 22 */            sbI001iOo1i0O.append(", speaker=");
/* 25 */            sbI001iOo1i0O.append(str);
/* 32 */            return IIlIOloOOO.I0010I0i(sbI001iOo1i0O, ", text=", str2, ")");
                }
            }
