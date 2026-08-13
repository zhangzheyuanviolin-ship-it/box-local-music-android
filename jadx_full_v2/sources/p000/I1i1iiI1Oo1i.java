            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1i1iiI1Oo1i extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final double I00iiI;
                public final OIooO1iiliI I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1i1iiI1Oo1i(double d, OIooO1iiliI oIooO1iiliI, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = d;
/* 3 */             this.I00iiO = oIooO1iiliI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new I1i1iiI1Oo1i(this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I1i1iiI1Oo1i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 7 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                OIooO1iiliI oIooO1iiliI = this.I00iiO;
/* 30 */                I10i01 i10i01I00000oIO = O1OI1ll1Il0i.I00000oIO(oIooO1iiliI.I000II());
/* 39 */                Float f = new Float((float) this.I00iiI);
/* 45 */                OoIoO0I0oOI ooIoO0I0oOII0000O = iOO01lio0.I0000O(100, 6, null);
/* 52 */                I1i1OOi1iIo i1i1OOi1iIo = new I1i1OOi1iIo(0);
/* 55 */                i1i1OOi1iIo.I00iiI = oIooO1iiliI;
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                this.I00iOIl = 1;
/* 69 */                if (I10i01.I00000oIO(i10i01I00000oIO, f, ooIoO0I0oOII0000O, null, i1i1OOi1iIo, this, 4) == ii0111o) {
/* 71 */                    return ii0111o;
                        }
                    } else {
/* 9 */                 if (i != 1) {
/* 17 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                     return null;
                        }
/* 11 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 72 */            return OoiIlOl1iI.I00000oIO;
                }
            }
