            package p000;

            import android.hardware.camera2.CameraDevice;
            import android.util.Log;
            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            
            public final class IIl0O0iioOO {
                public Oo10IliO00O I00000oIO;
                public IIl10I1 I00000oOI;

                public final void I00000oIO(IIlOl1oOlo1o iIlOl1oOlo1o, CameraDevice cameraDevice, I0lIllO i0lIllO, I1iIilO0io01 i1iIilO0io01) {
/* 18 */            CameraDevice cameraDevice2 = iIlOl1oOlo1o != null ? (CameraDevice) iIlOl1oOlo1o.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CameraDevice.class)) : null;
/* 19 */            if (cameraDevice2 == null) {
/* 116 */               if (cameraDevice != null) {
/* 118 */                   I00000oOI(cameraDevice, i0lIllO);
/* 204 */                   return;
                        }
/* 204 */               return;
                    }
/* 21 */            String id = cameraDevice2.getId();
/* 25 */            IIllI0o.I00000oOI(id);
/* 28 */            if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
/* 45 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
/* 53 */                sbI001IIilI0O.append(cameraDevice.getId());
/* 58 */                sbI001IIilI0O.append('!');
/* 74 */                throw new IllegalStateException(sbI001IIilI0O.toString().toString());
                    }
/* 77 */            i1iIilO0io01.I0000oI00.remove(iIlOl1oOlo1o);
/* 80 */            Objects.toString(cameraDevice2);
/* 83 */            iIlOl1oOlo1o.I000l1();
/* 92 */            Object objI00l0I0l0lO1 = iIlOl1oOlo1o.I00l0I0l0lO1(OOoOl0i.I00000oIO.I00000oOI(CameraDevice.class));
/* 96 */            if (objI00l0I0l0lO1 == null) {
/* 112 */               I000II.I001IO000("Required value was null.");
/* 115 */               return;
                    }
/* 100 */           iIlOl1oOlo1o.I00IioO0OiOi();
/* 103 */           I00000oOI((CameraDevice) objI00l0I0l0lO1, i0lIllO);
/* 106 */           iIlOl1oOlo1o.I00ioIO();
                }

                public final void I00000oOI(CameraDevice cameraDevice, I0lIllO i0lIllO) {
/* 1 */             String id = cameraDevice.getId();
/* 7 */             OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 29 */            if (((OoiIlOl1iI) this.I00000oIO.I00000oOI(7000L, new I10OloIi(cameraDevice, oOo0l0ii10l, null, 1))) == null) {
/* 50 */                Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
                    }
/* 53 */            String id2 = cameraDevice.getId();
/* 57 */            IIllI0o.I00000oOI(id2);
/* 60 */            IIl10I1 iIl10I1 = this.I00000oOI;
/* 62 */            IIlo0OOlI iIlo0OOlI = IIlo0i0ll.I000OiO;
/* 66 */            IIlo0i0ll iIlo0i0llI00000oIO = iIl10I1.I00000oIO.I00000oIO(id2);
/* 70 */            iIlo0OOlI.getClass();
/* 77 */            if (IIlo0OOlI.I00000oOI(iIlo0i0llI00000oIO) && oOo0l0ii10l.I00iOIl) {
/* 83 */                IIllI0o.I0000Il00O(id2);
/* 96 */                if (i0lIllO.I00100o1O0lo.await(2000L, TimeUnit.MILLISECONDS)) {
/* 98 */                    IIllI0o.I0000Il00O(id2);
/* 101 */                   return;
                        }
/* 125 */               Log.w("CXCP", "Failed to close " + ((Object) IIllI0o.I0000Il00O(id2)) + " after 2000ms!");
                    }
                }
            }
