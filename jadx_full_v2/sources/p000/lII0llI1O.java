            package p000;

            import android.os.Build;
            import android.os.ParcelFileDescriptor;
            import android.system.ErrnoException;
            import android.system.Os;
            import android.system.OsConstants;
            import android.system.StructStat;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            
            public abstract class lII0llI1O {
                public static final String[] I00000oIO = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
                public static final String[] I00000oOI;
                public static final String[] I0000Il00O;

                static {
/* 21 */            String str = Build.HARDWARE;
/* 52 */            I00000oOI = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
/* 60 */            I0000Il00O = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
                }

                public static void I00000oIO(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
                    try {
/* 5 */                 StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
                        try {
/* 9 */                     StructStat structStatLstat = Os.lstat(str);
/* 21 */                    if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
/* 67 */                        throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                            }
/* 29 */                    if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
/* 53 */                        throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                            }
                        } catch (ErrnoException e) {
/* 74 */                    throw new IOException(e);
                        }
                    } catch (ErrnoException e2) {
/* 106 */               throw new IOException(e2);
                    }
                }

                public static String I00000oOI(File file) throws IOException {
/* 1 */             String canonicalPath = file.getCanonicalPath();
                    return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
                }
            }
