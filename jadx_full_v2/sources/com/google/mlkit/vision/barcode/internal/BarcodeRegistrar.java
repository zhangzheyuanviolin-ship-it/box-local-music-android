            package com.google.mlkit.vision.barcode.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.il00ii;
            import p000.il0II0OO1;
            import p000.ilIIoll0ll;
            import p000.liloI11ilO;
            
            public class BarcodeRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zzi.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 21 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zzi((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 23 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 29 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zzg.class);
/* 37 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zzi.class));
/* 46 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 53 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 61 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 27 */                    return new zzg((zzi) iOiOIoiiO0i.I00000oIO(zzi.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class), (O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 63 */            IOiIi0Oi iOiIi0OiI00000oOI2 = iOiIOOl0lOI00000oOI2.I00000oOI();
/* 67 */            il00ii il00iiVar = il0II0OO1.I00iiI;
/* 69 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIi0OiI00000oOI2};
/* 74 */            liloI11ilO.I00000oIO(2, objArr);
/* 79 */            return new ilIIoll0ll(objArr, 2);
                }
            }
