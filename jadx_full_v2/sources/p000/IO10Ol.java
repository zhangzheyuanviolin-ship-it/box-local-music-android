            package p000;
            
            public final class IO10Ol extends IOoilo {
                public Object I00iOIl;
                public Object I00iiI;
                public final I00100o1O0lo I00iiO;
                public int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO10Ol(I00100o1O0lo i00100o1O0lo, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiO = i00100o1O0lo;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiI = obj;
                    this.I00iio |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiO.emit(null, this);
                }
            }
