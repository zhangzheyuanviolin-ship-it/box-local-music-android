            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.Signature;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            
            public abstract class iOO0100o {
                public static byte[] I00000oIO(Context context, String str) throws NoSuchAlgorithmException {
                    MessageDigest messageDigest;
/* 7 */             PackageInfo packageInfoI0000Il00O = i01l1OO001.I00000oIO(context).I0000Il00O(64, str);
/* 11 */            Signature[] signatureArr = packageInfoI0000Il00O.signatures;
/* 14 */            if (signatureArr != null && signatureArr.length == 1) {
/* 23 */                int i = 0;
                        while (true) {
/* 25 */                    if (i >= 2) {
/* 36 */                        messageDigest = null;
                                break;
                            }
                            try {
/* 27 */                        messageDigest = MessageDigest.getInstance("SHA1");
                            } catch (NoSuchAlgorithmException unused) {
                            }
/* 31 */                    if (messageDigest != null) {
                                break;
                            }
/* 33 */                    i++;
                        }
/* 37 */                if (messageDigest != null) {
/* 48 */                    return messageDigest.digest(packageInfoI0000Il00O.signatures[0].toByteArray());
                        }
                    }
/* 13 */            return null;
                }
            }
