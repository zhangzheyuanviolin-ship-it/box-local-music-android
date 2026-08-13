            package net.zetetic.database;

            import android.database.sqlite.SQLiteException;
            import android.util.Log;
            import android.util.Pair;
            import java.io.File;
            import java.util.Iterator;
            import java.util.List;
            import net.zetetic.database.sqlcipher.SQLiteConnection;
            import net.zetetic.database.sqlcipher.SQLiteDatabase;
            
            public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
                public static void I00000oOI(String str) {
/* 7 */             if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
/* 186 */               return;
                    }
/* 28 */            Log.e("DefaultDatabaseErrorHandler", "deleting the database file: ".concat(str));
                    try {
/* 36 */                SQLiteDatabase.I000l1(new File(str));
                    } catch (Exception e) {
/* 59 */                Log.w("DefaultDatabaseErrorHandler", "delete failed: " + e.getMessage());
                    }
                }

                @Override
                public final void I00000oIO(SQLiteDatabase sQLiteDatabase) {
/* 21 */            Log.e("DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.I00IOO());
/* 28 */            if (SQLiteConnection.I000o00OoI0I()) {
/* 186 */               return;
                    }
/* 35 */            if (!sQLiteDatabase.isOpen()) {
/* 41 */                I00000oOI(sQLiteDatabase.I00IOO());
/* 44 */                return;
                    }
/* 45 */            List listI001l0I00 = null;
                    try {
                        try {
/* 46 */                    listI001l0I00 = sQLiteDatabase.I001l0I00();
                        } finally {
/* 57 */                    if (listI001l0I00 != null) {
/* 59 */                        Iterator it = listI001l0I00.iterator();
/* 67 */                        while (it.hasNext()) {
/* 79 */                            I00000oOI((String) ((Pair) it.next()).second);
                                }
                            } else {
/* 87 */                        I00000oOI(sQLiteDatabase.I00IOO());
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
/* 53 */                sQLiteDatabase.I000II();
                    } catch (SQLiteException unused2) {
                    }
                }
            }
