            package p000;

            import android.content.Context;
            import android.security.keystore.KeyGenParameterSpec;
            import android.security.keystore.KeyInfo;
            import android.util.Base64;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.Key;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.security.UnrecoverableKeyException;
            import java.security.cert.CertificateException;
            import java.util.concurrent.Executor;
            import javax.crypto.Cipher;
            import javax.crypto.KeyGenerator;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.SecretKey;
            import javax.crypto.SecretKeyFactory;
            import javax.crypto.spec.GCMParameterSpec;
            import kotlin.jvm.functions.Function1;
            
            public abstract class II0Oi0iIol0i {
                public static final OlO0OIIl1 I00000oIO;
                public static final OOli1O I00000oOI;

                static {
/* 3 */             OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(Boolean.FALSE);
/* 7 */             I00000oIO = olO0OIIl1I00000oIO;
/* 13 */            I00000oOI = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                public static SecretKey I00000oIO(boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
/* 40 */            KeyGenParameterSpec.Builder invalidatedByBiometricEnrollment = new KeyGenParameterSpec.Builder("box_db_enc_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(Barcode.FORMAT_QR_CODE).setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true);
/* 44 */            if (z) {
/* 46 */                invalidatedByBiometricEnrollment.setIsStrongBoxBacked(true);
                    }
/* 49 */            KeyGenParameterSpec keyGenParameterSpecBuild = invalidatedByBiometricEnrollment.build();
/* 57 */            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
/* 61 */            keyGenerator.init(keyGenParameterSpecBuild);
/* 64 */            return keyGenerator.generateKey();
                }

                public static byte[] I00000oOI(Context context, Cipher cipher) {
/* 11 */            String string = context.getSharedPreferences("box_db_enc", 0).getString("enc_passphrase", null);
/* 15 */            if (string != null) {
/* 22 */                return cipher.doFinal(Base64.decode(string, 2));
                    }
/* 29 */            I000II.I001IO000("No encrypted passphrase stored");
/* 10 */            return null;
                }

                public static Cipher I0000Il00O(Context context) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
/* 11 */            String string = context.getSharedPreferences("box_db_enc", 0).getString("iv", null);
/* 15 */            if (string == null) {
/* 58 */                I000II.I001IO000("No IV stored");
/* 10 */                return null;
                    }
/* 18 */            byte[] bArrDecode = Base64.decode(string, 2);
/* 24 */            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 28 */            keyStore.load(null);
/* 37 */            SecretKey secretKey = (SecretKey) keyStore.getKey("box_db_enc_key", null);
/* 41 */            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
/* 52 */            cipher.init(2, secretKey, new GCMParameterSpec(Barcode.FORMAT_ITF, bArrDecode));
/* 55 */            return cipher;
                }

                public static String I0000O() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
                    try {
/* 3 */                 KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 8 */                 keyStore.load(null);
/* 13 */                Key key = keyStore.getKey("box_db_enc_key", null);
/* 22 */                SecretKey secretKey = key instanceof SecretKey ? (SecretKey) key : null;
/* 24 */                if (secretKey == null) {
/* 26 */                    return "None";
                        }
/* 45 */                int securityLevel = ((KeyInfo) SecretKeyFactory.getInstance(secretKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(secretKey, KeyInfo.class)).getSecurityLevel();
                        return securityLevel != 1 ? securityLevel != 2 ? "Software" : "StrongBox" : "TEE";
                    } catch (Exception unused) {
/* 64 */                return "Unknown";
                    }
                }

                public static void I0000oI00(Ill0oOi0 ill0oOi0, Context context, Function1 function1, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2) {
                    try {
/* 7 */                 I1ii1o0 i1ii1o0 = new I1ii1o0(I0000Il00O(context));
/* 13 */                II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(0);
/* 16 */                iI0O1i0I1.I00iiI = function1;
/* 18 */                VarHandle.storeStoreFence();
/* 26 */                I0001Ioi1lo(ill0oOi0, "Authenticate to decrypt your chats", i1ii1o0, iI0O1i0I1, illiIl1l11O, illiIl1l11O2);
                    } catch (Exception e) {
/* 56 */                illiIl1l11O2.invoke(-1, "Failed to prepare decryption: " + e.getMessage());
                    }
                }

                public static void I0001Ioi1lo(Ill0oOi0 ill0oOi0, String str, I1ii1o0 i1ii1o0, Function1 function1, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2) {
/* 1 */             Executor mainExecutor = ill0oOi0.getMainExecutor();
/* 7 */             II0O1i0IIll iI0O1i0IIll = new II0O1i0IIll();
/* 10 */            iI0O1i0IIll.I00000oIO = function1;
/* 12 */            iI0O1i0IIll.I00000oOI = illiIl1l11O;
/* 14 */            iI0O1i0IIll.I0000Il00O = illiIl1l11O2;
/* 16 */            VarHandle.storeStoreFence();
/* 21 */            II0ilOIlloOl iI0ilOIlloOl = new II0ilOIlloOl();
/* 26 */            iI0ilOIlloOl.I00000oIO = "Box";
/* 28 */            iI0ilOIlloOl.I00000oOI = str;
/* 32 */            iI0ilOIlloOl.I0000Il00O = "Cancel";
/* 36 */            iI0ilOIlloOl.I0000O = 15;
/* 38 */            II0ilOIlloOl iI0ilOIlloOlI00000oIO = iI0ilOIlloOl.I00000oIO();
/* 44 */            II0ill iI0ill = new II0ill(ill0oOi0, mainExecutor, iI0O1i0IIll);
/* 54 */            if ((iOOOoio.I00000oIO(iI0ilOIlloOlI00000oIO, i1ii1o0) & 255) != 255) {
/* 56 */                iI0ill.I00000oIO(iI0ilOIlloOlI00000oIO, i1ii1o0);
                    } else {
/* 62 */                I000II.I000iOII("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                    }
                }
            }
