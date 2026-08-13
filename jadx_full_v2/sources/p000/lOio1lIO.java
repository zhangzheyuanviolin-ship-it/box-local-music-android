            package p000;

            import java.io.Serializable;
            
            public final class lOio1lIO implements Serializable {
                public static final lOio1lIO I00iiO = new lOio1lIO(lO0IIliiOi0I.I00iiO, lO0IIliiOi0I.I00iiI);
                public final lO0IIliiOi0I I00iOIl;
                public final lO0IIliiOi0I I00iiI;

                public lOio1lIO(lO0IIliiOi0I lo0iiliioi0i, lO0IIliiOi0I lo0iiliioi0i2) {
/* 4 */             this.I00iOIl = lo0iiliioi0i;
/* 6 */             this.I00iiI = lo0iiliioi0i2;
/* 12 */            if (lo0iiliioi0i.I0000Il00O(lo0iiliioi0i2) > 0 || lo0iiliioi0i == lO0IIliiOi0I.I00iiI || lo0iiliioi0i2 == lO0IIliiOi0I.I00iiO) {
/* 27 */                StringBuilder sb = new StringBuilder(16);
/* 30 */                lo0iiliioi0i.I00000oIO(sb);
/* 35 */                sb.append("..");
/* 38 */                lo0iiliioi0i2.I00000oOI(sb);
/* 51 */                I000II.I000iOII("Invalid range: ".concat(sb.toString()));
/* 106 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof lOio1lIO)) {
/* 29 */                return false;
                    }
/* 5 */             lOio1lIO loio1lio = (lOio1lIO) obj;
                    return this.I00iOIl.equals(loio1lio.I00iOIl) && this.I00iiI.equals(loio1lio.I00iiI);
                }

                public final int hashCode() {
/* 15 */            return this.I00iiI.hashCode() + (this.I00iOIl.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(16);
/* 10 */            this.I00iOIl.I00000oIO(sb);
/* 15 */            sb.append("..");
/* 20 */            this.I00iiI.I00000oOI(sb);
/* 23 */            return sb.toString();
                }
            }
