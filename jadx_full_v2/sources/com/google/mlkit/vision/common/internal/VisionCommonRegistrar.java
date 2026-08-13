            package com.google.mlkit.vision.common.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.OOiilOlOOI;
            import p000.lII0IlO;
            import p000.lOi1lolo;
            import p000.liiOlOO01i;
            import p000.ll11O10I1111;
            import p000.loll11I;
            
            public class VisionCommonRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(MultiFlavorDetectorCreator.class);
/* 16 */            iOiIOOl0lOI00000oOI.I00000oIO(new IiIooooiilo(2, 0, MultiFlavorDetectorCreator.Registration.class));
/* 19 */            zzf zzfVar = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 13 */                    return new MultiFlavorDetectorCreator(iOiOIoiiO0i.I0000oI00(OOiilOlOOI.I00000oIO(MultiFlavorDetectorCreator.Registration.class)));
                        }
                    };
/* 23 */            lII0IlO.I00000oIO("Null factory", zzfVar);
/* 26 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = zzfVar;
/* 28 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 32 */            lOi1lolo loi1lolo = liiOlOO01i.I00ilI0I1;
/* 34 */            Object[] objArr = {iOiIi0OiI00000oOI};
/* 39 */            ll11O10I1111.I00000oIO(1, objArr);
/* 44 */            return new loll11I(objArr, 1);
                }
            }
