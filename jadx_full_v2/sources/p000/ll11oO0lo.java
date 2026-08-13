            package p000;

            import android.net.Uri;
            import android.system.Os;
            import java.io.File;
            import java.io.IOException;
            import java.util.Locale;
            
            public abstract class ll11oO0lo {
                public static IOException I00000oIO(lloOo1iol llooo1iol, Uri uri, IOException iOException, String str) {
                    try {
/* 3 */                 loI0ioOOIooO loi0ioooiooo = new loI0ioOOIooO();
/* 7 */                 loi0ioooiooo.I00iOIl = true;
/* 13 */                File file = (File) llooo1iol.I00000oIO(uri, loi0ioooiooo);
                        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? I00000oOI(file, iOException, str) : I00000oOI(file, iOException, str) : file.canWrite() ? I00000oOI(file, iOException, str) : I00000oOI(file, iOException, str) : file.canRead() ? file.canWrite() ? I00000oOI(file, iOException, str) : I00000oOI(file, iOException, str) : file.canWrite() ? I00000oOI(file, iOException, str) : I00000oOI(file, iOException, str) : I00000oOI(file, iOException, str);
                    } catch (IOException unused) {
/* 110 */               return new IOException(iOException);
                    }
                }

                public static IOException I00000oOI(File file, IOException iOException, String str) {
/* 1 */             File parentFile = file.getParentFile();
                    return parentFile == null ? I0000Il00O(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? I0000Il00O(file, iOException, str) : I0000Il00O(file, iOException, str) : parentFile.canWrite() ? I0000Il00O(file, iOException, str) : I0000Il00O(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? I0000Il00O(file, iOException, str) : I0000Il00O(file, iOException, str) : parentFile.canWrite() ? I0000Il00O(file, iOException, str) : I0000Il00O(file, iOException, str) : I0000Il00O(file, iOException, str);
                }

                public static IOException I0000Il00O(File file, IOException iOException, String str) throws IOException {
                    String strConcat;
                    try {
/* 9 */                 Locale locale = Locale.US;
/* 46 */                String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
/* 58 */                StringBuilder sb = new StringBuilder(str2.length() + 16);
/* 61 */                sb.append("Inoperable file:");
/* 64 */                sb.append(str2);
/* 67 */                strConcat = sb.toString();
                        try {
/* 92 */                    String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
/* 107 */                   StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
/* 110 */                   sb2.append(strConcat);
/* 113 */                   sb2.append(str3);
/* 116 */                   strConcat = sb2.toString();
                        } catch (Exception unused) {
                        }
                    } catch (IOException unused2) {
/* 123 */               strConcat = "Inoperable file:".concat(" failed");
                    }
/* 129 */           return new IOException(strConcat, iOException);
                }
            }
