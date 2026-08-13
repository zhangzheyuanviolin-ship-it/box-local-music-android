            package p000;

            import java.io.Serializable;
            
            public final class Oollooi1l implements Comparable, Serializable {
                public static final Oollooi1l I00iiO = new Oollooi1l(0, 0);
                public final long I00iOIl;
                public final long I00iiI;

                public Oollooi1l(long j, long j2) {
/* 4 */             this.I00iOIl = j;
/* 6 */             this.I00iiI = j2;
                }

                public final String I00000oIO() {
/* 3 */             byte[] bArr = new byte[32];
/* 11 */            li1O0IIOo.I00000oIO(this.I00iOIl, bArr, 0, 0, 8);
/* 18 */            li1O0IIOo.I00000oIO(this.I00iiI, bArr, 16, 0, 8);
/* 25 */            return new String(bArr, IO1IOI.I00000oIO);
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             Oollooi1l oollooi1l = (Oollooi1l) obj;
/* 3 */             long j = oollooi1l.I00iOIl;
/* 5 */             long j2 = this.I00iOIl;
                    return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.I00iiI, oollooi1l.I00iiI);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Oollooi1l)) {
/* 7 */                 return false;
                    }
/* 11 */            Oollooi1l oollooi1l = (Oollooi1l) obj;
                    return this.I00iOIl == oollooi1l.I00iOIl && this.I00iiI == oollooi1l.I00iiI;
                }

                public final int hashCode() {
/* 6 */             return Long.hashCode(this.I00iOIl ^ this.I00iiI);
                }

                public final String toString() {
/* 3 */             byte[] bArr = new byte[36];
/* 10 */            li1O0IIOo.I00000oIO(this.I00iOIl, bArr, 0, 0, 4);
/* 17 */            bArr[8] = 45;
/* 25 */            li1O0IIOo.I00000oIO(this.I00iOIl, bArr, 9, 4, 6);
/* 30 */            bArr[13] = 45;
/* 39 */            li1O0IIOo.I00000oIO(this.I00iOIl, bArr, 14, 6, 8);
/* 44 */            bArr[18] = 45;
/* 52 */            li1O0IIOo.I00000oIO(this.I00iiI, bArr, 19, 0, 2);
/* 57 */            bArr[23] = 45;
/* 66 */            li1O0IIOo.I00000oIO(this.I00iiI, bArr, 24, 2, 8);
/* 73 */            return new String(bArr, IO1IOI.I00000oIO);
                }
            }
