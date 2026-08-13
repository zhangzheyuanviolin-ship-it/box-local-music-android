            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public class i1ili1lI0 implements Iterable, Serializable {
                public static final i1ili1lI0 I00iiO = new i1ili1lI0(i1o1Iio.I00000oOI);
                public int I00iOIl = 0;
                public final byte[] I00iiI;

                static {
/* 10 */            int i = i1i1oioIl0.I00000oIO;
                }

                public i1ili1lI0(byte[] bArr) {
/* 7 */             bArr.getClass();
/* 10 */            this.I00iiI = bArr;
                }

                public static int I0001Ioi1lo(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 98 */                return i4;
                    }
/* 11 */            if (i < 0) {
/* 48 */                I000II.I0010o(IIlIOloOOO.I00100l0("Beginning index: ", i, " < 0"));
/* 26 */                return 0;
                    }
/* 13 */            if (i2 < i) {
/* 23 */                I000II.I0010o(IIl001iO0Io.I000l1(i, i2, "Beginning index larger than ending index: ", ", "));
/* 26 */                return 0;
                    }
/* 36 */            I000II.I0010o(IIl001iO0Io.I000l1(i2, i3, "End index: ", " >= "));
/* 26 */            return 0;
                }

                public static i1ili1lI0 I000OOo1O(byte[] bArr, int i, int i2) {
/* 4 */             I0001Ioi1lo(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new i1ili1lI0(bArr2);
                }

                public byte I00000oOI(int i) {
/* 3 */             return this.I00iiI[i];
                }

                public byte I0000O(int i) {
/* 3 */             return this.I00iiI[i];
                }

                public int I0000oI00() {
/* 3 */             return this.I00iiI.length;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 83 */                return true;
                    }
/* 7 */             if ((obj instanceof i1ili1lI0) && I0000oI00() == ((i1ili1lI0) obj).I0000oI00()) {
/* 28 */                if (I0000oI00() == 0) {
/* 83 */                    return true;
                        }
/* 33 */                if (!(obj instanceof i1ili1lI0)) {
/* 109 */                   return obj.equals(this);
                        }
/* 35 */                i1ili1lI0 i1ili1li0 = (i1ili1lI0) obj;
/* 37 */                int i = this.I00iOIl;
/* 39 */                int i2 = i1ili1li0.I00iOIl;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 47 */                    int iI0000oI00 = I0000oI00();
/* 55 */                    if (iI0000oI00 > i1ili1li0.I0000oI00()) {
/* 105 */                       I000II.I00100o1O0lo(iI0000oI00, I0000oI00());
/* 6 */                         return false;
                            }
/* 61 */                    if (iI0000oI00 > i1ili1li0.I0000oI00()) {
/* 97 */                        I000II.I000iOII(IIl001iO0Io.I000l1(iI0000oI00, i1ili1li0.I0000oI00(), "Ran off end of other: 0, ", ", "));
/* 6 */                         return false;
                            }
/* 63 */                    byte[] bArr = i1ili1li0.I00iiI;
/* 65 */                    int i3 = 0;
/* 66 */                    int i4 = 0;
/* 67 */                    while (i3 < iI0000oI00) {
/* 75 */                        if (this.I00iiI[i3] == bArr[i4]) {
/* 78 */                            i3++;
/* 80 */                            i4++;
                                }
                            }
/* 83 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 55 */                return i;
                    }
/* 5 */             int iI0000oI00 = I0000oI00();
/* 10 */            int i2 = iI0000oI00;
/* 11 */            for (int i3 = 0; i3 < iI0000oI00; i3++) {
/* 19 */                i2 = (i2 * 31) + this.I00iiI[i3];
                    }
/* 23 */            if (i2 == 0) {
/* 25 */                i2 = 1;
                    }
/* 26 */            this.I00iOIl = i2;
/* 28 */            return i2;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(7);
/* 7 */             iIO11lll1OOi.I00iio = this;
/* 10 */            iIO11lll1OOi.I00iiI = 0;
/* 16 */            iIO11lll1OOi.I00iiO = I0000oI00();
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public final String toString() {
                    i1ili1lI0 i1ili1li0;
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iI0000oI00 = I0000oI00();
/* 21 */            if (I0000oI00() <= 50) {
/* 23 */                strConcat = lii10i1ooo.I00000oIO(this);
                    } else {
/* 35 */                int iI0001Ioi1lo = I0001Ioi1lo(0, 47, I0000oI00());
/* 39 */                if (iI0001Ioi1lo == 0) {
/* 41 */                    i1ili1li0 = I00iiO;
                        } else {
/* 46 */                    byte[] bArr = this.I00iiI;
/* 48 */                    i1iOlloi i1iolloi = new i1iOlloi(bArr);
/* 52 */                    I0001Ioi1lo(0, iI0001Ioi1lo, bArr.length);
/* 55 */                    i1iolloi.I00iio = iI0001Ioi1lo;
/* 57 */                    VarHandle.storeStoreFence();
/* 60 */                    i1ili1li0 = i1iolloi;
                        }
/* 67 */                strConcat = lii10i1ooo.I00000oIO(i1ili1li0).concat("...");
                    }
/* 83 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(iI0000oI00, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
