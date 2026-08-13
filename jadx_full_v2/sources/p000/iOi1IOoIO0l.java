            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.locks.LockSupport;
            
            public abstract class iOi1IOoIO0l {
                public static final Object I00000oIO(Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O) {
                    Il10o00 il10o00I00000oIO;
                    Ii00l101O ii00l101OI00000oIO;
                    long jI010i10l;
/* 1 */             Ii00l0i1loO ii00l0i1loO = o0iOli.I00iiO;
/* 7 */             Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ii00l101O.I00lli11(ii00l0i1loO);
/* 9 */             Il00o11 il00o11 = Il00o11.I00iOIl;
/* 12 */            if (ii00lIOoi == null) {
/* 14 */                il10o00I00000oIO = Oo100i0OO.I00000oIO();
/* 22 */                ii00l101OI00000oIO = iioloOl.I00000oIO(il00o11, ii00l101O.I00ioIO(il10o00I00000oIO), true);
/* 26 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 28 */                if (ii00l101OI00000oIO != iiI0oillOO10 && ii00l101OI00000oIO.I00lli11(ii00l0i1loO) == null) {
/* 36 */                    ii00l101OI00000oIO = ii00l101OI00000oIO.I00ioIO(iiI0oillOO10);
                        }
                    } else {
/* 47 */                il10o00I00000oIO = (Il10o00) Oo100i0OO.I00000oIO.get();
/* 49 */                ii00l101OI00000oIO = iioloOl.I00000oIO(il00o11, ii00l101O, true);
/* 53 */                IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 55 */                if (ii00l101OI00000oIO != iiI0oillOO102 && ii00l101OI00000oIO.I00lli11(ii00l0i1loO) == null) {
/* 63 */                    ii00l101OI00000oIO = ii00l101OI00000oIO.I00ioIO(iiI0oillOO102);
                        }
                    }
/* 69 */            Thread threadCurrentThread = Thread.currentThread();
/* 73 */            II101I11 ii101i11 = new II101I11(ii00l101OI00000oIO, true);
/* 76 */            ii101i11.I00ilI0I1 = threadCurrentThread;
/* 78 */            VarHandle.storeStoreFence();
/* 83 */            ii101i11.I00iiO(Ii01I10.I00iOIl, ii101i11, illiIl1l11O);
/* 87 */            if (il10o00I00000oIO != null) {
/* 89 */                il10o00I00000oIO.I010II(false);
                    }
                    while (true) {
/* 92 */                if (il10o00I00000oIO != null) {
                            try {
/* 94 */                        jI010i10l = il10o00I00000oIO.I010i10l();
                            } catch (Throwable th) {
/* 158 */                       if (il10o00I00000oIO != null) {
/* 160 */                           il10o00I00000oIO.I00ooiO1I(false);
                                }
/* 551 */                       throw th;
                            }
                        } else {
/* 101 */                   jI010i10l = Long.MAX_VALUE;
                        }
/* 110 */               if (ii101i11.I00oII()) {
                            break;
                        }
/* 112 */               LockSupport.parkNanos(ii101i11, jI010i10l);
/* 119 */               if (Thread.interrupted()) {
/* 126 */                   ii101i11.I00111O(new InterruptedException());
                        }
                    }
/* 130 */           if (il10o00I00000oIO != null) {
/* 132 */               il10o00I00000oIO.I00ooiO1I(false);
                    }
/* 139 */           Object objI00000oIO = O011OiI01.I00000oIO(ii101i11.I00Io1o110i());
/* 151 */           IOiIII1I iOiIII1I = objI00000oIO instanceof IOiIII1I ? (IOiIII1I) objI00000oIO : null;
/* 152 */           if (iOiIII1I == null) {
/* 154 */               return objI00000oIO;
                    }
/* 157 */           throw iOiIII1I.I00000oIO;
                }

                public static Object I00000oOI(IlliIl1l11O illiIl1l11O) {
/* 3 */             return I00000oIO(Il00o11.I00iOIl, illiIl1l11O);
                }
            }
