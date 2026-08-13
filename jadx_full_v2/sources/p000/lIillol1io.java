            package p000;

            import android.content.Context;
            import android.net.Uri;
            
            public abstract class lIillol1io {
                public static final I1Io0i0II I00000oIO = new I1Io0i0II(0);

                public static synchronized Uri I00000oIO() {
/* 4 */             I1Io0i0II i1Io0i0II = I00000oIO;
/* 12 */            Uri uri = (Uri) i1Io0i0II.get("com.google.android.gms.measurement");
/* 14 */            if (uri != null) {
/* 42 */                return uri;
                    }
/* 30 */            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
/* 34 */            i1Io0i0II.put("com.google.android.gms.measurement", uri2);
/* 38 */            return uri2;
                }

                public static String I00000oOI(Context context, String str) {
/* 7 */             if (str.contains("#")) {
/* 44 */                I000II.I000iOII("The passed in package cannot already have a subpackage: ".concat(str));
/* 47 */                return null;
                    }
/* 9 */             String packageName = context.getPackageName();
/* 33 */            return IIlIOloOOO.I0010I0i(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
                }
            }
