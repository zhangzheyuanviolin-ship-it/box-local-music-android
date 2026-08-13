            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.text.TextUtils;
            
            public abstract class lII0I0I000I {
                public static void I00000oIO(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I000iOII(str);
                }

                public static void I00000oOI(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             OIiilo1Ool0o.I00100o1O0lo();
                }

                public static void I0000Il00O(Handler handler) {
/* 1 */             Looper looperMyLooper = Looper.myLooper();
/* 9 */             if (looperMyLooper != handler.getLooper()) {
/* 22 */                String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
/* 34 */                String name2 = handler.getLooper().getThread().getName();
/* 61 */                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
/* 68 */                IIl001iO0Io.I001lIiIIo1O(sb, "Must be called on ", name2, " thread, but got ", name);
/* 73 */                sb.append(".");
/* 83 */                throw new IllegalStateException(sb.toString());
                    }
                }

                public static void I0000O(String str) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 10 */                I000II.I000iOII("Given String is empty or null");
                    }
                }

                public static void I0000oI00(String str, String str2) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 8 */                 I000II.I000iOII(str2);
                    }
                }

                public static void I0001Ioi1lo(String str) {
/* 9 */             if (Looper.getMainLooper() != Looper.myLooper()) {
/* 11 */                return;
                    }
/* 12 */            I000II.I001IO000(str);
                }

                public static void I000II(Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 6 */             IOOlIIilOl0.I000II("null reference");
                }

                public static void I000O01llI0(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000II(str);
                }

                public static void I000OOo1O(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             I000II.I001IO000(str);
                }

                public static void I000OiO(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000iOII();
                }
            }
