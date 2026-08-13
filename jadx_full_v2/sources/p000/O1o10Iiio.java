            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CameraManager;
            import android.util.Log;
            import com.box.gallery.R;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO1o10Iiio;", "LOooioIIoi0O;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class O1o10Iiio extends OooioIIoi0O {
                public Context I00000oOI;
                public OlO0OIIl1 I0000Il00O;
                public OOli1O I0000O;
                public OlO0OIIl1 I0000oI00;
                public OOli1O I0001Ioi1lo;

                public static String I0001Ioi1lo(Context context, boolean z) {
                    String str;
/* 11 */            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    try {
/* 16 */                String[] cameraIdList = cameraManager.getCameraIdList();
/* 20 */                int length = cameraIdList.length;
/* 22 */                int i = 0;
                        while (true) {
/* 23 */                    if (i >= length) {
/* 55 */                        str = null;
                                break;
                            }
/* 25 */                    str = cameraIdList[i];
/* 37 */                    Boolean bool = (Boolean) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
/* 49 */                    if (bool != null ? bool.booleanValue() : false) {
                                break;
                            }
/* 52 */                    i++;
                        }
/* 56 */                if (str == null) {
/* 77 */                    return "";
                        }
                        try {
/* 58 */                    cameraManager.setTorchMode(str, z);
/* 77 */                    return "";
                        } catch (Exception e) {
/* 63 */                    Log.e("AGMAViewModel", "Failed to set flashlight", e);
/* 66 */                    String message = e.getMessage();
                            return message == null ? context.getString(R.string.unknown_error) : message;
                        }
                    } catch (Exception e2) {
/* 80 */                Log.e("AGMAViewModel", "Failed to set flashlight", e2);
/* 83 */                String message2 = e2.getMessage();
                        return message2 == null ? context.getString(R.string.unknown_error) : message2;
                    }
                }

                public final void I0000oI00() {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 34 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 34 */            } while (!olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, false, null, null, Il01100l.I00iOIl, false, 47)));
                }

                public final void I000II() {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
/* 34 */            do {
/* 3 */                 value = olO0OIIl1.getValue();
/* 34 */            } while (!olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, false, null, "", null, false, 55)));
                }

                public final void I000O01llI0(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 24 */                boolean z2 = z;
/* 33 */                if (olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, false, null, null, null, z2, 31))) {
/* 35 */                    return;
                        } else {
/* 36 */                    z = z2;
                        }
                    }
                }

                public final void I000OOo1O(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 24 */                boolean z2 = z;
/* 33 */                if (olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, z2, null, null, null, false, 61))) {
/* 35 */                    return;
                        } else {
/* 36 */                    z = z2;
                        }
                    }
                }

                public final void I000OiO(boolean z) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 24 */                boolean z2 = z;
/* 33 */                if (olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), z2, false, null, null, null, false, 62))) {
/* 35 */                    return;
                        } else {
/* 36 */                    z = z2;
                        }
                    }
                }

                public final void I000iOII(String str) {
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I0000Il00O;
                    while (true) {
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 24 */                String str2 = str;
/* 33 */                if (olO0OIIl1.I000iOII(value, O1o0lio.I00000oIO((O1o0lio) olO0OIIl1.getValue(), false, false, str2, null, null, false, 59))) {
/* 35 */                    return;
                        } else {
/* 36 */                    str = str2;
                        }
                    }
                }
            }
