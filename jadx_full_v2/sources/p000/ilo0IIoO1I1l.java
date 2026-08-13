            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class ilo0IIoO1I1l {
                public static final boolean I00000oIO(String str) {
/* 7 */             for (int i = 0; i < str.length(); i++) {
/* 9 */                 char cCharAt = str.charAt(i);
/* 19 */                if (O0000Ioio00.I0000oI00(cCharAt, Barcode.FORMAT_ITF) >= 0 || Character.isLetter(cCharAt)) {
/* 31 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
