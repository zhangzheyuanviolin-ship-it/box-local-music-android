            package p000;

            import android.os.Build;
            import android.os.Trace;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Set;
            
            public final class IIioiIi implements IllOOo00lI {
                public final int I00iOIl;
                public IIioli I00iiI;

                public IIioiIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 5 */             Collection collection = Il01100l.I00iOIl;
/* 7 */             Il01llIol0 il01llIol0 = Il01llIol0.I00iOIl;
/* 11 */            IIioli iIioli = this.I00iiI;
                    switch (i) {
                        case 0:
/* 622 */                   String str = iIioli.I00iOIl;
                            try {
                                try {
/* 645 */                           Trace.beginSection("Camera-" + ((Object) IIllI0o.I0000Il00O(str)) + "#supportedExtensions");
/* 660 */                           Set setI00iio = IOOi0Ool1i.I00iio(iIioli.I00iiO.I0000O(str).getSupportedExtensions());
/* 664 */                           Trace.endSection();
/* 667 */                           return setI00iio;
                                } finally {
                                }
                            } catch (AssertionError e) {
/* 694 */                       Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) IIllI0o.I0000Il00O(str)), e);
/* 697 */                       return il01llIol0;
                            }
                        case 1:
/* 541 */                   String str2 = iIioli.I00iOIl;
                            try {
                                try {
/* 564 */                           Trace.beginSection(((Object) IIllI0o.I0000Il00O(str2)) + "#keys");
/* 569 */                           Collection keys = iIioli.I00iiI.getKeys();
/* 573 */                           if (keys != null) {
/* 576 */                               collection = keys;
                                    }
/* 579 */                           Set setI00iio2 = IOOi0Ool1i.I00iio(collection);
/* 583 */                           Trace.endSection();
/* 586 */                           return setI00iio2;
                                } finally {
                                }
                            } catch (AssertionError e2) {
/* 618 */                       Log.w("CXCP", "Failed to getKeys from " + ((Object) IIllI0o.I0000Il00O(str2)) + '}', e2);
/* 621 */                       return il01llIol0;
                            }
                        case 2:
/* 465 */                   String str3 = iIioli.I00iOIl;
                            try {
                                try {
/* 488 */                           Trace.beginSection(((Object) IIllI0o.I0000Il00O(str3)) + "#availableCaptureRequestKeys");
/* 493 */                           Collection availableCaptureRequestKeys = iIioli.I00iiI.getAvailableCaptureRequestKeys();
/* 497 */                           if (availableCaptureRequestKeys != null) {
/* 500 */                               collection = availableCaptureRequestKeys;
                                    }
/* 503 */                           Set setI00iio3 = IOOi0Ool1i.I00iio(collection);
/* 507 */                           Trace.endSection();
/* 510 */                           return setI00iio3;
                                } finally {
                                }
                            } catch (AssertionError e3) {
/* 537 */                       Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) IIllI0o.I0000Il00O(str3)), e3);
/* 540 */                       return il01llIol0;
                            }
                        case 3:
/* 389 */                   String str4 = iIioli.I00iOIl;
                            try {
                                try {
/* 412 */                           Trace.beginSection(((Object) IIllI0o.I0000Il00O(str4)) + "#availableCaptureResultKeys");
/* 417 */                           Collection availableCaptureResultKeys = iIioli.I00iiI.getAvailableCaptureResultKeys();
/* 421 */                           if (availableCaptureResultKeys != null) {
/* 424 */                               collection = availableCaptureResultKeys;
                                    }
/* 427 */                           Set setI00iio4 = IOOi0Ool1i.I00iio(collection);
/* 431 */                           Trace.endSection();
/* 434 */                           return setI00iio4;
                                } finally {
                                }
                            } catch (AssertionError e4) {
/* 461 */                       Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) IIllI0o.I0000Il00O(str4)), e4);
/* 464 */                       return il01llIol0;
                            }
                        case 4:
/* 227 */                   String str5 = iIioli.I00iOIl;
                            try {
                                try {
/* 254 */                           Trace.beginSection(((Object) IIllI0o.I0000Il00O(str5)) + "#physicalCameraIds");
/* 259 */                           Set<String> physicalCameraIds = iIioli.I00iiI.getPhysicalCameraIds();
/* 287 */                           Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) IIllI0o.I0000Il00O(str5)) + ": " + physicalCameraIds);
/* 290 */                           Set<String> set = physicalCameraIds;
/* 300 */                           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set, 10));
/* 311 */                           for (String str6 : set) {
/* 319 */                               IIllI0o.I00000oOI(str6);
/* 326 */                               arrayList.add(IIllI0o.I00000oIO(str6));
                                    }
/* 332 */                           Set setI00iio5 = IOOi0Ool1i.I00iio(arrayList);
/* 336 */                           Trace.endSection();
/* 339 */                           return setI00iio5;
                                } catch (Throwable th) {
/* 348 */                           throw th;
                                }
                            } catch (AssertionError e5) {
/* 385 */                       Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) IIllI0o.I0000Il00O(str5)), e5);
/* 388 */                       return il01llIol0;
                            } catch (NullPointerException e6) {
/* 365 */                       Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) IIllI0o.I0000Il00O(str5)), e6);
/* 388 */                       return il01llIol0;
                            }
                        case 5:
/* 159 */                   String str7 = iIioli.I00iOIl;
                            try {
                                try {
/* 178 */                           Trace.beginSection("Camera-" + str7 + "#availablePhysicalCameraRequestKeys");
/* 183 */                           Collection availablePhysicalCameraRequestKeys = iIioli.I00iiI.getAvailablePhysicalCameraRequestKeys();
/* 187 */                           if (availablePhysicalCameraRequestKeys != null) {
/* 190 */                               collection = availablePhysicalCameraRequestKeys;
                                    }
/* 193 */                           Set setI00iio6 = IOOi0Ool1i.I00iio(collection);
/* 197 */                           Trace.endSection();
/* 200 */                           return setI00iio6;
                                } finally {
                                }
                            } catch (AssertionError e7) {
/* 223 */                       Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str7, e7);
/* 226 */                       return il01llIol0;
                            }
                        case 6:
/* 84 */                    String str8 = iIioli.I00iOIl;
/* 90 */                    if (Build.VERSION.SDK_INT < 35) {
/* 158 */                       return il01llIol0;
                            }
                            try {
                                try {
/* 110 */                           Trace.beginSection("Camera-" + str8 + "#getAvailableSessionCharacteristicsKeys");
/* 1 */                             Collection availableSessionCharacteristicsKeys = iIioli.I00iiI.getAvailableSessionCharacteristicsKeys();
/* 119 */                           if (availableSessionCharacteristicsKeys != null) {
/* 122 */                               collection = availableSessionCharacteristicsKeys;
                                    }
/* 125 */                           Set setI00iio7 = IOOi0Ool1i.I00iio(collection);
/* 129 */                           Trace.endSection();
/* 132 */                           return setI00iio7;
                                } finally {
                                }
                            } catch (AssertionError e8) {
/* 155 */                       Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str8, e8);
/* 158 */                       return il01llIol0;
                            }
                        default:
/* 16 */                    String str9 = iIioli.I00iOIl;
                            try {
                                try {
/* 35 */                            Trace.beginSection("Camera-" + str9 + "#availableSessionKeys");
/* 40 */                            Collection availableSessionKeys = iIioli.I00iiI.getAvailableSessionKeys();
/* 44 */                            if (availableSessionKeys != null) {
/* 47 */                                collection = availableSessionKeys;
                                    }
/* 50 */                            Set setI00iio8 = IOOi0Ool1i.I00iio(collection);
/* 54 */                            Trace.endSection();
/* 57 */                            return setI00iio8;
                                } finally {
                                }
                            } catch (AssertionError e9) {
/* 80 */                        Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str9, e9);
/* 83 */                        return il01llIol0;
                            }
                    }
                }
            }
