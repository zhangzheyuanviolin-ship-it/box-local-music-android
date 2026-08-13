            package p000;

            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.util.Size;
            import android.util.SizeF;
            import java.util.ArrayList;
            import java.util.Iterator;
            
            public final class Iooool {
                public IIlOlol0liO I00000oIO;

                public static int I00000oIO(float f, float f2) {
/* 13 */            lII1OI11o1I.I00000oIO("Focal length should be positive.", f > 0.0f);
/* 24 */            lII1OI11o1I.I00000oIO("Sensor length should be positive.", f2 > 0.0f);
/* 43 */            int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
/* 48 */            lII1OI11o1I.I0000Il00O(degrees, 0, 360, "The provided focal length and sensor length result in an invalid view angle degrees.");
/* 106 */           return degrees;
                }

                public static float I0000Il00O(IIlo0i0ll iIlo0i0ll) {
/* 5 */             Object objI0000O = ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
/* 11 */            lII1OI11o1I.I0000O("The focal lengths can not be empty.", objI0000O);
/* 14 */            float[] fArr = (float[]) objI0000O;
/* 25 */            lII1OI11o1I.I0000oI00("The focal lengths can not be empty.", !(fArr.length == 0));
/* 28 */            return fArr[0];
                }

                public static float I0000O(IIlo0i0ll iIlo0i0ll) {
/* 3 */             IIioli iIioli = (IIioli) iIlo0i0ll;
/* 5 */             Object objI0000O = iIioli.I0000O(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
/* 11 */            lII1OI11o1I.I0000O("The sensor size can't be null.", objI0000O);
/* 14 */            SizeF sizeF = (SizeF) objI0000O;
/* 18 */            Object objI0000O2 = iIioli.I0000O(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
/* 24 */            lII1OI11o1I.I0000O("The sensor orientation can't be null.", objI0000O2);
/* 31 */            Object objI0000O3 = iIioli.I0000O(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
/* 37 */            lII1OI11o1I.I0000O("The active array size can't be null.", objI0000O3);
/* 40 */            Size size = (Size) objI0000O3;
/* 44 */            Object objI0000O4 = iIioli.I0000O(CameraCharacteristics.SENSOR_ORIENTATION);
/* 50 */            lII1OI11o1I.I0000O("The pixel array size can't be null.", objI0000O4);
/* 55 */            int iIntValue = ((Number) objI0000O4).intValue();
/* 59 */            Size sizeI0001Ioi1lo = OoI0lIiO.I0001Ioi1lo((Rect) objI0000O2);
/* 67 */            if (OoI0lIiO.I0000Il00O(iIntValue)) {
/* 79 */                SizeF sizeF2 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
/* 92 */                Size size2 = new Size(sizeI0001Ioi1lo.getHeight(), sizeI0001Ioi1lo.getWidth());
/* 105 */               size = new Size(size.getHeight(), size.getWidth());
/* 109 */               sizeI0001Ioi1lo = size2;
/* 110 */               sizeF = sizeF2;
                    }
/* 126 */           return (sizeF.getWidth() * sizeI0001Ioi1lo.getWidth()) / size.getWidth();
                }

                public final int I00000oOI(IIlo0i0ll iIlo0i0ll) {
/* 1 */             IIlOlol0liO iIlOlol0liO = this.I00000oIO;
                    try {
/* 3 */                 ArrayList arrayListI00000oIO = IIlOlol0liO.I00000oIO(iIlOlol0liO);
/* 9 */                 lII1OI11o1I.I0000O("Failed to get available camera IDs", arrayListI00000oIO);
/* 12 */                Iterator it = arrayListI00000oIO.iterator();
/* 20 */                while (it.hasNext()) {
/* 28 */                    String str = ((IIllI0o) it.next()).I00000oIO;
/* 36 */                    IIlo0i0ll iIlo0i0llI00000oIO = iIlOlol0liO.I0000Il00O().I0000Il00O.I00000oIO(str);
/* 40 */                    IIllI0o.I0000Il00O(str);
/* 43 */                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
/* 48 */                    Object objI0000O = ((IIioli) iIlo0i0llI00000oIO).I0000O(key);
/* 73 */                    lII1OI11o1I.I0000O("Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) IIllI0o.I0000Il00O(str)), objI0000O);
/* 78 */                    int iIntValue = ((Number) objI0000O).intValue();
/* 83 */                    IIioli iIioli = (IIioli) iIlo0i0ll;
/* 85 */                    Object objI0000O2 = iIioli.I0000O(key);
/* 112 */                   lII1OI11o1I.I0000O("Failed to get the required LENS_FACING for " + ((Object) IIllI0o.I0000Il00O(iIioli.I00iOIl)), objI0000O2);
/* 121 */                   if (iIntValue == ((Number) objI0000O2).intValue()) {
/* 131 */                       return I00000oIO(I0000Il00O(iIlo0i0llI00000oIO), I0000O(iIlo0i0llI00000oIO));
                            }
                        }
/* 166 */               throw new IllegalStateException("Could not find the default camera for " + ((Object) IIllI0o.I0000Il00O(((IIioli) iIlo0i0ll).I00iOIl)));
                    } catch (Exception e) {
/* 170 */               IoOOl0iOl1io.I000l1("Failed to get a valid view angle", e);
/* 173 */               return 0;
                    }
                }
            }
