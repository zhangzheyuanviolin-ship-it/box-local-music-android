            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteOpenHelper;
            import android.util.Log;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.UUID;
            import java.util.concurrent.locks.Lock;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class IllOI010l extends SQLiteOpenHelper {
                public static final int I00ioIO = 0;
                public final Context I00iOIl;
                public final Oi00IilOloo0 I00iiI;
                public final O1I1OO I00iiO;
                public final boolean I00iio;
                public boolean I00ilI0I1;
                public final OOIlilIiil I00ilO0;
                public boolean I00io1l;

                public IllOI010l(Context context, String str, Oi00IilOloo0 oi00IilOloo0, O1I1OO o1i1oo, boolean z) {
                    Lock lock;
/* 1 */             int i = o1i1oo.I00iiI;
/* 5 */             IllO0loo illO0loo = new IllO0loo();
/* 8 */             illO0loo.I00000oIO = o1i1oo;
/* 10 */            illO0loo.I00000oOI = oi00IilOloo0;
/* 12 */            VarHandle.storeStoreFence();
/* 19 */            super(context, str, null, i, illO0loo);
/* 22 */            this.I00iOIl = context;
/* 24 */            this.I00iiI = oi00IilOloo0;
/* 26 */            this.I00iiO = o1i1oo;
/* 28 */            this.I00iio = z;
/* 43 */            String string = str == null ? UUID.randomUUID().toString() : str;
/* 44 */            File cacheDir = context.getCacheDir();
/* 48 */            OOIlilIiil oOIlilIiil = new OOIlilIiil();
/* 52 */            oOIlilIiil.I00000oIO = false;
/* 69 */            oOIlilIiil.I00000oOI = cacheDir != null ? new File(cacheDir, string.concat(".lck")) : null;
/* 71 */            HashMap map = OOIlilIiil.I0000oI00;
                    synchronized (map) {
                        try {
/* 74 */                    Object reentrantLock = map.get(string);
/* 78 */                    if (reentrantLock == null) {
/* 82 */                        reentrantLock = new ReentrantLock();
/* 85 */                        map.put(string, reentrantLock);
                            }
/* 92 */                    lock = (Lock) reentrantLock;
                        } catch (Throwable th) {
/* 399 */                   throw th;
                        }
                    }
/* 95 */            oOIlilIiil.I0000Il00O = lock;
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           this.I00ilO0 = oOIlilIiil;
                }

                public final Olil0l0 I00000oIO(boolean z) throws IOException {
/* 1 */             OOIlilIiil oOIlilIiil = this.I00ilO0;
                    try {
/* 19 */                oOIlilIiil.I00000oIO((this.I00io1l || getDatabaseName() == null) ? false : true);
/* 22 */                this.I00ilI0I1 = false;
/* 24 */                SQLiteDatabase sQLiteDatabaseI000II = I000II(z);
/* 30 */                if (!this.I00ilI0I1) {
/* 43 */                    IllO0lI illO0lII0000Il00O = I0000Il00O(sQLiteDatabaseI000II);
/* 47 */                    oOIlilIiil.I00000oOI();
/* 50 */                    return illO0lII0000Il00O;
                        }
/* 32 */                close();
/* 35 */                Olil0l0 olil0l0I00000oIO = I00000oIO(z);
/* 39 */                oOIlilIiil.I00000oOI();
/* 42 */                return olil0l0I00000oIO;
                    } catch (Throwable th) {
/* 51 */                oOIlilIiil.I00000oOI();
/* 77 */                throw th;
                    }
                }

                public final IllO0lI I0000Il00O(SQLiteDatabase sQLiteDatabase) {
/* 1 */             Oi00IilOloo0 oi00IilOloo0 = this.I00iiI;
/* 5 */             IllO0lI illO0lI = (IllO0lI) oi00IilOloo0.I00iOIl;
/* 7 */             if (illO0lI != null && illO0lI.I00iOIl.equals(sQLiteDatabase)) {
/* 18 */                return illO0lI;
                    }
/* 21 */            IllO0lI illO0lI2 = new IllO0lI();
/* 24 */            illO0lI2.I00iOIl = sQLiteDatabase;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            oi00IilOloo0.I00iOIl = illO0lI2;
/* 77 */            return illO0lI2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v14 */
                /* JADX WARN: Type inference failed for: r5v9, types: [android.database.sqlite.SQLiteDatabase] */
                public final SQLiteDatabase I000II(boolean z) throws Throwable {
                    File parentFile;
/* 1 */             String databaseName = getDatabaseName();
/* 5 */             boolean z2 = this.I00io1l;
/* 7 */             Context context = this.I00iOIl;
/* 9 */             if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
/* 23 */                parentFile.mkdirs();
/* 30 */                if (!parentFile.isDirectory()) {
/* 48 */                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                        }
                    }
                    try {
                        return z ? getWritableDatabase() : getReadableDatabase();
                    } catch (Throwable unused) {
                        try {
/* 65 */                    Thread.sleep(500L);
                        } catch (InterruptedException unused2) {
                        }
                        try {
/* 77 */                    this = z ? getWritableDatabase() : getReadableDatabase();
/* 81 */                    return this;
                        } catch (Throwable th) {
/* 75 */                    th = th;
/* 84 */                    if (th instanceof IllO11i0oIi0) {
/* 86 */                        IllO11i0oIi0 illO11i0oIi0 = (IllO11i0oIi0) th;
/* 90 */                        int iOrdinal = illO11i0oIi0.I00iOIl.ordinal();
/* 94 */                        th = illO11i0oIi0.I00iiI;
/* 96 */                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
/* 121 */                           throw th;
                                }
/* 108 */                       if (iOrdinal != 4) {
/* 116 */                           I000II.I00000oIO();
/* 119 */                           return null;
                                }
/* 112 */                       if (!(th instanceof SQLiteException)) {
/* 115 */                           throw th;
                                }
                            }
/* 124 */                   if (!(th instanceof SQLiteException) || databaseName == null || !this.I00iio) {
/* 168 */                       throw th;
                            }
/* 132 */                   context.deleteDatabase(databaseName);
                            try {
/* 142 */                       return z ? this.getWritableDatabase() : this.getReadableDatabase();
                            } catch (IllO11i0oIi0 e) {
/* 150 */                       throw e.I00iiI;
                            }
                        }
                    }
                }

                @Override
                public final void close() throws IOException {
/* 1 */             OOIlilIiil oOIlilIiil = this.I00ilO0;
                    try {
/* 5 */                 oOIlilIiil.I00000oIO(oOIlilIiil.I00000oIO);
/* 8 */                 super.close();
/* 14 */                this.I00iiI.I00iOIl = null;
/* 17 */                this.I00io1l = false;
                    } finally {
/* 24 */                oOIlilIiil.I00000oOI();
                    }
                }

                @Override
                public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
/* 1 */             boolean z = this.I00ilI0I1;
/* 3 */             O1I1OO o1i1oo = this.I00iiO;
/* 5 */             if (!z && o1i1oo.I00iiI != sQLiteDatabase.getVersion()) {
/* 16 */                sQLiteDatabase.setMaxSqlCacheSize(1);
                    }
                    try {
/* 19 */                I0000Il00O(sQLiteDatabase);
/* 22 */                o1i1oo.getClass();
                    } catch (Throwable th) {
/* 77 */                throw new IllO11i0oIi0(IllO1ooiO.I00iOIl, th);
                    }
                }

                @Override
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    try {
/* 7 */                 this.I00iiO.I000lI(I0000Il00O(sQLiteDatabase));
                    } catch (Throwable th) {
/* 29 */                throw new IllO11i0oIi0(IllO1ooiO.I00iiI, th);
                    }
                }

                @Override
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 2 */             this.I00ilI0I1 = true;
                    try {
/* 10 */                this.I00iiO.I000o00OoI0I(I0000Il00O(sQLiteDatabase), i, i2);
                    } catch (Throwable th) {
/* 98 */                throw new IllO11i0oIi0(IllO1ooiO.I00iio, th);
                    }
                }

                @Override
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
/* 3 */             if (!this.I00ilI0I1) {
                        try {
/* 11 */                    this.I00iiO.I000oI1ioi(I0000Il00O(sQLiteDatabase));
                        } catch (Throwable th) {
/* 23 */                    throw new IllO11i0oIi0(IllO1ooiO.I00ilI0I1, th);
                        }
                    }
/* 25 */            this.I00io1l = true;
                }

                @Override
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 2 */             this.I00ilI0I1 = true;
                    try {
/* 10 */                this.I00iiO.I00100l0(I0000Il00O(sQLiteDatabase), i, i2);
                    } catch (Throwable th) {
/* 98 */                throw new IllO11i0oIi0(IllO1ooiO.I00iiO, th);
                    }
                }
            }
