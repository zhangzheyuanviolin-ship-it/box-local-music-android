            package p000;

            import android.graphics.Canvas;
            import android.graphics.Rect;
            import android.os.CancellationSignal;
            import android.view.ScrollCaptureCallback;
            import android.view.ScrollCaptureSession;
            import java.lang.invoke.VarHandle;
            import java.util.function.Consumer;
            
            public final class IOl0iiI implements ScrollCaptureCallback {
                public Oil000 I00000oIO;
                public IooO1IOlo I00000oOI;
                public IIOOoll I0000Il00O;
                public I0lio1O01i01 I0000O;
                public IIOlO1ii I0000oI00;
                public IoI1IiioI I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(ScrollCaptureSession scrollCaptureSession, IooO1IOlo iooO1IOlo, IOoilo iOoilo) {
                    IOl0ii0o10 iOl0ii0o10;
                    int i;
                    int i2;
                    ScrollCaptureSession scrollCaptureSession2;
                    IooO1IOlo iooO1IOlo2;
                    int i3;
                    int i4;
                    int iI0000Il00O;
                    int iI0000Il00O2;
/* 1 */             IoI1IiioI ioI1IiioI = this.I0001Ioi1lo;
/* 5 */             if (iOoilo instanceof IOl0ii0o10) {
/* 8 */                 iOl0ii0o10 = (IOl0ii0o10) iOoilo;
/* 10 */                int i5 = iOl0ii0o10.I00io1l;
/* 16 */                if ((i5 & Integer.MIN_VALUE) != 0) {
/* 19 */                    iOl0ii0o10.I00io1l = i5 - Integer.MIN_VALUE;
                        } else {
/* 24 */                    iOl0ii0o10 = new IOl0ii0o10(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = iOl0ii0o10.I00ilI0I1;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i6 = iOl0ii0o10.I00io1l;
/* 36 */            if (i6 == 0) {
/* 77 */                lIoii1l01l0i.I00000oOI(obj);
/* 80 */                i = iooO1IOlo.I00000oOI;
/* 82 */                i2 = iooO1IOlo.I0000O;
/* 84 */                iOl0ii0o10.I00iOIl = scrollCaptureSession;
/* 86 */                iOl0ii0o10.I00iiI = iooO1IOlo;
/* 88 */                iOl0ii0o10.I00iiO = i;
/* 90 */                iOl0ii0o10.I00iio = i2;
/* 92 */                iOl0ii0o10.I00io1l = 1;
/* 94 */                if (i > i2) {
/* 277 */                   ioI1IiioI.getClass();
/* 408 */                   throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
                        }
/* 96 */                int i7 = i2 - i;
/* 98 */                int i8 = ioI1IiioI.I00000oIO;
/* 100 */               if (i7 > i8) {
/* 273 */                   I000II.I0010I0i(IIl001iO0Io.I000l1(i7, i8, "Expected range (", ") to be ≤ viewportSize="));
/* 33 */                    return null;
                        }
/* 110 */               Object objI00000oOI = ioI1IiioI.I00000oOI((((i7 / 2) + i) - (i8 / 2)) - ioI1IiioI.I00000oOI, iOl0ii0o10);
/* 114 */               Object obj2 = OoiIlOl1iI.I00000oIO;
/* 116 */               if (objI00000oOI != ii0111o) {
/* 119 */                   objI00000oOI = obj2;
                        }
/* 120 */               if (objI00000oOI == ii0111o) {
/* 122 */                   obj2 = objI00000oOI;
                        }
/* 123 */               if (obj2 != ii0111o) {
                        }
/* 156 */               return ii0111o;
                    }
/* 38 */            if (i6 != 1) {
/* 40 */                if (i6 != 2) {
/* 57 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 42 */                i4 = iOl0ii0o10.I00iio;
/* 44 */                i3 = iOl0ii0o10.I00iiO;
/* 46 */                iooO1IOlo2 = iOl0ii0o10.I00iiI;
/* 48 */                scrollCaptureSession2 = iOl0ii0o10.I00iOIl;
/* 50 */                lIoii1l01l0i.I00000oOI(obj);
/* 161 */               float f = ioI1IiioI.I00000oOI;
/* 163 */               int i9 = ioI1IiioI.I00000oIO;
/* 171 */               iI0000Il00O = lIiioliIlo.I0000Il00O(i3 - O1OooO0IlOo.I000II(f), 0, i9);
/* 182 */               iI0000Il00O2 = lIiioliIlo.I0000Il00O(i4 - O1OooO0IlOo.I000II(ioI1IiioI.I00000oOI), 0, i9);
/* 186 */               int i10 = iooO1IOlo2.I00000oIO;
/* 188 */               int i11 = iooO1IOlo2.I0000Il00O;
/* 190 */               if (iI0000Il00O != iI0000Il00O2) {
/* 192 */                   return IooO1IOlo.I0000oI00;
                        }
/* 199 */               Canvas canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
/* 203 */                   canvasLockHardwareCanvas.save();
/* 210 */                   canvasLockHardwareCanvas.translate(-i10, -iI0000Il00O);
/* 213 */                   IooO1IOlo iooO1IOlo3 = this.I00000oOI;
/* 223 */                   canvasLockHardwareCanvas.translate(-iooO1IOlo3.I00000oIO, -iooO1IOlo3.I00000oOI);
/* 232 */                   this.I0000O.getRootView().draw(canvasLockHardwareCanvas);
/* 239 */                   scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
/* 244 */                   int iI000II = O1OooO0IlOo.I000II(ioI1IiioI.I00000oOI);
/* 252 */                   return new IooO1IOlo(i10, iI0000Il00O + iI000II, i11, iI0000Il00O2 + iI000II);
                        } catch (Throwable th) {
/* 261 */                   scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
/* 264 */                   throw th;
                        }
                    }
/* 61 */            int i12 = iOl0ii0o10.I00iio;
/* 63 */            int i13 = iOl0ii0o10.I00iiO;
/* 65 */            IooO1IOlo iooO1IOlo4 = iOl0ii0o10.I00iiI;
/* 67 */            ScrollCaptureSession scrollCaptureSession3 = iOl0ii0o10.I00iOIl;
/* 69 */            lIoii1l01l0i.I00000oOI(obj);
/* 72 */            i = i13;
/* 73 */            iooO1IOlo = iooO1IOlo4;
/* 74 */            i2 = i12;
/* 75 */            scrollCaptureSession = scrollCaptureSession3;
/* 129 */           IO1I11OO io1i11oo = new IO1I11OO(7);
/* 132 */           iOl0ii0o10.I00iOIl = scrollCaptureSession;
/* 134 */           iOl0ii0o10.I00iiI = iooO1IOlo;
/* 136 */           iOl0ii0o10.I00iiO = i;
/* 138 */           iOl0ii0o10.I00iio = i2;
/* 140 */           iOl0ii0o10.I00io1l = 2;
/* 154 */           if (l1i0lii.I00000oIO(iOl0ii0o10.getContext()).I00000oIO(iOl0ii0o10, io1i11oo) != ii0111o) {
/* 157 */               scrollCaptureSession2 = scrollCaptureSession;
/* 158 */               iooO1IOlo2 = iooO1IOlo;
/* 159 */               i3 = i;
/* 160 */               i4 = i2;
/* 161 */               float f2 = ioI1IiioI.I00000oOI;
/* 163 */               int i92 = ioI1IiioI.I00000oIO;
/* 171 */               iI0000Il00O = lIiioliIlo.I0000Il00O(i3 - O1OooO0IlOo.I000II(f2), 0, i92);
/* 182 */               iI0000Il00O2 = lIiioliIlo.I0000Il00O(i4 - O1OooO0IlOo.I000II(ioI1IiioI.I00000oOI), 0, i92);
/* 186 */               int i102 = iooO1IOlo2.I00000oIO;
/* 188 */               int i112 = iooO1IOlo2.I0000Il00O;
/* 190 */               if (iI0000Il00O != iI0000Il00O2) {
                        }
                    }
/* 156 */           return ii0111o;
                }

                @Override
                public final void onScrollCaptureEnd(Runnable runnable) {
/* 14 */            iOi1II01i0.I0000O(this.I0000oI00, OIIloillo0oO.I00iiI, null, new I00oI0i(this, runnable, null, 24), 2);
                }

                @Override
                public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
/* 17 */            OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(this.I0000oI00, null, null, new I0iOI0o1i(this, scrollCaptureSession, rect, consumer, (IOoil1iiIilo) null, 10), 3);
/* 25 */            IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(24);
/* 28 */            iIOIlOoI111.I00iiI = cancellationSignal;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            olIl0iI0000O.I00iiI(iIOIlOoI111);
/* 39 */            IOl0iil0l iOl0iil0l = new IOl0iil0l(0);
/* 42 */            iOl0iil0l.I00000oOI = olIl0iI0000O;
/* 44 */            VarHandle.storeStoreFence();
/* 47 */            cancellationSignal.setOnCancelListener(iOl0iil0l);
                }

                @Override
                public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
/* 7 */             consumer.accept(lIiool1i00.I00000oIO(this.I00000oOI));
                }

                @Override
                public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
/* 4 */             this.I0001Ioi1lo.I00000oOI = 0.0f;
/* 14 */            ((OIooliIO0) this.I0000Il00O.I00iiI).setValue(Boolean.TRUE);
/* 17 */            runnable.run();
                }
            }
