            package p000;
            
            public final class IIoO1IiIO0 implements Ili1l0 {
                public static final IIoO1IiIO0 I00000oIO = new IIoO1IiIO0();
                public static Boolean I00000oOI;

                @Override
                public final boolean I00000oIO() {
/* 1 */             Boolean bool = I00000oOI;
/* 3 */             if (bool != null) {
/* 5 */                 return bool.booleanValue();
                    }
/* 20 */            throw IIlIOloOOO.I000OOo1O("canFocus is read before it is written");
                }

                @Override
                public final void I0000Il00O(boolean z) {
/* 5 */             I00000oOI = Boolean.valueOf(z);
                }
            }
