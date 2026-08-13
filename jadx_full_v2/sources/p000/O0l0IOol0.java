            package p000;
            
            public final class O0l0IOol0 extends OOOOO01 implements O0Iooi01 {
                public final int I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0l0IOol0(int i, int i2, Class cls, Object obj, String str, String str2) {
/* 8 */             super(obj, cls, str, str2, i);
/* 1 */             this.I00ioIO = i2;
                }

                @Override
                public final IiOIIll01I10 I00000oOI() {
/* 7 */             return ((O0Iooi01) I001lIiIIo1O()).I00000oOI();
                }

                @Override
                public final O0IOl1llI1I I001IO000() {
/* 3 */             return OOoOl0i.I00000oIO.I000II(this);
                }

                @Override
                public final Object get() {
/* 1 */             int i = this.I00ioIO;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 33 */                    return ((OlO01l1oOil) obj).getValue();
                        case 1:
/* 26 */                    return ((OlO01l1oOil) obj).getValue();
                        case 2:
/* 19 */                    return ((OlO01l1oOil) obj).getValue();
                        default:
/* 12 */                    return obj.getClass().getSimpleName();
                    }
                }

                @Override
                public final Object invoke() {
/* 1 */             return get();
                }
            }
