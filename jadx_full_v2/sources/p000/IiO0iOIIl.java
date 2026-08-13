            package p000;
            
            public final class IiO0iOIIl {
                public static final IiO0iOIIl I0000Il00O = new IiO0iOIIl(0, 0);
                public final long I00000oIO;
                public final long I00000oOI;

                public IiO0iOIIl(long j, long j2) {
/* 4 */             this.I00000oIO = j;
/* 6 */             this.I00000oOI = j2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof IiO0iOIIl) {
/* 11 */                IiO0iOIIl iiO0iOIIl = (IiO0iOIIl) obj;
                        return IooOl0ol01.I0000Il00O(this.I00000oIO, iiO0iOIIl.I00000oIO) && this.I00000oOI == iiO0iOIIl.I00000oOI;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00000oOI) + (Long.hashCode(this.I00000oIO) * 31);
                }
            }
