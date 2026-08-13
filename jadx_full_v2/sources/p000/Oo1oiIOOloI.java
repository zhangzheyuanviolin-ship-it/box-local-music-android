            package p000;

            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.regex.Pattern;
            
            public final class Oo1oiIOOloI {
                public static final Pattern I0000O = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
                public String I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;

                public static Oo1oiIOOloI I00000oIO(String str) {
                    String strSubstring;
/* 6 */             if (TextUtils.isEmpty(str)) {
/* 5 */                 return null;
                    }
/* 12 */            String[] strArrSplit = str.split("!", -1);
/* 18 */            if (strArrSplit.length != 2) {
/* 5 */                 return null;
                    }
/* 24 */            String str2 = strArrSplit[0];
/* 27 */            String str3 = strArrSplit[1];
/* 29 */            Oo1oiIOOloI oo1oiIOOloI = new Oo1oiIOOloI();
/* 32 */            if (str3 == null || !str3.startsWith("/topics/")) {
/* 73 */                strSubstring = str3;
                    } else {
/* 63 */                Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str2 + ".");
/* 68 */                strSubstring = str3.substring(8);
                    }
/* 74 */            if (strSubstring == null || !I0000O.matcher(strSubstring).matches()) {
/* 124 */               I000II.I000iOII(IlIi0I0.I000lI("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
/* 5 */                 return null;
                    }
/* 88 */            oo1oiIOOloI.I00000oIO = strSubstring;
/* 90 */            oo1oiIOOloI.I00000oOI = str2;
/* 110 */           oo1oiIOOloI.I0000Il00O = str2 + "!" + str3;
/* 112 */           VarHandle.storeStoreFence();
/* 115 */           return oo1oiIOOloI;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof Oo1oiIOOloI)) {
/* 3 */                 return false;
                    }
/* 7 */             Oo1oiIOOloI oo1oiIOOloI = (Oo1oiIOOloI) obj;
                    return this.I00000oIO.equals(oo1oiIOOloI.I00000oIO) && this.I00000oOI.equals(oo1oiIOOloI.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.I00000oOI, this.I00000oIO});
                }
            }
