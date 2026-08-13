            package com.google.mlkit.vision.face.internal;

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
            import p000.ii1liil10ll;
            import p000.iiIIoOI;
            import p000.iilO0li;
            import p000.lII0IlO;
            
            public class FaceRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zze.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 16 */            zzk zzkVar = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zze((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 20 */            lII0IlO.I00000oIO("Null factory", zzkVar);
/* 23 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = zzkVar;
/* 25 */            IOiIi0Oi iOiIi0OiI00000oOI = iOiIOOl0lOI00000oOI.I00000oOI();
/* 31 */            IOiIOOl0lO iOiIOOl0lOI00000oOI2 = IOiIi0Oi.I00000oOI(zzc.class);
/* 39 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(zze.class));
/* 48 */            iOiIOOl0lOI00000oOI2.I00000oIO(IiIooooiilo.I00000oIO(Il1I0i.class));
/* 51 */            zzl zzlVar = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 19 */                    return new zzc((zze) iOiOIoiiO0i.I00000oIO(zze.class), (Il1I0i) iOiOIoiiO0i.I00000oIO(Il1I0i.class));
                        }
                    };
/* 53 */            lII0IlO.I00000oIO("Null factory", zzlVar);
/* 56 */            iOiIOOl0lOI00000oOI2.I0001Ioi1lo = zzlVar;
/* 62 */            Object[] objArr = {iOiIi0OiI00000oOI, iOiIOOl0lOI00000oOI2.I00000oOI()};
/* 68 */            for (int i = 0; i < 2; i++) {
/* 70 */                ii1liil10ll ii1liil10llVar = iiIIoOI.I00ilI0I1;
/* 74 */                if (objArr[i] == null) {
/* 85 */                    IOOlIIilOl0.I000II(Oi010OO0.I000oI1ioi(i, "at index "));
/* 88 */                    return null;
                        }
                    }
/* 90 */            ii1liil10ll ii1liil10llVar2 = iiIIoOI.I00ilI0I1;
/* 94 */            return new iilO0li(objArr, 2);
                }
            }
