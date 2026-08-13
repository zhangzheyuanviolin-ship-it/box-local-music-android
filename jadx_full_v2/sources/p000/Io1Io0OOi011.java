            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class Io1Io0OOi011 implements Iterable, O0IlIoi {
                public final String[] I00iOIl;

                public Io1Io0OOi011(String[] strArr) {
/* 4 */             this.I00iOIl = strArr;
                }

                public final String I00000oOI(String str) {
/* 1 */             String[] strArr = this.I00iOIl;
                    int length = strArr.length - 2;
/* 8 */             int iI00000oIO = lIO01iiiOOo.I00000oIO(length, 0, -2);
/* 12 */            if (iI00000oIO > length) {
/* 32 */                return null;
                    }
/* 21 */            while (!OlOolloIIOl0.I000O01llI0(str, strArr[length], true)) {
/* 27 */                if (length == iI00000oIO) {
/* 32 */                    return null;
                        }
                        length -= 2;
                    }
/* 24 */            return strArr[length + 1];
                }

                public final String I0000O(int i) {
/* 5 */             return this.I00iOIl[i * 2];
                }

                public final Io1IlO1I1i I000OOo1O() {
/* 3 */             Io1IlO1I1i io1IlO1I1i = new Io1IlO1I1i();
/* 10 */            IOOii0O10Io0.I00100o1O0lo(io1IlO1I1i.I00000oIO, this.I00iOIl);
/* 20 */            return io1IlO1I1i;
                }

                public final String I000OiO(int i) {
/* 7 */             return this.I00iOIl[(i * 2) + 1];
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof Io1Io0OOi011) {
                        return Arrays.equals(this.I00iOIl, ((Io1Io0OOi011) obj).I00iOIl);
                    }
/* 19 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00iOIl);
                }

                @Override
                public final Iterator iterator() {
/* 1 */             int size = size();
/* 5 */             OIoi0IIoi[] oIoi0IIoiArr = new OIoi0IIoi[size];
/* 8 */             for (int i = 0; i < size; i++) {
/* 23 */                oIoi0IIoiArr[i] = new OIoi0IIoi(I0000O(i), I000OiO(i));
                    }
/* 28 */            return iOO1OO.I00000oIO(oIoi0IIoiArr);
                }

                public final int size() {
/* 4 */             return this.I00iOIl.length / 2;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             int size = size();
/* 11 */            for (int i = 0; i < size; i++) {
/* 13 */                String strI0000O = I0000O(i);
/* 17 */                String strI000OiO = I000OiO(i);
/* 21 */                sb.append(strI0000O);
/* 26 */                sb.append(": ");
/* 33 */                if (OollIoI001lo.I00100l0(strI0000O)) {
/* 35 */                    strI000OiO = "██";
                        }
/* 37 */                sb.append(strI000OiO);
/* 42 */                sb.append("\n");
                    }
/* 48 */            return sb.toString();
                }
            }
