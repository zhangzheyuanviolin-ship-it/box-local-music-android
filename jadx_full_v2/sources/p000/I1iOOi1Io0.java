            package p000;

            import android.hardware.biometrics.BiometricPrompt;
            
            public abstract class I1iOOi1Io0 {
                public static BiometricPrompt.AuthenticationCallback I00000oIO(I1iOil1i i1iOil1i) {
/* 3 */             return new I1iOIl00I(i1iOil1i);
                }

                public static BiometricPrompt.CryptoObject I00000oOI(BiometricPrompt.AuthenticationResult authenticationResult) {
/* 1 */             return authenticationResult.getCryptoObject();
                }
            }
