            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.regex.Pattern;
            
            public abstract class i0OIioiOOiiO {
                public static final Pattern I00000oIO = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

                public static ArrayList I00000oIO(File file, File file2) throws IOException, NumberFormatException {
                    File[] fileArr;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 11 */            File[] fileArrListFiles = file2.listFiles(new i0OIiiI0());
/* 16 */            if (fileArrListFiles != null) {
/* 22 */                File[] fileArr2 = new File[fileArrListFiles.length];
/* 24 */                int i = 0;
                        while (true) {
/* 25 */                    int length = fileArrListFiles.length;
/* 26 */                    if (i >= length) {
/* 65 */                        fileArr = fileArr2;
                                break;
                            }
/* 28 */                    File file3 = fileArrListFiles[i];
/* 42 */                    int i2 = Integer.parseInt(file3.getName().split("-")[0]);
/* 46 */                    if (i2 > length || fileArr2[i2] != null) {
                                break;
                            }
/* 52 */                    fileArr2[i2] = file3;
/* 54 */                    i++;
                        }
/* 64 */                throw new i0O0lI1oiO("Metadata folder ordering corrupt.");
                    }
/* 18 */            fileArr = new File[0];
/* 67 */            for (File file4 : fileArr) {
/* 71 */                arrayList.add(file4);
/* 84 */                if (file4.getName().contains("LFH")) {
/* 88 */                    FileInputStream fileInputStream = new FileInputStream(file4);
                            try {
/* 100 */                       String str = new i0IolIloo(fileInputStream).I00000oIO().I00000oIO;
/* 102 */                       if (str == null) {
/* 163 */                           throw new i0O0lI1oiO("Metadata files corrupt. Could not read local file header.");
                                }
/* 106 */                       File file5 = new File(file, str);
/* 113 */                       if (!file5.exists()) {
/* 155 */                           throw new i0O0lI1oiO("Missing asset file " + file5.getCanonicalPath() + " during slice reconstruction.");
                                }
/* 115 */                       arrayList.add(file5);
/* 118 */                       fileInputStream.close();
                            } catch (Throwable th) {
                                try {
/* 164 */                           fileInputStream.close();
                                } catch (Throwable th2) {
/* 169 */                           th.addSuppressed(th2);
                                }
/* 172 */                       throw th;
                            }
                        }
                    }
/* 551 */           return arrayList;
                }
            }
