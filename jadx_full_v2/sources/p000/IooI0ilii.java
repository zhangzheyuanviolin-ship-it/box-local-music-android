            package p000;
            
            public final class IooI0ilii implements IooI100o11O {
                public long I00000oIO;
                public int I00000oOI;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public synchronized boolean I00000oIO() {
                    boolean z;
/* 4 */             if (this.I00000oOI != 0) {
/* 21 */                z = System.currentTimeMillis() > this.I00000oIO;
                    }
/* 23 */            return z;
                }

                public synchronized void I00000oOI(int i) {
/* 4 */             if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                        synchronized (this) {
/* 93 */                    this.I00000oOI = 0;
                        }
/* 97 */                return;
                    } else {
                        this.I00000oOI++;
                        synchronized (this) {
/* 82 */                    this.I00000oIO = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.I00000oOI) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
                        }
/* 85 */                return;
                    }
                }

                @Override
                public Ioo1Ololi1 toInstant() {
/* 3 */             long j = this.I00000oIO;
/* 5 */             Ioo1Ololi1 ioo1Ololi1 = Ioo1Ololi1.I00iiO;
/* 7 */             Ioo1Ololi1 ioo1Ololi12 = Ioo1Ololi1.I00iiO;
/* 13 */            if (j >= ioo1Ololi12.I00iOIl) {
/* 15 */                Ioo1Ololi1 ioo1Ololi13 = Ioo1Ololi1.I00iio;
/* 21 */                if (j <= ioo1Ololi13.I00iOIl) {
/* 23 */                    long j2 = this.I00000oOI;
/* 29 */                    long j3 = j2 / 1000000000;
/* 37 */                    if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                                j3--;
                            }
/* 48 */                    long j4 = j + j3;
/* 54 */                    if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                                return j > 0 ? ioo1Ololi13 : ioo1Ololi12;
                            }
/* 73 */                    if (j4 >= -31557014167219200L) {
/* 83 */                        if (j4 <= 31556889864403199L) {
/* 86 */                            long j5 = j2 % 1000000000;
/* 100 */                           return new Ioo1Ololi1((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
                                }
                            }
                        }
                    }
/* 541 */           throw new IoOoiol010lI("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
                }
            }
