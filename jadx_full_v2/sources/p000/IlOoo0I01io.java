            package p000;
            
            public final class IlOoo0I01io extends IOoilo {
                public Object I00iOIl;
                public int I00iiI;
                public IlOil1iooOO0 I00iiO;
                public final IlOooI I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlOoo0I01io(IlOooI ilOooI, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iio = ilOooI;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiI |= Integer.MIN_VALUE;
/* 13 */            return this.I00iio.emit(null, this);
                }
            }
