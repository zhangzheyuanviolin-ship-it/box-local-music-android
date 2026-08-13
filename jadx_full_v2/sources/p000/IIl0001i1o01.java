            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureFailure;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import android.hardware.camera2.TotalCaptureResult;
            import android.os.Trace;
            import android.util.ArrayMap;
            import android.util.Log;
            import android.view.Surface;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class IIl0001i1o01 extends CameraCaptureSession.CaptureCallback {
                public String I00000oIO;
                public boolean I00000oOI;
                public ArrayList I0000Il00O;
                public ArrayList I0000O;
                public List I0000oI00;
                public O1OIll00i I0001Ioi1lo;
                public ArrayMap I000II;
                public ArrayMap I000O01llI0;
                public OlOO00iI0lI I000OOo1O;
                public OlOl1I I000OiO;
                public long I000iOII;
                public IOi10loi I000l1;
                public volatile Integer I000lI;

                public final int I00000oIO() {
                    int iIntValue;
/* 7 */             if (this.I000lI != null) {
/* 49 */                Integer num = this.I000lI;
/* 51 */                if (num != null) {
/* 53 */                    return num.intValue();
                        }
/* 60 */                IOOlIIilOl0.I000O01llI0("SequenceNumber has not been set for ", 33, this);
/* 63 */                return 0;
                    }
                    synchronized (this) {
/* 10 */                Integer num2 = this.I000lI;
/* 12 */                if (num2 == null) {
/* 46 */                    throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
                        }
/* 14 */                iIntValue = num2.intValue();
                    }
/* 19 */            return iIntValue;
                }

                public final void I00000oOI(Oi0Iil oi0Iil, long j, Oi0I000 oi0I000) {
/* 3 */             this.I0001Ioi1lo.I00OIO1(this);
/* 8 */             Trace.beginSection("InvokeInternalListeners");
/* 11 */            List list = this.I0000oI00;
/* 16 */            int size = list.size();
/* 22 */            for (int i = 0; i < size; i++) {
/* 30 */                ((Oi01Ooii1Ol) list.get(i)).I00IoiI(oi0Iil, j, oi0I000);
                    }
/* 36 */            Trace.endSection();
/* 41 */            Trace.beginSection("InvokeRequestListeners");
/* 52 */            int size2 = oi0Iil.I00lli11().I0000O.size();
/* 56 */            for (int i2 = 0; i2 < size2; i2++) {
/* 70 */                ((Oi01Ooii1Ol) oi0Iil.I00lli11().I0000O.get(i2)).I00IoiI(oi0Iil, j, oi0I000);
                    }
/* 76 */            Trace.endSection();
                }

                public final void I0000Il00O(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
/* 1 */             List list = this.I0000oI00;
/* 5 */             Trace.beginSection("onCaptureCompleted");
/* 10 */            Trace.beginSection("onCaptureSequenceComplete");
/* 15 */            this.I0001Ioi1lo.I00OIO1(this);
/* 18 */            Trace.endSection();
/* 21 */            Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 27 */            String str = this.I00000oIO;
/* 29 */            I0oIili1iI i0oIili1iI = new I0oIili1iI();
/* 32 */            i0oIili1iI.I00iOIl = totalCaptureResult;
/* 39 */            i0oIili1iI.I00iiI = new I0oIl0101(totalCaptureResult, str);
                    try {
/* 43 */                Trace.beginSection("physicalCaptureResults");
/* 46 */                Map<String, TotalCaptureResult> physicalCameraTotalResults = totalCaptureResult.getPhysicalCameraTotalResults();
/* 54 */                if (!physicalCameraTotalResults.isEmpty()) {
/* 63 */                    ArrayMap arrayMap = new ArrayMap(physicalCameraTotalResults.size());
/* 78 */                    for (Map.Entry<String, TotalCaptureResult> entry : physicalCameraTotalResults.entrySet()) {
/* 86 */                        String key = entry.getKey();
/* 92 */                        IIllI0o.I00000oOI(key);
/* 110 */                       arrayMap.put(IIllI0o.I00000oIO(key), new I0oIl0101(entry.getValue(), key));
                            }
                        }
/* 114 */               Trace.endSection();
/* 117 */               VarHandle.storeStoreFence();
/* 122 */               Trace.beginSection("onTotalCaptureResult");
/* 127 */               Trace.beginSection("InvokeInternalListeners");
/* 131 */               List list2 = list;
/* 133 */               int size = list2.size();
/* 139 */               for (int i = 0; i < size; i++) {
/* 147 */                   ((Oi01Ooii1Ol) list.get(i)).I00IOO(oi0IilI000II, j, i0oIili1iI);
                        }
/* 153 */               Trace.endSection();
/* 158 */               Trace.beginSection("InvokeRequestListeners");
/* 169 */               int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 174 */               for (int i2 = 0; i2 < size2; i2++) {
/* 188 */                   ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i2)).I00IOO(oi0IilI000II, j, i0oIili1iI);
                        }
/* 194 */               Trace.endSection();
/* 197 */               Trace.endSection();
/* 202 */               Trace.beginSection("onComplete");
/* 205 */               Trace.beginSection("InvokeInternalListeners");
/* 208 */               int size3 = list2.size();
/* 213 */               for (int i3 = 0; i3 < size3; i3++) {
/* 221 */                   ((Oi01Ooii1Ol) list.get(i3)).I00OIl(oi0IilI000II, j, i0oIili1iI);
                        }
/* 227 */               Trace.endSection();
/* 230 */               Trace.beginSection("InvokeRequestListeners");
/* 241 */               int size4 = oi0IilI000II.I00lli11().I0000O.size();
/* 245 */               for (int i4 = 0; i4 < size4; i4++) {
/* 259 */                   ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i4)).I00OIl(oi0IilI000II, j, i0oIili1iI);
                        }
/* 265 */               Trace.endSection();
/* 268 */               Trace.endSection();
                    } finally {
/* 276 */               Trace.endSection();
                    }
                }

                public final void I0000O(int i) {
/* 1 */             List list = this.I0000oI00;
/* 3 */             ArrayList arrayList = this.I0000O;
/* 7 */             Trace.beginSection("onCaptureSequenceAborted");
/* 14 */            this.I000l1.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 19 */            this.I0001Ioi1lo.I00OIO1(this);
/* 22 */            OlOl1I olOl1I = this.I000OiO;
/* 28 */            if (I00000oIO() != i) {
/* 58 */                String str = "onCaptureSequenceAborted was invoked on " + I00000oIO() + ", but expected " + i + '!';
/* 62 */                olOl1I.getClass();
/* 67 */                Log.w("CXCP", str);
                    }
/* 72 */            Trace.beginSection("InvokeInternalListeners");
/* 75 */            int size = arrayList.size();
/* 81 */            for (int i2 = 0; i2 < size; i2++) {
/* 87 */                Oi0Iil oi0Iil = (Oi0Iil) arrayList.get(i2);
/* 92 */                int size2 = list.size();
/* 97 */                for (int i3 = 0; i3 < size2; i3++) {
/* 105 */                   ((Oi01Ooii1Ol) list.get(i3)).I00100l0(oi0Iil);
                        }
                    }
/* 114 */           Trace.endSection();
/* 119 */           Trace.beginSection("InvokeRequestListeners");
/* 122 */           int size3 = arrayList.size();
/* 127 */           for (int i4 = 0; i4 < size3; i4++) {
/* 133 */               Oi0Iil oi0Iil2 = (Oi0Iil) arrayList.get(i4);
/* 143 */               int size4 = oi0Iil2.I00lli11().I0000O.size();
/* 148 */               for (int i5 = 0; i5 < size4; i5++) {
/* 162 */                   ((Oi01Ooii1Ol) oi0Iil2.I00lli11().I0000O.get(i5)).I00100l0(oi0Iil2);
                        }
                    }
/* 171 */           Trace.endSection();
/* 174 */           Trace.endSection();
                }

                public final void I0000oI00(int i, long j) {
/* 1 */             List list = this.I0000oI00;
/* 3 */             ArrayList arrayList = this.I0000O;
/* 7 */             Trace.beginSection("onCaptureSequenceCompleted");
/* 14 */            this.I000l1.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 19 */            this.I0001Ioi1lo.I00OIO1(this);
/* 22 */            OlOl1I olOl1I = this.I000OiO;
/* 28 */            if (I00000oIO() != i) {
/* 58 */                String str = "onCaptureSequenceCompleted was invoked on " + I00000oIO() + ", but expected " + i + '!';
/* 62 */                olOl1I.getClass();
/* 67 */                Log.w("CXCP", str);
                    }
/* 72 */            Trace.beginSection("InvokeInternalListeners");
/* 75 */            int size = arrayList.size();
/* 81 */            for (int i2 = 0; i2 < size; i2++) {
/* 87 */                Oi0Iil oi0Iil = (Oi0Iil) arrayList.get(i2);
/* 92 */                int size2 = list.size();
/* 97 */                for (int i3 = 0; i3 < size2; i3++) {
/* 105 */                   ((Oi01Ooii1Ol) list.get(i3)).I000l1(oi0Iil, j);
                        }
                    }
/* 114 */           Trace.endSection();
/* 119 */           Trace.beginSection("InvokeRequestListeners");
/* 122 */           int size3 = arrayList.size();
/* 127 */           for (int i4 = 0; i4 < size3; i4++) {
/* 133 */               Oi0Iil oi0Iil2 = (Oi0Iil) arrayList.get(i4);
/* 143 */               int size4 = oi0Iil2.I00lli11().I0000O.size();
/* 148 */               for (int i5 = 0; i5 < size4; i5++) {
/* 162 */                   ((Oi01Ooii1Ol) oi0Iil2.I00lli11().I0000O.get(i5)).I000l1(oi0Iil2, j);
                        }
                    }
/* 171 */           Trace.endSection();
/* 174 */           Trace.endSection();
                }

                public final void I0001Ioi1lo(CaptureRequest captureRequest, long j, long j2) {
/* 3 */             Trace.beginSection("onCaptureStarted");
/* 10 */            this.I000l1.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 13 */            Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 19 */            Trace.beginSection("InvokeInternalListeners");
/* 22 */            List list = this.I0000oI00;
/* 27 */            int size = list.size();
/* 33 */            for (int i = 0; i < size; i++) {
/* 41 */                ((Oi01Ooii1Ol) list.get(i)).I001i1lo1io(oi0IilI000II, j, j2);
                    }
/* 47 */            Trace.endSection();
/* 52 */            Trace.beginSection("InvokeRequestListeners");
/* 63 */            int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 67 */            for (int i2 = 0; i2 < size2; i2++) {
/* 81 */                ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i2)).I001i1lo1io(oi0IilI000II, j, j2);
                    }
/* 87 */            Trace.endSection();
/* 90 */            Trace.endSection();
                }

                public final Oi0Iil I000II(CaptureRequest captureRequest) {
/* 1 */             ArrayList arrayList = this.I0000Il00O;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 14 */                if (arrayList.get(i) == captureRequest) {
/* 22 */                    return (Oi0Iil) this.I0000O.get(i);
                        }
                    }
/* 32 */            OoOil11Ol1o.I0010o("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
/* 35 */            return null;
                }

                @Override
                public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
                    OlOIo0l1O0Ol olOIo0l1O0Ol;
                    Object next;
/* 1 */             ArrayMap arrayMap = this.I000O01llI0;
/* 3 */             List list = this.I0000oI00;
/* 7 */             Trace.beginSection("onCaptureBufferLost");
/* 16 */            OlOO0I1 olOO0I1I00000oIO = (OlOO0I1) this.I000II.get(surface);
/* 18 */            if (olOO0I1I00000oIO == null) {
/* 25 */                OIl1lI0ll101 oIl1lI0ll101 = (OIl1lI0ll101) arrayMap.get(surface);
/* 28 */                if (oIl1lI0ll101 != null) {
/* 30 */                    int i = oIl1lI0ll101.I00000oIO;
/* 36 */                    Iterator it = this.I000OOo1O.I00ioIO.iterator();
                            while (true) {
/* 44 */                        if (it.hasNext()) {
/* 46 */                            next = it.next();
/* 55 */                            if (((OlOIo0l1O0Ol) next).I00000oIO == i) {
                                        break;
                                    }
                                } else {
/* 58 */                            next = null;
                                    break;
                                }
                            }
/* 59 */                    olOIo0l1O0Ol = (OlOIo0l1O0Ol) next;
                        } else {
/* 62 */                    olOIo0l1O0Ol = null;
                        }
/* 63 */                if (olOIo0l1O0Ol != null) {
/* 65 */                    IIo1loI0 iIo1loI0 = olOIo0l1O0Ol.I000OiO;
/* 67 */                    if (iIo1loI0 == null) {
/* 78 */                        O0000Ioio00.I000OOo1O("stream");
/* 81 */                        throw null;
                            }
/* 71 */                    olOO0I1I00000oIO = OlOO0I1.I00000oIO(iIo1loI0.I00000oIO);
                        } else {
/* 82 */                    olOO0I1I00000oIO = null;
                        }
                    }
/* 87 */            OIl1lI0ll101 oIl1lI0ll1012 = (OIl1lI0ll101) arrayMap.get(surface);
/* 91 */            if (olOO0I1I00000oIO == null) {
/* 273 */               StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
/* 276 */               sb.append(surface);
/* 283 */               I000II.I000oI1ioi(sb, " on ", IllIiOlOoIll.I00000oIO(j));
/* 1182 */              return;
                    }
/* 93 */            if (oIl1lI0ll1012 == null) {
/* 254 */               StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
/* 257 */               sb2.append(surface);
/* 264 */               I000II.I000oI1ioi(sb2, " on ", IllIiOlOoIll.I00000oIO(j));
/* 267 */               return;
                    }
/* 95 */            Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 101 */           Trace.beginSection("InvokeInternalListeners");
/* 105 */           List list2 = list;
/* 107 */           int size = list2.size();
/* 113 */           for (int i2 = 0; i2 < size; i2++) {
/* 121 */               ((Oi01Ooii1Ol) list.get(i2)).getClass();
                    }
/* 127 */           Trace.endSection();
/* 132 */           Trace.beginSection("InvokeRequestListeners");
/* 143 */           int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 148 */           for (int i3 = 0; i3 < size2; i3++) {
/* 162 */               ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i3)).getClass();
                    }
/* 168 */           Trace.endSection();
/* 171 */           Trace.beginSection("InvokeInternalListeners");
/* 174 */           int size3 = list2.size();
/* 179 */           for (int i4 = 0; i4 < size3; i4++) {
/* 192 */               ((Oi01Ooii1Ol) list.get(i4)).I0000Il00O(oi0IilI000II, j, olOO0I1I00000oIO.I00000oIO, oIl1lI0ll1012.I00000oIO);
                    }
/* 199 */           Trace.endSection();
/* 202 */           Trace.beginSection("InvokeRequestListeners");
/* 213 */           int size4 = oi0IilI000II.I00lli11().I0000O.size();
/* 217 */           for (int i5 = 0; i5 < size4; i5++) {
/* 236 */               ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i5)).I0000Il00O(oi0IilI000II, j, olOO0I1I00000oIO.I00000oIO, oIl1lI0ll1012.I00000oIO);
                    }
/* 242 */           Trace.endSection();
/* 245 */           Trace.endSection();
                }

                @Override
                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
/* 5 */             I0000Il00O(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
                }

                @Override
                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
/* 3 */             Trace.beginSection("onCaptureFailed");
/* 10 */            this.I000l1.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 13 */            Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 19 */            I0lO1110lIO i0lO1110lIO = new I0lO1110lIO();
/* 22 */            i0lO1110lIO.I00iOIl = captureFailure;
/* 24 */            captureFailure.getFrameNumber();
/* 31 */            i0lO1110lIO.I00iiI = captureFailure.getReason();
/* 37 */            i0lO1110lIO.I00iiO = captureFailure.wasImageCaptured();
/* 39 */            VarHandle.storeStoreFence();
/* 46 */            I00000oOI(oi0IilI000II, captureFailure.getFrameNumber(), i0lO1110lIO);
/* 49 */            Trace.endSection();
                }

                @Override
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
/* 3 */             Trace.beginSection("onCaptureProgressed");
/* 6 */             long frameNumber = captureResult.getFrameNumber();
/* 14 */            I0oIl0101 i0oIl0101 = new I0oIl0101(captureResult, this.I00000oIO);
/* 17 */            Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 23 */            Trace.beginSection("InvokeInternalListeners");
/* 26 */            List list = this.I0000oI00;
/* 31 */            int size = list.size();
/* 37 */            for (int i = 0; i < size; i++) {
/* 45 */                ((Oi01Ooii1Ol) list.get(i)).I00Io1lO(oi0IilI000II, frameNumber, i0oIl0101);
                    }
/* 51 */            Trace.endSection();
/* 56 */            Trace.beginSection("InvokeRequestListeners");
/* 67 */            int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 71 */            for (int i2 = 0; i2 < size2; i2++) {
/* 85 */                ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i2)).I00Io1lO(oi0IilI000II, frameNumber, i0oIl0101);
                    }
/* 91 */            Trace.endSection();
/* 94 */            Trace.endSection();
                }

                @Override
                public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
/* 1 */             I0000O(i);
                }

                @Override
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
/* 1 */             I0000oI00(i, j);
                }

                @Override
                public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
/* 5 */             I0001Ioi1lo(captureRequest, j2, j);
                }

                @Override
                public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
/* 3 */             Trace.beginSection("onReadoutStarted");
/* 6 */             Oi0Iil oi0IilI000II = I000II(captureRequest);
/* 12 */            Trace.beginSection("InvokeInternalListeners");
/* 15 */            List list = this.I0000oI00;
/* 20 */            int size = list.size();
/* 26 */            for (int i = 0; i < size; i++) {
/* 36 */                ((Oi01Ooii1Ol) list.get(i)).I000II(oi0IilI000II, j2, j);
                    }
/* 44 */            Trace.endSection();
/* 49 */            Trace.beginSection("InvokeRequestListeners");
/* 60 */            int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 64 */            for (int i2 = 0; i2 < size2; i2++) {
/* 79 */                ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i2)).I000II(oi0IilI000II, j2, j);
                    }
/* 85 */            Trace.endSection();
/* 88 */            Trace.endSection();
                }

                public final String toString() {
/* 13 */            return "Camera2CaptureSequence-" + this.I000iOII;
                }
            }
