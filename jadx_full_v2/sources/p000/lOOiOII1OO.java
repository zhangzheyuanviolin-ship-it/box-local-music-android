            package p000;

            import java.util.Objects;
            
            public final class lOOiOII1OO implements Comparable {
                public final long I00iOIl;
                public final String I00iiI;
                public final int I00iiO;
                public final long I00iio;
                public final Object I00ilI0I1;
                public final RuntimeException I00ilO0;

                public lOOiOII1OO(long j, String str, int i, long j2, Object obj) {
/* 24 */            lII0I0I01I1l.I00000oOI(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
/* 27 */            this.I00iOIl = j;
/* 29 */            this.I00iiI = str;
/* 31 */            this.I00iiO = i;
/* 33 */            this.I00iio = j2;
/* 35 */            this.I00ilI0I1 = obj;
/* 39 */            if (i != 5) {
/* 86 */                this.I00ilO0 = null;
/* 399 */               return;
                    }
/* 41 */            if (obj == null) {
/* 50 */                this.I00ilO0 = new NullPointerException("Null stringOrBytes");
                    } else if ((obj instanceof byte[]) || (obj instanceof i1lIIl01O)) {
/* 83 */                this.I00ilO0 = null;
                    } else {
/* 80 */                this.I00ilO0 = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
                    }
                }

                public final Object I00000oIO() {
/* 1 */             int i = this.I00iiO;
/* 3 */             if (i == 0) {
/* 80 */                return Boolean.FALSE;
                    }
/* 6 */             if (i == 1) {
/* 77 */                return Boolean.TRUE;
                    }
/* 9 */             long j = this.I00iio;
/* 11 */            if (i == 2) {
/* 72 */                return Long.valueOf(j);
                    }
/* 14 */            if (i == 3) {
/* 67 */                return Double.valueOf(Double.longBitsToDouble(j));
                    }
/* 17 */            Object obj = this.I00ilI0I1;
/* 19 */            if (i == 4) {
/* 59 */                obj.getClass();
/* 62 */                return obj;
                    }
/* 22 */            if (i != 5) {
/* 54 */                I000II.I000O01llI0("Impossible, this was validated when parsed or created");
/* 57 */                return null;
                    }
/* 24 */            obj.getClass();
                    try {
                        return obj instanceof byte[] ? (byte[]) obj : ((i1lIIl01O) obj).I000oI1ioi();
                    } catch (Throwable th) {
/* 43 */                RuntimeException runtimeException = this.I00ilO0;
/* 45 */                if (runtimeException != null) {
/* 48 */                    th.addSuppressed(runtimeException);
                        }
/* 51 */                throw th;
                    }
                }

                @Override
                public final int compareTo(Object obj) {
/* 1 */             lOOiOII1OO looioii1oo = (lOOiOII1OO) obj;
/* 3 */             long j = looioii1oo.I00iOIl;
/* 5 */             long j2 = this.I00iOIl;
/* 7 */             int iCompare = Long.compare(j2, j);
/* 11 */            if (iCompare != 0) {
/* 77 */                return iCompare;
                    }
/* 17 */            if (j2 != 0) {
/* 19 */                return 0;
                    }
/* 21 */            String str = this.I00iiI;
/* 23 */            str.getClass();
/* 26 */            String str2 = looioii1oo.I00iiI;
/* 28 */            str2.getClass();
/* 31 */            return str.compareTo(str2);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof lOOiOII1OO)) {
/* 7 */                 return false;
                    }
/* 11 */            lOOiOII1OO looioii1oo = (lOOiOII1OO) obj;
                    return this.I00iOIl == looioii1oo.I00iOIl && Objects.equals(this.I00iiI, looioii1oo.I00iiI);
                }

                public final int hashCode() {
/* 13 */            return Objects.hash(Long.valueOf(this.I00iOIl), this.I00iiI);
                }

                public final String toString() {
/* 1 */             String string = this.I00iiI;
/* 3 */             if (string == null) {
/* 8 */                 string = Long.toString(this.I00iOIl);
                    }
/* 16 */            String strValueOf = String.valueOf(I00000oIO());
/* 42 */            return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
                }
            }
