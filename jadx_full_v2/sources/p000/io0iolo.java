            package p000;

            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            
            public abstract class io0iolo {
                public static IOException I00000oIO(Closeable closeable, String str, IOException iOException) throws IOException {
                    try {
/* 1 */                 closeable.close();
/* 4 */                 return iOException;
                    } catch (IOException e) {
/* 14 */                Log.w("PdfBox-Android", "Error closing ".concat(str), e);
                        return iOException == null ? e : iOException;
                    }
                }

                public static void I00000oOI(Closeable closeable) throws IOException {
/* 1 */             if (closeable != null) {
                        try {
/* 3 */                     closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                public static void I0000Il00O(InputStream inputStream, OutputStream outputStream) throws IOException {
/* 3 */             byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
                    while (true) {
/* 5 */                 int i = inputStream.read(bArr);
/* 10 */                if (-1 == i) {
/* 89 */                    return;
                        } else {
/* 13 */                    outputStream.write(bArr, 0, i);
                        }
                    }
                }
            }
