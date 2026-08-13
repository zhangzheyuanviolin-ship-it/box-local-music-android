            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class Ool1oiIOI extends Oll0io implements Function1 {
                public int I00iOIl;
                public final OolI1lo I00iiI;
                public final ArrayList I00iiO;
                public final int I00iio;
                public final int I00ilI0I1;
                public final int I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ool1oiIOI(OolI1lo oolI1lo, ArrayList arrayList, int i, int i2, int i3, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(1, iOoil1iiIilo);
/* 1 */             this.I00iiI = oolI1lo;
/* 3 */             this.I00iiO = arrayList;
/* 5 */             this.I00iio = i;
/* 7 */             this.I00ilI0I1 = i2;
/* 9 */             this.I00ilO0 = i3;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new Ool1oiIOI(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((Ool1oiIOI) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OolI1lo oolI1lo;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 22 */                lIoii1l01l0i.I00000oOI(obj);
/* 28 */                l11I11lO.I0000O(3, "CXCP");
/* 31 */                IOi10loi iOi10loi = OolI1lo.I000l1;
/* 33 */                ArrayList arrayList = this.I00iiO;
/* 35 */                Iterator it = arrayList.iterator();
                        loop0: while (true) {
/* 39 */                    boolean zHasNext = it.hasNext();
/* 43 */                    oolI1lo = this.I00iiI;
/* 45 */                    if (!zHasNext) {
                                break;
                            }
/* 51 */                    IIoo00iOol0 iIoo00iOol0 = (IIoo00iOol0) it.next();
/* 63 */                    if (Collections.unmodifiableList(iIoo00iOol0.I00000oIO).isEmpty()) {
                                break;
                            }
/* 74 */                    Iterator it2 = Collections.unmodifiableList(iIoo00iOol0.I00000oIO).iterator();
/* 82 */                    while (it2.hasNext()) {
/* 104 */                       if (((Map) oolI1lo.I0000Il00O.I0001Ioi1lo.getValue()).get((IiIO1ol1i1o0) it2.next()) == null) {
                                    break loop0;
                                }
                            }
                        }
/* 112 */               OolI1lo.I000o00OoI0I(arrayList.size(), "Capture request failed due to invalid surface");
/* 117 */               Ool1o1l ool1o1lI000oI1ioi = OolI1lo.I000oI1ioi(oolI1lo.I000iOII);
/* 121 */               l11I11lO.I0000O(3, "CXCP");
/* 131 */               IIooIO0II iIooIO0II = (IIooIO0II) oolI1lo.I000O01llI0.getValue();
/* 135 */               int i2 = ool1o1lI000oI1ioi.I0000O.I00000oIO;
/* 139 */               IIl0oI iIl0oII00000oIO = ool1o1lI000oI1ioi.I00000oIO.I00000oIO();
/* 143 */               this.I00iOIl = 1;
/* 152 */               obj = iIooIO0II.I0000Il00O(arrayList, i2, iIl0oII00000oIO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this);
/* 156 */               if (obj == ii0111o) {
/* 158 */                   return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 17 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 20 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 159 */           return (List) obj;
                }
            }
