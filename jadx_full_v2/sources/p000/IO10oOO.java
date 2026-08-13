            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            import kotlin.jvm.functions.Function1;
            
            public final class IO10oOO extends Oii1O0I {
                public final IIIII1OI1 I00io1l;
                public final AtomicReferenceArray I00ioIO;

                public IO10oOO(long j, IO10oOO iO10oOO, IIIII1OI1 iiiii1oi1, int i) {
/* 1 */             super(j, iO10oOO, i);
/* 4 */             this.I00io1l = iiiii1oi1;
/* 15 */            this.I00ioIO = new AtomicReferenceArray(IIIIIoiliIiO.I00000oOI * 2);
                }

                @Override
                public final int I000II() {
/* 1 */             return IIIIIoiliIiO.I00000oOI;
                }

                /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
                
                    I000o00OoI0I(r7, null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
                
                    if (r1 == false) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
                
                    r6 = r4.I00iiI;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
                
                    if (r6 == null) goto L65;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
                
                    p000.l1l0ii1lOoI1.I00000oIO(r6, r0, r8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x0054, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
                
                    return;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(int i, Ii00l101O ii00l101O) {
                    Function1 function1;
/* 1 */             int i2 = IIIIIoiliIiO.I00000oOI;
/* 7 */             boolean z = i >= i2;
/* 8 */             if (z) {
/* 10 */                i -= i2;
                    }
/* 15 */            Object obj = this.I00ioIO.get(i * 2);
                    while (true) {
/* 19 */                Object objI000l1 = I000l1(i);
/* 23 */                boolean z2 = objI000l1 instanceof OoooliO1IoI1;
/* 25 */                IIIII1OI1 iiiii1oi1 = this.I00io1l;
/* 28 */                if (z2 || (objI000l1 instanceof Ooooo1IIIoo0)) {
/* 97 */                    if (I000iOII(i, objI000l1, z ? IIIIIoiliIiO.I000OiO : IIIIIoiliIiO.I000iOII)) {
/* 99 */                        I000o00OoI0I(i, null);
/* 104 */                       I000lI(i, !z);
/* 107 */                       if (!z || (function1 = iiiii1oi1.I00iiI) == null) {
/* 551 */                           return;
                                }
/* 113 */                       l1l0ii1lOoI1.I00000oIO(function1, obj, ii00l101O);
/* 551 */                       return;
                            }
                        } else {
/* 37 */                    if (objI000l1 == IIIIIoiliIiO.I000OiO || objI000l1 == IIIIIoiliIiO.I000iOII) {
                                break;
                            }
/* 46 */                    if (objI000l1 != IIIIIoiliIiO.I000II && objI000l1 != IIIIIoiliIiO.I0001Ioi1lo) {
/* 55 */                        if (objI000l1 == IIIIIoiliIiO.I000OOo1O || objI000l1 == IIIIIoiliIiO.I0000O || objI000l1 == IIIIIoiliIiO.I000l1) {
/* 551 */                           return;
                                }
/* 69 */                        IOOlIIilOl0.I000lI("unexpected state: ", objI000l1);
/* 72 */                        return;
                            }
                        }
                    }
                }

                public final boolean I000iOII(int i, Object obj, Object obj2) {
/* 7 */             return this.I00ioIO.compareAndSet((i * 2) + 1, obj, obj2);
                }

                public final Object I000l1(int i) {
/* 7 */             return this.I00ioIO.get((i * 2) + 1);
                }

                public final void I000lI(int i, boolean z) {
/* 1 */             if (z) {
/* 13 */                this.I00io1l.I00IoO0((this.I00iio * IIIIIoiliIiO.I00000oOI) + i);
                    }
/* 16 */            I000OOo1O();
                }

                public final void I000o00OoI0I(int i, Object obj) {
/* 5 */             this.I00ioIO.set(i * 2, obj);
                }

                public final void I000oI1ioi(int i, Object obj) {
/* 7 */             this.I00ioIO.set((i * 2) + 1, obj);
                }
            }
