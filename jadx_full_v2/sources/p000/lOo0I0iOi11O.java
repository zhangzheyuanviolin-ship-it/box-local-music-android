            package p000;

            import android.os.Trace;
            
            public abstract class lOo0I0iOi11O {
                public static final void I00000oIO(String str) {
/* 11 */            String strSubstring = str.length() <= 127 ? str : null;
/* 12 */            if (strSubstring == null) {
/* 15 */                strSubstring = str.substring(0, 127);
                    }
/* 19 */            Trace.beginSection(strSubstring);
                }
            }
