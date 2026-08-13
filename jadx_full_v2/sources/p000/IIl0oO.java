            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraExtensionCharacteristics;
            import android.hardware.camera2.CameraManager;
            import android.os.Build;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.util.ArrayMap;
            import android.util.Log;
            import java.util.Arrays;
            import java.util.Map;
            import java.util.Set;
            
            public final class IIl0oO {
                public Context I00000oIO;
                public Oo10IliO00O I00000oOI;
                public OO0l1l I0000Il00O;
                public IoloOio0I I0000O;
                public ArrayMap I0000oI00;
                public ArrayMap I0001Ioi1lo;
                public ArrayMap I000II;

                public final IIlo0i0ll I00000oIO(String str) {
                    IIlo0i0ll iIlo0i0llI0000Il00O;
                    try {
/* 22 */                Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#awaitMetadata");
                        synchronized (this.I0000oI00) {
/* 34 */                    iIlo0i0llI0000Il00O = (IIlo0i0ll) this.I0000oI00.get(str);
/* 36 */                    if (iIlo0i0llI0000Il00O == null) {
/* 44 */                        if (I0000oI00()) {
/* 61 */                            iIlo0i0llI0000Il00O = I0000Il00O(str, true);
                                } else {
/* 47 */                            iIlo0i0llI0000Il00O = I0000Il00O(str, false);
/* 53 */                            this.I0000oI00.put(str, iIlo0i0llI0000Il00O);
                                }
                            }
                        }
/* 68 */                return iIlo0i0llI0000Il00O;
                    } finally {
/* 72 */                Trace.endSection();
                    }
                }

                public final IIioOlO0o1 I00000oOI(boolean z, String str, int i) {
                    String str2;
/* 5 */             long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 30 */                Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#readCameraExtensionMetadata");
                        try {
/* 33 */                    IIllI0o.I0000Il00O(str);
/* 42 */                    IIioOlO0o1 iIioOlO0o1 = new IIioOlO0o1(str, i, I0000O(str));
/* 51 */                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
/* 53 */                    if (!z) {
/* 55 */                        str2 = "";
                            } else {
/* 60 */                        if (!z) {
/* 130 */                           throw new IOiIIo1l(6);
                                }
/* 62 */                        str2 = " (redacted)";
                            }
/* 117 */                   Log.i("CXCP", "Loaded extension metadata for " + ((Object) IIllI0o.I0000Il00O(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
/* 123 */                   return iIioOlO0o1;
                        } catch (Throwable th) {
/* 157 */                   throw new IllegalStateException("Failed to load extension metadata for " + ((Object) IIllI0o.I0000Il00O(str)) + '!', th);
                        }
                    } finally {
/* 159 */               Trace.endSection();
                    }
                }

                public final IIioli I0000Il00O(String str, boolean z) {
                    Iterable iterableI0001Ioi1lo;
                    String str2;
/* 1 */             IoloOio0I ioloOio0I = this.I0000O;
/* 7 */             long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
/* 32 */                Trace.beginSection(((Object) IIllI0o.I0000Il00O(str)) + "#readCameraMetadata");
                        try {
/* 35 */                    IIllI0o.I0000Il00O(str);
/* 48 */                    CameraCharacteristics cameraCharacteristics = ((CameraManager) this.I00000oIO.getSystemService("camera")).getCameraCharacteristics(str);
/* 54 */                    Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP);
/* 60 */                    Map map = (Map) ioloOio0I.I00iiO;
/* 62 */                    if (obj != null) {
/* 72 */                        Set set = (Set) map.get(IIllI0o.I00000oIO(str));
/* 74 */                        if (set == null) {
/* 76 */                            set = Il01llIol0.I00iOIl;
                                }
/* 84 */                        iterableI0001Ioi1lo = Oio0lI.I0001Ioi1lo(set, CameraCharacteristics.SENSOR_ORIENTATION);
                            } else {
/* 97 */                        iterableI0001Ioi1lo = (Set) map.get(IIllI0o.I00000oIO(str));
                            }
/* 101 */                   Set setI0000oI00 = (Set) ioloOio0I.I00iiI;
/* 103 */                   if (iterableI0001Ioi1lo != null) {
/* 108 */                       setI0000oI00 = Oio0lI.I0000oI00(setI0000oI00, iterableI0001Ioi1lo);
                            }
/* 114 */                   IIioli iIioli = new IIioli(str, cameraCharacteristics, this, setI0000oI00);
/* 123 */                   long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
/* 125 */                   if (!z) {
/* 127 */                       str2 = "";
                            } else {
/* 130 */                       if (!z) {
/* 200 */                           throw new IOiIIo1l(6);
                                }
/* 132 */                       str2 = " (redacted)";
                            }
/* 187 */                   Log.i("CXCP", "Loaded metadata for " + ((Object) IIllI0o.I0000Il00O(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
/* 193 */                   return iIioli;
                        } catch (Throwable th) {
/* 227 */                   throw new IllegalStateException("Failed to load metadata for " + ((Object) IIllI0o.I0000Il00O(str)) + '!', th);
                        }
                    } finally {
/* 229 */               Trace.endSection();
                    }
                }

                public final CameraExtensionCharacteristics I0000O(String str) {
                    synchronized (this.I000II) {
/* 10 */                CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.I000II.get(str);
/* 12 */                if (cameraExtensionCharacteristics != null) {
/* 15 */                    return cameraExtensionCharacteristics;
                        }
/* 17 */                IIllI0o.I0000Il00O(str);
/* 30 */                return ((CameraManager) this.I00000oIO.getSystemService("camera")).getCameraExtensionCharacteristics(str);
                    }
                }

                public final boolean I0000oI00() {
                    boolean z;
/* 1 */             OO0l1l oO0l1l = this.I0000Il00O;
/* 12 */            if (O0000Ioio00.I0000O(Build.FINGERPRINT, "robolectric")) {
/* 14 */                z = true;
                    } else {
/* 18 */                if (!oO0l1l.I00000oOI) {
/* 22 */                    Trace.beginSection("CXCP#checkCameraPermission");
/* 33 */                    if (oO0l1l.I00000oIO.checkSelfPermission("android.permission.CAMERA") == 0) {
/* 35 */                        oO0l1l.I00000oOI = true;
                            }
/* 37 */                    Trace.endSection();
                        }
/* 40 */                z = oO0l1l.I00000oOI;
                    }
/* 42 */            return !z;
                }
            }
