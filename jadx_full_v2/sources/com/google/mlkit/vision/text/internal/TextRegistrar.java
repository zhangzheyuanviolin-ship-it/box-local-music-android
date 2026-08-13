            package com.google.mlkit.vision.text.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import p000.IOOlIIilOl0;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.Oi010OO0;
            import p000.ii1101o1o0o1;
            import p000.ii1i1oI1o1O0;
            
            public class TextRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zzp.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 21 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zzp((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 23 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 29 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zzo.class);
/* 37 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zzp.class));
/* 46 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 54 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 19 */                    return new zzo((zzp) iOiOIoiiO0i.I00000oIO(zzp.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class));
                        }
                    };
/* 60 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIOOl0lOI00000oOI2.I00000oOI()};
/* 66 */            for (int i = 0; i < 2; i++) {
/* 68 */                ii1101o1o0o1 ii1101o1o0o1Var = ii1i1oI1o1O0.I00lll10;
/* 72 */                if (objArr[i] == null) {
/* 83 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i, "at index "));
/* 86 */                    return null;
                        }
                    }
/* 88 */            return ii1i1oI1o1O0.I001iOo1i0O(2, objArr);
                }
            }
