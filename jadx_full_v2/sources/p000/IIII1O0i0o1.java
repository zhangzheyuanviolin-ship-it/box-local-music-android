            package p000;

            import java.util.concurrent.atomic.AtomicLongFieldUpdater;
            import kotlin.jvm.functions.Function3;
            
            public final class IIII1O0i0o1 extends IlllollI implements Function3 {
                public static final IIII1O0i0o1 I00ioIO = new IIII1O0i0o1(3, IIIII1OI1.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

                /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
                
                    return p000.OoiIlOl1iI.I00000oIO;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    IO10oOO iO10oOO;
/* 2 */             IIIII1OI1 iiiii1oi1 = (IIIII1OI1) obj;
/* 5 */             OiiIl0O1I11 oiiIl0O1I11 = (OiiIl0O1I11) obj2;
/* 7 */             AtomicLongFieldUpdater atomicLongFieldUpdater = IIIII1OI1.I00iio;
/* 9 */             iiiii1oi1.getClass();
/* 20 */            IO10oOO iO10oOO2 = (IO10oOO) I1Ioolli0l0o.I00000oIO.getObjectVolatile(iiiii1oi1, IIIII1OI1.I00o0iI0io1);
                    while (true) {
/* 26 */                if (iiiii1oi1.I001iOo1i0O()) {
/* 30 */                    oiiIl0O1I11.I00ilI0I1 = IIIIIoiliIiO.I000l1;
                            break;
                        }
/* 35 */                long andIncrement = IIIII1OI1.I00ilI0I1.getAndIncrement(iiiii1oi1);
/* 39 */                long j = IIIIIoiliIiO.I00000oOI;
/* 42 */                long j2 = andIncrement / j;
/* 46 */                int i = (int) (andIncrement % j);
/* 51 */                if (iO10oOO2.I00iio != j2) {
/* 53 */                    IO10oOO iO10oOOI000OiO = iiiii1oi1.I000OiO(j2, iO10oOO2);
/* 57 */                    if (iO10oOOI000OiO == null) {
                                continue;
                            } else {
/* 60 */                        iO10oOO = iO10oOOI000OiO;
                            }
                        } else {
/* 63 */                    iO10oOO = iO10oOO2;
                        }
/* 65 */                Object objI00Io1lO = iiiii1oi1.I00Io1lO(iO10oOO, i, andIncrement, oiiIl0O1I11);
/* 69 */                IO10oOO iO10oOO3 = iO10oOO;
/* 73 */                if (objI00Io1lO == IIIIIoiliIiO.I000lI) {
/* 75 */                    if (oiiIl0O1I11 == null) {
/* 78 */                        oiiIl0O1I11 = null;
                            }
/* 79 */                    if (oiiIl0O1I11 != null) {
/* 81 */                        oiiIl0O1I11.I00iiO = iO10oOO3;
/* 83 */                        oiiIl0O1I11.I00iio = i;
                            }
                        } else if (objI00Io1lO == IIIIIoiliIiO.I000oI1ioi) {
/* 96 */                    if (andIncrement < iiiii1oi1.I001IIilI0O()) {
/* 98 */                        iO10oOO3.I00000oIO();
                            }
/* 101 */                   iO10oOO2 = iO10oOO3;
                        } else {
/* 105 */                   if (objI00Io1lO == IIIIIoiliIiO.I000o00OoI0I) {
/* 117 */                       I000II.I001IO000("unexpected");
/* 72 */                        return null;
                            }
/* 107 */                   iO10oOO3.I00000oIO();
/* 110 */                   oiiIl0O1I11.I00ilI0I1 = objI00Io1lO;
                        }
                    }
                }
            }
