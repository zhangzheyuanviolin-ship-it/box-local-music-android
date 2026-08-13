            package p000;

            import android.os.Build;
            import dalvik.system.VMStack;
            
            public final class ilIiOiOoOl extends ilI1Oiilo00 {
                static {
                    try {
/* 10 */                Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
/* 23 */                ilIiI1O0.class.getName().equals(I00000oIO());
                    } catch (Throwable unused) {
                    }
/* 26 */            String str = Build.FINGERPRINT;
/* 28 */            if (str != null) {
/* 32 */                "robolectric".equals(str);
                    }
                }

                public static String I00000oIO() {
                    try {
/* 5 */                 return VMStack.getStackClass2().getName();
                    } catch (Throwable unused) {
/* 10 */                return null;
                    }
                }
            }
