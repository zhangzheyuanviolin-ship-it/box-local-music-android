            package p000;
            
            public final class IlOlO00oioOO extends IOoilo {
                public Object I00iOIl;
                public final IiiilIli I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlOlO00oioOO(IiiilIli iiiilIli, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = iiiilIli;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.emit(null, this);
                }
            }
