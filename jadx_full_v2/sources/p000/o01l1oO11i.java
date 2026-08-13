            package p000;

            import android.text.TextUtils;
            import java.util.UUID;
            
            public final class o01l1oO11i {
                public OOol0l1I1 I00000oIO;
                public OOol0l1I1 I00000oOI;
                public UUID I0000Il00O;
                public long I0000O;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof o01l1oO11i)) {
/* 50 */                return false;
                    }
/* 8 */             o01l1oO11i o01l1oo11i = (o01l1oO11i) obj;
                    return this.I00000oIO.equals(o01l1oo11i.I00000oIO) && this.I00000oOI.equals(o01l1oo11i.I00000oOI) && this.I0000Il00O.equals(o01l1oo11i.I0000Il00O) && this.I0000O == o01l1oo11i.I0000O;
                }

                public final int hashCode() {
/* 26 */            int iHashCode = ((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O.hashCode();
/* 27 */            long j = this.I0000O;
/* 36 */            return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
                }

                public final String toString() {
/* 5 */             return TextUtils.join(" -> ", this.I00000oIO);
                }
            }
