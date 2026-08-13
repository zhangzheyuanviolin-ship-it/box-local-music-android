            package p000;
            
            public final class O1o0oloi0il extends Oll0io implements IlliIl1l11O {
                public boolean I00iOIl;

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             O1o0oloi0il o1o0oloi0il = new O1o0oloi0il(2, iOoil1iiIilo);
/* 13 */            o1o0oloi0il.I00iOIl = ((Boolean) obj).booleanValue();
/* 37 */            return o1o0oloi0il;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             Boolean bool = (Boolean) obj;
/* 3 */             bool.booleanValue();
/* 16 */            return ((O1o0oloi0il) create(bool, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             boolean z = this.I00iOIl;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 10 */            return Boolean.valueOf(!z);
                }
            }
