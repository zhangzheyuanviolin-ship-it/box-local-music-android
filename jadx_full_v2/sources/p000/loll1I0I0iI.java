            package p000;

            import java.util.Arrays;
            
            public final class loll1I0I0iI extends lilI1ii {
                public Object[] I00000oIO;
                public int I00000oOI;

                @Override
                public final int I00000oIO() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final iIIoI1 I00000oOI(int i) {
/* 3 */             if (i < this.I00000oOI) {
/* 10 */                return (iIIoI1) this.I00000oIO[i + i];
                    }
/* 13 */            OoOil11Ol1o.I001i1lo1io();
/* 16 */            return null;
                }

                @Override
                public final Object I0000Il00O(iIIoI1 iiioi1) {
/* 1 */             int iI0001Ioi1lo = I0001Ioi1lo(iiioi1);
/* 6 */             if (iI0001Ioi1lo == -1) {
/* 22 */                return null;
                    }
/* 17 */            return iiioi1.I00000oOI.cast(this.I00000oIO[iI0001Ioi1lo + iI0001Ioi1lo + 1]);
                }

                @Override
                public final Object I0000O(int i) {
/* 3 */             if (i < this.I00000oOI) {
/* 10 */                return this.I00000oIO[i + i + 1];
                    }
/* 13 */            OoOil11Ol1o.I001i1lo1io();
/* 16 */            return null;
                }

                public final void I0000oI00(iIIoI1 iiioi1, Object obj) {
                    int iI0001Ioi1lo;
/* 3 */             if (!iiioi1.I0000Il00O && (iI0001Ioi1lo = I0001Ioi1lo(iiioi1)) != -1) {
/* 18 */                this.I00000oIO[iI0001Ioi1lo + iI0001Ioi1lo + 1] = obj;
/* 20 */                return;
                    }
/* 23 */            int i = this.I00000oOI + 1;
/* 25 */            Object[] objArrCopyOf = this.I00000oIO;
/* 27 */            int length = objArrCopyOf.length;
/* 29 */            if (i + i > length) {
/* 32 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
/* 36 */                this.I00000oIO = objArrCopyOf;
                    }
/* 38 */            int i2 = this.I00000oOI;
/* 40 */            int i3 = i2 + i2;
/* 42 */            objArrCopyOf[i3] = iiioi1;
/* 46 */            objArrCopyOf[i3 + 1] = obj;
/* 50 */            this.I00000oOI = i2 + 1;
                }

                public final int I0001Ioi1lo(iIIoI1 iiioi1) {
/* 4 */             for (int i = 0; i < this.I00000oOI; i++) {
/* 16 */                if (this.I00000oIO[i + i].equals(iiioi1)) {
/* 18 */                    return i;
                        }
                    }
/* 22 */            return -1;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Metadata{");
/* 11 */            for (int i = 0; i < this.I00000oOI; i++) {
/* 15 */                sb.append(" '");
/* 22 */                sb.append(I00000oOI(i));
/* 27 */                sb.append("': ");
/* 34 */                sb.append(I0000O(i));
                    }
/* 42 */            sb.append(" }");
/* 45 */            return sb.toString();
                }
            }
