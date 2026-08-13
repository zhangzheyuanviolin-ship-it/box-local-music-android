            package p000;

            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.regex.Pattern;
            
            public final class OolliI1oliO {
                public static final Pattern I00000oIO = Pattern.compile("\\AA[\\w-]{38}\\z");
                public static OolliI1oliO I00000oOI;

                public static OolliI1oliO I00000oIO() {
/* 3 */             if (o0iOli.I00ioIO == null) {
/* 12 */                o0iOli.I00ioIO = new o0iOli(15);
                    }
/* 14 */            OolliI1oliO oolliI1oliO = I00000oOI;
/* 16 */            if (oolliI1oliO != null) {
/* 29 */                return oolliI1oliO;
                    }
/* 20 */            OolliI1oliO oolliI1oliO2 = new OolliI1oliO();
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            I00000oOI = oolliI1oliO2;
/* 29 */            return oolliI1oliO2;
                }

                public final boolean I00000oOI(I1lI11 i1lI11) {
                    return TextUtils.isEmpty(i1lI11.I0000Il00O) || i1lI11.I0001Ioi1lo + i1lI11.I0000oI00 < (System.currentTimeMillis() / 1000) + 3600;
                }
            }
