            package p000;

            import java.util.List;
            
            public final class IiIi10i0OIOO extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final IiIi1o I00iiI;
                public final List I00iiO;
                public final List I00iio;
                public final List I00ilI0I1;
                public final O11ooiIoo0l I00ilO0;
                public final I0OIi10lO0iO I00io1l;
                public final long I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiIi10i0OIOO(IiIi1o iiIi1o, IOoil1iiIilo iOoil1iiIilo, List list, List list2, List list3, O11ooiIoo0l o11ooiIoo0l, I0OIi10lO0iO i0OIi10lO0iO, long j) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = iiIi1o;
/* 3 */             this.I00iiO = list;
/* 5 */             this.I00iio = list2;
/* 7 */             this.I00ilI0I1 = list3;
/* 9 */             this.I00ilO0 = o11ooiIoo0l;
/* 11 */            this.I00io1l = i0OIi10lO0iO;
/* 13 */            this.I00ioIO = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            return new IiIi10i0OIOO(this.I00iiI, iOoil1iiIilo, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IiIi10i0OIOO) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i != 0) {
/* 8 */                 if (i == 1) {
/* 10 */                    lIoii1l01l0i.I00000oOI(obj);
/* 13 */                    return obj;
                        }
/* 16 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                return null;
                    }
/* 21 */            lIoii1l01l0i.I00000oOI(obj);
/* 42 */            IiIOI1ol0o iiIOI1ol0oI00000oIO = this.I00iiI.I000o00OoI0I().I00000oIO(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO);
/* 46 */            this.I00iOIl = 1;
/* 50 */            Object objI0010o = ((IOi10loi) iiIOI1ol0oI00000oIO).I0010o(this);
                    return objI0010o == ii0111o ? ii0111o : objI0010o;
                }
            }
