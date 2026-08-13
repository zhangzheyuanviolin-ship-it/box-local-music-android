            package p000;

            import android.hardware.biometrics.BiometricPrompt;
            import android.security.identity.IdentityCredential;
            
            public abstract class Ii0i00l1 {
                public static BiometricPrompt.CryptoObject I00000oIO(IdentityCredential identityCredential) {
/* 3 */             return new BiometricPrompt.CryptoObject(identityCredential);
                }

                public static IdentityCredential I00000oOI(BiometricPrompt.CryptoObject cryptoObject) {
/* 1 */             return cryptoObject.getIdentityCredential();
                }
            }
