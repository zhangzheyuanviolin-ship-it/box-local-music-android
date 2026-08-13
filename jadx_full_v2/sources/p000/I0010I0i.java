            package p000;
            
            public final class I0010I0i extends IOoilo {
                public Object I00iOIl;
                public final I0010o I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0010I0i(I0010o i0010o, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = i0010o;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.emit(null, this);
                }
            }
