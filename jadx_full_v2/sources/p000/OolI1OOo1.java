            package p000;

            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class OolI1OOo1 extends Oll0io implements Function1 {
                public List I00iOIl;
                public List I00iiI;
                public List I00iiO;
                public int I00iio;
                public final OolI1lo I00ilI0I1;
                public final List I00ilO0;
                public final List I00io1l;
                public final List I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OolI1OOo1(OolI1lo oolI1lo, List list, List list2, List list3, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = oolI1lo;
/* 3 */             this.I00ilO0 = list;
/* 5 */             this.I00io1l = list2;
/* 7 */             this.I00ioIO = list3;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new OolI1OOo1(this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((OolI1OOo1) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    List listAsList;
                    List listAsList2;
                    List listAsList3;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iio;
                    try {
/* 10 */                if (i == 0) {
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
/* 39 */                    l11I11lO.I0000O(3, "CXCP");
/* 42 */                    OolI1lo oolI1lo = this.I00ilI0I1;
/* 44 */                    List list = this.I00ilO0;
/* 46 */                    List list2 = this.I00io1l;
/* 48 */                    List list3 = this.I00ioIO;
/* 52 */                    IIll0oO iIll0oOI00000oIO = oolI1lo.I0000Il00O.I00000oIO();
/* 59 */                    this.I00iOIl = list;
/* 64 */                    this.I00iiI = list2;
/* 69 */                    this.I00iiO = list3;
/* 71 */                    this.I00iio = 1;
/* 73 */                    obj = iIll0oOI00000oIO.I0000Il00O(this);
/* 77 */                    if (obj == ii0111o) {
/* 79 */                        return ii0111o;
                            }
/* 80 */                    listAsList = list;
/* 81 */                    listAsList2 = list2;
/* 82 */                    listAsList3 = list3;
                        } else {
/* 12 */                    if (i != 1) {
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 14 */                    listAsList3 = this.I00iiO;
/* 18 */                    listAsList2 = this.I00iiI;
/* 22 */                    listAsList = this.I00iOIl;
/* 26 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 83 */                AutoCloseable autoCloseable = (AutoCloseable) obj;
                        try {
/* 86 */                    IIll1i iIll1i = (IIll1i) autoCloseable;
/* 88 */                    if (listAsList == null) {
/* 92 */                        listAsList = Arrays.asList(IIliIll10O.I00000oIO);
                            }
/* 96 */                    List list4 = listAsList;
/* 101 */                   if (listAsList2 == null) {
/* 105 */                       listAsList2 = Arrays.asList(IIliIll10O.I00000oIO);
                            }
/* 109 */                   List list5 = listAsList2;
/* 110 */                   if (listAsList3 == null) {
/* 114 */                       listAsList3 = Arrays.asList(IIliIll10O.I00000oIO);
                            }
/* 123 */                   IiIOI1ol0o iiIOI1ol0oI00000oIO = IIlOIo0OlliO.I00000oIO(iIll1i, null, null, null, list4, list5, listAsList3, 7);
/* 127 */                   iOOl00.I00000oIO(autoCloseable, null);
/* 130 */                   return iiIOI1ol0oI00000oIO;
                        } finally {
                        }
                    } catch (CancellationException unused) {
/* 137 */               l11I11lO.I0000O(3, "CXCP");
/* 140 */               return OolI1lo.I000l1;
                    }
                }
            }
