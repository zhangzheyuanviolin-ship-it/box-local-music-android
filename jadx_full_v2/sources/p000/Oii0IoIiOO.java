            package p000;

            import android.content.Context;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.Locale;
            
            public abstract class Oii0IoIiOO {
                public static final SimpleDateFormat I00000oIO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

                public static void I00000oIO(Context context, String str) throws IOException {
                    try {
/* 9 */                 File file = new File(context.getFilesDir(), "box_security_audit.log");
/* 44 */                String str2 = I00000oIO.format(new Date()) + " | " + str + "\n";
/* 52 */                if (file.exists() && file.length() > 524288) {
/* 65 */                    lO11O1Oio.I0000Il00O(file);
                        }
/* 68 */                Charset charset = IO1IOI.I00000oIO;
/* 73 */                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        try {
/* 76 */                    IlIl10.I000lI(fileOutputStream, str2, charset);
/* 79 */                    fileOutputStream.close();
                        } finally {
                        }
                    } catch (Exception e) {
/* 95 */                Log.e("BoxAuditLog", "Failed to write audit log", e);
                    }
                }
            }
