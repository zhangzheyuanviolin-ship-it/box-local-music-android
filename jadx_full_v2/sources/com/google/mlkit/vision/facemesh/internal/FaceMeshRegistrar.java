            package com.google.mlkit.vision.facemesh.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.iOOii1Ol0Oli;
            import p000.iOio11oiIi0I;
            import p000.lilIoil;
            
            public class FaceMeshRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zzc.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 21 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 3 */                     return new zzc();
                        }
                    };
/* 23 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 29 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zza.class);
/* 37 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zzc.class));
/* 46 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 54 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 19 */                    return new zza((zzc) iOiOIoiiO0i.I00000oIO(zzc.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class));
                        }
                    };
/* 56 */            IOiIi0Oi iOiIi0OiI00000oOI2 = iOiIOOl0lOI00000oOI2.I00000oOI();
/* 60 */            iOOii1Ol0Oli iooii1ol0oli = iOio11oiIi0I.I00lll10;
/* 62 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIi0OiI00000oOI2};
/* 67 */            lilIoil.I00000oIO(2, objArr);
/* 70 */            return iOio11oiIi0I.I001iOo1i0O(2, objArr);
                }
            }
