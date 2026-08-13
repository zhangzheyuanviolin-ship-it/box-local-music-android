            package com.google.mlkit.vision.pose.internal;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.List;
            import p000.IOiIOOl0lO;
            import p000.IOiIi0Oi;
            import p000.IOiOIoiiO0i;
            import p000.IOiOiIIiii1;
            import p000.IiIooooiilo;
            import p000.O1o0111OI00;
            import p000.ii01IlIiIo;
            
            public class PoseRegistrar implements ComponentRegistrar {
                public static final int zza = 0;

                @Override
                public final List getComponents() {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(zze.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 21 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new IOiOiIIiii1() {
                        @Override
                        public final Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */                    return new zze((O1o0111OI00) iOiOIoiiO0i.I00000oIO(O1o0111OI00.class));
                        }
                    };
/* 27 */            return ii01IlIiIo.I001lIiIIo1O(iOiIOOl0lOI00000oOI.I00000oOI());
                }
            }
