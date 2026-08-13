            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class iOl1iiIll implements Iterable, Serializable {
                public static final iOlI1l0li I00iiI = new iOlI1l0li(iOlilI1ill0.I00000oIO);
                public int I00iOIl = 0;

                static {
/* 10 */            int i = iOl10iIiIiOi.I00000oIO;
                }

                public static iOlI1l0li I000iOII(byte[] bArr, int i, int i2) {
                    try {
/* 4 */                 I000lI(i, i + i2, bArr.length);
/* 7 */                 byte[] bArr2 = new byte[i2];
/* 10 */                System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */                return new iOlI1l0li(bArr2);
                    } catch (iOlio0iO001 e) {
/* 98 */                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }

                public static int I000lI(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 98 */                return i4;
                    }
/* 11 */            if (i < 0) {
/* 93 */                I000II.I0010o(IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
/* 41 */                return 0;
                    }
/* 13 */            if (i2 < i) {
/* 38 */                OoOil11Ol1o.I0001Ioi1lo(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", i, ", ", i2);
/* 41 */                return 0;
                    }
/* 66 */            OoOil11Ol1o.I0001Ioi1lo(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", i2, " >= ", i3);
/* 41 */            return 0;
                }

                public static boolean I000o00OoI0I(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 4 */             I000lI(i, i4, bArr.length);
/* 9 */             I000lI(i2, i3 + i2, bArr2.length);
/* 12 */            while (i < i4) {
/* 18 */                if (bArr[i] != bArr2[i2]) {
/* 20 */                    return false;
                        }
/* 22 */                i++;
/* 24 */                i2++;
                    }
/* 27 */            return true;
                }

                public abstract byte I00000oOI(int i);

                public abstract int I0000O();

                public abstract iOl1iiIll I0000oI00(int i, int i2);

                public abstract void I0001Ioi1lo(int i, byte[] bArr);

                public abstract boolean I000OOo1O(iOl1iiIll iol1iiill);

                public abstract int I000OiO(int i, int i2);

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof iOl1iiIll)) {
/* 34 */                return false;
                    }
/* 9 */             iOl1iiIll iol1iiill = (iOl1iiIll) obj;
/* 11 */            int iI0000O = I0000O();
/* 19 */            if (iI0000O != iol1iiill.I0000O()) {
/* 34 */                return false;
                    }
/* 22 */            if (iI0000O == 0) {
/* 41 */                return true;
                    }
/* 24 */            int i = this.I00iOIl;
/* 26 */            int i2 = iol1iiill.I00iOIl;
/* 28 */            if (i == 0 || i2 == 0 || i == i2) {
/* 36 */                return I000OOo1O(iol1iiill);
                    }
/* 34 */            return false;
                }

                public final int hashCode() {
/* 1 */             int iI000OiO = this.I00iOIl;
/* 3 */             if (iI000OiO == 0) {
/* 5 */                 int iI0000O = I0000O();
/* 9 */                 iI000OiO = I000OiO(iI0000O, iI0000O);
/* 13 */                if (iI000OiO == 0) {
/* 15 */                    iI000OiO = 1;
                        }
/* 16 */                this.I00iOIl = iI000OiO;
                    }
/* 20 */            return iI000OiO;
                }

                @Override
                public final Iterator iterator() {
/* 5 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(9);
/* 8 */             iIO11lll1OOi.I00iio = this;
/* 11 */            iIO11lll1OOi.I00iiI = 0;
/* 17 */            iIO11lll1OOi.I00iiO = I0000O();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public final String toString() {
                    byte[] bArr;
                    String strConcat;
                    byte[] bArr2;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iI0000O = I0000O();
/* 21 */            if (I0000O() <= 50) {
/* 23 */                int iI0000O2 = I0000O();
/* 27 */                if (iI0000O2 == 0) {
/* 29 */                    bArr2 = iOlilI1ill0.I00000oIO;
                        } else {
/* 32 */                    byte[] bArr3 = new byte[iI0000O2];
/* 34 */                    I0001Ioi1lo(iI0000O2, bArr3);
/* 37 */                    bArr2 = bArr3;
                        }
/* 38 */                strConcat = lil01ll.I00000oIO(bArr2);
                    } else {
/* 46 */                iOl1iiIll iol1iiillI0000oI00 = I0000oI00(0, 47);
/* 50 */                int iI0000O3 = iol1iiillI0000oI00.I0000O();
/* 54 */                if (iI0000O3 == 0) {
/* 56 */                    bArr = iOlilI1ill0.I00000oIO;
                        } else {
/* 59 */                    byte[] bArr4 = new byte[iI0000O3];
/* 61 */                    iol1iiillI0000oI00.I0001Ioi1lo(iI0000O3, bArr4);
/* 64 */                    bArr = bArr4;
                        }
/* 71 */                strConcat = lil01ll.I00000oIO(bArr).concat("...");
                    }
/* 87 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(iI0000O, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
