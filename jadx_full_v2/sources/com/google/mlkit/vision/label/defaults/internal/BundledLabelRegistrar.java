            package com.google.mlkit.vision.label.defaults.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
            import com.google.mlkit.vision.label.defaults.ImageLabelerOptions;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.iIoilOlo;
            import p000.iO10llOoIiI0;
            import p000.lil1i1iOi;
            
            public class BundledLabelRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zzb.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 21 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zzb((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 23 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 29 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zza.class);
/* 37 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zzb.class));
/* 46 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 54 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 19 */                    return new zza((zzb) iOiOIoiiO0i.I00000oIO(zzb.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class));
                        }
                    };
/* 56 */            IOiIi0Oi iOiIi0OiI00000oOI2 = iOiIOOl0lOI00000oOI2.I00000oOI();
/* 62 */            IOiIOOl0lO iOiIOOl0lOI00000oOI3 = IOiIi0Oi.I00000oOI(MultiFlavorDetectorCreator.Registration.class);
/* 67 */            iOiIOOl0lOI00000oOI3.I0000oI00 = 1;
/* 74 */            iOiIOOl0lOI00000oOI3.I00000oIO(new IiIooooiilo(1, 1, zza.class));
/* 82 */            iOiIOOl0lOI00000oOI3.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new MultiFlavorDetectorCreator.Registration(ImageLabelerOptions.class, iOiOIoiiO0i.I0001Ioi1lo(zza.class));
                        }
                    };
/* 84 */            IOiIi0Oi iOiIi0OiI00000oOI3 = iOiIOOl0lOI00000oOI3.I00000oOI();
/* 88 */            iIoilOlo iioilolo = iO10llOoIiI0.I00lll10;
/* 90 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIi0OiI00000oOI2, iOiIi0OiI00000oOI3};
/* 95 */            lil1i1iOi.I00000oIO(3, objArr);
/* 98 */            return iO10llOoIiI0.I001iOo1i0O(3, objArr);
                }
            }
