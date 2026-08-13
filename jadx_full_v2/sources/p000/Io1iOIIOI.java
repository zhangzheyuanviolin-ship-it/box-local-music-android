            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.params.StreamConfigurationMap;
            import android.util.Size;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Io1iOIIOI implements IllOOo00lI {
                public final int I00iOIl;
                public Io1iOil0oli I00iiI;

                public Io1iOIIOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Io1iOil0oli io1iOil0oli = this.I00iiI;
                    switch (i) {
                        case 0:
/* 161 */                   int[] iArr = (int[]) ((IIioli) io1iOil0oli.I00000oIO).I0000O(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
/* 163 */                   boolean z = false;
/* 164 */                   if (iArr != null) {
/* 166 */                       int length = iArr.length;
/* 167 */                       int i2 = 0;
                                while (true) {
/* 168 */                           if (i2 < length) {
/* 174 */                               if (iArr[i2] == 9) {
/* 176 */                                   z = true;
                                        } else {
/* 178 */                                   i2++;
                                        }
                                    }
                                }
                            }
/* 181 */                   return Boolean.valueOf(z);
                        case 1:
/* 77 */                    List list = (List) io1iOil0oli.I0000oI00.getValue();
/* 86 */                    if (list.isEmpty()) {
/* 89 */                        list = null;
                            }
/* 90 */                    if (list == null) {
/* 3 */                         return null;
                            }
/* 94 */                    Iterator it = list.iterator();
/* 102 */                   if (!it.hasNext()) {
/* 147 */                       IoOOl0iOl1io.I00000oOI();
/* 3 */                         return null;
                            }
/* 104 */                   Object next = it.next();
/* 112 */                   if (it.hasNext()) {
/* 118 */                       int iI00000oIO = Ol0ilIo.I00000oIO((Size) next);
/* 141 */                       do {
/* 122 */                           Object next2 = it.next();
/* 129 */                           int iI00000oIO2 = Ol0ilIo.I00000oIO((Size) next2);
/* 133 */                           if (iI00000oIO < iI00000oIO2) {
/* 135 */                               next = next2;
/* 136 */                               iI00000oIO = iI00000oIO2;
                                    }
/* 141 */                       } while (it.hasNext());
                            }
/* 144 */                   return (Size) next;
                        case 2:
/* 39 */                    IIlo0i0ll iIlo0i0ll = io1iOil0oli.I00000oIO;
/* 50 */                    StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((IIioli) iIlo0i0ll).I0000O(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
/* 52 */                    if (streamConfigurationMap != null) {
/* 61 */                        return new OlOIOo0(streamConfigurationMap, new OIl1o01(iIlo0i0ll));
                            }
/* 67 */                    I000II.I000iOII("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
/* 3 */                     return null;
                        default:
/* 21 */                    StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((OlOIOo0) io1iOil0oli.I0000O.getValue()).I0000Il00O.I00iOIl;
/* 25 */                    Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                            return highSpeedVideoSizes != null ? I1IoiO1l.I00IioO0OiOi(highSpeedVideoSizes) : Il01100l.I00iOIl;
                    }
                }
            }
