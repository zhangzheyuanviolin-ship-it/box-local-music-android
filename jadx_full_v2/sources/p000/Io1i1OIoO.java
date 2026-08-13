            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            
            public abstract class Io1i1OIoO {
                public static final OlOO1i11110 I00000oIO;

                static {
/* 5 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(15);
/* 15 */            olOO1i11110.I00iiI = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
/* 19 */            byte[] bArr = new byte[Barcode.FORMAT_ITF];
/* 21 */            olOO1i11110.I00iiO = bArr;
/* 23 */            int i = 0;
/* 25 */            for (int i2 = 0; i2 < 128; i2++) {
/* 28 */                bArr[i2] = -1;
                    }
                    while (true) {
/* 35 */                byte[] bArr2 = (byte[]) olOO1i11110.I00iiI;
/* 38 */                if (i >= bArr2.length) {
/* 54 */                    bArr[65] = bArr[97];
/* 62 */                    bArr[66] = bArr[98];
/* 70 */                    bArr[67] = bArr[99];
/* 78 */                    bArr[68] = bArr[100];
/* 86 */                    bArr[69] = bArr[101];
/* 94 */                    bArr[70] = bArr[102];
/* 96 */                    VarHandle.storeStoreFence();
/* 99 */                    I00000oIO = olOO1i11110;
/* 101 */                   return;
                        }
/* 43 */                bArr[bArr2[i]] = (byte) i;
/* 45 */                i++;
                    }
                }

                public static byte[] I00000oIO(int i, byte[] bArr) throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 6 */                 OlOO1i11110 olOO1i11110 = I00000oIO;
/* 8 */                 if (i >= 0) {
/* 13 */                    byte[] bArr2 = new byte[72];
/* 16 */                    int i2 = 0;
/* 17 */                    while (i > 0) {
/* 21 */                        int iMin = Math.min(36, i);
/* 25 */                        int i3 = i2 + iMin;
/* 27 */                        int i4 = 0;
/* 28 */                        while (i2 < i3) {
/* 30 */                            int i5 = i2 + 1;
/* 32 */                            byte b = bArr[i2];
/* 36 */                            int i6 = i4 + 1;
/* 40 */                            byte[] bArr3 = (byte[]) olOO1i11110.I00iiI;
/* 46 */                            bArr2[i4] = bArr3[(b & 255) >>> 4];
/* 48 */                            i4 += 2;
/* 54 */                            bArr2[i6] = bArr3[b & 15];
/* 56 */                            i2 = i5;
                                }
/* 58 */                        byteArrayOutputStream.write(bArr2, 0, i4);
/* 61 */                        i -= iMin;
/* 62 */                        i2 = i3;
                            }
                        }
/* 64 */                return byteArrayOutputStream.toByteArray();
                    } catch (Exception e) {
/* 91 */                I00OI1 i00oi1 = new I00OI1("exception encoding Hex string: " + e.getMessage(), 2);
/* 94 */                i00oi1.I00iiI = e;
/* 551 */               throw i00oi1;
                    }
                }
            }
