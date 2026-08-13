            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOiolloo {
                public static boolean I00000oIO(int i) {
                    return i == 6 || i == 1 || i == 2 || i == 4;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0008  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[PHI: r1
                  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static I1io1I I00000oOI(int i) {
/* 1 */             int i2 = 6;
/* 2 */             if (i != 0) {
/* 5 */                 int i3 = 1;
/* 7 */                 if (i != 1) {
/* 11 */                    if (i == 2) {
/* 13 */                        i2 = i3;
                            } else {
/* 15 */                        i3 = 5;
/* 17 */                        if (i != 3) {
/* 21 */                            if (i == 4) {
/* 23 */                                i2 = 3;
                                    } else if (i != 5) {
/* 28 */                                if (i == 6) {
/* 9 */                                     i2 = 2;
                                        } else {
/* 31 */                                    i3 = 7;
/* 32 */                                    if (i != 7 && i != 8) {
/* 42 */                                        if (i == 9) {
/* 44 */                                            i2 = 4;
                                                } else if (i != 10) {
/* 53 */                                            if (i != 11 && i != 12 && i != 13) {
/* 82 */                                                IoOOl0iOl1io.I001l0I00("Unexpected CameraError: ", IIlOloloOil.I00000oOI(i));
/* 85 */                                                return null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 67 */            I1io1I i1io1I = new I1io1I();
/* 70 */            i1io1I.I00000oIO = i2;
/* 72 */            VarHandle.storeStoreFence();
/* 75 */            return i1io1I;
                }
            }
