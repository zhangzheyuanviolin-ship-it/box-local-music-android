            package p000;

            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraManager;
            import android.os.Trace;
            import android.util.Log;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Set;
            
            public final class IIlOlol0liO {
                public IIl10ilil1 I00000oIO;

                public static ArrayList I00000oIO(IIlOlol0liO iIlOlol0liO) {
                    ArrayList arrayListI0000O;
/* 5 */             IIl01i0I iIl01i0I = iIlOlol0liO.I0000Il00O().I00000oOI;
                    synchronized (iIl01i0I.I0001Ioi1lo) {
/* 10 */                arrayListI0000O = iIl01i0I.I000II;
                    }
/* 13 */            if (arrayListI0000O == null) {
/* 16 */                arrayListI0000O = iIl01i0I.I0000O();
                    }
/* 20 */            if (arrayListI0000O == null) {
/* 44 */                Log.w("CXCP", "Failed to load cameraIds from " + ((Object) IIl10Ilo.I00000oOI("CXCP-Camera2")));
                    }
/* 47 */            return arrayListI0000O;
                }

                public static Set I00000oOI(IIlOlol0liO iIlOlol0liO) {
/* 5 */             IIl01i0I iIl01i0I = iIlOlol0liO.I0000Il00O().I00000oOI;
                    synchronized (iIl01i0I.I0001Ioi1lo) {
                    }
                    try {
/* 19 */                Set<Set<String>> concurrentCameraIds = ((CameraManager) iIl01i0I.I00000oIO.get()).getConcurrentCameraIds();
/* 23 */                concurrentCameraIds.toString();
/* 26 */                Set<Set<String>> set = concurrentCameraIds;
/* 36 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(set, 10));
/* 39 */                Iterator<T> it = set.iterator();
/* 47 */                while (it.hasNext()) {
/* 53 */                    Set<String> set2 = (Set) it.next();
/* 63 */                    ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(set2, 10));
/* 74 */                    for (String str : set2) {
/* 82 */                        IIllI0o.I00000oOI(str);
/* 89 */                        arrayList2.add(IIllI0o.I00000oIO(str));
                            }
/* 97 */                    arrayList.add(IOOi0Ool1i.I00iio(arrayList2));
                        }
/* 101 */               return IOOi0Ool1i.I00iio(arrayList);
                    } catch (CameraAccessException e) {
/* 111 */               Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
/* 114 */               return null;
                    }
                }

                public final IIil1o0olooo I0000Il00O() {
/* 1 */             IIl10ilil1 iIl10ilil1 = this.I00000oIO;
                    try {
/* 7 */                 Trace.beginSection("getCameraBackend");
/* 12 */                iIl10ilil1.I0000O.getClass();
/* 17 */                IIil1o0olooo iIil1o0oloooI00000oIO = iIl10ilil1.I00000oIO("CXCP-Camera2");
/* 21 */                if (iIil1o0oloooI00000oIO != null) {
/* 26 */                    return iIil1o0oloooI00000oIO;
                        }
/* 52 */                throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) IIl10Ilo.I00000oOI("CXCP-Camera2"))).toString());
                    } finally {
/* 54 */                Trace.endSection();
                    }
                }
            }
