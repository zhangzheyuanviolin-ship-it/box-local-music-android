            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.Properties;
            
            public final class i0OI1IOoili1 {
                public static final OlOilIlol1 I0000Il00O = new OlOilIlol1("PackMetadataManager");
                public i0Il00O1 I00000oIO;
                public i0OI1ii10 I00000oOI;

                public final String I00000oIO(String str) throws IOException {
/* 3 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 5 */             i0il00o1.getClass();
                    try {
/* 12 */                if (i0il00o1.I000o00OoI0I(str) != null) {
/* 16 */                    int iI00000oIO = this.I00000oOI.I00000oIO();
/* 72 */                    File file = new File(new File(i0il00o1.I000iOII(iI00000oIO, i0Il00O1.I00000oOI(new File(new File(i0il00o1.I0000O(), str), String.valueOf((int) i0Il00O1.I00000oOI(new File(i0il00o1.I0000O(), str), true))), true), str), "_metadata"), "properties.dat");
                            try {
/* 79 */                        if (!file.exists()) {
/* 81 */                            return String.valueOf(iI00000oIO);
                                }
/* 88 */                        FileInputStream fileInputStream = new FileInputStream(file);
                                try {
/* 93 */                            Properties properties = new Properties();
/* 96 */                            properties.load(fileInputStream);
/* 99 */                            fileInputStream.close();
/* 104 */                           String property = properties.getProperty("moduleVersionTag");
                                    return property == null ? String.valueOf(iI00000oIO) : property;
                                } finally {
                                }
                            } catch (IOException unused) {
/* 134 */                       I0000Il00O.I00000oOI("Failed to read pack version tag for pack %s", str);
                            }
                        }
                    } catch (IOException unused2) {
                    }
/* 1 */             return "";
                }

                public final void I00000oOI(String str, int i, long j, String str2) throws IOException {
/* 1 */             if (str2 == null || str2.isEmpty()) {
/* 9 */                 str2 = String.valueOf(i);
                    }
/* 15 */            Properties properties = new Properties();
/* 20 */            properties.put("moduleVersionTag", str2);
/* 23 */            i0Il00O1 i0il00o1 = this.I00000oIO;
/* 27 */            i0il00o1.getClass();
/* 45 */            File file = new File(new File(i0il00o1.I000iOII(i, j, str), "_metadata"), "properties.dat");
/* 52 */            file.getParentFile().mkdirs();
/* 55 */            file.createNewFile();
/* 58 */            FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
/* 62 */                properties.store(fileOutputStream, (String) null);
/* 65 */                fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 70 */                    fileOutputStream.close();
                        } catch (Throwable th2) {
/* 75 */                    th.addSuppressed(th2);
                        }
/* 483 */               throw th;
                    }
                }
            }
