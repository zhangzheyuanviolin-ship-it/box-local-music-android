            package p000;
            
            public final class IlOlioI extends IOoilo {
                public Object I00iOIl;
                public int I00iiI;
                public final IlOllOl I00iiO;
                public Object I00iio;
                public int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlOlioI(IlOllOl ilOllOl, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiO = ilOllOl;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiI |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiO.emit(null, this);
                }
            }
