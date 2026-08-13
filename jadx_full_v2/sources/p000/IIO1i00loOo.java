            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class IIO1i00loOo implements Iterable, Serializable {
                public static final IIO1lIii I00iiI = new IIO1lIii(Iool1iioooil.I00000oIO);
                public static final IIO1Oili I00iiO;
                public int I00iOIl = 0;

                static {
/* 14 */            int i = 9;
/* 29 */            I00iiO = I0lI0Ooo.I00000oIO() ? new l1I0oI(i) : new iOl0lOIi11(i);
                }

                public static int I00000oOI(int i, int i2, int i3) {
/* 1 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 215 */               return i4;
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

                public static IIO1lIii I0000O(byte[] bArr, int i, int i2) {
/* 1 */             if (i2 == 0) {
/* 3 */                 return I00iiI;
                    }
/* 9 */             I00000oOI(i, i + i2, bArr.length);
/* 20 */            return new IIO1lIii(I00iiO.I00000oIO(bArr, i, i2));
                }

                public static boolean I000iOII(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             int i4 = i + i3;
/* 4 */             I00000oOI(i, i4, bArr.length);
/* 9 */             I00000oOI(i2, i3 + i2, bArr2.length);
/* 12 */            while (i < i4) {
/* 18 */                if (bArr[i] != bArr2[i2]) {
/* 20 */                    return false;
                        }
/* 22 */                i++;
/* 24 */                i2++;
                    }
/* 27 */            return true;
                }

                public abstract void I0000oI00(int i, byte[] bArr);

                public abstract boolean I0001Ioi1lo(IIO1i00loOo iIO1i00loOo);

                public abstract byte I000OOo1O(int i);

                public abstract int I000OiO(int i, int i2);

                public abstract IIO1i00loOo I000lI(int i, int i2);

                public abstract void I000o00OoI0I(IOOOiI0 iOOOiI0);

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 24 */                return true;
                    }
/* 6 */             if (!(obj instanceof IIO1i00loOo)) {
/* 36 */                return false;
                    }
/* 9 */             IIO1i00loOo iIO1i00loOo = (IIO1i00loOo) obj;
/* 11 */            int size = size();
/* 19 */            if (size != iIO1i00loOo.size()) {
/* 36 */                return false;
                    }
/* 22 */            if (size == 0) {
/* 24 */                return true;
                    }
/* 26 */            int i = this.I00iOIl;
/* 28 */            int i2 = iIO1i00loOo.I00iOIl;
/* 30 */            if (i == 0 || i2 == 0 || i == i2) {
/* 38 */                return I0001Ioi1lo(iIO1i00loOo);
                    }
/* 36 */            return false;
                }

                public final int hashCode() {
/* 1 */             int iI000OiO = this.I00iOIl;
/* 3 */             if (iI000OiO == 0) {
/* 5 */                 int size = size();
/* 9 */                 iI000OiO = I000OiO(size, size);
/* 13 */                if (iI000OiO == 0) {
/* 15 */                    iI000OiO = 1;
                        }
/* 16 */                this.I00iOIl = iI000OiO;
                    }
/* 29 */            return iI000OiO;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(1);
/* 7 */             iIO11lll1OOi.I00iio = this;
/* 10 */            iIO11lll1OOi.I00iiI = 0;
/* 16 */            iIO11lll1OOi.I00iiO = size();
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return iIO11lll1OOi;
                }

                public abstract int size();

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 57 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? lOlO0Ii1o0O.I00000oIO(this) : lOlO0Ii1o0O.I00000oIO(I000lI(0, 47)).concat("..."), "\">");
                }
            }
