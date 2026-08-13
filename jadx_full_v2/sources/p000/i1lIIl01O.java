            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class i1lIIl01O implements Iterable, Serializable {
                public static final i1lI1O I00iiI = new i1lI1O(iI000IO.I00000oIO);
                public int I00iOIl = 0;

                static {
/* 10 */            int i = i1ioiooIiOol.I00000oIO;
                }

                public static i1lI1O I000lI(byte[] bArr, int i, int i2) {
                    try {
/* 1 */                 return I000o00OoI0I(bArr, i, i2);
                    } catch (iI00lI e) {
/* 98 */                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                }

                public static i1lI1O I000o00OoI0I(byte[] bArr, int i, int i2) {
/* 1 */             if (i2 == 0) {
/* 3 */                 return I00iiI;
                    }
/* 9 */             I00100o1O0lo(i, i + i2, bArr.length);
/* 12 */            byte[] bArr2 = new byte[i2];
/* 15 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 20 */            return new i1lI1O(bArr2);
                }

                public static int I00100o1O0lo(int i, int i2, int i3) {
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

                public static boolean I0010I0i(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 4 */             I00100o1O0lo(i, i4, bArr.length);
/* 9 */             I00100o1O0lo(i2, i3 + i2, bArr2.length);
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

                public abstract i1lI00ll111 I0000oI00(int i, int i2);

                public abstract void I0001Ioi1lo(int i, byte[] bArr);

                public abstract void I000OOo1O(i1lllO0 i1lllo0);

                public abstract boolean I000OiO(i1lIIl01O i1liil01o);

                public abstract int I000iOII(int i, int i2);

                public final byte[] I000oI1ioi() {
/* 1 */             int iI0000O = I0000O();
/* 5 */             if (iI0000O == 0) {
/* 7 */                 return iI000IO.I00000oIO;
                    }
/* 10 */            byte[] bArr = new byte[iI0000O];
/* 12 */            I0001Ioi1lo(iI0000O, bArr);
/* 20 */            return bArr;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof i1lIIl01O)) {
/* 34 */                return false;
                    }
/* 9 */             i1lIIl01O i1liil01o = (i1lIIl01O) obj;
/* 11 */            int iI0000O = I0000O();
/* 19 */            if (iI0000O != i1liil01o.I0000O()) {
/* 34 */                return false;
                    }
/* 22 */            if (iI0000O == 0) {
/* 41 */                return true;
                    }
/* 24 */            int i = this.I00iOIl;
/* 26 */            int i2 = i1liil01o.I00iOIl;
/* 28 */            if (i == 0 || i2 == 0 || i == i2) {
/* 36 */                return I000OiO(i1liil01o);
                    }
/* 34 */            return false;
                }

                public final int hashCode() {
/* 1 */             int iI000iOII = this.I00iOIl;
/* 3 */             if (iI000iOII == 0) {
/* 5 */                 int iI0000O = I0000O();
/* 9 */                 iI000iOII = I000iOII(iI0000O, iI0000O);
/* 13 */                if (iI000iOII == 0) {
/* 15 */                    iI000iOII = 1;
                        }
/* 16 */                this.I00iOIl = iI000iOII;
                    }
/* 20 */            return iI000iOII;
                }

                @Override
                public final Iterator iterator() {
/* 5 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(8);
/* 8 */             iIO11lll1OOi.I00iio = this;
/* 11 */            iIO11lll1OOi.I00iiI = 0;
/* 17 */            iIO11lll1OOi.I00iiO = I0000O();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 65 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(I0000O(), "<ByteString@", hexString, " size=", " contents=\""), I0000O() <= 50 ? liiIOIio1ll.I00000oIO(I000oI1ioi()) : liiIOIio1ll.I00000oIO(I0000oI00(0, 47).I000oI1ioi()).concat("..."), "\">");
                }
            }
