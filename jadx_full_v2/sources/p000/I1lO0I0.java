            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class I1lO0I0 {
                public int I00000oIO;
                public HashMap I00000oOI;
                public Executor I0000Il00O;
                public ioIOOi0 I0000O;
                public Rect I0000oI00;
                public Matrix I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public boolean I000OiO;
                public List I000iOII;

                public final boolean I00000oIO() {
/* 7 */             Iterator it = this.I00000oOI.entrySet().iterator();
/* 15 */            while (it.hasNext()) {
/* 33 */                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
/* 35 */                    return false;
                        }
                    }
/* 37 */            return true;
                }

                public final void I00000oOI(int i) {
/* 1 */             HashMap map = this.I00000oOI;
/* 11 */            if (map.containsKey(Integer.valueOf(i))) {
/* 27 */                map.put(Integer.valueOf(i), Boolean.TRUE);
                    } else {
/* 17 */                l11I11lO.I00000oIO("TakePictureRequest", "The format is not supported in simultaneous capture");
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1lO0I0) {
/* 10 */                I1lO0I0 i1lO0I0 = (I1lO0I0) obj;
/* 20 */                if (this.I0000Il00O.equals(i1lO0I0.I0000Il00O)) {
/* 22 */                    ioIOOi0 ioiooi0 = this.I0000O;
/* 24 */                    ioIOOi0 ioiooi02 = i1lO0I0.I0000O;
/* 26 */                    if (ioiooi0 != null ? ioiooi0.equals(ioiooi02) : ioiooi02 == null) {
/* 45 */                        if (this.I0000oI00.equals(i1lO0I0.I0000oI00) && this.I0001Ioi1lo.equals(i1lO0I0.I0001Ioi1lo) && this.I000II == i1lO0I0.I000II && this.I000O01llI0 == i1lO0I0.I000O01llI0 && this.I000OOo1O == i1lO0I0.I000OOo1O && this.I000OiO == i1lO0I0.I000OiO && this.I000iOII.equals(i1lO0I0.I000iOII)) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.I0000Il00O.hashCode() ^ 1000003) * 1000003;
/* 12 */            ioIOOi0 ioiooi0 = this.I0000O;
/* 72 */            return this.I000iOII.hashCode() ^ ((((((((((((((iHashCode ^ (ioiooi0 == null ? 0 : ioiooi0.hashCode())) * 1525764945) ^ this.I0000oI00.hashCode()) * 1000003) ^ this.I0001Ioi1lo.hashCode()) * 1000003) ^ this.I000II) * 1000003) ^ this.I000O01llI0) * 1000003) ^ this.I000OOo1O) * 1000003) ^ (this.I000OiO ? 1231 : 1237)) * 1000003);
                }

                public final String toString() {
/* 98 */            return "TakePictureRequest{appExecutor=" + this.I0000Il00O + ", inMemoryCallback=" + this.I0000O + ", onDiskCallback=null, outputFileOptions=null, secondaryOutputFileOptions=null, cropRect=" + this.I0000oI00 + ", sensorToBufferTransform=" + this.I0001Ioi1lo + ", rotationDegrees=" + this.I000II + ", jpegQuality=" + this.I000O01llI0 + ", captureMode=" + this.I000OOo1O + ", simultaneousCapture=" + this.I000OiO + ", sessionConfigCameraCaptureCallbacks=" + this.I000iOII + "}";
                }
            }
