            package p000;

            import android.database.DatabaseErrorHandler;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.util.Log;
            import android.util.Pair;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public final class IllO0loo implements DatabaseErrorHandler {
                public O1I1OO I00000oIO;
                public Oi00IilOloo0 I00000oOI;

                @Override
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
/* 1 */             O1I1OO o1i1oo = this.I00000oIO;
/* 3 */             Oi00IilOloo0 oi00IilOloo0 = this.I00000oOI;
/* 5 */             int i = IllOI010l.I00ioIO;
/* 9 */             IllO0lI illO0lI = (IllO0lI) oi00IilOloo0.I00iOIl;
/* 11 */            if (illO0lI == null || !illO0lI.I00iOIl.equals(sQLiteDatabase)) {
/* 23 */                illO0lI = new IllO0lI();
/* 26 */                illO0lI.I00iOIl = sQLiteDatabase;
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                oi00IilOloo0.I00iOIl = illO0lI;
                    }
/* 33 */            SQLiteDatabase sQLiteDatabase2 = illO0lI.I00iOIl;
/* 35 */            o1i1oo.getClass();
/* 59 */            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + illO0lI + ".path");
/* 66 */            if (!sQLiteDatabase2.isOpen()) {
/* 68 */                String path = sQLiteDatabase2.getPath();
/* 72 */                if (path != null) {
/* 74 */                    O1I1OO.I000II(path);
/* 77 */                    return;
                        }
/* 168 */               return;
                    }
/* 78 */            List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
/* 79 */                    attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } finally {
/* 90 */                    if (attachedDbs != null) {
/* 94 */                        Iterator<T> it = attachedDbs.iterator();
/* 102 */                       while (it.hasNext()) {
/* 114 */                           O1I1OO.I000II((String) ((Pair) it.next()).second);
                                }
                            } else {
/* 118 */                       String path2 = sQLiteDatabase2.getPath();
/* 122 */                       if (path2 != null) {
/* 124 */                           O1I1OO.I000II(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
/* 86 */                illO0lI.close();
                    } catch (IOException unused2) {
                    }
/* 128 */           if (attachedDbs != null) {
/* 168 */               return;
                    }
                }
            }
