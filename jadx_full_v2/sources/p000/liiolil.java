            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import java.io.File;
            import java.util.Collections;
            import java.util.HashSet;
            
            public abstract class liiolil {
                /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
                  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(l01O0IO1ooO0 l01o0io1ooo0, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
                    SQLiteDatabase sQLiteDatabase2;
                    Throwable th;
                    Cursor cursorQuery;
                    HashSet hashSet;
                    Cursor cursorRawQuery;
                    boolean zMoveToFirst;
/* 1 */             if (l01o0io1ooo0 == null) {
/* 252 */               I000II.I000iOII("Monitor must not be null");
/* 685 */               return;
                    }
/* 3 */             Cursor cursor = null;
                    try {
                        try {
/* 21 */                    sQLiteDatabase2 = sQLiteDatabase;
                        } catch (Throwable th2) {
/* 44 */                    th = th2;
/* 244 */                   if (cursor != null) {
                            }
                        }
                    } catch (SQLiteException e) {
/* 50 */                e = e;
/* 51 */                sQLiteDatabase2 = sQLiteDatabase;
                    }
                    try {
                        try {
                            try {
/* 22 */                        cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                                try {
                                    try {
/* 26 */                                zMoveToFirst = cursorQuery.moveToFirst();
/* 30 */                                cursorQuery.close();
                                    } catch (SQLiteException e2) {
/* 41 */                                e = e2;
/* 58 */                                l01o0io1ooo0.I00l0I0l0lO1.I0000O(str, "Error querying for table", e);
/* 61 */                                if (cursorQuery != null) {
/* 63 */                                    cursorQuery.close();
                                        }
/* 66 */                                sQLiteDatabase2.execSQL(str2);
/* 79 */                                hashSet = new HashSet();
/* 90 */                                StringBuilder sb = new StringBuilder(str.length() + 22);
/* 93 */                                sb.append("SELECT * FROM ");
/* 96 */                                sb.append(str);
/* 99 */                                sb.append(" LIMIT 0");
/* 106 */                               cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
/* 114 */                               Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
/* 117 */                               cursorRawQuery.close();
/* 129 */                               while (i < r0) {
                                        }
/* 187 */                               if (strArr != null) {
                                        }
/* 214 */                               if (hashSet.isEmpty()) {
                                        }
                                    }
                                } catch (Throwable th3) {
/* 37 */                            th = th3;
/* 38 */                            cursor = cursorQuery;
/* 244 */                           if (cursor != null) {
/* 249 */                               throw th;
                                    }
/* 246 */                           cursor.close();
/* 249 */                           throw th;
                                }
                            } catch (SQLiteException e3) {
/* 47 */                        e = e3;
/* 53 */                        cursorQuery = null;
/* 58 */                        l01o0io1ooo0.I00l0I0l0lO1.I0000O(str, "Error querying for table", e);
/* 61 */                        if (cursorQuery != null) {
                                }
/* 66 */                        sQLiteDatabase2.execSQL(str2);
/* 79 */                        hashSet = new HashSet();
/* 90 */                        StringBuilder sb2 = new StringBuilder(str.length() + 22);
/* 93 */                        sb2.append("SELECT * FROM ");
/* 96 */                        sb2.append(str);
/* 99 */                        sb2.append(" LIMIT 0");
/* 106 */                       cursorRawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
/* 114 */                       Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
/* 117 */                       cursorRawQuery.close();
/* 129 */                       while (i < r0) {
                                }
/* 187 */                       if (strArr != null) {
                                }
/* 214 */                       if (hashSet.isEmpty()) {
                                }
                            }
/* 114 */                   Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
/* 117 */                   cursorRawQuery.close();
/* 129 */                   for (String str4 : str3.split(",")) {
/* 137 */                       if (!hashSet.remove(str4)) {
/* 161 */                           StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
/* 164 */                           sb3.append("Table ");
/* 167 */                           sb3.append(str);
/* 170 */                           sb3.append(" is missing required column: ");
/* 173 */                           sb3.append(str4);
/* 183 */                           throw new SQLiteException(sb3.toString());
                                }
                            }
/* 187 */                   if (strArr != null) {
/* 190 */                       for (int i = 0; i < strArr.length; i += 2) {
/* 198 */                           if (!hashSet.remove(strArr[i])) {
/* 204 */                               sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
/* 214 */                   if (hashSet.isEmpty()) {
/* 229 */                       return;
                            }
/* 226 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000O(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
/* 229 */                   return;
                        } catch (Throwable th4) {
/* 232 */                   cursorRawQuery.close();
/* 235 */                   throw th4;
                        }
/* 79 */                hashSet = new HashSet();
/* 90 */                StringBuilder sb22 = new StringBuilder(str.length() + 22);
/* 93 */                sb22.append("SELECT * FROM ");
/* 96 */                sb22.append(str);
/* 99 */                sb22.append(" LIMIT 0");
/* 106 */               cursorRawQuery = sQLiteDatabase2.rawQuery(sb22.toString(), null);
                    } catch (SQLiteException e4) {
/* 240 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to verify columns on table that was just created", str);
/* 243 */               throw e4;
                    }
/* 33 */            if (!zMoveToFirst) {
/* 66 */                sQLiteDatabase2.execSQL(str2);
                    }
                }

                public static void I00000oOI(l01O0IO1ooO0 l01o0io1ooo0, SQLiteDatabase sQLiteDatabase) {
/* 1 */             if (l01o0io1ooo0 == null) {
/* 63 */                I000II.I000iOII("Monitor must not be null");
/* 106 */               return;
                    }
/* 3 */             IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00l0I0l0lO1;
/* 11 */            File file = new File(sQLiteDatabase.getPath());
/* 19 */            if (!file.setReadable(false, false)) {
/* 23 */                iOloiOI1.I00000oOI("Failed to turn off database read permission");
                    }
/* 30 */            if (!file.setWritable(false, false)) {
/* 34 */                iOloiOI1.I00000oOI("Failed to turn off database write permission");
                    }
/* 42 */            if (!file.setReadable(true, true)) {
/* 46 */                iOloiOI1.I00000oOI("Failed to turn on database read permission for owner");
                    }
/* 53 */            if (file.setWritable(true, true)) {
/* 60 */                return;
                    }
/* 57 */            iOloiOI1.I00000oOI("Failed to turn on database write permission for owner");
                }
            }
