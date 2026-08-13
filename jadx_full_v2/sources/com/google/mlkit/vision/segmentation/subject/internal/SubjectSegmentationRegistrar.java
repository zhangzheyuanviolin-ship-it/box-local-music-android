            package com.google.mlkit.vision.segmentation.subject.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.Il1I0i;
            import p000.O1o0111OI00;
            import p000.iOOiO000;
            import p000.iOiloii0i1io;
            import p000.lII0IlO;
            import p000.lilIlIOl1;
            
            public class SubjectSegmentationRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zze.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 16 */            zza zzaVar = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zze((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 20 */            lII0IlO.I00000oIO("Null factory", zzaVar);
/* 23 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = zzaVar;
/* 25 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 31 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zzc.class);
/* 39 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zze.class));
/* 48 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 51 */            zzb zzbVar = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 19 */                    return new zzc((zze) iOiOIoiiO0i.I00000oIO(zze.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class));
                        }
                    };
/* 53 */            lII0IlO.I00000oIO("Null factory", zzbVar);
/* 56 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = zzbVar;
/* 58 */            IOiIi0Oi iOiIi0OiI00000oOI2 = iOiIOOl0lOI00000oOI2.I00000oOI();
/* 62 */            iOOiO000 iooio000 = iOiloii0i1io.I00ilI0I1;
/* 64 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIi0OiI00000oOI2};
/* 69 */            lilIlIOl1.I00000oIO(2, objArr);
/* 72 */            return iOiloii0i1io.I000OiO(2, objArr);
                }
            }
