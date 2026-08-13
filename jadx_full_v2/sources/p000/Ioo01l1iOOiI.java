            package p000;

            import android.os.Build;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.security.spec.AlgorithmParameterSpec;
            import java.util.Objects;
            import javax.crypto.spec.GCMParameterSpec;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class Ioo01l1iOOiI {
                public static final I0OiiiO I0000Il00O = new I0OiiiO(11);
                public SecretKeySpec I00000oIO;
                public boolean I00000oOI;

                public static AlgorithmParameterSpec I00000oIO(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 15 */            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
/* 17 */                int i = Ooll0Ooo1.I00000oIO;
/* 33 */                Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
/* 47 */                if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
/* 51 */                    return new IvParameterSpec(bArr, 0, length);
                        }
                    }
/* 59 */            return new GCMParameterSpec(Barcode.FORMAT_ITF, bArr, 0, length);
                }
            }
