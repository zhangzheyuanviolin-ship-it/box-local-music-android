            package p000;
            
            public final class IOOo0OI1o0 extends IOoilo {
                public Object I00iOIl;
                public final IOOo0lil0io0 I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOOo0OI1o0(IOOo0lil0io0 iOOo0lil0io0, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = iOOo0lil0io0;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.emit(null, this);
                }
            }
