            package p000;
            
            public final class IIlO0II00o extends Oll0io implements IlliIl1l11O {
                public IIiOOI I00iOIl;
                public int I00iiI;
                public final IIiOOI I00iiO;
                public final Ool1i0ll I00iio;
                public final int I00ilI0I1;
                public final IIlO0OOI1lI I00ilO0;
                public Ool1i0ll I00io1l;
                public int I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIlO0II00o(IIiOOI iIiOOI, IOoil1iiIilo iOoil1iiIilo, Ool1i0ll ool1i0ll, int i, IIlO0OOI1lI iIlO0OOI1lI) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = iIiOOI;
/* 3 */             this.I00iio = ool1i0ll;
/* 5 */             this.I00ilI0I1 = i;
/* 7 */             this.I00ilO0 = iIlO0OOI1lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new IIlO0II00o(this.I00iiO, iOoil1iiIilo, this.I00iio, this.I00ilI0I1, this.I00ilO0);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IIlO0II00o) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IIiOOI iIiOOI;
                    int i;
                    Ool1i0ll ool1i0ll;
                    IIiOOI iIiOOI2;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i2 = this.I00iiI;
/* 8 */             if (i2 == 0) {
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                IlOI0O11011l ilOI0O11011l = this.I00ilO0.I0000Il00O;
/* 45 */                iIiOOI = this.I00iiO;
/* 47 */                this.I00iOIl = iIiOOI;
/* 49 */                Ool1i0ll ool1i0ll2 = this.I00iio;
/* 51 */                this.I00io1l = ool1i0ll2;
/* 53 */                i = this.I00ilI0I1;
/* 55 */                this.I00ioIO = i;
/* 57 */                this.I00iiI = 1;
/* 59 */                obj = ilOI0O11011l.I0000Il00O(this);
/* 63 */                if (obj != ii0111o) {
/* 66 */                    ool1i0ll = ool1i0ll2;
                        }
/* 93 */                return ii0111o;
                    }
/* 10 */            if (i2 != 1) {
/* 12 */                if (i2 != 2) {
/* 22 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 14 */                iIiOOI2 = this.I00iOIl;
/* 16 */                lIoii1l01l0i.I00000oOI(obj);
/* 95 */                iIiOOI2.I00000oOI(obj);
/* 98 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 26 */            int i3 = this.I00ioIO;
/* 28 */            ool1i0ll = this.I00io1l;
/* 30 */            IIiOOI iIiOOI3 = this.I00iOIl;
/* 32 */            lIoii1l01l0i.I00000oOI(obj);
/* 35 */            i = i3;
/* 36 */            iIiOOI = iIiOOI3;
/* 69 */            int iIntValue = ((Number) obj).intValue();
/* 73 */            this.I00iOIl = iIiOOI;
/* 75 */            this.I00io1l = null;
/* 77 */            this.I00iiI = 2;
/* 87 */            obj = ((IIooIO0II) ool1i0ll.I000iOII.getValue()).I00000oIO(i, iIntValue, this);
/* 91 */            if (obj != ii0111o) {
/* 94 */                iIiOOI2 = iIiOOI;
/* 95 */                iIiOOI2.I00000oOI(obj);
/* 98 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 93 */            return ii0111o;
                }
            }
