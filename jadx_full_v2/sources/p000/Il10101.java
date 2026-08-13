            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.Range;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            
            public final class Il10101 implements Ool1II0ii {
                public Il10IO1II1Io I00000oIO;
                public Il10IiO I00000oOI;
                public Ool1lo I0000Il00O;

                public final IOi10loi I00000oIO(boolean z) {
/* 6 */             Il10IO1II1Io il10IO1II1Io = this.I00000oIO;
/* 8 */             Range range = il10IO1II1Io.I0000Il00O;
/* 12 */            if (!il10IO1II1Io.I0000O) {
/* 18 */                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
/* 23 */                IOi10loi iOi10loi = new IOi10loi();
/* 26 */                iOi10loi.I00iIO(illegalArgumentException);
/* 29 */                return iOi10loi;
                    }
/* 34 */            if (!range.contains((Range) 0)) {
/* 73 */                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
/* 78 */                IOi10loi iOi10loi2 = new IOi10loi();
/* 81 */                iOi10loi2.I00iIO(illegalArgumentException2);
/* 84 */                return iOi10loi2;
                    }
/* 85 */            Ool1lo ool1lo = this.I0000Il00O;
/* 88 */            if (ool1lo == null) {
/* 187 */               I1o1lOlooI1 i1o1lOlooI1 = new I1o1lOlooI1("Camera is not active.", 1);
/* 190 */               IOi10loi iOi10loi3 = il10IO1II1Io.I0001Ioi1lo;
/* 192 */               if (iOi10loi3 != null) {
/* 194 */                   iOi10loi3.I00iIO(i1o1lOlooI1);
                        }
/* 199 */               IOi10loi iOi10loi4 = new IOi10loi();
/* 202 */               iOi10loi4.I00iIO(i1o1lOlooI1);
/* 437 */               return iOi10loi4;
                    }
/* 90 */            Il10IiO il10IiO = this.I00000oOI;
/* 103 */           this.I00000oOI = new Il10IiO(il10IiO.I00000oIO, 0, il10IiO.I0000Il00O, il10IiO.I0000O);
/* 105 */           IOi0Olo0Ol iOi0Olo0Ol = il10IO1II1Io.I00000oOI;
/* 109 */           IOi10loi iOi10loi5 = new IOi10loi();
/* 112 */           IOi10loi iOi10loi6 = il10IO1II1Io.I0001Ioi1lo;
/* 114 */           if (iOi10loi6 != null) {
/* 116 */               if (z) {
/* 120 */                   IIl001iO0Io.I001l0I00("Cancelled by another setExposureCompensationIndex()", iOi10loi6);
                        } else {
/* 124 */                   iiolOOio1.I0000Il00O(iOi10loi5, iOi10loi6);
                        }
                    }
/* 127 */           il10IO1II1Io.I0001Ioi1lo = iOi10loi5;
/* 129 */           Il101oliii il101oliii = il10IO1II1Io.I000II;
/* 131 */           if (il101oliii != null) {
/* 133 */               iOi0Olo0Ol.I00000oOI(il101oliii);
/* 137 */               il10IO1II1Io.I000II = null;
                    }
/* 145 */           Ool1lo.I0000O(ool1lo, Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0));
/* 150 */           Il101oliii il101oliii2 = new Il101oliii();
/* 153 */           il101oliii2.I00iOIl = iOi10loi5;
/* 155 */           VarHandle.storeStoreFence();
/* 162 */           iOi0Olo0Ol.I00000oIO(il101oliii2, il10IO1II1Io.I00000oIO.I0000O);
/* 167 */           IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(1);
/* 170 */           iiioilIl1Il.I00iiI = il10IO1II1Io;
/* 172 */           iiioilIl1Il.I00iiO = il101oliii2;
/* 174 */           VarHandle.storeStoreFence();
/* 177 */           iOi10loi5.I00iiI(iiioilIl1Il);
/* 180 */           il10IO1II1Io.I000II = il101oliii2;
/* 182 */           return iOi10loi5;
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             this.I0000Il00O = ool1lo;
/* 4 */             I00000oIO(false);
                }

                @Override
                public final void reset() {
/* 1 */             Il10IiO il10IiO = this.I00000oOI;
/* 15 */            this.I00000oOI = new Il10IiO(il10IiO.I00000oIO, 0, il10IiO.I0000Il00O, il10IiO.I0000O);
/* 18 */            I00000oIO(true);
                }
            }
