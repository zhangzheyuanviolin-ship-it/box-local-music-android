            package p000;

            import java.util.ArrayList;
            
            public final class I1illOi0o extends I1ooilOll {
                public ArrayList I00000oIO;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof I1ooilOll) {
/* 17 */                return this.I00000oIO.equals(((I1illOi0o) ((I1ooilOll) obj)).I00000oIO);
                    }
/* 22 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 18 */            return "BatchedLogRequest{logRequests=" + this.I00000oIO + "}";
                }
            }
