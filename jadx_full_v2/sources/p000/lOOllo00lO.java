            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
            public abstract class lOOllo00lO {
                public static byte[] I00000oIO(InputStream inputStream) throws IOException {
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */             byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
                    while (true) {
/* 11 */                int i = inputStream.read(bArr, 0, Barcode.FORMAT_AZTEC);
/* 15 */                if (i < 0) {
/* 21 */                    return byteArrayOutputStream.toByteArray();
                        }
/* 17 */                byteArrayOutputStream.write(bArr, 0, i);
                    }
                }

                public static int I00000oOI(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = 0;
/* 2 */             while (i3 < i2) {
/* 8 */                 int i4 = inputStream.read(bArr, i + i3, i2 - i3);
/* 12 */                if (i4 < 0) {
                            break;
                        }
/* 15 */                i3 += i4;
                    }
/* 483 */           return i3;
                }
            }
