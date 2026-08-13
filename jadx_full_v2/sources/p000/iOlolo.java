            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.security.SecureRandom;
            
            public abstract class iOlolo {
                public static final int[] I00000oIO = {0, 0, 1, 2, 4, 8, 16};
                public static final SecureRandom I00000oOI = new SecureRandom();

                public static boolean I00000oIO(iOlolIi iololii) throws InterruptedException {
/* 6 */             for (int i = 0; i < 7; i++) {
/* 10 */                int i2 = I00000oIO[i];
/* 12 */                if (i2 > 0) {
/* 17 */                    int i3 = i2 * 60000;
/* 28 */                    Thread.sleep(I00000oOI.nextInt(i3) + (i3 / 2));
                        }
                        try {
                        } catch (IOException e) {
/* 55 */                    Log.e("MLK ExponentialBackoff", "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e.getMessage())), e);
                        } catch (InterruptedException e2) {
/* 64 */                    Log.i("MLK ExponentialBackoff", "retryWithRandomizedExponentialBackoff: interrupted");
/* 67 */                    throw e2;
                        }
/* 35 */                if (iololii.zzb()) {
/* 38 */                    return true;
                        }
                    }
/* 3 */             return false;
                }
            }
