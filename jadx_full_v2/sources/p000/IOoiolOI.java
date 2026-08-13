            package p000;

            import android.hardware.camera2.CaptureResult;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IOoiolOI implements Function1 {
                public boolean I00iOIl;
                public boolean I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    boolean zI001i1O0Ol;
                    boolean z;
                    boolean zContains;
/* 1 */             boolean z2 = this.I00iOIl;
/* 3 */             boolean z3 = this.I00iiI;
/* 7 */             CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
/* 9 */             CaptureResult captureResult = ((I0oIl0101) obj).I00iOIl;
/* 15 */            Integer num = (Integer) captureResult.get(key);
/* 19 */            if (num != null) {
/* 21 */                int iIntValue = num.intValue();
/* 25 */                List list = I0i10OI0o.I00000oOI;
/* 27 */                if (iIntValue == 0) {
/* 48 */                    zI001i1O0Ol = true;
                        } else if (z3) {
/* 33 */                    Object obj2 = captureResult.get(CaptureResult.CONTROL_AF_STATE);
/* 37 */                    List list2 = IOol1Ol.I000iOII;
/* 41 */                    if (obj2 != null) {
/* 43 */                        zI001i1O0Ol = list2.contains(obj2);
                            }
                        } else if (iIntValue == 3 || iIntValue == 4) {
/* 66 */                    zI001i1O0Ol = IOOi0Ool1i.I001i1O0Ol(IOol1Ol.I000O01llI0, captureResult.get(CaptureResult.CONTROL_AF_STATE));
                        }
                    } else {
/* 71 */                zI001i1O0Ol = false;
                    }
/* 78 */            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
/* 80 */            if (num2 != null) {
/* 82 */                int iIntValue2 = num2.intValue();
/* 86 */                List list3 = I0OIi10lO0iO.I00000oOI;
/* 88 */                if (iIntValue2 != 0) {
/* 92 */                    Object obj3 = captureResult.get(CaptureResult.CONTROL_AE_STATE);
/* 108 */                   if (!(obj3 != null ? IOol1Ol.I000l1.contains(obj3) : true)) {
/* 112 */                       z = false;
                            }
                        }
/* 110 */               z = true;
                    }
/* 119 */           Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
/* 128 */           int iIntValue3 = num3 != null ? num3.intValue() : 0;
/* 129 */           List list4 = I1lilIOI0Il.I00000oOI;
/* 131 */           if (z2 && num3 == null) {
/* 135 */               zContains = false;
                    } else if (!z2 || iIntValue3 == 0) {
/* 158 */               zContains = true;
                    } else {
/* 143 */               Object obj4 = captureResult.get(CaptureResult.CONTROL_AWB_STATE);
/* 147 */               List list5 = IOol1Ol.I000lI;
/* 151 */               if (obj4 != null) {
/* 153 */                   zContains = list5.contains(obj4);
                        }
                    }
/* 163 */           IllIiOlOoIll.I00000oIO(captureResult.getFrameNumber());
/* 174 */           return Boolean.valueOf(z && zI001i1O0Ol && zContains);
                }
            }
