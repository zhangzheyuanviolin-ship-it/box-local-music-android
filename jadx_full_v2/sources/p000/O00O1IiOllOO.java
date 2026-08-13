            package p000;
            
            public abstract class O00O1IiOllOO {
                public static final Integer I00000oIO;

                static {
                    Object obj;
/* 1 */             Integer num = null;
                    try {
/* 14 */                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                    } catch (Throwable unused) {
                    }
/* 25 */            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
/* 26 */            if (num2 != null && num2.intValue() > 0) {
/* 34 */                num = num2;
                    }
/* 35 */            I00000oIO = num;
                }
            }
