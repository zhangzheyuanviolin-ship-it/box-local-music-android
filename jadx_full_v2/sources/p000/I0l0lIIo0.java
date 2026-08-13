            package p000;
            
            public final class I0l0lIIo0 extends IOoilo {
                public Object I00iOIl;
                public Object I00iiI;
                public final I0l0lIoI I00iiO;
                public int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l0lIIo0(I0l0lIoI i0l0lIoI, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiO = i0l0lIoI;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiI = obj;
                    this.I00iio |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiO.emit(null, this);
                }
            }
