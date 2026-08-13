            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            
            public class IIoIO0l1001 {
                public static final IIoIO0l1001 I00000oIO = new IIoIO0l1001();

                public void I00000oIO(Ioi1iI0IiOl ioi1iI0IiOl, I0oiil10Ili i0oiil10Ili) {
/* 8 */             IIoo00iOol0 iIoo00iOol0 = (IIoo00iOol0) ioi1iI0IiOl.I00000oOI(OolIl0ii1.I00Io1o110i, null);
/* 10 */            OIil0iio0 oIil0iio0 = OIil0iio0.I00iiO;
/* 12 */            I1ioiI i1ioiI = IIoo00iOol0.I0001Ioi1lo;
/* 23 */            int i = new I0oiil10Ili().I0001Ioi1lo().I0000Il00O;
/* 25 */            if (iIoo00iOol0 != null) {
/* 27 */                i = iIoo00iOol0.I0000Il00O;
/* 33 */                i0oiil10Ili.I0000Il00O(iIoo00iOol0.I0000O);
/* 36 */                oIil0iio0 = iIoo00iOol0.I00000oOI;
/* 48 */                ((OI10ooIio) i0oiil10Ili.I00ilO0).I00000oIO.putAll((Map) iIoo00iOol0.I0000oI00.I00000oIO);
/* 59 */                Iterator it = Collections.unmodifiableList(iIoo00iOol0.I00000oIO).iterator();
/* 67 */                while (it.hasNext()) {
/* 79 */                    ((HashSet) i0oiil10Ili.I00iiO).add((IiIO1ol1i1o0) it.next());
                        }
                    }
/* 87 */            i0oiil10Ili.I00iio = OI0oiliol10O.I000iOII(oIil0iio0);
/* 107 */           i0oiil10Ili.I00iiI = ((Number) ioi1iI0IiOl.I00000oOI(IIl0oI.I00ilI0I1, Integer.valueOf(i))).intValue();
/* 115 */           CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) ioi1iI0IiOl.I00000oOI(IIl0oI.I00ioIO, null);
/* 117 */           if (captureCallback != null) {
/* 121 */               IIoIIOi1O iIoIIOi1O = new IIoIIOi1O();
/* 124 */               iIoIIOi1O.I00000oIO = captureCallback;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               i0oiil10Ili.I0000O(iIoIIOi1O);
                    }
/* 134 */           O1OIll00i o1OIll00i = new O1OIll00i();
/* 140 */           IIoIil iIoIil = new IIoIil(1);
/* 143 */           iIoIil.I00iiI = o1OIll00i;
/* 145 */           iIoIil.I00iiO = ioi1iI0IiOl;
/* 147 */           VarHandle.storeStoreFence();
/* 150 */           ioi1iI0IiOl.I00000oIO(iIoIil);
/* 168 */           i0oiil10Ili.I0000oI00(new IIloOI(OIil0iio0.I0001Ioi1lo((OI0oiliol10O) o1OIll00i.I00iiI), 8));
                }
            }
