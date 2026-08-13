            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.regex.Pattern;
            
            public abstract class lo01OlOIIoo {
                public static final Pattern I00000oIO = Pattern.compile("[a-z]+(_[a-z]+)*");
                public static final Account I00000oOI = lloiiI0ii.I00000oIO;
                public static final Set I0000Il00O = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
                public static final Set I0000O = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

                public static I0Oi111ii I00000oIO(Context context) {
/* 5 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(18);
/* 10 */            i0Oi111ii.I00iiO = "files";
/* 14 */            i0Oi111ii.I00iio = "common";
/* 18 */            i0Oi111ii.I00ilI0I1 = I00000oOI;
/* 22 */            i0Oi111ii.I00ilO0 = "";
/* 24 */            IoilOOi ioilOOi = IoillO0OOoo.I00iiI;
/* 32 */            i0Oi111ii.I00io1l = new IoilOI(4);
/* 44 */            ll110IIi0O.I00000oIO(context != null, "Context cannot be null", new Object[0]);
/* 51 */            i0Oi111ii.I00iiI = context.getPackageName();
/* 53 */            VarHandle.storeStoreFence();
/* 77 */            return i0Oi111ii;
                }
            }
