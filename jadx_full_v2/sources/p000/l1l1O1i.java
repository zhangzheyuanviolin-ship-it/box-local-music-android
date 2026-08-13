            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class l1l1O1i implements Iterable, Serializable {
                public static final l1l0llOlIl I00iiI = new l1l0llOlIl(lIOOlo11OOii.I00000oOI);
                public int I00iOIl;

                static {
/* 10 */            int i = l1IooI.I00000oIO;
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

                public static l1l0llOlIl I000OOo1O(byte[] bArr, int i, int i2) {
/* 4 */             I0001Ioi1lo(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new l1l0llOlIl(bArr2);
                }

                public abstract byte I00000oOI(int i);

                public abstract byte I0000O(int i);

                public abstract int I0000oI00();

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 55 */                return i;
                    }
/* 5 */             int iI0000oI00 = I0000oI00();
/* 10 */            l1l0llOlIl l1l0llolil = (l1l0llOlIl) this;
/* 13 */            int i2 = iI0000oI00;
/* 14 */            for (int i3 = 0; i3 < iI0000oI00; i3++) {
/* 22 */                i2 = (i2 * 31) + l1l0llolil.I00iiO[i3];
                    }
/* 26 */            if (i2 == 0) {
/* 28 */                i2 = 1;
                    }
/* 29 */            this.I00iOIl = i2;
/* 31 */            return i2;
                }

                @Override
                public final Iterator iterator() {
/* 5 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(11);
/* 8 */             iIO11lll1OOi.I00iio = this;
/* 11 */            iIO11lll1OOi.I00iiI = 0;
/* 17 */            iIO11lll1OOi.I00iiO = I0000oI00();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public final String toString() {
                    l1l0llOlIl l1l0llolil;
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iI0000oI00 = I0000oI00();
/* 21 */            if (I0000oI00() <= 50) {
/* 23 */                strConcat = ll0l0O.I00000oIO(this);
                    } else {
/* 28 */                l1l0llOlIl l1l0llolil2 = (l1l0llOlIl) this;
/* 37 */                int iI0001Ioi1lo = I0001Ioi1lo(0, 47, l1l0llolil2.I0000oI00());
/* 41 */                if (iI0001Ioi1lo == 0) {
/* 43 */                    l1l0llolil = I00iiI;
                        } else {
/* 48 */                    byte[] bArr = l1l0llolil2.I00iiO;
/* 50 */                    l1iOi1l l1ioi1l = new l1iOi1l(bArr);
/* 54 */                    I0001Ioi1lo(0, iI0001Ioi1lo, bArr.length);
/* 57 */                    l1ioi1l.I00iio = iI0001Ioi1lo;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    l1l0llolil = l1ioi1l;
                        }
/* 69 */                strConcat = ll0l0O.I00000oIO(l1l0llolil).concat("...");
                    }
/* 85 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(iI0000oI00, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
