            package p000;

            import android.hardware.camera2.CameraExtensionSession;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
/* 35 */    public final class I0lIl0l1011o extends CameraExtensionSession.ExtensionCaptureCallback {
                public final IIl0001i1o01 I00000oIO;
                public final ConcurrentLinkedQueue I00000oOI = new ConcurrentLinkedQueue();
                public final I0lIl0ol1IO I0000Il00O;

                public I0lIl0l1011o(I0lIl0ol1IO i0lIl0ol1IO, IIl0001i1o01 iIl0001i1o01) {
/* 1 */             this.I0000Il00O = i0lIl0ol1IO;
/* 6 */             this.I00000oIO = iIl0001i1o01;
                }

                @Override
                public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
/* 1 */             ConcurrentLinkedQueue concurrentLinkedQueue = this.I00000oOI;
/* 7 */             if (concurrentLinkedQueue.isEmpty()) {
/* 9 */                 I0lIl0ol1IO i0lIl0ol1IO = this.I0000Il00O;
/* 11 */                I1OooI1 i1OooI1 = i0lIl0ol1IO.I00ilI0I1;
/* 13 */                i1OooI1.getClass();
/* 18 */                long jIncrementAndGet = I1OooI1.I00000oOI.incrementAndGet(i1OooI1);
/* 28 */                i0lIl0ol1IO.I00ilO0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
/* 35 */                concurrentLinkedQueue.add(Long.valueOf(jIncrementAndGet));
                    }
/* 44 */            long jLongValue = ((Number) concurrentLinkedQueue.remove()).longValue();
/* 50 */            Trace.beginSection("onCaptureFailed");
/* 53 */            IIl0001i1o01 iIl0001i1o01 = this.I00000oIO;
/* 59 */            iIl0001i1o01.I000l1.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 62 */            Oi0Iil oi0IilI000II = iIl0001i1o01.I000II(captureRequest);
/* 68 */            Il1lo1i0 il1lo1i0 = new Il1lo1i0();
/* 71 */            il1lo1i0.I00iOIl = oi0IilI000II;
/* 73 */            il1lo1i0.I00iiI = jLongValue;
/* 75 */            VarHandle.storeStoreFence();
/* 78 */            iIl0001i1o01.I00000oOI(oi0IilI000II, jLongValue, il1lo1i0);
/* 81 */            Trace.endSection();
                }

                @Override
                public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
/* 3 */             Trace.beginSection("onCaptureProcessProgressed");
/* 6 */             IIl0001i1o01 iIl0001i1o01 = this.I00000oIO;
/* 8 */             Oi0Iil oi0IilI000II = iIl0001i1o01.I000II(captureRequest);
/* 14 */            Trace.beginSection("InvokeInternalListeners");
/* 17 */            List list = iIl0001i1o01.I0000oI00;
/* 22 */            int size = list.size();
/* 28 */            for (int i2 = 0; i2 < size; i2++) {
/* 36 */                ((Oi01Ooii1Ol) list.get(i2)).I001l0I00(oi0IilI000II, i);
                    }
/* 42 */            Trace.endSection();
/* 47 */            Trace.beginSection("InvokeRequestListeners");
/* 58 */            int size2 = oi0IilI000II.I00lli11().I0000O.size();
/* 62 */            for (int i3 = 0; i3 < size2; i3++) {
/* 76 */                ((Oi01Ooii1Ol) oi0IilI000II.I00lli11().I0000O.get(i3)).I001l0I00(oi0IilI000II, i);
                    }
/* 82 */            Trace.endSection();
/* 85 */            Trace.endSection();
                }

                @Override
                public final void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
/* 1 */             ConcurrentLinkedQueue concurrentLinkedQueue = this.I00000oOI;
/* 7 */             if (concurrentLinkedQueue.isEmpty()) {
/* 9 */                 I0lIl0ol1IO i0lIl0ol1IO = this.I0000Il00O;
/* 11 */                I1OooI1 i1OooI1 = i0lIl0ol1IO.I00ilI0I1;
/* 13 */                i1OooI1.getClass();
/* 18 */                long jIncrementAndGet = I1OooI1.I00000oOI.incrementAndGet(i1OooI1);
/* 28 */                i0lIl0ol1IO.I00ilO0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
/* 35 */                concurrentLinkedQueue.add(Long.valueOf(jIncrementAndGet));
                    }
/* 50 */            this.I00000oIO.I0000Il00O(captureRequest, totalCaptureResult, ((Number) concurrentLinkedQueue.remove()).longValue());
                }

                @Override
                public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
/* 3 */             this.I00000oIO.I0000O(i);
                }

                @Override
                public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
/* 17 */            this.I00000oIO.I0000oI00(i, ((Long) this.I0000Il00O.I00ilO0.get(cameraExtensionSession)).longValue());
                }

                @Override
                public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
/* 1 */             I0lIl0ol1IO i0lIl0ol1IO = this.I0000Il00O;
/* 3 */             I1OooI1 i1OooI1 = i0lIl0ol1IO.I00ilI0I1;
/* 5 */             i1OooI1.getClass();
/* 10 */            long jIncrementAndGet = I1OooI1.I00000oOI.incrementAndGet(i1OooI1);
/* 20 */            i0lIl0ol1IO.I00ilO0.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
/* 29 */            this.I00000oOI.add(Long.valueOf(jIncrementAndGet));
/* 36 */            this.I00000oIO.I0001Ioi1lo(captureRequest, jIncrementAndGet, j);
                }

                @Override
/* 36 */        public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
                }
            }
