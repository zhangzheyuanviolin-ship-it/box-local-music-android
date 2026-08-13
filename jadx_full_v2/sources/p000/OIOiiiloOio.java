            package p000;

            import java.util.concurrent.locks.ReentrantLock;
            
            public final class OIOiiiloOio {
                public ReentrantLock I00000oIO;
                public long[] I00000oOI;
                public boolean[] I0000Il00O;
                public volatile boolean I0000O;
                public ReentrantLock I0000oI00;
                public volatile boolean I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oIO(int[] iArr) {
/* 1 */             ReentrantLock reentrantLock = this.I00000oIO;
/* 3 */             reentrantLock.lock();
                    try {
/* 7 */                 boolean z = false;
/* 9 */                 boolean z2 = false;
/* 11 */                for (int i : iArr) {
/* 15 */                    long[] jArr = this.I00000oOI;
/* 17 */                    long j = jArr[i];
/* 22 */                    jArr[i] = 1 + j;
/* 28 */                    if (j == 0) {
/* 30 */                        this.I0000O = true;
/* 32 */                        z2 = true;
                            }
                        }
/* 39 */                if (z2 || this.I0000O) {
/* 49 */                    z = true;
                        } else if (this.I0001Ioi1lo) {
                        }
/* 50 */                reentrantLock.unlock();
/* 53 */                return z;
                    } catch (Throwable th) {
/* 54 */                reentrantLock.unlock();
/* 77 */                throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00000oOI(int[] iArr) {
/* 1 */             ReentrantLock reentrantLock = this.I00000oIO;
/* 3 */             reentrantLock.lock();
                    try {
/* 7 */                 boolean z = false;
/* 9 */                 boolean z2 = false;
/* 11 */                for (int i : iArr) {
/* 15 */                    long[] jArr = this.I00000oOI;
/* 17 */                    long j = jArr[i];
/* 23 */                    jArr[i] = j - 1;
/* 27 */                    if (j == 1) {
/* 29 */                        this.I0000O = true;
/* 31 */                        z2 = true;
                            }
                        }
/* 38 */                if (z2 || this.I0000O) {
/* 48 */                    z = true;
                        } else if (this.I0001Ioi1lo) {
                        }
/* 49 */                reentrantLock.unlock();
/* 52 */                return z;
                    } catch (Throwable th) {
/* 53 */                reentrantLock.unlock();
/* 77 */                throw th;
                    }
                }
            }
