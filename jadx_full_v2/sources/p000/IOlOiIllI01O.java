            package p000;

            import sun.misc.Unsafe;
            
            public abstract class IOlOiIllI01O {
                public static final I0OooiI1I I00000oIO = new I0OooiI1I("CLOSED", 3);

                public static final Object I00000oIO(Oii1O0I oii1O0I, long j, IlliIl1l11O illiIl1l11O) {
                    while (true) {
/* 1 */                 Oii1O0I oii1O0I2 = oii1O0I;
                        while (true) {
/* 6 */                     if (oii1O0I2.I00iio >= j && !oii1O0I2.I0000O()) {
/* 15 */                        return oii1O0I2;
                            }
/* 16 */                    Unsafe unsafe = I1Ioolli0l0o.I00000oIO;
/* 18 */                    long j2 = IOlOio11.I00iOIl;
/* 20 */                    Object objectVolatile = unsafe.getObjectVolatile(oii1O0I2, j2);
/* 24 */                    I0OooiI1I i0OooiI1I = I00000oIO;
/* 26 */                    if (objectVolatile == i0OooiI1I) {
/* 28 */                        return i0OooiI1I;
                            }
/* 31 */                    oii1O0I = (Oii1O0I) ((IOlOio11) objectVolatile);
/* 33 */                    if (oii1O0I != null) {
                                break;
                            }
/* 50 */                    Oii1O0I oii1O0I3 = (Oii1O0I) illiIl1l11O.invoke(Long.valueOf(oii1O0I2.I00iio + 1), oii1O0I2);
/* 57 */                    if (unsafe.compareAndSwapObject(oii1O0I2, j2, (Object) null, oii1O0I3)) {
/* 63 */                        if (oii1O0I2.I0000O()) {
/* 65 */                            oii1O0I2.I0000oI00();
                                }
/* 68 */                        oii1O0I2 = oii1O0I3;
                            }
                        }
                    }
                }
            }
