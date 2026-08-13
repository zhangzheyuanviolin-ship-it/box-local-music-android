            package net.zetetic.database.sqlcipher;

            import android.database.CursorWindow;
            import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.os.CancellationSignal;
            import android.os.StatFs;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.LruCache;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import net.zetetic.database.DatabaseUtils;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            import p000.OIllioIilO;
            import p000.Oi010OO0;
            
            public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
                public static final String[] I000lI = new String[0];
                public static final byte[] I000o00OoI0I = new byte[0];
                public CloseGuard I00000oIO;
                public SQLiteConnectionPool I00000oOI;
                public SQLiteDatabaseConfiguration I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;
                public PreparedStatementCache I000II;
                public PreparedStatement I000O01llI0;
                public OperationLog I000OOo1O;
                public long I000OiO;
                public boolean I000iOII;
                public int I000l1;

                public static final class Operation {
                    public long I00000oIO;
                    public long I00000oOI;
                    public long I0000Il00O;
                    public String I0000O;
                    public String I0000oI00;
                    public ArrayList I0001Ioi1lo;
                    public boolean I000II;
                    public RuntimeException I000O01llI0;
                    public int I000OOo1O;

                    public final void I00000oIO(StringBuilder sb) {
/* 3 */                 sb.append(this.I0000O);
/* 8 */                 if (this.I000II) {
/* 12 */                    sb.append(" took ");
/* 20 */                    sb.append(this.I0000Il00O - this.I00000oOI);
/* 25 */                    sb.append("ms");
                        } else {
/* 31 */                    sb.append(" started ");
/* 41 */                    sb.append(System.currentTimeMillis() - this.I00000oIO);
/* 46 */                    sb.append("ms ago");
                        }
/* 51 */                sb.append(" - ");
/* 70 */                sb.append(!this.I000II ? "running" : this.I000O01llI0 != null ? "failed" : "succeeded");
/* 77 */                if (this.I0000oI00 != null) {
/* 81 */                    sb.append(", sql=\"");
/* 94 */                    sb.append(this.I0000oI00.replaceAll("[\\s]*\\n+[\\s]*", " "));
/* 97 */                    sb.append("\"");
                        }
/* 102 */               if (this.I000O01llI0 != null) {
/* 106 */                   sb.append(", exception=\"");
/* 115 */                   sb.append(this.I000O01llI0.getMessage());
/* 118 */                   sb.append("\"");
                        }
                    }
                }

                public static final class OperationLog {
                    public Operation[] I00000oIO;
                    public int I00000oOI;
                    public int I0000Il00O;

                    public final int I00000oIO(String str, String str2, Object[] objArr) {
                        int i;
                        synchronized (this.I00000oIO) {
                            try {
/* 8 */                         int i2 = (this.I00000oOI + 1) % 20;
/* 10 */                        Operation[] operationArr = this.I00000oIO;
/* 12 */                        Operation operation = operationArr[i2];
/* 15 */                        if (operation == null) {
/* 19 */                            operation = new Operation();
/* 22 */                            operationArr[i2] = operation;
                                } else {
/* 27 */                            operation.I000II = false;
/* 30 */                            operation.I000O01llI0 = null;
/* 32 */                            ArrayList arrayList = operation.I0001Ioi1lo;
/* 34 */                            if (arrayList != null) {
/* 36 */                                arrayList.clear();
                                    }
                                }
/* 43 */                        operation.I00000oIO = System.currentTimeMillis();
/* 49 */                        operation.I00000oOI = SystemClock.uptimeMillis();
/* 51 */                        operation.I0000O = str;
/* 53 */                        operation.I0000oI00 = str2;
/* 55 */                        if (objArr != null) {
/* 57 */                            ArrayList arrayList2 = operation.I0001Ioi1lo;
/* 59 */                            if (arrayList2 == null) {
/* 66 */                                operation.I0001Ioi1lo = new ArrayList();
                                    } else {
/* 69 */                                arrayList2.clear();
                                    }
/* 73 */                            for (Object obj : objArr) {
/* 77 */                                if (obj == null || !(obj instanceof byte[])) {
/* 93 */                                    operation.I0001Ioi1lo.add(obj);
                                        } else {
/* 87 */                                    operation.I0001Ioi1lo.add(SQLiteConnection.I000o00OoI0I);
                                        }
                                    }
                                }
/* 99 */                        int i3 = this.I0000Il00O;
/* 103 */                       this.I0000Il00O = i3 + 1;
/* 107 */                       i = (i3 << 8) | i2;
/* 108 */                       operation.I000OOo1O = i;
/* 110 */                       this.I00000oOI = i2;
                            } catch (Throwable th) {
/* 215 */                       throw th;
                            }
                        }
/* 113 */               return i;
                    }

                    public final void I00000oOI(int i) {
                        synchronized (this.I00000oIO) {
/* 8 */                     Operation operation = this.I00000oIO[i & 255];
/* 12 */                    if (operation.I000OOo1O != i) {
/* 15 */                        operation = null;
                            }
/* 16 */                    if (operation != null) {
/* 22 */                        operation.I0000Il00O = SystemClock.uptimeMillis();
/* 25 */                        operation.I000II = true;
                            }
                        }
                    }

                    public final void I0000Il00O(int i) {
                        synchronized (this.I00000oIO) {
/* 8 */                     Operation operation = this.I00000oIO[i & 255];
/* 12 */                    if (operation.I000OOo1O != i) {
/* 15 */                        operation = null;
                            }
/* 16 */                    if (operation != null) {
/* 22 */                        operation.I0000Il00O = SystemClock.uptimeMillis();
/* 25 */                        operation.I000II = true;
                            }
                        }
                    }

                    public final void I0000O(int i, RuntimeException runtimeException) {
                        synchronized (this.I00000oIO) {
                            try {
/* 8 */                         Operation operation = this.I00000oIO[i & 255];
/* 12 */                        if (operation.I000OOo1O != i) {
/* 15 */                            operation = null;
                                }
/* 16 */                        if (operation != null) {
/* 18 */                            operation.I000O01llI0 = runtimeException;
                                }
                            } finally {
                            }
                        }
                    }
                }

                public static final class PreparedStatement {
                    public PreparedStatement I00000oIO;
                    public String I00000oOI;
                    public long I0000Il00O;
                    public int I0000O;
                    public boolean I0000oI00;
                    public boolean I0001Ioi1lo;
                    public boolean I000II;
                }

                public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
                    public PreparedStatementCache(int i) {
/* 3 */                 super(i);
                    }

                    @Override
                    public final void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
/* 3 */                 PreparedStatement preparedStatement3 = preparedStatement;
/* 8 */                 preparedStatement3.I0001Ioi1lo = false;
/* 12 */                if (preparedStatement3.I000II) {
/* 483 */                   return;
                        }
/* 16 */                SQLiteConnection.this.I000lI(preparedStatement3);
                    }
                }

                public static String I0000O(String str) {
                    return str.equals(OIllioIilO.I01OO1I) ? "OFF" : str.equals("1") ? "NORMAL" : str.equals("2") ? "FULL" : str;
                }

                public static boolean I000o00OoI0I() {
/* 1 */             return nativeHasCodec();
                }

                private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

                private static native void nativeBindDouble(long j, long j2, int i, double d);

                private static native void nativeBindLong(long j, long j2, int i, long j3);

                private static native void nativeBindNull(long j, long j2, int i);

                private static native void nativeBindString(long j, long j2, int i, String str);

                private static native void nativeCancel(long j);

                private static native void nativeClose(long j);

                private static native void nativeExecute(long j, long j2);

                private static native int nativeExecuteForBlobFileDescriptor(long j, long j2);

                private static native int nativeExecuteForChangedRowCount(long j, long j2);

                private static native long nativeExecuteForCursorWindow(long j, long j2, CursorWindow cursorWindow, int i, int i2, boolean z);

                private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

                private static native long nativeExecuteForLong(long j, long j2);

                private static native String nativeExecuteForString(long j, long j2);

                private static native void nativeExecuteRaw(long j, long j2);

                private static native void nativeFinalizeStatement(long j, long j2);

                private static native int nativeGetColumnCount(long j, long j2);

                private static native String nativeGetColumnName(long j, long j2, int i);

                private static native int nativeGetDbLookaside(long j);

                private static native int nativeGetParameterCount(long j, long j2);

                private static native boolean nativeHasCodec();

                private static native boolean nativeIsReadOnly(long j, long j2);

                private static native int nativeKey(long j, byte[] bArr);

                private static native long nativeOpen(String str, int i, String str2, boolean z, boolean z2);

                private static native long nativePrepareStatement(long j, String str);

                private static native int nativeReKey(long j, byte[] bArr);

                private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

                private static native void nativeRegisterLocalizedCollators(long j, String str);

                private static native void nativeResetCancel(long j, boolean z);

                private static native void nativeResetStatementAndClearBindings(long j, long j2);

                public final PreparedStatement I00000oIO(String str) {
                    boolean z;
/* 1 */             PreparedStatementCache preparedStatementCache = this.I000II;
/* 3 */             PreparedStatement preparedStatement = preparedStatementCache.get(str);
/* 11 */            if (preparedStatement == null) {
/* 20 */                z = false;
                    } else {
/* 15 */                if (!preparedStatement.I000II) {
/* 17 */                    return preparedStatement;
                        }
/* 18 */                z = true;
                    }
/* 23 */            long jNativePrepareStatement = nativePrepareStatement(this.I000OiO, str);
                    try {
/* 29 */                int iNativeGetParameterCount = nativeGetParameterCount(this.I000OiO, jNativePrepareStatement);
/* 33 */                int iI00000oIO = DatabaseUtils.I00000oIO(str);
/* 39 */                boolean zNativeIsReadOnly = nativeIsReadOnly(this.I000OiO, jNativePrepareStatement);
/* 43 */                PreparedStatement preparedStatement2 = this.I000O01llI0;
/* 45 */                if (preparedStatement2 != null) {
/* 49 */                    this.I000O01llI0 = preparedStatement2.I00000oIO;
/* 52 */                    preparedStatement2.I00000oIO = null;
/* 54 */                    preparedStatement2.I0001Ioi1lo = false;
                        } else {
/* 59 */                    preparedStatement2 = new PreparedStatement();
                        }
/* 62 */                preparedStatement2.I00000oOI = str;
/* 64 */                preparedStatement2.I0000Il00O = jNativePrepareStatement;
/* 66 */                preparedStatement2.I0000O = iNativeGetParameterCount;
/* 68 */                preparedStatement2.I0000oI00 = zNativeIsReadOnly;
/* 70 */                if (!z && (iI00000oIO == 2 || iI00000oIO == 1)) {
                            try {
/* 77 */                        preparedStatementCache.put(str, preparedStatement2);
/* 80 */                        preparedStatement2.I0001Ioi1lo = true;
                            } catch (RuntimeException e) {
/* 83 */                        e = e;
/* 84 */                        preparedStatement = preparedStatement2;
/* 90 */                        if (preparedStatement == null || !preparedStatement.I0001Ioi1lo) {
/* 98 */                            nativeFinalizeStatement(this.I000OiO, jNativePrepareStatement);
                                }
/* 186 */                       throw e;
                            }
                        }
/* 86 */                preparedStatement2.I000II = true;
/* 88 */                return preparedStatement2;
                    } catch (RuntimeException e2) {
/* 89 */                e = e2;
                    }
                }

                public final void I00000oOI(CancellationSignal cancellationSignal) {
/* 1 */             if (cancellationSignal != null) {
/* 3 */                 cancellationSignal.throwIfCanceled();
/* 9 */                 int i = this.I000l1 + 1;
/* 10 */                this.I000l1 = i;
/* 12 */                if (i == 1) {
/* 16 */                    nativeResetCancel(this.I000OiO, true);
/* 19 */                    cancellationSignal.setOnCancelListener(this);
                        }
                    }
                }

                public final void I0000Il00O(PreparedStatement preparedStatement, Object[] objArr) {
/* 6 */             int length = objArr != null ? objArr.length : 0;
/* 9 */             if (length != preparedStatement.I0000O) {
/* 551 */               throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.I0000O + " bind arguments but " + length + " were provided.");
                    }
/* 11 */            if (length == 0) {
/* 138 */               return;
                    }
/* 15 */            long j = preparedStatement.I0000Il00O;
/* 17 */            for (int i = 0; i < length; i++) {
/* 19 */                Object obj = objArr[i];
/* 21 */                if (obj == null) {
/* 27 */                    nativeBindNull(this.I000OiO, j, i + 1);
                        } else if (obj instanceof byte[]) {
/* 43 */                    nativeBindBlob(this.I000OiO, j, i + 1, (byte[]) obj);
                        } else if ((obj instanceof Float) || (obj instanceof Double)) {
/* 132 */                   nativeBindDouble(this.I000OiO, j, i + 1, ((Number) obj).doubleValue());
                        } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
/* 118 */                   nativeBindLong(this.I000OiO, j, i + 1, ((Number) obj).longValue());
                        } else {
/* 73 */                    boolean z = obj instanceof Boolean;
/* 75 */                    long j2 = this.I000OiO;
/* 77 */                    if (z) {
/* 94 */                        nativeBindLong(j2, j, i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
                            } else {
/* 104 */                       nativeBindString(j2, j, i + 1, obj.toString());
                            }
                        }
                    }
                }

                public final void I0000oI00(byte[] bArr) {
/* 3 */             int iNativeReKey = nativeReKey(this.I000OiO, bArr);
/* 23 */            Log.i("SQLiteConnection", "Database rekey operation returned:" + iNativeReKey);
/* 26 */            if (iNativeReKey != 0) {
/* 49 */                throw new SQLiteException(Oi010OO0.I000oI1ioi(iNativeReKey, "Failed to rekey database, result code:"));
                    }
                }

                public final void I0001Ioi1lo(CancellationSignal cancellationSignal) {
/* 1 */             if (cancellationSignal != null) {
                        int i = this.I000l1 - 1;
/* 7 */                 this.I000l1 = i;
/* 9 */                 if (i == 0) {
/* 12 */                    cancellationSignal.setOnCancelListener(null);
/* 18 */                    nativeResetCancel(this.I000OiO, false);
                        }
                    }
                }

                public final void I000II(boolean z) {
                    Throwable th;
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 3 */             CloseGuard closeGuard = this.I00000oIO;
/* 6 */             if (closeGuard != null) {
/* 8 */                 if (z && (th = closeGuard.I00000oIO) != null) {
/* 16 */                    Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
                        }
/* 19 */                closeGuard.I00000oIO = null;
                    }
/* 27 */            if (this.I000OiO != 0) {
/* 31 */                int iI00000oIO = operationLog.I00000oIO("close", null, null);
                        try {
/* 37 */                    this.I000II.evictAll();
/* 42 */                    nativeClose(this.I000OiO);
/* 45 */                    this.I000OiO = 0L;
                        } finally {
/* 52 */                    operationLog.I00000oOI(iI00000oIO);
                        }
                    }
                }

                public final void I000O01llI0(String str, Object[] objArr, CancellationSignal cancellationSignal) {
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 3 */             if (str == null) {
/* 66 */                I000II.I000iOII("sql must not be null.");
/* 215 */               return;
                    }
/* 7 */             int iI00000oIO = operationLog.I00000oIO("execute", str, objArr);
                    try {
                        try {
/* 11 */                    PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                            try {
/* 15 */                        I001IO000(preparedStatementI00000oIO);
/* 18 */                        I0000Il00O(preparedStatementI00000oIO, objArr);
/* 21 */                        I00000oOI(cancellationSignal);
                                try {
/* 28 */                            nativeExecute(this.I000OiO, preparedStatementI00000oIO.I0000Il00O);
                                } finally {
/* 48 */                            I0001Ioi1lo(cancellationSignal);
                                }
                            } finally {
/* 52 */                        I0010I0i(preparedStatementI00000oIO);
                            }
                        } finally {
/* 60 */                    operationLog.I00000oOI(iI00000oIO);
                        }
                    } catch (RuntimeException e) {
/* 56 */                operationLog.I0000O(iI00000oIO, e);
/* 59 */                throw e;
                    }
                }

                public final int I000OOo1O(String str, Object[] objArr) {
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 3 */             if (str == null) {
/* 57 */                I000II.I000iOII("sql must not be null.");
/* 60 */                return 0;
                    }
/* 7 */             int iI00000oIO = operationLog.I00000oIO("executeForChangedRowCount", str, objArr);
                    try {
                        try {
/* 11 */                    PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                            try {
/* 15 */                        I001IO000(preparedStatementI00000oIO);
/* 18 */                        I0000Il00O(preparedStatementI00000oIO, objArr);
/* 25 */                        return nativeExecuteForChangedRowCount(this.I000OiO, preparedStatementI00000oIO.I0000Il00O);
                            } finally {
/* 43 */                        I0010I0i(preparedStatementI00000oIO);
                            }
                        } catch (RuntimeException e) {
/* 47 */                    operationLog.I0000O(iI00000oIO, e);
/* 50 */                    throw e;
                        }
                    } finally {
/* 51 */                operationLog.I0000Il00O(iI00000oIO);
                    }
                }

                public final int I000OiO(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, CancellationSignal cancellationSignal) {
/* 3 */             OperationLog operationLog = this.I000OOo1O;
/* 6 */             if (str == null) {
/* 113 */               I000II.I000iOII("sql must not be null.");
/* 5 */                 return 0;
                    }
/* 8 */             if (cursorWindow == null) {
/* 107 */               I000II.I000iOII("window must not be null.");
/* 5 */                 return 0;
                    }
/* 10 */            cursorWindow.acquireReference();
                    try {
/* 15 */                int iI00000oIO = operationLog.I00000oIO("executeForCursorWindow", str, objArr);
                        try {
                            try {
/* 19 */                        PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                                try {
/* 23 */                            I001IO000(preparedStatementI00000oIO);
/* 26 */                            I0000Il00O(preparedStatementI00000oIO, objArr);
/* 29 */                            I00000oOI(cancellationSignal);
                                    try {
/* 42 */                                long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.I000OiO, preparedStatementI00000oIO.I0000Il00O, cursorWindow, i, i2, z);
/* 50 */                                int i3 = (int) (jNativeExecuteForCursorWindow >> 32);
/* 51 */                                int i4 = (int) jNativeExecuteForCursorWindow;
/* 52 */                                cursorWindow.getNumRows();
/* 55 */                                cursorWindow.setStartPosition(i3);
/* 58 */                                I0001Ioi1lo(cancellationSignal);
/* 61 */                                I0010I0i(preparedStatementI00000oIO);
/* 64 */                                operationLog.I0000Il00O(iI00000oIO);
/* 67 */                                cursorWindow.releaseReference();
/* 70 */                                return i4;
                                    } catch (Throwable th) {
/* 85 */                                I0001Ioi1lo(cancellationSignal);
/* 88 */                                throw th;
                                    }
                                } catch (Throwable th2) {
/* 89 */                            I0010I0i(preparedStatementI00000oIO);
/* 92 */                            throw th2;
                                }
                            } catch (RuntimeException e) {
/* 93 */                        operationLog.I0000O(iI00000oIO, e);
/* 96 */                        throw e;
                            }
                        } catch (Throwable th3) {
/* 97 */                    operationLog.I0000Il00O(iI00000oIO);
/* 100 */                   throw th3;
                        }
                    } catch (Throwable th4) {
/* 101 */               cursorWindow.releaseReference();
/* 104 */               throw th4;
                    }
                }

                public final long I000iOII(String str, Object[] objArr) {
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 3 */             if (str == null) {
/* 57 */                I000II.I000iOII("sql must not be null.");
/* 60 */                return 0L;
                    }
/* 7 */             int iI00000oIO = operationLog.I00000oIO("executeForLong", str, objArr);
                    try {
                        try {
/* 11 */                    PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                            try {
/* 15 */                        I001IO000(preparedStatementI00000oIO);
/* 18 */                        I0000Il00O(preparedStatementI00000oIO, objArr);
/* 25 */                        return nativeExecuteForLong(this.I000OiO, preparedStatementI00000oIO.I0000Il00O);
                            } finally {
/* 43 */                        I0010I0i(preparedStatementI00000oIO);
                            }
                        } catch (RuntimeException e) {
/* 47 */                    operationLog.I0000O(iI00000oIO, e);
/* 50 */                    throw e;
                        }
                    } finally {
/* 51 */                operationLog.I00000oOI(iI00000oIO);
                    }
                }

                public final String I000l1(String str) {
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 6 */             int iI00000oIO = operationLog.I00000oIO("executeForString", str, null);
                    try {
                        try {
/* 10 */                    PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                            try {
/* 14 */                        I001IO000(preparedStatementI00000oIO);
/* 17 */                        I0000Il00O(preparedStatementI00000oIO, null);
/* 24 */                        return nativeExecuteForString(this.I000OiO, preparedStatementI00000oIO.I0000Il00O);
                            } finally {
/* 42 */                        I0010I0i(preparedStatementI00000oIO);
                            }
                        } catch (RuntimeException e) {
/* 46 */                    operationLog.I0000O(iI00000oIO, e);
/* 49 */                    throw e;
                        }
                    } finally {
/* 50 */                operationLog.I00000oOI(iI00000oIO);
                    }
                }

                public final void I000lI(PreparedStatement preparedStatement) {
/* 5 */             nativeFinalizeStatement(this.I000OiO, preparedStatement.I0000Il00O);
/* 9 */             preparedStatement.I00000oOI = null;
/* 13 */            preparedStatement.I00000oIO = this.I000O01llI0;
/* 15 */            this.I000O01llI0 = preparedStatement;
                }

                public final void I000oI1ioi() {
/* 1 */             SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I0000Il00O;
/* 17 */            this.I000OiO = nativeOpen(sQLiteDatabaseConfiguration.I00000oIO, sQLiteDatabaseConfiguration.I0000Il00O, sQLiteDatabaseConfiguration.I00000oOI, SQLiteDebug.I00000oIO, SQLiteDebug.I00000oOI);
/* 21 */            SQLiteDatabaseHook sQLiteDatabaseHook = this.I0000Il00O.I000II;
/* 23 */            if (sQLiteDatabaseHook != null) {
/* 25 */                sQLiteDatabaseHook.I00000oIO();
                    }
/* 30 */            byte[] bArr = this.I0000Il00O.I0001Ioi1lo;
/* 32 */            if (bArr != null && bArr.length > 0) {
/* 59 */                Log.i("SQLiteConnection", "Database keying operation returned:" + nativeKey(this.I000OiO, bArr));
                    }
/* 64 */            SQLiteDatabaseHook sQLiteDatabaseHook2 = this.I0000Il00O.I000II;
/* 66 */            if (sQLiteDatabaseHook2 != null) {
/* 68 */                sQLiteDatabaseHook2.I00000oOI();
                    }
/* 73 */            byte[] bArr2 = this.I0000Il00O.I0001Ioi1lo;
/* 76 */            if (bArr2 != null && bArr2.length > 0) {
/* 83 */                I000iOII("SELECT COUNT(*) FROM sqlite_schema;", null);
                    }
/* 96 */            if (!this.I0000Il00O.I00000oIO.equalsIgnoreCase(":memory:") && !this.I0001Ioi1lo) {
/* 102 */               WeakHashMap weakHashMap = SQLiteDatabase.I00l0OO0IO;
/* 108 */               if (!nativeHasCodec()) {
                            synchronized (SQLiteGlobal.I00000oIO) {
                                try {
/* 115 */                           if (SQLiteGlobal.I00000oOI == 0) {
/* 128 */                               SQLiteGlobal.I00000oOI = new StatFs("/data").getBlockSize();
                                    }
                                } catch (Throwable th) {
/* 153 */                           throw th;
                                }
                            }
/* 144 */                   if (I000iOII("PRAGMA page_size", null) != 4096) {
/* 148 */                       I000O01llI0("PRAGMA page_size=4096", null, null);
                            }
                        }
                    }
/* 156 */           if (!this.I0001Ioi1lo) {
/* 160 */               this.I0000Il00O.getClass();
/* 173 */               if (I000iOII("PRAGMA foreign_keys", null) != 0) {
/* 181 */                   I000O01llI0(IlIi0I0.I000iOII(0L, "PRAGMA foreign_keys="), null, null);
                        }
                    }
/* 194 */           if (!this.I0000Il00O.I00000oIO.equalsIgnoreCase(":memory:") && !this.I0001Ioi1lo && I000iOII("PRAGMA journal_size_limit", null) != 10000) {
/* 214 */               I000iOII("PRAGMA journal_size_limit=10000", null);
                    }
/* 227 */           if (!this.I0000Il00O.I00000oIO.equalsIgnoreCase(":memory:") && !this.I0001Ioi1lo) {
/* 236 */               long jMax = Math.max(1, 1000);
/* 249 */               if (I000iOII("PRAGMA wal_autocheckpoint", null) != jMax) {
/* 265 */                   I000iOII("PRAGMA wal_autocheckpoint=" + jMax, null);
                        }
                    }
/* 268 */           I001IIilI0O();
/* 275 */           if (!nativeHasCodec()) {
/* 277 */               I00111O();
                    }
/* 284 */           int size = this.I0000Il00O.I000O01llI0.size();
/* 289 */           for (int i = 0; i < size; i++) {
/* 303 */               nativeRegisterCustomFunction(this.I000OiO, (SQLiteCustomFunction) this.I0000Il00O.I000O01llI0.get(i));
                    }
                }

                public final void I00100l0(String str, SQLiteStatementInfo sQLiteStatementInfo) {
/* 1 */             OperationLog operationLog = this.I000OOo1O;
/* 6 */             int iI00000oIO = operationLog.I00000oIO("prepare", str, null);
                    try {
                        try {
/* 10 */                    PreparedStatement preparedStatementI00000oIO = I00000oIO(str);
                            try {
/* 16 */                        sQLiteStatementInfo.I00000oIO = preparedStatementI00000oIO.I0000O;
/* 20 */                        sQLiteStatementInfo.I0000Il00O = preparedStatementI00000oIO.I0000oI00;
/* 26 */                        int iNativeGetColumnCount = nativeGetColumnCount(this.I000OiO, preparedStatementI00000oIO.I0000Il00O);
/* 30 */                        if (iNativeGetColumnCount == 0) {
/* 34 */                            sQLiteStatementInfo.I00000oOI = I000lI;
                                } else {
/* 41 */                            sQLiteStatementInfo.I00000oOI = new String[iNativeGetColumnCount];
/* 44 */                            for (int i = 0; i < iNativeGetColumnCount; i++) {
/* 56 */                                sQLiteStatementInfo.I00000oOI[i] = nativeGetColumnName(this.I000OiO, preparedStatementI00000oIO.I0000Il00O, i);
                                    }
                                }
/* 61 */                        I0010I0i(preparedStatementI00000oIO);
                            } catch (Throwable th) {
/* 72 */                        I0010I0i(preparedStatementI00000oIO);
/* 75 */                        throw th;
                            }
                        } catch (RuntimeException e) {
/* 76 */                    operationLog.I0000O(iI00000oIO, e);
/* 79 */                    throw e;
                        }
                    } finally {
/* 80 */                operationLog.I00000oOI(iI00000oIO);
                    }
                }

                public final void I00100o1O0lo(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
/* 1 */             SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.I0000Il00O;
/* 4 */             this.I000iOII = false;
/* 8 */             int size = sQLiteDatabaseConfiguration.I000O01llI0.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 21 */                SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) sQLiteDatabaseConfiguration.I000O01llI0.get(i);
/* 29 */                if (!sQLiteDatabaseConfiguration2.I000O01llI0.contains(sQLiteCustomFunction)) {
/* 33 */                    nativeRegisterCustomFunction(this.I000OiO, sQLiteCustomFunction);
                        }
                    }
/* 39 */            sQLiteDatabaseConfiguration2.getClass();
/* 50 */            boolean z = ((sQLiteDatabaseConfiguration.I0000Il00O ^ sQLiteDatabaseConfiguration2.I0000Il00O) & 536870912) != 0;
/* 57 */            boolean zEquals = sQLiteDatabaseConfiguration.I0000oI00.equals(sQLiteDatabaseConfiguration2.I0000oI00);
/* 61 */            sQLiteDatabaseConfiguration2.I00000oIO(sQLiteDatabaseConfiguration);
/* 64 */            if (z) {
/* 66 */                I001IIilI0O();
                    }
/* 69 */            if (zEquals) {
/* 186 */               return;
                    }
/* 71 */            I00111O();
                }

                public final void I0010I0i(PreparedStatement preparedStatement) {
/* 2 */             preparedStatement.I000II = false;
/* 6 */             if (!preparedStatement.I0001Ioi1lo) {
/* 24 */                I000lI(preparedStatement);
/* 49 */                return;
                    }
                    try {
/* 12 */                nativeResetStatementAndClearBindings(this.I000OiO, preparedStatement.I0000Il00O);
                    } catch (SQLiteException unused) {
/* 20 */                this.I000II.remove(preparedStatement.I00000oOI);
                    }
                }

                public final void I0010o(String str) {
/* 5 */             String strI000l1 = I000l1("PRAGMA journal_mode");
/* 13 */            if (strI000l1.equalsIgnoreCase(str)) {
/* 186 */               return;
                    }
                    try {
/* 27 */                if (I000l1("PRAGMA journal_mode=".concat(str)).equalsIgnoreCase(str)) {
/* 186 */                   return;
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                    }
/* 34 */            StringBuilder sb = new StringBuilder("Could not change the database journal mode of '");
/* 45 */            IIl001iO0Io.I001lIiIIo1O(sb, this.I0000Il00O.I00000oOI, "' from '", strI000l1, "' to '");
/* 48 */            sb.append(str);
/* 53 */            sb.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
/* 62 */            Log.w("SQLiteConnection", sb.toString());
                }

                public final void I00111O() {
/* 1 */             SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I0000Il00O;
/* 7 */             if ((sQLiteDatabaseConfiguration.I0000Il00O & 16) != 0) {
/* 46 */                return;
                    }
/* 12 */            String string = sQLiteDatabaseConfiguration.I0000oI00.toString();
/* 18 */            nativeRegisterLocalizedCollators(this.I000OiO, string);
/* 23 */            if (this.I0001Ioi1lo) {
/* 46 */                return;
                    }
                    try {
/* 29 */                I000O01llI0("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
/* 34 */                String strI000l1 = I000l1("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1");
/* 38 */                if (strI000l1 == null || !strI000l1.equals(string)) {
/* 51 */                    I000O01llI0("BEGIN", null, null);
                            try {
/* 56 */                        I000O01llI0("DELETE FROM android_metadata", null, null);
/* 65 */                        I000O01llI0("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
/* 70 */                        I000O01llI0("REINDEX LOCALIZED", null, null);
/* 75 */                        I000O01llI0("COMMIT", null, null);
                            } catch (Throwable th) {
/* 82 */                        I000O01llI0("ROLLBACK", null, null);
/* 85 */                        throw th;
                            }
                        }
                    } catch (RuntimeException e) {
/* 113 */               throw new SQLiteException(IIl001iO0Io.I00100o1O0lo(new StringBuilder("Failed to change locale for db '"), sQLiteDatabaseConfiguration.I00000oOI, "' to '", string, "'."), e);
                    }
                }

                public final void I001IIilI0O() {
/* 1 */             SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I0000Il00O;
/* 11 */            if (sQLiteDatabaseConfiguration.I00000oIO.equalsIgnoreCase(":memory:") || this.I0001Ioi1lo) {
/* 113 */               return;
                    }
/* 29 */            if ((sQLiteDatabaseConfiguration.I0000Il00O & 536870912) != 0) {
/* 33 */                I0010o("WAL");
/* 52 */                if (I0000O(I000l1("PRAGMA synchronous")).equalsIgnoreCase(I0000O("normal"))) {
/* 113 */                   return;
                        }
/* 58 */                I000O01llI0("PRAGMA synchronous=".concat("normal"), null, null);
/* 61 */                return;
                    }
/* 64 */            I0010o("delete");
/* 83 */            if (I0000O(I000l1("PRAGMA synchronous")).equalsIgnoreCase(I0000O("normal"))) {
/* 113 */               return;
                    }
/* 89 */            I000O01llI0("PRAGMA synchronous=".concat("normal"), null, null);
                }

                public final void I001IO000(PreparedStatement preparedStatement) {
/* 3 */             if (this.I000iOII && !preparedStatement.I0000oI00) {
/* 17 */                throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
                    }
                }

                public final void finalize() throws Throwable {
                    try {
/* 1 */                 SQLiteConnectionPool sQLiteConnectionPool = this.I00000oOI;
/* 4 */                 if (sQLiteConnectionPool != null && this.I000OiO != 0) {
/* 39 */                    Log.w("SQLiteConnectionPool", "A SQLiteConnection object for database '" + sQLiteConnectionPool.I00iio.I00000oOI + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
/* 44 */                    sQLiteConnectionPool.I00iiO.set(true);
                        }
/* 50 */                I000II(true);
/* 53 */                super.finalize();
                    } catch (Throwable th) {
/* 57 */                super.finalize();
/* 113 */               throw th;
                    }
                }

                @Override
                public final void onCancel() {
/* 3 */             nativeCancel(this.I000OiO);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SQLiteConnection: ");
/* 12 */            sb.append(this.I0000Il00O.I00000oIO);
/* 17 */            sb.append(" (");
/* 24 */            return IIl001iO0Io.I000lI(this.I0000O, ")", sb);
                }
            }
