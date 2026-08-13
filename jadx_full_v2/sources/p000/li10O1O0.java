            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            
            public abstract class li10O1O0 {
                public static String I00000oIO(InputStream inputStream) throws IOException {
/* 1 */             if (inputStream == null) {
/* 41 */                IioIoO10iOiI.I000OOo1O("Input stream must not be null");
/* 44 */                return null;
                    }
/* 10 */            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
/* 15 */            char[] cArr = new char[Barcode.FORMAT_UPC_E];
/* 19 */            StringBuilder sb = new StringBuilder();
                    while (true) {
/* 22 */                int i = bufferedReader.read(cArr);
/* 27 */                if (i == -1) {
/* 34 */                    return sb.toString();
                        }
/* 30 */                sb.append(cArr, 0, i);
                    }
                }
            }
