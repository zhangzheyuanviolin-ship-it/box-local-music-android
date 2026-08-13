            package net.zetetic.database.sqlcipher;

            import android.database.CursorWindow;
            import android.database.DatabaseUtils;
            import android.os.CancellationSignal;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.locks.LockSupport;
            import net.zetetic.database.sqlcipher.SQLiteConnectionPool;
            import p000.I000II;
            
            public final class SQLiteSession {
                public final SQLiteConnectionPool I00000oIO;
                public SQLiteConnection I00000oOI;
                public int I0000Il00O;
                public Transaction I0000O;
                public Transaction I0000oI00;

                public static final class Transaction {
                    public Transaction I00000oIO;
                    public boolean I00000oOI;
                    public boolean I0000Il00O;
                }

                public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
/* 4 */             if (sQLiteConnectionPool != null) {
/* 6 */                 this.I00000oIO = sQLiteConnectionPool;
                    } else {
/* 11 */                I000II.I000iOII("connectionPool must not be null");
/* 49 */                throw null;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v2, types: [int] */
                /* JADX WARN: Type inference failed for: r23v0, types: [android.os.CancellationSignal] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(String str, int i, CancellationSignal cancellationSignal) {
                    ?? r1;
                    SQLiteConnection sQLiteConnectionI00Ol00;
                    boolean z;
                    SQLiteConnection sQLiteConnection;
                    RuntimeException runtimeException;
                    boolean z2;
/* 11 */            boolean z3 = true;
/* 12 */            if (this.I00000oOI == null) {
/* 14 */                SQLiteConnectionPool sQLiteConnectionPool = this.I00000oIO;
/* 23 */                boolean z4 = (i & 2) != 0;
                        synchronized (sQLiteConnectionPool.I00iiI) {
                            try {
/* 27 */                        sQLiteConnectionPool.I00OOll1();
/* 30 */                        if (cancellationSignal != 0) {
/* 32 */                            cancellationSignal.throwIfCanceled();
                                }
/* 47 */                        sQLiteConnectionI00Ol00 = !z4 ? sQLiteConnectionPool.I00Ol00(i, str) : null;
/* 48 */                        if (sQLiteConnectionI00Ol00 == null) {
/* 50 */                            sQLiteConnectionI00Ol00 = sQLiteConnectionPool.I00iOIl(i);
                                }
/* 54 */                        if (sQLiteConnectionI00Ol00 != null) {
/* 57 */                            z2 = true;
                                } else {
/* 66 */                            int i2 = (i & 4) != 0 ? 1 : 0;
/* 67 */                            long jUptimeMillis = SystemClock.uptimeMillis();
/* 71 */                            Thread threadCurrentThread = Thread.currentThread();
/* 75 */                            SQLiteConnectionPool.ConnectionWaiter connectionWaiter = sQLiteConnectionPool.I00ioIO;
/* 77 */                            if (connectionWaiter != null) {
/* 81 */                                sQLiteConnectionPool.I00ioIO = connectionWaiter.I00000oIO;
/* 83 */                                connectionWaiter.I00000oIO = null;
                                    } else {
/* 88 */                                connectionWaiter = new SQLiteConnectionPool.ConnectionWaiter();
                                    }
/* 91 */                            connectionWaiter.I00000oOI = threadCurrentThread;
/* 93 */                            connectionWaiter.I0000Il00O = jUptimeMillis;
/* 95 */                            connectionWaiter.I0000O = i2;
/* 97 */                            connectionWaiter.I0000oI00 = z4;
/* 99 */                            connectionWaiter.I0001Ioi1lo = str;
/* 101 */                           connectionWaiter.I000II = i;
/* 103 */                           SQLiteConnectionPool.ConnectionWaiter connectionWaiter2 = sQLiteConnectionPool.I00l0I0l0lO1;
/* 105 */                           SQLiteConnectionPool.ConnectionWaiter connectionWaiter3 = null;
                                    while (true) {
/* 106 */                               if (connectionWaiter2 == null) {
                                            break;
                                        }
/* 110 */                               if (i2 > connectionWaiter2.I0000O) {
/* 112 */                                   connectionWaiter.I00000oIO = connectionWaiter2;
                                            break;
                                        } else {
/* 119 */                                   connectionWaiter3 = connectionWaiter2;
/* 115 */                                   connectionWaiter2 = connectionWaiter2.I00000oIO;
                                        }
                                    }
/* 123 */                           if (connectionWaiter3 != null) {
/* 125 */                               connectionWaiter3.I00000oIO = connectionWaiter;
                                    } else {
/* 128 */                               sQLiteConnectionPool.I00l0I0l0lO1 = connectionWaiter;
                                    }
/* 130 */                           int i3 = connectionWaiter.I000OiO;
/* 133 */                           if (cancellationSignal != 0) {
/* 137 */                               SQLiteConnectionPool.C00401 c00401 = new SQLiteConnectionPool.C00401();
/* 140 */                               c00401.I0000Il00O = sQLiteConnectionPool;
/* 142 */                               c00401.I00000oIO = connectionWaiter;
/* 144 */                               c00401.I00000oOI = i3;
/* 146 */                               VarHandle.storeStoreFence();
/* 149 */                               cancellationSignal.setOnCancelListener(c00401);
                                    }
                                    try {
/* 156 */                               long j = connectionWaiter.I0000Il00O + 30000;
/* 157 */                               long j2 = 30000;
                                        while (true) {
/* 164 */                                   if (sQLiteConnectionPool.I00iiO.compareAndSet(z3, false)) {
                                                synchronized (sQLiteConnectionPool.I00iiI) {
/* 169 */                                           sQLiteConnectionPool.I00iiI();
                                                }
                                            }
/* 182 */                                   z = z3;
/* 185 */                                   LockSupport.parkNanos(sQLiteConnectionPool, j2 * 1000000);
/* 188 */                                   Thread.interrupted();
                                            synchronized (sQLiteConnectionPool.I00iiI) {
                                                try {
/* 194 */                                           sQLiteConnectionPool.I00OOll1();
/* 197 */                                           sQLiteConnection = connectionWaiter.I000O01llI0;
/* 199 */                                           runtimeException = connectionWaiter.I000OOo1O;
/* 201 */                                           if (sQLiteConnection != null || runtimeException != null) {
                                                        break;
                                                    }
/* 206 */                                           long jUptimeMillis2 = SystemClock.uptimeMillis();
/* 212 */                                           if (jUptimeMillis2 < j) {
/* 214 */                                               j2 = jUptimeMillis2 - j;
                                                    } else {
/* 220 */                                               sQLiteConnectionPool.I000l1(i, jUptimeMillis2 - connectionWaiter.I0000Il00O);
/* 223 */                                               j = jUptimeMillis2 + 30000;
/* 225 */                                               j2 = 30000;
                                                    }
                                                } finally {
                                                }
                                            }
/* 253 */                                   if (cancellationSignal != 0) {
/* 255 */                                       cancellationSignal.setOnCancelListener(null);
                                            }
/* 258 */                                   sQLiteConnectionI00Ol00 = sQLiteConnection;
                                            z2 = z;
/* 227 */                                   z3 = z ? 1 : 0;
                                        }
/* 233 */                               connectionWaiter.I00000oIO = sQLiteConnectionPool.I00ioIO;
/* 235 */                               connectionWaiter.I00000oOI = null;
/* 237 */                               connectionWaiter.I0001Ioi1lo = null;
/* 239 */                               connectionWaiter.I000O01llI0 = null;
/* 241 */                               connectionWaiter.I000OOo1O = null;
                                        connectionWaiter.I000OiO += z ? 1 : 0;
/* 248 */                               sQLiteConnectionPool.I00ioIO = connectionWaiter;
/* 250 */                               if (sQLiteConnection == null) {
/* 262 */                                   throw runtimeException;
                                        }
/* 253 */                               if (cancellationSignal != 0) {
                                        }
/* 258 */                               sQLiteConnectionI00Ol00 = sQLiteConnection;
                                        z2 = z;
                                    } catch (Throwable th) {
/* 265 */                               if (cancellationSignal != 0) {
/* 267 */                                   cancellationSignal.setOnCancelListener(null);
                                        }
/* 270 */                               throw th;
                                    }
                                }
                            } finally {
                            }
                        }
/* 259 */               this.I00000oOI = sQLiteConnectionI00Ol00;
                        r1 = z2;
                    } else {
/* 273 */               r1 = 1;
                    }
                    this.I0000Il00O += r1;
                }

                public final void I00000oOI(int i, int i2, CancellationSignal cancellationSignal) {
/* 1 */             Transaction transaction = this.I0000oI00;
/* 3 */             if (transaction != null && transaction.I00000oOI) {
/* 12 */                I000II.I001IO000("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
/* 15 */                return;
                    }
/* 16 */            if (cancellationSignal != null) {
/* 18 */                cancellationSignal.throwIfCanceled();
                    }
/* 24 */            if (this.I0000oI00 == null) {
/* 26 */                I00000oIO(null, i2, cancellationSignal);
                    }
                    try {
/* 31 */                if (this.I0000oI00 == null) {
/* 33 */                    SQLiteConnection sQLiteConnection = this.I00000oOI;
/* 36 */                    if (i == 1) {
/* 57 */                        sQLiteConnection.I000O01llI0("BEGIN IMMEDIATE;", null, cancellationSignal);
                            } else if (i != 2) {
/* 43 */                        sQLiteConnection.I000O01llI0("BEGIN;", null, cancellationSignal);
                            } else {
/* 51 */                        sQLiteConnection.I000O01llI0("BEGIN EXCLUSIVE;", null, cancellationSignal);
                            }
                        }
/* 60 */                Transaction transaction2 = this.I0000O;
/* 62 */                if (transaction2 != null) {
/* 66 */                    this.I0000O = transaction2.I00000oIO;
/* 68 */                    transaction2.I00000oIO = null;
/* 71 */                    transaction2.I00000oOI = false;
/* 73 */                    transaction2.I0000Il00O = false;
                        } else {
/* 78 */                    transaction2 = new Transaction();
                        }
/* 83 */                transaction2.I00000oIO = this.I0000oI00;
/* 85 */                this.I0000oI00 = transaction2;
                    } catch (Throwable th) {
/* 90 */                if (this.I0000oI00 == null) {
/* 92 */                    I000OOo1O();
                        }
/* 215 */               throw th;
                    }
                }

                public final void I0000Il00O(CancellationSignal cancellationSignal) {
/* 3 */             if (this.I0000oI00 == null) {
/* 70 */                I000II.I001IO000("Cannot perform this operation because there is no current transaction.");
/* 186 */               return;
                    }
/* 5 */             if (cancellationSignal != null) {
/* 7 */                 cancellationSignal.throwIfCanceled();
                    }
/* 10 */            Transaction transaction = this.I0000oI00;
/* 24 */            boolean z = transaction.I00000oOI && !transaction.I0000Il00O;
/* 25 */            Transaction transaction2 = transaction.I00000oIO;
/* 27 */            this.I0000oI00 = transaction2;
/* 31 */            transaction.I00000oIO = this.I0000O;
/* 33 */            this.I0000O = transaction;
/* 35 */            if (transaction2 != null) {
/* 37 */                if (z) {
/* 63 */                    return;
                        }
/* 39 */                transaction2.I0000Il00O = true;
/* 63 */                return;
                    }
/* 42 */            SQLiteConnection sQLiteConnection = this.I00000oOI;
                    try {
/* 45 */                if (z) {
/* 49 */                    sQLiteConnection.I000O01llI0("COMMIT;", null, cancellationSignal);
                        } else {
/* 57 */                    sQLiteConnection.I000O01llI0("ROLLBACK;", null, cancellationSignal);
                        }
/* 60 */                I000OOo1O();
                    } catch (Throwable th) {
/* 64 */                I000OOo1O();
/* 67 */                throw th;
                    }
                }

                public final void I0000O(int i, String str, Object[] objArr) {
/* 1 */             if (str == null) {
/* 30 */                I000II.I000iOII("sql must not be null.");
                    } else {
/* 8 */                 if (I000O01llI0(str, i, null)) {
/* 10 */                    return;
                        }
/* 11 */                I00000oIO(str, i, null);
                        try {
/* 16 */                    this.I00000oOI.I000O01llI0(str, objArr, null);
                        } finally {
/* 24 */                    I000OOo1O();
                        }
                    }
                }

                public final int I0000oI00(int i, String str, Object[] objArr) {
/* 2 */             if (str == null) {
/* 32 */                I000II.I000iOII("sql must not be null.");
/* 1 */                 return 0;
                    }
/* 9 */             if (I000O01llI0(str, i, null)) {
/* 1 */                 return 0;
                    }
/* 12 */            I00000oIO(str, i, null);
                    try {
/* 17 */                return this.I00000oOI.I000OOo1O(str, objArr);
                    } finally {
/* 26 */                I000OOo1O();
                    }
                }

                public final int I0001Ioi1lo(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
/* 2 */             if (str == null) {
/* 49 */                I000II.I000iOII("sql must not be null.");
/* 1 */                 return 0;
                    }
/* 4 */             if (cursorWindow == null) {
/* 43 */                I000II.I000iOII("window must not be null.");
/* 1 */                 return 0;
                    }
/* 10 */            if (I000O01llI0(str, i3, cancellationSignal)) {
/* 12 */                cursorWindow.clear();
/* 1 */                 return 0;
                    }
/* 16 */            I00000oIO(str, i3, cancellationSignal);
                    try {
/* 27 */                return this.I00000oOI.I000OiO(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
                    } finally {
/* 37 */                I000OOo1O();
                    }
                }

                public final long I000II(int i, String str, Object[] objArr) {
/* 3 */             if (str == null) {
/* 33 */                I000II.I000iOII("sql must not be null.");
/* 1 */                 return 0L;
                    }
/* 10 */            if (I000O01llI0(str, i, null)) {
/* 1 */                 return 0L;
                    }
/* 13 */            I00000oIO(str, i, null);
                    try {
/* 18 */                return this.I00000oOI.I000iOII(str, objArr);
                    } finally {
/* 27 */                I000OOo1O();
                    }
                }

                public final boolean I000O01llI0(String str, int i, CancellationSignal cancellationSignal) {
/* 1 */             if (cancellationSignal != null) {
/* 3 */                 cancellationSignal.throwIfCanceled();
                    }
/* 6 */             int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
/* 12 */            if (sqlStatementType == 4) {
/* 53 */                I00000oOI(2, i, cancellationSignal);
/* 11 */                return true;
                    }
/* 16 */            if (sqlStatementType != 5) {
/* 19 */                if (sqlStatementType != 6) {
/* 15 */                    return false;
                        }
/* 22 */                I0000Il00O(cancellationSignal);
/* 11 */                return true;
                    }
/* 26 */            Transaction transaction = this.I0000oI00;
/* 28 */            if (transaction == null) {
/* 48 */                I000II.I001IO000("Cannot perform this operation because there is no current transaction.");
/* 15 */                return false;
                    }
/* 32 */            if (transaction.I00000oOI) {
/* 42 */                I000II.I001IO000("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
/* 15 */                return false;
                    }
/* 34 */            transaction.I00000oOI = true;
/* 36 */            I0000Il00O(cancellationSignal);
/* 11 */            return true;
                }

                public final void I000OOo1O() {
                    int i = this.I0000Il00O - 1;
/* 5 */             this.I0000Il00O = i;
/* 7 */             if (i == 0) {
                        try {
/* 14 */                    this.I00000oIO.I00IoiI(this.I00000oOI);
                        } finally {
/* 21 */                    this.I00000oOI = null;
                        }
                    }
                }
            }
