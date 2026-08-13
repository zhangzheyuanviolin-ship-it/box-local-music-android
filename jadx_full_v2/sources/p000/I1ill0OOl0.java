            package p000;
            
            public final class I1ill0OOl0 {
                public final int I00000oIO;
                public final long I00000oOI;

                public I1ill0OOl0(int i, long j) {
/* 4 */             if (i == 0) {
/* 13 */                IOOlIIilOl0.I000II("Null status");
/* 89 */                throw null;
                    }
/* 6 */             this.I00000oIO = i;
/* 8 */             this.I00000oOI = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof I1ill0OOl0)) {
/* 30 */                return false;
                    }
/* 8 */             I1ill0OOl0 i1ill0OOl0 = (I1ill0OOl0) obj;
                    return IIlIOloOOO.I00000oOI(this.I00000oIO, i1ill0OOl0.I00000oIO) && this.I00000oOI == i1ill0OOl0.I00000oOI;
                }

                public final int hashCode() {
/* 11 */            int iI001lIiIIo1O = (IIlIOloOOO.I001lIiIIo1O(this.I00000oIO) ^ 1000003) * 1000003;
/* 14 */            long j = this.I00000oOI;
/* 21 */            return ((int) ((j >>> 32) ^ j)) ^ iI001lIiIIo1O;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BackendResponse{status=");
/* 9 */             int i = this.I00000oIO;
/* 36 */            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
/* 41 */            sb.append(", nextRequestWaitMillis=");
/* 48 */            return IlIi0I0.I000o00OoI0I(sb, this.I00000oOI, "}");
                }
            }
