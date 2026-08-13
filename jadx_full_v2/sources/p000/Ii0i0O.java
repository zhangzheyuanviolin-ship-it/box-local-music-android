            package p000;

            import android.hardware.biometrics.BiometricPrompt;
            import android.security.identity.PresentationSession;
            
            public abstract class Ii0i0O {
                public static BiometricPrompt.CryptoObject I00000oIO(PresentationSession presentationSession) {
/* 3 */             return new BiometricPrompt.CryptoObject(presentationSession);
                }

                public static PresentationSession I00000oOI(BiometricPrompt.CryptoObject cryptoObject) {
/* 1 */             return cryptoObject.getPresentationSession();
                }
            }
