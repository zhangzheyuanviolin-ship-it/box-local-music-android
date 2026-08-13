            package p000;

            import android.util.Base64;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class liO111OO1 {
                public static String I00000oIO(List list) throws NoSuchAlgorithmException, IOException {
                    int i;
/* 3 */             MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
/* 9 */             byte[] bArr = new byte[8192];
/* 11 */            Iterator it = list.iterator();
/* 19 */            while (it.hasNext()) {
/* 29 */                FileInputStream fileInputStream = new FileInputStream((File) it.next());
/* 46 */                do {
                            try {
/* 32 */                        i = fileInputStream.read(bArr);
/* 36 */                        if (i > 0) {
/* 39 */                            messageDigest.update(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                try {
/* 52 */                            fileInputStream.close();
                                } catch (Throwable th2) {
/* 57 */                            th.addSuppressed(th2);
                                }
/* 60 */                        throw th;
                            }
/* 46 */                } while (i != -1);
/* 48 */                fileInputStream.close();
                    }
/* 67 */            return Base64.encodeToString(messageDigest.digest(), 11);
                }
            }
