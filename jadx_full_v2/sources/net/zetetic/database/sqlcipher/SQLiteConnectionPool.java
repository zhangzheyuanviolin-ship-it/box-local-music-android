            package net.zetetic.database.sqlcipher;

            import android.database.sqlite.SQLiteException;
            import android.os.CancellationSignal;
            import android.os.OperationCanceledException;
            import android.util.Log;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.LockSupport;
            import net.zetetic.database.sqlcipher.SQLiteConnection;
            import net.zetetic.database.sqlcipher.SQLiteConnection.PreparedStatementCache;
            import p000.I000II;
            import p000.IIlIOloOOO;
            
            public final class SQLiteConnectionPool implements Closeable {
                public CloseGuard I00iOIl;
                public Object I00iiI;
                public AtomicBoolean I00iiO;
                public SQLiteDatabaseConfiguration I00iio;
                public int I00ilI0I1;
                public boolean I00ilO0;
                public int I00io1l;
                public ConnectionWaiter I00ioIO;
                public ConnectionWaiter I00l0I0l0lO1;
                public ArrayList I00l0OO0IO;
                public SQLiteConnection I00li1OI;
                public WeakHashMap I00ll1;

                class C00401 implements CancellationSignal.OnCancelListener {
                    public ConnectionWaiter I00000oIO;
                    public int I00000oOI;
                    public SQLiteConnectionPool I0000Il00O;

                    @Override
                    public final void onCancel() {
                        synchronized (this.I0000Il00O.I00iiI) {
                            try {
/* 6 */                         ConnectionWaiter connectionWaiter = this.I00000oIO;
/* 12 */                        if (connectionWaiter.I000OiO == this.I00000oOI) {
/* 14 */                            SQLiteConnectionPool sQLiteConnectionPool = this.I0000Il00O;
/* 16 */                            sQLiteConnectionPool.getClass();
/* 21 */                            if (connectionWaiter.I000O01llI0 == null && connectionWaiter.I000OOo1O == null) {
/* 30 */                                ConnectionWaiter connectionWaiter2 = null;
/* 31 */                                for (ConnectionWaiter connectionWaiter3 = sQLiteConnectionPool.I00l0I0l0lO1; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.I00000oIO) {
/* 36 */                                    connectionWaiter2 = connectionWaiter3;
                                        }
/* 39 */                                ConnectionWaiter connectionWaiter4 = connectionWaiter.I00000oIO;
/* 41 */                                if (connectionWaiter2 != null) {
/* 43 */                                    connectionWaiter2.I00000oIO = connectionWaiter4;
                                        } else {
/* 46 */                                    sQLiteConnectionPool.I00l0I0l0lO1 = connectionWaiter4;
                                        }
/* 53 */                                connectionWaiter.I000OOo1O = new OperationCanceledException();
/* 57 */                                LockSupport.unpark(connectionWaiter.I00000oOI);
/* 60 */                                sQLiteConnectionPool.I00iiI();
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class AcquiredConnectionStatus {
                    public static final AcquiredConnectionStatus I00iOIl;
                    public static final AcquiredConnectionStatus I00iiI;
                    public static final AcquiredConnectionStatus I00iiO;
                    public static final AcquiredConnectionStatus[] I00iio;

                    static {
/* 6 */                 AcquiredConnectionStatus acquiredConnectionStatus = new AcquiredConnectionStatus("NORMAL", 0);
/* 9 */                 I00iOIl = acquiredConnectionStatus;
/* 16 */                AcquiredConnectionStatus acquiredConnectionStatus2 = new AcquiredConnectionStatus("RECONFIGURE", 1);
/* 19 */                I00iiI = acquiredConnectionStatus2;
/* 26 */                AcquiredConnectionStatus acquiredConnectionStatus3 = new AcquiredConnectionStatus("DISCARD", 2);
/* 29 */                I00iiO = acquiredConnectionStatus3;
/* 35 */                I00iio = new AcquiredConnectionStatus[]{acquiredConnectionStatus, acquiredConnectionStatus2, acquiredConnectionStatus3};
                    }

                    public static AcquiredConnectionStatus valueOf(String str) {
/* 7 */                 return (AcquiredConnectionStatus) Enum.valueOf(AcquiredConnectionStatus.class, str);
                    }

                    public static AcquiredConnectionStatus[] values() {
/* 7 */                 return (AcquiredConnectionStatus[]) I00iio.clone();
                    }
                }

                public static final class ConnectionWaiter {
                    public ConnectionWaiter I00000oIO;
                    public Thread I00000oOI;
                    public long I0000Il00O;
                    public int I0000O;
                    public boolean I0000oI00;
                    public String I0001Ioi1lo;
                    public int I000II;
                    public SQLiteConnection I000O01llI0;
                    public RuntimeException I000OOo1O;
                    public int I000OiO;
                }

                public static void I0000Il00O(SQLiteConnection sQLiteConnection) {
                    try {
/* 2 */                 sQLiteConnection.I000II(false);
                    } catch (RuntimeException e) {
/* 23 */                Log.e("SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e);
                    }
                }

                public static SQLiteConnectionPool I001i1lo1io(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
/* 1 */             if (sQLiteDatabaseConfiguration == null) {
/* 71 */                I000II.I000iOII("configuration must not be null.");
/* 74 */                return null;
                    }
/* 5 */             SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool();
/* 10 */            CloseGuard closeGuard = new CloseGuard();
/* 13 */            sQLiteConnectionPool.I00iOIl = closeGuard;
/* 20 */            sQLiteConnectionPool.I00iiI = new Object();
/* 27 */            sQLiteConnectionPool.I00iiO = new AtomicBoolean();
/* 34 */            sQLiteConnectionPool.I00l0OO0IO = new ArrayList();
/* 41 */            sQLiteConnectionPool.I00ll1 = new WeakHashMap();
/* 45 */            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
/* 48 */            sQLiteConnectionPool.I00iio = sQLiteDatabaseConfiguration2;
/* 50 */            sQLiteConnectionPool.I00OIl();
/* 53 */            VarHandle.storeStoreFence();
/* 61 */            sQLiteConnectionPool.I00li1OI = sQLiteConnectionPool.I001l0I00(sQLiteDatabaseConfiguration2, true);
/* 63 */            sQLiteConnectionPool.I00ilO0 = true;
/* 65 */            closeGuard.I00000oIO();
/* 68 */            return sQLiteConnectionPool;
                }

                public final void I00000oIO() {
/* 1 */             ArrayList arrayList = this.I00l0OO0IO;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 16 */                I0000Il00O((SQLiteConnection) arrayList.get(i));
                    }
/* 22 */            arrayList.clear();
                }

                public final void I000II(boolean z) {
                    Throwable th;
/* 3 */             CloseGuard closeGuard = this.I00iOIl;
/* 6 */             if (closeGuard != null) {
/* 8 */                 if (z && (th = closeGuard.I00000oIO) != null) {
/* 16 */                    Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
                        }
/* 21 */                this.I00iOIl.I00000oIO = null;
                    }
/* 23 */            if (z) {
/* 186 */               return;
                    }
                    synchronized (this.I00iiI) {
                        try {
/* 28 */                    I00OOll1();
/* 32 */                    this.I00ilO0 = false;
/* 34 */                    I00000oIO();
/* 37 */                    SQLiteConnection sQLiteConnection = this.I00li1OI;
/* 39 */                    if (sQLiteConnection != null) {
/* 41 */                        I0000Il00O(sQLiteConnection);
/* 44 */                        this.I00li1OI = null;
                            }
/* 48 */                    int size = this.I00ll1.size();
/* 52 */                    if (size != 0) {
/* 85 */                        Log.i("SQLiteConnectionPool", "The connection pool for " + this.I00iio.I00000oOI + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                            }
/* 91 */                    I00iiI();
                        } catch (Throwable th2) {
/* 97 */                    throw th2;
                        }
                    }
                }

                public final void I000O01llI0(SQLiteConnection sQLiteConnection, int i) {
                    try {
/* 8 */                 sQLiteConnection.I000iOII = (i & 1) != 0;
/* 14 */                this.I00ll1.put(sQLiteConnection, AcquiredConnectionStatus.I00iOIl);
                    } catch (RuntimeException e) {
/* 43 */                Log.e("SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
/* 46 */                I0000Il00O(sQLiteConnection);
/* 89 */                throw e;
                    }
                }

                public final void I000l1(int i, long j) {
                    int i2;
                    String string;
/* 1 */             Thread threadCurrentThread = Thread.currentThread();
/* 9 */             StringBuilder sb = new StringBuilder("The connection pool for database '");
/* 16 */            sb.append(this.I00iio.I00000oOI);
/* 21 */            sb.append("' has been unable to grant a connection to thread ");
/* 28 */            sb.append(threadCurrentThread.getId());
/* 33 */            sb.append(" (");
/* 40 */            sb.append(threadCurrentThread.getName());
/* 45 */            sb.append(") with flags 0x");
/* 52 */            sb.append(Integer.toHexString(i));
/* 57 */            sb.append(" for ");
/* 65 */            sb.append(j * 0.001f);
/* 70 */            sb.append(" seconds.\n");
/* 75 */            ArrayList arrayList = new ArrayList();
/* 84 */            int i3 = 0;
/* 85 */            if (this.I00ll1.isEmpty()) {
/* 158 */               i2 = 0;
                    } else {
/* 93 */                Iterator it = this.I00ll1.keySet().iterator();
/* 97 */                i2 = 0;
/* 102 */               while (it.hasNext()) {
/* 110 */                   SQLiteConnection.OperationLog operationLog = ((SQLiteConnection) it.next()).I000OOo1O;
                            synchronized (operationLog.I00000oIO) {
                                try {
/* 119 */                           SQLiteConnection.Operation operation = operationLog.I00000oIO[operationLog.I00000oOI];
/* 121 */                           if (operation == null || operation.I000II) {
/* 144 */                               string = null;
                                    } else {
/* 129 */                               StringBuilder sb2 = new StringBuilder();
/* 132 */                               operation.I00000oIO(sb2);
/* 135 */                               string = sb2.toString();
                                    }
                                } finally {
                                }
                            }
/* 145 */                   if (string != null) {
/* 147 */                       arrayList.add(string);
/* 150 */                       i3++;
                            } else {
/* 153 */                       i2++;
                            }
                        }
                    }
/* 161 */           int size = this.I00l0OO0IO.size();
/* 167 */           if (this.I00li1OI != null) {
/* 169 */               size++;
                    }
/* 175 */           IIlIOloOOO.I001l0I00(sb, "Connections: ", i3, " active, ", i2);
/* 180 */           sb.append(" idle, ");
/* 183 */           sb.append(size);
/* 188 */           sb.append(" available.\n");
/* 195 */           if (!arrayList.isEmpty()) {
/* 199 */               sb.append("\nRequests in progress:\n");
/* 202 */               Iterator it2 = arrayList.iterator();
/* 210 */               while (it2.hasNext()) {
/* 216 */                   String str = (String) it2.next();
/* 220 */                   sb.append("  ");
/* 223 */                   sb.append(str);
/* 228 */                   sb.append("\n");
                        }
                    }
/* 238 */           Log.w("SQLiteConnectionPool", sb.toString());
                }

                public final void I00100l0(AcquiredConnectionStatus acquiredConnectionStatus) {
/* 1 */             WeakHashMap weakHashMap = this.I00ll1;
/* 7 */             if (weakHashMap.isEmpty()) {
/* 186 */               return;
                    }
/* 15 */            ArrayList arrayList = new ArrayList(weakHashMap.size());
/* 30 */            for (Map.Entry entry : weakHashMap.entrySet()) {
/* 42 */                AcquiredConnectionStatus acquiredConnectionStatus2 = (AcquiredConnectionStatus) entry.getValue();
/* 44 */                if (acquiredConnectionStatus != acquiredConnectionStatus2 && acquiredConnectionStatus2 != AcquiredConnectionStatus.I00iiO) {
/* 56 */                    arrayList.add((SQLiteConnection) entry.getKey());
                        }
                    }
/* 60 */            int size = arrayList.size();
/* 65 */            for (int i = 0; i < size; i++) {
/* 73 */                weakHashMap.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
                    }
                }

                public final SQLiteConnection I001l0I00(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
/* 1 */             int i = this.I00io1l;
/* 5 */             this.I00io1l = i + 1;
/* 9 */             SQLiteConnection sQLiteConnection = new SQLiteConnection();
/* 14 */            CloseGuard closeGuard = new CloseGuard();
/* 17 */            sQLiteConnection.I00000oIO = closeGuard;
/* 21 */            SQLiteConnection.OperationLog operationLog = new SQLiteConnection.OperationLog();
/* 28 */            operationLog.I00000oIO = new SQLiteConnection.Operation[20];
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            sQLiteConnection.I000OOo1O = operationLog;
/* 35 */            sQLiteConnection.I00000oOI = this;
/* 39 */            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
/* 42 */            sQLiteConnection.I0000Il00O = sQLiteDatabaseConfiguration2;
/* 44 */            sQLiteConnection.I0000O = i;
/* 46 */            sQLiteConnection.I0000oI00 = z;
/* 57 */            sQLiteConnection.I0001Ioi1lo = (sQLiteDatabaseConfiguration.I0000Il00O & 1) != 0;
/* 66 */            sQLiteConnection.I000II = sQLiteConnection.new PreparedStatementCache(sQLiteDatabaseConfiguration2.I0000O);
/* 68 */            closeGuard.I00000oIO();
/* 71 */            VarHandle.storeStoreFence();
                    try {
/* 74 */                sQLiteConnection.I000oI1ioi();
/* 77 */                return sQLiteConnection;
                    } catch (SQLiteException e) {
/* 79 */                sQLiteConnection.I000II(false);
/* 89 */                throw e;
                    }
                }

                public final void I00IOO(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
/* 1 */             if (sQLiteDatabaseConfiguration == null) {
/* 182 */               I000II.I000iOII("configuration must not be null.");
/* 186 */               return;
                    }
                    synchronized (this.I00iiI) {
                        try {
/* 6 */                     I00OOll1();
/* 24 */                    boolean z = ((sQLiteDatabaseConfiguration.I0000Il00O ^ this.I00iio.I0000Il00O) & 536870912) != 0;
/* 25 */                    if (z) {
/* 33 */                        if (!this.I00ll1.isEmpty()) {
/* 49 */                            throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                                }
/* 35 */                        I00000oIO();
                            }
/* 52 */                    this.I00iio.getClass();
/* 65 */                    if (!Arrays.equals(sQLiteDatabaseConfiguration.I0001Ioi1lo, this.I00iio.I0001Ioi1lo)) {
/* 71 */                        this.I00li1OI.I0000oI00(sQLiteDatabaseConfiguration.I0001Ioi1lo);
/* 76 */                        this.I00iio.I00000oIO(sQLiteDatabaseConfiguration);
/* 79 */                        I00000oIO();
/* 82 */                        I00IioO0OiOi();
                            }
/* 85 */                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.I00iio;
/* 91 */                    if (sQLiteDatabaseConfiguration2.I0000Il00O != sQLiteDatabaseConfiguration.I0000Il00O) {
/* 94 */                        if (z) {
/* 96 */                            I00000oIO();
/* 99 */                            SQLiteConnection sQLiteConnection = this.I00li1OI;
/* 101 */                           if (sQLiteConnection != null) {
/* 103 */                               I0000Il00O(sQLiteConnection);
/* 106 */                               this.I00li1OI = null;
                                    }
                                }
/* 108 */                       SQLiteConnection sQLiteConnectionI001l0I00 = I001l0I00(sQLiteDatabaseConfiguration, true);
/* 112 */                       I00000oIO();
/* 115 */                       SQLiteConnection sQLiteConnection2 = this.I00li1OI;
/* 117 */                       if (sQLiteConnection2 != null) {
/* 119 */                           I0000Il00O(sQLiteConnection2);
/* 122 */                           this.I00li1OI = null;
                                }
/* 126 */                       I00100l0(AcquiredConnectionStatus.I00iiO);
/* 129 */                       this.I00li1OI = sQLiteConnectionI001l0I00;
/* 133 */                       this.I00iio.I00000oIO(sQLiteDatabaseConfiguration);
/* 136 */                       I00OIl();
                            } else {
/* 140 */                       sQLiteDatabaseConfiguration2.I00000oIO(sQLiteDatabaseConfiguration);
/* 143 */                       I00OIl();
/* 146 */                       ArrayList arrayList = this.I00l0OO0IO;
/* 148 */                       int size = arrayList.size();
                                while (true) {
                                    int i = size - 1;
/* 157 */                           if (size <= this.I00ilI0I1 - 1) {
                                        break;
                                    }
/* 165 */                           I0000Il00O((SQLiteConnection) arrayList.remove(i));
/* 168 */                           size = i;
                                }
/* 170 */                       I00IioO0OiOi();
                            }
/* 173 */                   I00iiI();
                        } catch (Throwable th) {
/* 179 */                   throw th;
                        }
                    }
                }

                public final void I00IioO0OiOi() {
/* 1 */             SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.I00iio;
/* 3 */             ArrayList arrayList = this.I00l0OO0IO;
/* 5 */             SQLiteConnection sQLiteConnection = this.I00li1OI;
/* 9 */             if (sQLiteConnection != null) {
                        try {
/* 11 */                    sQLiteConnection.I00100o1O0lo(sQLiteDatabaseConfiguration);
                        } catch (RuntimeException e) {
/* 32 */                    Log.e("SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.I00li1OI, e);
/* 37 */                    I0000Il00O(this.I00li1OI);
/* 41 */                    this.I00li1OI = null;
                        }
                    }
/* 43 */            int size = arrayList.size();
/* 47 */            int i = 0;
/* 48 */            while (i < size) {
/* 54 */                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.get(i);
                        try {
/* 56 */                    sQLiteConnection2.I00100o1O0lo(sQLiteDatabaseConfiguration);
                        } catch (RuntimeException e2) {
/* 75 */                    Log.e("SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e2);
/* 78 */                    I0000Il00O(sQLiteConnection2);
/* 83 */                    arrayList.remove(i);
                            size--;
                            i--;
                        }
/* 89 */                i++;
                    }
/* 94 */            I00100l0(AcquiredConnectionStatus.I00iiI);
                }

                public final boolean I00Io1lO(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
/* 1 */             AcquiredConnectionStatus acquiredConnectionStatus2 = AcquiredConnectionStatus.I00iiI;
/* 3 */             AcquiredConnectionStatus acquiredConnectionStatus3 = AcquiredConnectionStatus.I00iiO;
/* 5 */             if (acquiredConnectionStatus == acquiredConnectionStatus2) {
                        try {
/* 9 */                     sQLiteConnection.I00100o1O0lo(this.I00iio);
                        } catch (RuntimeException e) {
/* 30 */                    Log.e("SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
/* 33 */                    acquiredConnectionStatus = acquiredConnectionStatus3;
                        }
                    }
/* 34 */            if (acquiredConnectionStatus != acquiredConnectionStatus3) {
/* 41 */                return true;
                    }
/* 36 */            I0000Il00O(sQLiteConnection);
/* 39 */            return false;
                }

                public final void I00IoiI(SQLiteConnection sQLiteConnection) {
                    synchronized (this.I00iiI) {
                        try {
/* 10 */                    AcquiredConnectionStatus acquiredConnectionStatus = (AcquiredConnectionStatus) this.I00ll1.remove(sQLiteConnection);
/* 12 */                    if (acquiredConnectionStatus == null) {
/* 79 */                        throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                            }
/* 16 */                    if (!this.I00ilO0) {
/* 18 */                        I0000Il00O(sQLiteConnection);
                            } else if (sQLiteConnection.I0000oI00) {
/* 32 */                        if (I00Io1lO(sQLiteConnection, acquiredConnectionStatus)) {
/* 34 */                            this.I00li1OI = sQLiteConnection;
                                }
/* 36 */                        I00iiI();
                            } else if (this.I00l0OO0IO.size() >= this.I00ilI0I1 - 1) {
/* 52 */                        I0000Il00O(sQLiteConnection);
                            } else {
/* 60 */                        if (I00Io1lO(sQLiteConnection, acquiredConnectionStatus)) {
/* 64 */                            this.I00l0OO0IO.add(sQLiteConnection);
                                }
/* 67 */                        I00iiI();
                            }
                        } catch (Throwable th) {
/* 186 */                   throw th;
                        }
                    }
                }

                public final void I00OIl() {
/* 8 */             if ((this.I00iio.I0000Il00O & 536870912) != 0) {
/* 17 */                this.I00ilI0I1 = Math.max(2, 10);
                    } else {
/* 21 */                this.I00ilI0I1 = 1;
                    }
                }

                public final void I00OOll1() {
/* 3 */             if (this.I00ilO0) {
/* 5 */                 return;
                    }
/* 8 */             I000II.I001IO000("Cannot perform this operation because the connection pool has been closed.");
                }

                public final SQLiteConnection I00Ol00(int i, String str) {
/* 1 */             ArrayList arrayList = this.I00l0OO0IO;
/* 3 */             int size = arrayList.size();
/* 9 */             if (size > 1 && str != null) {
/* 14 */                for (int i2 = 0; i2 < size; i2++) {
/* 20 */                    SQLiteConnection sQLiteConnection = (SQLiteConnection) arrayList.get(i2);
/* 28 */                    if (sQLiteConnection.I000II.get(str) != null) {
/* 30 */                        arrayList.remove(i2);
/* 33 */                        I000O01llI0(sQLiteConnection, i);
/* 36 */                        return sQLiteConnection;
                            }
                        }
                    }
/* 40 */            if (size > 0) {
/* 47 */                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) arrayList.remove(size - 1);
/* 49 */                I000O01llI0(sQLiteConnection2, i);
/* 52 */                return sQLiteConnection2;
                    }
/* 55 */            int size2 = this.I00ll1.size();
/* 61 */            if (this.I00li1OI != null) {
/* 63 */                size2++;
                    }
/* 67 */            if (size2 >= this.I00ilI0I1) {
/* 69 */                return null;
                    }
/* 73 */            SQLiteConnection sQLiteConnectionI001l0I00 = I001l0I00(this.I00iio, false);
/* 77 */            I000O01llI0(sQLiteConnectionI001l0I00, i);
/* 89 */            return sQLiteConnectionI001l0I00;
                }

                public final SQLiteConnection I00iOIl(int i) {
/* 1 */             SQLiteConnection sQLiteConnection = this.I00li1OI;
/* 4 */             if (sQLiteConnection != null) {
/* 6 */                 this.I00li1OI = null;
/* 8 */                 I000O01llI0(sQLiteConnection, i);
/* 11 */                return sQLiteConnection;
                    }
/* 18 */            Iterator it = this.I00ll1.keySet().iterator();
/* 26 */            while (it.hasNext()) {
/* 36 */                if (((SQLiteConnection) it.next()).I0000oI00) {
/* 3 */                     return null;
                        }
                    }
/* 42 */            SQLiteConnection sQLiteConnectionI001l0I00 = I001l0I00(this.I00iio, true);
/* 46 */            I000O01llI0(sQLiteConnectionI001l0I00, i);
/* 49 */            return sQLiteConnectionI001l0I00;
                }

                public final void I00iiI() {
                    SQLiteConnection sQLiteConnectionI00iOIl;
/* 1 */             ConnectionWaiter connectionWaiter = this.I00l0I0l0lO1;
/* 5 */             ConnectionWaiter connectionWaiter2 = null;
/* 6 */             boolean z = false;
/* 7 */             boolean z2 = false;
/* 8 */             while (connectionWaiter != null) {
/* 12 */                boolean z3 = true;
/* 13 */                if (this.I00ilO0) {
                            try {
/* 18 */                        if (connectionWaiter.I0000oI00 || z) {
/* 36 */                            sQLiteConnectionI00iOIl = null;
                                } else {
/* 26 */                            sQLiteConnectionI00iOIl = I00Ol00(connectionWaiter.I000II, connectionWaiter.I0001Ioi1lo);
/* 30 */                            if (sQLiteConnectionI00iOIl == null) {
/* 32 */                                z = true;
                                    }
                                }
/* 37 */                        if (sQLiteConnectionI00iOIl == null && !z2 && (sQLiteConnectionI00iOIl = I00iOIl(connectionWaiter.I000II)) == null) {
/* 49 */                            z2 = true;
                                }
/* 50 */                        if (sQLiteConnectionI00iOIl != null) {
/* 52 */                            connectionWaiter.I000O01llI0 = sQLiteConnectionI00iOIl;
                                } else if (z && z2) {
/* 113 */                           return;
                                } else {
/* 60 */                            z3 = false;
                                }
                            } catch (RuntimeException e) {
/* 62 */                        connectionWaiter.I000OOo1O = e;
                            }
                        }
/* 64 */                ConnectionWaiter connectionWaiter3 = connectionWaiter.I00000oIO;
/* 66 */                if (z3) {
/* 68 */                    if (connectionWaiter2 != null) {
/* 70 */                        connectionWaiter2.I00000oIO = connectionWaiter3;
                            } else {
/* 73 */                        this.I00l0I0l0lO1 = connectionWaiter3;
                            }
/* 75 */                    connectionWaiter.I00000oIO = null;
/* 79 */                    LockSupport.unpark(connectionWaiter.I00000oOI);
                        } else {
/* 83 */                    connectionWaiter2 = connectionWaiter;
                        }
/* 84 */                connectionWaiter = connectionWaiter3;
                    }
                }

                @Override
                public final void close() {
/* 2 */             I000II(false);
                }

                public final void finalize() throws Throwable {
                    try {
/* 2 */                 I000II(true);
                    } finally {
/* 10 */                super.finalize();
                    }
                }

                public final String toString() {
/* 15 */            return "SQLiteConnectionPool: " + this.I00iio.I00000oIO;
                }
            }
