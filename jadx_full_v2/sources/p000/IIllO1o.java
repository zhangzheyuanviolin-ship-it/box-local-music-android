            package p000;

            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.os.Build;
            import android.util.Log;
            import android.util.Size;
            import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            public final class IIllO1o implements IIllOioOlolI, OoilIiI0oi {
                public IIloIoOOiO0l I00iOIl;
                public IIlIi0lIii I00iiI;
                public IIo0ll0o I00iiO;
                public IIl1Iloio I00iio;
                public IIo0OlO I00ilI0I1;
                public OlOIOo0 I00ilO0;
                public OllO00oiil I00io1l;
                public OllO00oiil I00ioIO;

                @Override
                public final O110lI I0000O() {
/* 3 */             return this.I00iiO.I0000Il00O;
                }

                @Override
                public final int I0000oI00() {
/* 2 */             return I000o00OoI0I(0);
                }

                @Override
                public final String I0001Ioi1lo() {
/* 3 */             return this.I00iiI.I00iiI;
                }

                @Override
                public final Rect I000OOo1O() {
/* 13 */            Rect rect = (Rect) ((IIioli) this.I00iOIl.I00000oOI).I0000O(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : rect;
                }

                @Override
                public final int I000iOII() {
/* 15 */            int iIntValue = ((Number) ((IIioli) this.I00iOIl.I00000oOI).I0000O(CameraCharacteristics.LENS_FACING)).intValue();
/* 19 */            if (iIntValue == 0) {
/* 61 */                return 0;
                    }
/* 21 */            int i = 1;
/* 22 */            if (iIntValue != 1) {
/* 24 */                i = 2;
/* 25 */                if (iIntValue != 2) {
/* 34 */                    if (!l11I11lO.I0000O(5, "CXCP")) {
/* 58 */                        return -1;
                            }
/* 55 */                    Log.w("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
/* 58 */                    return -1;
                        }
                    }
/* 60 */            return i;
                }

                @Override
                public final String I000lI() {
                    return ((Boolean) this.I00io1l.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
                }

                @Override
                public final int I000o00OoI0I(int i) {
/* 32 */            return iOioOiio.I00000oIO(iOioOiio.I00000oOI(i), ((Number) ((IIioli) this.I00iOIl.I00000oOI).I0000O(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == I000iOII());
                }

                @Override
                public final Object I000oI1ioi() {
/* 19 */            return (CameraCharacteristics) ((IIioli) this.I00iOIl.I00000oOI).I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CameraCharacteristics.class));
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 3 */             return ilOi0i1o.I00000oIO(this.I00iOIl);
                }

                @Override
                public final void I0010I0i(Executor executor, OOIIlO1looO oOIIlO1looO) {
/* 3 */             this.I00iio.I00000oIO(oOIIlO1looO, executor);
                }

                @Override
                public final OOil0lI I0010o() {
/* 3 */             return this.I00ilI0I1.I00000oIO();
                }

                @Override
                public final List I00111O(int i) {
/* 3 */             Size[] sizeArrI00000oIO = this.I00ilO0.I00000oIO(i);
                    return sizeArrI00000oIO != null ? I1IoiO1l.I00IioO0OiOi(sizeArrI00000oIO) : Il01100l.I00iOIl;
                }

                @Override
                public final Set I001IIilI0O() {
                    int length;
/* 13 */            int[] iArr = (int[]) ((IIioli) this.I00iOIl.I00000oOI).I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 15 */            if (iArr == null || (length = iArr.length) == 0) {
/* 61 */                return Il01llIol0.I00iOIl;
                    }
/* 22 */            if (length == 1) {
/* 56 */                return Collections.singleton(Integer.valueOf(iArr[0]));
                    }
/* 31 */            LinkedHashSet linkedHashSet = new LinkedHashSet(O1Oii0o0Oi.I00000oIO(iArr.length));
/* 35 */            for (int i : iArr) {
/* 43 */                linkedHashSet.add(Integer.valueOf(i));
                    }
/* 49 */            return linkedHashSet;
                }

                @Override
                public final Set I001IO000() {
                    Integer[] numArr;
                    StreamConfigurationMap streamConfigurationMap;
/* 3 */             Oi00IilOloo0 oi00IilOloo0 = this.I00ilO0.I0000Il00O;
/* 5 */             oi00IilOloo0.getClass();
/* 12 */            Integer[] numArr2 = null;
                    try {
/* 15 */                streamConfigurationMap = (StreamConfigurationMap) oi00IilOloo0.I00iOIl;
                    } catch (IllegalArgumentException e) {
/* 28 */                l11I11lO.I0001Ioi1lo("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
                    } catch (NullPointerException e2) {
/* 33 */                l11I11lO.I0001Ioi1lo("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
                    }
/* 31 */            int[] outputFormats = streamConfigurationMap != null ? streamConfigurationMap.getOutputFormats() : null;
/* 38 */            if (outputFormats != null) {
/* 41 */                numArr = new Integer[outputFormats.length];
/* 43 */                int length = outputFormats.length;
/* 45 */                for (int i = 0; i < length; i++) {
/* 53 */                    numArr[i] = Integer.valueOf(outputFormats[i]);
                        }
                    } else {
/* 58 */                numArr = null;
                    }
/* 65 */            if (IiOoli.I00000oIO(PixelJpegRSupportedQuirk.class) != null) {
/* 67 */                if (numArr != null) {
/* 71 */                    ArrayList arrayList = new ArrayList();
/* 76 */                    for (Integer num : numArr) {
/* 86 */                        if (num.intValue() != 4101) {
/* 88 */                            arrayList.add(num);
                                }
                            }
/* 101 */                   numArr2 = (Integer[]) arrayList.toArray(new Integer[0]);
                        }
/* 103 */               numArr = numArr2;
                    }
                    return numArr != null ? I1IoiO1l.I00IlilI0i0i(numArr) : Il01llIol0.I00iOIl;
                }

                @Override
                public final void I001i1O0Ol(IIl1Ol iIl1Ol) {
/* 1 */             IIl1Iloio iIl1Iloio = this.I00iio;
                    synchronized (iIl1Iloio.I00iOIl) {
/* 8 */                 iIl1Iloio.I00iOIl.remove(iIl1Ol);
/* 17 */                iIl1Iloio.I00iiO = O1Oii0O0loo.I000iOII(iIl1Iloio.I00iOIl);
                    }
                }

                @Override
                public final Object I00l0I0l0lO1(O0IOli0o0 o0IOli0o0) {
/* 1 */             IIloIoOOiO0l iIloIoOOiO0l = this.I00iOIl;
/* 3 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 15 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(IIioOol.class))) {
/* 23 */                return (IIioOol) this.I00ioIO.getValue();
                    }
/* 36 */            if (o0IOli0o0.equals(oOoOl1001II.I00000oOI(IIloIoOOiO0l.class))) {
/* 38 */                return iIloIoOOiO0l;
                    }
/* 45 */            boolean zEquals = o0IOli0o0.equals(oOoOl1001II.I00000oOI(IIlo0i0ll.class));
/* 49 */            IIlo0i0ll iIlo0i0ll = iIloIoOOiO0l.I00000oOI;
                    return zEquals ? iIlo0i0ll : ((IIioli) iIlo0i0ll).I00l0I0l0lO1(o0IOli0o0);
                }

                public final String toString() {
/* 18 */            return "CameraInfoAdapter<" + this.I00iiI + ".cameraId>";
                }
            }
