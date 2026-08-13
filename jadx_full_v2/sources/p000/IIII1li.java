            package p000;
            
            public final class IIII1li extends IOoilo {
                public Object I00iOIl;
                public final IIIII1OI1 I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIII1li(IIIII1OI1 iiiii1oi1, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = iiiii1oi1;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 12 */            Object objI00IO1 = IIIII1OI1.I00IO1(this.I00iiI, this);
                    return objI00IO1 == Ii0111o.I00iOIl ? objI00IO1 : IO10lIoiO.I00000oIO(objI00IO1);
                }
            }
