            package p000;

            import android.os.Process;
            import android.text.TextUtils;
            import android.util.Log;
            import java.util.IllegalFormatException;
            import java.util.Locale;
            
            public final class OlOilIlol1 {
                public String I00000oIO;

                public OlOilIlol1(String str) {
/* 26 */            this.I00000oIO = Oi010OO0.I0010o("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                }

                public static String I0001Ioi1lo(String str, String str2, Object... objArr) {
/* 2 */             if (objArr.length > 0) {
                        try {
/* 6 */                     str2 = String.format(Locale.US, str2, objArr);
                        } catch (IllegalFormatException e) {
/* 20 */                    Log.e("PlayCore", "Unable to format ".concat(str2), e);
/* 33 */                    str2 = IIl001iO0Io.I000oI1ioi(str2, " [", TextUtils.join(", ", objArr), "]");
                        }
                    }
/* 39 */            return IlIi0I0.I000lI(str, " : ", str2);
                }

                public void I00000oIO(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 3)) {
/* 12 */                I0001Ioi1lo(this.I00000oIO, str, objArr);
                    }
                }

                public void I00000oOI(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 16 */                Log.e("PlayCore", I0001Ioi1lo(this.I00000oIO, str, objArr));
                    }
                }

                public void I0000Il00O(Exception exc, String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 6)) {
/* 16 */                Log.e("PlayCore", I0001Ioi1lo(this.I00000oIO, str, objArr), exc);
                    }
                }

                public void I0000O(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 4)) {
/* 16 */                Log.i("PlayCore", I0001Ioi1lo(this.I00000oIO, str, objArr));
                    }
                }

                public void I0000oI00(String str, Object... objArr) {
/* 8 */             if (Log.isLoggable("PlayCore", 5)) {
/* 16 */                Log.w("PlayCore", I0001Ioi1lo(this.I00000oIO, str, objArr));
                    }
                }
            }
