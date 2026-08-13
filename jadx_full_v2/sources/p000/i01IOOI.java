            package p000;
            
            public final class i01IOOI {
                public final long I00000oIO;
                public final long I00000oOI;

                public i01IOOI(long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && i01IOOI.class.equals(obj.getClass())) {
/* 21 */                i01IOOI i01iooi = (i01IOOI) obj;
/* 29 */                if (i01iooi.I00000oIO == this.I00000oIO && i01iooi.I00000oOI == this.I00000oOI) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00000oOI) + (Long.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 28 */            return "PeriodicityInfo{repeatIntervalMillis=" + this.I00000oIO + ", flexIntervalMillis=" + this.I00000oOI + '}';
                }
            }
