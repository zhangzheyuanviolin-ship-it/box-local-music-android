            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            
            public abstract class Oii1iIoiil0o {
                public static final Oii1O1l I00000oIO = new Oii1O1l(new byte[0], 0, 0, null);
                public static final int I00000oOI;
                public static final int I0000Il00O;
                public static final int I0000O;
                public static final int I0000oI00;
                public static final AtomicReferenceArray I0001Ioi1lo;
                public static final AtomicReferenceArray I000II;

                static {
                    int iIntValue;
/* 1 */             int i = 0;
/* 24 */            int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
/* 28 */            I00000oOI = iHighestOneBit;
/* 30 */            int i2 = iHighestOneBit / 2;
/* 32 */            int i3 = i2 >= 1 ? i2 : 1;
/* 36 */            I0000Il00O = i3;
/* 65 */            Integer numI000lI = OlOolloIIOl0.I000lI(10, System.getProperty("kotlinx.io.pool.size.bytes", O0000Ioio00.I0000O(System.getProperty("java.vm.name"), "Dalvik") ? OIllioIilO.I01OO1I : "4194304"));
/* 69 */            if (numI000lI != null && (iIntValue = numI000lI.intValue()) >= 0) {
/* 78 */                i = iIntValue;
                    }
/* 79 */            I0000O = i;
/* 81 */            int i4 = i / i3;
/* 84 */            if (i4 < 8192) {
/* 86 */                i4 = 8192;
                    }
/* 87 */            I0000oI00 = i4;
/* 94 */            I0001Ioi1lo = new AtomicReferenceArray(iHighestOneBit);
/* 101 */           I000II = new AtomicReferenceArray(i3);
                }

                public static final void I00000oIO(Oii1O1l oii1O1l) {
/* 1 */             Oii1O1l oii1O1l2 = I00000oIO;
/* 5 */             if (oii1O1l.I0001Ioi1lo != null || oii1O1l.I000II != null) {
/* 168 */               I000II.I000iOII("Failed requirement.");
/* 186 */               return;
                    }
/* 11 */            OOo10l0o0IOO oOo10l0o0IOO = oii1O1l.I0000O;
/* 15 */            if (oOo10l0o0IOO != null && oOo10l0o0IOO.I00000oIO != 0) {
/* 24 */                int iDecrementAndGet = OOo10l0o0IOO.I00000oOI.decrementAndGet(oOo10l0o0IOO);
/* 28 */                if (iDecrementAndGet >= 0) {
/* 165 */                   return;
                        }
/* 33 */                if (iDecrementAndGet != -1) {
/* 41 */                    OIiilo1Ool0o.I00000oOI(iDecrementAndGet + 1, "Shared copies count is negative: ");
/* 44 */                    return;
                        }
/* 35 */                oOo10l0o0IOO.I00000oIO = 0;
                    }
/* 45 */            AtomicReferenceArray atomicReferenceArray = I0001Ioi1lo;
/* 62 */            int id = (int) ((I00000oOI - 1) & Thread.currentThread().getId());
/* 63 */            oii1O1l.I00000oOI = 0;
/* 65 */            oii1O1l.I0000oI00 = true;
                    while (true) {
/* 71 */                Oii1O1l oii1O1l3 = (Oii1O1l) atomicReferenceArray.get(id);
/* 73 */                if (oii1O1l3 != oii1O1l2) {
/* 80 */                    int i = oii1O1l3 != null ? oii1O1l3.I0000Il00O : 0;
/* 83 */                    if (i < 65536) {
/* 153 */                       oii1O1l.I0001Ioi1lo = oii1O1l3;
/* 157 */                       oii1O1l.I0000Il00O = i + 8192;
/* 163 */                       if (atomicReferenceArray.compareAndSet(id, oii1O1l3, oii1O1l)) {
/* 165 */                           return;
                                }
                            } else {
/* 87 */                        if (I0000O <= 0) {
/* 165 */                           return;
                                }
/* 89 */                        oii1O1l.I00000oOI = 0;
/* 91 */                        oii1O1l.I0000oI00 = true;
/* 106 */                       int id2 = (int) ((I0000Il00O - 1) & Thread.currentThread().getId());
/* 107 */                       AtomicReferenceArray atomicReferenceArray2 = I000II;
/* 109 */                       int i2 = 0;
                                while (true) {
/* 114 */                           Oii1O1l oii1O1l4 = (Oii1O1l) atomicReferenceArray2.get(id2);
/* 116 */                           if (oii1O1l4 != oii1O1l2) {
/* 124 */                               int i3 = (oii1O1l4 != null ? oii1O1l4.I0000Il00O : 0) + 8192;
/* 128 */                               if (i3 > I0000oI00) {
/* 130 */                                   int i4 = I0000Il00O;
/* 132 */                                   if (i2 >= i4) {
/* 165 */                                       return;
                                            }
/* 134 */                                   i2++;
/* 140 */                                   id2 = (id2 + 1) & (i4 - 1);
                                        } else {
/* 142 */                                   oii1O1l.I0001Ioi1lo = oii1O1l4;
/* 144 */                                   oii1O1l.I0000Il00O = i3;
/* 150 */                                   if (atomicReferenceArray2.compareAndSet(id2, oii1O1l4, oii1O1l)) {
/* 165 */                                       return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                public static final Oii1O1l I00000oOI() {
                    AtomicReferenceArray atomicReferenceArray;
                    Oii1O1l oii1O1l;
                    Oii1O1l oii1O1l2;
/* 16 */            int id = (int) ((I00000oOI - 1) & Thread.currentThread().getId());
/* 31 */            do {
/* 17 */                atomicReferenceArray = I0001Ioi1lo;
/* 19 */                oii1O1l = I00000oIO;
/* 25 */                oii1O1l2 = (Oii1O1l) atomicReferenceArray.getAndSet(id, oii1O1l);
/* 31 */            } while (O0000Ioio00.I0000O(oii1O1l2, oii1O1l));
/* 36 */            if (oii1O1l2 != null) {
/* 139 */               atomicReferenceArray.set(id, oii1O1l2.I0001Ioi1lo);
/* 142 */               oii1O1l2.I0001Ioi1lo = null;
/* 144 */               oii1O1l2.I0000Il00O = 0;
/* 541 */               return oii1O1l2;
                    }
/* 38 */            atomicReferenceArray.set(id, null);
/* 46 */            if (I0000O <= 0) {
/* 122 */               Oii1O1l oii1O1l3 = new Oii1O1l();
/* 127 */               oii1O1l3.I00000oIO = new byte[8192];
/* 129 */               oii1O1l3.I0000oI00 = true;
/* 131 */               oii1O1l3.I0000O = null;
/* 133 */               VarHandle.storeStoreFence();
/* 136 */               return oii1O1l3;
                    }
/* 48 */            int i = I0000Il00O;
/* 61 */            int id2 = (int) (Thread.currentThread().getId() & (i - 1));
/* 62 */            int i2 = 0;
                    while (true) {
/* 63 */                AtomicReferenceArray atomicReferenceArray2 = I000II;
/* 69 */                Oii1O1l oii1O1l4 = (Oii1O1l) atomicReferenceArray2.getAndSet(id2, oii1O1l);
/* 75 */                if (!O0000Ioio00.I0000O(oii1O1l4, oii1O1l)) {
/* 78 */                    if (oii1O1l4 != null) {
/* 112 */                       atomicReferenceArray2.set(id2, oii1O1l4.I0001Ioi1lo);
/* 115 */                       oii1O1l4.I0001Ioi1lo = null;
/* 117 */                       oii1O1l4.I0000Il00O = 0;
/* 119 */                       return oii1O1l4;
                            }
/* 80 */                    atomicReferenceArray2.set(id2, null);
/* 83 */                    if (i2 >= i) {
/* 95 */                        Oii1O1l oii1O1l5 = new Oii1O1l();
/* 100 */                       oii1O1l5.I00000oIO = new byte[8192];
/* 102 */                       oii1O1l5.I0000oI00 = true;
/* 104 */                       oii1O1l5.I0000O = null;
/* 106 */                       VarHandle.storeStoreFence();
/* 109 */                       return oii1O1l5;
                            }
/* 89 */                    id2 = (id2 + 1) & (i - 1);
/* 90 */                    i2++;
                        }
                    }
                }
            }
