            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.function.Supplier;
            
            public final class i0OO1lIo implements Supplier {
                public static final i0OO1lIo I00000oOI = new i0OO1lIo(7);
                public static final i0OO1lIo I0000Il00O = new i0OO1lIo(8);
                public static final i0OO1lIo I0000O = new i0OO1lIo(9);
                public final int I00000oIO;

                public i0OO1lIo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 112 */                   i0IO00li1 i0io00li1 = i0IOo0.I00lll10;
/* 116 */                   return new i0IIl1IOl1oO(1, (byte) 0);
                        case 1:
/* 108 */                   return new i0Ii1001oOI(1, (byte) 0);
                        case 2:
/* 88 */                    i0Ii0l i0ii0l = i0Ii0l.I00iiI;
/* 92 */                    i0Ii0iIliIil i0ii0iiliiil = new i0Ii0iIliIil();
/* 100 */                   i0ii0iiliiil.I00000oIO = new ArrayList();
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   return i0ii0iiliiil;
                        case 3:
/* 76 */                    i0IOoO1 i0iooo1 = new i0IOoO1();
/* 83 */                    i0iooo1.I00000oIO = new Object[8];
/* 85 */                    i0iooo1.I00000oOI = 0;
/* 87 */                    return i0iooo1;
                        case 4:
/* 66 */                    ioI11OIOiiI ioi11oioiii = ioIl00.I00lll10;
/* 70 */                    return new io1ooI0l(2, (byte) 0);
                        case 5:
/* 62 */                    return new ioOil0i1o(2, (byte) 0);
                        case 6:
/* 42 */                    ioOi0IO1oOI iooi0io1ooi = ioOi0IO1oOI.I00iiI;
/* 46 */                    ioOI00O0o1li iooi00o0o1li = new ioOI00O0o1li();
/* 54 */                    iooi00o0o1li.I00000oIO = new ArrayList();
/* 56 */                    VarHandle.storeStoreFence();
/* 59 */                    return iooi00o0o1li;
                        case 7:
/* 34 */                    lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 38 */                    return new lO1l0Oi(4, (byte) 0);
                        case 8:
/* 16 */                    lOIo1liOoI loio1liooi = lOIo1liOoI.I00iiI;
/* 20 */                    lOIllO loillo = new lOIllO();
/* 28 */                    loillo.I00000oIO = new ArrayList();
/* 30 */                    VarHandle.storeStoreFence();
/* 33 */                    return loillo;
                        default:
/* 12 */                    return new lOO0OIOiiOO(4, (byte) 0);
                    }
                }
            }
