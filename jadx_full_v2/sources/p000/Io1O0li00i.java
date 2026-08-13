            package p000;

            import java.util.Iterator;
            
            public final class Io1O0li00i extends Oi10IOIi implements IlliIl1l11O {
                public Iterator I00iiI;
                public int[] I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public Object I00io1l;
                public final Io1OIIl0Oi0 I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Io1O0li00i(Io1OIIl0Oi0 io1OIIl0Oi0, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ioIO = io1OIIl0Oi0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             Io1O0li00i io1O0li00i = new Io1O0li00i(this.I00ioIO, iOoil1iiIilo);
/* 8 */             io1O0li00i.I00io1l = obj;
/* 89 */            return io1O0li00i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Io1O0li00i) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:12:0x003d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:18:0x005e). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Iterator it;
                    int i;
/* 3 */             OilO111 oilO111 = (OilO111) this.I00io1l;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i2 = this.I00ilO0;
/* 9 */             Io1OIIl0Oi0 io1OIIl0Oi0 = this.I00ioIO;
/* 13 */            if (i2 == 0) {
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 42 */                it = io1OIIl0Oi0.I00000oIO.iterator();
/* 46 */                i = 0;
/* 51 */                if (it.hasNext()) {
                        }
                    } else {
/* 15 */                if (i2 != 1) {
/* 32 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 17 */                int i3 = this.I00ilI0I1;
/* 19 */                int i4 = this.I00iio;
/* 21 */                int[] iArr = this.I00iiO;
/* 23 */                Iterator it2 = this.I00iiI;
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 28 */                it = it2;
/* 95 */                i3 += 6;
/* 97 */                i4 += 6;
/* 63 */                if (i3 < iArr.length) {
/* 100 */                   i = i4;
/* 51 */                    if (it.hasNext()) {
/* 102 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 57 */                    iArr = (int[]) it.next();
/* 60 */                    i4 = i;
/* 61 */                    i3 = 0;
/* 63 */                    if (i3 < iArr.length) {
/* 70 */                        if (io1OIIl0Oi0.I00000oIO(i4) != -1) {
/* 74 */                            Integer num = new Integer(i4);
/* 77 */                            this.I00io1l = oilO111;
/* 79 */                            this.I00iiI = it;
/* 81 */                            this.I00iiO = iArr;
/* 83 */                            this.I00iio = i4;
/* 85 */                            this.I00ilI0I1 = i3;
/* 87 */                            this.I00ilO0 = 1;
/* 89 */                            oilO111.I00000oOI(this, num);
/* 92 */                            Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 94 */                            return ii0111o;
                                }
/* 95 */                        i3 += 6;
/* 97 */                        i4 += 6;
/* 63 */                        if (i3 < iArr.length) {
                                }
                            }
                        }
                    }
                }
            }
