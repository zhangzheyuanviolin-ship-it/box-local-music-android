            package p000;
            
            public final class IolIi1l extends Oll0io implements IlliIl1l11O {
                public float I00iOIl;

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             IolIi1l iolIi1l = new IolIi1l(2, iOoil1iiIilo);
/* 13 */            iolIi1l.I00iOIl = ((Number) obj).floatValue();
/* 37 */            return iolIi1l;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 21 */            return ((IolIi1l) create(Float.valueOf(((Number) obj).floatValue()), (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 16 */            return Boolean.valueOf(this.I00iOIl > 0.0f);
                }
            }
