            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Locale;
            
            public abstract class ii01lO0l11ii implements Iterable, Serializable {
                public static final ii01iiOoo I00iiI = new ii01iiOoo(ii0i1ll10I0.I00000oOI);
                public int I00iOIl = 0;

                static {
/* 10 */            int i = ii010oO01I.I00000oIO;
                }

                public static ii01lO0l11ii I0000oI00(Iterator it, int i) {
/* 2 */             if (i <= 0) {
/* 321 */               I000II.I000iOII(IIlIOloOOO.I00100l0("length (", i, ") must be >= 1"));
/* 1 */                 return null;
                    }
/* 5 */             if (i == 1) {
/* 11 */                return (ii01lO0l11ii) it.next();
                    }
/* 14 */            int i2 = i >>> 1;
/* 16 */            ii01lO0l11ii ii01lo0l11iiI0000oI00 = I0000oI00(it, i2);
/* 21 */            ii01lO0l11ii ii01lo0l11iiI0000oI002 = I0000oI00(it, i - i2);
/* 37 */            if (Integer.MAX_VALUE - ii01lo0l11iiI0000oI00.I0001Ioi1lo() < ii01lo0l11iiI0000oI002.I0001Ioi1lo()) {
/* 309 */               I000II.I000iOII(IIl001iO0Io.I000l1(ii01lo0l11iiI0000oI00.I0001Ioi1lo(), ii01lo0l11iiI0000oI002.I0001Ioi1lo(), "ByteString would be too long: ", "+"));
/* 1 */                 return null;
                    }
/* 43 */            if (ii01lo0l11iiI0000oI002.I0001Ioi1lo() == 0) {
/* 45 */                return ii01lo0l11iiI0000oI00;
                    }
/* 50 */            if (ii01lo0l11iiI0000oI00.I0001Ioi1lo() == 0) {
/* 52 */                return ii01lo0l11iiI0000oI002;
                    }
/* 61 */            int iI0001Ioi1lo = ii01lo0l11iiI0000oI002.I0001Ioi1lo() + ii01lo0l11iiI0000oI00.I0001Ioi1lo();
/* 65 */            if (iI0001Ioi1lo < 128) {
/* 67 */                int iI0001Ioi1lo2 = ii01lo0l11iiI0000oI00.I0001Ioi1lo();
/* 71 */                int iI0001Ioi1lo3 = ii01lo0l11iiI0000oI002.I0001Ioi1lo();
/* 75 */                int i3 = iI0001Ioi1lo2 + iI0001Ioi1lo3;
/* 77 */                byte[] bArr = new byte[i3];
/* 83 */                I00100o1O0lo(0, iI0001Ioi1lo2, ii01lo0l11iiI0000oI00.I0001Ioi1lo());
/* 86 */                I00100o1O0lo(0, iI0001Ioi1lo2, i3);
/* 89 */                if (iI0001Ioi1lo2 > 0) {
/* 91 */                    ii01lo0l11iiI0000oI00.I000OOo1O(0, bArr, 0, iI0001Ioi1lo2);
                        }
/* 98 */                I00100o1O0lo(0, iI0001Ioi1lo3, ii01lo0l11iiI0000oI002.I0001Ioi1lo());
/* 101 */               I00100o1O0lo(iI0001Ioi1lo2, i3, i3);
/* 104 */               if (iI0001Ioi1lo3 > 0) {
/* 106 */                   ii01lo0l11iiI0000oI002.I000OOo1O(0, bArr, iI0001Ioi1lo2, iI0001Ioi1lo3);
                        }
/* 111 */               return new ii01iiOoo(bArr);
                    }
/* 117 */           if (ii01lo0l11iiI0000oI00 instanceof ii0oOlo) {
/* 120 */               ii0oOlo ii0oolo = (ii0oOlo) ii01lo0l11iiI0000oI00;
/* 122 */               ii01lO0l11ii ii01lo0l11ii = ii0oolo.I00iio;
/* 124 */               ii01lO0l11ii ii01lo0l11ii2 = ii0oolo.I00ilI0I1;
/* 135 */               if (ii01lo0l11iiI0000oI002.I0001Ioi1lo() + ii01lo0l11ii2.I0001Ioi1lo() < 128) {
/* 137 */                   int iI0001Ioi1lo4 = ii01lo0l11ii2.I0001Ioi1lo();
/* 141 */                   int iI0001Ioi1lo5 = ii01lo0l11iiI0000oI002.I0001Ioi1lo();
/* 145 */                   int i4 = iI0001Ioi1lo4 + iI0001Ioi1lo5;
/* 147 */                   byte[] bArr2 = new byte[i4];
/* 153 */                   I00100o1O0lo(0, iI0001Ioi1lo4, ii01lo0l11ii2.I0001Ioi1lo());
/* 156 */                   I00100o1O0lo(0, iI0001Ioi1lo4, i4);
/* 159 */                   if (iI0001Ioi1lo4 > 0) {
/* 161 */                       ii01lo0l11ii2.I000OOo1O(0, bArr2, 0, iI0001Ioi1lo4);
                            }
/* 168 */                   I00100o1O0lo(0, iI0001Ioi1lo5, ii01lo0l11iiI0000oI002.I0001Ioi1lo());
/* 171 */                   I00100o1O0lo(iI0001Ioi1lo4, i4, i4);
/* 174 */                   if (iI0001Ioi1lo5 > 0) {
/* 176 */                       ii01lo0l11iiI0000oI002.I000OOo1O(0, bArr2, iI0001Ioi1lo4, iI0001Ioi1lo5);
                            }
/* 186 */                   return new ii0oOlo(ii01lo0l11ii, new ii01iiOoo(bArr2));
                        }
/* 198 */               if (ii01lo0l11ii.I000OiO() > ii01lo0l11ii2.I000OiO() && ii0oolo.I00io1l > ii01lo0l11iiI0000oI002.I000OiO()) {
/* 216 */                   return new ii0oOlo(ii01lo0l11ii, new ii0oOlo(ii01lo0l11ii2, ii01lo0l11iiI0000oI002));
                        }
                    }
/* 237 */           if (iI0001Ioi1lo >= ii0oOlo.I001IO000(Math.max(ii01lo0l11iiI0000oI00.I000OiO(), ii01lo0l11iiI0000oI002.I000OiO()) + 1)) {
/* 241 */               return new ii0oOlo(ii01lo0l11iiI0000oI00, ii01lo0l11iiI0000oI002);
                    }
/* 248 */           i1Il01 i1il01 = new i1Il01(3);
/* 253 */           ArrayDeque arrayDeque = new ArrayDeque();
/* 256 */           i1il01.I00iiI = arrayDeque;
/* 258 */           VarHandle.storeStoreFence();
/* 261 */           i1il01.I0000Il00O(ii01lo0l11iiI0000oI00);
/* 264 */           i1il01.I0000Il00O(ii01lo0l11iiI0000oI002);
/* 271 */           ii01lO0l11ii ii0oolo2 = (ii01lO0l11ii) arrayDeque.pop();
/* 277 */           while (!arrayDeque.isEmpty()) {
/* 287 */               ii0oolo2 = new ii0oOlo((ii01lO0l11ii) arrayDeque.pop(), ii0oolo2);
                    }
/* 292 */           return ii0oolo2;
                }

                public static int I00100o1O0lo(int i, int i2, int i3) {
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

                public static ii01iiOoo I0010o(byte[] bArr, int i, int i2) {
/* 4 */             I00100o1O0lo(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new ii01iiOoo(bArr2);
                }

                public static ii01lO0l11ii I00111O(InputStream inputStream) throws IOException {
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
/* 30 */                ii01iiOoo ii01iioooI0010o = i == 0 ? null : I0010o(bArr, 0, i);
/* 34 */                if (ii01iioooI0010o == null) {
                            break;
                        }
/* 54 */                arrayList.add(ii01iioooI0010o);
/* 60 */                iMin = Math.min(iMin + iMin, 8192);
                    }
/* 36 */            int size = arrayList.size();
                    return size == 0 ? I00iiI : I0000oI00(arrayList.iterator(), size);
                }

                public static void I001IIilI0O(int i, int i2) {
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

                public abstract ii01lO0l11ii I000o00OoI0I(int i, int i2);

                public abstract void I000oI1ioi(ii0I1Il ii0i1il);

                @Override
                public OoiOOoOlo iterator() {
/* 4 */             ii011lioo ii011liooVar = new ii011lioo(6);
/* 7 */             ii011liooVar.I00iio = this;
/* 10 */            ii011liooVar.I00iiI = 0;
/* 16 */            ii011liooVar.I00iiO = I0001Ioi1lo();
/* 18 */            VarHandle.storeStoreFence();
/* 55 */            return ii011liooVar;
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
/* 57 */            return IIl001iO0Io.I00100l0(IIlIOloOOO.I00111O(I0001Ioi1lo(), "<ByteString@", hexString, " size=", " contents=\""), I0001Ioi1lo() <= 50 ? lilI1iI00I0.I00000oIO(this) : lilI1iI00I0.I00000oIO(I000o00OoI0I(0, 47)).concat("..."), "\">");
                }
            }
