            package p000;

            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.Properties;
            
            public final class i0O1l1o1O {
                public static final OlOilIlol1 I00000oOI = new OlOilIlol1("MergeSliceTaskHandler");
                public i0Il00O1 I00000oIO;

                public static void I00000oOI(File file, File file2) {
/* 5 */             if (!file.isDirectory()) {
/* 62 */                if (file2.exists()) {
/* 551 */                   throw new i0O0lI1oiO("File clashing with existing file from other slice: ".concat(file2.toString()));
                        }
/* 68 */                if (!file.renameTo(file2)) {
/* 86 */                    throw new i0O0lI1oiO("Unable to move file: ".concat(String.valueOf(file)));
                        }
/* 70 */                return;
                    }
/* 7 */             file2.mkdirs();
/* 16 */            for (File file3 : file.listFiles()) {
/* 29 */                I00000oOI(file3, new File(file2, file3.getName()));
                    }
/* 39 */            if (!file.delete()) {
/* 57 */                throw new i0O0lI1oiO("Unable to delete directory: ".concat(String.valueOf(file)));
                    }
                }

                public final void I00000oIO(i0O1ilIi0 i0o1ilii0) {
/* 1 */             i0Il00O1 i0il00o1 = this.I00000oIO;
/* 6 */             String str = (String) i0o1ilii0.I00000oOI;
/* 8 */             int i = i0o1ilii0.I00000oIO;
/* 10 */            long j = i0o1ilii0.I0000O;
/* 12 */            int i2 = i0o1ilii0.I0000Il00O;
/* 16 */            File fileI000lI = i0il00o1.I000lI(str, i2, j, i0o1ilii0.I0000oI00);
/* 24 */            if (!fileI000lI.exists()) {
/* 186 */               throw new i0O0lI1oiO(IlIi0I0.I000lI("Cannot find verified files for slice ", i0o1ilii0.I0000oI00, "."), i);
                    }
/* 26 */            i0il00o1.getClass();
/* 37 */            File file = new File(i0il00o1.I0000Il00O(i2, j, str), "_packs");
/* 44 */            if (!file.exists()) {
/* 46 */                file.mkdirs();
                    }
/* 49 */            I00000oOI(fileI000lI, file);
                    try {
/* 56 */                int iI000OOo1O = i0il00o1.I000OOo1O(i2, j, str) + 1;
/* 71 */                File file2 = new File(new File(i0il00o1.I0000Il00O(i2, j, str), "_packs"), "merge.tmp");
/* 76 */                Properties properties = new Properties();
/* 85 */                properties.put("numberOfMerges", String.valueOf(iI000OOo1O));
/* 92 */                file2.getParentFile().mkdirs();
/* 95 */                file2.createNewFile();
/* 100 */               FileOutputStream fileOutputStream = new FileOutputStream(file2);
/* 104 */               properties.store(fileOutputStream, (String) null);
/* 107 */               fileOutputStream.close();
                    } catch (IOException e) {
/* 125 */               I00000oOI.I00000oOI("Writing merge checkpoint failed with %s.", e.getMessage());
/* 135 */               throw new i0O0lI1oiO(i, e, "Writing merge checkpoint failed.");
                    }
                }
            }
