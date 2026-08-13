            package p000;
            
            public final class IoO1I0IIi extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public long I00iiI;

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             IoO1I0IIi ioO1I0IIi = new IoO1I0IIi(2, iOoil1iiIilo);
/* 13 */            ioO1I0IIi.I00iiI = ((Number) obj).longValue();
/* 89 */            return ioO1I0IIi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 21 */            return ((IoO1I0IIi) create(Long.valueOf(((Number) obj).longValue()), (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             long j = this.I00iiI;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = this.I00iOIl;
/* 8 */             if (i == 0) {
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
/* 26 */                this.I00iiI = j;
/* 28 */                this.I00iOIl = 1;
/* 34 */                if (il0l1o1l.I00000oOI(j, this) == ii0111o) {
/* 36 */                    return ii0111o;
                        }
                    } else {
/* 10 */                if (i != 1) {
/* 18 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 21 */                    return null;
                        }
/* 12 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 37 */            return OoiIlOl1iI.I00000oIO;
                }
            }
