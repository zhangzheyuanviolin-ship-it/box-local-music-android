            package net.zetetic.database.sqlcipher;

            import java.io.Closeable;
            
            public abstract class SQLiteClosable implements Closeable {
                public int I00iOIl = 1;

                public final void I00000oIO() {
                    synchronized (this) {
                        try {
/* 4 */                     int i = this.I00iOIl;
/* 6 */                     if (i <= 0) {
/* 33 */                        throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                            }
/* 10 */                    this.I00iOIl = i + 1;
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                public abstract void I0000Il00O();

                public final void I000II() {
                    boolean z;
                    synchronized (this) {
/* 4 */                 z = true;
/* 5 */                 int i = this.I00iOIl - 1;
/* 6 */                 this.I00iOIl = i;
/* 8 */                 if (i != 0) {
/* 11 */                    z = false;
                        }
                    }
/* 13 */            if (z) {
/* 15 */                I0000Il00O();
                    }
                }

                @Override
                public final void close() {
/* 1 */             I000II();
                }
            }
