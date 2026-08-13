            package p000;

            import android.graphics.Rect;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Build;
            import android.util.Log;
            import android.util.Range;
            import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
            import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
            import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Ii10i0iO1 {
                public IIlIi0lIii I00000oIO;
                public OlOO1i11110 I00000oOI;
                public Ii10Ioo00l I0000Il00O;
                public OOiIoli I0000O;
                public OOiIoli I0000oI00;
                public OOiIoli I0001Ioi1lo;
                public OOiIoli I000II;
                public OOiIoli I000O01llI0;
                public OOiIoli I000OOo1O;
                public OOiIoli I000OiO;
                public OOiIoli I000iOII;
                public OOiIoli I000l1;
                public OOiIoli I000lI;
                public OOiIoli I000o00OoI0I;
                public OOiIoli I000oI1ioi;
                public OOiIoli I00100l0;
                public OOiIoli I00100o1O0lo;
                public OOiIoli I0010I0i;
                public OOiIoli I0010o;
                public OOiIoli I00111O;
                public OOiIoli I001IIilI0O;
                public OOiIoli I001IO000;
                public OOiIoli I001i1O0Ol;
                public OOiIoli I001i1lo1io;
                public OOiIoli I001iOo1i0O;
                public IiIio01lo I001l0I00;
                public OOiIoli I001lIiIIo1O;
                public OOiIoli I001lllioOl;
                public OOiIoli I001lloI;
                public OOiIoli I00II0Ol1O0l;
                public OOiIoli I00II0oii1o;
                public OOiIoli I00IO1;
                public OOiIoli I00IO1oi11O;
                public OOiIoli I00IOO;
                public OOiIoli I00IioO0OiOi;

                public final OloOIoiI1 I00000oIO() {
/* 9 */             OOil0lI oOil0lII00000oIO = ((IIo0OlO) this.I000OiO.get()).I00000oIO();
/* 19 */            Iterator it = oOil0lII00000oIO.I0000Il00O(CaptureIntentPreviewQuirk.class).iterator();
                    while (true) {
/* 27 */                if (it.hasNext()) {
/* 39 */                    if (((CaptureIntentPreviewQuirk) it.next()).I00000oIO()) {
                                break;
                            }
                        } else if (!oOil0lII00000oIO.I00000oIO(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
/* 56 */                    return i1O10l1io1iO.I00ilI0I1;
                        }
                    }
/* 52 */            return new IlOoIo(oOil0lII00000oIO);
                }

                public final i0I0OoIIOO01 I00000oOI() {
                    Range range;
                    Float f;
/* 10 */            IIloIoOOiO0l iIloIoOOiO0l = (IIloIoOOiO0l) this.I0000oI00.get();
/* 12 */            IIlo0i0ll iIlo0i0ll = iIloIoOOiO0l.I00000oOI;
/* 25 */            if ("robolectric".equals(Build.FINGERPRINT)) {
/* 27 */                List<CameraCharacteristics.Key> list = OIIl0oIl.I00iiI;
/* 33 */                if (!(list instanceof Collection) || !list.isEmpty()) {
/* 54 */                    for (CameraCharacteristics.Key key : list) {
/* 66 */                        if (l11I11lO.I0000O(5, "CXCP")) {
/* 87 */                            Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                                }
/* 97 */                        if (((IIioli) iIlo0i0ll).I0000O(key) == null) {
/* 101 */                           OIIl0oIl oIIl0oIl = new OIIl0oIl();
/* 104 */                           oIIl0oIl.I00iOIl = iIloIoOOiO0l;
/* 106 */                           VarHandle.storeStoreFence();
/* 109 */                           return oIIl0oIl;
                                }
                            }
                        }
                    } else {
/* 112 */               Float fValueOf = Float.valueOf(1.0f);
                        try {
/* 131 */                   Range range2 = (Range) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
/* 133 */                   if (range2 == null) {
/* 139 */                       if (l11I11lO.I0000O(5, "CXCP")) {
/* 167 */                           Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) IIllI0o.I0000Il00O(((IIioli) iIlo0i0ll).I00iOIl)) + '!');
                                }
/* 176 */                       range = new Range(fValueOf, fValueOf);
                            } else {
/* 187 */                       float fFloatValue = ((Number) range2.getLower()).floatValue();
/* 211 */                       if (Math.abs(fFloatValue) >= Math.ulp(Math.abs(fFloatValue)) * 2.0d && ((Number) range2.getLower()).floatValue() >= 0.0f) {
/* 259 */                           f = (Float) range2.getLower();
                                } else {
/* 232 */                           if (l11I11lO.I0000O(5, "CXCP")) {
/* 250 */                               Log.w("CXCP", "Invalid lower zoom range detected: " + range2.getLower());
                                    }
/* 253 */                           f = fValueOf;
                                }
/* 267 */                       float fFloatValue2 = ((Number) range2.getUpper()).floatValue();
/* 291 */                       if (Math.abs(fFloatValue2) >= Math.ulp(Math.abs(fFloatValue2)) * 2.0d && ((Number) range2.getUpper()).floatValue() >= 0.0f) {
/* 338 */                           fValueOf = (Float) range2.getUpper();
                                } else if (l11I11lO.I0000O(5, "CXCP")) {
/* 330 */                           Log.w("CXCP", "Invalid upper zoom range detected: " + range2.getUpper());
                                }
/* 342 */                       range = new Range(f, fValueOf);
                            }
                        } catch (AssertionError e) {
/* 352 */                   if (IiOoli.I00000oIO(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
/* 359 */                       if (l11I11lO.I0000O(3, "CXCP")) {
/* 361 */                           String str = Build.MANUFACTURER;
/* 363 */                           String str2 = Build.MODEL;
                                }
                            } else if (l11I11lO.I0000O(6, "CXCP")) {
/* 414 */                       Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
                            }
/* 421 */                   if (l11I11lO.I0000O(5, "CXCP")) {
/* 425 */                       Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
                            }
/* 428 */                   range = null;
                        }
/* 429 */               if (range != null) {
/* 434 */                   I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(1);
/* 437 */                   i1I0i0Ilo1Oi.I00iiI = iIloIoOOiO0l;
/* 439 */                   i1I0i0Ilo1Oi.I00iiO = range;
/* 441 */                   VarHandle.storeStoreFence();
/* 743 */                   return i1I0i0Ilo1Oi;
                        }
                    }
/* 450 */           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(9, false);
/* 453 */           ioIlOo1o0IIl.I00iiI = iIloIoOOiO0l;
/* 465 */           ioIlOo1o0IIl.I00iio = (Rect) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
/* 467 */           VarHandle.storeStoreFence();
/* 743 */           return ioIlOo1o0IIl;
                }
            }
