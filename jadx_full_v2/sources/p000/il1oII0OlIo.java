            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class il1oII0OlIo implements Iterable, Serializable {
                public static final il1lilI1Ol I00iiI = new il1lilI1Ol(iloi1OI100li.I00000oOI);
                public int I00iOIl = 0;

                static {
/* 10 */            int i = il0OiiIoo.I00000oIO;
                }

                public static il1oII0OlIo I0000oI00(Iterator it, int i) {
/* 2 */             if (i <= 0) {
/* 321 */               I000II.I000iOII(IIlIOloOOO.I00100l0("length (", i, ") must be >= 1"));
/* 1 */                 return null;
                    }
/* 5 */             if (i == 1) {
/* 11 */                return (il1oII0OlIo) it.next();
                    }
/* 14 */            int i2 = i >>> 1;
/* 16 */            il1oII0OlIo il1oii0olioI0000oI00 = I0000oI00(it, i2);
/* 21 */            il1oII0OlIo il1oii0olioI0000oI002 = I0000oI00(it, i - i2);
/* 37 */            if (Integer.MAX_VALUE - il1oii0olioI0000oI00.I0001Ioi1lo() < il1oii0olioI0000oI002.I0001Ioi1lo()) {
/* 309 */               I000II.I000iOII(IIl001iO0Io.I000l1(il1oii0olioI0000oI00.I0001Ioi1lo(), il1oii0olioI0000oI002.I0001Ioi1lo(), "ByteString would be too long: ", "+"));
/* 1 */                 return null;
                    }
/* 43 */            if (il1oii0olioI0000oI002.I0001Ioi1lo() == 0) {
/* 45 */                return il1oii0olioI0000oI00;
                    }
/* 50 */            if (il1oii0olioI0000oI00.I0001Ioi1lo() == 0) {
/* 52 */                return il1oii0olioI0000oI002;
                    }
/* 61 */            int iI0001Ioi1lo = il1oii0olioI0000oI002.I0001Ioi1lo() + il1oii0olioI0000oI00.I0001Ioi1lo();
/* 65 */            if (iI0001Ioi1lo < 128) {
/* 67 */                int iI0001Ioi1lo2 = il1oii0olioI0000oI00.I0001Ioi1lo();
/* 71 */                int iI0001Ioi1lo3 = il1oii0olioI0000oI002.I0001Ioi1lo();
/* 75 */                int i3 = iI0001Ioi1lo2 + iI0001Ioi1lo3;
/* 77 */                byte[] bArr = new byte[i3];
/* 83 */                I00111O(0, iI0001Ioi1lo2, il1oii0olioI0000oI00.I0001Ioi1lo());
/* 86 */                I00111O(0, iI0001Ioi1lo2, i3);
/* 89 */                if (iI0001Ioi1lo2 > 0) {
/* 91 */                    il1oii0olioI0000oI00.I000OOo1O(0, bArr, 0, iI0001Ioi1lo2);
                        }
/* 98 */                I00111O(0, iI0001Ioi1lo3, il1oii0olioI0000oI002.I0001Ioi1lo());
/* 101 */               I00111O(iI0001Ioi1lo2, i3, i3);
/* 104 */               if (iI0001Ioi1lo3 > 0) {
/* 106 */                   il1oii0olioI0000oI002.I000OOo1O(0, bArr, iI0001Ioi1lo2, iI0001Ioi1lo3);
                        }
/* 111 */               return new il1lilI1Ol(bArr);
                    }
/* 117 */           if (il1oii0olioI0000oI00 instanceof ioo11I) {
/* 120 */               ioo11I ioo11i = (ioo11I) il1oii0olioI0000oI00;
/* 122 */               il1oII0OlIo il1oii0olio = ioo11i.I00iio;
/* 124 */               il1oII0OlIo il1oii0olio2 = ioo11i.I00ilI0I1;
/* 135 */               if (il1oii0olioI0000oI002.I0001Ioi1lo() + il1oii0olio2.I0001Ioi1lo() < 128) {
/* 137 */                   int iI0001Ioi1lo4 = il1oii0olio2.I0001Ioi1lo();
/* 141 */                   int iI0001Ioi1lo5 = il1oii0olioI0000oI002.I0001Ioi1lo();
/* 145 */                   int i4 = iI0001Ioi1lo4 + iI0001Ioi1lo5;
/* 147 */                   byte[] bArr2 = new byte[i4];
/* 153 */                   I00111O(0, iI0001Ioi1lo4, il1oii0olio2.I0001Ioi1lo());
/* 156 */                   I00111O(0, iI0001Ioi1lo4, i4);
/* 159 */                   if (iI0001Ioi1lo4 > 0) {
/* 161 */                       il1oii0olio2.I000OOo1O(0, bArr2, 0, iI0001Ioi1lo4);
                            }
/* 168 */                   I00111O(0, iI0001Ioi1lo5, il1oii0olioI0000oI002.I0001Ioi1lo());
/* 171 */                   I00111O(iI0001Ioi1lo4, i4, i4);
/* 174 */                   if (iI0001Ioi1lo5 > 0) {
/* 176 */                       il1oii0olioI0000oI002.I000OOo1O(0, bArr2, iI0001Ioi1lo4, iI0001Ioi1lo5);
                            }
/* 186 */                   return new ioo11I(il1oii0olio, new il1lilI1Ol(bArr2));
                        }
/* 198 */               if (il1oii0olio.I000OiO() > il1oii0olio2.I000OiO() && ioo11i.I00io1l > il1oii0olioI0000oI002.I000OiO()) {
/* 216 */                   return new ioo11I(il1oii0olio, new ioo11I(il1oii0olio2, il1oii0olioI0000oI002));
                        }
                    }
/* 237 */           if (iI0001Ioi1lo >= ioo11I.I001lIiIIo1O(Math.max(il1oii0olioI0000oI00.I000OiO(), il1oii0olioI0000oI002.I000OiO()) + 1)) {
/* 241 */               return new ioo11I(il1oii0olioI0000oI00, il1oii0olioI0000oI002);
                    }
/* 248 */           i11I1Ili i11i1ili = new i11I1Ili(6);
/* 253 */           ArrayDeque arrayDeque = new ArrayDeque();
/* 256 */           i11i1ili.I00iiI = arrayDeque;
/* 258 */           VarHandle.storeStoreFence();
/* 261 */           i11i1ili.I0000oI00(il1oii0olioI0000oI00);
/* 264 */           i11i1ili.I0000oI00(il1oii0olioI0000oI002);
/* 271 */           il1oII0OlIo ioo11i2 = (il1oII0OlIo) arrayDeque.pop();
/* 277 */           while (!arrayDeque.isEmpty()) {
/* 287 */               ioo11i2 = new ioo11I((il1oII0OlIo) arrayDeque.pop(), ioo11i2);
                    }
/* 292 */           return ioo11i2;
                }

                public static int I00111O(int i, int i2, int i3) {
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

                public static il1lilI1Ol I001IO000(byte[] bArr, int i, int i2) {
/* 4 */             I00111O(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new il1lilI1Ol(bArr2);
                }

                public static il1oII0OlIo I001i1O0Ol(InputStream inputStream) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int iMin = Barcode.FORMAT_QR_CODE;
                    while (true) {
/* 8 */                 byte[] bArr = new byte[iMin];
/* 11 */                int i = 0;
/* 12 */                while (i < iMin) {
/* 16 */                    int i2 = inputStream.read(bArr, i, iMin - i);
/* 21 */                    if (i2 == -1) {
                                break;
                            }
/* 24 */                    i += i2;
                        }
/* 30 */                il1lilI1Ol il1lili1olI001IO000 = i == 0 ? null : I001IO000(bArr, 0, i);
/* 34 */                if (il1lili1olI001IO000 == null) {
                            break;
                        }
/* 54 */                arrayList.add(il1lili1olI001IO000);
/* 60 */                iMin = Math.min(iMin + iMin, 8192);
                    }
/* 36 */            int size = arrayList.size();
                    return size == 0 ? I00iiI : I0000oI00(arrayList.iterator(), size);
                }

                public static void I001iOo1i0O(int i, int i2) {
/* 6 */             if (((i2 - (i + 1)) | i) < 0) {
/* 8 */                 if (i < 0) {
/* 16 */                    OoOil11Ol1o.I0010I0i(Oi010OO0.I000oI1ioi(i, "Index < 0: "));
                        } else {
/* 28 */                    OoOil11Ol1o.I0010I0i(IIl001iO0Io.I000l1(i, i2, "Index > length: ", ", "));
                        }
                    }
                }

                public abstract byte I00000oOI(int i);

                public abstract byte I0000O(int i);

                public abstract int I0001Ioi1lo();

                public abstract void I000OOo1O(int i, byte[] bArr, int i2, int i3);

                public abstract int I000OiO();

                public abstract boolean I000iOII();

                public abstract int I000lI(int i, int i2, int i3);

                public abstract int I000o00OoI0I(int i, int i2, int i3);

                public abstract il1oII0OlIo I000oI1ioi(int i, int i2);

                public abstract String I00100o1O0lo(Charset charset);

                public abstract void I0010I0i(ilIO10iO ilio10io);

                public abstract boolean I0010o();

                @Override
                public OoiOOoOlo iterator() {
/* 5 */             il100o10o1O il100o10o1o = new il100o10o1O(15);
/* 8 */             il100o10o1o.I00iio = this;
/* 11 */            il100o10o1o.I00iiI = 0;
/* 17 */            il100o10o1o.I00iiO = I0001Ioi1lo();
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return il100o10o1o;
                }

                public final int hashCode() {
/* 1 */             int iI000lI = this.I00iOIl;
/* 3 */             if (iI000lI == 0) {
/* 6 */                 int iI0001Ioi1lo = I0001Ioi1lo();
/* 10 */                iI000lI = I000lI(iI0001Ioi1lo, 0, iI0001Ioi1lo);
/* 14 */                if (iI000lI == 0) {
/* 16 */                    iI000lI = 1;
                        }
/* 17 */                this.I00iOIl = iI000lI;
                    }
/* 20 */            return iI000lI;
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 57 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(I0001Ioi1lo(), "<ByteString@", hexString, " size=", " contents=\""), I0001Ioi1lo() <= 50 ? liooIOIo.I00000oIO(this) : liooIOIo.I00000oIO(I000oI1ioi(0, 47)).concat("..."), "\">");
                }
            }
