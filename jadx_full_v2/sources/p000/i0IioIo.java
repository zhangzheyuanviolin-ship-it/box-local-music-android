            package p000;

            import java.io.Serializable;
            
            public final class i0IioIo implements Serializable {
                public static final i0IioIo I00iiO = new i0IioIo(i0II1iO1Io1o.I00iiO, i0II1iO1Io1o.I00iiI);
                public final i0II1iO1Io1o I00iOIl;
                public final i0II1iO1Io1o I00iiI;

                public i0IioIo(i0II1iO1Io1o i0ii1io1io1o, i0II1iO1Io1o i0ii1io1io1o2) {
/* 4 */             this.I00iOIl = i0ii1io1io1o;
/* 6 */             this.I00iiI = i0ii1io1io1o2;
/* 12 */            if (i0ii1io1io1o.I00000oIO(i0ii1io1io1o2) > 0 || i0ii1io1io1o == i0II1iO1Io1o.I00iiI || i0ii1io1io1o2 == i0II1iO1Io1o.I00iiO) {
/* 27 */                StringBuilder sb = new StringBuilder(16);
/* 30 */                i0ii1io1io1o.I00000oOI(sb);
/* 35 */                sb.append("..");
/* 38 */                i0ii1io1io1o2.I0000Il00O(sb);
/* 51 */                I000II.I000iOII("Invalid range: ".concat(sb.toString()));
/* 89 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof i0IioIo)) {
/* 29 */                return false;
                    }
/* 5 */             i0IioIo i0iioio = (i0IioIo) obj;
                    return this.I00iOIl.equals(i0iioio.I00iOIl) && this.I00iiI.equals(i0iioio.I00iiI);
                }

                public final int hashCode() {
/* 15 */            return this.I00iiI.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(16);
/* 10 */            this.I00iOIl.I00000oOI(sb);
/* 15 */            sb.append("..");
/* 20 */            this.I00iiI.I0000Il00O(sb);
/* 23 */            return sb.toString();
                }
            }
