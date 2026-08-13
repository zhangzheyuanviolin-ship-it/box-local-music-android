            package p000;

            import android.os.Build;
            import dalvik.system.VMStack;
            
            public final class iioiOOllOioi extends iio00I10 {
                public static final liIoOiiO1Oi I00000oOI;

                static {
                    try {
/* 10 */                Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
/* 23 */                iioiIiIlo.class.getName().equals(I00000oIO());
                    } catch (Throwable unused) {
                    }
/* 26 */            String str = Build.FINGERPRINT;
/* 28 */            if (str != null) {
/* 32 */                "robolectric".equals(str);
                    }
/* 42 */            I00000oOI = new liIoOiiO1Oi(21);
                }

                public static String I00000oIO() {
                    try {
/* 5 */                 return VMStack.getStackClass2().getName();
                    } catch (Throwable unused) {
/* 10 */                return null;
                    }
                }
            }
