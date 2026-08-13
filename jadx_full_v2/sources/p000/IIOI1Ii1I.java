            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class IIOI1Ii1I implements Iterable, Serializable {
                public static final IIO1i10I I00iiI = new IIO1i10I(Iool1iOO11.I00000oOI);
                public static final IIO1Oi1 I00iiO;
                public int I00iOIl;

                static {
/* 31 */            I00iiO = I0l1oIioiOi0.I00000oIO() ? new iolOOiI(9) : new i1i0olI(9);
                }

                public static int I0000O(int i, int i2, int i3) {
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

                public static IIO1i10I I0000oI00(byte[] bArr, int i, int i2) {
/* 4 */             I0000O(i, i + i2, bArr.length);
/* 15 */            return new IIO1i10I(I00iiO.I00000oIO(bArr, i, i2));
                }

                public abstract byte I00000oOI(int i);

                public abstract void I0001Ioi1lo(int i, byte[] bArr);

                public abstract byte I000OOo1O(int i);

                public final byte[] I000OiO() {
/* 1 */             int size = size();
/* 5 */             if (size == 0) {
/* 7 */                 return Iool1iOO11.I00000oOI;
                    }
/* 10 */            byte[] bArr = new byte[size];
/* 12 */            I0001Ioi1lo(size, bArr);
/* 29 */            return bArr;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 113 */               return i;
                    }
/* 5 */             int size = size();
/* 10 */            IIO1i10I iIO1i10I = (IIO1i10I) this;
/* 12 */            int iI000iOII = iIO1i10I.I000iOII();
/* 16 */            int i2 = size;
/* 20 */            for (int i3 = iI000iOII; i3 < iI000iOII + size; i3++) {
/* 28 */                i2 = (i2 * 31) + iIO1i10I.I00iio[i3];
                    }
/* 32 */            if (i2 == 0) {
/* 34 */                i2 = 1;
                    }
/* 35 */            this.I00iOIl = i2;
/* 37 */            return i2;
                }

                @Override
                public Iterator iterator() {
/* 4 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(0);
/* 7 */             iIO11lll1OOi.I00iio = this;
/* 9 */             iIO11lll1OOi.I00iiI = 0;
/* 15 */            iIO11lll1OOi.I00iiO = size();
/* 17 */            VarHandle.storeStoreFence();
/* 29 */            return iIO11lll1OOi;
                }

                public abstract int size();

                public final String toString() {
                    IIO1i10I iIO1i10I;
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int size = size();
/* 21 */            if (size() <= 50) {
/* 23 */                strConcat = lOlIli.I00000oIO(this);
                    } else {
/* 28 */                IIO1i10I iIO1i10I2 = (IIO1i10I) this;
/* 37 */                int iI0000O = I0000O(0, 47, iIO1i10I2.size());
/* 41 */                if (iI0000O == 0) {
/* 43 */                    iIO1i10I = I00iiI;
                        } else {
/* 48 */                    int iI000iOII = iIO1i10I2.I000iOII();
/* 52 */                    byte[] bArr = iIO1i10I2.I00iio;
/* 54 */                    IIO1I010i iIO1I010i = new IIO1I010i(bArr);
/* 60 */                    I0000O(iI000iOII, iI000iOII + iI0000O, bArr.length);
/* 63 */                    iIO1I010i.I00ilI0I1 = iI000iOII;
/* 65 */                    iIO1I010i.I00ilO0 = iI0000O;
/* 67 */                    VarHandle.storeStoreFence();
/* 70 */                    iIO1i10I = iIO1I010i;
                        }
/* 77 */                strConcat = lOlIli.I00000oIO(iIO1i10I).concat("...");
                    }
/* 93 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
