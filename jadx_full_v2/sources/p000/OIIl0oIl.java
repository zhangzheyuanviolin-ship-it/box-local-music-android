            package p000;

            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.util.Log;
            import java.util.Collections;
            import java.util.List;
            
            public final class OIIl0oIl implements i0I0OoIIOO01 {
                public static final List I00iiI = Collections.singletonList(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                public IIloIoOOiO0l I00iOIl;

                @Override
                public final float I00000oIO() {
/* 1 */             return 1.0f;
                }

                @Override
                public final float I0000O() {
/* 1 */             return 1.0f;
                }

                @Override
                public final Rect I000lI() {
/* 7 */             IIioli iIioli = (IIioli) this.I00iOIl.I00000oOI;
/* 13 */            Rect rect = (Rect) iIioli.I0000O(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
/* 15 */            if (rect != null) {
/* 110 */               return rect;
                    }
/* 24 */            if (l11I11lO.I0000O(5, "CXCP")) {
/* 51 */                Log.w("CXCP", "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) IIllI0o.I0000Il00O(iIioli.I00iOIl)) + '!');
                    }
/* 61 */            return new Rect(0, 0, 4000, 3000);
                }

                @Override
                public final IiIOI1ol0o I00100l0(Ool1lo ool1lo) {
/* 3 */             return iiiO1IOliI0.I00000oIO(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final IiIOI1ol0o I0010I0i(Ool1lo ool1lo) {
/* 3 */             return iiiO1IOliI0.I00000oIO(OoiIlOl1iI.I00000oIO);
                }
            }
