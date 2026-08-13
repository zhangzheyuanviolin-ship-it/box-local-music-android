            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class lol1I010 implements Iterable, Serializable {
                public static final lol0io0OoIiI I00iiI = new lol0io0OoIiI(o00oIoII0l1.I00000oOI);
                public int I00iOIl;

                static {
/* 10 */            int i = loi0l1O1OooI.I00000oIO;
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

                public static lol0io0OoIiI I000OOo1O(byte[] bArr, int i, int i2) {
/* 4 */             I0001Ioi1lo(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new lol0io0OoIiI(bArr2);
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
/* 10 */            lol0io0OoIiI lol0io0ooiii = (lol0io0OoIiI) this;
/* 13 */            int i2 = iI0000oI00;
/* 14 */            for (int i3 = 0; i3 < iI0000oI00; i3++) {
/* 22 */                i2 = (i2 * 31) + lol0io0ooiii.I00iiO[i3];
                    }
/* 26 */            if (i2 == 0) {
/* 28 */                i2 = 1;
                    }
/* 29 */            this.I00iOIl = i2;
/* 31 */            return i2;
                }

                @Override
                public final Iterator iterator() {
/* 5 */             IIO11lll1OOi iIO11lll1OOi = new IIO11lll1OOi(12);
/* 8 */             iIO11lll1OOi.I00iio = this;
/* 11 */            iIO11lll1OOi.I00iiI = 0;
/* 17 */            iIO11lll1OOi.I00iiO = I0000oI00();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return iIO11lll1OOi;
                }

                public final String toString() {
                    lol0io0OoIiI lol0io0ooiii;
                    String strConcat;
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iI0000oI00 = I0000oI00();
/* 21 */            if (I0000oI00() <= 50) {
/* 23 */                strConcat = ll1OiOIO0.I00000oIO(this);
                    } else {
/* 28 */                lol0io0OoIiI lol0io0ooiii2 = (lol0io0OoIiI) this;
/* 37 */                int iI0001Ioi1lo = I0001Ioi1lo(0, 47, lol0io0ooiii2.I0000oI00());
/* 41 */                if (iI0001Ioi1lo == 0) {
/* 43 */                    lol0io0ooiii = I00iiI;
                        } else {
/* 48 */                    byte[] bArr = lol0io0ooiii2.I00iiO;
/* 50 */                    loil1O1o0iI loil1o1o0ii = new loil1O1o0iI(bArr);
/* 54 */                    I0001Ioi1lo(0, iI0001Ioi1lo, bArr.length);
/* 57 */                    loil1o1o0ii.I00iio = iI0001Ioi1lo;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    lol0io0ooiii = loil1o1o0ii;
                        }
/* 69 */                strConcat = ll1OiOIO0.I00000oIO(lol0io0ooiii).concat("...");
                    }
/* 85 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(iI0000oI00, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
                }
            }
