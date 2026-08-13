            package p000;
            
            public final class OII11iIO extends OII1I1oi {
                public final OII0l0 I00000oIO;
                public final int I00000oOI;

                public OII11iIO(OII0l0 oII0l0, int i) {
/* 4 */             this.I00000oIO = oII0l0;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 4 */             if (obj == null || OII11iIO.class != obj.getClass()) {
/* 37 */                return false;
                    }
/* 15 */            OII11iIO oII11iIO = (OII11iIO) obj;
                    return this.I00000oOI == oII11iIO.I00000oOI && O0000Ioio00.I0000O(this.I00000oIO, oII11iIO.I00000oIO);
                }

                public final int hashCode() {
/* 11 */            return this.I00000oIO.hashCode() + (this.I00000oOI * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", direction=");
/* 22 */            return Oi010OO0.I001i1lo1io(sb, this.I00000oOI, ')');
                }
            }
