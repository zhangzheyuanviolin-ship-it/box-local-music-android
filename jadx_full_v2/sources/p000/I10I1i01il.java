            package p000;
            
            public final class I10I1i01il extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final boolean I00iiI;
                public final I10I1li0 I00iiO;
                public final long I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10I1i01il(boolean z, I10I1li0 i10I1li0, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = z;
/* 3 */             this.I00iiO = i10I1li0;
/* 5 */             this.I00iio = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            return new I10I1i01il(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I10I1i01il) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
                
                    if (r11 == r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
                
                    if (r11 == r0) goto L18;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 7 */             if (i == 0) {
/* 28 */                lIoii1l01l0i.I00000oOI(obj);
/* 33 */                OIIII0oOo1o oIIII0oOo1o = this.I00iiO.I00iOIl;
/* 37 */                if (this.I00iiI) {
/* 59 */                    this.I00iOIl = 2;
/* 65 */                    obj = oIIII0oOo1o.I00000oIO(this.I00iio, 0L, this);
                        } else {
/* 39 */                    this.I00iOIl = 1;
/* 46 */                    obj = oIIII0oOo1o.I00000oIO(0L, this.I00iio, this);
                        }
/* 71 */                return ii0111o;
                    }
/* 9 */             if (i == 1) {
/* 24 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                long j = ((OooIOilolOo) obj).I00000oIO;
                    } else {
/* 11 */                if (i != 2) {
/* 19 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 22 */                    return null;
                        }
/* 13 */                lIoii1l01l0i.I00000oOI(obj);
/* 74 */                long j2 = ((OooIOilolOo) obj).I00000oIO;
                    }
/* 76 */            return OoiIlOl1iI.I00000oIO;
                }
            }
