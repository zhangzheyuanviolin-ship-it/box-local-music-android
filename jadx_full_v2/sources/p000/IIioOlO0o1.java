            package p000;

            import android.hardware.camera2.CameraExtensionCharacteristics;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            
            public final class IIioOlO0o1 implements O1lOoI01, OoilIiI0oi {
                public final String I00iOIl;
                public final int I00iiI;
                public final CameraExtensionCharacteristics I00iiO;
                public final O0ioIllo0i1 I00iio;

                public IIioOlO0o1(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
/* 4 */             this.I00iOIl = str;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = cameraExtensionCharacteristics;
/* 12 */            new LinkedHashMap();
/* 17 */            new LinkedHashMap();
/* 22 */            new LinkedHashMap();
/* 25 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 30 */            IIioOiI1 iIioOiI1 = new IIioOiI1(0);
/* 33 */            iIioOiI1.I00iiI = this;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioOiI1);
/* 44 */            IIioOiI1 iIioOiI12 = new IIioOiI1(1);
/* 47 */            iIioOiI12.I00iiI = this;
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioOiI12);
/* 58 */            IIioOiI1 iIioOiI13 = new IIioOiI1(2);
/* 61 */            iIioOiI13.I00iiI = this;
/* 63 */            VarHandle.storeStoreFence();
/* 70 */            this.I00iio = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioOiI13);
/* 75 */            IIioOiI1 iIioOiI14 = new IIioOiI1(3);
/* 78 */            iIioOiI14.I00iiI = this;
/* 80 */            VarHandle.storeStoreFence();
/* 83 */            l0oi0lOi11i.I00000oIO(o0oI01I0oo, iIioOiI14);
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 13 */            if (o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(CameraExtensionCharacteristics.class))) {
/* 15 */                return this.I00iiO;
                    }
/* 18 */            return null;
                }
            }
