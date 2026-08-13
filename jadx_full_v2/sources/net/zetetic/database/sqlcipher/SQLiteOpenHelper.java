            package net.zetetic.database.sqlcipher;

            import android.content.Context;
            import android.database.sqlite.SQLiteException;
            import android.util.Log;
            import java.io.File;
            import java.nio.ByteBuffer;
            import java.nio.CharBuffer;
            import java.nio.charset.Charset;
            import net.zetetic.database.DatabaseErrorHandler;
            import net.zetetic.database.sqlcipher.SQLiteDatabase;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.Oi010OO0;
            import p000.Olil0l0;
            import p000.Olil10OiIi1l;
            
/* 27 */    public abstract class SQLiteOpenHelper implements Olil10OiIi1l {
                public final Context I00iOIl;
                public final String I00iiI;
                public final SQLiteDatabase.CursorFactory I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public SQLiteDatabase I00ilO0;
                public final byte[] I00io1l;
                public boolean I00ioIO;
                public boolean I00l0I0l0lO1;
                public final DatabaseErrorHandler I00l0OO0IO;
                public final SQLiteDatabaseHook I00li1OI;

                /* JADX WARN: Illegal instructions before constructor call */
                public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
                    byte[] bArr;
/* 1 */             if (str2 == null || str2.length() == 0) {
/* 36 */                bArr = new byte[0];
                    } else {
/* 20 */                ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str2));
/* 28 */                bArr = new byte[byteBufferEncode.limit()];
/* 30 */                byteBufferEncode.get(bArr);
                    }
/* 39 */            this(context, str, bArr, cursorFactory, i, i2, databaseErrorHandler, sQLiteDatabaseHook, z);
                }

                public final SQLiteDatabase I00000oIO(boolean z) {
                    SQLiteDatabase sQLiteDatabaseI00OOll1;
/* 3 */             Context context = this.I00iOIl;
/* 13 */            SQLiteDatabase sQLiteDatabase = this.I00ilO0;
/* 16 */            if (sQLiteDatabase != null) {
/* 22 */                if (!sQLiteDatabase.isOpen()) {
/* 24 */                    this.I00ilO0 = null;
                        } else if (!z || !this.I00ilO0.I00OIl()) {
/* 37 */                    return this.I00ilO0;
                        }
                    }
/* 42 */            if (this.I00ioIO) {
/* 433 */               I000II.I001IO000("getDatabase called recursively");
/* 436 */               return null;
                    }
/* 44 */            SQLiteDatabase sQLiteDatabase2 = this.I00ilO0;
                    try {
/* 48 */                this.I00ioIO = true;
/* 52 */                String str = this.I00iiI;
/* 54 */                if (sQLiteDatabase2 == null) {
/* 72 */                    if (str == null) {
/* 85 */                        sQLiteDatabaseI00OOll1 = SQLiteDatabase.I00OOll1(":memory:", new byte[0], null, 268435456, null, null);
                            } else {
                                try {
/* 112 */                           String path = !str.startsWith("file:") ? context.getDatabasePath(str).getPath() : str;
/* 124 */                           File file = new File(new File(path).getParent());
/* 131 */                           if (!file.exists()) {
/* 133 */                               file.mkdirs();
                                    }
/* 160 */                           sQLiteDatabaseI00OOll1 = SQLiteDatabase.I00OOll1(path, this.I00io1l, this.I00iiO, this.I00l0I0l0lO1 ? 805306368 : 268435456, this.I00l0OO0IO, this.I00li1OI);
                                } catch (SQLiteException e) {
/* 165 */                           if (z) {
/* 418 */                               throw e;
                                    }
/* 184 */                           Log.e("SQLiteOpenHelper", "Couldn't open " + str + " for writing (will try read-only):", e);
/* 209 */                           sQLiteDatabaseI00OOll1 = SQLiteDatabase.I00OOll1(context.getDatabasePath(str).getPath(), this.I00io1l, this.I00iiO, 1, this.I00l0OO0IO, this.I00li1OI);
                                }
                            }
/* 89 */                    sQLiteDatabase2 = sQLiteDatabaseI00OOll1;
                        } else if (z && sQLiteDatabase2.I00OIl()) {
/* 64 */                    sQLiteDatabase2.I00iiI();
                        }
/* 214 */               I0000Il00O();
/* 217 */               int iI00IoiI = sQLiteDatabase2.I00IoiI();
/* 221 */               int i = this.I00iio;
/* 223 */               if (iI00IoiI != i) {
/* 229 */                   if (sQLiteDatabase2.I00OIl()) {
/* 383 */                       throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.I00IoiI() + " to " + i + ": " + str);
                            }
/* 231 */                   if (iI00IoiI > 0 && iI00IoiI < this.I00ilI0I1) {
/* 243 */                       File file2 = new File(sQLiteDatabase2.I00IOO());
/* 246 */                       sQLiteDatabase2.I000II();
/* 253 */                       if (!SQLiteDatabase.I000l1(file2)) {
/* 296 */                           throw new IllegalStateException("Unable to delete obsolete database " + str + " with version " + iI00IoiI);
                                }
/* 255 */                       this.I00ioIO = false;
/* 257 */                       SQLiteDatabase sQLiteDatabaseI00000oIO = I00000oIO(z);
/* 261 */                       this.I00ioIO = false;
/* 265 */                       if (sQLiteDatabase2 != this.I00ilO0) {
/* 267 */                           sQLiteDatabase2.I000II();
                                }
/* 270 */                       return sQLiteDatabaseI00000oIO;
                            }
/* 297 */                   sQLiteDatabase2.I000O01llI0(true);
                            try {
/* 300 */                       if (iI00IoiI == 0) {
/* 302 */                           I000II(sQLiteDatabase2);
                                } else if (iI00IoiI > i) {
/* 310 */                           I000O01llI0(sQLiteDatabase2, iI00IoiI, i);
                                } else {
/* 314 */                           I00100l0(sQLiteDatabase2, iI00IoiI, i);
                                }
/* 332 */                       sQLiteDatabase2.I001i1lo1io("PRAGMA user_version = " + i, null);
/* 335 */                       sQLiteDatabase2.I00O10llo();
/* 338 */                       sQLiteDatabase2.I00OloOo();
                            } catch (Throwable th) {
/* 342 */                       sQLiteDatabase2.I00OloOo();
/* 345 */                       throw th;
                            }
                        }
/* 384 */               I000l1(sQLiteDatabase2);
/* 391 */               if (sQLiteDatabase2.I00OIl()) {
/* 410 */                   Log.w("SQLiteOpenHelper", "Opened " + str + " in read-only mode");
                        }
/* 413 */               this.I00ilO0 = sQLiteDatabase2;
/* 415 */               this.I00ioIO = false;
/* 417 */               return sQLiteDatabase2;
                    } catch (Throwable th2) {
/* 419 */               this.I00ioIO = false;
/* 421 */               if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.I00ilO0) {
/* 427 */                   sQLiteDatabase2.I000II();
                        }
/* 430 */               throw th2;
                    }
                }

                public abstract void I000II(SQLiteDatabase sQLiteDatabase);

                public void I000O01llI0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 215 */           throw new SQLiteException(IIl001iO0Io.I000l1(i, i2, "Can't downgrade database from version ", " to "));
                }

                public abstract void I00100l0(SQLiteDatabase sQLiteDatabase, int i, int i2);

                @Override
                public final Olil0l0 I00Oio() {
                    SQLiteDatabase sQLiteDatabaseI00000oIO;
                    synchronized (this) {
/* 3 */                 sQLiteDatabaseI00000oIO = I00000oIO(true);
                    }
/* 8 */             return sQLiteDatabaseI00000oIO;
                }

                @Override
                public final synchronized void close() {
/* 4 */             if (this.I00ioIO) {
/* 36 */                throw new IllegalStateException("Closed during initialization");
                    }
/* 6 */             SQLiteDatabase sQLiteDatabase = this.I00ilO0;
/* 8 */             if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
/* 18 */                this.I00ilO0.I000II();
/* 22 */                this.I00ilO0 = null;
                    }
                }

                @Override
                public final String getDatabaseName() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void setWriteAheadLoggingEnabled(boolean z) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.I00l0I0l0lO1 != z) {
/* 6 */                         SQLiteDatabase sQLiteDatabase = this.I00ilO0;
/* 8 */                         if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.I00ilO0.I00OIl()) {
/* 24 */                            SQLiteDatabase sQLiteDatabase2 = this.I00ilO0;
/* 26 */                            if (z) {
/* 28 */                                sQLiteDatabase2.I00Iooi00oi();
                                    } else {
/* 34 */                                sQLiteDatabase2.I001IIilI0O();
                                    }
                                }
/* 37 */                        this.I00l0I0l0lO1 = z;
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }

/* 28 */        public void I0000Il00O() {
                }

/* 42 */        public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
/* 43 */            this(context, str, cursorFactory, i, 0, databaseErrorHandler);
                }

/* 43 */        public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler) {
/* 44 */            this(context, str, new byte[0], cursorFactory, i, i2, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
                }

/* 44 */        public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
                    if (i >= 1) {
/* 46 */                this.I00iOIl = context;
/* 47 */                this.I00iiI = str;
/* 48 */                this.I00io1l = bArr;
/* 49 */                this.I00iiO = cursorFactory;
/* 50 */                this.I00iio = i;
/* 51 */                this.I00l0OO0IO = databaseErrorHandler;
/* 52 */                this.I00li1OI = sQLiteDatabaseHook;
/* 53 */                this.I00l0I0l0lO1 = z;
/* 54 */                this.I00ilI0I1 = Math.max(0, i2);
                        return;
                    }
/* 57 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Version must be >= 1, was "));
                    throw null;
                }

/* 48 */        public void I000l1(SQLiteDatabase sQLiteDatabase) {
                }

/* 57 */        public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
/* 58 */            this(context, str, cursorFactory, i, null);
                }
            }
