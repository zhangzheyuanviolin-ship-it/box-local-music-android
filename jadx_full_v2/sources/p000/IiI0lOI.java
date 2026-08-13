            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            
/* 47 */    public abstract class IiI0lOI implements OIOiIOO0l0O {
                public static final long I00ilI0I1 = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IiI0lOI.class.getDeclaredField("top"));
                public final int I00iOIl;
                public final int I00iiI;
                public final AtomicReferenceArray I00iiO;
                public final int[] I00iio;
                private volatile long top;

                public IiI0lOI(int i) {
/* 4 */             if (i <= 0) {
/* 66 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "capacity should be positive but it is "));
/* 186 */               throw null;
                    }
/* 9 */             if (i > 536870911) {
/* 55 */                I000II.I0010I0i(Oi010OO0.I000oI1ioi(i, "capacity should be less or equal to 536870911 but it is "));
/* 59 */                throw null;
                    }
/* 13 */            this.top = 0L;
/* 23 */            int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
/* 25 */            this.I00iOIl = iHighestOneBit;
/* 33 */            this.I00iiI = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
/* 37 */            int i2 = iHighestOneBit + 1;
/* 42 */            this.I00iiO = new AtomicReferenceArray(i2);
/* 46 */            this.I00iio = new int[i2];
                }

                @Override
                public final void I00000oOI() {
/* 5 */             while (I000II() != null) {
                    }
                }

                public abstract Object I0000Il00O();

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
                
                    r8 = 0;
                    r1 = r10;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II() {
                    int i;
                    IiI0lOI iiI0lOI;
                    while (true) {
/* 1 */                 long j = this.top;
/* 8 */                 if (j == 0) {
                            break;
                        }
/* 25 */                long j2 = ((j >> 32) & 4294967295L) + 1;
/* 27 */                i = (int) (4294967295L & j);
/* 28 */                if (i == 0) {
                            break;
                        }
/* 43 */                iiI0lOI = this;
/* 48 */                if (I1Ioolli0l0o.I00000oIO.compareAndSwapLong(iiI0lOI, I00ilI0I1, j, (j2 << 32) | this.I00iio[i])) {
                            break;
                        }
/* 61 */                this = iiI0lOI;
                    }
/* 51 */            if (i == 0) {
/* 50 */                return null;
                    }
/* 56 */            return iiI0lOI.I00iiO.getAndSet(i, null);
                }

                @Override
                public final Object I001lllioOl() {
/* 1 */             Object objI000II = I000II();
                    return objI000II != null ? I00000oIO(objI000II) : I0000Il00O();
                }

                @Override
                public final void I00o101lO(Object obj) {
/* 1 */             I000O01llI0(obj);
/* 15 */            int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.I00iiI) + 1;
/* 17 */            int i = 0;
/* 20 */            while (i < 8) {
/* 29 */                if (!this.I00iiO.compareAndSet(iIdentityHashCode, null, obj)) {
/* 78 */                    IiI0lOI iiI0lOI = this;
                            iIdentityHashCode--;
/* 81 */                    if (iIdentityHashCode == 0) {
/* 83 */                        iIdentityHashCode = iiI0lOI.I00iOIl;
                            }
/* 86 */                    i++;
/* 88 */                    this = iiI0lOI;
                        } else {
/* 31 */                    if (iIdentityHashCode <= 0) {
/* 74 */                        I000II.I000iOII("index should be positive");
/* 77 */                        return;
                            }
                            while (true) {
/* 33 */                        long j = this.top;
/* 52 */                        long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | iIdentityHashCode;
/* 56 */                        this.I00iio[iIdentityHashCode] = (int) (4294967295L & j);
/* 62 */                        IiI0lOI iiI0lOI2 = this;
/* 67 */                        if (I1Ioolli0l0o.I00000oIO.compareAndSwapLong(iiI0lOI2, I00ilI0I1, j, j2)) {
/* 186 */                           return;
                                } else {
/* 70 */                            this = iiI0lOI2;
                                }
                            }
                        }
                    }
                }

/* 48 */        public Object I00000oIO(Object obj) {
/* 49 */            return obj;
                }

/* 48 */        public void I000O01llI0(Object obj) {
                }
            }
