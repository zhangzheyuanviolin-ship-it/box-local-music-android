            package p000;

            import android.os.Trace;
            import android.util.Log;
            import java.util.Set;
            
            public final class IIioOiI1 implements IllOOo00lI {
                public final int I00iOIl;
                public IIioOlO0o1 I00iiI;

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Il01llIol0 il01llIol0 = Il01llIol0.I00iOIl;
/* 7 */             boolean z = false;
                    switch (i) {
                        case 0:
/* 234 */                   StringBuilder sb = new StringBuilder();
/* 237 */                   IIioOlO0o1 iIioOlO0o1 = this.I00iiI;
/* 245 */                   sb.append((Object) IIllI0o.I0000Il00O(iIioOlO0o1.I00iOIl));
/* 250 */                   sb.append("#availableCaptureRequestKeys");
/* 253 */                   String string = sb.toString();
                            try {
                                try {
/* 257 */                           Trace.beginSection(string);
/* 270 */                           Set setI00iio = IOOi0Ool1i.I00iio(iIioOlO0o1.I00iiO.getAvailableCaptureRequestKeys(iIioOlO0o1.I00iiI));
/* 274 */                           Trace.endSection();
/* 277 */                           return setI00iio;
                                } finally {
                                }
                            } catch (Throwable th) {
/* 301 */                       Log.w("CXCP", "Failed to get " + string + "! Caching {} and ignoring exception.", th);
/* 304 */                       return il01llIol0;
                            }
                        case 1:
/* 161 */                   StringBuilder sb2 = new StringBuilder();
/* 164 */                   IIioOlO0o1 iIioOlO0o12 = this.I00iiI;
/* 172 */                   sb2.append((Object) IIllI0o.I0000Il00O(iIioOlO0o12.I00iOIl));
/* 177 */                   sb2.append("#availableCaptureResultKeys");
/* 180 */                   String string2 = sb2.toString();
                            try {
                                try {
/* 184 */                           Trace.beginSection(string2);
/* 197 */                           Set setI00iio2 = IOOi0Ool1i.I00iio(iIioOlO0o12.I00iiO.getAvailableCaptureResultKeys(iIioOlO0o12.I00iiI));
/* 201 */                           Trace.endSection();
/* 204 */                           return setI00iio2;
                                } finally {
                                }
                            } catch (Throwable th2) {
/* 228 */                       Log.w("CXCP", "Failed to get " + string2 + "! Caching {} and ignoring exception.", th2);
/* 231 */                       return il01llIol0;
                            }
                        case 2:
/* 90 */                    StringBuilder sb3 = new StringBuilder();
/* 93 */                    IIioOlO0o1 iIioOlO0o13 = this.I00iiI;
/* 101 */                   sb3.append((Object) IIllI0o.I0000Il00O(iIioOlO0o13.I00iOIl));
/* 106 */                   sb3.append("#isPostviewSupported");
/* 109 */                   String string3 = sb3.toString();
                            try {
                                try {
/* 113 */                           Trace.beginSection(string3);
/* 120 */                           boolean zIsPostviewAvailable = iIioOlO0o13.I00iiO.isPostviewAvailable(iIioOlO0o13.I00iiI);
/* 124 */                           Trace.endSection();
/* 127 */                           z = zIsPostviewAvailable;
                                } finally {
                                }
                            } catch (Throwable th3) {
/* 151 */                       Log.w("CXCP", "Failed to get " + string3 + "! Caching false and ignoring exception.", th3);
                            }
/* 154 */                   return Boolean.valueOf(z);
                        default:
/* 19 */                    StringBuilder sb4 = new StringBuilder();
/* 22 */                    IIioOlO0o1 iIioOlO0o14 = this.I00iiI;
/* 30 */                    sb4.append((Object) IIllI0o.I0000Il00O(iIioOlO0o14.I00iOIl));
/* 35 */                    sb4.append("#isCaptureProgressSupported");
/* 38 */                    String string4 = sb4.toString();
                            try {
                                try {
/* 42 */                            Trace.beginSection(string4);
/* 49 */                            boolean zIsCaptureProcessProgressAvailable = iIioOlO0o14.I00iiO.isCaptureProcessProgressAvailable(iIioOlO0o14.I00iiI);
/* 53 */                            Trace.endSection();
/* 56 */                            z = zIsCaptureProcessProgressAvailable;
                                } finally {
                                }
                            } catch (Throwable th4) {
/* 80 */                        Log.w("CXCP", "Failed to get " + string4 + "! Caching false and ignoring exception.", th4);
                            }
/* 83 */                    return Boolean.valueOf(z);
                    }
                }
            }
