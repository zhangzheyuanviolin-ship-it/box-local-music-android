            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.util.zip.DataFormatException;
            import java.util.zip.Deflater;
            import java.util.zip.DeflaterOutputStream;
            import java.util.zip.Inflater;
            
            public abstract class ilI1oOi {
                public static byte[] I00000oIO(byte[] bArr) {
/* 4 */             Deflater deflater = new Deflater(1);
/* 9 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 14 */                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                        try {
/* 17 */                    deflaterOutputStream.write(bArr);
/* 20 */                    deflaterOutputStream.close();
/* 23 */                    deflater.end();
/* 26 */                    return byteArrayOutputStream.toByteArray();
                        } finally {
                        }
                    } catch (Throwable th) {
/* 43 */                deflater.end();
/* 77 */                throw th;
                    }
                }

                public static byte[] I00000oOI(InputStream inputStream, int i) throws IOException {
/* 1 */             byte[] bArr = new byte[i];
/* 3 */             int i2 = 0;
/* 4 */             while (i2 < i) {
/* 8 */                 int i3 = inputStream.read(bArr, i2, i - i2);
/* 12 */                if (i3 < 0) {
/* 22 */                    I000II.I001IO000(Oi010OO0.I000oI1ioi(i, "Not enough bytes to read: "));
/* 25 */                    return null;
                        }
/* 14 */                i2 += i3;
                    }
/* 37 */            return bArr;
                }

                public static byte[] I0000Il00O(FileInputStream fileInputStream, int i, int i2) {
/* 3 */             Inflater inflater = new Inflater();
                    try {
/* 6 */                 byte[] bArr = new byte[i2];
/* 10 */                byte[] bArr2 = new byte[Barcode.FORMAT_PDF417];
/* 13 */                int i3 = 0;
/* 14 */                int iInflate = 0;
/* 19 */                while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
/* 29 */                    int i4 = fileInputStream.read(bArr2);
/* 33 */                    if (i4 < 0) {
/* 87 */                        throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                            }
/* 35 */                    inflater.setInput(bArr2, 0, i4);
                            try {
/* 44 */                        iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
/* 45 */                        i3 += i4;
                            } catch (DataFormatException e) {
/* 59 */                        throw new IllegalStateException(e.getMessage());
                            }
                        }
/* 88 */                if (i3 == i) {
/* 94 */                    if (inflater.finished()) {
/* 99 */                        return bArr;
                            }
/* 107 */                   throw new IllegalStateException("Inflater did not finish");
                        }
/* 138 */               throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
                    } finally {
/* 139 */               inflater.end();
                    }
                }

                public static long I0000O(InputStream inputStream, int i) throws IOException {
/* 1 */             byte[] bArrI00000oOI = I00000oOI(inputStream, i);
/* 5 */             long j = 0;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 18 */                j += (bArrI00000oOI[i2] & 255) << (i2 * 8);
                    }
/* 37 */            return j;
                }

                public static void I0000oI00(OutputStream outputStream, long j, int i) throws IOException {
/* 1 */             byte[] bArr = new byte[i];
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
                    }
/* 20 */            outputStream.write(bArr);
                }

                public static void I0001Ioi1lo(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
/* 3 */             I0000oI00(byteArrayOutputStream, i, 2);
                }
            }
