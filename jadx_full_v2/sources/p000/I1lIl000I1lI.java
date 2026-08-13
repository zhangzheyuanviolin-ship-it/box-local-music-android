            package p000;

            import java.util.HashMap;
            
            public final class I1lIl000I1lI {
                public IOO0l0i0Oo I00000oIO;
                public HashMap I00000oOI;

                public final long I00000oIO(OOIio1010OoO oOIio1010OoO, long j, int i) {
/* 7 */             long jI0001Ioi1lo = j - this.I00000oIO.I0001Ioi1lo();
/* 14 */            I1lIl0OolO i1lIl0OolO = (I1lIl0OolO) this.I00000oOI.get(oOIio1010OoO);
/* 16 */            long j2 = i1lIl0OolO.I00000oIO;
/* 70 */            return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jI0001Ioi1lo), i1lIl0OolO.I00000oOI);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1lIl000I1lI)) {
/* 32 */                return false;
                    }
/* 8 */             I1lIl000I1lI i1lIl000I1lI = (I1lIl000I1lI) obj;
                    return this.I00000oIO.equals(i1lIl000I1lI.I00000oIO) && this.I00000oOI.equals(i1lIl000I1lI.I00000oOI);
                }

                public final int hashCode() {
/* 18 */            return this.I00000oOI.hashCode() ^ ((this.I00000oIO.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "SchedulerConfig{clock=" + this.I00000oIO + ", values=" + this.I00000oOI + "}";
                }
            }
