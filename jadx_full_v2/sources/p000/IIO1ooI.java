            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public class IIO1ooI implements Iterable, Serializable {
                public static final IIO1ooI I00iiO = new IIO1ooI(IoolIIolo1lI.I00000oOI);
                public static final IIO1Ol0OIO10 I00iio;
                public int I00iOIl = 0;
                public final byte[] I00iiI;

                static {
/* 31 */            I00iio = I0lI0iiol.I00000oIO() ? new lOOlOoll(9) : new iOloo0O0O(9);
                }

                public IIO1ooI(byte[] bArr) {
/* 7 */             bArr.getClass();
/* 10 */            this.I00iiI = bArr;
                }

                public static int I0000O(int i, int i2, int i3) {
/* 1 */             int i4 = i2 - i;
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

                public static IIO1ooI I0000oI00(byte[] bArr, int i, int i2) {
/* 4 */             I0000O(i, i + i2, bArr.length);
/* 15 */            return new IIO1ooI(I00iio.I00000oIO(bArr, i, i2));
                }

                public byte I00000oOI(int i) {
/* 3 */             return this.I00iiI[i];
                }

                public void I0001Ioi1lo(int i, byte[] bArr) {
/* 4 */             System.arraycopy(this.I00iiI, 0, bArr, 0, i);
                }

                public int I000OOo1O() {
/* 1 */             return 0;
                }

                public byte I000OiO(int i) {
/* 3 */             return this.I00iiI[i];
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 95 */                return true;
                    }
/* 7 */             if ((obj instanceof IIO1ooI) && size() == ((IIO1ooI) obj).size()) {
/* 28 */                if (size() == 0) {
/* 95 */                    return true;
                        }
/* 33 */                if (!(obj instanceof IIO1ooI)) {
/* 121 */                   return obj.equals(this);
                        }
/* 35 */                IIO1ooI iIO1ooI = (IIO1ooI) obj;
/* 37 */                int i = this.I00iOIl;
/* 39 */                int i2 = iIO1ooI.I00iOIl;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 48 */                    int size = size();
/* 56 */                    if (size > iIO1ooI.size()) {
/* 117 */                       I000II.I00100o1O0lo(size, size());
/* 6 */                         return false;
                            }
/* 62 */                    if (size > iIO1ooI.size()) {
/* 109 */                       OIiilo1Ool0o.I000o00OoI0I(iIO1ooI.size(), IlIi0I0.I00100o1O0lo("Ran off end of other: 0, ", size, ", "));
/* 6 */                         return false;
                            }
/* 64 */                    byte[] bArr = iIO1ooI.I00iiI;
/* 70 */                    int iI000OOo1O = I000OOo1O() + size;
/* 71 */                    int iI000OOo1O2 = I000OOo1O();
/* 75 */                    int iI000OOo1O3 = iIO1ooI.I000OOo1O();
/* 79 */                    while (iI000OOo1O2 < iI000OOo1O) {
/* 87 */                        if (this.I00iiI[iI000OOo1O2] == bArr[iI000OOo1O3]) {
/* 90 */                            iI000OOo1O2++;
/* 92 */                            iI000OOo1O3++;
                                }
                            }
/* 95 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 55 */                return i;
                    }
/* 5 */             int size = size();
/* 9 */             int iI000OOo1O = I000OOo1O();
/* 13 */            int i2 = size;
/* 17 */            for (int i3 = iI000OOo1O; i3 < iI000OOo1O + size; i3++) {
/* 25 */                i2 = (i2 * 31) + this.I00iiI[i3];
                    }
/* 29 */            if (i2 == 0) {
/* 31 */                i2 = 1;
                    }
/* 32 */            this.I00iOIl = i2;
/* 34 */            return i2;
                }

                @Override
                public Iterator iterator() {
/* 4 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(2);
/* 7 */             iIO11lll1OOi.I00iio = this;
/* 10 */            iIO11lll1OOi.I00iiI = 0;
/* 16 */            iIO11lll1OOi.I00iiO = size();
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public int size() {
/* 3 */             return this.I00iiI.length;
                }

                public final String toString() {
                    IIO1ooI iIO1ooI;
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int size = size();
/* 21 */            if (size() <= 50) {
/* 23 */                strConcat = lOlOiiIiI1.I00000oIO(this);
                    } else {
/* 35 */                int iI0000O = I0000O(0, 47, size());
/* 39 */                if (iI0000O == 0) {
/* 41 */                    iIO1ooI = I00iiO;
                        } else {
/* 46 */                    int iI000OOo1O = I000OOo1O();
/* 50 */                    byte[] bArr = this.I00iiI;
/* 52 */                    IIO1OOi1loI iIO1OOi1loI = new IIO1OOi1loI(bArr);
/* 58 */                    I0000O(iI000OOo1O, iI000OOo1O + iI0000O, bArr.length);
/* 61 */                    iIO1OOi1loI.I00ilI0I1 = iI000OOo1O;
/* 63 */                    iIO1OOi1loI.I00ilO0 = iI0000O;
/* 65 */                    VarHandle.storeStoreFence();
/* 68 */                    iIO1ooI = iIO1OOi1loI;
                        }
/* 75 */                strConcat = lOlOiiIiI1.I00000oIO(iIO1ooI).concat("...");
                    }
/* 91 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
