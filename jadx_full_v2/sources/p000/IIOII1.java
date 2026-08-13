            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.OutputStream;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Stack;
            
            public abstract class IIOII1 implements Iterable {
                public static final O1101ooIo0l I00iOIl = new O1101ooIo0l(new byte[0]);

                public static IIOII1 I00000oOI(Iterator it, int i) {
/* 2 */             if (i == 1) {
/* 8 */                 return (IIOII1) it.next();
                    }
/* 11 */            int i2 = i >>> 1;
/* 22 */            return I00000oOI(it, i2).I0000O(I00000oOI(it, i - i2));
                }

                public static IIOI0o10 I000lI() {
/* 3 */             IIOI0o10 iIOI0o10 = new IIOI0o10();
/* 8 */             iIOI0o10.I00iOIl = Barcode.FORMAT_ITF;
/* 15 */            iIOI0o10.I00iiI = new ArrayList();
/* 19 */            iIOI0o10.I00iio = new byte[Barcode.FORMAT_ITF];
/* 21 */            VarHandle.storeStoreFence();
/* 29 */            return iIOI0o10;
                }

                public final IIOII1 I0000O(IIOII1 iioii1) {
/* 1 */             int size = size();
/* 5 */             int size2 = iioii1.size();
/* 17 */            if (size + size2 >= 2147483647L) {
/* 244 */               StringBuilder sb = new StringBuilder(53);
/* 249 */               sb.append("ByteString would be too long: ");
/* 252 */               sb.append(size);
/* 257 */               sb.append("+");
/* 260 */               sb.append(size2);
/* 966 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 19 */            int[] iArr = OiI01lII01oI.I00ioIO;
/* 29 */            OiI01lII01oI oiI01lII01oI = this instanceof OiI01lII01oI ? (OiI01lII01oI) this : null;
/* 34 */            if (iioii1.size() == 0) {
/* 36 */                return this;
                    }
/* 41 */            if (size() == 0) {
/* 43 */                return iioii1;
                    }
/* 52 */            int size3 = iioii1.size() + size();
/* 56 */            if (size3 < 128) {
/* 58 */                int size4 = size();
/* 62 */                int size5 = iioii1.size();
/* 68 */                byte[] bArr = new byte[size4 + size5];
/* 70 */                I0000oI00(0, bArr, 0, size4);
/* 73 */                iioii1.I0000oI00(0, bArr, size4, size5);
/* 78 */                return new O1101ooIo0l(bArr);
                    }
/* 82 */            if (oiI01lII01oI != null) {
/* 84 */                IIOII1 iioii12 = oiI01lII01oI.I00iio;
/* 95 */                if (iioii1.size() + iioii12.size() < 128) {
/* 97 */                    int size6 = iioii12.size();
/* 101 */                   int size7 = iioii1.size();
/* 107 */                   byte[] bArr2 = new byte[size6 + size7];
/* 109 */                   iioii12.I0000oI00(0, bArr2, 0, size6);
/* 112 */                   iioii1.I0000oI00(0, bArr2, size6, size7);
/* 124 */                   return new OiI01lII01oI(oiI01lII01oI.I00iiO, new O1101ooIo0l(bArr2));
                        }
                    }
/* 128 */           if (oiI01lII01oI != null) {
/* 130 */               IIOII1 iioii13 = oiI01lII01oI.I00iio;
/* 132 */               IIOII1 iioii14 = oiI01lII01oI.I00iiO;
/* 142 */               if (iioii14.I000OOo1O() > iioii13.I000OOo1O() && oiI01lII01oI.I00ilO0 > iioii1.I000OOo1O()) {
/* 159 */                   return new OiI01lII01oI(iioii14, new OiI01lII01oI(iioii13, iioii1));
                        }
                    }
/* 181 */           if (size3 >= OiI01lII01oI.I00ioIO[Math.max(I000OOo1O(), iioii1.I000OOo1O()) + 1]) {
/* 185 */               return new OiI01lII01oI(this, iioii1);
                    }
/* 193 */           I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(21);
/* 198 */           Stack stack = new Stack();
/* 201 */           i0IIiO0iI.I00iiI = stack;
/* 203 */           VarHandle.storeStoreFence();
/* 206 */           i0IIiO0iI.I000iOII(this);
/* 209 */           i0IIiO0iI.I000iOII(iioii1);
/* 216 */           IIOII1 oiI01lII01oI2 = (IIOII1) stack.pop();
/* 222 */           while (!stack.isEmpty()) {
/* 232 */               oiI01lII01oI2 = new OiI01lII01oI((IIOII1) stack.pop(), oiI01lII01oI2);
                    }
/* 237 */           return oiI01lII01oI2;
                }

                public final void I0000oI00(int i, byte[] bArr, int i2, int i3) {
/* 3 */             if (i < 0) {
/* 58 */                I000II.I000OOo1O("Source offset < 0: ", 30, i);
/* 483 */               return;
                    }
/* 5 */             if (i2 < 0) {
/* 52 */                I000II.I000OOo1O("Target offset < 0: ", 30, i2);
/* 55 */                return;
                    }
/* 7 */             if (i3 < 0) {
/* 46 */                I000II.I000OOo1O("Length < 0: ", 23, i3);
/* 49 */                return;
                    }
/* 9 */             int i4 = i + i3;
/* 17 */            if (i4 > size()) {
/* 38 */                I000II.I000OOo1O("Source end offset < 0: ", 34, i4);
/* 41 */                return;
                    }
/* 19 */            int i5 = i2 + i3;
/* 22 */            if (i5 > bArr.length) {
/* 32 */                I000II.I000OOo1O("Target end offset < 0: ", 34, i5);
                    } else if (i3 > 0) {
/* 26 */                I0001Ioi1lo(i, bArr, i2, i3);
                    }
                }

                public abstract void I0001Ioi1lo(int i, byte[] bArr, int i2, int i3);

                public abstract int I000OOo1O();

                public abstract boolean I000OiO();

                public abstract boolean I000iOII();

                public abstract int I000o00OoI0I(int i, int i2, int i3);

                public abstract int I000oI1ioi(int i, int i2, int i3);

                public abstract int I00100o1O0lo();

                public abstract String I0010I0i();

                public final String I0010o() {
                    try {
/* 1 */                 return I0010I0i();
                    } catch (UnsupportedEncodingException e) {
/* 9 */                 OIiilo1Ool0o.I000iOII("UTF-8 not supported?", e);
/* 12 */                return null;
                    }
                }

                public abstract void I00111O(OutputStream outputStream, int i, int i2);

                public abstract int size();

                public final String toString() {
/* 23 */            return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
                }
            }
