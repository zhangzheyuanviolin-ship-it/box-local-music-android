            package p000;

            import java.util.Arrays;
            
            public final class i10I00i111 {
                public Object[] I00000oIO = new Object[4];
                public int I00000oOI = 0;
                public boolean I0000Il00O;

                public final void I00000oIO(I01OlIoIl i01OlIoIl) {
/* 1 */             int i = this.I00000oOI;
/* 3 */             int i2 = i + 1;
/* 5 */             Object[] objArrCopyOf = this.I00000oIO;
/* 7 */             int length = objArrCopyOf.length;
/* 9 */             if (length < i2) {
/* 14 */                int i3 = length + (length >> 1) + 1;
/* 16 */                if (i3 < i2) {
/* 18 */                    int iHighestOneBit = Integer.highestOneBit(i);
/* 22 */                    i3 = iHighestOneBit + iHighestOneBit;
                        }
/* 24 */                if (i3 < 0) {
/* 26 */                    i3 = Integer.MAX_VALUE;
                        }
/* 29 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
/* 33 */                this.I00000oIO = objArrCopyOf;
/* 35 */                this.I0000Il00O = false;
                    } else if (this.I0000Il00O) {
/* 47 */                objArrCopyOf = (Object[]) objArrCopyOf.clone();
/* 49 */                this.I00000oIO = objArrCopyOf;
/* 51 */                this.I0000Il00O = false;
                    }
/* 53 */            int i4 = this.I00000oOI;
/* 57 */            this.I00000oOI = i4 + 1;
/* 59 */            objArrCopyOf[i4] = i01OlIoIl;
                }

                public final i10IIII01ol I00000oOI() {
/* 2 */             this.I0000Il00O = true;
/* 4 */             Object[] objArr = this.I00000oIO;
/* 6 */             int i = this.I00000oOI;
/* 8 */             i10I011 i10i011 = i10I10.I00lll10;
                    return i == 0 ? i10IIII01ol.I00o101lO : new i10IIII01ol(objArr, i);
                }
            }
