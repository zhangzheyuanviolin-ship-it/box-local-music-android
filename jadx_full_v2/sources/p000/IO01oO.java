            package p000;

            import android.hardware.camera2.CaptureResult;
            import android.util.Log;
            import java.nio.BufferUnderflowException;
            import java.util.ArrayList;
            
            public final class IO01oO implements IIlI0I1li, OoilIiI0oi {
                public final Oi0Iil I00iOIl;
                public final IllIi0lI I00iiI;

                public IO01oO(Oi0Iil oi0Iil, IllIi0lI illIi0lI) {
/* 4 */             this.I00iOIl = oi0Iil;
/* 6 */             this.I00iiI = illIi0lI;
                }

                @Override
                public final void I00000oIO(Il1IIOoI il1IIOoI) {
/* 1 */             ArrayList arrayList = il1IIOoI.I00000oIO;
/* 3 */             super.I00000oIO(il1IIOoI);
/* 8 */             I0oIl0101 i0oIl0101I0000Il00O = this.I00iiI.I0000Il00O();
                    try {
/* 20 */                Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.JPEG_ORIENTATION);
/* 22 */                if (num != null) {
/* 28 */                    il1IIOoI.I0000O(num.intValue());
                        }
                    } catch (BufferUnderflowException unused) {
/* 39 */                if (l11I11lO.I0000O(5, "CXCP")) {
/* 43 */                    Log.w("CXCP", "Failed to get JPEG orientation.");
                        }
                    }
/* 46 */            CaptureResult.Key key = CaptureResult.SENSOR_EXPOSURE_TIME;
/* 48 */            CaptureResult captureResult = i0oIl0101I0000Il00O.I00iOIl;
/* 56 */            if (((Long) captureResult.get(key)) != null) {
/* 75 */                il1IIOoI.I0000Il00O("ExposureTime", String.valueOf(r1.longValue() / 1.0E9d), arrayList);
                    }
/* 84 */            Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
/* 86 */            if (f != null) {
/* 98 */                il1IIOoI.I0000Il00O("FNumber", String.valueOf(f.floatValue()), arrayList);
                    }
/* 107 */           Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
/* 109 */           if (num2 != null) {
/* 111 */               int iIntValue = num2.intValue();
/* 122 */               il1IIOoI.I0000Il00O("SensitivityType", String.valueOf(3), arrayList);
/* 138 */               il1IIOoI.I0000Il00O("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
/* 149 */               if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
/* 165 */                   il1IIOoI.I0000Il00O("SensitivityType", String.valueOf(3), arrayList);
/* 176 */                   il1IIOoI.I0000Il00O("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue * ((int) (r5.intValue() / 100.0f)))), arrayList);
                        }
                    }
/* 185 */           Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
/* 187 */           if (f2 != null) {
/* 216 */               il1IIOoI.I0000Il00O("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
                    }
/* 225 */           Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
/* 227 */           if (num3 != null) {
/* 239 */               int iI001lIiIIo1O = IIlIOloOOO.I001lIiIIo1O(num3.intValue() == 0 ? 2 : 1);
/* 261 */               il1IIOoI.I0000Il00O("WhiteBalance", iI001lIiIIo1O != 0 ? iI001lIiIIo1O != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
                    }
                }

                @Override
                public final Olo0o1II0 I00000oOI() {
/* 11 */            return (Olo0o1II0) this.I00iOIl.I00000oIO(Olo10o10.I00000oIO, Olo0o1II0.I00000oOI);
                }

                @Override
                public final int I0000O() {
/* 3 */             I0oIl0101 i0oIl0101I0000Il00O = this.I00iiI.I0000Il00O();
/* 15 */            Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.FLASH_STATE);
/* 17 */            int i = 2;
/* 18 */            if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
/* 39 */                if (num != null && num.intValue() == 2) {
/* 38 */                    return 3;
                        }
/* 49 */                i = 4;
/* 50 */                if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
/* 69 */                    if (num != null && l11I11lO.I0000O(3, "CXCP")) {
/* 86 */                        IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O.I00iOIl.getFrameNumber());
                            }
/* 27 */                    return 1;
                        }
                    }
/* 110 */           return i;
                }

                @Override
                public final long I0000oI00() {
/* 17 */            Object obj = this.I00iiI.I0000Il00O().I00iOIl.get(CaptureResult.SENSOR_TIMESTAMP);
/* 27 */            return ((Number) (obj != null ? obj : -1L)).longValue();
                }

                @Override
                public final IIl1oi I0001Ioi1lo() {
/* 3 */             I0oIl0101 i0oIl0101I0000Il00O = this.I00iiI.I0000Il00O();
/* 15 */            Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.CONTROL_AWB_STATE);
/* 17 */            if (num != null && num.intValue() == 0) {
/* 26 */                return IIl1oi.I00iiI;
                    }
/* 29 */            if (num != null && num.intValue() == 1) {
/* 39 */                return IIl1oi.I00iiO;
                    }
/* 42 */            if (num != null && num.intValue() == 2) {
/* 52 */                return IIl1oi.I00iio;
                    }
/* 56 */            if (num != null && num.intValue() == 3) {
/* 65 */                return IIl1oi.I00ilI0I1;
                    }
/* 68 */            IIl1oi iIl1oi = IIl1oi.I00iOIl;
/* 70 */            if (num != null && l11I11lO.I0000O(3, "CXCP")) {
/* 87 */                IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O.I00iOIl.getFrameNumber());
                    }
/* 110 */           return iIl1oi;
                }

                @Override
                public final IIl1lO0O I000OOo1O() {
/* 3 */             I0oIl0101 i0oIl0101I0000Il00O = this.I00iiI.I0000Il00O();
/* 15 */            Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.CONTROL_AE_STATE);
/* 17 */            if (num != null && num.intValue() == 0) {
/* 26 */                return IIl1lO0O.I00iiI;
                    }
/* 29 */            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
/* 112 */               return IIl1lO0O.I00iiO;
                    }
/* 50 */            if (num != null && num.intValue() == 4) {
/* 60 */                return IIl1lO0O.I00iio;
                    }
/* 63 */            if (num != null && num.intValue() == 2) {
/* 73 */                return IIl1lO0O.I00ilI0I1;
                    }
/* 77 */            if (num != null && num.intValue() == 3) {
/* 86 */                return IIl1lO0O.I00ilO0;
                    }
/* 89 */            IIl1lO0O iIl1lO0O = IIl1lO0O.I00iOIl;
/* 91 */            if (num != null && l11I11lO.I0000O(3, "CXCP")) {
/* 108 */               IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O.I00iOIl.getFrameNumber());
                    }
/* 111 */           return iIl1lO0O;
                }

                @Override
                public final IIl1lO0oO I000OiO() {
/* 3 */             I0oIl0101 i0oIl0101I0000Il00O = this.I00iiI.I0000Il00O();
/* 15 */            Integer num = (Integer) i0oIl0101I0000Il00O.I00iOIl.get(CaptureResult.CONTROL_AF_STATE);
/* 17 */            if (num != null && num.intValue() == 0) {
/* 26 */                return IIl1lO0oO.I00iiI;
                    }
/* 30 */            if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
/* 125 */               return IIl1lO0oO.I00iiO;
                    }
/* 50 */            if (num != null && num.intValue() == 4) {
/* 60 */                return IIl1lO0oO.I00ilO0;
                    }
/* 63 */            if (num != null && num.intValue() == 5) {
/* 73 */                return IIl1lO0oO.I00io1l;
                    }
/* 76 */            if (num != null && num.intValue() == 2) {
/* 86 */                return IIl1lO0oO.I00iio;
                    }
/* 89 */            if (num != null && num.intValue() == 6) {
/* 99 */                return IIl1lO0oO.I00ilI0I1;
                    }
/* 102 */           IIl1lO0oO iIl1lO0oO = IIl1lO0oO.I00iOIl;
/* 104 */           if (num != null && l11I11lO.I0000O(3, "CXCP")) {
/* 121 */               IllIiOlOoIll.I00000oIO(i0oIl0101I0000Il00O.I00iOIl.getFrameNumber());
                    }
/* 124 */           return iIl1lO0oO;
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 9 */             boolean zEquals = o0IOli0o0.equals(OOoOl0i.I00000oIO.I00000oOI(IllIi0lI.class));
/* 13 */            IllIi0lI illIi0lI = this.I00iiI;
                    return zEquals ? illIi0lI : illIi0lI.I00l0I0l0lO1(o0IOli0o0);
                }
            }
