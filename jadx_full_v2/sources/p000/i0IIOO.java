            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.os.Build;
            import android.util.Base64;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class i0IIOO {
                public static final OlOilIlol1 I00000oIO = new OlOilIlol1("PhoneskyVerificationUtils");

                public static boolean I00000oIO(Context context) throws NoSuchAlgorithmException {
                    Signature[] signatureArr;
                    String strEncodeToString;
/* 5 */             OlOilIlol1 olOilIlol1 = I00000oIO;
                    try {
                    } catch (PackageManager.NameNotFoundException unused) {
/* 195 */               olOilIlol1.I0000oI00("Play Store package is not found.", new Object[0]);
                    }
/* 18 */            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
/* 24 */                olOilIlol1.I0000oI00("Play Store package is disabled.", new Object[0]);
/* 7 */                 return false;
                    }
                    try {
/* 38 */                signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    } catch (PackageManager.NameNotFoundException unused2) {
/* 189 */               olOilIlol1.I0000oI00("Play Store package is not found.", new Object[0]);
                    }
/* 40 */            if (signatureArr == null || (signatureArr.length) == 0) {
/* 183 */               olOilIlol1.I0000oI00("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
/* 7 */                 return false;
                    }
/* 49 */            ArrayList arrayList = new ArrayList();
/* 53 */            for (Signature signature : signatureArr) {
/* 57 */                byte[] byteArray = signature.toByteArray();
                        try {
/* 63 */                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
/* 67 */                    messageDigest.update(byteArray);
/* 76 */                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused3) {
/* 81 */                    strEncodeToString = "";
                        }
/* 83 */                arrayList.add(strEncodeToString);
/* 92 */                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
/* 123 */                   return true;
                        }
/* 94 */                String str = Build.TAGS;
/* 102 */               if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
/* 123 */                   return true;
                        }
                    }
/* 127 */           StringBuilder sb = new StringBuilder();
/* 130 */           Iterator it = arrayList.iterator();
/* 138 */           if (it.hasNext()) {
                        while (true) {
/* 146 */                   sb.append((CharSequence) it.next());
/* 153 */                   if (!it.hasNext()) {
                                break;
                            }
/* 157 */                   sb.append((CharSequence) ", ");
                        }
                    }
/* 175 */           olOilIlol1.I0000oI00(IlIi0I0.I000lI("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
/* 7 */             return false;
                }
            }
