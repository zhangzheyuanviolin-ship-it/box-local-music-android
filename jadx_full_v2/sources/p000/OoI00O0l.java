            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.os.Build;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class OoI00O0l implements Ool1II0ii {
                public OlO01I1 I00000oIO;
                public Ool1lo I00000oOI;
                public boolean I0000Il00O;
                public OoI000IIo I0000O;
                public OI0lOii0I I0000oI00;
                public boolean I0001Ioi1lo;
                public int I000II;
                public OI0lOii0I I000O01llI0;
                public IOi10loi I000OOo1O;
                public IOi10loi I000OiO;

                public static IOi10loi I00000oIO(OoI00O0l ooI00O0l, boolean z, int i) {
/* 9 */             return ooI00O0l.I0000Il00O(z ? 1 : 0, (i & 2) != 0, false);
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(Ool1lo ool1lo) {
                    boolean z;
/* 1 */             this.I00000oOI = ool1lo;
/* 5 */             if (this.I0000O != null) {
/* 13 */                Integer num = (Integer) this.I0000oI00.I0000O();
/* 15 */                if (num == null) {
/* 26 */                    z = false;
                        } else {
/* 22 */                    z = true;
/* 23 */                    if (num.intValue() != 1) {
                            }
                        }
/* 28 */                I00000oIO(this, z, 4);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final IOi10loi I0000Il00O(int i, boolean z, boolean z2) {
                    int i2;
                    IiIOI1ol0o iiIOI1ol0oI000O01llI0;
/* 1 */             OlO01I1 olO01I1 = this.I00000oIO;
/* 6 */             l11I11lO.I0000O(3, "CXCP");
/* 11 */            IOi10loi iOi10loi = new IOi10loi();
/* 14 */            if (!z2 && !this.I0000Il00O) {
/* 27 */                iOi10loi.I00iIO(new IllegalStateException("No flash unit"));
/* 30 */                return iOi10loi;
                    }
/* 31 */            Ool1lo ool1lo = this.I00000oOI;
/* 33 */            if (ool1lo == null) {
/* 193 */               IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
/* 408 */               return iOi10loi;
                    }
/* 35 */            I0000oI00(i);
/* 38 */            IOi10loi iOi10loi2 = this.I000OOo1O;
/* 41 */            if (z) {
/* 43 */                if (iOi10loi2 != null) {
/* 47 */                    IIl001iO0Io.I001l0I00("There is a new enableTorch being set", iOi10loi2);
                        }
/* 50 */                this.I000OOo1O = null;
                    } else if (iOi10loi2 != null) {
/* 55 */                iiolOOio1.I0000Il00O(iOi10loi, iOi10loi2);
                    }
/* 58 */            this.I000OOo1O = iOi10loi;
/* 61 */            int i3 = 1;
/* 67 */            Integer num = i == 0 ? null : 1;
                    synchronized (olO01I1.I0000O) {
/* 76 */                olO01I1.I000iOII = num;
                    }
/* 79 */            olO01I1.I0001Ioi1lo();
/* 82 */            List list = I0OIi10lO0iO.I00000oOI;
/* 88 */            I0OIi10lO0iO i0OIi10lO0iOI00000oIO = iOIOlooOl.I00000oIO(olO01I1.I0000oI00());
/* 92 */            if (i0OIi10lO0iOI00000oIO != null) {
/* 94 */                i2 = i0OIi10lO0iOI00000oIO.I00000oIO;
                    } else {
/* 102 */               if (l11I11lO.I0000O(5, "CXCP")) {
/* 127 */                   Log.w("CXCP", "TorchControl#setTorchAsync: Failed to convert ae mode of value " + olO01I1.I0000oI00() + " with AeMode.fromIntOrNull, fallback to AeMode.ON");
                        }
/* 130 */               i2 = 1;
                    }
/* 134 */           if (i == 0) {
/* 166 */               iiIOI1ol0oI000O01llI0 = ool1lo.I000O01llI0(i2);
                    } else {
/* 136 */               if (i == 1) {
/* 144 */                   Integer num2 = (Integer) this.I000O01llI0.I0000O();
/* 146 */                   if (num2 != null) {
/* 152 */                       I0001Ioi1lo(num2.intValue());
                            }
                        } else {
/* 158 */                   I0001Ioi1lo(this.I000II);
                        }
/* 161 */               iiIOI1ol0oI000O01llI0 = ool1lo.I00000oOI();
                    }
/* 172 */           Ii00i00 ii00i00 = new Ii00i00(i3);
/* 175 */           ii00i00.I00iiI = iiIOI1ol0oI000O01llI0;
/* 177 */           ii00i00.I00iiO = iOi10loi;
/* 179 */           VarHandle.storeStoreFence();
/* 184 */           ((O011OOl11) iiIOI1ol0oI000O01llI0).I00iiI(ii00i00);
/* 187 */           return iOi10loi;
                }

                public final void I0000oI00(int i) {
/* 3 */             OoI000IIo ooI000IIo = new OoI000IIo();
/* 6 */             ooI000IIo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 11 */            this.I0000O = ooI000IIo;
/* 14 */            int i2 = i != 1 ? 0 : 1;
/* 18 */            OI0lOii0I oI0lOii0I = this.I0000oI00;
/* 24 */            if (lOllIO.I00000oOI()) {
/* 30 */                oI0lOii0I.I000iOII(Integer.valueOf(i2));
                    } else {
/* 38 */                oI0lOii0I.I000OOo1O(Integer.valueOf(i2));
                    }
                }

                public final void I0001Ioi1lo(int i) {
                    IiIOI1ol0o iiIOI1ol0oI0000O;
/* 3 */             IOi10loi iOi10loi = new IOi10loi();
/* 10 */            if (Build.VERSION.SDK_INT < 35 || !this.I0001Ioi1lo) {
/* 90 */                iOi10loi.I00iIO(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
/* 168 */               return;
                    }
/* 16 */            IOi10loi iOi10loi2 = this.I000OiO;
/* 18 */            if (iOi10loi2 != null) {
/* 20 */                if (iOi10loi2 != null) {
/* 24 */                    IIl001iO0Io.I001l0I00("There is a new torch strength being set", iOi10loi2);
                        }
/* 28 */                this.I000OiO = null;
                    }
/* 30 */            this.I000OiO = iOi10loi;
/* 36 */            Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(11);
/* 39 */            ol1OiIli00Ii.I00iiI = this;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            iOi10loi.I00iiI(ol1OiIli00Ii);
/* 49 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 60 */            linkedHashMap.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
/* 63 */            Ool1lo ool1lo = this.I00000oOI;
/* 65 */            if (ool1lo == null || (iiIOI1ol0oI0000O = Ool1lo.I0000O(ool1lo, linkedHashMap)) == null) {
/* 79 */                IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
                    } else {
/* 73 */                iiolOOio1.I0000Il00O(iiIOI1ol0oI0000O, iOi10loi);
                    }
                }

                @Override
                public final void reset() {
/* 1 */             IOi10loi iOi10loi = this.I000OOo1O;
/* 3 */             if (iOi10loi != null) {
/* 7 */                 IIl001iO0Io.I001l0I00("There is a new enableTorch being set", iOi10loi);
                    }
/* 11 */            this.I000OOo1O = null;
/* 13 */            IOi10loi iOi10loi2 = this.I000OiO;
/* 15 */            if (iOi10loi2 != null) {
/* 19 */                IIl001iO0Io.I001l0I00("There is a new torch strength being set", iOi10loi2);
                    }
/* 22 */            this.I000OiO = null;
/* 26 */            if (this.I0000O != null) {
/* 29 */                I0000oI00(0);
/* 33 */                I00000oIO(this, false, 6);
/* 36 */                this.I0000O = null;
                    }
                }
            }
