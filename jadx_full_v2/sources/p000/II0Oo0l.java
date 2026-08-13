            package p000;

            import android.content.Context;
            import android.content.DialogInterface;
            import android.hardware.biometrics.BiometricPrompt;
            import android.os.CancellationSignal;
            import java.util.concurrent.Executor;
            
            public abstract class II0Oo0l {
                public static void I00000oIO(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
/* 1 */             biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
                }

                public static void I00000oOI(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
/* 1 */             biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
                }

                public static BiometricPrompt I0000Il00O(BiometricPrompt.Builder builder) {
/* 1 */             return builder.build();
                }

                public static BiometricPrompt.Builder I0000O(Context context) {
/* 3 */             return new BiometricPrompt.Builder(context);
                }

                public static void I0000oI00(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
/* 1 */             builder.setNegativeButton(charSequence, executor, onClickListener);
                }

                public static void I0001Ioi1lo(BiometricPrompt.Builder builder, CharSequence charSequence) {
/* 1 */             builder.setSubtitle(charSequence);
                }

                public static void I000II(BiometricPrompt.Builder builder, CharSequence charSequence) {
/* 1 */             builder.setTitle(charSequence);
                }
            }
