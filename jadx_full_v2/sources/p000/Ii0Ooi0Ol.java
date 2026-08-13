            package p000;

            import android.hardware.biometrics.BiometricPrompt;
            import java.security.Signature;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            
            public abstract class Ii0Ooi0Ol {
                public static BiometricPrompt.CryptoObject I00000oIO(Signature signature) {
/* 3 */             return new BiometricPrompt.CryptoObject(signature);
                }

                public static BiometricPrompt.CryptoObject I00000oOI(Cipher cipher) {
/* 3 */             return new BiometricPrompt.CryptoObject(cipher);
                }

                public static BiometricPrompt.CryptoObject I0000Il00O(Mac mac) {
/* 3 */             return new BiometricPrompt.CryptoObject(mac);
                }

                public static Cipher I0000O(BiometricPrompt.CryptoObject cryptoObject) {
/* 1 */             return cryptoObject.getCipher();
                }

                public static Mac I0000oI00(BiometricPrompt.CryptoObject cryptoObject) {
/* 1 */             return cryptoObject.getMac();
                }

                public static Signature I0001Ioi1lo(BiometricPrompt.CryptoObject cryptoObject) {
/* 1 */             return cryptoObject.getSignature();
                }
            }
