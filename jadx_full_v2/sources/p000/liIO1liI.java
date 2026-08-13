            package p000;

            import android.content.Context;
            import java.io.File;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class liIO1liI {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Map] */
                public static final void I00000oIO(Context context) {
                    LinkedHashMap linkedHashMapSingletonMap;
/* 11 */            if (context.getDatabasePath("androidx.work.workdb").exists()) {
/* 13 */                IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 17 */                String str = i01I0l.I00000oIO;
/* 19 */                iIi0oIlI000II.getClass();
/* 22 */                File databasePath = context.getDatabasePath("androidx.work.workdb");
/* 26 */                File noBackupFilesDir = context.getNoBackupFilesDir();
/* 30 */                String[] strArr = i01I0l.I00000oOI;
/* 33 */                int iI00000oIO = O1Oii0o0Oi.I00000oIO(strArr.length);
/* 39 */                if (iI00000oIO < 16) {
/* 41 */                    iI00000oIO = 16;
                        }
/* 44 */                LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 49 */                for (String str2 : strArr) {
/* 101 */                   linkedHashMap.put(new File(databasePath.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
                        }
/* 109 */               OIoi0IIoi oIoi0IIoi = new OIoi0IIoi(databasePath, noBackupFilesDir);
/* 112 */               boolean zIsEmpty = linkedHashMap.isEmpty();
/* 116 */               Object obj = oIoi0IIoi.I00iiI;
/* 118 */               Object obj2 = oIoi0IIoi.I00iOIl;
/* 120 */               if (zIsEmpty) {
/* 122 */                   linkedHashMapSingletonMap = Collections.singletonMap(obj2, obj);
                        } else {
/* 129 */                   LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
/* 132 */                   linkedHashMap2.put(obj2, obj);
                            linkedHashMapSingletonMap = linkedHashMap2;
                        }
/* 147 */               for (Map.Entry entry : linkedHashMapSingletonMap.entrySet()) {
/* 159 */                   File file = (File) entry.getKey();
/* 165 */                   File file2 = (File) entry.getValue();
/* 171 */                   if (file.exists()) {
/* 177 */                       if (file2.exists()) {
/* 199 */                           IIi0oIl.I000II().I000l1(i01I0l.I00000oIO, "Over-writing contents of " + file2);
                                }
/* 206 */                       if (file.renameTo(file2)) {
/* 208 */                           file.toString();
/* 211 */                           file2.toString();
                                } else {
/* 215 */                           file.toString();
/* 218 */                           file2.toString();
                                }
/* 221 */                       IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 225 */                       String str3 = i01I0l.I00000oIO;
/* 227 */                       iIi0oIlI000II2.getClass();
                            }
                        }
                    }
                }
            }
