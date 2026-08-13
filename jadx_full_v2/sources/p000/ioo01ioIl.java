            package p000;

            import java.io.Serializable;
            
            public final class ioo01ioIl implements Serializable {
                public static final ioo01ioIl I00iiO = new ioo01ioIl(io0O0l1Ol1o.I00iiO, io0O0l1Ol1o.I00iiI);
                public final io0O0l1Ol1o I00iOIl;
                public final io0O0l1Ol1o I00iiI;

                public ioo01ioIl(io0O0l1Ol1o io0o0l1ol1o, io0O0l1Ol1o io0o0l1ol1o2) {
/* 4 */             this.I00iOIl = io0o0l1ol1o;
/* 6 */             this.I00iiI = io0o0l1ol1o2;
/* 12 */            if (io0o0l1ol1o.I00000oIO(io0o0l1ol1o2) > 0 || io0o0l1ol1o == io0O0l1Ol1o.I00iiI || io0o0l1ol1o2 == io0O0l1Ol1o.I00iiO) {
/* 27 */                StringBuilder sb = new StringBuilder(16);
/* 30 */                io0o0l1ol1o.I00000oOI(sb);
/* 35 */                sb.append("..");
/* 38 */                io0o0l1ol1o2.I0000Il00O(sb);
/* 51 */                I000II.I000iOII("Invalid range: ".concat(sb.toString()));
/* 106 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof ioo01ioIl)) {
/* 29 */                return false;
                    }
/* 5 */             ioo01ioIl ioo01ioil = (ioo01ioIl) obj;
                    return this.I00iOIl.equals(ioo01ioil.I00iOIl) && this.I00iiI.equals(ioo01ioil.I00iiI);
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
