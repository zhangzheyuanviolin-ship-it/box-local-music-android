            package net.zetetic.database.sqlcipher;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabaseCorruptException;
            import android.database.sqlite.SQLiteException;
            import android.os.Looper;
            import android.text.TextUtils;
            import android.util.EventLog;
            import android.util.Log;
            import android.util.Pair;
            import java.io.File;
            import java.io.FileFilter;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.WeakHashMap;
            import net.zetetic.database.DatabaseErrorHandler;
            import net.zetetic.database.DatabaseUtils;
            import net.zetetic.database.DefaultDatabaseErrorHandler;
            import net.zetetic.database.sqlcipher.SQLiteSession;
            import p000.I000II;
            import p000.IIOOoll;
            import p000.IIl001iO0Io;
            import p000.Olil0l0;
            import p000.OlilIol;
            import p000.OlilOOI;
            
            public final class SQLiteDatabase extends SQLiteClosable implements Olil0l0 {
                public static final WeakHashMap I00l0OO0IO = new WeakHashMap();
                public static final String[] I00li1OI = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
                public ThreadLocal I00iiI;
                public CursorFactory I00iiO;
                public DatabaseErrorHandler I00iio;
                public Object I00ilI0I1;
                public CloseGuard I00ilO0;
                public SQLiteDatabaseConfiguration I00io1l;
                public SQLiteConnectionPool I00ioIO;
                public boolean I00l0I0l0lO1;

                class C00422 implements SQLiteTransactionListener {
                }

                class C00433 implements SQLiteTransactionListener {
                }

                class C00444 implements FileFilter {
                    public String I00000oIO;

                    @Override
                    public final boolean accept(File file) {
/* 7 */                 return file.getName().startsWith(this.I00000oIO);
                    }
                }

                public interface CursorFactory {
                    Cursor I00000oIO();
                }

                public interface CustomFunction {
                    void I00000oIO();
                }

                public static boolean I000l1(File file) {
/* 97 */            boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
/* 98 */            File parentFile = file.getParentFile();
/* 102 */           if (parentFile != null) {
/* 121 */               String str = file.getName() + "-mj";
/* 127 */               C00444 c00444 = new C00444();
/* 130 */               c00444.I00000oIO = str;
/* 132 */               VarHandle.storeStoreFence();
/* 135 */               File[] fileArrListFiles = parentFile.listFiles(c00444);
/* 139 */               if (fileArrListFiles != null) {
/* 143 */                   for (File file2 : fileArrListFiles) {
/* 151 */                       zDelete |= file2.delete();
                            }
                        }
                    }
/* 186 */           return zDelete;
                }

                public static int I00IioO0OiOi(boolean z) {
/* 5 */             int i = z ? 1 : 2;
/* 6 */             Looper looperMyLooper = Looper.myLooper();
                    return (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) ? i : i | 4;
                }

                public static SQLiteDatabase I00OOll1(String str, byte[] bArr, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
/* 3 */             SQLiteDatabase sQLiteDatabase = new SQLiteDatabase();
/* 11 */            sQLiteDatabase.I00iiI = new ThreadLocal<SQLiteSession>() {
                        @Override
                        public final SQLiteSession initialValue() {
                            SQLiteConnectionPool sQLiteConnectionPool;
/* 1 */                     SQLiteDatabase sQLiteDatabase2 = SQLiteDatabase.this;
                            synchronized (sQLiteDatabase2.I00ilI0I1) {
/* 6 */                         sQLiteDatabase2.I00ioIO();
/* 9 */                         sQLiteConnectionPool = sQLiteDatabase2.I00ioIO;
                            }
/* 14 */                    return new SQLiteSession(sQLiteConnectionPool);
                        }
                    };
/* 15 */            Object obj = new Object();
/* 18 */            sQLiteDatabase.I00ilI0I1 = obj;
/* 25 */            sQLiteDatabase.I00ilO0 = new CloseGuard();
/* 27 */            sQLiteDatabase.I00iiO = cursorFactory;
/* 29 */            if (databaseErrorHandler == null) {
/* 34 */                databaseErrorHandler = new DefaultDatabaseErrorHandler();
                    }
/* 37 */            sQLiteDatabase.I00iio = databaseErrorHandler;
/* 41 */            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = new SQLiteDatabaseConfiguration(str, i, bArr, sQLiteDatabaseHook);
/* 44 */            sQLiteDatabase.I00io1l = sQLiteDatabaseConfiguration;
/* 46 */            VarHandle.storeStoreFence();
                    try {
                        try {
/* 49 */                    sQLiteDatabase.I00Ol00();
/* 52 */                    return sQLiteDatabase;
                        } catch (SQLiteDatabaseCorruptException unused) {
                            synchronized (obj) {
/* 62 */                        EventLog.writeEvent(75004, sQLiteDatabaseConfiguration.I00000oOI);
/* 65 */                        databaseErrorHandler.I00000oIO(sQLiteDatabase);
/* 68 */                        sQLiteDatabase.I00Ol00();
/* 71 */                        return sQLiteDatabase;
                            }
                        }
                    } catch (SQLiteException e) {
/* 81 */                StringBuilder sb = new StringBuilder("Failed to open database '");
                        synchronized (sQLiteDatabase.I00ilI0I1) {
/* 92 */                    sb.append(sQLiteDatabase.I00io1l.I00000oOI);
/* 97 */                    sb.append("'.");
/* 104 */                   Log.e("SQLiteDatabase", sb.toString(), e);
/* 107 */                   sQLiteDatabase.I000II();
/* 110 */                   throw e;
                        }
                    }
                }

                @Override
                public final void I0000Il00O() {
/* 2 */             I00100l0(false);
                }

                public final void I000O01llI0(boolean z) {
/* 1 */             I00000oIO();
                    try {
/* 19 */                I00Io1lO().I00000oOI(z ? 2 : 1, I00IioO0OiOi(false), null);
                    } finally {
/* 27 */                I000II();
                    }
                }

                public final void I00100l0(boolean z) {
                    SQLiteConnectionPool sQLiteConnectionPool;
                    Throwable th;
                    synchronized (this.I00ilI0I1) {
                        try {
/* 4 */                     CloseGuard closeGuard = this.I00ilO0;
/* 7 */                     if (closeGuard != null) {
/* 9 */                         if (z && (th = closeGuard.I00000oIO) != null) {
/* 17 */                            Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
                                }
/* 22 */                        this.I00ilO0.I00000oIO = null;
                            }
/* 27 */                    sQLiteConnectionPool = this.I00ioIO;
/* 29 */                    this.I00ioIO = null;
                        } catch (Throwable th2) {
/* 186 */                   throw th2;
                        }
                    }
/* 32 */            if (z) {
/* 51 */                return;
                    }
/* 34 */            WeakHashMap weakHashMap = I00l0OO0IO;
                    synchronized (weakHashMap) {
/* 37 */                weakHashMap.remove(this);
                    }
/* 41 */            if (sQLiteConnectionPool != null) {
/* 44 */                sQLiteConnectionPool.I000II(false);
                    }
                }

                @Override
                public final void I0010o() {
/* 2 */             I000O01llI0(true);
                }

                @Override
                public final void I001IIilI0O() {
                    synchronized (this.I00ilI0I1) {
                        try {
/* 4 */                     I00ioIO();
/* 7 */                     SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I00io1l;
/* 9 */                     int i = sQLiteDatabaseConfiguration.I0000Il00O;
/* 15 */                    if ((i & 536870912) == 0) {
/* 18 */                        return;
                            }
/* 25 */                    sQLiteDatabaseConfiguration.I0000Il00O = i & (-536870913);
                            try {
/* 29 */                        this.I00ioIO.I00IOO(sQLiteDatabaseConfiguration);
                            } catch (RuntimeException e) {
                                this.I00io1l.I0000Il00O |= 536870912;
/* 42 */                        throw e;
                            }
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                @Override
                public final void I001IO000(String str) {
/* 2 */             I001i1lo1io(str, null);
                }

                public final void I001i1lo1io(String str, Object[] objArr) {
                    boolean z;
/* 1 */             I00000oIO();
                    try {
/* 9 */                 if (DatabaseUtils.I00000oIO(str) == 3) {
                            synchronized (this.I00ilI0I1) {
                                try {
/* 16 */                            if (this.I00l0I0l0lO1) {
/* 24 */                                z = false;
                                    } else {
/* 18 */                                z = true;
/* 19 */                                this.I00l0I0l0lO1 = true;
                                    }
                                } catch (Throwable th) {
/* 35 */                            throw th;
                                }
                            }
/* 26 */                    if (z) {
/* 28 */                        I001IIilI0O();
                            }
                        }
/* 39 */                SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr, null);
                        try {
/* 42 */                    sQLiteStatement.I000l1();
                        } finally {
/* 53 */                    sQLiteStatement.I000II();
                        }
                    } finally {
/* 57 */                I000II();
                    }
                }

                @Override
                public final OlilOOI I001iOo1i0O(String str) {
/* 1 */             I00000oIO();
                    try {
/* 7 */                 return new SQLiteStatement(this, str, null, null);
                    } finally {
/* 15 */                I000II();
                    }
                }

                public final List I001l0I00() {
/* 3 */             ArrayList arrayList = new ArrayList();
                    synchronized (this.I00ilI0I1) {
                        try {
/* 11 */                    Cursor cursorI00iOIl = null;
/* 12 */                    if (this.I00ioIO == null) {
/* 11 */                        return null;
                            }
/* 20 */                    if (!this.I00l0I0l0lO1) {
/* 33 */                        arrayList.add(new Pair("main", this.I00io1l.I00000oIO));
/* 37 */                        return arrayList;
                            }
/* 38 */                    I00000oIO();
                            try {
                                try {
/* 42 */                            cursorI00iOIl = I00iOIl();
/* 50 */                            while (cursorI00iOIl.moveToNext()) {
/* 67 */                                arrayList.add(new Pair(cursorI00iOIl.getString(1), cursorI00iOIl.getString(2)));
                                    }
/* 73 */                            cursorI00iOIl.close();
/* 79 */                            return arrayList;
                                } catch (Throwable th) {
/* 82 */                            if (cursorI00iOIl != null) {
/* 84 */                                cursorI00iOIl.close();
                                    }
/* 87 */                            throw th;
                                }
                            } finally {
/* 88 */                        I000II();
                            }
                        } catch (Throwable th2) {
/* 113 */                   throw th2;
                        }
                    }
                }

                public final String I00IOO() {
                    String str;
                    synchronized (this.I00ilI0I1) {
/* 6 */                 str = this.I00io1l.I00000oIO;
                    }
/* 9 */             return str;
                }

                public final SQLiteSession I00Io1lO() {
/* 7 */             return (SQLiteSession) this.I00iiI.get();
                }

                @Override
                public final Cursor I00IoIO0lI(IIOOoll iIOOoll) {
/* 3 */             I00000oIO();
                    try {
/* 10 */                String str = ((OlilIol) iIOOoll.I00iiI).I00iiI;
/* 15 */                SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, "", null);
/* 20 */                SQLiteQuery sQLiteQuery = new SQLiteQuery(this, str, null);
/* 23 */                iIOOoll.I00iOIl(sQLiteQuery);
/* 28 */                return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
                    } finally {
/* 36 */                I000II();
                    }
                }

                public final int I00IoiI() {
/* 3 */             I00000oIO();
                    try {
/* 9 */                 SQLiteStatement sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;", null, null);
                        try {
/* 15 */                    sQLiteStatement.I00000oIO();
                            try {
                                try {
/* 20 */                            SQLiteSession sQLiteSessionI00Io1lO = sQLiteStatement.I00iiI.I00Io1lO();
/* 24 */                            String str = sQLiteStatement.I00iiO;
/* 26 */                            Object[] objArr = sQLiteStatement.I00io1l;
/* 28 */                            SQLiteDatabase sQLiteDatabase = sQLiteStatement.I00iiI;
/* 30 */                            boolean z = sQLiteStatement.I00iio;
/* 32 */                            sQLiteDatabase.getClass();
/* 39 */                            long jI000II = sQLiteSessionI00Io1lO.I000II(I00IioO0OiOi(z), str, objArr);
/* 46 */                            sQLiteStatement.I000II();
/* 53 */                            return Long.valueOf(jI000II).intValue();
                                } catch (SQLiteDatabaseCorruptException e) {
/* 61 */                            SQLiteDatabase sQLiteDatabase2 = sQLiteStatement.I00iiI;
                                    synchronized (sQLiteDatabase2.I00ilI0I1) {
/* 74 */                                EventLog.writeEvent(75004, sQLiteDatabase2.I00io1l.I00000oOI);
/* 79 */                                sQLiteDatabase2.I00iio.I00000oIO(sQLiteDatabase2);
/* 82 */                                throw e;
                                    }
                                }
                            } finally {
/* 86 */                        sQLiteStatement.I000II();
                            }
                        } catch (Throwable th) {
/* 94 */                    throw th;
                        }
                    } finally {
/* 96 */                I000II();
                    }
                }

                @Override
                public final boolean I00Iooi00oi() {
                    synchronized (this.I00ilI0I1) {
                        try {
/* 4 */                     I00ioIO();
/* 7 */                     SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I00io1l;
/* 9 */                     int i = sQLiteDatabaseConfiguration.I0000Il00O;
/* 16 */                    if ((i & 536870912) != 0) {
/* 15 */                        return true;
                            }
/* 29 */                    if ((i & 1) == 1) {
/* 23 */                        return false;
                            }
/* 41 */                    if (sQLiteDatabaseConfiguration.I00000oIO.equalsIgnoreCase(":memory:")) {
/* 47 */                        Log.i("SQLiteDatabase", "can't enable WAL for memory databases.");
/* 23 */                        return false;
                            }
/* 54 */                    if (this.I00l0I0l0lO1) {
/* 63 */                        if (Log.isLoggable("SQLiteDatabase", 3)) {
/* 67 */                            String str = this.I00io1l.I00000oOI;
                                }
/* 23 */                        return false;
                            }
/* 71 */                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.I00io1l;
                            sQLiteDatabaseConfiguration2.I0000Il00O |= 536870912;
                            try {
/* 80 */                        this.I00ioIO.I00IOO(sQLiteDatabaseConfiguration2);
/* 15 */                        return true;
                            } catch (RuntimeException e) {
                                this.I00io1l.I0000Il00O &= -536870913;
/* 96 */                        throw e;
                            }
                        } finally {
                        }
                    }
                }

                @Override
                public final void I00O0o1oo(Object[] objArr) {
/* 3 */             I001i1lo1io("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
                }

                @Override
                public final void I00O10llo() {
/* 1 */             I00000oIO();
                    try {
/* 8 */                 SQLiteSession.Transaction transaction = I00Io1lO().I0000oI00;
/* 10 */                if (transaction == null) {
/* 38 */                    throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
                        }
/* 14 */                if (transaction.I00000oOI) {
/* 30 */                    throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
                        }
/* 17 */                transaction.I00000oOI = true;
                    } finally {
/* 40 */                I000II();
                    }
                }

                @Override
                public final void I00OI1() {
/* 2 */             I000O01llI0(false);
                }

                public final boolean I00OIl() {
                    boolean z;
                    synchronized (this.I00ilI0I1) {
/* 8 */                 z = true;
/* 10 */                if ((this.I00io1l.I0000Il00O & 1) != 1) {
/* 13 */                    z = false;
                        }
                    }
/* 15 */            return z;
                }

                public final void I00Ol00() {
                    synchronized (this.I00ilI0I1) {
/* 10 */                this.I00ioIO = SQLiteConnectionPool.I001i1lo1io(this.I00io1l);
/* 14 */                this.I00ilO0.I00000oIO();
                    }
/* 18 */            WeakHashMap weakHashMap = I00l0OO0IO;
                    synchronized (weakHashMap) {
/* 22 */                weakHashMap.put(this, null);
                    }
                }

                @Override
                public final void I00OloOo() {
/* 1 */             I00000oIO();
                    try {
/* 9 */                 I00Io1lO().I0000Il00O(null);
                    } finally {
/* 17 */                I000II();
                    }
                }

                public final Cursor I00iOIl() {
/* 3 */             I00000oIO();
                    try {
/* 9 */                 SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, "pragma database_list;", null, null);
/* 12 */                CursorFactory cursorFactory = this.I00iiO;
/* 14 */                String str = sQLiteDirectCursorDriver.I00000oOI;
/* 24 */                SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.I00000oIO, sQLiteDirectCursorDriver.I0000Il00O, sQLiteDirectCursorDriver.I0000O);
                        try {
/* 37 */                    return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, str, sQLiteQuery) : cursorFactory.I00000oIO();
                        } catch (RuntimeException e) {
/* 45 */                    sQLiteQuery.I000II();
/* 48 */                    throw e;
                        }
                    } finally {
/* 50 */                I000II();
                    }
                }

                public final void I00iiI() {
                    synchronized (this.I00ilI0I1) {
                        try {
/* 4 */                     I00ioIO();
/* 7 */                     SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I00io1l;
/* 9 */                     int i = sQLiteDatabaseConfiguration.I0000Il00O;
/* 13 */                    boolean z = true;
/* 14 */                    if ((i & 1) != 1) {
/* 17 */                        z = false;
                            }
/* 18 */                    if (z) {
/* 26 */                        sQLiteDatabaseConfiguration.I0000Il00O = i & (-2);
                                try {
/* 30 */                            this.I00ioIO.I00IOO(sQLiteDatabaseConfiguration);
                                } catch (RuntimeException e) {
/* 38 */                            this.I00io1l.I0000Il00O = i;
/* 40 */                            throw e;
                                }
                            }
                        } finally {
                        }
                    }
                }

                public final void I00ioIO() {
/* 3 */             if (this.I00ioIO != null) {
/* 5 */                 return;
                    }
/* 23 */            I000II.I001IO000(IIl001iO0Io.I00100l0(new StringBuilder("The database '"), this.I00io1l.I00000oOI, "' is not open."));
                }

                @Override
                public final boolean I00li1OI() {
/* 1 */             I00000oIO();
                    try {
/* 14 */                return I00Io1lO().I0000oI00 != null;
                    } finally {
/* 20 */                I000II();
                    }
                }

                @Override
                public final boolean I00o0l1o1o0() {
                    boolean z;
                    synchronized (this.I00ilI0I1) {
/* 4 */                 I00ioIO();
/* 18 */                z = (this.I00io1l.I0000Il00O & 536870912) != 0;
                    }
/* 20 */            return z;
                }

                @Override
                public final int I00olI(ContentValues contentValues, Object[] objArr) {
/* 5 */             int length = objArr.length;
/* 6 */             String[] strArr = new String[length];
/* 8 */             int i = 0;
/* 11 */            for (int i2 = 0; i2 < objArr.length; i2++) {
/* 19 */                strArr[i2] = objArr[i2].toString();
                    }
/* 28 */            if (contentValues.size() == 0) {
/* 176 */               I000II.I000iOII("Empty values");
/* 8 */                 return 0;
                    }
/* 30 */            I00000oIO();
                    try {
/* 37 */                StringBuilder sb = new StringBuilder(120);
/* 42 */                sb.append("UPDATE ");
/* 50 */                sb.append(I00li1OI[3]);
/* 53 */                sb.append("WorkSpec");
/* 58 */                sb.append(" SET ");
/* 61 */                int size = contentValues.size();
/* 65 */                int i3 = length + size;
/* 66 */                Object[] objArr2 = new Object[i3];
/* 80 */                for (String str : contentValues.keySet()) {
/* 97 */                    sb.append(i > 0 ? "," : "");
/* 100 */                   sb.append(str);
/* 109 */                   objArr2[i] = contentValues.get(str);
/* 113 */                   sb.append("=?");
/* 103 */                   i++;
                        }
/* 119 */               for (int i4 = size; i4 < i3; i4++) {
/* 125 */                   objArr2[i4] = strArr[i4 - size];
                        }
/* 134 */               if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
/* 138 */                   sb.append(" WHERE ");
/* 141 */                   sb.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
                        }
/* 151 */               SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr2, null);
                        try {
/* 154 */                   int iI000l1 = sQLiteStatement.I000l1();
/* 161 */                   I000II();
/* 164 */                   return iI000l1;
                        } finally {
/* 166 */                   sQLiteStatement.I000II();
                        }
                    } catch (Throwable th) {
/* 170 */               I000II();
/* 173 */               throw th;
                    }
                }

                public final void finalize() throws Throwable {
                    try {
/* 2 */                 I00100l0(true);
                    } finally {
/* 10 */                super.finalize();
                    }
                }

                @Override
                public final boolean isOpen() {
                    boolean z;
                    synchronized (this.I00ilI0I1) {
/* 10 */                z = this.I00ioIO != null;
                    }
/* 12 */            return z;
                }

                public final String toString() {
/* 15 */            return "SQLiteDatabase: " + I00IOO();
                }
            }
