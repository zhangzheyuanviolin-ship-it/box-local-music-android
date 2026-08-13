            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            
            public abstract class iOiOlIoI {
                public static void I00000oIO(InputStream inputStream, OutputStream outputStream) throws IOException {
/* 3 */             byte[] bArr = new byte[8192];
/* 5 */             int i = inputStream.read(bArr);
/* 9 */             while (i >= 0) {
/* 12 */                outputStream.write(bArr, 0, i);
/* 15 */                i = inputStream.read(bArr);
                    }
                }

                public static final byte[] I00000oOI(InputStream inputStream) throws IOException {
/* 13 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
/* 16 */            I00000oIO(inputStream, byteArrayOutputStream);
/* 19 */            return byteArrayOutputStream.toByteArray();
                }
            }
