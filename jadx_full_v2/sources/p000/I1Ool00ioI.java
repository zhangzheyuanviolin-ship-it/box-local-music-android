            package p000;

            import java.util.concurrent.locks.Condition;
            import java.util.concurrent.locks.ReentrantLock;
            
/* 27 */    public class I1Ool00ioI extends Oo11IoI {
                public static final O1I1OO I000O01llI0;
                public static I1Ool00ioI I000OOo1O;
                public static final ReentrantLock I000OiO;
                public static final Condition I000iOII;
                public static final long I000l1;
                public static final long I000lI;
                public int I0000oI00;
                public int I0001Ioi1lo = -1;
                public long I000II;

                static {
/* 6 */             O1I1OO o1i1oo = new O1I1OO(10, (byte) 0);
/* 13 */            o1i1oo.I00iiO = new I1Ool00ioI[8];
/* 15 */            I000O01llI0 = o1i1oo;
/* 19 */            ReentrantLock reentrantLock = new ReentrantLock();
/* 22 */            I000OiO = reentrantLock;
/* 28 */            I000iOII = reentrantLock.newCondition();
/* 33 */            I000l1 = 60000L;
/* 40 */            I000lI = 60000000000L;
                }

                public final void I000O01llI0() {
/* 1 */             long j = this.I0000Il00O;
/* 3 */             boolean z = this.I00000oIO;
/* 9 */             if (j != 0 || z) {
/* 14 */                ReentrantLock reentrantLock = I000OiO;
/* 16 */                reentrantLock.lock();
                        try {
/* 21 */                    if (this.I0000oI00 != 0) {
/* 42 */                        throw new IllegalStateException("Unbalanced enter/exit");
                            }
/* 24 */                    this.I0000oI00 = 1;
/* 26 */                    iOOOI0OI.I00000oOI(this, j, z);
                        } finally {
/* 43 */                    reentrantLock.unlock();
                        }
                    }
                }

                public final boolean I000OOo1O() {
/* 1 */             ReentrantLock reentrantLock = I000OiO;
/* 3 */             reentrantLock.lock();
                    try {
/* 6 */                 int i = this.I0000oI00;
/* 9 */                 this.I0000oI00 = 0;
/* 12 */                if (i != 1) {
/* 26 */                    return i == 2;
                        }
/* 16 */                I000O01llI0.I0010o(this);
/* 8 */                 return false;
                    } finally {
/* 33 */                reentrantLock.unlock();
                    }
                }

/* 28 */        public void I000OiO() {
                }
            }
