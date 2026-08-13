            package p000;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Properties;
            
            public final class i0Il00O1 {
                public static final OlOilIlol1 I0000Il00O = new OlOilIlol1("AssetPackStorage");
                public static final long I0000O = 1209600000;
                public static final long I0000oI00 = 2419200000L;
                public Context I00000oIO;
                public i0OI1ii10 I00000oOI;

                public static long I00000oOI(File file, boolean z) {
/* 5 */             if (!file.exists()) {
/* 105 */               return -1L;
                    }
/* 10 */            ArrayList arrayList = new ArrayList();
/* 13 */            OlOilIlol1 olOilIlol1 = I0000Il00O;
/* 16 */            if (z && file.listFiles().length > 1) {
/* 30 */                olOilIlol1.I0000oI00("Multiple pack versions found, using highest version code.", new Object[0]);
                    }
                    try {
/* 39 */                for (File file2 : file.listFiles()) {
/* 53 */                    if (!file2.getName().equals("stale.tmp")) {
/* 63 */                        arrayList.add(Long.valueOf(file2.getName()));
                            }
                        }
                    } catch (NumberFormatException e) {
/* 76 */                olOilIlol1.I0000Il00O(e, "Corrupt asset pack directories.", new Object[0]);
                    }
/* 83 */            if (arrayList.isEmpty()) {
/* 105 */               return -1L;
                    }
/* 85 */            Collections.sort(arrayList);
/* 100 */           return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
                }

                public static ArrayList I0000oI00(PackageInfo packageInfo, String str) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             String[] strArr = packageInfo.splitNames;
/* 8 */             if (strArr != null) {
                        int i = (-Arrays.binarySearch(strArr, str)) - 1;
                        while (true) {
/* 18 */                    String[] strArr2 = packageInfo.splitNames;
/* 21 */                    if (i >= strArr2.length || !strArr2[i].startsWith(str)) {
                                break;
                            }
/* 37 */                    arrayList.add(packageInfo.applicationInfo.splitSourceDirs[i]);
/* 40 */                    i++;
                        }
                    }
/* 89 */            return arrayList;
                }

                public static void I000II(File file) {
/* 5 */             if (file.listFiles() == null || file.listFiles().length <= 1) {
/* 186 */               return;
                    }
/* 17 */            long jI00000oOI = I00000oOI(file, false);
/* 26 */            for (File file2 : file.listFiles()) {
/* 42 */                if (!file2.getName().equals(String.valueOf(jI00000oOI)) && !file2.getName().equals("stale.tmp")) {
/* 56 */                    I000O01llI0(file2);
                        }
                    }
                }

                public static boolean I000O01llI0(File file) {
/* 1 */             File[] fileArrListFiles = file.listFiles();
/* 6 */             boolean zI000O01llI0 = true;
/* 7 */             if (fileArrListFiles != null) {
/* 11 */                for (File file2 : fileArrListFiles) {
/* 19 */                    zI000O01llI0 &= I000O01llI0(file2);
                        }
                    }
/* 27 */            if (file.delete()) {
/* 49 */                return zI000O01llI0;
                    }
/* 5 */             return false;
                }

                public final void I00000oIO(int i, long j, String str) {
/* 7 */             File file = new File(I0000O(), str);
/* 14 */            if (file.exists()) {
/* 24 */                for (File file2 : file.listFiles()) {
/* 40 */                    if (!file2.getName().equals(String.valueOf(i)) && !file2.getName().equals("stale.tmp")) {
/* 54 */                        I000O01llI0(file2);
                            } else if (file2.getName().equals(String.valueOf(i))) {
/* 78 */                        for (File file3 : file2.listFiles()) {
/* 94 */                            if (!file3.getName().equals(String.valueOf(j))) {
/* 96 */                                I000O01llI0(file3);
                                    }
                                }
                            }
                        }
                    }
                }

                public final File I0000Il00O(int i, long j, String str) {
/* 32 */            return new File(new File(new File(new File(I0000O(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
                }

                public final File I0000O() {
/* 11 */            return new File(this.I00000oIO.getFilesDir(), "assetpacks");
                }

                public final ArrayList I0001Ioi1lo() {
/* 3 */             ArrayList arrayList = new ArrayList();
                    try {
/* 14 */                if (I0000O().exists() && I0000O().listFiles() != null) {
/* 37 */                    for (File file : I0000O().listFiles()) {
/* 64 */                        if (!file.getCanonicalPath().equals(new File(I0000O(), "_tmp").getCanonicalPath())) {
/* 66 */                            arrayList.add(file);
                                }
                            }
                        }
/* 75 */                return arrayList;
                    } catch (IOException e) {
/* 84 */                I0000Il00O.I00000oOI("Could not process directory while scanning installed packs. %s", e);
/* 113 */               return arrayList;
                    }
                }

                public final int I000OOo1O(int i, long j, String str) throws IOException {
/* 16 */            File file = new File(new File(I0000Il00O(i, j, str), "_packs"), "merge.tmp");
/* 23 */            if (!file.exists()) {
/* 25 */                return 0;
                    }
/* 29 */            Properties properties = new Properties();
/* 34 */            FileInputStream fileInputStream = new FileInputStream(file);
                    try {
/* 37 */                properties.load(fileInputStream);
/* 40 */                fileInputStream.close();
/* 51 */                if (properties.getProperty("numberOfMerges") == null) {
/* 74 */                    throw new i0O0lI1oiO("Merge checkpoint file corrupt.");
                        }
                        try {
/* 57 */                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                        } catch (NumberFormatException e) {
/* 68 */                    throw new i0O0lI1oiO("Merge checkpoint file corrupt.", e);
                        }
                    } catch (Throwable th) {
                        try {
/* 76 */                    fileInputStream.close();
                        } catch (Throwable th2) {
/* 81 */                    th.addSuppressed(th2);
                        }
/* 215 */               throw th;
                    }
                }

                public final i0IlIo00I I000OiO(String str) {
/* 1 */             String strI000o00OoI0I = I000o00OoI0I(str);
/* 6 */             if (strI000o00OoI0I == null) {
/* 5 */                 return null;
                    }
/* 13 */            File file = new File(strI000o00OoI0I, "assets");
/* 20 */            if (file.isDirectory()) {
/* 41 */                return new i0IlIo00I(strI000o00OoI0I, 0, file.getCanonicalPath());
                    }
/* 30 */            I0000Il00O.I00000oOI("Failed to find assets directory: %s", file);
/* 5 */             return null;
                }

                public final File I000iOII(int i, long j, String str) {
/* 25 */            return new File(new File(new File(I0000O(), str), String.valueOf(i)), String.valueOf(j));
                }

                public final File I000l1(String str, int i, long j, String str2) {
/* 21 */            return new File(new File(new File(I0000Il00O(i, j, str), "_slices"), "_unverified"), str2);
                }

                public final File I000lI(String str, int i, long j, String str2) {
/* 21 */            return new File(new File(new File(I0000Il00O(i, j, str), "_slices"), "_verified"), str2);
                }

                public final String I000o00OoI0I(String str) {
                    int length;
/* 1 */             i0OI1ii10 i0oi1ii10 = this.I00000oOI;
/* 9 */             File file = new File(I0000O(), str);
/* 12 */            boolean zExists = file.exists();
/* 17 */            OlOilIlol1 olOilIlol1 = I0000Il00O;
/* 19 */            if (!zExists) {
/* 27 */                olOilIlol1.I00000oIO("Pack not found with pack name: %s", str);
/* 16 */                return null;
                    }
/* 41 */            File file2 = new File(file, String.valueOf(i0oi1ii10.I00000oIO()));
/* 48 */            if (!file2.exists()) {
/* 64 */                olOilIlol1.I00000oIO("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(i0oi1ii10.I00000oIO()));
/* 16 */                return null;
                    }
/* 68 */            File[] fileArrListFiles = file2.listFiles();
/* 72 */            if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
/* 121 */               olOilIlol1.I00000oIO("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(i0oi1ii10.I00000oIO()));
/* 16 */                return null;
                    }
/* 79 */            if (length <= 1) {
/* 102 */               return fileArrListFiles[0].getCanonicalPath();
                    }
/* 95 */            olOilIlol1.I00000oOI("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(i0oi1ii10.I00000oIO()));
/* 16 */            return null;
                }

                public final HashMap I000oI1ioi() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            Iterator it = I0001Ioi1lo().iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                String name = ((File) it.next()).getName();
/* 44 */                int iI00000oOI = (int) I00000oOI(new File(I0000O(), name), true);
/* 63 */                long jI00000oOI = I00000oOI(new File(new File(I0000O(), name), String.valueOf(iI00000oOI)), true);
/* 75 */                if (I000iOII(iI00000oOI, jI00000oOI, name).exists()) {
/* 81 */                    map.put(name, Long.valueOf(jI00000oOI));
                        }
                    }
/* 113 */           return map;
                }

                public final HashMap I00100l0() {
/* 3 */             HashMap map = new HashMap();
/* 8 */             HashMap map2 = new HashMap();
                    try {
/* 15 */                Iterator it = I0001Ioi1lo().iterator();
/* 23 */                while (it.hasNext()) {
/* 29 */                    File file = (File) it.next();
/* 35 */                    i0IlIo00I i0ilio00iI000OiO = I000OiO(file.getName());
/* 39 */                    if (i0ilio00iI000OiO != null) {
/* 45 */                        map2.put(file.getName(), i0ilio00iI000OiO);
                            }
                        }
                    } catch (IOException e) {
/* 58 */                I0000Il00O.I00000oOI("Could not process directory while scanning installed packs: %s", e);
                    }
/* 73 */            for (String str : map2.keySet()) {
/* 122 */               map.put(str, Long.valueOf(I00000oOI(new File(new File(I0000O(), str), String.valueOf((int) I00000oOI(new File(I0000O(), str), true))), true)));
                    }
/* 541 */           return map;
                }
            }
